package p162l;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0192e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p162l.AbstractC3391b;

/* renamed from: l.e */
/* loaded from: classes.dex */
public class C3394e extends AbstractC3391b implements C0192e.a {

    /* renamed from: j */
    public Context f11837j;

    /* renamed from: k */
    public ActionBarContextView f11838k;

    /* renamed from: l */
    public AbstractC3391b.a f11839l;

    /* renamed from: m */
    public WeakReference<View> f11840m;

    /* renamed from: n */
    public boolean f11841n;

    /* renamed from: o */
    public boolean f11842o;

    /* renamed from: p */
    public C0192e f11843p;

    public C3394e(Context context, ActionBarContextView actionBarContextView, AbstractC3391b.a aVar, boolean z10) {
        this.f11837j = context;
        this.f11838k = actionBarContextView;
        this.f11839l = aVar;
        C0192e m773S = new C0192e(actionBarContextView.getContext()).m773S(1);
        this.f11843p = m773S;
        m773S.mo772R(this);
        this.f11842o = z10;
    }

    @Override // androidx.appcompat.view.menu.C0192e.a
    /* renamed from: a */
    public boolean mo810a(C0192e c0192e, MenuItem menuItem) {
        return this.f11839l.mo9128d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0192e.a
    /* renamed from: b */
    public void mo811b(C0192e c0192e) {
        mo9225k();
        this.f11838k.m870l();
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: c */
    public void mo9219c() {
        if (this.f11841n) {
            return;
        }
        this.f11841n = true;
        this.f11839l.mo9127c(this);
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: d */
    public View mo9220d() {
        WeakReference<View> weakReference = this.f11840m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: e */
    public Menu mo9221e() {
        return this.f11843p;
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: f */
    public MenuInflater mo9222f() {
        return new C3396g(this.f11838k.getContext());
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: g */
    public CharSequence mo9223g() {
        return this.f11838k.getSubtitle();
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: i */
    public CharSequence mo9224i() {
        return this.f11838k.getTitle();
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: k */
    public void mo9225k() {
        this.f11839l.mo9126b(this, this.f11843p);
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: l */
    public boolean mo9226l() {
        return this.f11838k.m868j();
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: m */
    public void mo9227m(View view) {
        this.f11838k.setCustomView(view);
        this.f11840m = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: n */
    public void mo9228n(int i10) {
        mo9229o(this.f11837j.getString(i10));
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: o */
    public void mo9229o(CharSequence charSequence) {
        this.f11838k.setSubtitle(charSequence);
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: q */
    public void mo9230q(int i10) {
        mo9231r(this.f11837j.getString(i10));
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: r */
    public void mo9231r(CharSequence charSequence) {
        this.f11838k.setTitle(charSequence);
    }

    @Override // p162l.AbstractC3391b
    /* renamed from: s */
    public void mo9232s(boolean z10) {
        super.mo9232s(z10);
        this.f11838k.setTitleOptional(z10);
    }
}
