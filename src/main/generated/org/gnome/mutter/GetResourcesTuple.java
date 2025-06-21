package org.gnome.mutter;

import java.util.List;
import org.freedesktop.dbus.Tuple;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.UInt32;

/**
 * Auto-generated class.
 */
public class GetResourcesTuple extends Tuple {
    @Position(0)
    private UInt32 serial;
    @Position(1)
    private List<GetResourcesCrtcsStruct> crtcs;
    @Position(2)
    private List<GetResourcesOutputsStruct> outputs;
    @Position(3)
    private List<GetResourcesModesStruct> modes;
    @Position(4)
    private int maxScreenWidth;
    @Position(5)
    private int maxScreenHeight;

    public GetResourcesTuple(UInt32 serial, List<GetResourcesCrtcsStruct> crtcs, List<GetResourcesOutputsStruct> outputs, List<GetResourcesModesStruct> modes, int maxScreenWidth, int maxScreenHeight) {
        this.serial = serial;
        this.crtcs = crtcs;
        this.outputs = outputs;
        this.modes = modes;
        this.maxScreenWidth = maxScreenWidth;
        this.maxScreenHeight = maxScreenHeight;
    }

    public void setSerial(UInt32 arg) {
        serial = arg;
    }

    public UInt32 getSerial() {
        return serial;
    }

    public void setCrtcs(List<GetResourcesCrtcsStruct> arg) {
        crtcs = arg;
    }

    public List<GetResourcesCrtcsStruct> getCrtcs() {
        return crtcs;
    }

    public void setOutputs(List<GetResourcesOutputsStruct> arg) {
        outputs = arg;
    }

    public List<GetResourcesOutputsStruct> getOutputs() {
        return outputs;
    }

    public void setModes(List<GetResourcesModesStruct> arg) {
        modes = arg;
    }

    public List<GetResourcesModesStruct> getModes() {
        return modes;
    }

    public void setMaxScreenWidth(int arg) {
        maxScreenWidth = arg;
    }

    public int getMaxScreenWidth() {
        return maxScreenWidth;
    }

    public void setMaxScreenHeight(int arg) {
        maxScreenHeight = arg;
    }

    public int getMaxScreenHeight() {
        return maxScreenHeight;
    }

}
