package p007a5;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007a5.C0053g;
import p007a5.C0054h;
import p077f4.C1831l;
import p152k4.C3348a;
import p206o5.C3905g0;
import p222p5.C4014a;
import p222p5.C4037l0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4050v;
import p264s3.C4441i;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p317w3.C5247m;
import p365z4.C5987r;

/* renamed from: a5.j */
/* loaded from: classes.dex */
public final class C0056j implements C3905g0.a<AbstractC0055i> {

    /* renamed from: a */
    public final C0054h f245a;

    /* renamed from: b */
    public final C0053g f246b;

    /* renamed from: c */
    public static final Pattern f221c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d */
    public static final Pattern f222d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e */
    public static final Pattern f223e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f */
    public static final Pattern f224f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g */
    public static final Pattern f225g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h */
    public static final Pattern f226h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i */
    public static final Pattern f227i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j */
    public static final Pattern f228j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k */
    public static final Pattern f229k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l */
    public static final Pattern f230l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m */
    public static final Pattern f231m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n */
    public static final Pattern f232n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o */
    public static final Pattern f233o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p */
    public static final Pattern f234p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q */
    public static final Pattern f235q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r */
    public static final Pattern f236r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s */
    public static final Pattern f237s = m267c("CAN-SKIP-DATERANGES");

    /* renamed from: t */
    public static final Pattern f238t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u */
    public static final Pattern f239u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v */
    public static final Pattern f240v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w */
    public static final Pattern f241w = m267c("CAN-BLOCK-RELOAD");

    /* renamed from: x */
    public static final Pattern f242x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y */
    public static final Pattern f243y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z */
    public static final Pattern f244z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: A */
    public static final Pattern f193A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B */
    public static final Pattern f194B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C */
    public static final Pattern f195C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D */
    public static final Pattern f196D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E */
    public static final Pattern f197E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F */
    public static final Pattern f198F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G */
    public static final Pattern f199G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H */
    public static final Pattern f200H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I */
    public static final Pattern f201I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J */
    public static final Pattern f202J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K */
    public static final Pattern f203K = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: L */
    public static final Pattern f204L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M */
    public static final Pattern f205M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N */
    public static final Pattern f206N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O */
    public static final Pattern f207O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P */
    public static final Pattern f208P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q */
    public static final Pattern f209Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R */
    public static final Pattern f210R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S */
    public static final Pattern f211S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T */
    public static final Pattern f212T = m267c("AUTOSELECT");

    /* renamed from: U */
    public static final Pattern f213U = m267c("DEFAULT");

    /* renamed from: V */
    public static final Pattern f214V = m267c("FORCED");

    /* renamed from: W */
    public static final Pattern f215W = m267c("INDEPENDENT");

    /* renamed from: X */
    public static final Pattern f216X = m267c("GAP");

    /* renamed from: Y */
    public static final Pattern f217Y = m267c("PRECISE");

    /* renamed from: Z */
    public static final Pattern f218Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0 */
    public static final Pattern f219a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0 */
    public static final Pattern f220b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: a5.j$a */
    /* loaded from: classes.dex */
    public static final class a extends IOException {
    }

    /* renamed from: a5.j$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final BufferedReader f247a;

        /* renamed from: b */
        public final Queue<String> f248b;

