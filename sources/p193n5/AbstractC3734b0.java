package p193n5;

import p206o5.InterfaceC3900e;
import p222p5.C4014a;
import p264s3.AbstractC4505u3;
import p264s3.InterfaceC4450j3;
import p289u3.C4813e;
import p290u4.C4885u0;
import p290u4.InterfaceC4882t;

/* renamed from: n5.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC3734b0 {

    /* renamed from: a */
    public a f13315a;

    /* renamed from: b */
    public InterfaceC3900e f13316b;

    /* renamed from: n5.b0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: c */
        void mo14082c();
    }

    /* renamed from: a */
    public final InterfaceC3900e m14074a() {
        return (InterfaceC3900e) C4014a.m15202h(this.f13316b);
    }

    /* renamed from: b */
    public void m14075b(a aVar, InterfaceC3900e interfaceC3900e) {
        this.f13315a = aVar;
        this.f13316b = interfaceC3900e;
    }

    /* renamed from: c */
    public final void m14076c() {
        a aVar = this.f13315a;
        if (aVar != null) {
            aVar.mo14082c();
        }
    }

    /* renamed from: d */
    public boolean mo14077d() {
        return false;
    }

    /* renamed from: e */
    public abstract void mo14078e(Object obj);

    /* renamed from: f */
    public void mo14079f() {
        this.f13315a = null;
        this.f13316b = null;
    }

    /* renamed from: g */
    public abstract C3736c0 mo14080g(InterfaceC4450j3[] interfaceC4450j3Arr, C4885u0 c4885u0, InterfaceC4882t.b bVar, AbstractC4505u3 abstractC4505u3);

    /* renamed from: h */
    public void mo14081h(C4813e c4813e) {
    }
}
