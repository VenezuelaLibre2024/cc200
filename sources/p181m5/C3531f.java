package p181m5;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.journeyapps.barcodescanner.C1393b;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p047d5.C1547b;
import p107h5.C2337b;
import p181m5.C3531f;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: m5.f */
/* loaded from: classes.dex */
public final class C3531f {

    /* renamed from: a */
    public static final Pattern f12387a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    public static final Pattern f12388b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    public static final Map<String, Integer> f12389c;

    /* renamed from: d */
    public static final Map<String, Integer> f12390d;

    /* renamed from: m5.f$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c */
        public static final Comparator<b> f12391c = new Comparator() { // from class: m5.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m13153e;
                m13153e = C3531f.b.m13153e((C3531f.b) obj, (C3531f.b) obj2);
                return m13153e;
            }
        };

        /* renamed from: a */
        public final c f12392a;

        /* renamed from: b */
        public final int f12393b;

        public b(c cVar, int i10) {
            this.f12392a = cVar;
            this.f12393b = i10;
        }

        /* renamed from: e */
        public static /* synthetic */ int m13153e(b bVar, b bVar2) {
            return Integer.compare(bVar.f12392a.f12395b, bVar2.f12392a.f12395b);
        }
    }

    /* renamed from: m5.f$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final String f12394a;

        /* renamed from: b */
        public final int f12395b;

        /* renamed from: c */
        public final String f12396c;

        /* renamed from: d */
        public final Set<String> f12397d;

        public c(String str, int i10, String str2, Set<String> set) {
            this.f12395b = i10;
            this.f12394a = str;
            this.f12396c = str2;
            this.f12397d = set;
        }

        /* renamed from: a */
        public static c m13154a(String str, int i10) {
            String str2;
            String trim = str.trim();
            C4014a.m15195a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] m15426Q0 = C4041n0.m15426Q0(trim, "\\.");
            String str3 = m15426Q0[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < m15426Q0.length; i11++) {
                hashSet.add(m15426Q0[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        /* renamed from: b */
        public static c m13155b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* renamed from: m5.f$d */
    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: h */
        public final int f12398h;

        /* renamed from: i */
        public final C3529d f12399i;

        public d(int i10, C3529d c3529d) {
            this.f12398h = i10;
            this.f12399i = c3529d;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f12398h, dVar.f12398h);
        }
    }

    /* renamed from: m5.f$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: c */
        public CharSequence f12402c;

        /* renamed from: a */
        public long f12400a = 0;

        /* renamed from: b */
        public long f12401b = 0;

        /* renamed from: d */
        public int f12403d = 2;

        /* renamed from: e */
        public float f12404e = -3.4028235E38f;

        /* renamed from: f */
        public int f12405f = 1;

        /* renamed from: g */
        public int f12406g = 0;

        /* renamed from: h */
        public float f12407h = -3.4028235E38f;

        /* renamed from: i */
        public int f12408i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f12409j = 1.0f;

        /* renamed from: k */
        public int f12410k = Integer.MIN_VALUE;

        /* renamed from: b */
        public static float m13157b(float f10, int i10) {
            if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return f10 != -3.4028235E38f ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        /* renamed from: c */
        public static Layout.Alignment m13158c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            C4046r.m15529i("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* renamed from: d */
        public static float m13159d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        /* renamed from: e */
        public static float m13160e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public static int m13161f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        /* renamed from: a */
        public C3530e m13162a() {
            return new C3530e(m13163g().m6318a(), this.f12400a, this.f12401b);
        }

        /* renamed from: g */
        public C1547b.b m13163g() {
            float f10 = this.f12407h;
            if (f10 == -3.4028235E38f) {
                f10 = m13160e(this.f12403d);
            }
            int i10 = this.f12408i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = m13161f(this.f12403d);
            }
            C1547b.b m6335r = new C1547b.b().m6333p(m13158c(this.f12403d)).m6325h(m13157b(this.f12404e, this.f12405f), this.f12405f).m6326i(this.f12406g).m6328k(f10).m6329l(i10).m6331n(Math.min(this.f12409j, m13159d(i10, f10))).m6335r(this.f12410k);
            CharSequence charSequence = this.f12402c;
            if (charSequence != null) {
                m6335r.m6332o(charSequence);
            }
            return m6335r;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f12389c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f12390d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static void m13126a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        Object foregroundColorSpan;
        for (String str : set) {
            Map<String, Integer> map = f12389c;
            if (map.containsKey(str)) {
                foregroundColorSpan = new ForegroundColorSpan(map.get(str).intValue());
            } else {
                Map<String, Integer> map2 = f12390d;
                if (map2.containsKey(str)) {
                    foregroundColorSpan = new BackgroundColorSpan(map2.get(str).intValue());
                }
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i10, i11, 33);
        }
    }

    /* renamed from: b */
    public static void m13127b(String str, SpannableStringBuilder spannableStringBuilder) {
        char c10;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c11 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c11 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c11 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                c10 = '>';
                break;
            case 1:
                c10 = '<';
                break;
            case 2:
                c10 = '&';
                break;
            case 3:
                c10 = ' ';
                break;
            default:
                C4046r.m15529i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c10);
    }

    /* renamed from: c */
    public static void m13128c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<C3529d> list2) {
        int m13134i = m13134i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f12391c);
        int i10 = cVar.f12395b;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if ("rt".equals(((b) arrayList.get(i12)).f12392a.f12394a)) {
                b bVar = (b) arrayList.get(i12);
                int m13132g = m13132g(m13134i(list2, str, bVar.f12392a), m13134i, 1);
                int i13 = bVar.f12392a.f12395b - i11;
                int i14 = bVar.f12393b - i11;
                CharSequence subSequence = spannableStringBuilder.subSequence(i13, i14);
                spannableStringBuilder.delete(i13, i14);
                spannableStringBuilder.setSpan(new C2337b(subSequence.toString(), m13132g), i10, i13, 33);
                i11 += subSequence.length();
                i10 = i13;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0071. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[LOOP:0: B:38:0x0097->B:40:0x009d, LOOP_END] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m13129d(java.lang.String r8, p181m5.C3531f.c r9, java.util.List<p181m5.C3531f.b> r10, android.text.SpannableStringBuilder r11, java.util.List<p181m5.C3529d> r12) {
        /*
            int r0 = r9.f12395b
            int r1 = r11.length()
            java.lang.String r2 = r9.f12394a
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = -1
            switch(r3) {
                case 0: goto L65;
                case 98: goto L5a;
                case 99: goto L4f;
                case 105: goto L44;
                case 117: goto L39;
                case 118: goto L2e;
                case 3314158: goto L23;
                case 3511770: goto L18;
                default: goto L16;
            }
        L16:
            goto L6f
        L18:
            java.lang.String r3 = "ruby"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
            goto L6f
        L21:
            r7 = 7
            goto L6f
        L23:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
            goto L6f
        L2c:
            r7 = 6
            goto L6f
        L2e:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
            goto L6f
        L37:
            r7 = 5
            goto L6f
        L39:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
            goto L6f
        L42:
            r7 = 4
            goto L6f
        L44:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
            goto L6f
        L4d:
            r7 = 3
            goto L6f
        L4f:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L58
            goto L6f
        L58:
            r7 = r4
            goto L6f
        L5a:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L63
            goto L6f
        L63:
            r7 = r6
            goto L6f
        L65:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6e
            goto L6f
        L6e:
            r7 = r5
        L6f:
            r2 = 33
            switch(r7) {
                case 0: goto L93;
                case 1: goto L8b;
                case 2: goto L85;
                case 3: goto L7f;
                case 4: goto L79;
                case 5: goto L93;
                case 6: goto L93;
                case 7: goto L75;
                default: goto L74;
            }
        L74:
            return
        L75:
            m13128c(r11, r8, r9, r10, r12)
            goto L93
        L79:
            android.text.style.UnderlineSpan r10 = new android.text.style.UnderlineSpan
            r10.<init>()
            goto L90
        L7f:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r4)
            goto L90
        L85:
            java.util.Set<java.lang.String> r10 = r9.f12397d
            m13126a(r11, r10, r0, r1)
            goto L93
        L8b:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r6)
        L90:
            r11.setSpan(r10, r0, r1, r2)
        L93:
            java.util.List r8 = m13133h(r12, r8, r9)
        L97:
            int r9 = r8.size()
            if (r5 >= r9) goto Lab
            java.lang.Object r9 = r8.get(r5)
            m5.f$d r9 = (p181m5.C3531f.d) r9
            m5.d r9 = r9.f12399i
            m13130e(r11, r9, r0, r1)
            int r5 = r5 + 1
            goto L97
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p181m5.C3531f.m13129d(java.lang.String, m5.f$c, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m13130e(android.text.SpannableStringBuilder r4, p181m5.C3529d r5, int r6, int r7) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            int r0 = r5.m13108i()
            r1 = -1
            r2 = 33
            if (r0 == r1) goto L18
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            int r1 = r5.m13108i()
            r0.<init>(r1)
            p107h5.C2338c.m9510a(r4, r0, r6, r7, r2)
        L18:
            boolean r0 = r5.m13111l()
            if (r0 == 0) goto L26
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L26:
            boolean r0 = r5.m13112m()
            if (r0 == 0) goto L34
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L34:
            boolean r0 = r5.m13110k()
            if (r0 == 0) goto L46
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r1 = r5.m13102c()
            r0.<init>(r1)
            p107h5.C2338c.m9510a(r4, r0, r6, r7, r2)
        L46:
            boolean r0 = r5.m13109j()
            if (r0 == 0) goto L58
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r1 = r5.m13100a()
            r0.<init>(r1)
            p107h5.C2338c.m9510a(r4, r0, r6, r7, r2)
        L58:
            java.lang.String r0 = r5.m13103d()
            if (r0 == 0) goto L6a
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            java.lang.String r1 = r5.m13103d()
            r0.<init>(r1)
            p107h5.C2338c.m9510a(r4, r0, r6, r7, r2)
        L6a:
            int r0 = r5.m13105f()
            r1 = 1
            if (r0 == r1) goto L8f
            r1 = 2
            if (r0 == r1) goto L85
            r1 = 3
            if (r0 == r1) goto L78
            goto L9c
        L78:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.m13104e()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            r0.<init>(r1)
            goto L99
        L85:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.m13104e()
            r0.<init>(r1)
            goto L99
        L8f:
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r3 = r5.m13104e()
            int r3 = (int) r3
            r0.<init>(r3, r1)
        L99:
            p107h5.C2338c.m9510a(r4, r0, r6, r7, r2)
        L9c:
            boolean r5 = r5.m13101b()
            if (r5 == 0) goto Laa
            h5.a r5 = new h5.a
            r5.<init>()
            r4.setSpan(r5, r6, r7, r2)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p181m5.C3531f.m13130e(android.text.SpannableStringBuilder, m5.d, int, int):void");
    }

    /* renamed from: f */
    public static int m13131f(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: g */
    public static int m13132g(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public static List<d> m13133h(List<C3529d> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C3529d c3529d = list.get(i10);
            int m13107h = c3529d.m13107h(str, cVar.f12394a, cVar.f12397d, cVar.f12396c);
            if (m13107h > 0) {
                arrayList.add(new d(m13107h, c3529d));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    public static int m13134i(List<C3529d> list, String str, c cVar) {
        List<d> m13133h = m13133h(list, str, cVar);
        for (int i10 = 0; i10 < m13133h.size(); i10++) {
            C3529d c3529d = m13133h.get(i10).f12399i;
            if (c3529d.m13106g() != -1) {
                return c3529d.m13106g();
            }
        }
        return -1;
    }

    /* renamed from: j */
    public static String m13135j(String str) {
        String trim = str.trim();
        C4014a.m15195a(!trim.isEmpty());
        return C4041n0.m15428R0(trim, "[ \\.]")[0];
    }

    /* renamed from: k */
    public static boolean m13136k(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case C1417R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                if (str.equals(C1393b.f5292o)) {
                    c10 = 0;
                    break;
                }
                break;
            case C1417R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                if (str.equals("c")) {
                    c10 = 1;
                    break;
                }
                break;
            case C1417R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                if (str.equals("i")) {
                    c10 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c10 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: l */
    public static C1547b m13137l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f12402c = charSequence;
        return eVar.m13163g().m6318a();
    }

    /* renamed from: m */
    public static C3530e m13138m(String str, Matcher matcher, C4015a0 c4015a0, List<C3529d> list) {
        e eVar = new e();
        try {
            eVar.f12400a = C3534i.m13169d((String) C4014a.m15199e(matcher.group(1)));
            eVar.f12401b = C3534i.m13169d((String) C4014a.m15199e(matcher.group(2)));
            m13141p((String) C4014a.m15199e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String m15243r = c4015a0.m15243r();
                if (TextUtils.isEmpty(m15243r)) {
                    eVar.f12402c = m13142q(str, sb2.toString(), list);
                    return eVar.m13162a();
                }
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(m15243r.trim());
            }
        } catch (NumberFormatException unused) {
            C4046r.m15529i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* renamed from: n */
    public static C3530e m13139n(C4015a0 c4015a0, List<C3529d> list) {
        String m15243r = c4015a0.m15243r();
        if (m15243r == null) {
            return null;
        }
        Pattern pattern = f12387a;
        Matcher matcher = pattern.matcher(m15243r);
        if (matcher.matches()) {
            return m13138m(null, matcher, c4015a0, list);
        }
        String m15243r2 = c4015a0.m15243r();
        if (m15243r2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(m15243r2);
        if (matcher2.matches()) {
            return m13138m(m15243r.trim(), matcher2, c4015a0, list);
        }
        return null;
    }

    /* renamed from: o */
    public static C1547b.b m13140o(String str) {
        e eVar = new e();
        m13141p(str, eVar);
        return eVar.m13163g();
    }

    /* renamed from: p */
    public static void m13141p(String str, e eVar) {
        Matcher matcher = f12388b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C4014a.m15199e(matcher.group(1));
            String str3 = (String) C4014a.m15199e(matcher.group(2));
            try {
                if (Constants.LINE.equals(str2)) {
                    m13144s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f12403d = m13147v(str3);
                } else if ("position".equals(str2)) {
                    m13146u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f12409j = C3534i.m13168c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f12410k = m13148w(str3);
                } else {
                    C4046r.m15529i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                C4046r.m15529i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* renamed from: q */
    public static SpannedString m13142q(String str, String str2, List<C3529d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m13127b(str2.substring(i10, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                if (i11 < str2.length()) {
                    boolean z10 = str2.charAt(i11) == '/';
                    i11 = m13131f(str2, i11);
                    int i12 = i11 - 2;
                    boolean z11 = str2.charAt(i12) == '/';
                    int i13 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i12 = i11 - 1;
                    }
                    String substring = str2.substring(i13, i12);
                    if (!substring.trim().isEmpty()) {
                        String m13135j = m13135j(substring);
                        if (m13136k(m13135j)) {
                            if (!z10) {
                                if (!z11) {
                                    arrayDeque.push(c.m13154a(substring, spannableStringBuilder.length()));
                                }
                            }
                            while (!arrayDeque.isEmpty()) {
                                c cVar = (c) arrayDeque.pop();
                                m13129d(str, cVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                }
                                if (cVar.f12394a.equals(m13135j)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                i10 = i11;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m13129d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m13129d(str, c.m13155b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: r */
    public static int m13143r(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                C4046r.m15529i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: s */
    public static void m13144s(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f12406g = m13143r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f12404e = C3534i.m13168c(str);
            eVar.f12405f = 0;
        } else {
            eVar.f12404e = Integer.parseInt(str);
            eVar.f12405f = 1;
        }
    }

    /* renamed from: t */
    public static int m13145t(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                C4046r.m15529i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: u */
    public static void m13146u(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f12408i = m13145t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f12407h = C3534i.m13168c(str);
    }

    /* renamed from: v */
    public static int m13147v(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c10 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                C4046r.m15529i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    /* renamed from: w */
    public static int m13148w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        C4046r.m15529i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
