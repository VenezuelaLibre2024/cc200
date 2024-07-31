package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* renamed from: androidx.emoji2.text.o */
/* loaded from: classes.dex */
public final class C0271o extends AbstractC0265i {

    /* renamed from: m */
    public static Paint f1293m;

    public C0271o(C0263g c0263g) {
        super(c0263g);
    }

    /* renamed from: c */
    public static Paint m1342c() {
        if (f1293m == null) {
            TextPaint textPaint = new TextPaint();
            f1293m = textPaint;
            textPaint.setColor(C0261e.m1242b().m1247c());
            f1293m.setStyle(Paint.Style.FILL);
        }
        return f1293m;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (C0261e.m1242b().m1249i()) {
            canvas.drawRect(f10, i12, f10 + m1301b(), i14, m1342c());
        }
        m1300a().m1271a(canvas, f10, i13, paint);
    }
}
