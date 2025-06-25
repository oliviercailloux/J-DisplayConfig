package org.gnome.mutter;

import java.util.List;
import java.util.Map;
import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.annotations.DBusProperty.Access;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.types.UInt16;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;

/**
 * Auto-generated class.
 */
@DBusInterfaceName("org.gnome.Mutter.DisplayConfig")
@DBusProperty(name = "PowerSaveMode", type = Integer.class, access = Access.READ_WRITE)
@DBusProperty(name = "PanelOrientationManaged", type = Boolean.class, access = Access.READ)
@DBusProperty(name = "ApplyMonitorsConfigAllowed", type = Boolean.class, access = Access.READ)
@DBusProperty(name = "NightLightSupported", type = Boolean.class, access = Access.READ)
public interface DisplayConfig extends DBusInterface {

    GetResourcesTuple<UInt32, List<GetResourcesCrtcsStruct>, List<GetResourcesOutputsStruct>, List<GetResourcesModesStruct>, Integer, Integer> GetResources();

    void ApplyConfiguration(UInt32 serial, boolean persistent, List<ApplyConfigurationCrtcsStruct> crtcs, List<ApplyConfigurationOutputsStruct> outputs);

    int ChangeBacklight(UInt32 serial, UInt32 output, int value);

    GetCrtcGammaTuple<List<UInt16>, List<UInt16>, List<UInt16>> GetCrtcGamma(UInt32 serial, UInt32 crtc);

    void SetCrtcGamma(UInt32 serial, UInt32 crtc, List<UInt16> red, List<UInt16> green, List<UInt16> blue);

    GetCurrentStateTuple<UInt32, List<GetCurrentStateMonitorsStruct>, List<GetCurrentStateLogicalMonitorsStruct>, Map<String, Variant<?>>> GetCurrentState();

    void ApplyMonitorsConfig(UInt32 serial, UInt32 method, List<ApplyMonitorsConfigLogicalMonitorsStruct> logicalMonitors, Map<String, Variant<?>> properties);

    void SetOutputCTM(UInt32 serial, UInt32 output, SetOutputCTMCtmStruct ctm);

    public static class MonitorsChanged extends DBusSignal {

        public MonitorsChanged(String path) throws DBusException {
                super(path);
        }

    }

}
