package p059e1;

import io.flutter.plugins.firebase.crashlytics.Constants;
import p059e1.AbstractC1637a;
import td.C4747g;
import td.C4753m;

/* renamed from: e1.d */
/* loaded from: classes.dex */
public final class C1640d extends AbstractC1637a {
    public C1640d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C1640d(AbstractC1637a abstractC1637a) {
        C4753m.m18653f(abstractC1637a, "initialExtras");
        m6515b().putAll(abstractC1637a.m6515b());
    }

    public /* synthetic */ C1640d(AbstractC1637a abstractC1637a, int i10, C4747g c4747g) {
        this((i10 & 1) != 0 ? AbstractC1637a.a.f6041b : abstractC1637a);
    }

    @Override // p059e1.AbstractC1637a
    /* renamed from: a */
    public <T> T mo6514a(AbstractC1637a.b<T> bVar) {
        C4753m.m18653f(bVar, Constants.KEY);
        return (T) m6515b().get(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final <T> void m6518c(AbstractC1637a.b<T> bVar, T t10) {
        C4753m.m18653f(bVar, Constants.KEY);
        m6515b().put(bVar, t10);
    }
}
