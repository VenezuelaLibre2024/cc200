package p061e3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p045d3.C1531c;
import p061e3.C1648d;
import p076f3.AbstractC1804a;
import p076f3.AbstractC1813j;
import p076f3.AbstractC1814k;
import p076f3.AbstractC1815l;
import p076f3.AbstractC1816m;
import p076f3.AbstractC1817n;
import p076f3.AbstractC1818o;
import p076f3.EnumC1819p;
import p093g3.AbstractC1971i;
import p093g3.C1970h;
import p105h3.AbstractC2291f;
import p105h3.AbstractC2292g;
import p105h3.InterfaceC2298m;
import p151k3.C3347a;
import p166l3.C3428b;
import p166l3.InterfaceC3427a;
import p166l3.InterfaceC3429c;
import p234q3.InterfaceC4157a;
import p239q8.C4204c;
import p239q8.InterfaceC4202a;

/* renamed from: e3.d */
/* loaded from: classes.dex */
public final class C1648d implements InterfaceC2298m {

    /* renamed from: a */
    public final InterfaceC4202a f6072a;

    /* renamed from: b */
    public final ConnectivityManager f6073b;

    /* renamed from: c */
    public final Context f6074c;

    /* renamed from: d */
    public final URL f6075d;

    /* renamed from: e */
    public final InterfaceC4157a f6076e;

    /* renamed from: f */
    public final InterfaceC4157a f6077f;

    /* renamed from: g */
    public final int f6078g;

    /* renamed from: e3.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final URL f6079a;

        /* renamed from: b */
        public final AbstractC1813j f6080b;

        /* renamed from: c */
        public final String f6081c;

        public a(URL url, AbstractC1813j abstractC1813j, String str) {
            this.f6079a = url;
            this.f6080b = abstractC1813j;
            this.f6081c = str;
        }

