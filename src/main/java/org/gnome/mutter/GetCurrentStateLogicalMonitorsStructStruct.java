package org.gnome.mutter;

import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.annotations.Position;

/**
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

  public String getMember0() {
    return member0;
  }

  public String getMember1() {
    return member1;
  }

  public String getMember2() {
    return member2;
  }

  public String getMember3() {
    return member3;
  }
}
