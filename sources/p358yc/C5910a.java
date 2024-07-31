package p358yc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.Constants;
import java.security.MessageDigest;
import java.util.HashMap;
import td.C4747g;
import td.C4753m;

/* renamed from: yc.a */
/* loaded from: classes2.dex */
public final class C5910a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: j */
    public static final a f21990j = new a(null);

    /* renamed from: h */
    public Context f21991h;

    /* renamed from: i */
    public MethodChannel f21992i;

    /* renamed from: yc.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: a */
    public final String m23635a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            cArr2[i12] = cArr[i11 >>> 4];
            cArr2[i12 + 1] = cArr[i11 & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if ((r5.length == 0) != false) goto L20;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m23636b(android.content.pm.PackageManager r5) {
        /*
            r4 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La1
            r2 = 28
            if (r1 < r2) goto L5c
            android.content.Context r1 = r4.f21991h     // Catch: java.lang.Throwable -> La1
            td.C4753m.m18650c(r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> La1
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> La1
            android.content.pm.SigningInfo r5 = r5.signingInfo     // Catch: java.lang.Throwable -> La1
            if (r5 != 0) goto L1b
            return r0
        L1b:
            boolean r1 = r5.hasMultipleSigners()     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L3e
            android.content.pm.Signature[] r5 = r5.getApkContentsSigners()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "signingInfo.apkContentsSigners"
            td.C4753m.m18652e(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r5 = p115hd.C2497j.m9966k(r5)     // Catch: java.lang.Throwable -> La1
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch: java.lang.Throwable -> La1
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "signingInfo.apkContentsS…ers.first().toByteArray()"
            td.C4753m.m18652e(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r4.m23639e(r5)     // Catch: java.lang.Throwable -> La1
            goto L5a
        L3e:
            android.content.pm.Signature[] r5 = r5.getSigningCertificateHistory()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "signingInfo.signingCertificateHistory"
            td.C4753m.m18652e(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r5 = p115hd.C2497j.m9966k(r5)     // Catch: java.lang.Throwable -> La1
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch: java.lang.Throwable -> La1
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "signingInfo.signingCerti…ory.first().toByteArray()"
            td.C4753m.m18652e(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r4.m23639e(r5)     // Catch: java.lang.Throwable -> La1
        L5a:
            r0 = r5
            goto La1
        L5c:
            android.content.Context r1 = r4.f21991h     // Catch: java.lang.Throwable -> La1
            td.C4753m.m18650c(r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> La1
            r2 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> La1
            android.content.pm.Signature[] r5 = r5.signatures     // Catch: java.lang.Throwable -> La1
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L79
            int r3 = r5.length     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto L76
            r3 = r2
            goto L77
        L76:
            r3 = r1
        L77:
            if (r3 == 0) goto L7a
        L79:
            r1 = r2
        L7a:
            if (r1 != 0) goto La1
            java.lang.String r1 = "packageInfo.signatures"
            td.C4753m.m18652e(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r1 = p115hd.C2497j.m9966k(r5)     // Catch: java.lang.Throwable -> La1
            if (r1 != 0) goto L88
            goto La1
        L88:
            java.lang.String r1 = "signatures"
            td.C4753m.m18652e(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r5 = p115hd.C2497j.m9966k(r5)     // Catch: java.lang.Throwable -> La1
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch: java.lang.Throwable -> La1
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "signatures.first().toByteArray()"
            td.C4753m.m18652e(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r4.m23639e(r5)     // Catch: java.lang.Throwable -> La1
            goto L5a
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p358yc.C5910a.m23636b(android.content.pm.PackageManager):java.lang.String");
    }

    /* renamed from: c */
    public final String m23637c() {
        Context context = this.f21991h;
        C4753m.m18650c(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.f21991h;
        C4753m.m18650c(context2);
        String packageName = context2.getPackageName();
        return Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager.getInstallerPackageName(packageName);
    }

    /* renamed from: d */
    public final long m23638d(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    /* renamed from: e */
    public final String m23639e(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        C4753m.m18652e(digest, "hashText");
        return m23635a(digest);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        this.f21991h = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.f21992i = methodChannel;
        C4753m.m18650c(methodChannel);
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        this.f21991h = null;
        MethodChannel methodChannel = this.f21992i;
        C4753m.m18650c(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.f21992i = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C4753m.m18653f(methodCall, "call");
        C4753m.m18653f(result, "result");
        try {
            if (!C4753m.m18648a(methodCall.method, "getAll")) {
                result.notImplemented();
                return;
            }
            Context context = this.f21991h;
            C4753m.m18650c(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f21991h;
            C4753m.m18650c(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            C4753m.m18652e(packageManager, "packageManager");
            String m23636b = m23636b(packageManager);
            String m23637c = m23637c();
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.APP_NAME, packageInfo.applicationInfo.loadLabel(packageManager).toString());
            Context context3 = this.f21991h;
            C4753m.m18650c(context3);
            hashMap.put("packageName", context3.getPackageName());
            hashMap.put("version", packageInfo.versionName);
            C4753m.m18652e(packageInfo, "info");
            hashMap.put("buildNumber", String.valueOf(m23638d(packageInfo)));
            if (m23636b != null) {
                hashMap.put("buildSignature", m23636b);
            }
            if (m23637c != null) {
                hashMap.put("installerStore", m23637c);
            }
            result.success(hashMap);
        } catch (PackageManager.NameNotFoundException e10) {
            result.error("Name not found", e10.getMessage(), null);
        }
    }
}
