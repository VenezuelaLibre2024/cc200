package p162l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: l.b */
/* loaded from: classes.dex */
public abstract class AbstractC3391b {

    /* renamed from: h */
    public Object f11829h;

    /* renamed from: i */
    public boolean f11830i;

    /* renamed from: l.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo9125a(AbstractC3391b abstractC3391b, Menu menu);

        /* renamed from: b */
        boolean mo9126b(AbstractC3391b abstractC3391b, Menu menu);

        /* renamed from: c */
        void mo9127c(AbstractC3391b abstractC3391b);

        /* renamed from: d */
        boolean mo9128d(AbstractC3391b abstractC3391b, MenuItem menuItem);
    }

    /* renamed from: c */
    public abstract void mo9219c();

    /* renamed from: d */
    public abstract View mo9220d();

    /* renamed from: e */
    public abstract Menu mo9221e();

    /* renamed from: f */
    public abstract MenuInflater mo9222f();

    /* renamed from: g */
    public abstract CharSequence mo9223g();

    /* renamed from: h */
    public Object m12607h() {
        return this.f11829h;
    }

    /* renamed from: i */
    public abstract CharSequence mo9224i();

    /* renamed from: j */
    public boolean m12608j() {
        return this.f11830i;
    }

    /* renamed from: k */
    public abstract void mo9225k();

    /* renamed from: l */
    public abstract boolean mo9226l();

    /* renamed from: m */
    public abstract void mo9227m(View view);

    /* renamed from: n */
    public abstract void mo9228n(int i10);

    /* renamed from: o */
    public abstract void mo9229o(CharSequence charSequence);

    /* renamed from: p */
    public void m12609p(Object obj) {
        this.f11829h = obj;
    }

    /* renamed from: q */
    public abstract void mo9230q(int i10);

    /* renamed from: r */
    public abstract void mo9231r(CharSequence charSequence);

    /* renamed from: s */
    public void mo9232s(boolean z10) {
        this.f11830i = z10;
    }
}
