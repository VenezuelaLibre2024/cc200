package p162l;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p148k0.C3320h0;
import p148k0.C3324j0;
import p148k0.InterfaceC3322i0;

/* renamed from: l.h */
/* loaded from: classes.dex */
public class C3397h {

    /* renamed from: c */
    public Interpolator f11893c;

    /* renamed from: d */
    public InterfaceC3322i0 f11894d;

    /* renamed from: e */
    public boolean f11895e;

    /* renamed from: b */
    public long f11892b = -1;

    /* renamed from: f */
    public final C3324j0 f11896f = new a();

    /* renamed from: a */
    public final ArrayList<C3320h0> f11891a = new ArrayList<>();

    /* renamed from: l.h$a */
    /* loaded from: classes.dex */
    public class a extends C3324j0 {

        /* renamed from: a */
        public boolean f11897a = false;

        /* renamed from: b */
        public int f11898b = 0;

        public a() {
        }

        @Override // p148k0.InterfaceC3322i0
        /* renamed from: b */
        public void mo1115b(View view) {
            int i10 = this.f11898b + 1;
            this.f11898b = i10;
            if (i10 == C3397h.this.f11891a.size()) {
                InterfaceC3322i0 interfaceC3322i0 = C3397h.this.f11894d;
                if (interfaceC3322i0 != null) {
                    interfaceC3322i0.mo1115b(null);
                }
                m12639d();
            }
        }

        @Override // p148k0.C3324j0, p148k0.InterfaceC3322i0
        /* renamed from: c */
        public void mo1116c(View view) {
            if (this.f11897a) {
                return;
            }
            this.f11897a = true;
            InterfaceC3322i0 interfaceC3322i0 = C3397h.this.f11894d;
            if (interfaceC3322i0 != null) {
                interfaceC3322i0.mo1116c(null);
            }
        }

        /* renamed from: d */
        public void m12639d() {
            this.f11898b = 0;
            this.f11897a = false;
            C3397h.this.m12632b();
        }
    }

    /* renamed from: a */
    public void m12631a() {
        if (this.f11895e) {
            Iterator<C3320h0> it = this.f11891a.iterator();
            while (it.hasNext()) {
                it.next().m12251c();
            }
            this.f11895e = false;
        }
    }

    /* renamed from: b */
    public void m12632b() {
        this.f11895e = false;
    }

    /* renamed from: c */
    public C3397h m12633c(C3320h0 c3320h0) {
        if (!this.f11895e) {
            this.f11891a.add(c3320h0);
        }
        return this;
    }

    /* renamed from: d */
    public C3397h m12634d(C3320h0 c3320h0, C3320h0 c3320h02) {
        this.f11891a.add(c3320h0);
        c3320h02.m12257j(c3320h0.m12252d());
        this.f11891a.add(c3320h02);
        return this;
    }

    /* renamed from: e */
    public C3397h m12635e(long j10) {
        if (!this.f11895e) {
            this.f11892b = j10;
        }
        return this;
    }

    /* renamed from: f */
    public C3397h m12636f(Interpolator interpolator) {
        if (!this.f11895e) {
            this.f11893c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C3397h m12637g(InterfaceC3322i0 interfaceC3322i0) {
        if (!this.f11895e) {
            this.f11894d = interfaceC3322i0;
        }
        return this;
    }

    /* renamed from: h */
    public void m12638h() {
        if (this.f11895e) {
            return;
        }
        Iterator<C3320h0> it = this.f11891a.iterator();
        while (it.hasNext()) {
            C3320h0 next = it.next();
            long j10 = this.f11892b;
            if (j10 >= 0) {
                next.m12253f(j10);
            }
            Interpolator interpolator = this.f11893c;
            if (interpolator != null) {
                next.m12254g(interpolator);
            }
            if (this.f11894d != null) {
                next.m12255h(this.f11896f);
            }
            next.m12259l();
        }
        this.f11895e = true;
    }
}
