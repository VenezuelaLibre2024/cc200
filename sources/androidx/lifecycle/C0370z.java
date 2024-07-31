package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.C0395a;
import gd.C2234h;
import gd.InterfaceC2233g;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Map;
import sd.InterfaceC4569a;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public final class C0370z implements C0395a.c {

    /* renamed from: a */
    public final C0395a f1771a;

    /* renamed from: b */
    public boolean f1772b;

    /* renamed from: c */
    public Bundle f1773c;

    /* renamed from: d */
    public final InterfaceC2233g f1774d;

    /* renamed from: androidx.lifecycle.z$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4569a<C0335a0> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC0351i0 f1775h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0351i0 interfaceC0351i0) {
            super(0);
            this.f1775h = interfaceC0351i0;
        }

        @Override // sd.InterfaceC4569a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0335a0 invoke() {
            return C0369y.m1887e(this.f1775h);
        }
    }

    public C0370z(C0395a c0395a, InterfaceC0351i0 interfaceC0351i0) {
        C4753m.m18653f(c0395a, "savedStateRegistry");
        C4753m.m18653f(interfaceC0351i0, "viewModelStoreOwner");
        this.f1771a = c0395a;
        this.f1774d = C2234h.m8960a(new a(interfaceC0351i0));
    }

    @Override // androidx.savedstate.C0395a.c
    /* renamed from: a */
    public Bundle mo595a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1773c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, C0368x> entry : m1890c().m1773f().entrySet()) {
            String key = entry.getKey();
            Bundle mo595a = entry.getValue().m1879c().mo595a();
            if (!C4753m.m18648a(mo595a, Bundle.EMPTY)) {
                bundle.putBundle(key, mo595a);
            }
        }
        this.f1772b = false;
        return bundle;
    }

    /* renamed from: b */
    public final Bundle m1889b(String str) {
        C4753m.m18653f(str, Constants.KEY);
        m1891d();
        Bundle bundle = this.f1773c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f1773c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f1773c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f1773c = null;
        }
        return bundle2;
    }

    /* renamed from: c */
    public final C0335a0 m1890c() {
        return (C0335a0) this.f1774d.getValue();
    }

    /* renamed from: d */
    public final void m1891d() {
        if (this.f1772b) {
            return;
        }
        this.f1773c = this.f1771a.m1992b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.f1772b = true;
        m1890c();
    }
}
