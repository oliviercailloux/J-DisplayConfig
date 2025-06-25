package org.gnome.mutter;

import java.util.List;
import java.util.Map;
import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.Variant;

/**
 * Auto-generated class.
 */
public class GetCurrentStateMonitorsStruct extends Struct {
    @Position(0)
    private final GetCurrentStateMonitorsStructStruct member0;
    @Position(1)
    private final List<GetCurrentStateMonitorsStructStructStruct> member1;
    @Position(2)
    private final Map<String, Variant<?>> member2;

    public GetCurrentStateMonitorsStruct(GetCurrentStateMonitorsStructStruct member0, List<GetCurrentStateMonitorsStructStructStruct> member1, Map<String, Variant<?>> member2) {
        this.member0 = member0;
        this.member1 = member1;
        this.member2 = member2;
    }

    public GetCurrentStateMonitorsStructStruct getMember0() {
        return member0;
    }

    public List<GetCurrentStateMonitorsStructStructStruct> getMember1() {
        return member1;
    }

    public Map<String, Variant<?>> getMember2() {
        return member2;
    }

}
