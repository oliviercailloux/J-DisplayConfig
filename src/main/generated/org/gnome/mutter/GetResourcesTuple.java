package org.gnome.mutter;

import org.freedesktop.dbus.Tuple;
import org.freedesktop.dbus.annotations.Position;

/**
 * Auto-generated class.
 */
public class GetResourcesTuple<A, B, C, D, E, F> extends Tuple {
    @Position(0)
    private A serial;
    @Position(1)
    private B crtcs;
    @Position(2)
    private C outputs;
    @Position(3)
    private D modes;
    @Position(4)
    private E maxScreenWidth;
    @Position(5)
    private F maxScreenHeight;

    public GetResourcesTuple(A serial, B crtcs, C outputs, D modes, E maxScreenWidth, F maxScreenHeight) {
        this.serial = serial;
        this.crtcs = crtcs;
        this.outputs = outputs;
        this.modes = modes;
        this.maxScreenWidth = maxScreenWidth;
        this.maxScreenHeight = maxScreenHeight;
    }

    public void setSerial(A arg) {
        serial = arg;
    }

    public A getSerial() {
        return serial;
    }

    public void setCrtcs(B arg) {
        crtcs = arg;
    }

    public B getCrtcs() {
        return crtcs;
    }

    public void setOutputs(C arg) {
        outputs = arg;
    }

    public C getOutputs() {
        return outputs;
    }

    public void setModes(D arg) {
        modes = arg;
    }

    public D getModes() {
        return modes;
    }

    public void setMaxScreenWidth(E arg) {
        maxScreenWidth = arg;
    }

    public E getMaxScreenWidth() {
        return maxScreenWidth;
    }

    public void setMaxScreenHeight(F arg) {
        maxScreenHeight = arg;
    }

    public F getMaxScreenHeight() {
        return maxScreenHeight;
    }

}
