package p206o5;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import p109h7.InterfaceC2433p;
import p126i7.AbstractC2641p;
import p126i7.AbstractC2653v;
import p126i7.C2660y0;
import p206o5.InterfaceC3910j;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: o5.s */
/* loaded from: classes.dex */
public class C3924s extends AbstractC3902f {

    /* renamed from: e */
    public final boolean f14150e;

    /* renamed from: f */
    public final int f14151f;

    /* renamed from: g */
    public final int f14152g;

    /* renamed from: h */
    public final String f14153h;

    /* renamed from: i */
    public final C3895b0 f14154i;

    /* renamed from: j */
    public final C3895b0 f14155j;

    /* renamed from: k */
    public final boolean f14156k;

    /* renamed from: l */
    public InterfaceC2433p<String> f14157l;

    /* renamed from: m */
    public C3918n f14158m;

    /* renamed from: n */
    public HttpURLConnection f14159n;

    /* renamed from: o */
    public InputStream f14160o;

    /* renamed from: p */
    public boolean f14161p;

    /* renamed from: q */
    public int f14162q;

    /* renamed from: r */
    public long f14163r;

    /* renamed from: s */
    public long f14164s;

    /* renamed from: o5.s$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC3910j.a {

        /* renamed from: b */
        public InterfaceC3917m0 f14166b;

        /* renamed from: c */
        public InterfaceC2433p<String> f14167c;

        /* renamed from: d */
        public String f14168d;

        /* renamed from: g */
        public boolean f14171g;

        /* renamed from: h */
        public boolean f14172h;

        /* renamed from: a */
        public final C3895b0 f14165a = new C3895b0();

        /* renamed from: e */
        public int f14169e = 8000;

        /* renamed from: f */
        public int f14170f = 8000;

        @Override // p206o5.InterfaceC3910j.a
        /* renamed from: b */
        public C3924s mo14830a() {
            C3924s c3924s = new C3924s(this.f14168d, this.f14169e, this.f14170f, this.f14171g, this.f14165a, this.f14167c, this.f14172h);
            InterfaceC3917m0 interfaceC3917m0 = this.f14166b;
            if (interfaceC3917m0 != null) {
                c3924s.mo14820g(interfaceC3917m0);
            }
            return c3924s;
        }

        /* renamed from: c */
        public b m14902c(boolean z10) {
            this.f14171g = z10;
            return this;
        }

        /* renamed from: d */
        public final b m14903d(Map<String, String> map) {
            this.f14165a.m14767a(map);
            return this;
        }

