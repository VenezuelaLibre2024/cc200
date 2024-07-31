package p134j1;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* renamed from: j1.a */
/* loaded from: classes.dex */
public final class C3208a {

    /* renamed from: a */
    public static final C3208a f11103a = new C3208a();

    /* renamed from: j1.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f11104a = new a();

        /* renamed from: a */
        public final int m11424a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    /* renamed from: a */
    public final int m11423a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.f11104a.m11424a();
        }
        return 0;
    }
}
