package p002a0;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a0.i */
/* loaded from: classes.dex */
public class C0012i extends C0011h {
    @Override // p002a0.C0011h
    /* renamed from: m */
    public Typeface mo61m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f27g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f33m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // p002a0.C0011h
    /* renamed from: y */
    public Method mo70y(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
