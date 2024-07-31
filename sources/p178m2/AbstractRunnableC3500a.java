package p178m2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import p029c2.C0601s;
import p029c2.InterfaceC0595m;
import p044d2.C1521c;
import p044d2.C1524f;
import p044d2.C1527i;
import p044d2.InterfaceC1523e;
import p165l2.InterfaceC3406b;
import p165l2.InterfaceC3421q;

/* renamed from: m2.a */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC3500a implements Runnable {

    /* renamed from: h */
    public final C1521c f12265h = new C1521c();

    /* renamed from: m2.a$a */
    /* loaded from: classes.dex */
    public class a extends AbstractRunnableC3500a {

        /* renamed from: i */
        public final /* synthetic */ C1527i f12266i;

        /* renamed from: j */
        public final /* synthetic */ UUID f12267j;

        public a(C1527i c1527i, UUID uuid) {
            this.f12266i = c1527i;
            this.f12267j = uuid;
        }

        @Override // p178m2.AbstractRunnableC3500a
        /* renamed from: h */
        public void mo13033h() {
            WorkDatabase m6199o = this.f12266i.m6199o();
            m6199o.m14550c();
            try {
                m13029a(this.f12266i, this.f12267j.toString());
                m6199o.m14562r();
                m6199o.m14552g();
                m13032g(this.f12266i);
            } catch (Throwable th) {
                m6199o.m14552g();
                throw th;
            }
        }
    }

    /* renamed from: m2.a$b */
    /* loaded from: classes.dex */
    public class b extends AbstractRunnableC3500a {

        /* renamed from: i */
        public final /* synthetic */ C1527i f12268i;

        /* renamed from: j */
        public final /* synthetic */ String f12269j;

        public b(C1527i c1527i, String str) {
            this.f12268i = c1527i;
            this.f12269j = str;
        }

        @Override // p178m2.AbstractRunnableC3500a
        /* renamed from: h */
        public void mo13033h() {
            WorkDatabase m6199o = this.f12268i.m6199o();
            m6199o.m14550c();
            try {
                Iterator<String> it = m6199o.mo2131B().mo12753p(this.f12269j).iterator();
                while (it.hasNext()) {
                    m13029a(this.f12268i, it.next());
                }
                m6199o.m14562r();
                m6199o.m14552g();
                m13032g(this.f12268i);
            } catch (Throwable th) {
                m6199o.m14552g();
                throw th;
            }
        }
    }

    /* renamed from: m2.a$c */
    /* loaded from: classes.dex */
    public class c extends AbstractRunnableC3500a {

        /* renamed from: i */
        public final /* synthetic */ C1527i f12270i;

        /* renamed from: j */
        public final /* synthetic */ String f12271j;

        /* renamed from: k */
        public final /* synthetic */ boolean f12272k;

        public c(C1527i c1527i, String str, boolean z10) {
            this.f12270i = c1527i;
            this.f12271j = str;
            this.f12272k = z10;
        }

        @Override // p178m2.AbstractRunnableC3500a
        /* renamed from: h */
        public void mo13033h() {
            WorkDatabase m6199o = this.f12270i.m6199o();
            m6199o.m14550c();
            try {
                Iterator<String> it = m6199o.mo2131B().mo12749l(this.f12271j).iterator();
                while (it.hasNext()) {
                    m13029a(this.f12270i, it.next());
                }
                m6199o.m14562r();
                m6199o.m14552g();
                if (this.f12272k) {
                    m13032g(this.f12270i);
                }
            } catch (Throwable th) {
                m6199o.m14552g();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static AbstractRunnableC3500a m13026b(UUID uuid, C1527i c1527i) {
        return new a(c1527i, uuid);
    }

    /* renamed from: c */
    public static AbstractRunnableC3500a m13027c(String str, C1527i c1527i, boolean z10) {
        return new c(c1527i, str, z10);
    }

    /* renamed from: d */
    public static AbstractRunnableC3500a m13028d(String str, C1527i c1527i) {
        return new b(c1527i, str);
    }

    /* renamed from: a */
    public void m13029a(C1527i c1527i, String str) {
        m13031f(c1527i.m6199o(), str);
        c1527i.m6197m().m6162l(str);
        Iterator<InterfaceC1523e> it = c1527i.m6198n().iterator();
        while (it.hasNext()) {
            it.next().mo6167d(str);
        }
    }

    /* renamed from: e */
    public InterfaceC0595m m13030e() {
        return this.f12265h;
    }

    /* renamed from: f */
    public final void m13031f(WorkDatabase workDatabase, String str) {
        InterfaceC3421q mo2131B = workDatabase.mo2131B();
        InterfaceC3406b mo2133t = workDatabase.mo2133t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C0601s.a mo12750m = mo2131B.mo12750m(str2);
            if (mo12750m != C0601s.a.SUCCEEDED && mo12750m != C0601s.a.FAILED) {
                mo2131B.mo12746i(C0601s.a.CANCELLED, str2);
            }
            linkedList.addAll(mo2133t.mo12711b(str2));
        }
    }

    /* renamed from: g */
    public void m13032g(C1527i c1527i) {
        C1524f.m6170b(c1527i.m6195i(), c1527i.m6199o(), c1527i.m6198n());
    }

    /* renamed from: h */
    public abstract void mo13033h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo13033h();
            this.f12265h.m6151a(InterfaceC0595m.f2607a);
        } catch (Throwable th) {
            this.f12265h.m6151a(new InterfaceC0595m.b.a(th));
        }
    }
}
