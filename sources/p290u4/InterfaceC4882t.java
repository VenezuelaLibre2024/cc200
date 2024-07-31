package p290u4;

import android.os.Handler;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3917m0;
import p264s3.AbstractC4505u3;
import p264s3.C4503u1;
import p275t3.C4674s1;
import p317w3.InterfaceC5255u;

/* renamed from: u4.t */
/* loaded from: classes.dex */
public interface InterfaceC4882t {

    /* renamed from: u4.t$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: u4.t$b */
    /* loaded from: classes.dex */
    public static final class b extends C4880s {
        public b(Object obj) {
            super(obj);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public b(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public b(C4880s c4880s) {
            super(c4880s);
        }

        /* renamed from: c */
        public b m19449c(Object obj) {
            return new b(super.m19437a(obj));
        }
    }

    /* renamed from: u4.t$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo17221a(InterfaceC4882t interfaceC4882t, AbstractC4505u3 abstractC4505u3);
    }

    /* renamed from: a */
    void mo4725a(InterfaceC4878r interfaceC4878r);

    /* renamed from: b */
    InterfaceC4878r mo4727b(b bVar, InterfaceC3894b interfaceC3894b, long j10);

    /* renamed from: c */
    void mo19192c(Handler handler, InterfaceC5255u interfaceC5255u);

    /* renamed from: d */
    void mo19193d(c cVar, InterfaceC3917m0 interfaceC3917m0, C4674s1 c4674s1);

    /* renamed from: e */
    void mo19194e(c cVar);

    /* renamed from: g */
    C4503u1 mo4733g();

    /* renamed from: h */
    void mo4735h();

    /* renamed from: i */
    void mo19195i(Handler handler, InterfaceC4845a0 interfaceC4845a0);

    /* renamed from: j */
    default boolean mo19447j() {
        return true;
    }

    /* renamed from: l */
    default AbstractC4505u3 mo19448l() {
        return null;
    }

    /* renamed from: m */
    void mo19196m(InterfaceC4845a0 interfaceC4845a0);

    /* renamed from: n */
    void mo19197n(InterfaceC5255u interfaceC5255u);

    /* renamed from: q */
    void mo19198q(c cVar);

    /* renamed from: s */
    void mo19199s(c cVar);
}
