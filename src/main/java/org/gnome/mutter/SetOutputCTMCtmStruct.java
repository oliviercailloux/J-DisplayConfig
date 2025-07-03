package org.gnome.mutter;

import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.UInt64;

/**
 * Auto-generated class.
 */
public class SetOutputCTMCtmStruct extends Struct {
    @Position(0)
    private final UInt64 member0;
    @Position(1)
    private final UInt64 member1;
    @Position(2)
    private final UInt64 member2;
    @Position(3)
    private final UInt64 member3;
    @Position(4)
    private final UInt64 member4;
    @Position(5)
    private final UInt64 member5;
    @Position(6)
    private final UInt64 member6;
    @Position(7)
    private final UInt64 member7;
    @Position(8)
    private final UInt64 member8;

    public SetOutputCTMCtmStruct(UInt64 member0, UInt64 member1, UInt64 member2, UInt64 member3, UInt64 member4, UInt64 member5, UInt64 member6, UInt64 member7, UInt64 member8) {
        this.member0 = member0;
        this.member1 = member1;
        this.member2 = member2;
        this.member3 = member3;
        this.member4 = member4;
        this.member5 = member5;
        this.member6 = member6;
        this.member7 = member7;
        this.member8 = member8;
    }

    public UInt64 getMember0() {
        return member0;
    }

    public UInt64 getMember1() {
        return member1;
    }

    public UInt64 getMember2() {
        return member2;
    }

    public UInt64 getMember3() {
        return member3;
    }

    public UInt64 getMember4() {
        return member4;
    }

    public UInt64 getMember5() {
        return member5;
    }

    public UInt64 getMember6() {
        return member6;
    }

    public UInt64 getMember7() {
        return member7;
    }

    public UInt64 getMember8() {
        return member8;
    }

}
