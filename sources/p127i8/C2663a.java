package p127i8;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p023b8.C0515g;

/* renamed from: i8.a */
/* loaded from: classes.dex */
public class C2663a {

    /* renamed from: a */
    public final String f10407a;

    /* renamed from: b */
    public final Map<String, String> f10408b;

    /* renamed from: c */
    public final Map<String, String> f10409c = new HashMap();

    public C2663a(String str, Map<String, String> map) {
        this.f10407a = str;
        this.f10408b = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0029, code lost:
    
        if (r1.getValue() != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x002b, code lost:
    
        r1 = java.net.URLEncoder.encode(r1.getValue(), "UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (r7.hasNext() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        r1 = r7.next();
        r0.append("&");
        r0.append(r1.getKey());
        r0.append("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:
    
        if (r1.getValue() == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x005b -> B:3:0x002b). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m10858a(java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            java.lang.String r4 = "UTF-8"
            java.lang.String r5 = ""
            if (r3 == 0) goto L36
        L2b:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r4)
            goto L37
        L36:
            r1 = r5
        L37:
            r0.append(r1)
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r3 = "&"
            r0.append(r3)
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            if (r3 == 0) goto L36
            goto L2b
        L5e:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p127i8.C2663a.m10858a(java.util.Map):java.lang.String");
    }

    /* renamed from: b */
    public final String m10859b(String str, Map<String, String> map) {
        String m10858a = m10858a(map);
        if (m10858a.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + m10858a;
        }
        if (!str.endsWith("&")) {
            m10858a = "&" + m10858a;
        }
        return str + m10858a;
    }

    /* renamed from: c */
    public C2665c m10860c() {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String m10862e = null;
        inputStream = null;
        try {
            String m10859b = m10859b(this.f10407a, this.f10408b);
            C0515g.m2482f().m2490i("GET Request URL: " + m10859b);
            httpsURLConnection = (HttpsURLConnection) new URL(m10859b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f10409c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        m10862e = m10862e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new C2665c(responseCode, m10862e);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    /* renamed from: d */
    public C2663a m10861d(String str, String str2) {
        this.f10409c.put(str, str2);
        return this;
    }

    /* renamed from: e */
    public final String m10862e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, read);
        }
    }
}
