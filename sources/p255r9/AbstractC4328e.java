package p255r9;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p108h6.C2394s;
import p195n7.C3767g;
import p226p9.C4090n;
import p240q9.C4217h;
import p270s9.C4557b;
import p270s9.InterfaceC4556a;

/* renamed from: r9.e */
/* loaded from: classes.dex */
public abstract class AbstractC4328e {

    /* renamed from: k */
    public static final Uri f15645k = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* renamed from: l */
    public static InterfaceC4556a f15646l = new C4557b();

    /* renamed from: a */
    public Exception f15647a;

    /* renamed from: b */
    public C4217h f15648b;

    /* renamed from: c */
    public Context f15649c;

    /* renamed from: d */
    public Map<String, List<String>> f15650d;

    /* renamed from: e */
    public int f15651e;

    /* renamed from: f */
    public String f15652f;

    /* renamed from: g */
    public int f15653g;

    /* renamed from: h */
    public InputStream f15654h;

    /* renamed from: i */
    public HttpURLConnection f15655i;

    /* renamed from: j */
    public Map<String, String> f15656j = new HashMap();

    public AbstractC4328e(C4217h c4217h, C3767g c3767g) {
        C2394s.m9619l(c4217h);
        C2394s.m9619l(c3767g);
        this.f15648b = c4217h;
        this.f15649c = c3767g.m14349m();
        m16587G("x-firebase-gmpid", c3767g.m14351r().m14364c());
    }

