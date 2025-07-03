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
public class GetResourcesOutputsStruct extends Struct {
  @Position(0)
  private final UInt32 member0;
  @Position(1)
  private final long member1;
  @Position(2)
  private final int member2;
  @Position(3)
  private final List<UInt32> member3;
  @Position(4)
  private final String member4;
  @Position(5)
  private final List<UInt32> member5;
  @Position(6)
  private final List<UInt32> member6;
  @Position(7)
  private final Map<String, Variant<?>> member7;

  public GetResourcesOutputsStruct(UInt32 member0, long member1, int member2, List<UInt32> member3,
      String member4, List<UInt32> member5, List<UInt32> member6, Map<String, Variant<?>> member7) {
    this.member0 = member0;
    this.member1 = member1;
    this.member2 = member2;
    this.member3 = member3;
    this.member4 = member4;
    this.member5 = member5;
    this.member6 = member6;
    this.member7 = member7;
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

  public List<UInt32> getMember3() {
    return member3;
  }

  public String getMember4() {
    return member4;
  }

  public List<UInt32> getMember5() {
    return member5;
  }

  public List<UInt32> getMember6() {
    return member6;
  }

  public Map<String, Variant<?>> getMember7() {
    return member7;
  }
}
