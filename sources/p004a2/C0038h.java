package p004a2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p017b2.AbstractC0446a;
import p017b2.C0448b;
import p017b2.C0450d;
import p017b2.C0451e;
import p017b2.C0453g;
import p017b2.C0464r;
import p017b2.C0465s;
import p017b2.C0466t;
import p017b2.C0467u;
import p017b2.InterfaceC0468v;

/* renamed from: a2.h */
/* loaded from: classes.dex */
public class C0038h {

    /* renamed from: a */
    public static final Uri f67a = Uri.parse("*");

    /* renamed from: b */
    public static final Uri f68b = Uri.parse("");

    /* renamed from: a2.h$a */
    /* loaded from: classes.dex */
    public interface a {
        void onComplete(long j10);
    }

    /* renamed from: a2.h$b */
    /* loaded from: classes.dex */
    public interface b {
        void onPostMessage(WebView webView, C0036f c0036f, Uri uri, boolean z10, AbstractC0031a abstractC0031a);
    }

    /* renamed from: a */
    public static void m140a(WebView webView, String str, Set<String> set, b bVar) {
        if (!C0465s.f2184S.m2294d()) {
            throw C0465s.m2367a();
        }
        m147h(webView).m2376a(str, (String[]) set.toArray(new String[0]), bVar);
    }

    /* renamed from: b */
    public static WebViewProviderBoundaryInterface m141b(WebView webView) {
        return m144e().createWebView(webView);
    }

    /* renamed from: c */
    public static AbstractC0037g[] m142c(WebView webView) {
        AbstractC0446a.b bVar = C0465s.f2169D;
        if (bVar.mo2293c()) {
            return C0464r.m2364k(C0448b.m2301c(webView));
        }
        if (bVar.m2294d()) {
            return m147h(webView).m2377b();
        }
        throw C0465s.m2367a();
    }

    /* renamed from: d */
    public static PackageInfo m143d(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            return null;
        }
        if (i10 >= 26) {
            return C0450d.m2329a();
        }
        try {
            PackageInfo m145f = m145f();
            return m145f != null ? m145f : m146g(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static InterfaceC0468v m144e() {
        return C0466t.m2373d();
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: f */
    public static PackageInfo m145f() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: g */
    public static PackageInfo m146g(Context context) {
        try {
            int i10 = Build.VERSION.SDK_INT;
            String str = (String) ((i10 < 21 || i10 > 23) ? Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]) : Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]));
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static C0467u m147h(WebView webView) {
        return new C0467u(m141b(webView));
    }

    /* renamed from: i */
    public static Uri m148i() {
        AbstractC0446a.f fVar = C0465s.f2199j;
        if (fVar.mo2293c()) {
            return C0451e.m2335b();
        }
        if (fVar.m2294d()) {
            return m144e().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw C0465s.m2367a();
    }

    /* renamed from: j */
    public static void m149j(WebView webView, C0036f c0036f, Uri uri) {
        if (f67a.equals(uri)) {
            uri = f68b;
        }
        AbstractC0446a.b bVar = C0465s.f2170E;
        if (bVar.mo2293c()) {
            C0448b.m2308j(webView, C0464r.m2361f(c0036f), uri);
        } else {
            if (!bVar.m2294d()) {
                throw C0465s.m2367a();
            }
            m147h(webView).m2378c(c0036f, uri);
        }
    }

    /* renamed from: k */
    public static void m150k(Set<String> set, ValueCallback<Boolean> valueCallback) {
        AbstractC0446a.f fVar = C0465s.f2198i;
        AbstractC0446a.f fVar2 = C0465s.f2197h;
        if (fVar.m2294d()) {
            m144e().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (fVar2.mo2293c()) {
            C0451e.m2337d(arrayList, valueCallback);
        } else {
            if (!fVar2.m2294d()) {
                throw C0465s.m2367a();
            }
            m144e().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    @Deprecated
    /* renamed from: l */
    public static void m151l(List<String> list, ValueCallback<Boolean> valueCallback) {
        m150k(new HashSet(list), valueCallback);
    }

    /* renamed from: m */
    public static void m152m(WebView webView, AbstractC0041k abstractC0041k) {
        AbstractC0446a.h hVar = C0465s.f2177L;
        if (hVar.mo2293c()) {
            C0453g.m2350e(webView, abstractC0041k);
        } else {
            if (!hVar.m2294d()) {
                throw C0465s.m2367a();
            }
            m147h(webView).m2379d(null, abstractC0041k);
        }
    }

    /* renamed from: n */
    public static void m153n(Context context, ValueCallback<Boolean> valueCallback) {
        AbstractC0446a.f fVar = C0465s.f2194e;
        if (fVar.mo2293c()) {
            C0451e.m2339f(context, valueCallback);
        } else {
            if (!fVar.m2294d()) {
                throw C0465s.m2367a();
            }
            m144e().getStatics().initSafeBrowsing(context, valueCallback);
        }
    }
}
