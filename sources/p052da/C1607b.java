package p052da;

import android.view.View;
import p052da.AbstractC1606a;
import p336x6.C5629c;
import p367z6.C6020m;
import p367z6.C6022n;

/* renamed from: da.b */
/* loaded from: classes.dex */
public class C1607b extends AbstractC1606a<C6020m, a> implements C5629c.f, C5629c.j, C5629c.k, C5629c.a, C5629c.g {

    /* renamed from: da.b$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC1606a.b {

        /* renamed from: c */
        public C5629c.f f5937c;

        /* renamed from: d */
        public C5629c.g f5938d;

        /* renamed from: e */
        public C5629c.j f5939e;

        /* renamed from: f */
        public C5629c.k f5940f;

        /* renamed from: g */
        public C5629c.a f5941g;

        public a() {
            super();
        }

        /* renamed from: i */
        public C6020m m6452i(C6022n c6022n) {
            C6020m m22642b = C1607b.this.f5931h.m22642b(c6022n);
            super.m6440a(m22642b);
            return m22642b;
        }

        /* renamed from: j */
        public boolean m6453j(C6020m c6020m) {
            return super.m6442c(c6020m);
        }

        /* renamed from: k */
        public void m6454k(C5629c.f fVar) {
            this.f5937c = fVar;
        }

        /* renamed from: l */
        public void m6455l(C5629c.g gVar) {
            this.f5938d = gVar;
        }

        /* renamed from: m */
        public void m6456m(C5629c.j jVar) {
            this.f5939e = jVar;
        }

        /* renamed from: n */
        public void m6457n(C5629c.k kVar) {
            this.f5940f = kVar;
        }
    }

    public C1607b(C5629c c5629c) {
        super(c5629c);
    }

    @Override // p336x6.C5629c.a
    /* renamed from: a */
    public View mo6443a(C6020m c6020m) {
        a aVar = (a) this.f5933j.get(c6020m);
        if (aVar == null || aVar.f5941g == null) {
            return null;
        }
        return aVar.f5941g.mo6443a(c6020m);
    }

    @Override // p336x6.C5629c.g
    /* renamed from: b */
    public void mo4189b(C6020m c6020m) {
        a aVar = (a) this.f5933j.get(c6020m);
        if (aVar == null || aVar.f5938d == null) {
            return;
        }
        aVar.f5938d.mo4189b(c6020m);
    }

    @Override // p336x6.C5629c.a
    /* renamed from: c */
    public View mo6444c(C6020m c6020m) {
        a aVar = (a) this.f5933j.get(c6020m);
        if (aVar == null || aVar.f5941g == null) {
            return null;
        }
        return aVar.f5941g.mo6444c(c6020m);
    }

    @Override // p052da.AbstractC1606a
    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo6437d(C6020m c6020m) {
        return super.mo6437d(c6020m);
    }

    @Override // p052da.AbstractC1606a
    /* renamed from: f */
    public void mo6439f() {
        C5629c c5629c = this.f5931h;
        if (c5629c != null) {
            c5629c.m22629C(this);
            this.f5931h.m22630D(this);
            this.f5931h.m22633G(this);
            this.f5931h.m22634H(this);
            this.f5931h.m22658r(this);
        }
    }

    /* renamed from: g */
    public a m6445g() {
        return new a();
    }

    @Override // p052da.AbstractC1606a
    /* renamed from: h */
    public void mo6438e(C6020m c6020m) {
        c6020m.m24128g();
    }

    @Override // p336x6.C5629c.f
    public void onInfoWindowClick(C6020m c6020m) {
        a aVar = (a) this.f5933j.get(c6020m);
        if (aVar == null || aVar.f5937c == null) {
            return;
        }
        aVar.f5937c.onInfoWindowClick(c6020m);
    }

    @Override // p336x6.C5629c.j
    public boolean onMarkerClick(C6020m c6020m) {
        a aVar = (a) this.f5933j.get(c6020m);
        if (aVar == null || aVar.f5939e == null) {
            return false;
        }
        return aVar.f5939e.onMarkerClick(c6020m);
    }

    @Override // p336x6.C5629c.k
    public void onMarkerDrag(C6020m c6020m) {
        a aVar = (a) this.f5933j.get(c6020m);
        if (aVar == null || aVar.f5940f == null) {
            return;
        }
        aVar.f5940f.onMarkerDrag(c6020m);
    }

    @Override // p336x6.C5629c.k
    public void onMarkerDragEnd(C6020m c6020m) {
        a aVar = (a) this.f5933j.get(c6020m);
        if (aVar == null || aVar.f5940f == null) {
            return;
        }
        aVar.f5940f.onMarkerDragEnd(c6020m);
    }

    @Override // p336x6.C5629c.k
    public void onMarkerDragStart(C6020m c6020m) {
        a aVar = (a) this.f5933j.get(c6020m);
        if (aVar == null || aVar.f5940f == null) {
            return;
        }
        aVar.f5940f.onMarkerDragStart(c6020m);
    }
}
