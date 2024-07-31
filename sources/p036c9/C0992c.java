package p036c9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p036c9.AbstractC0993d;
import p036c9.AbstractC0995f;
import p108h6.C2394s;
import p207o6.C3932a;
import p207o6.C3940i;
import p309v8.InterfaceC5149i;
import p354y8.InterfaceC5896b;
import p369z8.C6085i;

/* renamed from: c9.c */
/* loaded from: classes.dex */
public class C0992c {

    /* renamed from: d */
    public static final Pattern f3887d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    public static final Charset f3888e = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f3889a;

    /* renamed from: b */
    public final InterfaceC5896b<InterfaceC5149i> f3890b;

    /* renamed from: c */
    public final C0994e f3891c = new C0994e();

    public C0992c(Context context, InterfaceC5896b<InterfaceC5149i> interfaceC5896b) {
        this.f3889a = context;
        this.f3890b = interfaceC5896b;
    }

    /* renamed from: a */
    public static String m4162a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    public static JSONObject m4163b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: c */
    public static JSONObject m4164c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: h */
    public static byte[] m4165h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    public static boolean m4166i(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    /* renamed from: j */
    public static void m4167j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    public static void m4168k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String m4170o = m4170o(httpURLConnection);
        if (TextUtils.isEmpty(m4170o)) {
            return;
        }
        Log.w("Firebase-Installations", m4170o);
        Log.w("Firebase-Installations", m4162a(str, str2, str3));
    }

    @VisibleForTesting
    /* renamed from: m */
    public static long m4169m(String str) {
        C2394s.m9609b(f3887d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: o */
    public static String m4170o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f3888e));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    /* renamed from: s */
    public static void m4171s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public AbstractC0993d m4172d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        AbstractC0993d m4177n;
        if (!this.f3891c.m4185b()) {
            throw new C6085i("Firebase Installations Service is unavailable. Please try again later.", C6085i.a.UNAVAILABLE);
        }
        URL m4175g = m4175g(String.format("projects/%s/installations", str3));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection m4176l = m4176l(m4175g, str);
            try {
                try {
                    m4176l.setRequestMethod("POST");
                    m4176l.setDoOutput(true);
                    if (str5 != null) {
                        m4176l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m4179q(m4176l, str2, str4);
                    responseCode = m4176l.getResponseCode();
                    this.f3891c.m4187f(responseCode);
                } finally {
                    m4176l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (m4166i(responseCode)) {
                m4177n = m4177n(m4176l);
            } else {
                m4168k(m4176l, str4, str, str3);
                if (responseCode == 429) {
                    throw new C6085i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C6085i.a.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    m4167j();
                    m4177n = AbstractC0993d.m4181a().mo4153e(AbstractC0993d.b.BAD_CONFIG).mo4149a();
                } else {
                    m4176l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            return m4177n;
        }
        throw new C6085i("Firebase Installations Service is unavailable. Please try again later.", C6085i.a.UNAVAILABLE);
    }

    /* renamed from: e */
    public AbstractC0995f m4173e(String str, String str2, String str3, String str4) {
        int responseCode;
        AbstractC0995f m4178p;
        AbstractC0995f.a mo4159b;
        if (!this.f3891c.m4185b()) {
            throw new C6085i("Firebase Installations Service is unavailable. Please try again later.", C6085i.a.UNAVAILABLE);
        }
        URL m4175g = m4175g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection m4176l = m4176l(m4175g, str);
            try {
                try {
                    m4176l.setRequestMethod("POST");
                    m4176l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m4176l.setDoOutput(true);
                    m4180r(m4176l);
                    responseCode = m4176l.getResponseCode();
                    this.f3891c.m4187f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (m4166i(responseCode)) {
                    m4178p = m4178p(m4176l);
                } else {
                    m4168k(m4176l, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new C6085i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C6085i.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            m4167j();
                            mo4159b = AbstractC0995f.m4188a().mo4159b(AbstractC0995f.b.BAD_CONFIG);
                            m4178p = mo4159b.mo4158a();
                        } else {
                            m4176l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    mo4159b = AbstractC0995f.m4188a().mo4159b(AbstractC0995f.b.AUTH_ERROR);
                    m4178p = mo4159b.mo4158a();
                }
                return m4178p;
            } finally {
                m4176l.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new C6085i("Firebase Installations Service is unavailable. Please try again later.", C6085i.a.UNAVAILABLE);
    }

    /* renamed from: f */
    public final String m4174f() {
        try {
            Context context = this.f3889a;
            byte[] m14916a = C3932a.m14916a(context, context.getPackageName());
            if (m14916a != null) {
                return C3940i.m14948c(m14916a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f3889a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ContentValues", "No such package: " + this.f3889a.getPackageName(), e10);
            return null;
        }
    }

    /* renamed from: g */
    public final URL m4175g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new C6085i(e10.getMessage(), C6085i.a.UNAVAILABLE);
        }
    }

    /* renamed from: l */
    public final HttpURLConnection m4176l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f3889a.getPackageName());
            InterfaceC5149i interfaceC5149i = this.f3890b.get();
            if (interfaceC5149i != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(interfaceC5149i.mo20828a()));
                } catch (InterruptedException e10) {
                    e = e10;
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                    httpURLConnection.addRequestProperty("X-Android-Cert", m4174f());
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                } catch (ExecutionException e11) {
                    e = e11;
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                    httpURLConnection.addRequestProperty("X-Android-Cert", m4174f());
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m4174f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C6085i("Firebase Installations Service is unavailable. Please try again later.", C6085i.a.UNAVAILABLE);
        }
    }

    /* renamed from: n */
    public final AbstractC0993d m4177n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f3888e));
        AbstractC0995f.a m4188a = AbstractC0995f.m4188a();
        AbstractC0993d.a m4181a = AbstractC0993d.m4181a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                m4181a.mo4154f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m4181a.mo4151c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                m4181a.mo4152d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        m4188a.mo4160c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m4188a.mo4161d(m4169m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m4181a.mo4150b(m4188a.mo4158a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m4181a.mo4153e(AbstractC0993d.b.OK).mo4149a();
    }

    /* renamed from: p */
    public final AbstractC0995f m4178p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f3888e));
        AbstractC0995f.a m4188a = AbstractC0995f.m4188a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                m4188a.mo4160c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m4188a.mo4161d(m4169m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m4188a.mo4159b(AbstractC0995f.b.OK).mo4158a();
    }

    /* renamed from: q */
    public final void m4179q(HttpURLConnection httpURLConnection, String str, String str2) {
        m4171s(httpURLConnection, m4165h(m4163b(str, str2)));
    }

    /* renamed from: r */
    public final void m4180r(HttpURLConnection httpURLConnection) {
        m4171s(httpURLConnection, m4165h(m4164c()));
    }
}
