package vn.hunghd.flutterdownloader;

import ae.C0108n;
import ae.C0109o;
import android.R;
import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import gd.C2245s;
import io.flutter.FlutterInjector;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.urllauncher.WebViewActivity;
import io.flutter.view.FlutterCallbackInformation;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.json.JSONException;
import org.json.JSONObject;
import p088ff.C1923b;
import p088ff.C1928g;
import p088ff.C1929h;
import p088ff.EnumC1922a;
import p243qd.C4236c;
import p329x.C5494l;
import p329x.C5497o;
import td.C4747g;
import td.C4753m;
import vn.hunghd.flutterdownloader.DownloadWorker;

/* loaded from: classes2.dex */
public final class DownloadWorker extends Worker implements MethodChannel.MethodCallHandler {

    /* renamed from: M */
    public static FlutterEngine f19529M;

    /* renamed from: A */
    public String f19531A;

    /* renamed from: B */
    public String f19532B;

    /* renamed from: C */
    public String f19533C;

    /* renamed from: D */
    public String f19534D;

    /* renamed from: E */
    public String f19535E;

    /* renamed from: F */
    public long f19536F;

    /* renamed from: G */
    public int f19537G;

    /* renamed from: H */
    public boolean f19538H;

    /* renamed from: n */
    public final Pattern f19539n;

    /* renamed from: o */
    public final Pattern f19540o;

    /* renamed from: p */
    public final Pattern f19541p;

    /* renamed from: q */
    public MethodChannel f19542q;

    /* renamed from: r */
    public C5181b f19543r;

    /* renamed from: s */
    public C1929h f19544s;

    /* renamed from: t */
    public boolean f19545t;

    /* renamed from: u */
    public boolean f19546u;

    /* renamed from: v */
    public boolean f19547v;

    /* renamed from: w */
    public boolean f19548w;

    /* renamed from: x */
    public int f19549x;

    /* renamed from: y */
    public int f19550y;

    /* renamed from: z */
    public String f19551z;

    /* renamed from: I */
    public static final C5177a f19525I = new C5177a(null);

    /* renamed from: J */
    public static final String f19526J = DownloadWorker.class.getSimpleName();

    /* renamed from: K */
    public static final AtomicBoolean f19527K = new AtomicBoolean(false);

    /* renamed from: L */
    public static final ArrayDeque<List<Object>> f19528L = new ArrayDeque<>();