    /* renamed from: k */
    public static String m16580k(Uri uri) {
        String path = uri.getPath();
        return path == null ? "" : path.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) ? path.substring(1) : path;
    }

    /* renamed from: A */
    public final void m16581A(String str, String str2) {
        m16584D(str, str2);
        try {
            m16585E();
        } catch (IOException e10) {
            Log.w("NetworkRequest", "error sending network request " + mo16577e() + " " + mo16579u(), e10);
            this.f15647a = e10;
            this.f15651e = -2;
        }
        m16583C();
    }

    /* renamed from: B */
    public void m16582B(String str, String str2, Context context) {
        if (m16591d(context)) {
            m16581A(str, str2);
        }
    }

    /* renamed from: C */
    public void m16583C() {
        HttpURLConnection httpURLConnection = this.f15655i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: D */
    public void m16584D(String str, String str2) {
        if (this.f15647a != null) {
            this.f15651e = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            Log.d("NetworkRequest", "sending network request " + mo16577e() + " " + mo16579u());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f15649c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f15651e = -2;
            this.f15647a = new SocketException("Network subsystem is unavailable");
            return;
        }
        try {
            HttpURLConnection m16590c = m16590c();
            this.f15655i = m16590c;
            m16590c.setRequestMethod(mo16577e());
            m16589b(this.f15655i, str, str2);
            m16608y(this.f15655i);
            if (Log.isLoggable("NetworkRequest", 3)) {
                Log.d("NetworkRequest", "network request result " + this.f15651e);
            }
        } catch (IOException e10) {
            Log.w("NetworkRequest", "error sending network request " + mo16577e() + " " + mo16579u(), e10);
            this.f15647a = e10;
            this.f15651e = -2;
        }
    }

    /* renamed from: E */
    public final void m16585E() {
        if (m16605v()) {
            m16609z(this.f15654h);
        } else {
            m16606w(this.f15654h);
        }
    }

    /* renamed from: F */
    public final void m16586F() {
        this.f15647a = null;
        this.f15651e = 0;
    }

    /* renamed from: G */
    public void m16587G(String str, String str2) {
        this.f15656j.put(str, str2);
    }

    /* renamed from: a */
    public <TResult> void m16588a(TaskCompletionSource<TResult> taskCompletionSource, TResult tresult) {
        Exception m16592f = m16592f();
        if (m16605v() && m16592f == null) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(C4090n.m15758e(m16592f, m16599o()));
        }
    }

    /* renamed from: b */
    public final void m16589b(HttpURLConnection httpURLConnection, String str, String str2) {
        byte[] mo16594h;
        int mo16595i;
        String str3;
        C2394s.m9619l(httpURLConnection);
        if (TextUtils.isEmpty(str)) {
            Log.w("NetworkRequest", "no auth token for request");
        } else {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        }
        if (TextUtils.isEmpty(str2)) {
            Log.w("NetworkRequest", "No App Check token for request.");
        } else {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", "Android/20.3.0");
        for (Map.Entry<String, String> entry : this.f15656j.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject mo16593g = mo16593g();
        if (mo16593g != null) {
            mo16594h = mo16593g.toString().getBytes("UTF-8");
            mo16595i = mo16594h.length;
        } else {
            mo16594h = mo16594h();
            mo16595i = mo16595i();
            if (mo16595i == 0 && mo16594h != null) {
                mo16595i = mo16594h.length;
            }
        }
        if (mo16594h == null || mo16594h.length <= 0) {
            str3 = "0";
        } else {
            if (mo16593g != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            str3 = Integer.toString(mo16595i);
        }
        httpURLConnection.setRequestProperty("Content-Length", str3);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (mo16594h == null || mo16594h.length <= 0) {
            return;
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            Log.e("NetworkRequest", "Unable to write to the http request!");
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            bufferedOutputStream.write(mo16594h, 0, mo16595i);
        } finally {
            bufferedOutputStream.close();
        }
    }

    /* renamed from: c */
    public final HttpURLConnection m16590c() {
        Uri mo16579u = mo16579u();
        Map<String, String> mo16578l = mo16578l();
        if (mo16578l != null) {
            Uri.Builder buildUpon = mo16579u.buildUpon();
            for (Map.Entry<String, String> entry : mo16578l.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            mo16579u = buildUpon.build();
        }
        return f15646l.mo18016a(new URL(mo16579u.toString()));
    }

    /* renamed from: d */
    public final boolean m16591d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.f15647a = new SocketException("Network subsystem is unavailable");
        this.f15651e = -2;
        return false;
    }

    /* renamed from: e */
    public abstract String mo16577e();

    /* renamed from: f */
    public Exception m16592f() {
        return this.f15647a;
    }

    /* renamed from: g */
    public JSONObject mo16593g() {
        return null;
    }

    /* renamed from: h */
    public byte[] mo16594h() {
        return null;
    }

    /* renamed from: i */
    public int mo16595i() {
        return 0;
    }

    /* renamed from: j */
    public String m16596j() {
        return m16580k(this.f15648b.m16235a());
    }

    /* renamed from: l */
    public Map<String, String> mo16578l() {
        return null;
    }

    /* renamed from: m */
    public String m16597m() {
        return this.f15652f;
    }

    /* renamed from: n */
    public JSONObject m16598n() {
        if (TextUtils.isEmpty(this.f15652f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f15652f);
        } catch (JSONException e10) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f15652f, e10);
            return new JSONObject();
        }
    }

    /* renamed from: o */
    public int m16599o() {
        return this.f15651e;
    }

    /* renamed from: p */
    public Map<String, List<String>> m16600p() {
        return this.f15650d;
    }

    /* renamed from: q */
    public String m16601q(String str) {
        List<String> list;
        Map<String, List<String>> m16600p = m16600p();
        if (m16600p == null || (list = m16600p.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: r */
    public int m16602r() {
        return this.f15653g;
    }

    /* renamed from: s */
    public C4217h m16603s() {
        return this.f15648b;
    }

    /* renamed from: t */
    public InputStream m16604t() {
        return this.f15654h;
    }

    /* renamed from: u */
    public Uri mo16579u() {
        return this.f15648b.m16237c();
    }

    /* renamed from: v */
    public boolean m16605v() {
        int i10 = this.f15651e;
        return i10 >= 200 && i10 < 300;
    }

    /* renamed from: w */
    public void m16606w(InputStream inputStream) {
        m16607x(inputStream);
    }

    /* renamed from: x */
    public final void m16607x(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        sb2.append(readLine);
                    }
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f15652f = sb2.toString();
        if (m16605v()) {
            return;
        }
        this.f15647a = new IOException(this.f15652f);
    }

    /* renamed from: y */
    public final void m16608y(HttpURLConnection httpURLConnection) {
        C2394s.m9619l(httpURLConnection);
        this.f15651e = httpURLConnection.getResponseCode();
        this.f15650d = httpURLConnection.getHeaderFields();
        this.f15653g = httpURLConnection.getContentLength();
        this.f15654h = m16605v() ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
    }

    /* renamed from: z */
    public void m16609z(InputStream inputStream) {
        m16607x(inputStream);
    }
}
