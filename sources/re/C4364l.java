package re;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import se.C4596e;

/* renamed from: re.l */
/* loaded from: classes2.dex */
public final class C4364l {

    /* renamed from: e */
    public static final C4361i[] f15924e;

    /* renamed from: f */
    public static final C4361i[] f15925f;

    /* renamed from: g */
    public static final C4364l f15926g;

    /* renamed from: h */
    public static final C4364l f15927h;

    /* renamed from: i */
    public static final C4364l f15928i;

    /* renamed from: j */
    public static final C4364l f15929j;

    /* renamed from: a */
    public final boolean f15930a;

    /* renamed from: b */
    public final boolean f15931b;

    /* renamed from: c */
    public final String[] f15932c;

    /* renamed from: d */
    public final String[] f15933d;

    /* renamed from: re.l$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public boolean f15934a;

        /* renamed from: b */
        public String[] f15935b;

        /* renamed from: c */
        public String[] f15936c;

        /* renamed from: d */
        public boolean f15937d;

        public a(C4364l c4364l) {
            this.f15934a = c4364l.f15930a;
            this.f15935b = c4364l.f15932c;
            this.f15936c = c4364l.f15933d;
            this.f15937d = c4364l.f15931b;
        }

        public a(boolean z10) {
            this.f15934a = z10;
        }

        /* renamed from: a */
        public C4364l m16764a() {
            return new C4364l(this);
        }

        /* renamed from: b */
        public a m16765b(String... strArr) {
            if (!this.f15934a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f15935b = (String[]) strArr.clone();
            return this;
        }

        /* renamed from: c */
        public a m16766c(C4361i... c4361iArr) {
            if (!this.f15934a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[c4361iArr.length];
            for (int i10 = 0; i10 < c4361iArr.length; i10++) {
                strArr[i10] = c4361iArr[i10].f15922a;
            }
            return m16765b(strArr);
        }

        /* renamed from: d */
        public a m16767d(boolean z10) {
            if (!this.f15934a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f15937d = z10;
            return this;
        }

        /* renamed from: e */
        public a m16768e(String... strArr) {
            if (!this.f15934a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f15936c = (String[]) strArr.clone();
            return this;
        }

        /* renamed from: f */
        public a m16769f(EnumC4359g0... enumC4359g0Arr) {
            if (!this.f15934a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[enumC4359g0Arr.length];
            for (int i10 = 0; i10 < enumC4359g0Arr.length; i10++) {
                strArr[i10] = enumC4359g0Arr[i10].f15799h;
            }
            return m16768e(strArr);
        }
    }

    static {
        C4361i c4361i = C4361i.f15893n1;
        C4361i c4361i2 = C4361i.f15896o1;
        C4361i c4361i3 = C4361i.f15899p1;
        C4361i c4361i4 = C4361i.f15852Z0;
        C4361i c4361i5 = C4361i.f15863d1;
        C4361i c4361i6 = C4361i.f15854a1;
        C4361i c4361i7 = C4361i.f15866e1;
        C4361i c4361i8 = C4361i.f15884k1;
        C4361i c4361i9 = C4361i.f15881j1;
        C4361i[] c4361iArr = {c4361i, c4361i2, c4361i3, c4361i4, c4361i5, c4361i6, c4361i7, c4361i8, c4361i9};
        f15924e = c4361iArr;
        C4361i[] c4361iArr2 = {c4361i, c4361i2, c4361i3, c4361i4, c4361i5, c4361i6, c4361i7, c4361i8, c4361i9, C4361i.f15822K0, C4361i.f15824L0, C4361i.f15877i0, C4361i.f15880j0, C4361i.f15813G, C4361i.f15821K, C4361i.f15882k};
        f15925f = c4361iArr2;
        a m16766c = new a(true).m16766c(c4361iArr);
        EnumC4359g0 enumC4359g0 = EnumC4359g0.TLS_1_3;
        EnumC4359g0 enumC4359g02 = EnumC4359g0.TLS_1_2;
        f15926g = m16766c.m16769f(enumC4359g0, enumC4359g02).m16767d(true).m16764a();
        f15927h = new a(true).m16766c(c4361iArr2).m16769f(enumC4359g0, enumC4359g02).m16767d(true).m16764a();
        f15928i = new a(true).m16766c(c4361iArr2).m16769f(enumC4359g0, enumC4359g02, EnumC4359g0.TLS_1_1, EnumC4359g0.TLS_1_0).m16767d(true).m16764a();
        f15929j = new a(false).m16764a();
    }

    public C4364l(a aVar) {
        this.f15930a = aVar.f15934a;
        this.f15932c = aVar.f15935b;
        this.f15933d = aVar.f15936c;
        this.f15931b = aVar.f15937d;
    }

    /* renamed from: a */
    public void m16757a(SSLSocket sSLSocket, boolean z10) {
        C4364l m16761e = m16761e(sSLSocket, z10);
        String[] strArr = m16761e.f15933d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = m16761e.f15932c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: b */
    public List<C4361i> m16758b() {
        String[] strArr = this.f15932c;
        if (strArr != null) {
            return C4361i.m16753c(strArr);
        }
        return null;
    }

    /* renamed from: c */
    public boolean m16759c(SSLSocket sSLSocket) {
        if (!this.f15930a) {
            return false;
        }
        String[] strArr = this.f15933d;
        if (strArr != null && !C4596e.m18082B(C4596e.f17239j, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f15932c;
        return strArr2 == null || C4596e.m18082B(C4361i.f15855b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    /* renamed from: d */
    public boolean m16760d() {
        return this.f15930a;
    }

    /* renamed from: e */
    public final C4364l m16761e(SSLSocket sSLSocket, boolean z10) {
        String[] m18117y = this.f15932c != null ? C4596e.m18117y(C4361i.f15855b, sSLSocket.getEnabledCipherSuites(), this.f15932c) : sSLSocket.getEnabledCipherSuites();
        String[] m18117y2 = this.f15933d != null ? C4596e.m18117y(C4596e.f17239j, sSLSocket.getEnabledProtocols(), this.f15933d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int m18114v = C4596e.m18114v(C4361i.f15855b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && m18114v != -1) {
            m18117y = C4596e.m18100h(m18117y, supportedCipherSuites[m18114v]);
        }
        return new a(this).m16765b(m18117y).m16768e(m18117y2).m16764a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4364l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4364l c4364l = (C4364l) obj;
        boolean z10 = this.f15930a;
        if (z10 != c4364l.f15930a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f15932c, c4364l.f15932c) && Arrays.equals(this.f15933d, c4364l.f15933d) && this.f15931b == c4364l.f15931b);
    }

    /* renamed from: f */
    public boolean m16762f() {
        return this.f15931b;
    }

    /* renamed from: g */
    public List<EnumC4359g0> m16763g() {
        String[] strArr = this.f15933d;
        if (strArr != null) {
            return EnumC4359g0.m16750c(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f15930a) {
            return ((((527 + Arrays.hashCode(this.f15932c)) * 31) + Arrays.hashCode(this.f15933d)) * 31) + (!this.f15931b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f15930a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m16758b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m16763g(), "[all enabled]") + ", supportsTlsExtensions=" + this.f15931b + ")";
    }
}
