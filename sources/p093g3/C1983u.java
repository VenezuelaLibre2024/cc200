package p093g3;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p045d3.C1531c;
import p045d3.InterfaceC1537i;
import p045d3.InterfaceC1538j;
import p179m3.InterfaceC3518e;
import p191n3.C3722s;
import p191n3.C3726w;
import p234q3.InterfaceC4157a;

/* renamed from: g3.u */
/* loaded from: classes.dex */
public class C1983u implements InterfaceC1982t {

    /* renamed from: e */
    public static volatile AbstractC1984v f7891e;

    /* renamed from: a */
    public final InterfaceC4157a f7892a;

    /* renamed from: b */
    public final InterfaceC4157a f7893b;

    /* renamed from: c */
    public final InterfaceC3518e f7894c;

    /* renamed from: d */
    public final C3722s f7895d;

    public C1983u(InterfaceC4157a interfaceC4157a, InterfaceC4157a interfaceC4157a2, InterfaceC3518e interfaceC3518e, C3722s c3722s, C3726w c3726w) {
        this.f7892a = interfaceC4157a;
        this.f7893b = interfaceC4157a2;
        this.f7894c = interfaceC3518e;
        this.f7895d = c3722s;
        c3726w.m14038c();
    }

    /* renamed from: c */
    public static C1983u m8006c() {
        AbstractC1984v abstractC1984v = f7891e;
        if (abstractC1984v != null) {
            return abstractC1984v.mo7973d();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    public static Set<C1531c> m8007d(InterfaceC1968f interfaceC1968f) {
        return interfaceC1968f instanceof InterfaceC1969g ? Collections.unmodifiableSet(((InterfaceC1969g) interfaceC1968f).mo6527a()) : Collections.singleton(C1531c.m6232b("proto"));
    }

    /* renamed from: f */
    public static void m8008f(Context context) {
        if (f7891e == null) {
            synchronized (C1983u.class) {
                if (f7891e == null) {
                    f7891e = C1967e.m7971f().mo7976b(context).mo7975a();
                }
            }
        }
    }

    @Override // p093g3.InterfaceC1982t
    /* renamed from: a */
    public void mo8005a(AbstractC1977o abstractC1977o, InterfaceC1538j interfaceC1538j) {
        this.f7894c.mo13066a(abstractC1977o.mo7956f().m8001f(abstractC1977o.mo7954c().mo6229c()), m8009b(abstractC1977o), interfaceC1538j);
    }

    /* renamed from: b */
    public final AbstractC1971i m8009b(AbstractC1977o abstractC1977o) {
        return AbstractC1971i.m7980a().mo7950i(this.f7892a.mo16002a()).mo7952k(this.f7893b.mo16002a()).mo7951j(abstractC1977o.mo7957g()).mo7949h(new C1970h(abstractC1977o.mo7953b(), abstractC1977o.m7998d())).mo7948g(abstractC1977o.mo7954c().mo6227a()).mo7945d();
    }

    /* renamed from: e */
    public C3722s m8010e() {
        return this.f7895d;
    }

    /* renamed from: g */
    public InterfaceC1537i m8011g(InterfaceC1968f interfaceC1968f) {
        return new C1979q(m8007d(interfaceC1968f), AbstractC1978p.m7999a().mo7968b(interfaceC1968f.mo6528b()).mo7969c(interfaceC1968f.mo6529c()).mo7967a(), this);
    }
}
