package p178m2;

import android.content.ComponentName;
import android.content.Context;
import p029c2.AbstractC0592j;

/* renamed from: m2.d */
/* loaded from: classes.dex */
public class C3503d {

    /* renamed from: a */
    public static final String f12277a = AbstractC0592j.m2972f("PackageManagerHelper");

    /* renamed from: a */
    public static void m13047a(Context context, Class<?> cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            AbstractC0592j m2970c = AbstractC0592j.m2970c();
            String str = f12277a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z10 ? "enabled" : "disabled";
            m2970c.mo2973a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            AbstractC0592j m2970c2 = AbstractC0592j.m2970c();
            String str2 = f12277a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z10 ? "enabled" : "disabled";
            m2970c2.mo2973a(str2, String.format("%s could not be %s", objArr2), e10);
        }
    }
}
