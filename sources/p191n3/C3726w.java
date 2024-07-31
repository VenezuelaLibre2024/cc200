package p191n3;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p093g3.AbstractC1978p;
import p204o3.InterfaceC3848d;
import p220p3.InterfaceC3999b;

/* renamed from: n3.w */
/* loaded from: classes.dex */
public class C3726w {

    /* renamed from: a */
    public final Executor f13271a;

    /* renamed from: b */
    public final InterfaceC3848d f13272b;

    /* renamed from: c */
    public final InterfaceC3728y f13273c;

    /* renamed from: d */
    public final InterfaceC3999b f13274d;

    public C3726w(Executor executor, InterfaceC3848d interfaceC3848d, InterfaceC3728y interfaceC3728y, InterfaceC3999b interfaceC3999b) {
        this.f13271a = executor;
        this.f13272b = interfaceC3848d;
        this.f13273c = interfaceC3728y;
        this.f13274d = interfaceC3999b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m14036d() {
        Iterator<AbstractC1978p> it = this.f13272b.mo14634F().iterator();
        while (it.hasNext()) {
            this.f13273c.mo13983a(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m14037e() {
        this.f13274d.mo14729a(new InterfaceC3999b.a() { // from class: n3.v
            @Override // p220p3.InterfaceC3999b.a
            /* renamed from: d */
            public final Object mo13061d() {
                Object m14036d;
                m14036d = C3726w.this.m14036d();
                return m14036d;
            }
        });
    }

    /* renamed from: c */
    public void m14038c() {
        this.f13271a.execute(new Runnable() { // from class: n3.u
            @Override // java.lang.Runnable
            public final void run() {
                C3726w.this.m14037e();
            }
        });
    }
}
