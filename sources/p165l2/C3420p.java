package p165l2;

import androidx.work.C0417b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p029c2.AbstractC0592j;
import p029c2.C0584b;
import p029c2.C0601s;
import p029c2.EnumC0583a;
import p029c2.EnumC0596n;
import p230q.InterfaceC4120a;

/* renamed from: l2.p */
/* loaded from: classes.dex */
public final class C3420p {

    /* renamed from: s */
    public static final String f12008s = AbstractC0592j.m2972f("WorkSpec");

    /* renamed from: t */
    public static final InterfaceC4120a<List<c>, List<C0601s>> f12009t = new a();

    /* renamed from: a */
    public String f12010a;

    /* renamed from: b */
    public C0601s.a f12011b;

    /* renamed from: c */
    public String f12012c;

    /* renamed from: d */
    public String f12013d;

    /* renamed from: e */
    public C0417b f12014e;

    /* renamed from: f */
    public C0417b f12015f;

    /* renamed from: g */
    public long f12016g;

    /* renamed from: h */
    public long f12017h;

    /* renamed from: i */
    public long f12018i;

    /* renamed from: j */
    public C0584b f12019j;

    /* renamed from: k */
    public int f12020k;

    /* renamed from: l */
    public EnumC0583a f12021l;

    /* renamed from: m */
    public long f12022m;

    /* renamed from: n */
    public long f12023n;

    /* renamed from: o */
    public long f12024o;

    /* renamed from: p */
    public long f12025p;

    /* renamed from: q */
    public boolean f12026q;

    /* renamed from: r */
    public EnumC0596n f12027r;

