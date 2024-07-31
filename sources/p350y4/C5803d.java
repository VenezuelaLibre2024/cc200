package p350y4;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p109h7.C2420c;
import p109h7.C2422e;
import p126i7.AbstractC2651u;
import p126i7.C2619e0;
import p180m4.C3523a;
import p206o5.C3905g0;
import p222p5.C4014a;
import p222p5.C4037l0;
import p222p5.C4041n0;
import p222p5.C4043o0;
import p222p5.C4046r;
import p222p5.C4050v;
import p264s3.C4441i;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p317w3.C5247m;
import p350y4.AbstractC5810k;

/* renamed from: y4.d */
/* loaded from: classes.dex */
public class C5803d extends DefaultHandler implements C3905g0.a<C5802c> {

    /* renamed from: b */
    public static final Pattern f21772b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c */
    public static final Pattern f21773c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d */
    public static final Pattern f21774d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e */
    public static final int[] f21775e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a */
    public final XmlPullParserFactory f21776a;

    /* renamed from: y4.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C4463m1 f21777a;

        /* renamed from: b */
        public final AbstractC2651u<C5801b> f21778b;

        /* renamed from: c */
        public final AbstractC5810k f21779c;

        /* renamed from: d */
        public final String f21780d;

        /* renamed from: e */
        public final ArrayList<C5247m.b> f21781e;

        /* renamed from: f */
        public final ArrayList<C5804e> f21782f;

        /* renamed from: g */
        public final long f21783g;

        /* renamed from: h */
        public final List<C5804e> f21784h;

        /* renamed from: i */
        public final List<C5804e> f21785i;

