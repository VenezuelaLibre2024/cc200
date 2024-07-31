package p032c5;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p032c5.C0613a;
import p077f4.C1831l;
import p077f4.C1835p;
import p206o5.C3905g0;
import p222p5.C4014a;
import p222p5.C4022e;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p289u3.C4805a;
import p317w3.C5247m;

/* renamed from: c5.b */
/* loaded from: classes.dex */
public class C0614b implements C3905g0.a<C0613a> {

    /* renamed from: a */
    public final XmlPullParserFactory f2703a;

    /* renamed from: c5.b$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public final String f2704a;

        /* renamed from: b */
        public final String f2705b;

        /* renamed from: c */
        public final a f2706c;

        /* renamed from: d */
        public final List<Pair<String, Object>> f2707d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f2706c = aVar;
            this.f2704a = str;
            this.f2705b = str2;
        }

        /* renamed from: a */
        public void mo3051a(Object obj) {
        }

        /* renamed from: b */
        public abstract Object mo3052b();

        /* renamed from: c */
        public final Object m3053c(String str) {
            for (int i10 = 0; i10 < this.f2707d.size(); i10++) {
                Pair<String, Object> pair = this.f2707d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f2706c;
            if (aVar == null) {
                return null;
            }
            return aVar.m3053c(str);
        }

        /* renamed from: d */
        public boolean mo3054d(String str) {
            return false;
        }

        /* renamed from: e */
        public final a m3055e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        /* renamed from: f */
        public final Object m3056f(XmlPullParser xmlPullParser) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f2705b.equals(name)) {
                        mo3064n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (mo3054d(name)) {
                            mo3064n(xmlPullParser);
                        } else {
                            a m3055e = m3055e(this, name, this.f2704a);
                            if (m3055e == null) {
                                i10 = 1;
                            } else {
                                mo3051a(m3055e.m3056f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        mo3065o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo3058h(xmlPullParser);
                    if (!mo3054d(name2)) {
                        return mo3052b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* renamed from: g */
        public final boolean m3057g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        /* renamed from: h */
        public void mo3058h(XmlPullParser xmlPullParser) {
        }

        /* renamed from: i */
        public final int m3059i(XmlPullParser xmlPullParser, String str, int i10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw C4499t2.m17596c(null, e10);
            }
        }

        /* renamed from: j */
        public final long m3060j(XmlPullParser xmlPullParser, String str, long j10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw C4499t2.m17596c(null, e10);
            }
        }

        /* renamed from: k */
        public final int m3061k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw C4499t2.m17596c(null, e10);
            }
        }

        /* renamed from: l */
        public final long m3062l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw C4499t2.m17596c(null, e10);
            }
        }

        /* renamed from: m */
        public final String m3063m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new b(str);
        }

        /* renamed from: n */
        public abstract void mo3064n(XmlPullParser xmlPullParser);

        /* renamed from: o */
        public void mo3065o(XmlPullParser xmlPullParser) {
        }

        /* renamed from: p */
        public final void m3066p(String str, Object obj) {
            this.f2707d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: c5.b$b */
    /* loaded from: classes.dex */
    public static class b extends C4499t2 {
        public b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* renamed from: c5.b$c */
    /* loaded from: classes.dex */
    public static class c extends a {

        /* renamed from: e */
        public boolean f2708e;

        /* renamed from: f */
        public UUID f2709f;

        /* renamed from: g */
        public byte[] f2710g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        /* renamed from: q */
        public static C1835p[] m3067q(byte[] bArr) {
            return new C1835p[]{new C1835p(true, null, 8, m3068r(bArr), 0, 0, null)};
        }

        /* renamed from: r */
        public static byte[] m3068r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            m3070t(decode, 0, 3);
            m3070t(decode, 1, 2);
            m3070t(decode, 4, 5);
            m3070t(decode, 6, 7);
            return decode;
        }

        /* renamed from: s */
        public static String m3069s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        /* renamed from: t */
        public static void m3070t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // p032c5.C0614b.a
        /* renamed from: b */
        public Object mo3052b() {
            UUID uuid = this.f2709f;
            return new C0613a.a(uuid, C1831l.m7526a(uuid, this.f2710g), m3067q(this.f2710g));
        }

        @Override // p032c5.C0614b.a
        /* renamed from: d */
        public boolean mo3054d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // p032c5.C0614b.a
        /* renamed from: h */
        public void mo3058h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f2708e = false;
            }
        }

        @Override // p032c5.C0614b.a
        /* renamed from: n */
        public void mo3064n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f2708e = true;
                this.f2709f = UUID.fromString(m3069s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // p032c5.C0614b.a
        /* renamed from: o */
        public void mo3065o(XmlPullParser xmlPullParser) {
            if (this.f2708e) {
                this.f2710g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* renamed from: c5.b$d */
    /* loaded from: classes.dex */
    public static class d extends a {

        /* renamed from: e */
        public C4463m1 f2711e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        /* renamed from: q */
        public static List<byte[]> m3071q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] m15411J = C4041n0.m15411J(str);
                byte[][] m15285i = C4022e.m15285i(m15411J);
                if (m15285i == null) {
                    arrayList.add(m15411J);
                } else {
                    Collections.addAll(arrayList, m15285i);
                }
            }
            return arrayList;
        }

        /* renamed from: r */
        public static String m3072r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // p032c5.C0614b.a
        /* renamed from: b */
        public Object mo3052b() {
            return this.f2711e;
        }

        @Override // p032c5.C0614b.a
        /* renamed from: n */
        public void mo3064n(XmlPullParser xmlPullParser) {
            C4463m1.b bVar = new C4463m1.b();
            String m3072r = m3072r(m3063m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) m3053c("Type")).intValue();
            if (intValue == 2) {
                bVar.m17454M("video/mp4").m17481n0(m3061k(xmlPullParser, "MaxWidth")).m17460S(m3061k(xmlPullParser, "MaxHeight")).m17463V(m3071q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (m3072r == null) {
                    m3072r = "audio/mp4a-latm";
                }
                int m3061k = m3061k(xmlPullParser, "Channels");
                int m3061k2 = m3061k(xmlPullParser, "SamplingRate");
                List<byte[]> m3071q = m3071q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (m3071q.isEmpty() && "audio/mp4a-latm".equals(m3072r)) {
                    m3071q = Collections.singletonList(C4805a.m18856a(m3061k2, m3061k));
                }
                bVar.m17454M("audio/mp4").m17451J(m3061k).m17475h0(m3061k2).m17463V(m3071q);
            } else if (intValue == 3) {
                int i10 = 0;
                String str = (String) m3053c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i10 = 64;
                    } else if (str.equals("DESC")) {
                        i10 = 1024;
                    }
                }
                bVar.m17454M("application/mp4").m17472e0(i10);
            } else {
                bVar.m17454M("application/mp4");
            }
            this.f2711e = bVar.m17462U(xmlPullParser.getAttributeValue(null, "Index")).m17464W((String) m3053c("Name")).m17474g0(m3072r).m17450I(m3061k(xmlPullParser, "Bitrate")).m17465X((String) m3053c("Language")).m17448G();
        }
    }

    /* renamed from: c5.b$e */
    /* loaded from: classes.dex */
    public static class e extends a {

        /* renamed from: e */
        public final List<C0613a.b> f2712e;

        /* renamed from: f */
        public int f2713f;

        /* renamed from: g */
        public int f2714g;

        /* renamed from: h */
        public long f2715h;

        /* renamed from: i */
        public long f2716i;

        /* renamed from: j */
        public long f2717j;

        /* renamed from: k */
        public int f2718k;

        /* renamed from: l */
        public boolean f2719l;

        /* renamed from: m */
        public C0613a.a f2720m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f2718k = -1;
            this.f2720m = null;
            this.f2712e = new LinkedList();
        }

        @Override // p032c5.C0614b.a
        /* renamed from: a */
        public void mo3051a(Object obj) {
            if (obj instanceof C0613a.b) {
                this.f2712e.add((C0613a.b) obj);
            } else if (obj instanceof C0613a.a) {
                C4014a.m15200f(this.f2720m == null);
                this.f2720m = (C0613a.a) obj;
            }
        }

        @Override // p032c5.C0614b.a
        /* renamed from: b */
        public Object mo3052b() {
            int size = this.f2712e.size();
            C0613a.b[] bVarArr = new C0613a.b[size];
            this.f2712e.toArray(bVarArr);
            if (this.f2720m != null) {
                C0613a.a aVar = this.f2720m;
                C5247m c5247m = new C5247m(new C5247m.b(aVar.f2684a, "video/mp4", aVar.f2685b));
                for (int i10 = 0; i10 < size; i10++) {
                    C0613a.b bVar = bVarArr[i10];
                    int i11 = bVar.f2687a;
                    if (i11 == 2 || i11 == 1) {
                        C4463m1[] c4463m1Arr = bVar.f2696j;
                        for (int i12 = 0; i12 < c4463m1Arr.length; i12++) {
                            c4463m1Arr[i12] = c4463m1Arr[i12].m17411b().m17456O(c5247m).m17448G();
                        }
                    }
                }
            }
            return new C0613a(this.f2713f, this.f2714g, this.f2715h, this.f2716i, this.f2717j, this.f2718k, this.f2719l, this.f2720m, bVarArr);
        }

        @Override // p032c5.C0614b.a
        /* renamed from: n */
        public void mo3064n(XmlPullParser xmlPullParser) {
            this.f2713f = m3061k(xmlPullParser, "MajorVersion");
            this.f2714g = m3061k(xmlPullParser, "MinorVersion");
            this.f2715h = m3060j(xmlPullParser, "TimeScale", 10000000L);
            this.f2716i = m3062l(xmlPullParser, "Duration");
            this.f2717j = m3060j(xmlPullParser, "DVRWindowLength", 0L);
            this.f2718k = m3059i(xmlPullParser, "LookaheadCount", -1);
            this.f2719l = m3057g(xmlPullParser, "IsLive", false);
            m3066p("TimeScale", Long.valueOf(this.f2715h));
        }
    }

    /* renamed from: c5.b$f */
    /* loaded from: classes.dex */
    public static class f extends a {

        /* renamed from: e */
        public final String f2721e;

        /* renamed from: f */
        public final List<C4463m1> f2722f;

        /* renamed from: g */
        public int f2723g;

        /* renamed from: h */
        public String f2724h;

        /* renamed from: i */
        public long f2725i;

        /* renamed from: j */
        public String f2726j;

        /* renamed from: k */
        public String f2727k;

        /* renamed from: l */
        public int f2728l;

        /* renamed from: m */
        public int f2729m;

        /* renamed from: n */
        public int f2730n;

        /* renamed from: o */
        public int f2731o;

        /* renamed from: p */
        public String f2732p;

        /* renamed from: q */
        public ArrayList<Long> f2733q;

        /* renamed from: r */
        public long f2734r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f2721e = str;
            this.f2722f = new LinkedList();
        }

        @Override // p032c5.C0614b.a
        /* renamed from: a */
        public void mo3051a(Object obj) {
            if (obj instanceof C4463m1) {
                this.f2722f.add((C4463m1) obj);
            }
        }

        @Override // p032c5.C0614b.a
        /* renamed from: b */
        public Object mo3052b() {
            C4463m1[] c4463m1Arr = new C4463m1[this.f2722f.size()];
            this.f2722f.toArray(c4463m1Arr);
            return new C0613a.b(this.f2721e, this.f2727k, this.f2723g, this.f2724h, this.f2725i, this.f2726j, this.f2728l, this.f2729m, this.f2730n, this.f2731o, this.f2732p, c4463m1Arr, this.f2733q, this.f2734r);
        }

        @Override // p032c5.C0614b.a
        /* renamed from: d */
        public boolean mo3054d(String str) {
            return "c".equals(str);
        }

        @Override // p032c5.C0614b.a
        /* renamed from: n */
        public void mo3064n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                m3074r(xmlPullParser);
            } else {
                m3073q(xmlPullParser);
            }
        }

        /* renamed from: q */
        public final void m3073q(XmlPullParser xmlPullParser) {
            int m3075s = m3075s(xmlPullParser);
            this.f2723g = m3075s;
            m3066p("Type", Integer.valueOf(m3075s));
            this.f2724h = this.f2723g == 3 ? m3063m(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            m3066p("Subtype", this.f2724h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f2726j = attributeValue;
            m3066p("Name", attributeValue);
            this.f2727k = m3063m(xmlPullParser, "Url");
            this.f2728l = m3059i(xmlPullParser, "MaxWidth", -1);
            this.f2729m = m3059i(xmlPullParser, "MaxHeight", -1);
            this.f2730n = m3059i(xmlPullParser, "DisplayWidth", -1);
            this.f2731o = m3059i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f2732p = attributeValue2;
            m3066p("Language", attributeValue2);
            long m3059i = m3059i(xmlPullParser, "TimeScale", -1);
            this.f2725i = m3059i;
            if (m3059i == -1) {
                this.f2725i = ((Long) m3053c("TimeScale")).longValue();
            }
            this.f2733q = new ArrayList<>();
        }

        /* renamed from: r */
        public final void m3074r(XmlPullParser xmlPullParser) {
            int size = this.f2733q.size();
            long m3060j = m3060j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (m3060j == -9223372036854775807L) {
                if (size == 0) {
                    m3060j = 0;
                } else {
                    if (this.f2734r == -1) {
                        throw C4499t2.m17596c("Unable to infer start time", null);
                    }
                    m3060j = this.f2734r + this.f2733q.get(size - 1).longValue();
                }
            }
            this.f2733q.add(Long.valueOf(m3060j));
            this.f2734r = m3060j(xmlPullParser, "d", -9223372036854775807L);
            long m3060j2 = m3060j(xmlPullParser, "r", 1L);
            if (m3060j2 > 1 && this.f2734r == -9223372036854775807L) {
                throw C4499t2.m17596c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j10 = i10;
                if (j10 >= m3060j2) {
                    return;
                }
                this.f2733q.add(Long.valueOf((this.f2734r * j10) + m3060j));
                i10++;
            }
        }

        /* renamed from: s */
        public final int m3075s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new b("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw C4499t2.m17596c("Invalid key value[" + attributeValue + "]", null);
        }
    }

    public C0614b() {
        try {
            this.f2703a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // p206o5.C3905g0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0613a mo290a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f2703a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (C0613a) new e(null, uri.toString()).m3056f(newPullParser);
        } catch (XmlPullParserException e10) {
            throw C4499t2.m17596c(null, e10);
        }
    }
}
