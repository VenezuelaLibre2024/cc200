package p207o6;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import io.flutter.plugins.firebase.auth.Constants;
import p064e6.C1683j;

/* renamed from: o6.h */
/* loaded from: classes.dex */
public final class C3939h {

    /* renamed from: a */
    public static Boolean f14186a;

    /* renamed from: b */
    public static Boolean f14187b;

    /* renamed from: c */
    public static Boolean f14188c;

    /* renamed from: d */
    public static Boolean f14189d;

    /* renamed from: a */
    public static boolean m14939a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f14189d == null) {
            boolean z10 = false;
            if (C3944m.m14959h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f14189d = Boolean.valueOf(z10);
        }
        return f14189d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m14940b() {
        int i10 = C1683j.f6269a;
        return Constants.USER.equals(Build.TYPE);
    }

    @SideEffectFree
    @TargetApi(20)
    /* renamed from: c */
    public static boolean m14941c(Context context) {
        return m14945g(context.getPackageManager());
    }

    @TargetApi(26)
    /* renamed from: d */
    public static boolean m14942d(Context context) {
        if (m14941c(context) && !C3944m.m14958g()) {
            return true;
        }
        if (m14943e(context)) {
            return !C3944m.m14959h() || C3944m.m14962k();
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: e */
    public static boolean m14943e(Context context) {
        if (f14187b == null) {
            boolean z10 = false;
            if (C3944m.m14957f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f14187b = Boolean.valueOf(z10);
        }
        return f14187b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m14944f(Context context) {
        if (f14188c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f14188c = Boolean.valueOf(z10);
        }
        return f14188c.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    /* renamed from: g */
    public static boolean m14945g(PackageManager packageManager) {
        if (f14186a == null) {
            boolean z10 = false;
            if (C3944m.m14956e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f14186a = Boolean.valueOf(z10);
        }
        return f14186a.booleanValue();
    }
}
