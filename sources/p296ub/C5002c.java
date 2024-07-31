package p296ub;

import ac.C0086a;
import ac.InterfaceC0087b;
import android.os.Handler;
import android.os.Looper;
import ec.C1765a;
import ec.InterfaceC1766b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import p025bc.C0541a;
import p025bc.C0542b;
import p025bc.InterfaceC0545e;
import p054dc.C1612c;
import p054dc.InterfaceC1610a;
import p114hc.C2477a;
import p114hc.InterfaceC2478b;
import p311vb.EnumC5160d;
import p357yb.C5906b;
import p357yb.InterfaceC5905a;
import p371zb.C6117b;
import p371zb.InterfaceC6116a;

/* renamed from: ub.c */
/* loaded from: classes.dex */
public class C5002c {

    /* renamed from: a */
    public InterfaceC6116a f18699a;

    /* renamed from: b */
    public List<InterfaceC0087b> f18700b;

    /* renamed from: c */
    public List<InterfaceC0087b> f18701c;

    /* renamed from: d */
    public InterfaceC0545e f18702d;

    /* renamed from: e */
    public InterfaceC0545e f18703e;

    /* renamed from: f */
    public InterfaceC2478b f18704f;

    /* renamed from: g */
    public int f18705g;

    /* renamed from: h */
    public InterfaceC1766b f18706h;

    /* renamed from: i */
    public InterfaceC1610a f18707i;

    /* renamed from: j */
    public InterfaceC5905a f18708j;

    /* renamed from: k */
    public InterfaceC5001b f18709k;

    /* renamed from: l */
    public Handler f18710l;

    /* renamed from: ub.c$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public InterfaceC6116a f18711a;

        /* renamed from: b */
        public final List<InterfaceC0087b> f18712b = new ArrayList();

        /* renamed from: c */
        public final List<InterfaceC0087b> f18713c = new ArrayList();

        /* renamed from: d */
        public InterfaceC5001b f18714d;

        /* renamed from: e */
        public Handler f18715e;

        /* renamed from: f */
        public InterfaceC0545e f18716f;

        /* renamed from: g */
        public InterfaceC0545e f18717g;

        /* renamed from: h */
        public InterfaceC2478b f18718h;

        /* renamed from: i */
        public int f18719i;

        /* renamed from: j */
        public InterfaceC1766b f18720j;

        /* renamed from: k */
        public InterfaceC1610a f18721k;

        /* renamed from: l */
        public InterfaceC5905a f18722l;

        public b(String str) {
            this.f18711a = new C6117b(str);
        }

        /* renamed from: a */
        public b m19596a(InterfaceC0087b interfaceC0087b) {
            this.f18712b.add(interfaceC0087b);
            this.f18713c.add(interfaceC0087b);
            return this;
        }

        /* renamed from: b */
        public C5002c m19597b() {
            if (this.f18714d == null) {
                throw new IllegalStateException("listener can't be null");
            }
            if (this.f18712b.isEmpty() && this.f18713c.isEmpty()) {
                throw new IllegalStateException("we need at least one data source");
            }
            int i10 = this.f18719i;
            if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
                throw new IllegalArgumentException("Accepted values for rotation are 0, 90, 180, 270");
            }
            if (this.f18715e == null) {
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    myLooper = Looper.getMainLooper();
                }
                this.f18715e = new Handler(myLooper);
            }
            if (this.f18716f == null) {
                this.f18716f = C0541a.m2657b().m2661a();
            }
            if (this.f18717g == null) {
                this.f18717g = C0542b.m2673a();
            }
            if (this.f18718h == null) {
                this.f18718h = new C2477a();
            }
            if (this.f18720j == null) {
                this.f18720j = new C1765a();
            }
            if (this.f18721k == null) {
                this.f18721k = new C1612c();
            }
            if (this.f18722l == null) {
                this.f18722l = new C5906b();
            }
            C5002c c5002c = new C5002c();
            c5002c.f18709k = this.f18714d;
            c5002c.f18701c = m19598c();
            c5002c.f18700b = this.f18713c;
            c5002c.f18699a = this.f18711a;
            c5002c.f18710l = this.f18715e;
            c5002c.f18702d = this.f18716f;
            c5002c.f18703e = this.f18717g;
            c5002c.f18704f = this.f18718h;
            c5002c.f18705g = this.f18719i;
            c5002c.f18706h = this.f18720j;
            c5002c.f18707i = this.f18721k;
            c5002c.f18708j = this.f18722l;
            return c5002c;
        }

        /* renamed from: c */
        public final List<InterfaceC0087b> m19598c() {
            Iterator<InterfaceC0087b> it = this.f18712b.iterator();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                if (it.next().mo380e(EnumC5160d.AUDIO) == null) {
                    z12 = true;
                } else {
                    z11 = true;
                }
                if (z11 && z12) {
                    break;
                }
            }
            if (z10) {
                return this.f18712b;
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC0087b interfaceC0087b : this.f18712b) {
                if (interfaceC0087b.mo380e(EnumC5160d.AUDIO) != null) {
                    arrayList.add(interfaceC0087b);
                } else {
                    arrayList.add(new C0086a(interfaceC0087b.mo379d()));
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public b m19599d(InterfaceC0545e interfaceC0545e) {
            this.f18716f = interfaceC0545e;
            return this;
        }

        /* renamed from: e */
        public b m19600e(InterfaceC5001b interfaceC5001b) {
            this.f18714d = interfaceC5001b;
            return this;
        }

        /* renamed from: f */
        public b m19601f(InterfaceC0545e interfaceC0545e) {
            this.f18717g = interfaceC0545e;
            return this;
        }

        /* renamed from: g */
        public Future<Void> m19602g() {
            return C5000a.m19570c().m19572e(m19597b());
        }
    }

    public C5002c() {
    }

    /* renamed from: k */
    public List<InterfaceC0087b> m19586k() {
        return this.f18701c;
    }

    /* renamed from: l */
    public InterfaceC5905a m19587l() {
        return this.f18708j;
    }

    /* renamed from: m */
    public InterfaceC1610a m19588m() {
        return this.f18707i;
    }

    /* renamed from: n */
    public InterfaceC0545e m19589n() {
        return this.f18702d;
    }

    /* renamed from: o */
    public InterfaceC6116a m19590o() {
        return this.f18699a;
    }

    /* renamed from: p */
    public InterfaceC1766b m19591p() {
        return this.f18706h;
    }

    /* renamed from: q */
    public InterfaceC2478b m19592q() {
        return this.f18704f;
    }

    /* renamed from: r */
    public List<InterfaceC0087b> m19593r() {
        return this.f18700b;
    }

    /* renamed from: s */
    public int m19594s() {
        return this.f18705g;
    }

    /* renamed from: t */
    public InterfaceC0545e m19595t() {
        return this.f18703e;
    }
}
