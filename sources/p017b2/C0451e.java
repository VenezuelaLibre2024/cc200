package p017b2;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.List;

/* renamed from: b2.e */
/* loaded from: classes.dex */
public class C0451e {
    /* renamed from: a */
    public static void m2334a(SafeBrowsingResponse safeBrowsingResponse, boolean z10) {
        safeBrowsingResponse.backToSafety(z10);
    }

    /* renamed from: b */
    public static Uri m2335b() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    /* renamed from: c */
    public static void m2336c(SafeBrowsingResponse safeBrowsingResponse, boolean z10) {
        safeBrowsingResponse.proceed(z10);
    }

    /* renamed from: d */
    public static void m2337d(List<String> list, ValueCallback<Boolean> valueCallback) {
        WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    /* renamed from: e */
    public static void m2338e(SafeBrowsingResponse safeBrowsingResponse, boolean z10) {
        safeBrowsingResponse.showInterstitial(z10);
    }

    /* renamed from: f */
    public static void m2339f(Context context, ValueCallback<Boolean> valueCallback) {
        WebView.startSafeBrowsing(context, valueCallback);
    }
}
