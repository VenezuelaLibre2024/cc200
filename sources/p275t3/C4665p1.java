package p275t3;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p109h7.InterfaceC2438u;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.AbstractC4505u3;
import p275t3.InterfaceC4621b;
import p275t3.InterfaceC4671r1;
import p290u4.InterfaceC4882t;

/* renamed from: t3.p1 */
/* loaded from: classes.dex */
public final class C4665p1 implements InterfaceC4671r1 {

    /* renamed from: h */
    public static final InterfaceC2438u<String> f17421h = new InterfaceC2438u() { // from class: t3.o1
        @Override // p109h7.InterfaceC2438u
        public final Object get() {
            String m18446k;
            m18446k = C4665p1.m18446k();
            return m18446k;
        }
    };

    /* renamed from: i */
    public static final Random f17422i = new Random();

    /* renamed from: a */
    public final AbstractC4505u3.d f17423a;

    /* renamed from: b */
    public final AbstractC4505u3.b f17424b;

    /* renamed from: c */
    public final HashMap<String, a> f17425c;

    /* renamed from: d */
    public final InterfaceC2438u<String> f17426d;

    /* renamed from: e */
    public InterfaceC4671r1.a f17427e;

    /* renamed from: f */
    public AbstractC4505u3 f17428f;

    /* renamed from: g */
    public String f17429g;

    /* renamed from: t3.p1$a */
    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a */
        public final String f17430a;

        /* renamed from: b */
        public int f17431b;

        /* renamed from: c */
        public long f17432c;

        /* renamed from: d */
        public InterfaceC4882t.b f17433d;

        /* renamed from: e */
        public boolean f17434e;

        /* renamed from: f */
        public boolean f17435f;

        public a(String str, int i10, InterfaceC4882t.b bVar) {
            this.f17430a = str;
            this.f17431b = i10;
            this.f17432c = bVar == null ? -1L : bVar.f18460d;
            if (bVar == null || !bVar.m19438b()) {
                return;
            }
            this.f17433d = bVar;
        }

        /* renamed from: i */
        public boolean m18464i(int i10, InterfaceC4882t.b bVar) {
            if (bVar == null) {
                return i10 == this.f17431b;
            }
            InterfaceC4882t.b bVar2 = this.f17433d;
            return bVar2 == null ? !bVar.m19438b() && bVar.f18460d == this.f17432c : bVar.f18460d == bVar2.f18460d && bVar.f18458b == bVar2.f18458b && bVar.f18459c == bVar2.f18459c;
        }

