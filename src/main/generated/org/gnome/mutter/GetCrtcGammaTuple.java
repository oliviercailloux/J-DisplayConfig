package org.gnome.mutter;

import java.util.List;
import org.freedesktop.dbus.Tuple;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.UInt16;

/**
 * Auto-generated class.
 */
public class GetCrtcGammaTuple extends Tuple {
    @Position(0)
    private List<UInt16> red;
    @Position(1)
    private List<UInt16> green;
    @Position(2)
    private List<UInt16> blue;

    public GetCrtcGammaTuple(List<UInt16> red, List<UInt16> green, List<UInt16> blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void setRed(List<UInt16> arg) {
        red = arg;
    }

    public List<UInt16> getRed() {
        return red;
    }

    public void setGreen(List<UInt16> arg) {
        green = arg;
    }

    public List<UInt16> getGreen() {
        return green;
    }

    public void setBlue(List<UInt16> arg) {
        blue = arg;
    }

    public List<UInt16> getBlue() {
        return blue;
    }

}
