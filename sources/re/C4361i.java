package re;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: re.i */
/* loaded from: classes2.dex */
public final class C4361i {

    /* renamed from: a */
    public final String f15922a;

    /* renamed from: b */
    public static final Comparator<String> f15855b = new Comparator() { // from class: re.h
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m16755e;
            m16755e = C4361i.m16755e((String) obj, (String) obj2);
            return m16755e;
        }
    };

    /* renamed from: c */
    public static final Map<String, C4361i> f15858c = new LinkedHashMap();

    /* renamed from: d */
    public static final C4361i f15861d = m16754d("SSL_RSA_WITH_NULL_MD5", 1);

    /* renamed from: e */
    public static final C4361i f15864e = m16754d("SSL_RSA_WITH_NULL_SHA", 2);

    /* renamed from: f */
    public static final C4361i f15867f = m16754d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* renamed from: g */
    public static final C4361i f15870g = m16754d("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* renamed from: h */
    public static final C4361i f15873h = m16754d("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* renamed from: i */
    public static final C4361i f15876i = m16754d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* renamed from: j */
    public static final C4361i f15879j = m16754d("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* renamed from: k */
    public static final C4361i f15882k = m16754d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: l */
    public static final C4361i f15885l = m16754d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* renamed from: m */
    public static final C4361i f15888m = m16754d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* renamed from: n */
    public static final C4361i f15891n = m16754d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* renamed from: o */
    public static final C4361i f15894o = m16754d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* renamed from: p */
    public static final C4361i f15897p = m16754d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* renamed from: q */
    public static final C4361i f15900q = m16754d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* renamed from: r */
    public static final C4361i f15903r = m16754d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* renamed from: s */
    public static final C4361i f15906s = m16754d("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* renamed from: t */
    public static final C4361i f15908t = m16754d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* renamed from: u */
    public static final C4361i f15910u = m16754d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* renamed from: v */
    public static final C4361i f15912v = m16754d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* renamed from: w */
    public static final C4361i f15914w = m16754d("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* renamed from: x */
    public static final C4361i f15916x = m16754d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* renamed from: y */
    public static final C4361i f15918y = m16754d("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* renamed from: z */
    public static final C4361i f15920z = m16754d("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* renamed from: A */
    public static final C4361i f15801A = m16754d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);

    /* renamed from: B */
    public static final C4361i f15803B = m16754d("TLS_KRB5_WITH_RC4_128_MD5", 36);

    /* renamed from: C */
    public static final C4361i f15805C = m16754d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);

    /* renamed from: D */
    public static final C4361i f15807D = m16754d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);

    /* renamed from: E */
    public static final C4361i f15809E = m16754d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);

    /* renamed from: F */
    public static final C4361i f15811F = m16754d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);

    /* renamed from: G */
    public static final C4361i f15813G = m16754d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: H */
    public static final C4361i f15815H = m16754d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);

    /* renamed from: I */
    public static final C4361i f15817I = m16754d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);

    /* renamed from: J */
    public static final C4361i f15819J = m16754d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);

    /* renamed from: K */
    public static final C4361i f15821K = m16754d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: L */
    public static final C4361i f15823L = m16754d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);

    /* renamed from: M */
    public static final C4361i f15825M = m16754d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);

    /* renamed from: N */
    public static final C4361i f15827N = m16754d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);

    /* renamed from: O */
    public static final C4361i f15829O = m16754d("TLS_RSA_WITH_NULL_SHA256", 59);

    /* renamed from: P */
    public static final C4361i f15831P = m16754d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);

    /* renamed from: Q */
    public static final C4361i f15833Q = m16754d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);

    /* renamed from: R */
    public static final C4361i f15835R = m16754d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);

    /* renamed from: S */
    public static final C4361i f15837S = m16754d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);

    /* renamed from: T */
    public static final C4361i f15839T = m16754d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);

    /* renamed from: U */
    public static final C4361i f15841U = m16754d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);

    /* renamed from: V */
    public static final C4361i f15843V = m16754d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", C1417R.styleable.AppCompatTheme_textAppearanceListItem);

    /* renamed from: W */
    public static final C4361i f15845W = m16754d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", C1417R.styleable.AppCompatTheme_textAppearancePopupMenuHeader);

    /* renamed from: X */
    public static final C4361i f15847X = m16754d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", C1417R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle);

    /* renamed from: Y */
    public static final C4361i f15849Y = m16754d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);

    /* renamed from: Z */
    public static final C4361i f15851Z = m16754d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", C1417R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);

    /* renamed from: a0 */
    public static final C4361i f15853a0 = m16754d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);

    /* renamed from: b0 */
    public static final C4361i f15856b0 = m16754d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* renamed from: c0 */
    public static final C4361i f15859c0 = m16754d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* renamed from: d0 */
    public static final C4361i f15862d0 = m16754d("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* renamed from: e0 */
    public static final C4361i f15865e0 = m16754d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);

    /* renamed from: f0 */
    public static final C4361i f15868f0 = m16754d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* renamed from: g0 */
    public static final C4361i f15871g0 = m16754d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);

    /* renamed from: h0 */
    public static final C4361i f15874h0 = m16754d("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* renamed from: i0 */
    public static final C4361i f15877i0 = m16754d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: j0 */
    public static final C4361i f15880j0 = m16754d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: k0 */
    public static final C4361i f15883k0 = m16754d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* renamed from: l0 */
    public static final C4361i f15886l0 = m16754d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* renamed from: m0 */
    public static final C4361i f15889m0 = m16754d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* renamed from: n0 */
    public static final C4361i f15892n0 = m16754d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* renamed from: o0 */
    public static final C4361i f15895o0 = m16754d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* renamed from: p0 */
    public static final C4361i f15898p0 = m16754d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* renamed from: q0 */
    public static final C4361i f15901q0 = m16754d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* renamed from: r0 */
    public static final C4361i f15904r0 = m16754d("TLS_FALLBACK_SCSV", 22016);

    /* renamed from: s0 */
    public static final C4361i f15907s0 = m16754d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* renamed from: t0 */
    public static final C4361i f15909t0 = m16754d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* renamed from: u0 */
    public static final C4361i f15911u0 = m16754d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* renamed from: v0 */
    public static final C4361i f15913v0 = m16754d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* renamed from: w0 */
    public static final C4361i f15915w0 = m16754d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* renamed from: x0 */
    public static final C4361i f15917x0 = m16754d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* renamed from: y0 */
    public static final C4361i f15919y0 = m16754d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* renamed from: z0 */
    public static final C4361i f15921z0 = m16754d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);

    /* renamed from: A0 */
    public static final C4361i f15802A0 = m16754d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);

    /* renamed from: B0 */
    public static final C4361i f15804B0 = m16754d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);

    /* renamed from: C0 */
    public static final C4361i f15806C0 = m16754d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);

    /* renamed from: D0 */
    public static final C4361i f15808D0 = m16754d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);

    /* renamed from: E0 */
    public static final C4361i f15810E0 = m16754d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);

    /* renamed from: F0 */
    public static final C4361i f15812F0 = m16754d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);

    /* renamed from: G0 */
    public static final C4361i f15814G0 = m16754d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);

    /* renamed from: H0 */
    public static final C4361i f15816H0 = m16754d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);

    /* renamed from: I0 */
    public static final C4361i f15818I0 = m16754d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);

    /* renamed from: J0 */
    public static final C4361i f15820J0 = m16754d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);

    /* renamed from: K0 */
    public static final C4361i f15822K0 = m16754d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: L0 */
    public static final C4361i f15824L0 = m16754d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: M0 */
    public static final C4361i f15826M0 = m16754d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);

    /* renamed from: N0 */
    public static final C4361i f15828N0 = m16754d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);

    /* renamed from: O0 */
    public static final C4361i f15830O0 = m16754d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);

    /* renamed from: P0 */
    public static final C4361i f15832P0 = m16754d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);

    /* renamed from: Q0 */
    public static final C4361i f15834Q0 = m16754d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);

    /* renamed from: R0 */
    public static final C4361i f15836R0 = m16754d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);

    /* renamed from: S0 */
    public static final C4361i f15838S0 = m16754d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);

    /* renamed from: T0 */
    public static final C4361i f15840T0 = m16754d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);

    /* renamed from: U0 */
    public static final C4361i f15842U0 = m16754d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);

    /* renamed from: V0 */
    public static final C4361i f15844V0 = m16754d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);

    /* renamed from: W0 */
    public static final C4361i f15846W0 = m16754d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);

    /* renamed from: X0 */
    public static final C4361i f15848X0 = m16754d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);

    /* renamed from: Y0 */
    public static final C4361i f15850Y0 = m16754d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);

    /* renamed from: Z0 */
    public static final C4361i f15852Z0 = m16754d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: a1 */
    public static final C4361i f15854a1 = m16754d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: b1 */
    public static final C4361i f15857b1 = m16754d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* renamed from: c1 */
    public static final C4361i f15860c1 = m16754d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* renamed from: d1 */
    public static final C4361i f15863d1 = m16754d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: e1 */
    public static final C4361i f15866e1 = m16754d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: f1 */
    public static final C4361i f15869f1 = m16754d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* renamed from: g1 */
    public static final C4361i f15872g1 = m16754d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* renamed from: h1 */
    public static final C4361i f15875h1 = m16754d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* renamed from: i1 */
    public static final C4361i f15878i1 = m16754d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* renamed from: j1 */
    public static final C4361i f15881j1 = m16754d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: k1 */
    public static final C4361i f15884k1 = m16754d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: l1 */
    public static final C4361i f15887l1 = m16754d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* renamed from: m1 */
    public static final C4361i f15890m1 = m16754d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* renamed from: n1 */
    public static final C4361i f15893n1 = m16754d("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: o1 */
    public static final C4361i f15896o1 = m16754d("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: p1 */
    public static final C4361i f15899p1 = m16754d("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: q1 */
    public static final C4361i f15902q1 = m16754d("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: r1 */
    public static final C4361i f15905r1 = m16754d("TLS_AES_128_CCM_8_SHA256", 4869);

    public C4361i(String str) {
        Objects.requireNonNull(str);
        this.f15922a = str;
    }

    /* renamed from: b */
    public static synchronized C4361i m16752b(String str) {
        C4361i c4361i;
        synchronized (C4361i.class) {
            Map<String, C4361i> map = f15858c;
            c4361i = map.get(str);
            if (c4361i == null) {
                c4361i = map.get(m16756f(str));
                if (c4361i == null) {
                    c4361i = new C4361i(str);
                }
                map.put(str, c4361i);
            }
        }
        return c4361i;
    }

    /* renamed from: c */
    public static List<C4361i> m16753c(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m16752b(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: d */
    public static C4361i m16754d(String str, int i10) {
        C4361i c4361i = new C4361i(str);
        f15858c.put(str, c4361i);
        return c4361i;
    }

    /* renamed from: e */
    public static /* synthetic */ int m16755e(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i10 = 4; i10 < min; i10++) {
            char charAt = str.charAt(i10);
            char charAt2 = str2.charAt(i10);
            if (charAt != charAt2) {
                return charAt < charAt2 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: f */
    public static String m16756f(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    public String toString() {
        return this.f15922a;
    }
}