        /* renamed from: j */
        public boolean m18465j(InterfaceC4621b.a aVar) {
            InterfaceC4882t.b bVar = aVar.f17306d;
            if (bVar == null) {
                return this.f17431b != aVar.f17305c;
            }
            long j10 = this.f17432c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f18460d > j10) {
                return true;
            }
            if (this.f17433d == null) {
                return false;
            }
            int mo4743f = aVar.f17304b.mo4743f(bVar.f18457a);
            int mo4743f2 = aVar.f17304b.mo4743f(this.f17433d.f18457a);
            InterfaceC4882t.b bVar2 = aVar.f17306d;
            if (bVar2.f18460d < this.f17433d.f18460d || mo4743f < mo4743f2) {
                return false;
            }
            if (mo4743f > mo4743f2) {
                return true;
            }
            boolean m19438b = bVar2.m19438b();
            InterfaceC4882t.b bVar3 = aVar.f17306d;
            if (!m19438b) {
                int i10 = bVar3.f18461e;
                return i10 == -1 || i10 > this.f17433d.f18458b;
            }
            int i11 = bVar3.f18458b;
            int i12 = bVar3.f18459c;
            InterfaceC4882t.b bVar4 = this.f17433d;
            int i13 = bVar4.f18458b;
            if (i11 <= i13) {
                return i11 == i13 && i12 > bVar4.f18459c;
            }
            return true;
        }

        /* renamed from: k */
        public void m18466k(int i10, InterfaceC4882t.b bVar) {
            if (this.f17432c == -1 && i10 == this.f17431b && bVar != null) {
                this.f17432c = bVar.f18460d;
            }
        }

        /* renamed from: l */
        public final int m18467l(AbstractC4505u3 abstractC4505u3, AbstractC4505u3 abstractC4505u32, int i10) {
            if (i10 >= abstractC4505u3.mo4748t()) {
                if (i10 < abstractC4505u32.mo4748t()) {
                    return i10;
                }
                return -1;
            }
            abstractC4505u3.m17675r(i10, C4665p1.this.f17423a);
            for (int i11 = C4665p1.this.f17423a.f16874v; i11 <= C4665p1.this.f17423a.f16875w; i11++) {
                int mo4743f = abstractC4505u32.mo4743f(abstractC4505u3.mo4746q(i11));
                if (mo4743f != -1) {
                    return abstractC4505u32.m17672j(mo4743f, C4665p1.this.f17424b).f16834j;
                }
            }
            return -1;
        }

        /* renamed from: m */
        public boolean m18468m(AbstractC4505u3 abstractC4505u3, AbstractC4505u3 abstractC4505u32) {
            int m18467l = m18467l(abstractC4505u3, abstractC4505u32, this.f17431b);
            this.f17431b = m18467l;
            if (m18467l == -1) {
                return false;
            }
            InterfaceC4882t.b bVar = this.f17433d;
            return bVar == null || abstractC4505u32.mo4743f(bVar.f18457a) != -1;
        }
    }

    public C4665p1() {
        this(f17421h);
    }

    public C4665p1(InterfaceC2438u<String> interfaceC2438u) {
        this.f17426d = interfaceC2438u;
        this.f17423a = new AbstractC4505u3.d();
        this.f17424b = new AbstractC4505u3.b();
        this.f17425c = new HashMap<>();
        this.f17428f = AbstractC4505u3.f16821h;
    }

    /* renamed from: k */
    public static String m18446k() {
        byte[] bArr = new byte[12];
        f17422i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // p275t3.InterfaceC4671r1
    /* renamed from: a */
    public synchronized void mo18447a(InterfaceC4621b.a aVar, int i10) {
        C4014a.m15199e(this.f17427e);
        boolean z10 = i10 == 0;
        Iterator<a> it = this.f17425c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.m18465j(aVar)) {
                it.remove();
                if (next.f17434e) {
                    boolean equals = next.f17430a.equals(this.f17429g);
                    boolean z11 = z10 && equals && next.f17435f;
                    if (equals) {
                        this.f17429g = null;
                    }
                    this.f17427e.mo18494m0(aVar, next.f17430a, z11);
                }
            }
        }
        m18455m(aVar);
    }

    @Override // p275t3.InterfaceC4671r1
    /* renamed from: b */
    public synchronized String mo18448b() {
        return this.f17429g;
    }

    @Override // p275t3.InterfaceC4671r1
    /* renamed from: c */
    public synchronized void mo18449c(InterfaceC4621b.a aVar) {
        InterfaceC4671r1.a aVar2;
        this.f17429g = null;
        Iterator<a> it = this.f17425c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f17434e && (aVar2 = this.f17427e) != null) {
                aVar2.mo18494m0(aVar, next.f17430a, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1 A[Catch: all -> 0x0118, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0014, B:12:0x0025, B:14:0x0030, B:20:0x003a, B:23:0x004b, B:25:0x0057, B:26:0x005d, B:28:0x0061, B:30:0x0067, B:32:0x0080, B:33:0x00db, B:35:0x00e1, B:36:0x00f7, B:38:0x0103, B:40:0x0109), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    @Override // p275t3.InterfaceC4671r1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void mo18450d(p275t3.InterfaceC4621b.a r25) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p275t3.C4665p1.mo18450d(t3.b$a):void");
    }

    @Override // p275t3.InterfaceC4671r1
    /* renamed from: e */
    public synchronized String mo18451e(AbstractC4505u3 abstractC4505u3, InterfaceC4882t.b bVar) {
        return m18454l(abstractC4505u3.mo17028l(bVar.f18457a, this.f17424b).f16834j, bVar).f17430a;
    }

    @Override // p275t3.InterfaceC4671r1
    /* renamed from: f */
    public synchronized void mo18452f(InterfaceC4621b.a aVar) {
        C4014a.m15199e(this.f17427e);
        AbstractC4505u3 abstractC4505u3 = this.f17428f;
        this.f17428f = aVar.f17304b;
        Iterator<a> it = this.f17425c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.m18468m(abstractC4505u3, this.f17428f) || next.m18465j(aVar)) {
                it.remove();
                if (next.f17434e) {
                    if (next.f17430a.equals(this.f17429g)) {
                        this.f17429g = null;
                    }
                    this.f17427e.mo18494m0(aVar, next.f17430a, false);
                }
            }
        }
        m18455m(aVar);
    }

    @Override // p275t3.InterfaceC4671r1
    /* renamed from: g */
    public void mo18453g(InterfaceC4671r1.a aVar) {
        this.f17427e = aVar;
    }

    /* renamed from: l */
    public final a m18454l(int i10, InterfaceC4882t.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f17425c.values()) {
            aVar2.m18466k(i10, bVar);
            if (aVar2.m18464i(i10, bVar)) {
                long j11 = aVar2.f17432c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) C4041n0.m15463j(aVar)).f17433d != null && aVar2.f17433d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f17426d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f17425c.put(str, aVar3);
        return aVar3;
    }

    /* renamed from: m */
    public final void m18455m(InterfaceC4621b.a aVar) {
        if (aVar.f17304b.m17676u()) {
            this.f17429g = null;
            return;
        }
        a aVar2 = this.f17425c.get(this.f17429g);
        a m18454l = m18454l(aVar.f17305c, aVar.f17306d);
        this.f17429g = m18454l.f17430a;
        mo18450d(aVar);
        InterfaceC4882t.b bVar = aVar.f17306d;
        if (bVar == null || !bVar.m19438b()) {
            return;
        }
        if (aVar2 != null && aVar2.f17432c == aVar.f17306d.f18460d && aVar2.f17433d != null && aVar2.f17433d.f18458b == aVar.f17306d.f18458b && aVar2.f17433d.f18459c == aVar.f17306d.f18459c) {
            return;
        }
        InterfaceC4882t.b bVar2 = aVar.f17306d;
        this.f17427e.mo18486R(aVar, m18454l(aVar.f17305c, new InterfaceC4882t.b(bVar2.f18457a, bVar2.f18460d)).f17430a, m18454l.f17430a);
    }
}
