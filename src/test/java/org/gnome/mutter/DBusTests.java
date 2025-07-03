package org.gnome.mutter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;
import org.freedesktop.dbus.connections.impl.DBusConnection;
import org.freedesktop.dbus.connections.impl.DBusConnectionBuilder;
import org.freedesktop.dbus.interfaces.Properties;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBusTests {
  @SuppressWarnings("unused")
  private static final Logger LOGGER = LoggerFactory.getLogger(DBusTests.class);

  @Test
  void testConnect() throws Exception {
    try (DBusConnection connection = DBusConnectionBuilder.forSessionBus().build()) {
      Properties props = connection.getRemoteObject("org.gnome.Mutter.DisplayConfig",
          "/org/gnome/Mutter/DisplayConfig", Properties.class);
      boolean allowed = props.Get("org.gnome.Mutter.DisplayConfig", "ApplyMonitorsConfigAllowed");
      assertTrue(allowed);

      DisplayConfig displayConfig = connection.getRemoteObject("org.gnome.Mutter.DisplayConfig",
          "/org/gnome/Mutter/DisplayConfig", DisplayConfig.class);
      GetCurrentStateTuple<UInt32, List<GetCurrentStateMonitorsStruct>,
          List<GetCurrentStateLogicalMonitorsStruct>,
          Map<String, Variant<?>>> state = displayConfig.GetCurrentState();
      List<GetCurrentStateMonitorsStruct> monitors = state.getMonitors();
      LOGGER.info("Monitors: " + monitors.size());
      GetCurrentStateMonitorsStruct monitor = monitors.get(0);
      GetCurrentStateMonitorsStructStruct monitorStruct = monitor.getMember0();
      LOGGER.info("Monitor 0 struct: " + monitorStruct);
      assertEquals("DP-2", monitorStruct.getMember0());
    }
  }
}
