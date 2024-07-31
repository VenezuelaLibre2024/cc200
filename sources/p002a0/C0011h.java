package p002a0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p102h0.C2279g;
import p360z.C5931e;

/* renamed from: a0.h */
/* loaded from: classes.dex */
public class C0011h extends C0009f {

    /* renamed from: g */
    public final Class<?> f27g;

    /* renamed from: h */
    public final Constructor<?> f28h;

    /* renamed from: i */
    public final Method f29i;

    /* renamed from: j */
    public final Method f30j;

    /* renamed from: k */
    public final Method f31k;

    /* renamed from: l */
    public final Method f32l;

    /* renamed from: m */
    public final Method f33m;

    public C0011h() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> m71z = m71z();
            constructor = m58A(m71z);
            method2 = m68w(m71z);
            method3 = m69x(m71z);
            method4 = m59B(m71z);
            method5 = m67v(m71z);
            method = mo70y(m71z);
            cls = m71z;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f27g = cls;
        this.f28h = constructor;
        this.f29i = method2;
        this.f30j = method3;
        this.f31k = method4;
        this.f32l = method5;
        this.f33m = method;
    }

    /* renamed from: p */
    private Object m57p() {
        try {
            return this.f28h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: A */
    public Constructor<?> m58A(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: B */
    public Method m59B(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // p002a0.C0009f, p002a0.C0014k
    /* renamed from: b */
    public Typeface mo50b(Context context, C5931e.c cVar, Resources resources, int i10) {
        if (!m66u()) {
            return super.mo50b(context, cVar, resources, i10);
        }
        Object m57p = m57p();
        if (m57p == null) {
            return null;
        }
        for (C5931e.d dVar : cVar.m23727a()) {
            if (!m63r(context, m57p, dVar.m23728a(), dVar.m23730c(), dVar.m23732e(), dVar.m23733f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.m23731d()))) {
                m62q(m57p);
                return null;
            }
        }
        if (m65t(m57p)) {
            return mo61m(m57p);
        }
        return null;
    }

    @Override // p002a0.C0009f, p002a0.C0014k
    /* renamed from: c */
    public Typeface mo51c(Context context, CancellationSignal cancellationSignal, C2279g.b[] bVarArr, int i10) {
        Typeface mo61m;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m66u()) {
            C2279g.b mo74i = mo74i(bVarArr, i10);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo74i.m9273d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo74i.m9274e()).setItalic(mo74i.m9275f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m95h = C0015l.m95h(context, bVarArr, cancellationSignal);
        Object m57p = m57p();
        if (m57p == null) {
            return null;
        }
        boolean z10 = false;
        for (C2279g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = m95h.get(bVar.m9273d());
            if (byteBuffer != null) {
                if (!m64s(m57p, byteBuffer, bVar.m9272c(), bVar.m9274e(), bVar.m9275f() ? 1 : 0)) {
                    m62q(m57p);
                    return null;
                }
                z10 = true;
            }
        }
        if (!z10) {
            m62q(m57p);
            return null;
        }
        if (m65t(m57p) && (mo61m = mo61m(m57p)) != null) {
            return Typeface.create(mo61m, i10);
        }
        return null;
    }

    @Override // p002a0.C0014k
    /* renamed from: e */
    public Typeface mo60e(Context context, Resources resources, int i10, String str, int i11) {
        if (!m66u()) {
            return super.mo60e(context, resources, i10, str, i11);
        }
        Object m57p = m57p();
        if (m57p == null) {
            return null;
        }
        if (!m63r(context, m57p, str, 0, -1, -1, null)) {
            m62q(m57p);
            return null;
        }
        if (m65t(m57p)) {
            return mo61m(m57p);
        }
        return null;
    }

    /* renamed from: m */
    public Typeface mo61m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f27g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f33m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: q */
    public final void m62q(Object obj) {
        try {
            this.f32l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: r */
    public final boolean m63r(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f29i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    public final boolean m64s(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f30j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public final boolean m65t(Object obj) {
        try {
            return ((Boolean) this.f31k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: u */
    public final boolean m66u() {
        if (this.f29i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f29i != null;
    }

    /* renamed from: v */
    public Method m67v(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: w */
    public Method m68w(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: x */
    public Method m69x(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: y */
    public Method mo70y(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: z */
    public Class<?> m71z() {
        return Class.forName("android.graphics.FontFamily");
    }
}
