package org.gnome.mutter;

import org.freedesktop.dbus.Tuple;
import org.freedesktop.dbus.annotations.Position;

/**
 * Auto-generated class.
 */
public class GetCurrentStateTuple<A, B, C, D> extends Tuple {
  @Position(0)
  private A serial;
  @Position(1)
  private B monitors;
  @Position(2)
  private C logicalMonitors;
  @Position(3)
  private D properties;

  public GetCurrentStateTuple(A serial, B monitors, C logicalMonitors, D properties) {
    this.serial = serial;
    this.monitors = monitors;
    this.logicalMonitors = logicalMonitors;
    this.properties = properties;
  }

  public void setSerial(A arg) {
    serial = arg;
  }

  public A getSerial() {
    return serial;
  }

  public void setMonitors(B arg) {
    monitors = arg;
  }

  /**
   * Retrieves the physical monitors.
   * 
   * @return the physical monitors
   */
  public B getMonitors() {
    return monitors;
  }

  public void setLogicalMonitors(C arg) {
    logicalMonitors = arg;
  }

  public C getLogicalMonitors() {
    return logicalMonitors;
  }

  public void setProperties(D arg) {
    properties = arg;
  }

  public D getProperties() {
    return properties;
  }
}
