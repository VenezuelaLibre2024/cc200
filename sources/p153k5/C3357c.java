package p153k5;

import android.text.Layout;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p047d5.AbstractC1552g;
import p047d5.C1555j;
import p047d5.InterfaceC1553h;
import p109h7.C2420c;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4043o0;
import p222p5.C4046r;

/* renamed from: k5.c */
/* loaded from: classes.dex */
public final class C3357c extends AbstractC1552g {

    /* renamed from: p */
    public static final Pattern f11679p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q */
    public static final Pattern f11680q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r */
    public static final Pattern f11681r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s */
    public static final Pattern f11682s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t */
    public static final Pattern f11683t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u */
    public static final Pattern f11684u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v */
    public static final Pattern f11685v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w */
    public static final b f11686w = new b(30.0f, 1, 1);

    /* renamed from: x */
    public static final a f11687x = new a(32, 15);

    /* renamed from: o */
    public final XmlPullParserFactory f11688o;

    /* renamed from: k5.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f11689a;

        /* renamed from: b */
        public final int f11690b;

        public a(int i10, int i11) {
            this.f11689a = i10;
            this.f11690b = i11;
        }
    }

    /* renamed from: k5.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final float f11691a;

        /* renamed from: b */
        public final int f11692b;

        /* renamed from: c */
        public final int f11693c;

        public b(float f10, int i10, int i11) {
            this.f11691a = f10;
            this.f11692b = i10;
            this.f11693c = i11;
        }
    }

    /* renamed from: k5.c$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f11694a;

        /* renamed from: b */
        public final int f11695b;

        public c(int i10, int i11) {
            this.f11694a = i10;
            this.f11695b = i11;
        }
    }

    public C3357c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f11688o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* renamed from: B */
    public static C3361g m12432B(C3361g c3361g) {
        return c3361g == null ? new C3361g() : c3361g;
    }

    /* renamed from: C */
    public static boolean m12433C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals(Constants.INFORMATION);
    }

    /* renamed from: D */
    public static Layout.Alignment m12434D(String str) {
        String m9665e = C2420c.m9665e(str);
        m9665e.hashCode();
        char c10 = 65535;
        switch (m9665e.hashCode()) {
            case -1364013995:
                if (m9665e.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (m9665e.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (m9665e.equals("left")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (m9665e.equals("right")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (m9665e.equals("start")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* renamed from: E */
    public static a m12435E(XmlPullParser xmlPullParser, a aVar) {
        StringBuilder sb2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f11685v.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int parseInt = Integer.parseInt((String) C4014a.m15199e(matcher.group(1)));
                int parseInt2 = Integer.parseInt((String) C4014a.m15199e(matcher.group(2)));
                if (parseInt != 0 && parseInt2 != 0) {
                    return new a(parseInt, parseInt2);
                }
                throw new C1555j("Invalid cell resolution " + parseInt + " " + parseInt2);
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
        } else {
            sb2 = new StringBuilder();
        }
        sb2.append("Ignoring malformed cell resolution: ");
        sb2.append(attributeValue);
        C4046r.m15529i("TtmlDecoder", sb2.toString());
        return aVar;
    }

    /* renamed from: F */
    public static void m12436F(String str, C3361g c3361g) {
        Matcher matcher;
        String[] m15426Q0 = C4041n0.m15426Q0(str, "\\s+");
        if (m15426Q0.length == 1) {
            matcher = f11681r.matcher(str);
        } else {
            if (m15426Q0.length != 2) {
                throw new C1555j("Invalid number of entries for fontSize: " + m15426Q0.length + ".");
            }
            matcher = f11681r.matcher(m15426Q0[1]);
            C4046r.m15529i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C1555j("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) C4014a.m15199e(matcher.group(3));
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case C1417R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                c3361g.m12505z(3);
                break;
            case 1:
                c3361g.m12505z(2);
                break;
            case 2:
                c3361g.m12505z(1);
                break;
            default:
                throw new C1555j("Invalid unit for fontSize: '" + str2 + "'.");
        }
        c3361g.m12504y(Float.parseFloat((String) C4014a.m15199e(matcher.group(1))));
    }

    /* renamed from: G */
    public static b m12437G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (C4041n0.m15426Q0(attributeValue2, " ").length != 2) {
                throw new C1555j("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        }
        b bVar = f11686w;
        int i10 = bVar.f11692b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f11693c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f10, i10, i11);
    }

    /* renamed from: H */
    public static Map<String, C3361g> m12438H(XmlPullParser xmlPullParser, Map<String, C3361g> map, a aVar, c cVar, Map<String, C3359e> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (C4043o0.m15502f(xmlPullParser, "style")) {
                String m15497a = C4043o0.m15497a(xmlPullParser, "style");
                C3361g m12443M = m12443M(xmlPullParser, new C3361g());
                if (m15497a != null) {
                    for (String str : m12444N(m15497a)) {
                        m12443M.m12480a(map.get(str));
                    }
                }
                String m12486g = m12443M.m12486g();
                if (m12486g != null) {
                    map.put(m12486g, m12443M);
                }
            } else if (C4043o0.m15502f(xmlPullParser, "region")) {
                C3359e m12441K = m12441K(xmlPullParser, aVar, cVar);
                if (m12441K != null) {
                    map2.put(m12441K.f11709a, m12441K);
                }
            } else if (C4043o0.m15502f(xmlPullParser, "metadata")) {
                m12439I(xmlPullParser, map3);
            }
        } while (!C4043o0.m15500d(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: I */
    public static void m12439I(XmlPullParser xmlPullParser, Map<String, String> map) {
        String m15497a;
        do {
            xmlPullParser.next();
            if (C4043o0.m15502f(xmlPullParser, "image") && (m15497a = C4043o0.m15497a(xmlPullParser, "id")) != null) {
                map.put(m15497a, xmlPullParser.nextText());
            }
        } while (!C4043o0.m15500d(xmlPullParser, "metadata"));
    }

    /* renamed from: J */
    public static C3358d m12440J(XmlPullParser xmlPullParser, C3358d c3358d, Map<String, C3359e> map, b bVar) {
        long j10;
        long j11;
        char c10;
        int attributeCount = xmlPullParser.getAttributeCount();
        C3361g m12443M = m12443M(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        String[] strArr = null;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j14 = m12445O(attributeValue, bVar);
                    break;
                case 2:
                    j13 = m12445O(attributeValue, bVar);
                    break;
                case 3:
                    j12 = m12445O(attributeValue, bVar);
                    break;
                case 4:
                    String[] m12444N = m12444N(attributeValue);
                    if (m12444N.length > 0) {
                        strArr = m12444N;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c3358d != null) {
            long j15 = c3358d.f11699d;
            j10 = -9223372036854775807L;
            if (j15 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L) {
                    j12 += j15;
                }
                if (j13 != -9223372036854775807L) {
                    j13 += j15;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        long j16 = j12;
        if (j13 == j10) {
            if (j14 != j10) {
                j11 = j16 + j14;
            } else if (c3358d != null) {
                long j17 = c3358d.f11700e;
                if (j17 != j10) {
                    j11 = j17;
                }
            }
            return C3358d.m12447c(xmlPullParser.getName(), j16, j11, m12443M, strArr, str2, str, c3358d);
        }
        j11 = j13;
        return C3358d.m12447c(xmlPullParser.getName(), j16, j11, m12443M, strArr, str2, str, c3358d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0184, code lost:
    
        if (r0.equals("tb") == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p153k5.C3359e m12441K(org.xmlpull.v1.XmlPullParser r17, p153k5.C3357c.a r18, p153k5.C3357c.c r19) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p153k5.C3357c.m12441K(org.xmlpull.v1.XmlPullParser, k5.c$a, k5.c$c):k5.e");
    }

    /* renamed from: L */
    public static float m12442L(String str) {
        Matcher matcher = f11682s.matcher(str);
        if (!matcher.matches()) {
            C4046r.m15529i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C4014a.m15199e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            C4046r.m15530j("TtmlDecoder", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c4, code lost:
    
        if (r3.equals("text") == false) goto L101;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x025b. Please report as an issue. */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p153k5.C3361g m12443M(org.xmlpull.v1.XmlPullParser r12, p153k5.C3361g r13) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p153k5.C3357c.m12443M(org.xmlpull.v1.XmlPullParser, k5.g):k5.g");
    }

    /* renamed from: N */
    public static String[] m12444N(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : C4041n0.m15426Q0(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m12445O(java.lang.String r13, p153k5.C3357c.b r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p153k5.C3357c.m12445O(java.lang.String, k5.c$b):long");
    }

    /* renamed from: P */
    public static c m12446P(XmlPullParser xmlPullParser) {
        StringBuilder sb2;
        String str;
        String m15497a = C4043o0.m15497a(xmlPullParser, "extent");
        if (m15497a == null) {
            return null;
        }
        Matcher matcher = f11684u.matcher(m15497a);
        if (matcher.matches()) {
            try {
                return new c(Integer.parseInt((String) C4014a.m15199e(matcher.group(1))), Integer.parseInt((String) C4014a.m15199e(matcher.group(2))));
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
                str = "Ignoring malformed tts extent: ";
            }
        } else {
            sb2 = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        }
        sb2.append(str);
        sb2.append(m15497a);
        C4046r.m15529i("TtmlDecoder", sb2.toString());
        return null;
    }

    @Override // p047d5.AbstractC1552g
    /* renamed from: z */
    public InterfaceC1553h mo6363z(byte[] bArr, int i10, boolean z10) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f11688o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C3359e(""));
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f11686w;
            a aVar = f11687x;
            int i11 = 0;
            C3362h c3362h = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C3358d c3358d = (C3358d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = m12437G(newPullParser);
                            aVar = m12435E(newPullParser, f11687x);
                            cVar = m12446P(newPullParser);
                        }
                        c cVar2 = cVar;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (m12433C(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                m12438H(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    C3358d m12440J = m12440J(newPullParser, c3358d, hashMap2, bVar);
                                    arrayDeque.push(m12440J);
                                    if (c3358d != null) {
                                        c3358d.m12451a(m12440J);
                                    }
                                } catch (C1555j e10) {
                                    C4046r.m15530j("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVar2 = bVar;
                        } else {
                            C4046r.m15526f("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            bVar2 = bVar3;
                        }
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((C3358d) C4014a.m15199e(c3358d)).m12451a(C3358d.m12448d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c3362h = new C3362h((C3358d) C4014a.m15199e((C3358d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (c3362h != null) {
                return c3362h;
            }
            throw new C1555j("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new C1555j("Unable to decode source", e12);
        }
    }
}
