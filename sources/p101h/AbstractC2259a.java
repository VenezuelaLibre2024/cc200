package p101h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p089g.C1940j;
import p162l.AbstractC3391b;

/* renamed from: h.a */
/* loaded from: classes.dex */
public abstract class AbstractC2259a {

    /* renamed from: h.a$a */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f8914a;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f8914a = 0;
            this.f8914a = 8388627;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8914a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1940j.f7708t);
            this.f8914a = obtainStyledAttributes.getInt(C1940j.f7713u, 0);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8914a = 0;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f8914a = 0;
            this.f8914a = aVar.f8914a;
        }
    }

    /* renamed from: h.a$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m9024a(boolean z10);
    }

    @Deprecated
    /* renamed from: h.a$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        /* renamed from: a */
        public abstract CharSequence m9025a();

        /* renamed from: b */
        public abstract View m9026b();

        /* renamed from: c */
        public abstract Drawable m9027c();

        /* renamed from: d */
        public abstract CharSequence m9028d();

        /* renamed from: e */
        public abstract void m9029e();
    }

    /* renamed from: A */
    public AbstractC3391b mo9003A(AbstractC3391b.a aVar) {
        return null;
    }

    /* renamed from: g */
    public boolean mo9004g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo9005h();

    /* renamed from: i */
    public abstract void mo9006i(boolean z10);

    /* renamed from: j */
    public abstract int mo9007j();

    /* renamed from: k */
    public abstract Context mo9008k();

    /* renamed from: l */
    public abstract void mo9009l();

    /* renamed from: m */
    public boolean mo9010m() {
        return false;
    }

    /* renamed from: n */
    public abstract boolean mo9011n();

    /* renamed from: o */
    public void mo9012o(Configuration configuration) {
    }

    /* renamed from: p */
    public void mo9013p() {
    }

    /* renamed from: q */
    public abstract boolean mo9014q(int i10, KeyEvent keyEvent);

    /* renamed from: r */
    public boolean mo9015r(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: s */
    public boolean mo9016s() {
        return false;
    }

    /* renamed from: t */
    public abstract void mo9017t(Drawable drawable);

    /* renamed from: u */
    public abstract void mo9018u(boolean z10);

    /* renamed from: v */
    public abstract void mo9019v(boolean z10);

    /* renamed from: w */
    public abstract void mo9020w(boolean z10);

    /* renamed from: x */
    public abstract void mo9021x(CharSequence charSequence);

    /* renamed from: y */
    public abstract void mo9022y(CharSequence charSequence);

    /* renamed from: z */
    public abstract void mo9023z();
}