        /* renamed from: c */
        public String f249c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f248b = queue;
            this.f247a = bufferedReader;
        }

        /* renamed from: a */
        public boolean m292a() {
            String trim;
            if (this.f249c != null) {
                return true;
            }
            if (!this.f248b.isEmpty()) {
                this.f249c = (String) C4014a.m15199e(this.f248b.poll());
                return true;
            }
            do {
                String readLine = this.f247a.readLine();
                this.f249c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f249c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String m293b() {
            if (!m292a()) {
                throw new NoSuchElementException();
            }
            String str = this.f249c;
            this.f249c = null;
            return str;
        }
    }

    public C0056j() {
        this(C0054h.f169n, null);
    }

    public C0056j(C0054h c0054h, C0053g c0053g) {
        this.f245a = c0054h;
        this.f246b = c0053g;
    }

    /* renamed from: A */
    public static long m263A(String str, Pattern pattern) {
        return new BigDecimal(m289z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    /* renamed from: B */
    public static String m264B(String str, Map<String, String> map) {
        Matcher matcher = f220b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: C */
    public static int m265C(BufferedReader bufferedReader, boolean z10, int i10) {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !C4041n0.m15486u0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    /* renamed from: b */
    public static boolean m266b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int m265C = m265C(bufferedReader, true, read);
        for (int i10 = 0; i10 < 7; i10++) {
            if (m265C != "#EXTM3U".charAt(i10)) {
                return false;
            }
            m265C = bufferedReader.read();
        }
        return C4041n0.m15486u0(m265C(bufferedReader, false, m265C));
    }

    /* renamed from: c */
    public static Pattern m267c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    /* renamed from: d */
    public static C5247m m268d(String str, C5247m.b[] bVarArr) {
        C5247m.b[] bVarArr2 = new C5247m.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = bVarArr[i10].m21264b(null);
        }
        return new C5247m(str, bVarArr2);
    }

    /* renamed from: e */
    public static String m269e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    /* renamed from: f */
    public static C0054h.b m270f(ArrayList<C0054h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C0054h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f187d)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C0054h.b m271g(ArrayList<C0054h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C0054h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f188e)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: h */
    public static C0054h.b m272h(ArrayList<C0054h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C0054h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f186c)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static double m273j(String str, Pattern pattern) {
        return Double.parseDouble(m289z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: k */
    public static C5247m.b m274k(String str, String str2, Map<String, String> map) {
        String m284u = m284u(str, f202J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String m289z = m289z(str, f203K, map);
            return new C5247m.b(C4441i.f16300d, "video/mp4", Base64.decode(m289z.substring(m289z.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new C5247m.b(C4441i.f16300d, "hls", C4041n0.m15468l0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(m284u)) {
            return null;
        }
        String m289z2 = m289z(str, f203K, map);
        byte[] decode = Base64.decode(m289z2.substring(m289z2.indexOf(44)), 0);
        UUID uuid = C4441i.f16301e;
        return new C5247m.b(uuid, "video/mp4", C1831l.m7526a(uuid, decode));
    }

    /* renamed from: l */
    public static String m275l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* renamed from: m */
    public static int m276m(String str, Pattern pattern) {
        return Integer.parseInt(m289z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: n */
    public static long m277n(String str, Pattern pattern) {
        return Long.parseLong(m289z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x01d9, code lost:
    
        if (r12 != null) goto L69;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p007a5.C0053g m278o(p007a5.C0054h r94, p007a5.C0053g r95, p007a5.C0056j.b r96, java.lang.String r97) {
        /*
            Method dump skipped, instructions count: 1879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007a5.C0056j.m278o(a5.h, a5.g, a5.j$b, java.lang.String):a5.g");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x034d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* renamed from: p */
    public static C0054h m279p(b bVar, String str) {
        char c10;
        C4463m1 c4463m1;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        String str4;
        boolean z10;
        int i10;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i11;
        int i12;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String m264B;
        HashMap hashMap;
        int i13;
        String str5 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            String str6 = "application/x-mpegURL";
            if (!bVar.m292a()) {
                HashMap hashMap4 = hashMap2;
                ArrayList arrayList19 = arrayList16;
                ArrayList arrayList20 = arrayList12;
                ArrayList arrayList21 = arrayList13;
                ArrayList arrayList22 = arrayList14;
                ArrayList arrayList23 = arrayList15;
                ArrayList arrayList24 = arrayList18;
                boolean z13 = z11;
                ArrayList arrayList25 = arrayList17;
                ArrayList arrayList26 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i14 = 0; i14 < arrayList11.size(); i14++) {
                    C0054h.b bVar2 = (C0054h.b) arrayList11.get(i14);
                    if (hashSet.add(bVar2.f184a)) {
                        C4014a.m15200f(bVar2.f185b.f16504q == null);
                        arrayList26.add(bVar2.m262a(bVar2.f185b.m17411b().m17467Z(new C3348a(new C5987r(null, null, (List) C4014a.m15199e((ArrayList) hashMap4.get(bVar2.f184a))))).m17448G()));
                    }
                }
                Uri uri = null;
                ArrayList arrayList27 = null;
                C4463m1 c4463m12 = null;
                int i15 = 0;
                while (i15 < arrayList19.size()) {
                    ArrayList arrayList28 = arrayList19;
                    String str7 = (String) arrayList28.get(i15);
                    String m289z = m289z(str7, f209Q, hashMap3);
                    String m289z2 = m289z(str7, f208P, hashMap3);
                    C4463m1.b m17465X = new C4463m1.b().m17462U(m289z + ":" + m289z2).m17464W(m289z2).m17454M(str6).m17476i0(m287x(str7)).m17472e0(m286w(str7, hashMap3)).m17465X(m285v(str7, f207O, hashMap3));
                    String m285v = m285v(str7, f203K, hashMap3);
                    Uri m15388e = m285v == null ? uri : C4037l0.m15388e(str, m285v);
                    arrayList19 = arrayList28;
                    String str8 = str6;
                    C3348a c3348a = new C3348a(new C5987r(m289z, m289z2, Collections.emptyList()));
                    String m289z3 = m289z(str7, f205M, hashMap3);
                    m289z3.hashCode();
                    switch (m289z3.hashCode()) {
                        case -959297733:
                            if (m289z3.equals("SUBTITLES")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -333210994:
                            if (m289z3.equals("CLOSED-CAPTIONS")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 62628790:
                            if (m289z3.equals("AUDIO")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 81665115:
                            if (m289z3.equals("VIDEO")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    c10 = 65535;
                    switch (c10) {
                        case 0:
                            c4463m1 = c4463m12;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            C0054h.b m271g = m271g(arrayList11, m289z);
                            if (m271g != null) {
                                String m15415L = C4041n0.m15415L(m271g.f185b.f16503p, 3);
                                m17465X.m17452K(m15415L);
                                str2 = C4050v.m15550g(m15415L);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            m17465X.m17474g0(str2).m17467Z(c3348a);
                            if (m15388e != null) {
                                C0054h.a aVar = new C0054h.a(m15388e, m17465X.m17448G(), m289z, m289z2);
                                arrayList3 = arrayList22;
                                arrayList3.add(aVar);
                                break;
                            } else {
                                arrayList3 = arrayList22;
                                C4046r.m15529i("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                        case 1:
                            c4463m1 = c4463m12;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            String m289z4 = m289z(str7, f211S, hashMap3);
                            if (m289z4.startsWith("CC")) {
                                parseInt = Integer.parseInt(m289z4.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(m289z4.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList27 == null) {
                                arrayList27 = new ArrayList();
                            }
                            m17465X.m17474g0(str3).m17449H(parseInt);
                            arrayList27.add(m17465X.m17448G());
                            arrayList3 = arrayList22;
                            break;
                        case 2:
                            arrayList2 = arrayList20;
                            C0054h.b m270f = m270f(arrayList11, m289z);
                            if (m270f != null) {
                                c4463m1 = c4463m12;
                                String m15415L2 = C4041n0.m15415L(m270f.f185b.f16503p, 1);
                                m17465X.m17452K(m15415L2);
                                str4 = C4050v.m15550g(m15415L2);
                            } else {
                                c4463m1 = c4463m12;
                                str4 = null;
                            }
                            String m285v2 = m285v(str7, f227i, hashMap3);
                            if (m285v2 != null) {
                                m17465X.m17451J(Integer.parseInt(C4041n0.m15428R0(m285v2, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)[0]));
                                if ("audio/eac3".equals(str4) && m285v2.endsWith("/JOC")) {
                                    m17465X.m17452K("ec+3");
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            m17465X.m17474g0(str4);
                            if (m15388e != null) {
                                m17465X.m17467Z(c3348a);
                                arrayList = arrayList21;
                                arrayList.add(new C0054h.a(m15388e, m17465X.m17448G(), m289z, m289z2));
                            } else {
                                arrayList = arrayList21;
                                if (m270f != null) {
                                    c4463m1 = m17465X.m17448G();
                                }
                            }
                            arrayList3 = arrayList22;
                            break;
                        case 3:
                            C0054h.b m272h = m272h(arrayList11, m289z);
                            if (m272h != null) {
                                C4463m1 c4463m13 = m272h.f185b;
                                String m15415L3 = C4041n0.m15415L(c4463m13.f16503p, 2);
                                m17465X.m17452K(m15415L3).m17474g0(C4050v.m15550g(m15415L3)).m17481n0(c4463m13.f16511x).m17460S(c4463m13.f16512y).m17459R(c4463m13.f16513z);
                            }
                            if (m15388e != null) {
                                m17465X.m17467Z(c3348a);
                                arrayList2 = arrayList20;
                                arrayList2.add(new C0054h.a(m15388e, m17465X.m17448G(), m289z, m289z2));
                                c4463m1 = c4463m12;
                                arrayList3 = arrayList22;
                                arrayList = arrayList21;
                                break;
                            }
                        default:
                            c4463m1 = c4463m12;
                            arrayList3 = arrayList22;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            break;
                    }
                    i15++;
                    arrayList22 = arrayList3;
                    arrayList21 = arrayList;
                    arrayList20 = arrayList2;
                    str6 = str8;
                    c4463m12 = c4463m1;
                    uri = null;
                }
                return new C0054h(str, arrayList24, arrayList26, arrayList20, arrayList21, arrayList22, arrayList23, c4463m12, z12 ? Collections.emptyList() : arrayList27, z13, hashMap3, arrayList25);
            }
            String m293b = bVar.m293b();
            if (m293b.startsWith("#EXT")) {
                arrayList18.add(m293b);
            }
            boolean startsWith = m293b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            boolean z14 = z11;
            if (m293b.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(m289z(m293b, f208P, hashMap3), m289z(m293b, f218Z, hashMap3));
            } else {
                if (m293b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    hashMap = hashMap2;
                    arrayList10 = arrayList16;
                    arrayList9 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList7 = arrayList14;
                    arrayList5 = arrayList15;
                    arrayList6 = arrayList18;
                    arrayList4 = arrayList17;
                    z11 = true;
                } else if (m293b.startsWith("#EXT-X-MEDIA")) {
                    arrayList16.add(m293b);
                } else if (m293b.startsWith("#EXT-X-SESSION-KEY")) {
                    C5247m.b m274k = m274k(m293b, m284u(m293b, f201I, "identity", hashMap3), hashMap3);
                    if (m274k != null) {
                        arrayList17.add(new C5247m(m275l(m289z(m293b, f200H, hashMap3)), m274k));
                    }
                } else if (m293b.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    boolean contains = z12 | m293b.contains("CLOSED-CAPTIONS=NONE");
                    if (startsWith) {
                        i10 = 16384;
                        z10 = contains;
                    } else {
                        z10 = contains;
                        i10 = 0;
                    }
                    int m276m = m276m(m293b, f226h);
                    arrayList4 = arrayList17;
                    arrayList5 = arrayList15;
                    int m282s = m282s(m293b, f221c, -1);
                    String m285v3 = m285v(m293b, f228j, hashMap3);
                    arrayList6 = arrayList18;
                    String m285v4 = m285v(m293b, f229k, hashMap3);
                    arrayList7 = arrayList14;
                    if (m285v4 != null) {
                        String[] m15426Q0 = C4041n0.m15426Q0(m285v4, "x");
                        int parseInt2 = Integer.parseInt(m15426Q0[0]);
                        int parseInt3 = Integer.parseInt(m15426Q0[1]);
                        if (parseInt2 <= 0 || parseInt3 <= 0) {
                            parseInt3 = -1;
                            i13 = -1;
                        } else {
                            i13 = parseInt2;
                        }
                        i12 = parseInt3;
                        i11 = i13;
                    } else {
                        i11 = -1;
                        i12 = -1;
                    }
                    arrayList8 = arrayList13;
                    String m285v5 = m285v(m293b, f230l, hashMap3);
                    arrayList9 = arrayList12;
                    float parseFloat = m285v5 != null ? Float.parseFloat(m285v5) : -1.0f;
                    String m285v6 = m285v(m293b, f222d, hashMap3);
                    arrayList10 = arrayList16;
                    String m285v7 = m285v(m293b, f223e, hashMap3);
                    HashMap hashMap5 = hashMap2;
                    String m285v8 = m285v(m293b, f224f, hashMap3);
                    String m285v9 = m285v(m293b, f225g, hashMap3);
                    if (startsWith) {
                        m264B = m289z(m293b, f203K, hashMap3);
                    } else {
                        if (!bVar.m292a()) {
                            throw C4499t2.m17596c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        m264B = m264B(bVar.m293b(), hashMap3);
                    }
                    Uri m15388e2 = C4037l0.m15388e(str5, m264B);
                    arrayList11.add(new C0054h.b(m15388e2, new C4463m1.b().m17461T(arrayList11.size()).m17454M("application/x-mpegURL").m17452K(m285v3).m17450I(m282s).m17469b0(m276m).m17481n0(i11).m17460S(i12).m17459R(parseFloat).m17472e0(i10).m17448G(), m285v6, m285v7, m285v8, m285v9));
                    hashMap = hashMap5;
                    ArrayList arrayList29 = (ArrayList) hashMap.get(m15388e2);
                    if (arrayList29 == null) {
                        arrayList29 = new ArrayList();
                        hashMap.put(m15388e2, arrayList29);
                    }
                    arrayList29.add(new C5987r.b(m282s, m276m, m285v6, m285v7, m285v8, m285v9));
                    z11 = z14;
                    z12 = z10;
                }
                hashMap2 = hashMap;
                arrayList17 = arrayList4;
                arrayList15 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
                str5 = str;
            }
            hashMap = hashMap2;
            arrayList10 = arrayList16;
            arrayList9 = arrayList12;
            arrayList8 = arrayList13;
            arrayList7 = arrayList14;
            arrayList5 = arrayList15;
            arrayList6 = arrayList18;
            arrayList4 = arrayList17;
            z11 = z14;
            hashMap2 = hashMap;
            arrayList17 = arrayList4;
            arrayList15 = arrayList5;
            arrayList18 = arrayList6;
            arrayList14 = arrayList7;
            arrayList13 = arrayList8;
            arrayList12 = arrayList9;
            arrayList16 = arrayList10;
            str5 = str;
        }
    }

    /* renamed from: q */
    public static boolean m280q(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    /* renamed from: r */
    public static double m281r(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) C4014a.m15199e(matcher.group(1))) : d10;
    }

    /* renamed from: s */
    public static int m282s(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) C4014a.m15199e(matcher.group(1))) : i10;
    }

    /* renamed from: t */
    public static long m283t(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) C4014a.m15199e(matcher.group(1))) : j10;
    }

    /* renamed from: u */
    public static String m284u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) C4014a.m15199e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : m264B(str2, map);
    }

    /* renamed from: v */
    public static String m285v(String str, Pattern pattern, Map<String, String> map) {
        return m284u(str, pattern, null, map);
    }

    /* renamed from: w */
    public static int m286w(String str, Map<String, String> map) {
        String m285v = m285v(str, f210R, map);
        if (TextUtils.isEmpty(m285v)) {
            return 0;
        }
        String[] m15426Q0 = C4041n0.m15426Q0(m285v, ",");
        int i10 = C4041n0.m15481s(m15426Q0, "public.accessibility.describes-video") ? 512 : 0;
        if (C4041n0.m15481s(m15426Q0, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (C4041n0.m15481s(m15426Q0, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return C4041n0.m15481s(m15426Q0, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: x */
    public static int m287x(String str) {
        boolean m280q = m280q(str, f213U, false);
        ?? r02 = m280q;
        if (m280q(str, f214V, false)) {
            r02 = (m280q ? 1 : 0) | 2;
        }
        return m280q(str, f212T, false) ? r02 | 4 : r02;
    }

    /* renamed from: y */
    public static C0053g.f m288y(String str) {
        double m281r = m281r(str, f236r, -9.223372036854776E18d);
        long j10 = m281r == -9.223372036854776E18d ? -9223372036854775807L : (long) (m281r * 1000000.0d);
        boolean m280q = m280q(str, f237s, false);
        double m281r2 = m281r(str, f239u, -9.223372036854776E18d);
        long j11 = m281r2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (m281r2 * 1000000.0d);
        double m281r3 = m281r(str, f240v, -9.223372036854776E18d);
        return new C0053g.f(j10, m280q, j11, m281r3 != -9.223372036854776E18d ? (long) (m281r3 * 1000000.0d) : -9223372036854775807L, m280q(str, f241w, false));
    }

    /* renamed from: z */
    public static String m289z(String str, Pattern pattern, Map<String, String> map) {
        String m285v = m285v(str, pattern, map);
        if (m285v != null) {
            return m285v;
        }
        throw C4499t2.m17596c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // p206o5.C3905g0.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC0055i mo290a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!m266b(bufferedReader)) {
                throw C4499t2.m17596c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    C4041n0.m15471n(bufferedReader);
                    throw C4499t2.m17596c("Failed to parse the playlist, could not identify any tags.", null);
                }
                trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    } else {
                        arrayDeque.add(trim);
                        return m279p(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return m278o(this.f245a, this.f246b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            C4041n0.m15471n(bufferedReader);
        }
    }
}