        public a(C4463m1 c4463m1, List<C5801b> list, AbstractC5810k abstractC5810k, String str, ArrayList<C5247m.b> arrayList, ArrayList<C5804e> arrayList2, List<C5804e> list2, List<C5804e> list3, long j10) {
            this.f21777a = c4463m1;
            this.f21778b = AbstractC2651u.m10768p(list);
            this.f21779c = abstractC5810k;
            this.f21780d = str;
            this.f21781e = arrayList;
            this.f21782f = arrayList2;
            this.f21784h = list2;
            this.f21785i = list3;
            this.f21783g = j10;
        }
    }

    public C5803d() {
        try {
            this.f21776a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* renamed from: D */
    public static int m23283D(List<C5804e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C5804e c5804e = list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(c5804e.f21786a) && (str = c5804e.f21787b) != null) {
                Matcher matcher = f21773c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C4046r.m15529i("MpdParser", "Unable to parse CEA-608 channel number from: " + c5804e.f21787b);
            }
        }
        return -1;
    }

    /* renamed from: E */
    public static int m23284E(List<C5804e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C5804e c5804e = list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(c5804e.f21786a) && (str = c5804e.f21787b) != null) {
                Matcher matcher = f21774d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C4046r.m15529i("MpdParser", "Unable to parse CEA-708 service block number from: " + c5804e.f21787b);
            }
        }
        return -1;
    }

    /* renamed from: H */
    public static long m23285H(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : C4041n0.m15410I0(attributeValue);
    }

    /* renamed from: I */
    public static C5804e m23286I(XmlPullParser xmlPullParser, String str) {
        String m23301r0 = m23301r0(xmlPullParser, "schemeIdUri", "");
        String m23301r02 = m23301r0(xmlPullParser, "value", null);
        String m23301r03 = m23301r0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!C4043o0.m15500d(xmlPullParser, str));
        return new C5804e(m23301r0, m23301r02, m23301r03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: J */
    public static int m23287J(XmlPullParser xmlPullParser) {
        char c10;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String m9665e = C2420c.m9665e(attributeValue);
        m9665e.hashCode();
        switch (m9665e.hashCode()) {
            case 1596796:
                if (m9665e.equals("4000")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 2937391:
                if (m9665e.equals("a000")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3094035:
                if (m9665e.equals("f801")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3133436:
                if (m9665e.equals("fa01")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return -1;
        }
    }

    /* renamed from: K */
    public static int m23288K(XmlPullParser xmlPullParser) {
        int m23294U = m23294U(xmlPullParser, "value", -1);
        if (m23294U <= 0 || m23294U >= 33) {
            return -1;
        }
        return m23294U;
    }

    /* renamed from: L */
    public static int m23289L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    /* renamed from: M */
    public static long m23290M(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : C4041n0.m15412J0(attributeValue);
    }

    /* renamed from: N */
    public static String m23291N(List<C5804e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C5804e c5804e = list.get(i10);
            String str = c5804e.f21786a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(c5804e.f21787b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(c5804e.f21787b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* renamed from: R */
    public static float m23292R(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    /* renamed from: S */
    public static float m23293S(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f10;
        }
        Matcher matcher = f21772b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f10;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        float f11 = parseInt;
        return !TextUtils.isEmpty(matcher.group(2)) ? f11 / Integer.parseInt(r2) : f11;
    }

    /* renamed from: U */
    public static int m23294U(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    /* renamed from: W */
    public static long m23295W(List<C5804e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C5804e c5804e = list.get(i10);
            if (C2420c.m9661a("http://dashif.org/guidelines/last-segment-number", c5804e.f21786a)) {
                return Long.parseLong(c5804e.f21787b);
            }
        }
        return -1L;
    }

    /* renamed from: X */
    public static long m23296X(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    /* renamed from: Z */
    public static int m23297Z(XmlPullParser xmlPullParser) {
        int m23294U = m23294U(xmlPullParser, "value", -1);
        if (m23294U < 0) {
            return -1;
        }
        int[] iArr = f21775e;
        if (m23294U < iArr.length) {
            return iArr[m23294U];
        }
        return -1;
    }

    /* renamed from: p */
    public static int m23298p(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        C4014a.m15200f(i10 == i11);
        return i10;
    }

    /* renamed from: q */
    public static String m23299q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        C4014a.m15200f(str.equals(str2));
        return str;
    }

    /* renamed from: r */
    public static void m23300r(ArrayList<C5247m.b> arrayList) {
        String str;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                str = null;
                break;
            }
            C5247m.b bVar = arrayList.get(i10);
            if (C4441i.f16299c.equals(bVar.f19910i) && (str = bVar.f19911j) != null) {
                arrayList.remove(i10);
                break;
            }
            i10++;
        }
        if (str == null) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            C5247m.b bVar2 = arrayList.get(i11);
            if (C4441i.f16298b.equals(bVar2.f19910i) && bVar2.f19911j == null) {
                arrayList.set(i11, new C5247m.b(C4441i.f16299c, str, bVar2.f19912k, bVar2.f19913l));
            }
        }
    }

    /* renamed from: r0 */
    public static String m23301r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: s */
    public static void m23302s(ArrayList<C5247m.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5247m.b bVar = arrayList.get(size);
            if (!bVar.m21265d()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i10).m21263a(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i10++;
                }
            }
        }
    }

    /* renamed from: s0 */
    public static String m23303s0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m23306w(xmlPullParser);
            }
        } while (!C4043o0.m15500d(xmlPullParser, str));
        return str2;
    }

    /* renamed from: t */
    public static long m23304t(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j10;
    }

    /* renamed from: u */
    public static String m23305u(String str, String str2) {
        if (C4050v.m15558o(str)) {
            return C4050v.m15546c(str2);
        }
        if (C4050v.m15562s(str)) {
            return C4050v.m15557n(str2);
        }
        if (C4050v.m15561r(str) || C4050v.m15559p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String m15550g = C4050v.m15550g(str2);
        return "text/vtt".equals(m15550g) ? "application/x-mp4-vtt" : m15550g;
    }

    /* renamed from: w */
    public static void m23306w(XmlPullParser xmlPullParser) {
        if (C4043o0.m15501e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (C4043o0.m15501e(xmlPullParser)) {
                    i10++;
                } else if (C4043o0.m15499c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: A */
    public int m23307A(XmlPullParser xmlPullParser) {
        char c10;
        String m23301r0 = m23301r0(xmlPullParser, "schemeIdUri", null);
        m23301r0.hashCode();
        int i10 = -1;
        switch (m23301r0.hashCode()) {
            case -2128649360:
                if (m23301r0.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1352850286:
                if (m23301r0.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1138141449:
                if (m23301r0.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -986633423:
                if (m23301r0.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -79006963:
                if (m23301r0.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 312179081:
                if (m23301r0.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 2036691300:
                if (m23301r0.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 4:
                i10 = m23288K(xmlPullParser);
                break;
            case 1:
                i10 = m23294U(xmlPullParser, "value", -1);
                break;
            case 2:
            case 6:
                i10 = m23287J(xmlPullParser);
                break;
            case 3:
                i10 = m23297Z(xmlPullParser);
                break;
            case 5:
                i10 = m23289L(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!C4043o0.m15500d(xmlPullParser, "AudioChannelConfiguration"));
        return i10;
    }

    /* renamed from: B */
    public long m23308B(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    /* renamed from: C */
    public List<C5801b> m23309C(XmlPullParser xmlPullParser, List<C5801b> list, boolean z10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String m23303s0 = m23303s0(xmlPullParser, "BaseURL");
        if (C4037l0.m15385b(m23303s0)) {
            if (attributeValue3 == null) {
                attributeValue3 = m23303s0;
            }
            return C2619e0.m10594j(new C5801b(m23303s0, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C5801b c5801b = list.get(i10);
            String m15387d = C4037l0.m15387d(c5801b.f21755a, m23303s0);
            String str = attributeValue3 == null ? m15387d : attributeValue3;
            if (z10) {
                parseInt = c5801b.f21757c;
                parseInt2 = c5801b.f21758d;
                str = c5801b.f21756b;
            }
            arrayList.add(new C5801b(m15387d, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.UUID] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<java.lang.String, p317w3.C5247m.b> m23310F(org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p350y4.C5803d.m23310F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: G */
    public int m23311G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* renamed from: O */
    public Pair<Long, C3523a> m23312O(XmlPullParser xmlPullParser, String str, String str2, long j10, long j11, ByteArrayOutputStream byteArrayOutputStream) {
        long m23296X = m23296X(xmlPullParser, "id", 0L);
        long m23296X2 = m23296X(xmlPullParser, "duration", -9223372036854775807L);
        long m23296X3 = m23296X(xmlPullParser, "presentationTime", 0L);
        long m15420N0 = C4041n0.m15420N0(m23296X2, 1000L, j10);
        long m15420N02 = C4041n0.m15420N0(m23296X3 - j11, 1000000L, j10);
        String m23301r0 = m23301r0(xmlPullParser, "messageData", null);
        byte[] m23313P = m23313P(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(m15420N02);
        if (m23301r0 != null) {
            m23313P = C4041n0.m15468l0(m23301r0);
        }
        return Pair.create(valueOf, m23323d(str, str2, m23296X, m15420N0, m23313P));
    }

    /* renamed from: P */
    public byte[] m23313P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, C2422e.f9747c.name());
        while (true) {
            xmlPullParser.nextToken();
            if (C4043o0.m15500d(xmlPullParser, "Event")) {
                newSerializer.flush();
                return byteArrayOutputStream.toByteArray();
            }
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
        }
    }

    /* renamed from: Q */
    public C5805f m23314Q(XmlPullParser xmlPullParser) {
        ByteArrayOutputStream byteArrayOutputStream;
        long j10;
        ArrayList arrayList;
        String m23301r0 = m23301r0(xmlPullParser, "schemeIdUri", "");
        String m23301r02 = m23301r0(xmlPullParser, "value", "");
        long m23296X = m23296X(xmlPullParser, "timescale", 1L);
        long m23296X2 = m23296X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (C4043o0.m15502f(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j11 = m23296X2;
                j10 = m23296X2;
                arrayList = arrayList2;
                arrayList.add(m23312O(xmlPullParser, m23301r0, m23301r02, m23296X, j11, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j10 = m23296X2;
                arrayList = arrayList2;
                m23306w(xmlPullParser);
            }
            if (C4043o0.m15500d(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            m23296X2 = j10;
        }
        long[] jArr = new long[arrayList.size()];
        C3523a[] c3523aArr = new C3523a[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            c3523aArr[i10] = (C3523a) pair.second;
        }
        return m23325e(m23301r0, m23301r02, m23296X, jArr, c3523aArr);
    }

    /* renamed from: T */
    public C5808i m23315T(XmlPullParser xmlPullParser) {
        return m23324d0(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: V */
    public String m23316V(XmlPullParser xmlPullParser) {
        return m23303s0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01e7 A[LOOP:0: B:18:0x00a4->B:26:0x01e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e0  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p350y4.C5802c m23317Y(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p350y4.C5803d.m23317Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):y4.c");
    }

    /* renamed from: a0 */
    public Pair<C5806g, Long> m23318a0(XmlPullParser xmlPullParser, List<C5801b> list, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j15;
        AbstractC5810k m23340l0;
        C5803d c5803d = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long m23290M = m23290M(xmlPullParser2, "start", j10);
        long j16 = -9223372036854775807L;
        long j17 = j12 != -9223372036854775807L ? j12 + m23290M : -9223372036854775807L;
        long m23290M2 = m23290M(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j18 = j11;
        boolean z11 = false;
        long j19 = -9223372036854775807L;
        AbstractC5810k abstractC5810k = null;
        C5804e c5804e = null;
        while (true) {
            xmlPullParser.next();
            if (C4043o0.m15502f(xmlPullParser2, "BaseURL")) {
                if (!z11) {
                    j18 = c5803d.m23308B(xmlPullParser2, j18);
                    z11 = true;
                }
                arrayList6.addAll(c5803d.m23309C(xmlPullParser2, list, z10));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j15 = j16;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (C4043o0.m15502f(xmlPullParser2, "AdaptationSet")) {
                    j14 = j18;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(m23355y(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, abstractC5810k, m23290M2, j18, j19, j17, j13, z10));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j14 = j18;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (C4043o0.m15502f(xmlPullParser2, "EventStream")) {
                        arrayList7.add(m23314Q(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else {
                        arrayList3 = arrayList7;
                        if (C4043o0.m15502f(xmlPullParser2, "SegmentBase")) {
                            abstractC5810k = m23336j0(xmlPullParser2, null);
                            obj = null;
                            j18 = j14;
                            j15 = -9223372036854775807L;
                        } else {
                            if (C4043o0.m15502f(xmlPullParser2, "SegmentList")) {
                                long m23308B = m23308B(xmlPullParser2, -9223372036854775807L);
                                obj = null;
                                m23340l0 = m23338k0(xmlPullParser, null, j17, m23290M2, j14, m23308B, j13);
                                j19 = m23308B;
                                j18 = j14;
                                j15 = -9223372036854775807L;
                            } else {
                                obj = null;
                                if (C4043o0.m15502f(xmlPullParser2, "SegmentTemplate")) {
                                    long m23308B2 = m23308B(xmlPullParser2, -9223372036854775807L);
                                    j15 = -9223372036854775807L;
                                    m23340l0 = m23340l0(xmlPullParser, null, AbstractC2651u.m10770u(), j17, m23290M2, j14, m23308B2, j13);
                                    j19 = m23308B2;
                                    j18 = j14;
                                } else {
                                    j15 = -9223372036854775807L;
                                    if (C4043o0.m15502f(xmlPullParser2, "AssetIdentifier")) {
                                        c5804e = m23286I(xmlPullParser2, "AssetIdentifier");
                                    } else {
                                        m23306w(xmlPullParser);
                                    }
                                    j18 = j14;
                                }
                            }
                            abstractC5810k = m23340l0;
                        }
                    }
                }
                obj = null;
                j15 = -9223372036854775807L;
                j18 = j14;
            }
            if (C4043o0.m15500d(xmlPullParser2, "Period")) {
                return Pair.create(m23331h(attributeValue, m23290M, arrayList2, arrayList3, c5804e), Long.valueOf(m23290M2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j16 = j15;
            c5803d = this;
        }
    }

    /* renamed from: b */
    public final long m23319b(List<AbstractC5810k.d> list, long j10, long j11, int i10, long j12) {
        int m15469m = i10 >= 0 ? i10 + 1 : (int) C4041n0.m15469m(j12 - j10, j11);
        for (int i11 = 0; i11 < m15469m; i11++) {
            list.add(m23341m(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    /* renamed from: b0 */
    public String[] m23320b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    /* renamed from: c */
    public C5800a m23321c(int i10, int i11, List<AbstractC5809j> list, List<C5804e> list2, List<C5804e> list3, List<C5804e> list4) {
        return new C5800a(i10, i11, list, list2, list3, list4);
    }

    /* renamed from: c0 */
    public C5807h m23322c0(XmlPullParser xmlPullParser) {
        String str = null;
        String m23301r0 = m23301r0(xmlPullParser, "moreInformationURL", null);
        String m23301r02 = m23301r0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (C4043o0.m15502f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (C4043o0.m15502f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (C4043o0.m15502f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                m23306w(xmlPullParser);
            }
            String str4 = str3;
            if (C4043o0.m15500d(xmlPullParser, "ProgramInformation")) {
                return new C5807h(str, str2, str4, m23301r0, m23301r02);
            }
            str3 = str4;
        }
    }

    /* renamed from: d */
    public C3523a m23323d(String str, String str2, long j10, long j11, byte[] bArr) {
        return new C3523a(str, str2, j11, j10, bArr);
    }

    /* renamed from: d0 */
    public C5808i m23324d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j10 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j11 = (Long.parseLong(split[1]) - j10) + 1;
                return m23333i(attributeValue, j10, j11);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return m23333i(attributeValue, j10, j11);
    }

    /* renamed from: e */
    public C5805f m23325e(String str, String str2, long j10, long[] jArr, C3523a[] c3523aArr) {
        return new C5805f(str, str2, j10, jArr, c3523aArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01ee A[LOOP:0: B:2:0x006a->B:11:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0198 A[EDGE_INSN: B:12:0x0198->B:13:0x0198 BREAK  A[LOOP:0: B:2:0x006a->B:11:0x01ee], SYNTHETIC] */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p350y4.C5803d.a m23326e0(org.xmlpull.v1.XmlPullParser r36, java.util.List<p350y4.C5801b> r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List<p350y4.C5804e> r46, java.util.List<p350y4.C5804e> r47, java.util.List<p350y4.C5804e> r48, java.util.List<p350y4.C5804e> r49, p350y4.AbstractC5810k r50, long r51, long r53, long r55, long r57, long r59, boolean r61) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p350y4.C5803d.m23326e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, y4.k, long, long, long, long, long, boolean):y4.d$a");
    }

    /* renamed from: f */
    public C4463m1 m23327f(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List<C5804e> list, List<C5804e> list2, String str4, List<C5804e> list3, List<C5804e> list4) {
        String str5 = str4;
        String m23305u = m23305u(str2, str5);
        if ("audio/eac3".equals(m23305u)) {
            m23305u = m23291N(list4);
            if ("audio/eac3-joc".equals(m23305u)) {
                str5 = "ec+3";
            }
        }
        int m23347p0 = m23347p0(list);
        int m23334i0 = m23334i0(list) | m23328f0(list2) | m23332h0(list3) | m23332h0(list4);
        Pair<Integer, Integer> m23349t0 = m23349t0(list3);
        C4463m1.b m17465X = new C4463m1.b().m17462U(str).m17454M(str2).m17474g0(m23305u).m17452K(str5).m17469b0(i14).m17476i0(m23347p0).m17472e0(m23334i0).m17465X(str3);
        int i15 = -1;
        C4463m1.b m17480m0 = m17465X.m17479l0(m23349t0 != null ? ((Integer) m23349t0.first).intValue() : -1).m17480m0(m23349t0 != null ? ((Integer) m23349t0.second).intValue() : -1);
        if (C4050v.m15562s(m23305u)) {
            m17480m0.m17481n0(i10).m17460S(i11).m17459R(f10);
        } else if (C4050v.m15558o(m23305u)) {
            m17480m0.m17451J(i12).m17475h0(i13);
        } else if (C4050v.m15561r(m23305u)) {
            if ("application/cea-608".equals(m23305u)) {
                i15 = m23283D(list2);
            } else if ("application/cea-708".equals(m23305u)) {
                i15 = m23284E(list2);
            }
            m17480m0.m17449H(i15);
        } else if (C4050v.m15559p(m23305u)) {
            m17480m0.m17481n0(i10).m17460S(i11);
        }
        return m17480m0.m17448G();
    }

    /* renamed from: f0 */
    public int m23328f0(List<C5804e> list) {
        int m23350u0;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C5804e c5804e = list.get(i11);
            if (C2420c.m9661a("urn:mpeg:dash:role:2011", c5804e.f21786a)) {
                m23350u0 = m23330g0(c5804e.f21787b);
            } else if (C2420c.m9661a("urn:tva:metadata:cs:AudioPurposeCS:2007", c5804e.f21786a)) {
                m23350u0 = m23350u0(c5804e.f21787b);
            }
            i10 |= m23350u0;
        }
        return i10;
    }

    /* renamed from: g */
    public C5802c m23329g(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, C5807h c5807h, C5814o c5814o, C5811l c5811l, Uri uri, List<C5806g> list) {
        return new C5802c(j10, j11, j12, z10, j13, j14, j15, j16, c5807h, c5814o, c5811l, uri, list);
    }

    /* renamed from: g0 */
    public int m23330g0(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c10 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals(FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT)) {
                    c10 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case '\b':
                return 256;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case 11:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    /* renamed from: h */
    public C5806g m23331h(String str, long j10, List<C5800a> list, List<C5805f> list2, C5804e c5804e) {
        return new C5806g(str, j10, list, list2, c5804e);
    }

    /* renamed from: h0 */
    public int m23332h0(List<C5804e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (C2420c.m9661a("http://dashif.org/guidelines/trickmode", list.get(i11).f21786a)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    /* renamed from: i */
    public C5808i m23333i(String str, long j10, long j11) {
        return new C5808i(str, j10, j11);
    }

    /* renamed from: i0 */
    public int m23334i0(List<C5804e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C5804e c5804e = list.get(i11);
            if (C2420c.m9661a("urn:mpeg:dash:role:2011", c5804e.f21786a)) {
                i10 |= m23330g0(c5804e.f21787b);
            }
        }
        return i10;
    }

    /* renamed from: j */
    public AbstractC5809j m23335j(a aVar, String str, String str2, ArrayList<C5247m.b> arrayList, ArrayList<C5804e> arrayList2) {
        C4463m1.b m17411b = aVar.f21777a.m17411b();
        if (str != null) {
            m17411b.m17464W(str);
        }
        String str3 = aVar.f21780d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<C5247m.b> arrayList3 = aVar.f21781e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m23300r(arrayList3);
            m23302s(arrayList3);
            m17411b.m17456O(new C5247m(str2, arrayList3));
        }
        ArrayList<C5804e> arrayList4 = aVar.f21782f;
        arrayList4.addAll(arrayList2);
        return AbstractC5809j.m23362o(aVar.f21783g, m17411b.m17448G(), aVar.f21778b, aVar.f21779c, arrayList4, aVar.f21784h, aVar.f21785i, null);
    }

    /* renamed from: j0 */
    public AbstractC5810k.e m23336j0(XmlPullParser xmlPullParser, AbstractC5810k.e eVar) {
        long j10;
        long j11;
        long m23296X = m23296X(xmlPullParser, "timescale", eVar != null ? eVar.f21823b : 1L);
        long m23296X2 = m23296X(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f21824c : 0L);
        long j12 = eVar != null ? eVar.f21837d : 0L;
        long j13 = eVar != null ? eVar.f21838e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j10 = (Long.parseLong(split[1]) - parseLong) + 1;
            j11 = parseLong;
        } else {
            j10 = j13;
            j11 = j12;
        }
        C5808i c5808i = eVar != null ? eVar.f21822a : null;
        do {
            xmlPullParser.next();
            if (C4043o0.m15502f(xmlPullParser, "Initialization")) {
                c5808i = m23315T(xmlPullParser);
            } else {
                m23306w(xmlPullParser);
            }
        } while (!C4043o0.m15500d(xmlPullParser, "SegmentBase"));
        return m23343n(c5808i, m23296X, m23296X2, j11, j10);
    }

    /* renamed from: k */
    public AbstractC5810k.b m23337k(C5808i c5808i, long j10, long j11, long j12, long j13, List<AbstractC5810k.d> list, long j14, List<C5808i> list2, long j15, long j16) {
        return new AbstractC5810k.b(c5808i, j10, j11, j12, j13, list, j14, list2, C4041n0.m15396B0(j15), C4041n0.m15396B0(j16));
    }

    /* renamed from: k0 */
    public AbstractC5810k.b m23338k0(XmlPullParser xmlPullParser, AbstractC5810k.b bVar, long j10, long j11, long j12, long j13, long j14) {
        long m23296X = m23296X(xmlPullParser, "timescale", bVar != null ? bVar.f21823b : 1L);
        long m23296X2 = m23296X(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f21824c : 0L);
        long m23296X3 = m23296X(xmlPullParser, "duration", bVar != null ? bVar.f21826e : -9223372036854775807L);
        long m23296X4 = m23296X(xmlPullParser, "startNumber", bVar != null ? bVar.f21825d : 1L);
        long m23304t = m23304t(j12, j13);
        List<AbstractC5810k.d> list = null;
        List<C5808i> list2 = null;
        C5808i c5808i = null;
        do {
            xmlPullParser.next();
            if (C4043o0.m15502f(xmlPullParser, "Initialization")) {
                c5808i = m23315T(xmlPullParser);
            } else if (C4043o0.m15502f(xmlPullParser, "SegmentTimeline")) {
                list = m23342m0(xmlPullParser, m23296X, j11);
            } else if (C4043o0.m15502f(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                list2.add(m23344n0(xmlPullParser));
            } else {
                m23306w(xmlPullParser);
            }
        } while (!C4043o0.m15500d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (c5808i == null) {
                c5808i = bVar.f21822a;
            }
            if (list == null) {
                list = bVar.f21827f;
            }
            if (list2 == null) {
                list2 = bVar.f21831j;
            }
        }
        return m23337k(c5808i, m23296X, m23296X2, m23296X4, m23296X3, list, m23304t, list2, j14, j10);
    }

    /* renamed from: l */
    public AbstractC5810k.c m23339l(C5808i c5808i, long j10, long j11, long j12, long j13, long j14, List<AbstractC5810k.d> list, long j15, C5813n c5813n, C5813n c5813n2, long j16, long j17) {
        return new AbstractC5810k.c(c5808i, j10, j11, j12, j13, j14, list, j15, c5813n, c5813n2, C4041n0.m15396B0(j16), C4041n0.m15396B0(j17));
    }

    /* renamed from: l0 */
    public AbstractC5810k.c m23340l0(XmlPullParser xmlPullParser, AbstractC5810k.c cVar, List<C5804e> list, long j10, long j11, long j12, long j13, long j14) {
        long m23296X = m23296X(xmlPullParser, "timescale", cVar != null ? cVar.f21823b : 1L);
        long m23296X2 = m23296X(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f21824c : 0L);
        long m23296X3 = m23296X(xmlPullParser, "duration", cVar != null ? cVar.f21826e : -9223372036854775807L);
        long m23296X4 = m23296X(xmlPullParser, "startNumber", cVar != null ? cVar.f21825d : 1L);
        long m23295W = m23295W(list);
        long m23304t = m23304t(j12, j13);
        List<AbstractC5810k.d> list2 = null;
        C5813n m23352v0 = m23352v0(xmlPullParser, "media", cVar != null ? cVar.f21833k : null);
        C5813n m23352v02 = m23352v0(xmlPullParser, "initialization", cVar != null ? cVar.f21832j : null);
        C5808i c5808i = null;
        do {
            xmlPullParser.next();
            if (C4043o0.m15502f(xmlPullParser, "Initialization")) {
                c5808i = m23315T(xmlPullParser);
            } else if (C4043o0.m15502f(xmlPullParser, "SegmentTimeline")) {
                list2 = m23342m0(xmlPullParser, m23296X, j11);
            } else {
                m23306w(xmlPullParser);
            }
        } while (!C4043o0.m15500d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (c5808i == null) {
                c5808i = cVar.f21822a;
            }
            if (list2 == null) {
                list2 = cVar.f21827f;
            }
        }
        return m23339l(c5808i, m23296X, m23296X2, m23296X4, m23295W, m23296X3, list2, m23304t, m23352v02, m23352v0, j14, j10);
    }

    /* renamed from: m */
    public AbstractC5810k.d m23341m(long j10, long j11) {
        return new AbstractC5810k.d(j10, j11);
    }

    /* renamed from: m0 */
    public List<AbstractC5810k.d> m23342m0(XmlPullParser xmlPullParser, long j10, long j11) {
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        boolean z10 = false;
        int i10 = 0;
        long j13 = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (C4043o0.m15502f(xmlPullParser, "S")) {
                long m23296X = m23296X(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    j12 = m23319b(arrayList, j12, j13, i10, m23296X);
                }
                if (m23296X == -9223372036854775807L) {
                    m23296X = j12;
                }
                j13 = m23296X(xmlPullParser, "d", -9223372036854775807L);
                i10 = m23294U(xmlPullParser, "r", 0);
                z10 = true;
                j12 = m23296X;
            } else {
                m23306w(xmlPullParser);
            }
        } while (!C4043o0.m15500d(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            m23319b(arrayList, j12, j13, i10, C4041n0.m15420N0(j11, j10, 1000L));
        }
        return arrayList;
    }

    /* renamed from: n */
    public AbstractC5810k.e m23343n(C5808i c5808i, long j10, long j11, long j12, long j13) {
        return new AbstractC5810k.e(c5808i, j10, j11, j12, j13);
    }

    /* renamed from: n0 */
    public C5808i m23344n0(XmlPullParser xmlPullParser) {
        return m23324d0(xmlPullParser, "media", "mediaRange");
    }

    /* renamed from: o */
    public C5814o m23345o(String str, String str2) {
        return new C5814o(str, str2);
    }

    /* renamed from: o0 */
    public int m23346o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    /* renamed from: p0 */
    public int m23347p0(List<C5804e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C5804e c5804e = list.get(i11);
            if (C2420c.m9661a("urn:mpeg:dash:role:2011", c5804e.f21786a)) {
                i10 |= m23346o0(c5804e.f21787b);
            }
        }
        return i10;
    }

    /* renamed from: q0 */
    public C5811l m23348q0(XmlPullParser xmlPullParser) {
        float f10 = -3.4028235E38f;
        float f11 = -3.4028235E38f;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        while (true) {
            xmlPullParser.next();
            if (C4043o0.m15502f(xmlPullParser, "Latency")) {
                j10 = m23296X(xmlPullParser, "target", -9223372036854775807L);
                j11 = m23296X(xmlPullParser, "min", -9223372036854775807L);
                j12 = m23296X(xmlPullParser, "max", -9223372036854775807L);
            } else if (C4043o0.m15502f(xmlPullParser, "PlaybackRate")) {
                f10 = m23292R(xmlPullParser, "min", -3.4028235E38f);
                f11 = m23292R(xmlPullParser, "max", -3.4028235E38f);
            }
            long j13 = j10;
            long j14 = j11;
            long j15 = j12;
            float f12 = f10;
            float f13 = f11;
            if (C4043o0.m15500d(xmlPullParser, "ServiceDescription")) {
                return new C5811l(j13, j14, j15, f12, f13);
            }
            j10 = j13;
            j11 = j14;
            j12 = j15;
            f10 = f12;
            f11 = f13;
        }
    }

    /* renamed from: t0 */
    public Pair<Integer, Integer> m23349t0(List<C5804e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C5804e c5804e = list.get(i10);
            if ((C2420c.m9661a("http://dashif.org/thumbnail_tile", c5804e.f21786a) || C2420c.m9661a("http://dashif.org/guidelines/thumbnail_tile", c5804e.f21786a)) && (str = c5804e.f21787b) != null) {
                String[] m15426Q0 = C4041n0.m15426Q0(str, "x");
                if (m15426Q0.length == 2) {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(m15426Q0[0])), Integer.valueOf(Integer.parseInt(m15426Q0[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: u0 */
    public int m23350u0(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case C1417R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                if (str.equals("1")) {
                    c10 = 0;
                    break;
                }
                break;
            case C1417R.styleable.AppCompatTheme_colorAccent /* 50 */:
                if (str.equals("2")) {
                    c10 = 1;
                    break;
                }
                break;
            case C1417R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                if (str.equals("3")) {
                    c10 = 2;
                    break;
                }
                break;
            case C1417R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                if (str.equals("4")) {
                    c10 = 3;
                    break;
                }
                break;
            case C1417R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                if (str.equals("6")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: v */
    public final boolean m23351v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v0 */
    public C5813n m23352v0(XmlPullParser xmlPullParser, String str, C5813n c5813n) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? C5813n.m23380b(attributeValue) : c5813n;
    }

    /* renamed from: w0 */
    public C5814o m23353w0(XmlPullParser xmlPullParser) {
        return m23345o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // p206o5.C3905g0.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public C5802c mo290a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f21776a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m23317Y(newPullParser, uri);
            }
            throw C4499t2.m17596c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw C4499t2.m17596c(null, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x030e A[LOOP:0: B:2:0x007c->B:10:0x030e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02ce A[EDGE_INSN: B:11:0x02ce->B:12:0x02ce BREAK  A[LOOP:0: B:2:0x007c->B:10:0x030e], SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p350y4.C5800a m23355y(org.xmlpull.v1.XmlPullParser r55, java.util.List<p350y4.C5801b> r56, p350y4.AbstractC5810k r57, long r58, long r60, long r62, long r64, long r66, boolean r68) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p350y4.C5803d.m23355y(org.xmlpull.v1.XmlPullParser, java.util.List, y4.k, long, long, long, long, long, boolean):y4.a");
    }

    /* renamed from: z */
    public void m23356z(XmlPullParser xmlPullParser) {
        m23306w(xmlPullParser);
    }
}
