package p323w9;

import com.google.gson.C1375k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: w9.c */
/* loaded from: classes.dex */
public final class C5450c extends AbstractC5449b {

    /* renamed from: d */
    public static Class f20303d;

    /* renamed from: b */
    public final Object f20304b = m21613d();

    /* renamed from: c */
    public final Field f20305c = m21612c();

    /* renamed from: c */
    public static Field m21612c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Object m21613d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f20303d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p323w9.AbstractC5449b
    /* renamed from: b */
    public void mo21610b(AccessibleObject accessibleObject) {
        if (m21614e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            throw new C1375k("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
        }
    }

    /* renamed from: e */
    public boolean m21614e(AccessibleObject accessibleObject) {
        if (this.f20304b != null && this.f20305c != null) {
            try {
                f20303d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f20304b, accessibleObject, Long.valueOf(((Long) f20303d.getMethod("objectFieldOffset", Field.class).invoke(this.f20304b, this.f20305c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
