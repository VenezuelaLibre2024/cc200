package p119i0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p133j0.C3203b;

/* renamed from: i0.c */
/* loaded from: classes.dex */
public class C2575c implements Spannable {

    /* renamed from: k */
    public static final Object f10109k = new Object();

    /* renamed from: h */
    public final Spannable f10110h;

    /* renamed from: i */
    public final a f10111i;

    /* renamed from: j */
    public final PrecomputedText f10112j;

    /* renamed from: i0.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextPaint f10113a;

        /* renamed from: b */
        public final TextDirectionHeuristic f10114b;

        /* renamed from: c */
        public final int f10115c;

        /* renamed from: d */
        public final int f10116d;

        /* renamed from: e */
        public final PrecomputedText.Params f10117e;

        /* renamed from: i0.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6185a {

            /* renamed from: a */
            public final TextPaint f10118a;

            /* renamed from: b */
            public TextDirectionHeuristic f10119b;

            /* renamed from: c */
            public int f10120c;

            /* renamed from: d */
            public int f10121d;

            public C6185a(TextPaint textPaint) {
                this.f10118a = textPaint;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                    this.f10120c = 1;
                    this.f10121d = 1;
                } else {
                    this.f10121d = 0;
                    this.f10120c = 0;
                }
                this.f10119b = i10 >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            /* renamed from: a */
            public a m10315a() {
                return new a(this.f10118a, this.f10119b, this.f10120c, this.f10121d);
            }

            /* renamed from: b */
            public C6185a m10316b(int i10) {
                this.f10120c = i10;
                return this;
            }

            /* renamed from: c */
            public C6185a m10317c(int i10) {
                this.f10121d = i10;
                return this;
            }

            /* renamed from: d */
            public C6185a m10318d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f10119b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f10113a = params.getTextPaint();
            this.f10114b = params.getTextDirection();
            this.f10115c = params.getBreakStrategy();
            this.f10116d = params.getHyphenationFrequency();
            this.f10117e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            this.f10117e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build() : null;
            this.f10113a = textPaint;
            this.f10114b = textDirectionHeuristic;
            this.f10115c = i10;
            this.f10116d = i11;
        }

        /* renamed from: a */
        public boolean m10310a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 >= 23 && (this.f10115c != aVar.m10311b() || this.f10116d != aVar.m10312c())) || this.f10113a.getTextSize() != aVar.m10314e().getTextSize() || this.f10113a.getTextScaleX() != aVar.m10314e().getTextScaleX() || this.f10113a.getTextSkewX() != aVar.m10314e().getTextSkewX()) {
                return false;
            }
            if ((i10 >= 21 && (this.f10113a.getLetterSpacing() != aVar.m10314e().getLetterSpacing() || !TextUtils.equals(this.f10113a.getFontFeatureSettings(), aVar.m10314e().getFontFeatureSettings()))) || this.f10113a.getFlags() != aVar.m10314e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f10113a.getTextLocales().equals(aVar.m10314e().getTextLocales())) {
                    return false;
                }
            } else if (i10 >= 17 && !this.f10113a.getTextLocale().equals(aVar.m10314e().getTextLocale())) {
                return false;
            }
            return this.f10113a.getTypeface() == null ? aVar.m10314e().getTypeface() == null : this.f10113a.getTypeface().equals(aVar.m10314e().getTypeface());
        }

        /* renamed from: b */
        public int m10311b() {
            return this.f10115c;
        }

        /* renamed from: c */
        public int m10312c() {
            return this.f10116d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m10313d() {
            return this.f10114b;
        }

        /* renamed from: e */
        public TextPaint m10314e() {
            return this.f10113a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (m10310a(aVar)) {
                return Build.VERSION.SDK_INT < 18 || this.f10114b == aVar.m10313d();
            }
            return false;
        }

        public int hashCode() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                return C3203b.m11400b(Float.valueOf(this.f10113a.getTextSize()), Float.valueOf(this.f10113a.getTextScaleX()), Float.valueOf(this.f10113a.getTextSkewX()), Float.valueOf(this.f10113a.getLetterSpacing()), Integer.valueOf(this.f10113a.getFlags()), this.f10113a.getTextLocales(), this.f10113a.getTypeface(), Boolean.valueOf(this.f10113a.isElegantTextHeight()), this.f10114b, Integer.valueOf(this.f10115c), Integer.valueOf(this.f10116d));
            }
            if (i10 >= 21) {
                return C3203b.m11400b(Float.valueOf(this.f10113a.getTextSize()), Float.valueOf(this.f10113a.getTextScaleX()), Float.valueOf(this.f10113a.getTextSkewX()), Float.valueOf(this.f10113a.getLetterSpacing()), Integer.valueOf(this.f10113a.getFlags()), this.f10113a.getTextLocale(), this.f10113a.getTypeface(), Boolean.valueOf(this.f10113a.isElegantTextHeight()), this.f10114b, Integer.valueOf(this.f10115c), Integer.valueOf(this.f10116d));
            }
            if (i10 < 18 && i10 < 17) {
                return C3203b.m11400b(Float.valueOf(this.f10113a.getTextSize()), Float.valueOf(this.f10113a.getTextScaleX()), Float.valueOf(this.f10113a.getTextSkewX()), Integer.valueOf(this.f10113a.getFlags()), this.f10113a.getTypeface(), this.f10114b, Integer.valueOf(this.f10115c), Integer.valueOf(this.f10116d));
            }
            return C3203b.m11400b(Float.valueOf(this.f10113a.getTextSize()), Float.valueOf(this.f10113a.getTextScaleX()), Float.valueOf(this.f10113a.getTextSkewX()), Integer.valueOf(this.f10113a.getFlags()), this.f10113a.getTextLocale(), this.f10113a.getTypeface(), this.f10114b, Integer.valueOf(this.f10115c), Integer.valueOf(this.f10116d));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00df  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 325
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p119i0.C2575c.a.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public a m10308a() {
        return this.f10111i;
    }

    /* renamed from: b */
    public PrecomputedText m10309b() {
        Spannable spannable = this.f10110h;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f10110h.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f10110h.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f10110h.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f10110h.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f10112j.getSpans(i10, i11, cls) : (T[]) this.f10110h.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f10110h.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f10110h.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f10112j.removeSpan(obj);
        } else {
            this.f10110h.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f10112j.setSpan(obj, i10, i11, i12);
        } else {
            this.f10110h.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f10110h.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f10110h.toString();
    }
}
