package p185m9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Map;
import p195n7.C3767g;
import p197n9.InterfaceC3781b;
import p210o9.C3961f;
import p239q8.InterfaceC4202a;
import p269s8.C4553d;
import td.C4753m;

/* renamed from: m9.a0 */
/* loaded from: classes.dex */
public final class C3556a0 {

    /* renamed from: a */
    public static final C3556a0 f12461a = new C3556a0();

    /* renamed from: b */
    public static final InterfaceC4202a f12462b;

    static {
        InterfaceC4202a m17992i = new C4553d().m17993j(C3559c.f12471a).m17994k(true).m17992i();
        C4753m.m18652e(m17992i, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f12462b = m17992i;
    }

    /* renamed from: a */
    public final C3591z m13207a(C3767g c3767g, C3590y c3590y, C3961f c3961f, Map<InterfaceC3781b.a, ? extends InterfaceC3781b> map, String str) {
        C4753m.m18653f(c3767g, "firebaseApp");
        C4753m.m18653f(c3590y, "sessionDetails");
        C4753m.m18653f(c3961f, "sessionsSettings");
        C4753m.m18653f(map, "subscribers");
        C4753m.m18653f(str, "firebaseInstallationId");
        return new C3591z(EnumC3571i.SESSION_START, new C3564e0(c3590y.m13311b(), c3590y.m13310a(), c3590y.m13312c(), c3590y.m13313d(), new C3563e(m13210d(map.get(InterfaceC3781b.a.PERFORMANCE)), m13210d(map.get(InterfaceC3781b.a.CRASHLYTICS)), c3961f.m14993b()), str), m13208b(c3767g));
    }

    /* renamed from: b */
    public final C3557b m13208b(C3767g c3767g) {
        C4753m.m18653f(c3767g, "firebaseApp");
        Context m14349m = c3767g.m14349m();
        C4753m.m18652e(m14349m, "firebaseApp.applicationContext");
        String packageName = m14349m.getPackageName();
        PackageInfo packageInfo = m14349m.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String m14364c = c3767g.m14351r().m14364c();
        C4753m.m18652e(m14364c, "firebaseApp.options.applicationId");
        String str = Build.MODEL;
        C4753m.m18652e(str, "MODEL");
        String str2 = Build.VERSION.RELEASE;
        C4753m.m18652e(str2, "RELEASE");
        EnumC3584s enumC3584s = EnumC3584s.LOG_ENVIRONMENT_PROD;
        C4753m.m18652e(packageName, "packageName");
        String str3 = packageInfo.versionName;
        String str4 = str3 == null ? valueOf : str3;
        String str5 = Build.MANUFACTURER;
        C4753m.m18652e(str5, "MANUFACTURER");
        C3586u c3586u = C3586u.f12605a;
        Context m14349m2 = c3767g.m14349m();
        C4753m.m18652e(m14349m2, "firebaseApp.applicationContext");
        C3585t m13289d = c3586u.m13289d(m14349m2);
        Context m14349m3 = c3767g.m14349m();
        C4753m.m18652e(m14349m3, "firebaseApp.applicationContext");
        return new C3557b(m14364c, str, "1.2.1", str2, enumC3584s, new C3555a(packageName, str4, valueOf, str5, m13289d, c3586u.m13288c(m14349m3)));
    }

    /* renamed from: c */
    public final InterfaceC4202a m13209c() {
        return f12462b;
    }

    /* renamed from: d */
    public final EnumC3561d m13210d(InterfaceC3781b interfaceC3781b) {
        return interfaceC3781b == null ? EnumC3561d.COLLECTION_SDK_NOT_INSTALLED : interfaceC3781b.mo6876b() ? EnumC3561d.COLLECTION_ENABLED : EnumC3561d.COLLECTION_DISABLED;
    }
}
