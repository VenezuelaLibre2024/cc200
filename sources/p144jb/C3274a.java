package p144jb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.io.File;
import java.io.IOException;
import p159kb.C3379a;
import p159kb.C3380b;
import p329x.C5484b;
import p345y.C5782a;
import p345y.C5783b;

/* renamed from: jb.a */
/* loaded from: classes.dex */
public class C3274a implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.RequestPermissionsResultListener, PluginRegistry.ActivityResultListener {

    /* renamed from: h */
    public MethodChannel f11402h;

    /* renamed from: i */
    public Context f11403i;

    /* renamed from: j */
    public Activity f11404j;

    /* renamed from: k */
    public MethodChannel.Result f11405k;

    /* renamed from: l */
    public String f11406l;

    /* renamed from: m */
    public String f11407m;

    /* renamed from: n */
    public boolean f11408n = false;

    /* renamed from: a */
    public final boolean m11830a() {
        if (Build.VERSION.SDK_INT < 26) {
            return m11833d("android.permission.REQUEST_INSTALL_PACKAGES");
        }
        try {
            return this.f11404j.getPackageManager().canRequestPackageInstalls();
        } catch (Exception e10) {
            m11838i(e10 instanceof SecurityException ? -3 : -4, e10.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m11831b() {
        if (Build.VERSION.SDK_INT < 33) {
            if (m11833d("android.permission.READ_EXTERNAL_STORAGE")) {
                return true;
            }
            C5484b.m21745g(this.f11404j, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 33432);
            return false;
        }
        if (m11841l("image/", this.f11407m)) {
            if (m11833d("android.permission.READ_MEDIA_IMAGES")) {
                return true;
            }
            C5484b.m21745g(this.f11404j, new String[]{"android.permission.READ_MEDIA_IMAGES"}, 33432);
            return false;
        }
        if (m11841l("video/", this.f11407m)) {
            if (m11833d("android.permission.READ_MEDIA_VIDEO")) {
                return true;
            }
            C5484b.m21745g(this.f11404j, new String[]{"android.permission.READ_MEDIA_VIDEO"}, 33432);
            return false;
        }
        if (!m11841l("audio/", this.f11407m) || m11833d("android.permission.READ_MEDIA_AUDIO")) {
            return true;
        }
        C5484b.m21745g(this.f11404j, new String[]{"android.permission.READ_MEDIA_AUDIO"}, 33432);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03b7, code lost:
    
        if (r9.equals("c") == false) goto L4;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m11832c(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 1544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p144jb.C3274a.m11832c(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    public final boolean m11833d(String str) {
        return C5782a.checkSelfPermission(this.f11404j, str) == 0;
    }

    /* renamed from: e */
    public final boolean m11834e() {
        int i10;
        String str;
        if (this.f11406l == null) {
            i10 = -4;
            str = "the file path cannot be null";
        } else {
            if (new File(this.f11406l).exists()) {
                return true;
            }
            i10 = -2;
            str = "the " + this.f11406l + " file does not exists";
        }
        m11838i(i10, str);
        return false;
    }

    /* renamed from: f */
    public final boolean m11835f() {
        String[] strArr = {"/DCIM/", "/Pictures/", "/Movies/", "/Alarms/", "/Audiobooks/", "/Music/", "/Notifications/", "/Podcasts/", "/Ringtones/", "/Download/"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (this.f11406l.contains(strArr[i10])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void m11836g() {
        if (m11830a()) {
            m11839j();
        } else if (Build.VERSION.SDK_INT < 26) {
            C5484b.m21745g(this.f11404j, new String[]{"android.permission.REQUEST_INSTALL_PACKAGES"}, 33432);
        } else {
            if (this.f11408n) {
                return;
            }
            m11840k();
        }
    }

    /* renamed from: h */
    public final boolean m11837h() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            String canonicalPath = new File(this.f11403i.getApplicationInfo().dataDir).getCanonicalPath();
            String canonicalPath2 = this.f11403i.getExternalFilesDir(null).getCanonicalPath();
            String canonicalPath3 = new File(this.f11406l).getCanonicalPath();
            if (canonicalPath3.startsWith(canonicalPath)) {
                return false;
            }
            return !canonicalPath3.startsWith(canonicalPath2);
        } catch (IOException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    /* renamed from: i */
    public final void m11838i(int i10, String str) {
        if (this.f11405k == null || this.f11408n) {
            return;
        }
        this.f11405k.success(C3379a.m12576a(C3380b.m12577a(i10, str)));
        this.f11408n = true;
    }

    /* renamed from: j */
    public final void m11839j() {
        Uri fromFile;
        String str;
        if (m11834e()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags("application/vnd.android.package-archive".equals(this.f11407m) ? 268435456 : 536870912);
            intent.addCategory("android.intent.category.DEFAULT");
            if (Build.VERSION.SDK_INT >= 24) {
                intent.addFlags(1);
                String packageName = this.f11403i.getPackageName();
                fromFile = C5783b.getUriForFile(this.f11403i, packageName + ".fileProvider.com.joutvhu.openfile", new File(this.f11406l));
            } else {
                fromFile = Uri.fromFile(new File(this.f11406l));
            }
            intent.setDataAndType(fromFile, this.f11407m);
            int i10 = 0;
            try {
                this.f11404j.startActivity(intent);
                str = "done";
            } catch (ActivityNotFoundException unused) {
                i10 = -1;
                str = "No APP found to open this file。";
            } catch (Exception unused2) {
                i10 = -4;
                str = "File opened incorrectly。";
            }
            m11838i(i10, str);
        }
    }

    /* renamed from: k */
    public final void m11840k() {
        if (this.f11404j == null) {
            return;
        }
        this.f11404j.startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + this.f11404j.getPackageName())), 18);
    }

    /* renamed from: l */
    public final boolean m11841l(String str, String str2) {
        return str2 != null && str2.startsWith(str);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 18) {
            return false;
        }
        if (m11830a()) {
            m11839j();
            return false;
        }
        m11838i(-3, "Permission denied: android.permission.REQUEST_INSTALL_PACKAGES");
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f11404j = activityPluginBinding.getActivity();
        activityPluginBinding.addRequestPermissionsResultListener(this);
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f11403i = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "open_file_plus");
        this.f11402h = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.f11402h;
        if (methodChannel == null) {
            return;
        }
        methodChannel.setMethodCallHandler(null);
        this.f11402h = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    @SuppressLint({"NewApi"})
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        this.f11408n = false;
        if (!methodCall.method.equals("open_file")) {
            result.notImplemented();
            this.f11408n = true;
            return;
        }
        this.f11405k = result;
        this.f11406l = (String) methodCall.argument("file_path");
        this.f11407m = (!methodCall.hasArgument(ImagePickerCache.MAP_KEY_TYPE) || methodCall.argument(ImagePickerCache.MAP_KEY_TYPE) == null) ? m11832c(this.f11406l) : (String) methodCall.argument(ImagePickerCache.MAP_KEY_TYPE);
        if (m11837h()) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                if (!m11834e()) {
                    return;
                }
                if (i10 < 33 && !m11835f() && !Environment.isExternalStorageManager()) {
                    m11838i(-3, "Permission denied: android.Manifest.permission.MANAGE_EXTERNAL_STORAGE");
                    return;
                }
            }
            if (!m11831b()) {
                return;
            }
            if ("application/vnd.android.package-archive".equals(this.f11407m)) {
                m11836g();
                return;
            }
        }
        m11839j();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 33432) {
            return false;
        }
        if (m11833d("android.permission.READ_EXTERNAL_STORAGE") && "application/vnd.android.package-archive".equals(this.f11407m)) {
            m11836g();
            return false;
        }
        for (String str : strArr) {
            if (!m11833d(str)) {
                m11838i(-3, "Permission denied: " + str);
                return false;
            }
        }
        m11839j();
        return true;
    }
}
