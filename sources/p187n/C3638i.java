package p187n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import p015b0.C0436a;
import p188n0.C3677d;

/* renamed from: n.i */
/* loaded from: classes.dex */
public class C3638i {

    /* renamed from: a */
    public final CompoundButton f12860a;

    /* renamed from: b */
    public ColorStateList f12861b = null;

    /* renamed from: c */
    public PorterDuff.Mode f12862c = null;

    /* renamed from: d */
    public boolean f12863d = false;

    /* renamed from: e */
    public boolean f12864e = false;

    /* renamed from: f */
    public boolean f12865f;

    public C3638i(CompoundButton compoundButton) {
        this.f12860a = compoundButton;
    }

    /* renamed from: a */
    public void m13515a() {
        Drawable m13811a = C3677d.m13811a(this.f12860a);
        if (m13811a != null) {
            if (this.f12863d || this.f12864e) {
                Drawable mutate = C0436a.m2265p(m13811a).mutate();
                if (this.f12863d) {
                    C0436a.m2263n(mutate, this.f12861b);
                }
                if (this.f12864e) {
                    C0436a.m2264o(mutate, this.f12862c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f12860a.getDrawableState());
                }
                this.f12860a.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public int m13516b(int i10) {
        Drawable m13811a;
        return (Build.VERSION.SDK_INT >= 17 || (m13811a = C3677d.m13811a(this.f12860a)) == null) ? i10 : i10 + m13811a.getIntrinsicWidth();
    }

    /* renamed from: c */
    public ColorStateList m13517c() {
        return this.f12861b;
    }

    /* renamed from: d */
    public PorterDuff.Mode m13518d() {
        return this.f12862c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m13519e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f12860a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p089g.C1940j.f7590U0
            r8 = 0
            n.w0 r0 = p187n.C3667w0.m13717u(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f12860a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.m13734q()
            r7 = 0
            r4 = r10
            r6 = r11
            p148k0.C3308b0.m12007U(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p089g.C1940j.f7598W0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m13735r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.m13730m(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CompoundButton r11 = r9.f12860a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p118i.C2572a.m10278b(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = r8
        L3b:
            if (r10 != 0) goto L58
            int r10 = p089g.C1940j.f7594V0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m13735r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.m13730m(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CompoundButton r11 = r9.f12860a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p118i.C2572a.m10278b(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = p089g.C1940j.f7602X0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m13735r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CompoundButton r11 = r9.f12860a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.m13720c(r10)     // Catch: java.lang.Throwable -> L84
            p188n0.C3677d.m13812b(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = p089g.C1940j.f7606Y0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m13735r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CompoundButton r11 = r9.f12860a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.m13727j(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = p187n.C3637h0.m13514d(r10, r1)     // Catch: java.lang.Throwable -> L84
            p188n0.C3677d.m13813c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.m13736v()
            return
        L84:
            r10 = move-exception
            r0.m13736v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p187n.C3638i.m13519e(android.util.AttributeSet, int):void");
    }

    /* renamed from: f */
    public void m13520f() {
        if (this.f12865f) {
            this.f12865f = false;
        } else {
            this.f12865f = true;
            m13515a();
        }
    }

    /* renamed from: g */
    public void m13521g(ColorStateList colorStateList) {
        this.f12861b = colorStateList;
        this.f12863d = true;
        m13515a();
    }

    /* renamed from: h */
    public void m13522h(PorterDuff.Mode mode) {
        this.f12862c = mode;
        this.f12864e = true;
        m13515a();
    }
}
