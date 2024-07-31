package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p314w0.C5191a;

/* renamed from: androidx.emoji2.text.g */
/* loaded from: classes.dex */
public class C0263g {

    /* renamed from: d */
    public static final ThreadLocal<C5191a> f1246d = new ThreadLocal<>();

    /* renamed from: a */
    public final int f1247a;

    /* renamed from: b */
    public final C0269m f1248b;

    /* renamed from: c */
    public volatile int f1249c = 0;

    public C0263g(C0269m c0269m, int i10) {
        this.f1248b = c0269m;
        this.f1247a = i10;
    }

    /* renamed from: a */
    public void m1271a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface m1325g = this.f1248b.m1325g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(m1325g);
        canvas.drawText(this.f1248b.m1321c(), this.f1247a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int m1272b(int i10) {
        return m1277g().m21013h(i10);
    }

    /* renamed from: c */
    public int m1273c() {
        return m1277g().m21014i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: d */
    public int m1274d() {
        return this.f1249c;
    }

    /* renamed from: e */
    public short m1275e() {
        return m1277g().m21016k();
    }

    /* renamed from: f */
    public int m1276f() {
        return m1277g().m21017l();
    }

    /* renamed from: g */
    public final C5191a m1277g() {
        ThreadLocal<C5191a> threadLocal = f1246d;
        C5191a c5191a = threadLocal.get();
        if (c5191a == null) {
            c5191a = new C5191a();
            threadLocal.set(c5191a);
        }
        this.f1248b.m1322d().m21024j(c5191a, this.f1247a);
        return c5191a;
    }

    /* renamed from: h */
    public short m1278h() {
        return m1277g().m21018m();
    }

    /* renamed from: i */
    public short m1279i() {
        return m1277g().m21019n();
    }

    /* renamed from: j */
    public boolean m1280j() {
        return m1277g().m21015j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: k */
    public void m1281k(boolean z10) {
        this.f1249c = z10 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(m1276f()));
        sb2.append(", codepoints:");
        int m1273c = m1273c();
        for (int i10 = 0; i10 < m1273c; i10++) {
            sb2.append(Integer.toHexString(m1272b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