    /* renamed from: l2.p$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4120a<List<c>, List<C0601s>> {
        @Override // p230q.InterfaceC4120a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<C0601s> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m12737a());
            }
            return arrayList;
        }
    }

    /* renamed from: l2.p$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public String f12028a;

        /* renamed from: b */
        public C0601s.a f12029b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f12029b != bVar.f12029b) {
                return false;
            }
            return this.f12028a.equals(bVar.f12028a);
        }

        public int hashCode() {
            return (this.f12028a.hashCode() * 31) + this.f12029b.hashCode();
        }
    }

    /* renamed from: l2.p$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public String f12030a;

        /* renamed from: b */
        public C0601s.a f12031b;

        /* renamed from: c */
        public C0417b f12032c;

        /* renamed from: d */
        public int f12033d;

        /* renamed from: e */
        public List<String> f12034e;

        /* renamed from: f */
        public List<C0417b> f12035f;

        /* renamed from: a */
        public C0601s m12737a() {
            List<C0417b> list = this.f12035f;
            return new C0601s(UUID.fromString(this.f12030a), this.f12031b, this.f12032c, this.f12034e, (list == null || list.isEmpty()) ? C0417b.f2003c : this.f12035f.get(0), this.f12033d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f12033d != cVar.f12033d) {
                return false;
            }
            String str = this.f12030a;
            if (str == null ? cVar.f12030a != null : !str.equals(cVar.f12030a)) {
                return false;
            }
            if (this.f12031b != cVar.f12031b) {
                return false;
            }
            C0417b c0417b = this.f12032c;
            if (c0417b == null ? cVar.f12032c != null : !c0417b.equals(cVar.f12032c)) {
                return false;
            }
            List<String> list = this.f12034e;
            if (list == null ? cVar.f12034e != null : !list.equals(cVar.f12034e)) {
                return false;
            }
            List<C0417b> list2 = this.f12035f;
            List<C0417b> list3 = cVar.f12035f;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.f12030a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C0601s.a aVar = this.f12031b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C0417b c0417b = this.f12032c;
            int hashCode3 = (((hashCode2 + (c0417b != null ? c0417b.hashCode() : 0)) * 31) + this.f12033d) * 31;
            List<String> list = this.f12034e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<C0417b> list2 = this.f12035f;
            return hashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    public C3420p(String str, String str2) {
        this.f12011b = C0601s.a.ENQUEUED;
        C0417b c0417b = C0417b.f2003c;
        this.f12014e = c0417b;
        this.f12015f = c0417b;
        this.f12019j = C0584b.f2568i;
        this.f12021l = EnumC0583a.EXPONENTIAL;
        this.f12022m = 30000L;
        this.f12025p = -1L;
        this.f12027r = EnumC0596n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f12010a = str;
        this.f12012c = str2;
    }

    public C3420p(C3420p c3420p) {
        this.f12011b = C0601s.a.ENQUEUED;
        C0417b c0417b = C0417b.f2003c;
        this.f12014e = c0417b;
        this.f12015f = c0417b;
        this.f12019j = C0584b.f2568i;
        this.f12021l = EnumC0583a.EXPONENTIAL;
        this.f12022m = 30000L;
        this.f12025p = -1L;
        this.f12027r = EnumC0596n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f12010a = c3420p.f12010a;
        this.f12012c = c3420p.f12012c;
        this.f12011b = c3420p.f12011b;
        this.f12013d = c3420p.f12013d;
        this.f12014e = new C0417b(c3420p.f12014e);
        this.f12015f = new C0417b(c3420p.f12015f);
        this.f12016g = c3420p.f12016g;
        this.f12017h = c3420p.f12017h;
        this.f12018i = c3420p.f12018i;
        this.f12019j = new C0584b(c3420p.f12019j);
        this.f12020k = c3420p.f12020k;
        this.f12021l = c3420p.f12021l;
        this.f12022m = c3420p.f12022m;
        this.f12023n = c3420p.f12023n;
        this.f12024o = c3420p.f12024o;
        this.f12025p = c3420p.f12025p;
        this.f12026q = c3420p.f12026q;
        this.f12027r = c3420p.f12027r;
    }

    /* renamed from: a */
    public long m12731a() {
        if (m12733c()) {
            return this.f12023n + Math.min(18000000L, this.f12021l == EnumC0583a.LINEAR ? this.f12022m * this.f12020k : Math.scalb((float) this.f12022m, this.f12020k - 1));
        }
        if (!m12734d()) {
            long j10 = this.f12023n;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            return j10 + this.f12016g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f12023n;
        long j12 = j11 == 0 ? currentTimeMillis + this.f12016g : j11;
        long j13 = this.f12018i;
        long j14 = this.f12017h;
        if (j13 != j14) {
            return j12 + j14 + (j11 == 0 ? j13 * (-1) : 0L);
        }
        return j12 + (j11 != 0 ? j14 : 0L);
    }

    /* renamed from: b */
    public boolean m12732b() {
        return !C0584b.f2568i.equals(this.f12019j);
    }

    /* renamed from: c */
    public boolean m12733c() {
        return this.f12011b == C0601s.a.ENQUEUED && this.f12020k > 0;
    }

    /* renamed from: d */
    public boolean m12734d() {
        return this.f12017h != 0;
    }

    /* renamed from: e */
    public void m12735e(long j10) {
        if (j10 > 18000000) {
            AbstractC0592j.m2970c().mo2977h(f12008s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j10 = 18000000;
        }
        if (j10 < 10000) {
            AbstractC0592j.m2970c().mo2977h(f12008s, "Backoff delay duration less than minimum value", new Throwable[0]);
            j10 = 10000;
        }
        this.f12022m = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3420p.class != obj.getClass()) {
            return false;
        }
        C3420p c3420p = (C3420p) obj;
        if (this.f12016g != c3420p.f12016g || this.f12017h != c3420p.f12017h || this.f12018i != c3420p.f12018i || this.f12020k != c3420p.f12020k || this.f12022m != c3420p.f12022m || this.f12023n != c3420p.f12023n || this.f12024o != c3420p.f12024o || this.f12025p != c3420p.f12025p || this.f12026q != c3420p.f12026q || !this.f12010a.equals(c3420p.f12010a) || this.f12011b != c3420p.f12011b || !this.f12012c.equals(c3420p.f12012c)) {
            return false;
        }
        String str = this.f12013d;
        if (str == null ? c3420p.f12013d == null : str.equals(c3420p.f12013d)) {
            return this.f12014e.equals(c3420p.f12014e) && this.f12015f.equals(c3420p.f12015f) && this.f12019j.equals(c3420p.f12019j) && this.f12021l == c3420p.f12021l && this.f12027r == c3420p.f12027r;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f12010a.hashCode() * 31) + this.f12011b.hashCode()) * 31) + this.f12012c.hashCode()) * 31;
        String str = this.f12013d;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f12014e.hashCode()) * 31) + this.f12015f.hashCode()) * 31;
        long j10 = this.f12016g;
        int i10 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f12017h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f12018i;
        int hashCode3 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f12019j.hashCode()) * 31) + this.f12020k) * 31) + this.f12021l.hashCode()) * 31;
        long j13 = this.f12022m;
        int i12 = (hashCode3 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f12023n;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f12024o;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f12025p;
        return ((((i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f12026q ? 1 : 0)) * 31) + this.f12027r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f12010a + "}";
    }
}
