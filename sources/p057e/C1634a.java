package p057e;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import td.C4753m;

/* renamed from: e.a */
/* loaded from: classes.dex */
public final class C1634a {

    /* renamed from: a */
    public final Set<InterfaceC1635b> f6038a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public volatile Context f6039b;

    /* renamed from: a */
    public final void m6508a(InterfaceC1635b interfaceC1635b) {
        C4753m.m18653f(interfaceC1635b, "listener");
        Context context = this.f6039b;
        if (context != null) {
            interfaceC1635b.mo596a(context);
        }
        this.f6038a.add(interfaceC1635b);
    }

    /* renamed from: b */
    public final void m6509b() {
        this.f6039b = null;
    }

    /* renamed from: c */
    public final void m6510c(Context context) {
        C4753m.m18653f(context, "context");
        this.f6039b = context;
        Iterator<InterfaceC1635b> it = this.f6038a.iterator();
        while (it.hasNext()) {
            it.next().mo596a(context);
        }
    }

    /* renamed from: d */
    public final Context m6511d() {
        return this.f6039b;
    }

    /* renamed from: e */
    public final void m6512e(InterfaceC1635b interfaceC1635b) {
        C4753m.m18653f(interfaceC1635b, "listener");
        this.f6038a.remove(interfaceC1635b);
    }
}