        /* renamed from: e */
        public b m14904e(String str) {
            this.f14168d = str;
            return this;
        }
    }

    /* renamed from: o5.s$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC2641p<String, List<String>> {

        /* renamed from: h */
        public final Map<String, List<String>> f14173h;

        public c(Map<String, List<String>> map) {
            this.f14173h = map;
        }

        /* renamed from: i */
        public static /* synthetic */ boolean m14907i(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* renamed from: j */
        public static /* synthetic */ boolean m14908j(String str) {
            return str != null;
        }

        @Override // p126i7.AbstractC2643q
        /* renamed from: b */
        public Map<String, List<String>> mo10729a() {
            return this.f14173h;
        }

        @Override // p126i7.AbstractC2641p, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.m10721c(obj);
        }

        @Override // p126i7.AbstractC2641p, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return C2660y0.m10835b(super.entrySet(), C3926u.f14175h);
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.m10722d(obj);
        }

        @Override // p126i7.AbstractC2641p, java.util.Map
        /* renamed from: h */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.m10723e();
        }

        @Override // p126i7.AbstractC2641p, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // p126i7.AbstractC2641p, java.util.Map
        public Set<String> keySet() {
            return C2660y0.m10835b(super.keySet(), C3925t.f14174h);
        }

        @Override // p126i7.AbstractC2641p, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public C3924s(String str, int i10, int i11, boolean z10, C3895b0 c3895b0, InterfaceC2433p<String> interfaceC2433p, boolean z11) {
        super(true);
        this.f14153h = str;
        this.f14151f = i10;
        this.f14152g = i11;
        this.f14150e = z10;
        this.f14154i = c3895b0;
        this.f14157l = interfaceC2433p;
        this.f14155j = new C3895b0();
        this.f14156k = z11;
    }

    public /* synthetic */ C3924s(String str, int i10, int i11, boolean z10, C3895b0 c3895b0, InterfaceC2433p interfaceC2433p, boolean z11, a aVar) {
        this(str, i10, i11, z10, c3895b0, interfaceC2433p, z11);
    }

    /* renamed from: w */
    public static boolean m14892w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* renamed from: z */
    public static void m14893z(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = C4041n0.f14513a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) C4014a.m15199e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: A */
    public HttpURLConnection m14894A(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: B */
    public final int m14895B(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14163r;
        if (j10 != -1) {
            long j11 = j10 - this.f14164s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) C4041n0.m15463j(this.f14160o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f14164s += read;
        m14821q(read);
        return read;
    }

    /* renamed from: C */
    public final void m14896C(long j10, C3918n c3918n) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int read = ((InputStream) C4041n0.m15463j(this.f14160o)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new C3930y(new InterruptedIOException(), c3918n, 2000, 1);
            }
            if (read == -1) {
                throw new C3930y(c3918n, 2008, 1);
            }
            j10 -= read;
            m14821q(read);
        }
    }

    @Override // p206o5.InterfaceC3906h
    /* renamed from: c */
    public int mo14769c(byte[] bArr, int i10, int i11) {
        try {
            return m14895B(bArr, i10, i11);
        } catch (IOException e10) {
            throw C3930y.m14915c(e10, (C3918n) C4041n0.m15463j(this.f14158m), 2);
        }
    }

    @Override // p206o5.InterfaceC3910j
    public void close() {
        try {
            InputStream inputStream = this.f14160o;
            if (inputStream != null) {
                long j10 = this.f14163r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f14164s;
                }
                m14893z(this.f14159n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new C3930y(e10, (C3918n) C4041n0.m15463j(this.f14158m), 2000, 3);
                }
            }
        } finally {
            this.f14160o = null;
            m14897u();
            if (this.f14161p) {
                this.f14161p = false;
                m14822r();
            }
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: j */
    public Map<String, List<String>> mo14829j() {
        HttpURLConnection httpURLConnection = this.f14159n;
        return httpURLConnection == null ? AbstractC2653v.m10800j() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: k */
    public long mo14770k(C3918n c3918n) {
        byte[] bArr;
        this.f14158m = c3918n;
        long j10 = 0;
        this.f14164s = 0L;
        this.f14163r = 0L;
        m14823s(c3918n);
        try {
            HttpURLConnection m14900y = m14900y(c3918n);
            this.f14159n = m14900y;
            this.f14162q = m14900y.getResponseCode();
            String responseMessage = m14900y.getResponseMessage();
            int i10 = this.f14162q;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = m14900y.getHeaderFields();
                if (this.f14162q == 416) {
                    if (c3918n.f14077g == C3897c0.m14774c(m14900y.getHeaderField("Content-Range"))) {
                        this.f14161p = true;
                        m14824t(c3918n);
                        long j11 = c3918n.f14078h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = m14900y.getErrorStream();
                try {
                    bArr = errorStream != null ? C4041n0.m15434U0(errorStream) : C4041n0.f14518f;
                } catch (IOException unused) {
                    bArr = C4041n0.f14518f;
                }
                byte[] bArr2 = bArr;
                m14897u();
                throw new C3893a0(this.f14162q, responseMessage, this.f14162q == 416 ? new C3912k(2008) : null, headerFields, c3918n, bArr2);
            }
            String contentType = m14900y.getContentType();
            InterfaceC2433p<String> interfaceC2433p = this.f14157l;
            if (interfaceC2433p != null && !interfaceC2433p.apply(contentType)) {
                m14897u();
                throw new C3931z(contentType, c3918n);
            }
            if (this.f14162q == 200) {
                long j12 = c3918n.f14077g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean m14892w = m14892w(m14900y);
            if (m14892w) {
                this.f14163r = c3918n.f14078h;
            } else {
                long j13 = c3918n.f14078h;
                if (j13 != -1) {
                    this.f14163r = j13;
                } else {
                    long m14773b = C3897c0.m14773b(m14900y.getHeaderField("Content-Length"), m14900y.getHeaderField("Content-Range"));
                    this.f14163r = m14773b != -1 ? m14773b - j10 : -1L;
                }
            }
            try {
                this.f14160o = m14900y.getInputStream();
                if (m14892w) {
                    this.f14160o = new GZIPInputStream(this.f14160o);
                }
                this.f14161p = true;
                m14824t(c3918n);
                try {
                    m14896C(j10, c3918n);
                    return this.f14163r;
                } catch (IOException e10) {
                    m14897u();
                    if (e10 instanceof C3930y) {
                        throw ((C3930y) e10);
                    }
                    throw new C3930y(e10, c3918n, 2000, 1);
                }
            } catch (IOException e11) {
                m14897u();
                throw new C3930y(e11, c3918n, 2000, 1);
            }
        } catch (IOException e12) {
            m14897u();
            throw C3930y.m14915c(e12, c3918n, 1);
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: o */
    public Uri mo14771o() {
        HttpURLConnection httpURLConnection = this.f14159n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: u */
    public final void m14897u() {
        HttpURLConnection httpURLConnection = this.f14159n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                C4046r.m15524d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f14159n = null;
        }
    }

    /* renamed from: v */
    public final URL m14898v(URL url, String str, C3918n c3918n) {
        if (str == null) {
            throw new C3930y("Null location redirect", c3918n, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C3930y("Unsupported protocol redirect: " + protocol, c3918n, 2001, 1);
            }
            if (this.f14150e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C3930y("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c3918n, 2001, 1);
        } catch (MalformedURLException e10) {
            throw new C3930y(e10, c3918n, 2001, 1);
        }
    }

    /* renamed from: x */
    public final HttpURLConnection m14899x(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) {
        HttpURLConnection m14894A = m14894A(url);
        m14894A.setConnectTimeout(this.f14151f);
        m14894A.setReadTimeout(this.f14152g);
        HashMap hashMap = new HashMap();
        C3895b0 c3895b0 = this.f14154i;
        if (c3895b0 != null) {
            hashMap.putAll(c3895b0.m14768b());
        }
        hashMap.putAll(this.f14155j.m14768b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            m14894A.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String m14772a = C3897c0.m14772a(j10, j11);
        if (m14772a != null) {
            m14894A.setRequestProperty("Range", m14772a);
        }
        String str = this.f14153h;
        if (str != null) {
            m14894A.setRequestProperty("User-Agent", str);
        }
        m14894A.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        m14894A.setInstanceFollowRedirects(z11);
        m14894A.setDoOutput(bArr != null);
        m14894A.setRequestMethod(C3918n.m14852c(i10));
        if (bArr != null) {
            m14894A.setFixedLengthStreamingMode(bArr.length);
            m14894A.connect();
            OutputStream outputStream = m14894A.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            m14894A.connect();
        }
        return m14894A;
    }

    /* renamed from: y */
    public final HttpURLConnection m14900y(C3918n c3918n) {
        HttpURLConnection m14899x;
        URL url = new URL(c3918n.f14071a.toString());
        int i10 = c3918n.f14073c;
        byte[] bArr = c3918n.f14074d;
        long j10 = c3918n.f14077g;
        long j11 = c3918n.f14078h;
        boolean m14855d = c3918n.m14855d(1);
        if (!this.f14150e && !this.f14156k) {
            return m14899x(url, i10, bArr, j10, j11, m14855d, true, c3918n.f14075e);
        }
        URL url2 = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new C3930y(new NoRouteToHostException("Too many redirects: " + i13), c3918n, 2001, 1);
            }
            int i14 = i11;
            long j12 = j10;
            URL url3 = url2;
            long j13 = j11;
            m14899x = m14899x(url2, i11, bArr2, j10, j11, m14855d, false, c3918n.f14075e);
            int responseCode = m14899x.getResponseCode();
            String headerField = m14899x.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                m14899x.disconnect();
                url2 = m14898v(url3, headerField, c3918n);
                i11 = i14;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                m14899x.disconnect();
                if (this.f14156k && responseCode == 302) {
                    i11 = i14;
                } else {
                    bArr2 = null;
                    i11 = 1;
                }
                url2 = m14898v(url3, headerField, c3918n);
            }
            i12 = i13;
            j10 = j12;
            j11 = j13;
        }
        return m14899x;
    }
}
