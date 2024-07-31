package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.emoji2.text.C0261e;
import p002a0.C0006c;

/* renamed from: androidx.emoji2.text.d */
/* loaded from: classes.dex */
public class C0260d implements C0261e.d {

    /* renamed from: b */
    public static final ThreadLocal<StringBuilder> f1209b = new ThreadLocal<>();

    /* renamed from: a */
    public final TextPaint f1210a;

    public C0260d() {
        TextPaint textPaint = new TextPaint();
        this.f1210a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    public static StringBuilder m1239b() {
        ThreadLocal<StringBuilder> threadLocal = f1209b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.C0261e.d
    /* renamed from: a */
    public boolean mo1240a(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 23 && i12 > i13) {
            return false;
        }
        StringBuilder m1239b = m1239b();
        m1239b.setLength(0);
        while (i10 < i11) {
            m1239b.append(charSequence.charAt(i10));
            i10++;
        }
        return C0006c.m18a(this.f1210a, m1239b.toString());
    }
}
