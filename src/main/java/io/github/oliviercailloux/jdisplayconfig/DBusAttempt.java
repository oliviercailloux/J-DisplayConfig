package io.github.oliviercailloux.jdisplayconfig;

import java.util.List;
import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.connections.impl.DBusConnection;
import org.freedesktop.dbus.connections.impl.DBusConnectionBuilder;
import org.freedesktop.dbus.interfaces.Properties;
import org.gnome.mutter.DisplayConfig;
import org.gnome.mutter.GetCurrentStateTuple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBusAttempt {
  @SuppressWarnings("unused")
  private static final Logger LOGGER = LoggerFactory.getLogger(DBusAttempt.class);

  public static void main(String[] args) throws Exception {
    try (DBusConnection connection = DBusConnectionBuilder.forSessionBus().build()) {
      Properties props = connection.getRemoteObject("org.gnome.Mutter.DisplayConfig",
          "/org/gnome/Mutter/DisplayConfig", Properties.class);
      boolean allowed = props.Get("org.gnome.Mutter.DisplayConfig", "ApplyMonitorsConfigAllowed");
      LOGGER.info("ApplyMonitorsConfigAllowed: " + allowed);

      DisplayConfig displayConfig = connection.getRemoteObject("org.gnome.Mutter.DisplayConfig",
          "/org/gnome/Mutter/DisplayConfig", DisplayConfig.class);
      GetCurrentStateTuple state = displayConfig.GetCurrentState();
      List<?> monitors = state.getMonitors();
      LOGGER.info("Monitors: " + monitors.size());
      Struct monitorArray = (Struct) monitors.get(0);
      LOGGER.info("Monitor 0: " + monitorArray);
      
    }
  }
}
