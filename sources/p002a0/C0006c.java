package p002a0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import p133j0.C3204c;

/* renamed from: a0.c */
/* loaded from: classes.dex */
public final class C0006c {

    /* renamed from: a */
    public static final ThreadLocal<C3204c<Rect, Rect>> f10a = new ThreadLocal<>();

    /* renamed from: a0.c$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static boolean m20a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: a */
    public static boolean m18a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.m20a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f10 = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i10 = 0;
            while (i10 < length) {
                int charCount = Character.charCount(str.codePointAt(i10)) + i10;
                f10 += paint.measureText(str, i10, charCount);
                i10 = charCount;
            }
            if (measureText3 >= f10) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        C3204c<Rect, Rect> m19b = m19b();
        paint.getTextBounds("\udfffd", 0, 2, m19b.f11097a);
        paint.getTextBounds(str, 0, length, m19b.f11098b);
        return !m19b.f11097a.equals(m19b.f11098b);
    }

    /* renamed from: b */
    public static C3204c<Rect, Rect> m19b() {
        ThreadLocal<C3204c<Rect, Rect>> threadLocal = f10a;
        C3204c<Rect, Rect> c3204c = threadLocal.get();
        if (c3204c == null) {
            C3204c<Rect, Rect> c3204c2 = new C3204c<>(new Rect(), new Rect());
            threadLocal.set(c3204c2);
            return c3204c2;
        }
        c3204c.f11097a.setEmpty();
        c3204c.f11098b.setEmpty();
        return c3204c;
    }
}
