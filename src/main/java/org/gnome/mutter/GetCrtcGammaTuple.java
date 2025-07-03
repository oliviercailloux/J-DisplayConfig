package org.gnome.mutter;

import org.freedesktop.dbus.Tuple;
import org.freedesktop.dbus.annotations.Position;

/**
 * Auto-generated class.
 */
public class GetCrtcGammaTuple<A, B, C> extends Tuple {
  @Position(0)
  private A red;
  @Position(1)
  private B green;
  @Position(2)
  private C blue;

  public GetCrtcGammaTuple(A red, B green, C blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public void setRed(A arg) {
    red = arg;
  }

  public A getRed() {
    return red;
  }

  public void setGreen(B arg) {
    green = arg;
  }

  public B getGreen() {
    return green;
  }

  public void setBlue(C arg) {
    blue = arg;
  }

  public C getBlue() {
    return blue;
  }
}
