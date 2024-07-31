package p063e5;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p047d5.AbstractC1558m;
import p047d5.C1557l;
import p047d5.InterfaceC1553h;
import p047d5.InterfaceC1554i;
import p063e5.AbstractC1663e;
import p222p5.C4014a;
import p222p5.C4041n0;
import p304v3.AbstractC5111h;

/* renamed from: e5.e */
/* loaded from: classes.dex */
public abstract class AbstractC1663e implements InterfaceC1554i {

    /* renamed from: a */
    public final ArrayDeque<b> f6216a = new ArrayDeque<>();

    /* renamed from: b */
    public final ArrayDeque<AbstractC1558m> f6217b;

    /* renamed from: c */
    public final PriorityQueue<b> f6218c;

    /* renamed from: d */
    public b f6219d;

    /* renamed from: e */
    public long f6220e;

    /* renamed from: f */
    public long f6221f;

    /* renamed from: e5.e$b */
    /* loaded from: classes.dex */
    public static final class b extends C1557l implements Comparable<b> {

        /* renamed from: q */
        public long f6222q;

        public b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (m20748q() != bVar.m20748q()) {
                return m20748q() ? 1 : -1;
            }
            long j10 = this.f19286l - bVar.f19286l;
            if (j10 == 0) {
                j10 = this.f6222q - bVar.f6222q;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* renamed from: e5.e$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC1558m {

        /* renamed from: m */
        public AbstractC5111h.a<c> f6223m;

        public c(AbstractC5111h.a<c> aVar) {
            this.f6223m = aVar;
        }

        @Override // p304v3.AbstractC5111h
        /* renamed from: v */
        public final void mo6349v() {
            this.f6223m.mo6667a(this);
        }
    }

    public AbstractC1663e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f6216a.add(new b());
        }
        this.f6217b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f6217b.add(new c(new AbstractC5111h.a() { // from class: e5.d
                @Override // p304v3.AbstractC5111h.a
                /* renamed from: a */
                public final void mo6667a(AbstractC5111h abstractC5111h) {
                    AbstractC1663e.this.m6671n((AbstractC1663e.c) abstractC5111h);
                }
            }));
        }
        this.f6218c = new PriorityQueue<>();
    }

    @Override // p047d5.InterfaceC1554i
    /* renamed from: a */
    public void mo6341a(long j10) {
        this.f6220e = j10;
    }

    /* renamed from: e */
    public abstract InterfaceC1553h mo6603e();

    /* renamed from: f */
    public abstract void mo6604f(C1557l c1557l);

    @Override // p304v3.InterfaceC5107d
    public void flush() {
        this.f6221f = 0L;
        this.f6220e = 0L;
        while (!this.f6218c.isEmpty()) {
            m6670m((b) C4041n0.m15463j(this.f6218c.poll()));
        }
        b bVar = this.f6219d;
        if (bVar != null) {
            m6670m(bVar);
            this.f6219d = null;
        }
    }

    @Override // p304v3.InterfaceC5107d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1557l mo6343c() {
        C4014a.m15200f(this.f6219d == null);
        if (this.f6216a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f6216a.pollFirst();
        this.f6219d = pollFirst;
        return pollFirst;
    }

    @Override // p304v3.InterfaceC5107d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC1558m mo6342b() {
        AbstractC1558m abstractC1558m;
        if (this.f6217b.isEmpty()) {
            return null;
        }
        while (!this.f6218c.isEmpty() && ((b) C4041n0.m15463j(this.f6218c.peek())).f19286l <= this.f6220e) {
            b bVar = (b) C4041n0.m15463j(this.f6218c.poll());
            if (bVar.m20748q()) {
                abstractC1558m = (AbstractC1558m) C4041n0.m15463j(this.f6217b.pollFirst());
                abstractC1558m.m20743i(4);
            } else {
                mo6604f(bVar);
                if (mo6607k()) {
                    InterfaceC1553h mo6603e = mo6603e();
                    abstractC1558m = (AbstractC1558m) C4041n0.m15463j(this.f6217b.pollFirst());
                    abstractC1558m.m6367w(bVar.f19286l, mo6603e, Long.MAX_VALUE);
                } else {
                    m6670m(bVar);
                }
            }
            m6670m(bVar);
            return abstractC1558m;
        }
        return null;
    }

    /* renamed from: i */
    public final AbstractC1558m m6668i() {
        return this.f6217b.pollFirst();
    }

    /* renamed from: j */
    public final long m6669j() {
        return this.f6220e;
    }

    /* renamed from: k */
    public abstract boolean mo6607k();

    @Override // p304v3.InterfaceC5107d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo6344d(C1557l c1557l) {
        C4014a.m15195a(c1557l == this.f6219d);
        b bVar = (b) c1557l;
        if (bVar.m20747p()) {
            m6670m(bVar);
        } else {
            long j10 = this.f6221f;
            this.f6221f = 1 + j10;
            bVar.f6222q = j10;
            this.f6218c.add(bVar);
        }
        this.f6219d = null;
    }

    /* renamed from: m */
    public final void m6670m(b bVar) {
        bVar.mo6366l();
        this.f6216a.add(bVar);
    }

    /* renamed from: n */
    public void m6671n(AbstractC1558m abstractC1558m) {
        abstractC1558m.mo6366l();
        this.f6217b.add(abstractC1558m);
    }

    @Override // p304v3.InterfaceC5107d
    public void release() {
    }
}
