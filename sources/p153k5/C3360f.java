package p153k5;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import p107h5.C2336a;
import p107h5.C2337b;
import p107h5.C2338c;
import p107h5.C2339d;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: k5.f */
/* loaded from: classes.dex */
public final class C3360f {
    /* renamed from: a */
    public static void m12463a(Spannable spannable, int i10, int i11, C3361g c3361g, C3358d c3358d, Map<String, C3361g> map, int i12) {
        C3358d m12467e;
        Object c2337b;
        C3361g m12468f;
        Object absoluteSizeSpan;
        int i13;
        if (c3361g.m12491l() != -1) {
            spannable.setSpan(new StyleSpan(c3361g.m12491l()), i10, i11, 33);
        }
        if (c3361g.m12498s()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (c3361g.m12499t()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (c3361g.m12496q()) {
            C2338c.m9510a(spannable, new ForegroundColorSpan(c3361g.m12482c()), i10, i11, 33);
        }
        if (c3361g.m12495p()) {
            C2338c.m9510a(spannable, new BackgroundColorSpan(c3361g.m12481b()), i10, i11, 33);
        }
        if (c3361g.m12483d() != null) {
            C2338c.m9510a(spannable, new TypefaceSpan(c3361g.m12483d()), i10, i11, 33);
        }
        if (c3361g.m12494o() != null) {
            C3356b c3356b = (C3356b) C4014a.m15199e(c3361g.m12494o());
            int i14 = c3356b.f11676a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = c3356b.f11677b;
            }
            int i15 = c3356b.f11678c;
            if (i15 == -2) {
                i15 = 1;
            }
            C2338c.m9510a(spannable, new C2339d(i14, i13, i15), i10, i11, 33);
        }
        int m12489j = c3361g.m12489j();
        if (m12489j == 2) {
            C3358d m12466d = m12466d(c3358d, map);
            if (m12466d != null && (m12467e = m12467e(m12466d, map)) != null) {
                if (m12467e.m12454g() != 1 || m12467e.m12453f(0).f11697b == null) {
                    C4046r.m15526f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) C4041n0.m15463j(m12467e.m12453f(0).f11697b);
                    C3361g m12468f2 = m12468f(m12467e.f11701f, m12467e.m12458l(), map);
                    int m12488i = m12468f2 != null ? m12468f2.m12488i() : -1;
                    if (m12488i == -1 && (m12468f = m12468f(m12466d.f11701f, m12466d.m12458l(), map)) != null) {
                        m12488i = m12468f.m12488i();
                    }
                    c2337b = new C2337b(str, m12488i);
                    spannable.setSpan(c2337b, i10, i11, 33);
                }
            }
        } else if (m12489j == 3 || m12489j == 4) {
            c2337b = new C3355a();
            spannable.setSpan(c2337b, i10, i11, 33);
        }
        if (c3361g.m12493n()) {
            C2338c.m9510a(spannable, new C2336a(), i10, i11, 33);
        }
        int m12485f = c3361g.m12485f();
        if (m12485f == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) c3361g.m12484e(), true);
        } else if (m12485f == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(c3361g.m12484e());
        } else if (m12485f != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(c3361g.m12484e() / 100.0f);
        }
        C2338c.m9510a(spannable, absoluteSizeSpan, i10, i11, 33);
    }

    /* renamed from: b */
    public static String m12464b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* renamed from: c */
    public static void m12465c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    /* renamed from: d */
    public static C3358d m12466d(C3358d c3358d, Map<String, C3361g> map) {
        while (c3358d != null) {
            C3361g m12468f = m12468f(c3358d.f11701f, c3358d.m12458l(), map);
            if (m12468f != null && m12468f.m12489j() == 1) {
                return c3358d;
            }
            c3358d = c3358d.f11705j;
        }
        return null;
    }

    /* renamed from: e */
    public static C3358d m12467e(C3358d c3358d, Map<String, C3361g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c3358d);
        while (!arrayDeque.isEmpty()) {
            C3358d c3358d2 = (C3358d) arrayDeque.pop();
            C3361g m12468f = m12468f(c3358d2.f11701f, c3358d2.m12458l(), map);
            if (m12468f != null && m12468f.m12489j() == 3) {
                return c3358d2;
            }
            for (int m12454g = c3358d2.m12454g() - 1; m12454g >= 0; m12454g--) {
                arrayDeque.push(c3358d2.m12453f(m12454g));
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C3361g m12468f(C3361g c3361g, String[] strArr, Map<String, C3361g> map) {
        int i10 = 0;
        if (c3361g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C3361g c3361g2 = new C3361g();
                int length = strArr.length;
                while (i10 < length) {
                    c3361g2.m12480a(map.get(strArr[i10]));
                    i10++;
                }
                return c3361g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return c3361g.m12480a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    c3361g.m12480a(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return c3361g;
    }
}
