package p061e3;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p045d3.C1531c;
import p093g3.InterfaceC1969g;

/* renamed from: e3.a */
/* loaded from: classes.dex */
public final class C1645a implements InterfaceC1969g {

    /* renamed from: c */
    public static final String f6062c;

    /* renamed from: d */
    public static final String f6063d;

    /* renamed from: e */
    public static final String f6064e;

    /* renamed from: f */
    public static final Set<C1531c> f6065f;

    /* renamed from: g */
    public static final C1645a f6066g;

    /* renamed from: h */
    public static final C1645a f6067h;

    /* renamed from: a */
    public final String f6068a;

    /* renamed from: b */
    public final String f6069b;

    static {
        String m6549a = C1649e.m6549a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f6062c = m6549a;
        String m6549a2 = C1649e.m6549a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f6063d = m6549a2;
        String m6549a3 = C1649e.m6549a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f6064e = m6549a3;
        f6065f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C1531c.m6232b("proto"), C1531c.m6232b("json"))));
        f6066g = new C1645a(m6549a, null);
        f6067h = new C1645a(m6549a2, m6549a3);
    }

    public C1645a(String str, String str2) {
        this.f6068a = str;
        this.f6069b = str2;
    }

    /* renamed from: e */
    public static C1645a m6526e(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C1645a(str2, str3);
    }

    @Override // p093g3.InterfaceC1969g
    /* renamed from: a */
    public Set<C1531c> mo6527a() {
        return f6065f;
    }

    @Override // p093g3.InterfaceC1968f
    /* renamed from: b */
    public String mo6528b() {
        return "cct";
    }

    @Override // p093g3.InterfaceC1968f
    /* renamed from: c */
    public byte[] mo6529c() {
        return m6530d();
    }

    /* renamed from: d */
    public byte[] m6530d() {
        String str = this.f6069b;
        if (str == null && this.f6068a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f6068a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: f */
    public String m6531f() {
        return this.f6069b;
    }

    /* renamed from: g */
    public String m6532g() {
        return this.f6068a;
    }
}