        /* renamed from: a */
        public a m6548a(URL url) {
            return new a(url, this.f6080b, this.f6081c);
        }
    }

    /* renamed from: e3.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f6082a;

        /* renamed from: b */
        public final URL f6083b;

        /* renamed from: c */
        public final long f6084c;

        public b(int i10, URL url, long j10) {
            this.f6082a = i10;
            this.f6083b = url;
            this.f6084c = j10;
        }
    }

    public C1648d(Context context, InterfaceC4157a interfaceC4157a, InterfaceC4157a interfaceC4157a2) {
        this(context, interfaceC4157a, interfaceC4157a2, 130000);
    }

    public C1648d(Context context, InterfaceC4157a interfaceC4157a, InterfaceC4157a interfaceC4157a2, int i10) {
        this.f6072a = AbstractC1813j.m7374b();
        this.f6074c = context;
        this.f6073b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f6075d = m6543n(C1645a.f6062c);
        this.f6076e = interfaceC4157a2;
        this.f6077f = interfaceC4157a;
        this.f6078g = i10;
    }

    /* renamed from: f */
    public static int m6536f(NetworkInfo networkInfo) {
        AbstractC1818o.b bVar;
        if (networkInfo == null) {
            bVar = AbstractC1818o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (AbstractC1818o.b.m7385b(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            bVar = AbstractC1818o.b.COMBINED;
        }
        return bVar.m7386c();
    }

    /* renamed from: g */
    public static int m6537g(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC1818o.c.NONE.m7388c() : networkInfo.getType();
    }

    /* renamed from: h */
    public static int m6538h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            C3347a.m12406d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    /* renamed from: j */
    public static TelephonyManager m6539j(Context context) {
        return (TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
    }

    /* renamed from: k */
    public static long m6540k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* renamed from: l */
    public static /* synthetic */ a m6541l(a aVar, b bVar) {
        URL url = bVar.f6083b;
        if (url == null) {
            return null;
        }
        C3347a.m12404b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m6548a(bVar.f6083b);
    }

    /* renamed from: m */
    public static InputStream m6542m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: n */
    public static URL m6543n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // p105h3.InterfaceC2298m
    /* renamed from: a */
    public AbstractC2292g mo6544a(AbstractC2291f abstractC2291f) {
        AbstractC1813j m6547i = m6547i(abstractC2291f);
        URL url = this.f6075d;
        if (abstractC2291f.mo9295c() != null) {
            try {
                C1645a m6526e = C1645a.m6526e(abstractC2291f.mo9295c());
                r3 = m6526e.m6531f() != null ? m6526e.m6531f() : null;
                if (m6526e.m6532g() != null) {
                    url = m6543n(m6526e.m6532g());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC2292g.m9306a();
            }
        }
        try {
            b bVar = (b) C3428b.m12773a(5, new a(url, m6547i, r3), new InterfaceC3427a() { // from class: e3.b
                @Override // p166l3.InterfaceC3427a
                public final Object apply(Object obj) {
                    C1648d.b m6546e;
                    m6546e = C1648d.this.m6546e((C1648d.a) obj);
                    return m6546e;
                }
            }, new InterfaceC3429c() { // from class: e3.c
                @Override // p166l3.InterfaceC3429c
                /* renamed from: a */
                public final Object mo6533a(Object obj, Object obj2) {
                    C1648d.a m6541l;
                    m6541l = C1648d.m6541l((C1648d.a) obj, (C1648d.b) obj2);
                    return m6541l;
                }
            });
            int i10 = bVar.f6082a;
            if (i10 == 200) {
                return AbstractC2292g.m9308e(bVar.f6084c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? AbstractC2292g.m9307d() : AbstractC2292g.m9306a();
            }
            return AbstractC2292g.m9309f();
        } catch (IOException e10) {
            C3347a.m12406d("CctTransportBackend", "Could not make request to the backend", e10);
            return AbstractC2292g.m9309f();
        }
    }

    @Override // p105h3.InterfaceC2298m
    /* renamed from: b */
    public AbstractC1971i mo6545b(AbstractC1971i abstractC1971i) {
        NetworkInfo activeNetworkInfo = this.f6073b.getActiveNetworkInfo();
        return abstractC1971i.m7985l().m7986a("sdk-version", Build.VERSION.SDK_INT).m7988c("model", Build.MODEL).m7988c("hardware", Build.HARDWARE).m7988c("device", Build.DEVICE).m7988c("product", Build.PRODUCT).m7988c("os-uild", Build.ID).m7988c("manufacturer", Build.MANUFACTURER).m7988c("fingerprint", Build.FINGERPRINT).m7987b("tz-offset", m6540k()).m7986a("net-type", m6537g(activeNetworkInfo)).m7986a("mobile-subtype", m6536f(activeNetworkInfo)).m7988c("country", Locale.getDefault().getCountry()).m7988c("locale", Locale.getDefault().getLanguage()).m7988c("mcc_mnc", m6539j(this.f6074c).getSimOperator()).m7988c("application_build", Integer.toString(m6538h(this.f6074c))).mo7945d();
    }

    /* renamed from: e */
    public final b m6546e(a aVar) {
        C3347a.m12408f("CctTransportBackend", "Making request to: %s", aVar.f6079a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f6079a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f6078g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f6081c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f6072a.mo16194a(aVar.f6080b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    C3347a.m12408f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    C3347a.m12404b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    C3347a.m12404b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m6542m = m6542m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC1817n.m7383b(new BufferedReader(new InputStreamReader(m6542m))).mo7367c());
                            if (m6542m != null) {
                                m6542m.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e10) {
            e = e10;
            C3347a.m12406d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            C3347a.m12406d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            C3347a.m12406d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (C4204c e13) {
            e = e13;
            C3347a.m12406d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    /* renamed from: i */
    public final AbstractC1813j m6547i(AbstractC2291f abstractC2291f) {
        AbstractC1815l.a m7378j;
        HashMap hashMap = new HashMap();
        for (AbstractC1971i abstractC1971i : abstractC2291f.mo9294b()) {
            String mo7943j = abstractC1971i.mo7943j();
            if (hashMap.containsKey(mo7943j)) {
                ((List) hashMap.get(mo7943j)).add(abstractC1971i);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC1971i);
                hashMap.put(mo7943j, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC1971i abstractC1971i2 = (AbstractC1971i) ((List) entry.getValue()).get(0);
            AbstractC1816m.a mo7360b = AbstractC1816m.m7379a().mo7364f(EnumC1819p.DEFAULT).mo7365g(this.f6077f.mo16002a()).mo7366h(this.f6076e.mo16002a()).mo7360b(AbstractC1814k.m7375a().mo7336c(AbstractC1814k.b.ANDROID_FIREBASE).mo7335b(AbstractC1804a.m7297a().mo7322m(Integer.valueOf(abstractC1971i2.m7982g("sdk-version"))).mo7319j(abstractC1971i2.m7981b("model")).mo7315f(abstractC1971i2.m7981b("hardware")).mo7313d(abstractC1971i2.m7981b("device")).mo7321l(abstractC1971i2.m7981b("product")).mo7320k(abstractC1971i2.m7981b("os-uild")).mo7317h(abstractC1971i2.m7981b("manufacturer")).mo7314e(abstractC1971i2.m7981b("fingerprint")).mo7312c(abstractC1971i2.m7981b("country")).mo7316g(abstractC1971i2.m7981b("locale")).mo7318i(abstractC1971i2.m7981b("mcc_mnc")).mo7311b(abstractC1971i2.m7981b("application_build")).mo7310a()).mo7334a());
            try {
                mo7360b.m7380i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                mo7360b.m7381j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC1971i abstractC1971i3 : (List) entry.getValue()) {
                C1970h mo7941e = abstractC1971i3.mo7941e();
                C1531c m7979b = mo7941e.m7979b();
                if (m7979b.equals(C1531c.m6232b("proto"))) {
                    m7378j = AbstractC1815l.m7378j(mo7941e.m7978a());
                } else if (m7979b.equals(C1531c.m6232b("json"))) {
                    m7378j = AbstractC1815l.m7377i(new String(mo7941e.m7978a(), Charset.forName("UTF-8")));
                } else {
                    C3347a.m12409g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m7979b);
                }
                m7378j.mo7346c(abstractC1971i3.mo7942f()).mo7347d(abstractC1971i3.mo7944k()).mo7351h(abstractC1971i3.m7983h("tz-offset")).mo7348e(AbstractC1818o.m7384a().mo7372c(AbstractC1818o.c.m7387b(abstractC1971i3.m7982g("net-type"))).mo7371b(AbstractC1818o.b.m7385b(abstractC1971i3.m7982g("mobile-subtype"))).mo7370a());
                if (abstractC1971i3.mo7940d() != null) {
                    m7378j.mo7345b(abstractC1971i3.mo7940d());
                }
                arrayList3.add(m7378j.mo7344a());
            }
            mo7360b.mo7361c(arrayList3);
            arrayList2.add(mo7360b.mo7359a());
        }
        return AbstractC1813j.m7373a(arrayList2);
    }
}
