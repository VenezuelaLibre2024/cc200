package p034c7;

import com.google.android.gms.internal.measurement.zzcd;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import p108h6.C2394s;

/* renamed from: c7.m9 */
/* loaded from: classes.dex */
public final class RunnableC0798m9 implements Runnable {

    /* renamed from: h */
    public final URL f3332h;

    /* renamed from: i */
    public final byte[] f3333i;

    /* renamed from: j */
    public final InterfaceC0756j9 f3334j;

    /* renamed from: k */
    public final String f3335k;

    /* renamed from: l */
    public final Map<String, String> f3336l;

    /* renamed from: m */
    public final /* synthetic */ C0770k9 f3337m;

    public RunnableC0798m9(C0770k9 c0770k9, String str, URL url, byte[] bArr, Map<String, String> map, InterfaceC0756j9 interfaceC0756j9) {
        this.f3337m = c0770k9;
        C2394s.m9613f(str);
        C2394s.m9619l(url);
        C2394s.m9619l(interfaceC0756j9);
        this.f3332h = url;
        this.f3333i = null;
        this.f3334j = interfaceC0756j9;
        this.f3335k = str;
        this.f3336l = null;
    }

    /* renamed from: a */
    public final /* synthetic */ void m3615a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f3334j.mo3476a(this.f3335k, i10, exc, bArr, map);
    }

    /* renamed from: b */
    public final void m3616b(final int i10, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f3337m.zzl().m3152y(new Runnable() { // from class: c7.l9
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC0798m9.this.m3615a(i10, exc, bArr, map);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] m3522q;
        this.f3337m.mo3097g();
        int i10 = 0;
        try {
            URLConnection zza = zzcd.zza().zza(this.f3332h, "client-measurement");
            if (!(zza instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) zza;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i10 = httpURLConnection.getResponseCode();
                map = httpURLConnection.getHeaderFields();
            } catch (IOException e10) {
                e = e10;
                map = null;
            } catch (Throwable th) {
                th = th;
                map = null;
            }
            try {
                C0770k9 c0770k9 = this.f3337m;
                m3522q = C0770k9.m3522q(httpURLConnection);
                httpURLConnection.disconnect();
                m3616b(i10, null, m3522q, map);
            } catch (IOException e11) {
                e = e11;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                m3616b(i10, e, null, map);
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                m3616b(i10, null, null, map);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }
}
