package androidx.window.layout;

import android.app.Activity;
import p087fe.C1908d;
import p087fe.InterfaceC1906b;
import td.C4747g;
import td.C4753m;

/* loaded from: classes.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion(null);
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C4747g c4747g) {
            this();
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        C4753m.m18653f(windowMetricsCalculator, "windowMetricsCalculator");
        C4753m.m18653f(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public InterfaceC1906b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        C4753m.m18653f(activity, "activity");
        return C1908d.m7789g(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, null));
    }
}
