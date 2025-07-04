package org.gnome.mutter;

import java.util.List;
import java.util.Map;
import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.Variant;

/**
 * A physical monitor.
 * <p>
 * Auto-generated class.
 */
public class GetCurrentStateMonitorsStruct extends Struct {
  @Position(0)
  private final GetCurrentStateMonitorsStructStruct member0;
  @Position(1)
  private final List<GetCurrentStateMonitorsStructStructStruct> member1;
  @Position(2)
  private final Map<String, Variant<?>> member2;

  public GetCurrentStateMonitorsStruct(GetCurrentStateMonitorsStructStruct member0,
      List<GetCurrentStateMonitorsStructStructStruct> member1, Map<String, Variant<?>> member2) {
    this.member0 = member0;
    this.member1 = member1;
    this.member2 = member2;
  }

  /**
   * Retrieves the standard properties of this physical monitor.
   *
   * @return the properties of this physical monitor
   */
  public GetCurrentStateMonitorsStructStruct getMember0() {
    return member0;
  }

  /**
   * Retrieves the available modes.
   *
   * @return the available modes
   */
  public List<GetCurrentStateMonitorsStructStructStruct> getMember1() {
    return member1;
  }

  /**
   * Retrieves optional properties of this physical monitor.
   *
   * @return optional properties of this physical monitor
   */
  public Map<String, Variant<?>> getMember2() {
    return member2;
  }
}
