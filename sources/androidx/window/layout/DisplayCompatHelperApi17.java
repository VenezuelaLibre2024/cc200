package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import td.C4753m;

/* loaded from: classes.dex */
public final class DisplayCompatHelperApi17 {
    public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();

    private DisplayCompatHelperApi17() {
    }

    public final void getRealSize(Display display, Point point) {
        C4753m.m18653f(display, "display");
        C4753m.m18653f(point, "point");
        display.getRealSize(point);
    }
}