    /* renamed from: N */
    public static final HostnameVerifier f19530N = new HostnameVerifier() { // from class: ff.e
        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            boolean m20963u;
            m20963u = DownloadWorker.m20963u(str, sSLSession);
            return m20963u;
        }
    };

    /* renamed from: vn.hunghd.flutterdownloader.DownloadWorker$a */
    /* loaded from: classes2.dex */
    public static final class C5177a {

        @SuppressLint({"CustomX509TrustManager"})
        /* renamed from: vn.hunghd.flutterdownloader.DownloadWorker$a$a */
        /* loaded from: classes2.dex */
        public static final class a implements X509TrustManager {

            /* renamed from: a */
            public final /* synthetic */ String f19552a;

            public a(String str) {
                this.f19552a = str;
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                C4753m.m18653f(x509CertificateArr, "chain");
                C4753m.m18653f(str, "authType");
                Log.i(this.f19552a, "checkClientTrusted");
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                C4753m.m18653f(x509CertificateArr, "chain");
                C4753m.m18653f(str, "authType");
                Log.i(this.f19552a, "checkServerTrusted");
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }

        public C5177a() {
        }

        public /* synthetic */ C5177a(C4747g c4747g) {
            this();
        }

        /* renamed from: b */
        public final void m20986b() {
            TrustManager[] trustManagerArr = {new a("trustAllHosts")};
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                C4753m.m18652e(sSLContext, "getInstance(\"TLS\")");
                sSLContext.init(null, trustManagerArr, new SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: vn.hunghd.flutterdownloader.DownloadWorker$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5178b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19553a;

        static {
            int[] iArr = new int[EnumC1922a.values().length];
            try {
                iArr[EnumC1922a.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1922a.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1922a.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1922a.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1922a.COMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19553a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(final Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C4753m.m18653f(context, "context");
        C4753m.m18653f(workerParameters, "params");
        this.f19539n = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)");
        this.f19540o = Pattern.compile("(?i)\\bfilename\\*=([^']+)'([^']*)'\"?([^\"]+)\"?");
        this.f19541p = Pattern.compile("(?i)\\bfilename=\"?([^\"]+)\"?");
        new Handler(context.getMainLooper()).post(new Runnable() { // from class: ff.c
            @Override // java.lang.Runnable
            public final void run() {
                DownloadWorker.m20964v(DownloadWorker.this, context);
            }
        });
    }

    /* renamed from: L */
    public static final void m20959L(DownloadWorker downloadWorker, List list) {
        C4753m.m18653f(downloadWorker, "this$0");
        C4753m.m18653f(list, "$args");
        MethodChannel methodChannel = downloadWorker.f19542q;
        if (methodChannel != null) {
            methodChannel.invokeMethod("", list);
        }
    }

    /* renamed from: u */
    public static final boolean m20963u(String str, SSLSession sSLSession) {
        return true;
    }

    /* renamed from: v */
    public static final void m20964v(DownloadWorker downloadWorker, Context context) {
        C4753m.m18653f(downloadWorker, "this$0");
        C4753m.m18653f(context, "$context");
        downloadWorker.m20979P(context);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0118. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bb A[Catch: all -> 0x0100, IOException -> 0x0106, TryCatch #11 {IOException -> 0x0106, blocks: (B:323:0x00f9, B:129:0x0144, B:133:0x0193, B:135:0x01af, B:140:0x01bb, B:142:0x01c2, B:147:0x01ce, B:153:0x0213), top: B:322:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ce A[Catch: all -> 0x0100, IOException -> 0x0106, TRY_LEAVE, TryCatch #11 {IOException -> 0x0106, blocks: (B:323:0x00f9, B:129:0x0144, B:133:0x0193, B:135:0x01af, B:140:0x01bb, B:142:0x01c2, B:147:0x01ce, B:153:0x0213), top: B:322:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0213 A[Catch: all -> 0x0100, IOException -> 0x0106, TRY_ENTER, TRY_LEAVE, TryCatch #11 {IOException -> 0x0106, blocks: (B:323:0x00f9, B:129:0x0144, B:133:0x0193, B:135:0x01af, B:140:0x01bb, B:142:0x01c2, B:147:0x01ce, B:153:0x0213), top: B:322:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0229 A[Catch: all -> 0x0245, IOException -> 0x024d, TRY_ENTER, TRY_LEAVE, TryCatch #29 {IOException -> 0x024d, all -> 0x0245, blocks: (B:164:0x0229, B:273:0x025a, B:275:0x025e), top: B:162:0x0227 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0327 A[Catch: all -> 0x042d, IOException -> 0x042f, TryCatch #35 {IOException -> 0x042f, all -> 0x042d, blocks: (B:177:0x02b6, B:179:0x02bc, B:180:0x02bf, B:182:0x02c3, B:189:0x02cc, B:196:0x031d, B:198:0x0327, B:199:0x0338, B:201:0x033e, B:203:0x0347, B:204:0x0349, B:206:0x0350, B:208:0x0359, B:209:0x0361, B:211:0x0370, B:213:0x0376, B:215:0x037c, B:217:0x0382, B:218:0x0389, B:237:0x03ae, B:239:0x03c2, B:242:0x03df, B:243:0x03fe, B:246:0x0423, B:251:0x03e9, B:253:0x035c, B:254:0x035f), top: B:176:0x02b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x033e A[Catch: all -> 0x042d, IOException -> 0x042f, TryCatch #35 {IOException -> 0x042f, all -> 0x042d, blocks: (B:177:0x02b6, B:179:0x02bc, B:180:0x02bf, B:182:0x02c3, B:189:0x02cc, B:196:0x031d, B:198:0x0327, B:199:0x0338, B:201:0x033e, B:203:0x0347, B:204:0x0349, B:206:0x0350, B:208:0x0359, B:209:0x0361, B:211:0x0370, B:213:0x0376, B:215:0x037c, B:217:0x0382, B:218:0x0389, B:237:0x03ae, B:239:0x03c2, B:242:0x03df, B:243:0x03fe, B:246:0x0423, B:251:0x03e9, B:253:0x035c, B:254:0x035f), top: B:176:0x02b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0350 A[Catch: all -> 0x042d, IOException -> 0x042f, TryCatch #35 {IOException -> 0x042f, all -> 0x042d, blocks: (B:177:0x02b6, B:179:0x02bc, B:180:0x02bf, B:182:0x02c3, B:189:0x02cc, B:196:0x031d, B:198:0x0327, B:199:0x0338, B:201:0x033e, B:203:0x0347, B:204:0x0349, B:206:0x0350, B:208:0x0359, B:209:0x0361, B:211:0x0370, B:213:0x0376, B:215:0x037c, B:217:0x0382, B:218:0x0389, B:237:0x03ae, B:239:0x03c2, B:242:0x03df, B:243:0x03fe, B:246:0x0423, B:251:0x03e9, B:253:0x035c, B:254:0x035f), top: B:176:0x02b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0370 A[Catch: all -> 0x042d, IOException -> 0x042f, TryCatch #35 {IOException -> 0x042f, all -> 0x042d, blocks: (B:177:0x02b6, B:179:0x02bc, B:180:0x02bf, B:182:0x02c3, B:189:0x02cc, B:196:0x031d, B:198:0x0327, B:199:0x0338, B:201:0x033e, B:203:0x0347, B:204:0x0349, B:206:0x0350, B:208:0x0359, B:209:0x0361, B:211:0x0370, B:213:0x0376, B:215:0x037c, B:217:0x0382, B:218:0x0389, B:237:0x03ae, B:239:0x03c2, B:242:0x03df, B:243:0x03fe, B:246:0x0423, B:251:0x03e9, B:253:0x035c, B:254:0x035f), top: B:176:0x02b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x035f A[Catch: all -> 0x042d, IOException -> 0x042f, TryCatch #35 {IOException -> 0x042f, all -> 0x042d, blocks: (B:177:0x02b6, B:179:0x02bc, B:180:0x02bf, B:182:0x02c3, B:189:0x02cc, B:196:0x031d, B:198:0x0327, B:199:0x0338, B:201:0x033e, B:203:0x0347, B:204:0x0349, B:206:0x0350, B:208:0x0359, B:209:0x0361, B:211:0x0370, B:213:0x0376, B:215:0x037c, B:217:0x0382, B:218:0x0389, B:237:0x03ae, B:239:0x03c2, B:242:0x03df, B:243:0x03fe, B:246:0x0423, B:251:0x03e9, B:253:0x035c, B:254:0x035f), top: B:176:0x02b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x031d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0256 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m20965A(android.content.Context r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, int r34) {
        /*
            Method dump skipped, instructions count: 1536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.hunghd.flutterdownloader.DownloadWorker.m20965A(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void");
    }

    /* renamed from: B */
    public final String m20966B(String str) {
        String group;
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f19539n.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null) {
            return null;
        }
        int length = group.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = C4753m.m18655h(group.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String obj = group.subSequence(i10, length + 1).toString();
        if (obj == null) {
            return null;
        }
        Locale locale = Locale.US;
        C4753m.m18652e(locale, "US");
        String upperCase = obj.toUpperCase(locale);
        C4753m.m18652e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    /* renamed from: C */
    public final String m20967C(String str) {
        List m463d0;
        String[] strArr;
        String str2;
        if (str == null || (m463d0 = C0109o.m463d0(str, new String[]{";"}, false, 0, 6, null)) == null || (strArr = (String[]) m463d0.toArray(new String[0])) == null || (str2 = strArr[0]) == null) {
            return null;
        }
        int length = str2.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = C4753m.m18655h(str2.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str2.subSequence(i10, length + 1).toString();
    }

    /* renamed from: D */
    public final String m20968D(String str, String str2) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f19541p.matcher(str);
        String group = matcher.find() ? matcher.group(1) : null;
        Matcher matcher2 = this.f19540o.matcher(str);
        if (matcher2.find()) {
            group = matcher2.group(3);
            String group2 = matcher2.group(1);
            if (group2 != null) {
                Locale locale = Locale.US;
                C4753m.m18652e(locale, "US");
                String upperCase = group2.toUpperCase(locale);
                C4753m.m18652e(upperCase, "this as java.lang.String).toUpperCase(locale)");
                str2 = upperCase;
            } else {
                str2 = null;
            }
        }
        if (group == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        return URLDecoder.decode(group, str2);
    }

    /* renamed from: E */
    public final String m20969E(Uri uri) {
        try {
            Cursor query = m2061a().getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (query == null) {
                C4236c.m16274a(query, null);
                return null;
            }
            try {
                String string = !query.moveToFirst() ? null : query.getString(query.getColumnIndexOrThrow("_data"));
                C4236c.m16274a(query, null);
                return string;
            } finally {
            }
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            m20974J("Get a path for a MediaStore failed");
            return null;
        }
    }

    /* renamed from: F */
    public final int m20970F() {
        try {
            ApplicationInfo applicationInfo = m2061a().getPackageManager().getApplicationInfo(m2061a().getPackageName(), 128);
            C4753m.m18652e(applicationInfo, "applicationContext.packa…ATA\n                    )");
            return applicationInfo.metaData.getInt("vn.hunghd.flutterdownloader.NOTIFICATION_ICON", applicationInfo.icon);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    /* renamed from: G */
    public final boolean m20971G(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        C4753m.m18652e(externalStorageDirectory, "getExternalStorageDirectory()");
        if (str == null) {
            return false;
        }
        String path = externalStorageDirectory.getPath();
        C4753m.m18652e(path, "externalStorageDir.path");
        return C0108n.m433s(str, path, false, 2, null);
    }

    /* renamed from: H */
    public final boolean m20972H(String str) {
        String m20967C = m20967C(str);
        if (m20967C != null) {
            return C0108n.m433s(m20967C, "image/", false, 2, null) || C0108n.m433s(m20967C, "video", false, 2, null);
        }
        return false;
    }

    /* renamed from: I */
    public final void m20973I(String str) {
        if (this.f19547v) {
            Log.d(f19526J, str);
        }
    }

    /* renamed from: J */
    public final void m20974J(String str) {
        if (this.f19547v) {
            Log.e(f19526J, str);
        }
    }

    /* renamed from: K */
    public final void m20975K(EnumC1922a enumC1922a, int i10) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(m2065g().m2115k("callback_handle", 0L)));
        String uuid = m2064f().toString();
        C4753m.m18652e(uuid, "id.toString()");
        arrayList.add(uuid);
        arrayList.add(Integer.valueOf(enumC1922a.ordinal()));
        arrayList.add(Integer.valueOf(i10));
        AtomicBoolean atomicBoolean = f19527K;
        synchronized (atomicBoolean) {
            if (atomicBoolean.get()) {
                new Handler(m2061a().getMainLooper()).post(new Runnable() { // from class: ff.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DownloadWorker.m20959L(DownloadWorker.this, arrayList);
                    }
                });
            } else {
                f19528L.add(arrayList);
            }
        }
    }

    /* renamed from: M */
    public final void m20976M(HttpURLConnection httpURLConnection, String str) {
        if (str.length() > 0) {
            m20973I("Headers = " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                C4753m.m18652e(keys, "json.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    httpURLConnection.setRequestProperty(next, jSONObject.getString(next));
                }
                httpURLConnection.setDoInput(true);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: N */
    public final void m20977N(Context context) {
        if (this.f19545t && Build.VERSION.SDK_INT >= 26) {
            Resources resources = m2061a().getResources();
            String string = resources.getString(C1928g.f7307c);
            C4753m.m18652e(string, "res.getString(R.string.f…otification_channel_name)");
            String string2 = resources.getString(C1928g.f7306b);
            C4753m.m18652e(string2, "res.getString(R.string.f…tion_channel_description)");
            NotificationChannel notificationChannel = new NotificationChannel("FLUTTER_DOWNLOADER_NOTIFICATION", string, 2);
            notificationChannel.setDescription(string2);
            notificationChannel.setSound(null, null);
            C5497o m22067f = C5497o.m22067f(context);
            C4753m.m18652e(m22067f, "from(context)");
            m22067f.m22074e(notificationChannel);
        }
    }

    /* renamed from: O */
    public final long m20978O(HttpURLConnection httpURLConnection, String str, String str2) {
        long length = new File(str2 + File.separator + str).length();
        m20973I("Resume download: Range: bytes=" + length + '-');
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setRequestProperty("Range", "bytes=" + length + '-');
        httpURLConnection.setDoInput(true);
        return length;
    }

    /* renamed from: P */
    public final void m20979P(Context context) {
        DartExecutor dartExecutor;
        synchronized (f19527K) {
            if (f19529M == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("vn.hunghd.downloader.pref", 0);
                C4753m.m18652e(sharedPreferences, "context.getSharedPrefere…PRIVATE\n                )");
                long j10 = sharedPreferences.getLong("callback_dispatcher_handle_key", 0L);
                f19529M = new FlutterEngine(m2061a(), (String[]) null, false);
                FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j10);
                if (lookupCallbackInformation == null) {
                    m20973I("Fatal: failed to find callback");
                    return;
                }
                String findAppBundlePath = FlutterInjector.instance().flutterLoader().findAppBundlePath();
                C4753m.m18652e(findAppBundlePath, "instance().flutterLoader().findAppBundlePath()");
                AssetManager assets = m2061a().getAssets();
                FlutterEngine flutterEngine = f19529M;
                if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
                    dartExecutor.executeDartCallback(new DartExecutor.DartCallback(assets, findAppBundlePath, lookupCallbackInformation));
                }
            }
            C2245s c2245s = C2245s.f8873a;
            FlutterEngine flutterEngine2 = f19529M;
            C4753m.m18650c(flutterEngine2);
            MethodChannel methodChannel = new MethodChannel(flutterEngine2.getDartExecutor(), "vn.hunghd/downloader_background");
            this.f19542q = methodChannel;
            methodChannel.setMethodCallHandler(this);
        }
    }

    /* renamed from: Q */
    public final void m20980Q(Context context, String str, EnumC1922a enumC1922a, int i10, PendingIntent pendingIntent, boolean z10) {
        C5494l.e m21864G;
        int i11;
        String str2;
        m20975K(enumC1922a, i10);
        if (this.f19545t) {
            C5494l.e m21866I = new C5494l.e(context, "FLUTTER_DOWNLOADER_NOTIFICATION").m21900u(str).m21898s(pendingIntent).m21865H(true).m21892m(true).m21866I(-1);
            C4753m.m18652e(m21866I, "Builder(context, CHANNEL…ationCompat.PRIORITY_LOW)");
            int i12 = C5178b.f19553a[enumC1922a.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    str2 = this.f19532B;
                } else if (i12 == 3) {
                    str2 = this.f19533C;
                } else if (i12 != 4) {
                    if (i12 != 5) {
                        m21866I.m21867J(0, 0, false);
                        m21864G = m21866I.m21864G(false);
                        i11 = m20970F();
                        m21864G.m21871N(i11);
                    }
                    str2 = this.f19535E;
                } else {
                    str2 = this.f19534D;
                }
                m21866I.m21899t(str2).m21867J(0, 0, false);
                m21866I.m21864G(false).m21871N(R.drawable.stat_sys_download_done);
            } else if (i10 <= 0) {
                m21866I.m21899t(this.f19551z).m21867J(0, 0, false);
                m21864G = m21866I.m21864G(false);
                i11 = m20970F();
                m21864G.m21871N(i11);
            } else {
                if (i10 < 100) {
                    m21866I.m21899t(this.f19531A).m21867J(100, i10, false);
                    m21864G = m21866I.m21864G(true);
                    i11 = R.drawable.stat_sys_download;
                    m21864G.m21871N(i11);
                }
                str2 = this.f19535E;
                m21866I.m21899t(str2).m21867J(0, 0, false);
                m21866I.m21864G(false).m21871N(R.drawable.stat_sys_download_done);
            }
            if (System.currentTimeMillis() - this.f19536F < 1000) {
                if (!z10) {
                    m20973I("Update too frequently!!!!, this should be dropped");
                    return;
                }
                m20973I("Update too frequently!!!!, but it is the final update, we should sleep a second to ensure the update call can be processed");
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
            m20973I("Update notification: {notificationId: " + this.f19550y + ", title: " + str + ", status: " + enumC1922a + ", progress: " + i10 + '}');
            C5497o.m22067f(context).m22076i(this.f19550y, m21866I.m21883c());
            this.f19536F = System.currentTimeMillis();
        }
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: l */
    public void mo2070l() {
        C1923b c1923b;
        Context m2061a = m2061a();
        C4753m.m18652e(m2061a, "applicationContext");
        C5181b m21010a = C5181b.f19564h.m21010a(m2061a);
        this.f19543r = m21010a;
        C4753m.m18650c(m21010a);
        this.f19544s = new C1929h(m21010a);
        String m2116l = m2065g().m2116l(WebViewActivity.URL_EXTRA);
        String m2116l2 = m2065g().m2116l("file_name");
        C1929h c1929h = this.f19544s;
        if (c1929h != null) {
            String uuid = m2064f().toString();
            C4753m.m18652e(uuid, "id.toString()");
            c1923b = c1929h.m7838d(uuid);
        } else {
            c1923b = null;
        }
        if (c1923b == null || c1923b.m7828l() != EnumC1922a.ENQUEUED) {
            return;
        }
        if (m2116l2 == null) {
            m2116l2 = m2116l;
        }
        EnumC1922a enumC1922a = EnumC1922a.CANCELED;
        m20980Q(m2061a, m2116l2, enumC1922a, -1, null, true);
        C1929h c1929h2 = this.f19544s;
        if (c1929h2 != null) {
            String uuid2 = m2064f().toString();
            C4753m.m18652e(uuid2, "id.toString()");
            c1929h2.m7841g(uuid2, enumC1922a, this.f19549x);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C4753m.m18653f(methodCall, "call");
        C4753m.m18653f(result, "result");
        if (!methodCall.method.equals("didInitializeDispatcher")) {
            result.notImplemented();
            return;
        }
        synchronized (f19527K) {
            while (true) {
                ArrayDeque<List<Object>> arrayDeque = f19528L;
                if (arrayDeque.isEmpty()) {
                    f19527K.set(true);
                    result.success(null);
                    C2245s c2245s = C2245s.f8873a;
                } else {
                    MethodChannel methodChannel = this.f19542q;
                    if (methodChannel != null) {
                        methodChannel.invokeMethod("", arrayDeque.remove());
                    }
                }
            }
        }
    }

    @Override // androidx.work.Worker
    /* renamed from: q */
    public ListenableWorker.AbstractC0413a mo2082q() {
        C1923b c1923b;
        Object obj;
        boolean z10;
        C5181b m21010a = C5181b.f19564h.m21010a(m2061a());
        this.f19543r = m21010a;
        C4753m.m18650c(m21010a);
        this.f19544s = new C1929h(m21010a);
        String m2116l = m2065g().m2116l(WebViewActivity.URL_EXTRA);
        if (m2116l == null) {
            throw new IllegalArgumentException("Argument 'url' should not be null");
        }
        String m2116l2 = m2065g().m2116l("file_name");
        String m2116l3 = m2065g().m2116l("saved_file");
        if (m2116l3 == null) {
            throw new IllegalArgumentException("Argument 'saved_file' should not be null");
        }
        String m2116l4 = m2065g().m2116l("headers");
        if (m2116l4 == null) {
            throw new IllegalArgumentException("Argument 'headers' should not be null");
        }
        boolean m2112h = m2065g().m2112h("is_resume", false);
        int m2113i = m2065g().m2113i("timeout", 15000);
        this.f19547v = m2065g().m2112h("debug", false);
        this.f19537G = m2065g().m2113i("step", 10);
        this.f19548w = m2065g().m2112h("ignoreSsl", false);
        Resources resources = m2061a().getResources();
        this.f19551z = resources.getString(C1928g.f7312h);
        this.f19531A = resources.getString(C1928g.f7310f);
        this.f19532B = resources.getString(C1928g.f7305a);
        this.f19533C = resources.getString(C1928g.f7309e);
        this.f19534D = resources.getString(C1928g.f7311g);
        this.f19535E = resources.getString(C1928g.f7308d);
        C1929h c1929h = this.f19544s;
        if (c1929h != null) {
            String uuid = m2064f().toString();
            C4753m.m18652e(uuid, "id.toString()");
            c1923b = c1929h.m7838d(uuid);
        } else {
            c1923b = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DownloadWorker{url=");
        sb2.append(m2116l);
        sb2.append(",filename=");
        sb2.append(m2116l2);
        sb2.append(",savedDir=");
        sb2.append(m2116l3);
        sb2.append(",header=");
        sb2.append(m2116l4);
        sb2.append(",isResume=");
        sb2.append(m2112h);
        sb2.append(",status=");
        if (c1923b == null || (obj = c1923b.m7828l()) == null) {
            obj = "GONE";
        }
        sb2.append(obj);
        m20973I(sb2.toString());
        if (c1923b == null || c1923b.m7828l() == EnumC1922a.CANCELED) {
            ListenableWorker.AbstractC0413a m2077c = ListenableWorker.AbstractC0413a.m2077c();
            C4753m.m18652e(m2077c, "success()");
            return m2077c;
        }
        this.f19545t = m2065g().m2112h("show_notification", false);
        this.f19546u = m2065g().m2112h("open_file_from_notification", false);
        this.f19538H = m2065g().m2112h("save_in_public_storage", false);
        this.f19550y = c1923b.m7822f();
        Context m2061a = m2061a();
        C4753m.m18652e(m2061a, "applicationContext");
        m20977N(m2061a);
        Context m2061a2 = m2061a();
        C4753m.m18652e(m2061a2, "applicationContext");
        String str = m2116l2 == null ? m2116l : m2116l2;
        EnumC1922a enumC1922a = EnumC1922a.RUNNING;
        m20980Q(m2061a2, str, enumC1922a, c1923b.m7823g(), null, false);
        C1929h c1929h2 = this.f19544s;
        if (c1929h2 != null) {
            String uuid2 = m2064f().toString();
            C4753m.m18652e(uuid2, "id.toString()");
            c1929h2.m7841g(uuid2, enumC1922a, c1923b.m7823g());
        }
        if (new File(m2116l3 + File.separator + m2116l2).exists()) {
            m20973I("exists file for " + m2116l2 + "automatic resuming...");
            z10 = true;
        } else {
            z10 = m2112h;
        }
        try {
            Context m2061a3 = m2061a();
            C4753m.m18652e(m2061a3, "applicationContext");
            m20965A(m2061a3, m2116l, m2116l3, m2116l2, m2116l4, z10, m2113i);
            m20982x();
            this.f19543r = null;
            this.f19544s = null;
            ListenableWorker.AbstractC0413a m2077c2 = ListenableWorker.AbstractC0413a.m2077c();
            C4753m.m18652e(m2077c2, "{\n            downloadFi…esult.success()\n        }");
            return m2077c2;
        } catch (Exception e10) {
            Context m2061a4 = m2061a();
            C4753m.m18652e(m2061a4, "applicationContext");
            String str2 = m2116l2 == null ? m2116l : m2116l2;
            EnumC1922a enumC1922a2 = EnumC1922a.FAILED;
            m20980Q(m2061a4, str2, enumC1922a2, -1, null, true);
            C1929h c1929h3 = this.f19544s;
            if (c1929h3 != null) {
                String uuid3 = m2064f().toString();
                C4753m.m18652e(uuid3, "id.toString()");
                c1929h3.m7841g(uuid3, enumC1922a2, this.f19549x);
            }
            e10.printStackTrace();
            this.f19543r = null;
            this.f19544s = null;
            ListenableWorker.AbstractC0413a m2075a = ListenableWorker.AbstractC0413a.m2075a();
            C4753m.m18652e(m2075a, "{\n            updateNoti…esult.failure()\n        }");
            return m2075a;
        }
    }

    /* renamed from: w */
    public final void m20981w(String str, String str2, String str3) {
        if (str3 != null && str2 != null && str != null) {
            if (!C0108n.m433s(str3, "image/", false, 2, null)) {
                if (C0108n.m433s(str3, "video", false, 2, null)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("title", str);
                    contentValues.put("_display_name", str);
                    contentValues.put("description", "");
                    contentValues.put("mime_type", str3);
                    contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("_data", str2);
                    m20973I("insert " + contentValues + " to MediaStore");
                    m2061a().getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                    return;
                }
                return;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("title", str);
            contentValues2.put("_display_name", str);
            contentValues2.put("description", "");
            contentValues2.put("mime_type", str3);
            contentValues2.put("date_added", Long.valueOf(System.currentTimeMillis()));
            contentValues2.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentValues2.put("_data", str2);
            m20973I("insert " + contentValues2 + " to MediaStore");
            m2061a().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues2);
        }
    }

    /* renamed from: x */
    public final void m20982x() {
        C1929h c1929h = this.f19544s;
        C4753m.m18650c(c1929h);
        String uuid = m2064f().toString();
        C4753m.m18652e(uuid, "id.toString()");
        C1923b m7838d = c1929h.m7838d(uuid);
        if (m7838d == null || m7838d.m7828l() == EnumC1922a.COMPLETE || m7838d.m7824h()) {
            return;
        }
        String m7818b = m7838d.m7818b();
        if (m7818b == null) {
            m7818b = m7838d.m7831o().substring(C0109o.m443J(m7838d.m7831o(), FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 0, false, 6, null) + 1, m7838d.m7831o().length());
            C4753m.m18652e(m7818b, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        File file = new File(m7838d.m7826j() + File.separator + m7818b);
        if (file.exists()) {
            file.delete();
        }
    }

    /* renamed from: y */
    public final File m20983y(String str, String str2) {
        File file = new File(str2, str);
        try {
            if (file.createNewFile()) {
                return file;
            }
            m20974J("It looks like you are trying to save file in public storage but not setting 'saveInPublicStorage' to 'true'");
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            m20974J("Create a file using java.io API failed ");
            return null;
        }
    }

    /* renamed from: z */
    public final Uri m20984z(String str, String str2) {
        Uri uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        C4753m.m18652e(uri, "EXTERNAL_CONTENT_URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        try {
            return m2061a().getContentResolver().insert(uri, contentValues);
        } catch (Exception e10) {
            e10.printStackTrace();
            m20974J("Create a file using MediaStore API failed.");
            return null;
        }
    }
}
