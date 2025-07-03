package org.gnome.mutter;

import java.util.List;
import java.util.Map;
import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.Variant;

/**
 * Available mode of a physical monitor.<p>
 * Auto-generated class.
 */
public class GetCurrentStateMonitorsStructStructStruct extends Struct {
    @Position(0)
    private final String member0;
    @Position(1)
    private final int member1;
    @Position(2)
    private final int member2;
    @Position(3)
    private final double member3;
    @Position(4)
    private final double member4;
    @Position(5)
    private final List<Double> member5;
    @Position(6)
    private final Map<String, Variant<?>> member6;

    public GetCurrentStateMonitorsStructStructStruct(String member0, int member1, int member2, double member3, double member4, List<Double> member5, Map<String, Variant<?>> member6) {
        this.member0 = member0;
        this.member1 = member1;
        this.member2 = member2;
        this.member3 = member3;
        this.member4 = member4;
        this.member5 = member5;
        this.member6 = member6;
    }

    /**
     * Retrieves the mode id.
     * @return the mode id
     */
    public String getMember0() {
        return member0;
    }

    /**
     * Retrieves the width in physical pixels.
     * @return the width in physical pixels
     */
    public int getMember1() {
        return member1;
    }

    /**
     * Retrieves the height in physical pixels.
     * @return the height in physical pixels
     */
    public int getMember2() {
        return member2;
    }

    /**
     * Retrieves the refresh rate.
     * @return the refresh rate
     */
    public double getMember3() {
        return member3;
    }

    /**
     * Retrieves the scale preferred as per calculations.
     * @return the scale preferred as per calculations
     */
    public double getMember4() {
        return member4;
    }

    /**
     * Retrieves the scales supported by this mode.
     * @return the scales supported by this mode
     */
    public List<Double> getMember5() {
        return member5;
    }

    /**
     * Retrieves optional properties of this mode.
     * @return optional properties of this mode
     */
    public Map<String, Variant<?>> getMember6() {
        return member6;
    }

}
