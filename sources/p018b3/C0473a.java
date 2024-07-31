package p018b3;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p090g0.C1950j;

/* renamed from: b3.a */
/* loaded from: classes.dex */
public class C0473a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: h */
    public MethodChannel f2236h;

    /* renamed from: i */
    public Context f2237i;

    /* renamed from: b3.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ String f2238h;

        public a(String str) {
            this.f2238h = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((LocaleManager) C0473a.this.f2237i.getSystemService(LocaleManager.class)).setApplicationLocales(LocaleList.forLanguageTags(this.f2238h));
        }
    }

    /* renamed from: b */
    public final String m2383b() {
        return m2384c(Locale.getDefault());
    }

    /* renamed from: c */
    public final String m2384c(Locale locale) {
        return Build.VERSION.SDK_INT >= 21 ? locale.toLanguageTag() : locale.toString();
    }

    /* renamed from: d */
    public final List<String> m2385d() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            C1950j m7865d = C1950j.m7865d();
            for (int i10 = 0; i10 < m7865d.m7868e(); i10++) {
                arrayList.add(m2384c(m7865d.m7867c(i10)));
            }
        } else {
            arrayList.add(m2383b());
        }
        return arrayList;
    }

    /* renamed from: e */
    public final boolean m2386e() {
        return Build.VERSION.SDK_INT >= 33;
    }

    /* renamed from: f */
    public final boolean m2387f(MethodCall methodCall) {
        new Handler(this.f2237i.getMainLooper()).post(new a((String) methodCall.argument("locale")));
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f2237i = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "uk.spiralarm.flutter/devicelocale");
        this.f2236h = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f2236h.setMethodCallHandler(null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0039. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Object obj;
        boolean m2387f;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1571638722:
                if (str.equals("setLanguagePerApp")) {
                    c10 = 0;
                    break;
                }
                break;
            case -882016924:
                if (str.equals("isLanguagePerAppSettingSupported")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1950510234:
                if (str.equals("preferredLanguages")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2037840179:
                if (str.equals("currentLocale")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (Build.VERSION.SDK_INT < 33) {
                    obj = Boolean.FALSE;
                    result.success(obj);
                    return;
                } else {
                    m2387f = m2387f(methodCall);
                    obj = Boolean.valueOf(m2387f);
                    result.success(obj);
                    return;
                }
            case 1:
                m2387f = m2386e();
                obj = Boolean.valueOf(m2387f);
                result.success(obj);
                return;
            case 2:
                obj = m2385d();
                result.success(obj);
                return;
            case 3:
                obj = m2383b();
                result.success(obj);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
