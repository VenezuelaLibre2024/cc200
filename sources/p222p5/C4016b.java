package p222p5;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: p5.b */
/* loaded from: classes.dex */
public final class C4016b {

    /* renamed from: a */
    public static Method f14450a;

    /* renamed from: a */
    public static IBinder m15252a(Bundle bundle, String str) {
        return C4041n0.f14513a >= 18 ? bundle.getBinder(str) : m15253b(bundle, str);
    }

    /* renamed from: b */
    public static IBinder m15253b(Bundle bundle, String str) {
        String str2;
        Method method = f14450a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f14450a = method2;
                method2.setAccessible(true);
                method = f14450a;
            } catch (NoSuchMethodException e10) {
                e = e10;
                str2 = "Failed to retrieve getIBinder method";
                C4046r.m15527g("BundleUtil", str2, e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            e = e11;
            str2 = "Failed to invoke getIBinder via reflection";
            C4046r.m15527g("BundleUtil", str2, e);
            return null;
        }
    }
}
