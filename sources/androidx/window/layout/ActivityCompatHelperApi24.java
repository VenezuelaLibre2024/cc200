package androidx.window.layout;

import android.app.Activity;
import td.C4753m;

/* loaded from: classes.dex */
public final class ActivityCompatHelperApi24 {
    public static final ActivityCompatHelperApi24 INSTANCE = new ActivityCompatHelperApi24();

    private ActivityCompatHelperApi24() {
    }

    public final boolean isInMultiWindowMode(Activity activity) {
        C4753m.m18653f(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}
