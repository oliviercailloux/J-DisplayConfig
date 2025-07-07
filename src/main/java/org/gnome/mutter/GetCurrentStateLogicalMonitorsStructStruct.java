package org.gnome.mutter;

import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.annotations.Position;

/**
 * Standard properties of a physical monitor that participates in a logical monitor.
 * <p>
 * Auto-generated class.
 */
public class GetCurrentStateLogicalMonitorsStructStruct extends Struct {
  @Position(0)
  private final String member0;
  @Position(1)
  private final String member1;
  @Position(2)
  private final String member2;
  @Position(3)
  private final String member3;

  public GetCurrentStateLogicalMonitorsStructStruct(String member0, String member1, String member2,
      String member3) {
    this.member0 = member0;
    this.member1 = member1;
    this.member2 = member2;
    this.member3 = member3;
  }

  /**
   * Retrieves the connector name.
   *
   * @return the connector name
   */
  public String getMember0() {
    return member0;
  }

  /**
   * Retrieves the vendor name.
   *
   * @return the vendor name
   */
  public String getMember1() {
    return member1;
  }

  /**
   * Retrieves the product name.
   *
   * @return the product name
   */
  public String getMember2() {
    return member2;
  }

  /**
   * Retrieves the product serial.
   *
   * @return the product serial
   */
  public String getMember3() {
    return member3;
  }
}
