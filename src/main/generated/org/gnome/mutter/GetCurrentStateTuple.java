package org.gnome.mutter;

import java.util.List;
import java.util.Map;
import org.freedesktop.dbus.Tuple;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;

/**
 * Auto-generated class.
 */
public class GetCurrentStateTuple extends Tuple {
    @Position(0)
    private UInt32 serial;
    @Position(1)
    private List<GetCurrentStateMonitorsStruct> monitors;
    @Position(2)
    private List<GetCurrentStateLogicalMonitorsStruct> logicalMonitors;
    @Position(3)
    private Map<String, Variant<?>> properties;

    public GetCurrentStateTuple(UInt32 serial, List<GetCurrentStateMonitorsStruct> monitors, List<GetCurrentStateLogicalMonitorsStruct> logicalMonitors, Map<String, Variant<?>> properties) {
        this.serial = serial;
        this.monitors = monitors;
        this.logicalMonitors = logicalMonitors;
        this.properties = properties;
    }

    public void setSerial(UInt32 arg) {
        serial = arg;
    }

    public UInt32 getSerial() {
        return serial;
    }

    public void setMonitors(List<GetCurrentStateMonitorsStruct> arg) {
        monitors = arg;
    }

    public List<GetCurrentStateMonitorsStruct> getMonitors() {
        return monitors;
    }

    public void setLogicalMonitors(List<GetCurrentStateLogicalMonitorsStruct> arg) {
        logicalMonitors = arg;
    }

    public List<GetCurrentStateLogicalMonitorsStruct> getLogicalMonitors() {
        return logicalMonitors;
    }

    public void setProperties(Map<String, Variant<?>> arg) {
        properties = arg;
    }

    public Map<String, Variant<?>> getProperties() {
        return properties;
    }

}
