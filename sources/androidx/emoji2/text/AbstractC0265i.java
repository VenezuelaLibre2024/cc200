package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import p133j0.C3205d;

/* renamed from: androidx.emoji2.text.i */
/* loaded from: classes.dex */
public abstract class AbstractC0265i extends ReplacementSpan {

    /* renamed from: i */
    public final C0263g f1264i;

    /* renamed from: h */
    public final Paint.FontMetricsInt f1263h = new Paint.FontMetricsInt();

    /* renamed from: j */
    public short f1265j = -1;

    /* renamed from: k */
    public short f1266k = -1;

    /* renamed from: l */
    public float f1267l = 1.0f;

    public AbstractC0265i(C0263g c0263g) {
        C3205d.m11415k(c0263g, "metadata cannot be null");
        this.f1264i = c0263g;
    }

    /* renamed from: a */
    public final C0263g m1300a() {
        return this.f1264i;
    }

    /* renamed from: b */
    public final int m1301b() {
        return this.f1265j;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f1263h);
        Paint.FontMetricsInt fontMetricsInt2 = this.f1263h;
        this.f1267l = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f1264i.m1275e();
        this.f1266k = (short) (this.f1264i.m1275e() * this.f1267l);
        short m1279i = (short) (this.f1264i.m1279i() * this.f1267l);
        this.f1265j = m1279i;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f1263h;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return m1279i;
    }
}
