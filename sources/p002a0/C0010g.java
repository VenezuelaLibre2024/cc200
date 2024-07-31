package p002a0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p102h0.C2279g;
import p285u.C4777g;
import p360z.C5931e;

/* renamed from: a0.g */
/* loaded from: classes.dex */
public class C0010g extends C0014k {

    /* renamed from: b */
    public static final Class<?> f23b;

    /* renamed from: c */
    public static final Constructor<?> f24c;

    /* renamed from: d */
    public static final Method f25d;

    /* renamed from: e */
    public static final Method f26e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f24c = constructor;
        f23b = cls;
        f25d = method2;
        f26e = method;
    }

    /* renamed from: l */
    public static boolean m53l(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f25d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static Typeface m54m(Object obj) {
        try {
            Object newInstance = Array.newInstance(f23b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f26e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static boolean m55n() {
        Method method = f25d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: o */
    public static Object m56o() {
        try {
            return f24c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p002a0.C0014k
    /* renamed from: b */
    public Typeface mo50b(Context context, C5931e.c cVar, Resources resources, int i10) {
        Object m56o = m56o();
        if (m56o == null) {
            return null;
        }
        for (C5931e.d dVar : cVar.m23727a()) {
            ByteBuffer m89b = C0015l.m89b(context, resources, dVar.m23729b());
            if (m89b == null || !m53l(m56o, m89b, dVar.m23730c(), dVar.m23732e(), dVar.m23733f())) {
                return null;
            }
        }
        return m54m(m56o);
    }

    @Override // p002a0.C0014k
    /* renamed from: c */
    public Typeface mo51c(Context context, CancellationSignal cancellationSignal, C2279g.b[] bVarArr, int i10) {
        Object m56o = m56o();
        if (m56o == null) {
            return null;
        }
        C4777g c4777g = new C4777g();
        for (C2279g.b bVar : bVarArr) {
            Uri m9273d = bVar.m9273d();
            ByteBuffer byteBuffer = (ByteBuffer) c4777g.get(m9273d);
            if (byteBuffer == null) {
                byteBuffer = C0015l.m93f(context, cancellationSignal, m9273d);
                c4777g.put(m9273d, byteBuffer);
            }
            if (byteBuffer == null || !m53l(m56o, byteBuffer, bVar.m9272c(), bVar.m9274e(), bVar.m9275f())) {
                return null;
            }
        }
        Typeface m54m = m54m(m56o);
        if (m54m == null) {
            return null;
        }
        return Typeface.create(m54m, i10);
    }
}
