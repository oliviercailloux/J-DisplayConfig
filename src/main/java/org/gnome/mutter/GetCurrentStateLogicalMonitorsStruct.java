package org.gnome.mutter;

import java.util.List;
import java.util.Map;
import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;

/**
 * A logical monitor configuration.
 * <p>
 * Auto-generated class.
 */
public class GetCurrentStateLogicalMonitorsStruct extends Struct {
  @Position(0)
  private final int member0;
  @Position(1)
  private final int member1;
  @Position(2)
  private final double member2;
  @Position(3)
  private final UInt32 member3;
  @Position(4)
  private final boolean member4;
  @Position(5)
  private final List<GetCurrentStateLogicalMonitorsStructStruct> member5;
  @Position(6)
  private final Map<String, Variant<?>> member6;

  public GetCurrentStateLogicalMonitorsStruct(int member0, int member1, double member2,
      UInt32 member3, boolean member4, List<GetCurrentStateLogicalMonitorsStructStruct> member5,
      Map<String, Variant<?>> member6) {
    this.member0 = member0;
    this.member1 = member1;
    this.member2 = member2;
    this.member3 = member3;
    this.member4 = member4;
    this.member5 = member5;
    this.member6 = member6;
  }

  /**
   * Retrieves the x position.
   *
   * @return the x position
   */
  public int getMember0() {
    return member0;
  }

  /**
   * Retrieves the y position.
   *
   * @return the y position
   */
  public int getMember1() {
    return member1;
  }

  /**
   * Retrieves the scale.
   *
   * @return the scale
   */
  public double getMember2() {
    return member2;
  }

  /**
   * Retrieves the transform: between 0 and 3 is not flipped; this number mod 4 times 90° is the
   * angle (for example, 6 is 180° and flipped).
   *
   * @return the transform, between 0 and 7
   */
  public UInt32 getMember3() {
    return member3;
  }

  /**
   * Retrieves whether this monitor is the primary one.
   *
   * @return true iff this monitor is the primary one
   */
  public boolean getMember4() {
    return member4;
  }

  /**
   * Retrieves the physical monitors displaying this logical monitor.
   *
   * @return the physical monitors
   */
  public List<GetCurrentStateLogicalMonitorsStructStruct> getMember5() {
    return member5;
  }

  /**
   * Retrieves other properties of this logical monitor.
   * 
   * @return other properties of this logical monitor
   */
  public Map<String, Variant<?>> getMember6() {
    return member6;
  }
}
