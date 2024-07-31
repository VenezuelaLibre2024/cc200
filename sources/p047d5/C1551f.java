package p047d5;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import p126i7.AbstractC2651u;
import p222p5.C4014a;

/* renamed from: d5.f */
/* loaded from: classes.dex */
public final class C1551f implements InterfaceC1554i {

    /* renamed from: a */
    public final C1548c f5822a = new C1548c();

    /* renamed from: b */
    public final C1557l f5823b = new C1557l();

    /* renamed from: c */
    public final Deque<AbstractC1558m> f5824c = new ArrayDeque();

    /* renamed from: d */
    public int f5825d;

    /* renamed from: e */
    public boolean f5826e;

    /* renamed from: d5.f$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC1558m {
        public a() {
        }

        @Override // p304v3.AbstractC5111h
        /* renamed from: v */
        public void mo6349v() {
            C1551f.this.m6348i(this);
        }
    }

    /* renamed from: d5.f$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC1553h {

        /* renamed from: h */
        public final long f5828h;

        /* renamed from: i */
        public final AbstractC2651u<C1547b> f5829i;

        public b(long j10, AbstractC2651u<C1547b> abstractC2651u) {
            this.f5828h = j10;
            this.f5829i = abstractC2651u;
        }

        @Override // p047d5.InterfaceC1553h
        /* renamed from: b */
        public int mo6350b(long j10) {
            return this.f5828h > j10 ? 0 : -1;
        }

        @Override // p047d5.InterfaceC1553h
        /* renamed from: c */
        public long mo6351c(int i10) {
            C4014a.m15195a(i10 == 0);
            return this.f5828h;
        }

        @Override // p047d5.InterfaceC1553h
        /* renamed from: f */
        public List<C1547b> mo6352f(long j10) {
            return j10 >= this.f5828h ? this.f5829i : AbstractC2651u.m10770u();
        }

        @Override // p047d5.InterfaceC1553h
        /* renamed from: h */
        public int mo6353h() {
            return 1;
        }
    }

    public C1551f() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f5824c.addFirst(new a());
        }
        this.f5825d = 0;
    }

    @Override // p047d5.InterfaceC1554i
    /* renamed from: a */
    public void mo6341a(long j10) {
    }

    @Override // p304v3.InterfaceC5107d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1557l mo6343c() {
        C4014a.m15200f(!this.f5826e);
        if (this.f5825d != 0) {
            return null;
        }
        this.f5825d = 1;
        return this.f5823b;
    }

    @Override // p304v3.InterfaceC5107d
    public void flush() {
        C4014a.m15200f(!this.f5826e);
        this.f5823b.mo6366l();
        this.f5825d = 0;
    }

    @Override // p304v3.InterfaceC5107d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC1558m mo6342b() {
        C4014a.m15200f(!this.f5826e);
        if (this.f5825d != 2 || this.f5824c.isEmpty()) {
            return null;
        }
        AbstractC1558m removeFirst = this.f5824c.removeFirst();
        if (this.f5823b.m20748q()) {
            removeFirst.m20743i(4);
        } else {
            C1557l c1557l = this.f5823b;
            removeFirst.m6367w(this.f5823b.f19286l, new b(c1557l.f19286l, this.f5822a.m6337a(((ByteBuffer) C4014a.m15199e(c1557l.f19284j)).array())), 0L);
        }
        this.f5823b.mo6366l();
        this.f5825d = 0;
        return removeFirst;
    }

    @Override // p304v3.InterfaceC5107d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo6344d(C1557l c1557l) {
        C4014a.m15200f(!this.f5826e);
        C4014a.m15200f(this.f5825d == 1);
        C4014a.m15195a(this.f5823b == c1557l);
        this.f5825d = 2;
    }

    /* renamed from: i */
    public final void m6348i(AbstractC1558m abstractC1558m) {
        C4014a.m15200f(this.f5824c.size() < 2);
        C4014a.m15195a(!this.f5824c.contains(abstractC1558m));
        abstractC1558m.mo6366l();
        this.f5824c.addFirst(abstractC1558m);
    }

    @Override // p304v3.InterfaceC5107d
    public void release() {
        this.f5826e = true;
    }
}
