package androidx.window.java.layout;

import android.app.Activity;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import gd.C2245s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p038ce.C1063k;
import p038ce.C1089q0;
import p038ce.C1106u1;
import p038ce.InterfaceC1026c2;
import p038ce.InterfaceC1085p0;
import p087fe.InterfaceC1906b;
import p133j0.InterfaceC3202a;
import td.C4753m;

/* loaded from: classes.dex */
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final Map<InterfaceC3202a<?>, InterfaceC1026c2> consumerToJobMap;
    private final ReentrantLock lock;
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker) {
        C4753m.m18653f(windowInfoTracker, "tracker");
        this.tracker = windowInfoTracker;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap();
    }

    private final <T> void addListener(Executor executor, InterfaceC3202a<T> interfaceC3202a, InterfaceC1906b<? extends T> interfaceC1906b) {
        InterfaceC1026c2 m4457d;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(interfaceC3202a) == null) {
                InterfaceC1085p0 m4557a = C1089q0.m4557a(C1106u1.m4583a(executor));
                Map<InterfaceC3202a<?>, InterfaceC1026c2> map = this.consumerToJobMap;
                m4457d = C1063k.m4457d(m4557a, null, null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(interfaceC1906b, interfaceC3202a, null), 3, null);
                map.put(interfaceC3202a, m4457d);
            }
            C2245s c2245s = C2245s.f8873a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(InterfaceC3202a<?> interfaceC3202a) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            InterfaceC1026c2 interfaceC1026c2 = this.consumerToJobMap.get(interfaceC3202a);
            if (interfaceC1026c2 != null) {
                InterfaceC1026c2.a.m4280a(interfaceC1026c2, null, 1, null);
            }
            this.consumerToJobMap.remove(interfaceC3202a);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, InterfaceC3202a<WindowLayoutInfo> interfaceC3202a) {
        C4753m.m18653f(activity, "activity");
        C4753m.m18653f(executor, "executor");
        C4753m.m18653f(interfaceC3202a, "consumer");
        addListener(executor, interfaceC3202a, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(InterfaceC3202a<WindowLayoutInfo> interfaceC3202a) {
        C4753m.m18653f(interfaceC3202a, "consumer");
        removeListener(interfaceC3202a);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public InterfaceC1906b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        C4753m.m18653f(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
