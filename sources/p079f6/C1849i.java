package p079f6;

import com.google.android.gms.common.api.Status;
import p096g6.C2047n;
import p096g6.C2068u;
import p108h6.C2394s;

/* renamed from: f6.i */
/* loaded from: classes.dex */
public final class C1849i {
    /* renamed from: a */
    public static <R extends InterfaceC1853m> AbstractC1848h<R> m7597a(R r10, AbstractC1846f abstractC1846f) {
        C2394s.m9620m(r10, "Result must not be null");
        C2394s.m9609b(!r10.getStatus().m4991N(), "Status code must not be SUCCESS");
        C1862v c1862v = new C1862v(abstractC1846f, r10);
        c1862v.setResult(r10);
        return c1862v;
    }

    /* renamed from: b */
    public static <R extends InterfaceC1853m> AbstractC1847g<R> m7598b(R r10, AbstractC1846f abstractC1846f) {
        C2394s.m9620m(r10, "Result must not be null");
        C1863w c1863w = new C1863w(abstractC1846f);
        c1863w.setResult(r10);
        return new C2047n(c1863w);
    }

    /* renamed from: c */
    public static AbstractC1848h<Status> m7599c(Status status, AbstractC1846f abstractC1846f) {
        C2394s.m9620m(status, "Result must not be null");
        C2068u c2068u = new C2068u(abstractC1846f);
        c2068u.setResult(status);
        return c2068u;
    }
}
