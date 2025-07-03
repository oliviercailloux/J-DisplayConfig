package org.gnome.mutter;

import java.util.List;
import java.util.Map;
import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;

/**
 * Auto-generated class.
 */
public class GetResourcesCrtcsStruct extends Struct {
  @Position(0)
  private final UInt32 member0;
  @Position(1)
  private final long member1;
  @Position(2)
  private final int member2;
  @Position(3)
  private final int member3;
  @Position(4)
  private final int member4;
  @Position(5)
  private final int member5;
  @Position(6)
  private final int member6;
  @Position(7)
  private final UInt32 member7;
  @Position(8)
  private final List<UInt32> member8;
  @Position(9)
  private final Map<String, Variant<?>> member9;

  public GetResourcesCrtcsStruct(UInt32 member0, long member1, int member2, int member3,
      int member4, int member5, int member6, UInt32 member7, List<UInt32> member8,
      Map<String, Variant<?>> member9) {
    this.member0 = member0;
    this.member1 = member1;
    this.member2 = member2;
    this.member3 = member3;
    this.member4 = member4;
    this.member5 = member5;
    this.member6 = member6;
    this.member7 = member7;
    this.member8 = member8;
    this.member9 = member9;
  }

  public UInt32 getMember0() {
    return member0;
  }

  public long getMember1() {
    return member1;
  }

  public int getMember2() {
    return member2;
  }

  public int getMember3() {
    return member3;
  }

  public int getMember4() {
    return member4;
  }

  public int getMember5() {
    return member5;
  }

  public int getMember6() {
    return member6;
  }

  public UInt32 getMember7() {
    return member7;
  }

  public List<UInt32> getMember8() {
    return member8;
  }

  public Map<String, Variant<?>> getMember9() {
    return member9;
  }
}
