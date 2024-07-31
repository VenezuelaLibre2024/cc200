package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import td.C4753m;

/* loaded from: classes.dex */
public final class ActivityCompatHelperApi30 {
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final Rect currentWindowBounds(Activity activity) {
        C4753m.m18653f(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        C4753m.m18652e(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final Rect maximumWindowBounds(Activity activity) {
        C4753m.m18653f(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        C4753m.m18652e(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
