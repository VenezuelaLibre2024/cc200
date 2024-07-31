package androidx.activity;

import gd.C2245s;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import sd.InterfaceC4569a;
import td.C4753m;

/* renamed from: androidx.activity.l */
/* loaded from: classes.dex */
public abstract class AbstractC0159l {
    private final CopyOnWriteArrayList<InterfaceC0148a> cancellables = new CopyOnWriteArrayList<>();
    private InterfaceC4569a<C2245s> enabledChangedCallback;
    private boolean isEnabled;

    public AbstractC0159l(boolean z10) {
        this.isEnabled = z10;
    }

    public final void addCancellable(InterfaceC0148a interfaceC0148a) {
        C4753m.m18653f(interfaceC0148a, "cancellable");
        this.cancellables.add(interfaceC0148a);
    }

    public final InterfaceC4569a<C2245s> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((InterfaceC0148a) it.next()).cancel();
        }
    }

    public final void removeCancellable(InterfaceC0148a interfaceC0148a) {
        C4753m.m18653f(interfaceC0148a, "cancellable");
        this.cancellables.remove(interfaceC0148a);
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        InterfaceC4569a<C2245s> interfaceC4569a = this.enabledChangedCallback;
        if (interfaceC4569a != null) {
            interfaceC4569a.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(InterfaceC4569a<C2245s> interfaceC4569a) {
        this.enabledChangedCallback = interfaceC4569a;
    }
}
