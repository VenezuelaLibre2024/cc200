package p179m3;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p045d3.InterfaceC1538j;
import p093g3.AbstractC1971i;
import p093g3.AbstractC1978p;
import p093g3.C1983u;
import p105h3.InterfaceC2290e;
import p105h3.InterfaceC2298m;
import p191n3.InterfaceC3728y;
import p204o3.InterfaceC3848d;
import p220p3.InterfaceC3999b;

/* renamed from: m3.c */
/* loaded from: classes.dex */
public class C3516c implements InterfaceC3518e {

    /* renamed from: f */
    public static final Logger f12335f = Logger.getLogger(C1983u.class.getName());

    /* renamed from: a */
    public final InterfaceC3728y f12336a;

    /* renamed from: b */
    public final Executor f12337b;

    /* renamed from: c */
    public final InterfaceC2290e f12338c;

    /* renamed from: d */
    public final InterfaceC3848d f12339d;

    /* renamed from: e */
    public final InterfaceC3999b f12340e;

    public C3516c(Executor executor, InterfaceC2290e interfaceC2290e, InterfaceC3728y interfaceC3728y, InterfaceC3848d interfaceC3848d, InterfaceC3999b interfaceC3999b) {
        this.f12337b = executor;
        this.f12338c = interfaceC2290e;
        this.f12336a = interfaceC3728y;
        this.f12339d = interfaceC3848d;
        this.f12340e = interfaceC3999b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m13064d(AbstractC1978p abstractC1978p, AbstractC1971i abstractC1971i) {
        this.f12339d.mo14633D(abstractC1978p, abstractC1971i);
        this.f12336a.mo13983a(abstractC1978p, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m13065e(final AbstractC1978p abstractC1978p, InterfaceC1538j interfaceC1538j, AbstractC1971i abstractC1971i) {
        try {
            InterfaceC2298m interfaceC2298m = this.f12338c.get(abstractC1978p.mo7964b());
            if (interfaceC2298m == null) {
                String format = String.format("Transport backend '%s' is not registered", abstractC1978p.mo7964b());
                f12335f.warning(format);
                interfaceC1538j.mo6241a(new IllegalArgumentException(format));
            } else {
                final AbstractC1971i mo6545b = interfaceC2298m.mo6545b(abstractC1971i);
                this.f12340e.mo14729a(new InterfaceC3999b.a() { // from class: m3.b
                    @Override // p220p3.InterfaceC3999b.a
                    /* renamed from: d */
                    public final Object mo13061d() {
                        Object m13064d;
                        m13064d = C3516c.this.m13064d(abstractC1978p, mo6545b);
                        return m13064d;
                    }
                });
                interfaceC1538j.mo6241a(null);
            }
        } catch (Exception e10) {
            f12335f.warning("Error scheduling event " + e10.getMessage());
            interfaceC1538j.mo6241a(e10);
        }
    }

    @Override // p179m3.InterfaceC3518e
    /* renamed from: a */
    public void mo13066a(final AbstractC1978p abstractC1978p, final AbstractC1971i abstractC1971i, final InterfaceC1538j interfaceC1538j) {
        this.f12337b.execute(new Runnable() { // from class: m3.a
            @Override // java.lang.Runnable
            public final void run() {
                C3516c.this.m13065e(abstractC1978p, interfaceC1538j, abstractC1971i);
            }
        });
    }
}
