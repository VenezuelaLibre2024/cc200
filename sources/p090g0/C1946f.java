package p090g0;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: g0.f */
/* loaded from: classes.dex */
public final class C1946f {

    /* renamed from: g0.f$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static LocaleList m7859a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    /* renamed from: a */
    public static C1950j m7858a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C1950j.m7866f(a.m7859a(configuration)) : C1950j.m7863a(configuration.locale);
    }
}
