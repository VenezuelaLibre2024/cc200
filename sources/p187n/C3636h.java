package p187n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import p015b0.C0436a;
import p188n0.C3676c;

/* renamed from: n.h */
/* loaded from: classes.dex */
public class C3636h {

    /* renamed from: a */
    public final CheckedTextView f12851a;

    /* renamed from: b */
    public ColorStateList f12852b = null;

    /* renamed from: c */
    public PorterDuff.Mode f12853c = null;

    /* renamed from: d */
    public boolean f12854d = false;

    /* renamed from: e */
    public boolean f12855e = false;

    /* renamed from: f */
    public boolean f12856f;

    public C3636h(CheckedTextView checkedTextView) {
        this.f12851a = checkedTextView;
    }

    /* renamed from: a */
    public void m13504a() {
        Drawable m13804a = C3676c.m13804a(this.f12851a);
        if (m13804a != null) {
            if (this.f12854d || this.f12855e) {
                Drawable mutate = C0436a.m2265p(m13804a).mutate();
                if (this.f12854d) {
                    C0436a.m2263n(mutate, this.f12852b);
                }
                if (this.f12855e) {
                    C0436a.m2264o(mutate, this.f12853c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f12851a.getDrawableState());
                }
                this.f12851a.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public ColorStateList m13505b() {
        return this.f12852b;
    }

    /* renamed from: c */
    public PorterDuff.Mode m13506c() {
        return this.f12853c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:2:0x001d }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m13507d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f12851a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p089g.C1940j.f7570P0
            r8 = 0
            n.w0 r0 = p187n.C3667w0.m13717u(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f12851a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.m13734q()
            r7 = 0
            r4 = r10
            r6 = r11
            p148k0.C3308b0.m12007U(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p089g.C1940j.f7578R0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m13735r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.m13730m(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CheckedTextView r11 = r9.f12851a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p118i.C2572a.m10278b(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setCheckMarkDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = r8
        L3b:
            if (r10 != 0) goto L58
            int r10 = p089g.C1940j.f7574Q0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m13735r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.m13730m(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CheckedTextView r11 = r9.f12851a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = p118i.C2572a.m10278b(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setCheckMarkDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = p089g.C1940j.f7582S0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m13735r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CheckedTextView r11 = r9.f12851a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.m13720c(r10)     // Catch: java.lang.Throwable -> L84
            p188n0.C3676c.m13805b(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = p089g.C1940j.f7586T0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.m13735r(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CheckedTextView r11 = r9.f12851a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.m13727j(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = p187n.C3637h0.m13514d(r10, r1)     // Catch: java.lang.Throwable -> L84
            p188n0.C3676c.m13806c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.m13736v()
            return
        L84:
            r10 = move-exception
            r0.m13736v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p187n.C3636h.m13507d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public void m13508e() {
        if (this.f12856f) {
            this.f12856f = false;
        } else {
            this.f12856f = true;
            m13504a();
        }
    }

    /* renamed from: f */
    public void m13509f(ColorStateList colorStateList) {
        this.f12852b = colorStateList;
        this.f12854d = true;
        m13504a();
    }

    /* renamed from: g */
    public void m13510g(PorterDuff.Mode mode) {
        this.f12853c = mode;
        this.f12855e = true;
        m13504a();
    }
}
