package p002a0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p102h0.C2279g;
import p360z.C5931e;

/* renamed from: a0.f */
/* loaded from: classes.dex */
public class C0009f extends C0014k {

    /* renamed from: b */
    public static Class<?> f18b = null;

    /* renamed from: c */
    public static Constructor<?> f19c = null;

    /* renamed from: d */
    public static Method f20d = null;

    /* renamed from: e */
    public static Method f21e = null;

    /* renamed from: f */
    public static boolean f22f = false;

    /* renamed from: l */
    public static boolean m46l(Object obj, String str, int i10, boolean z10) {
        m48o();
        try {
            return ((Boolean) f20d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: m */
    public static Typeface m47m(Object obj) {
        m48o();
        try {
            Object newInstance = Array.newInstance(f18b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f21e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: o */
    public static void m48o() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f22f) {
            return;
        }
        f22f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f19c = constructor;
        f18b = cls;
        f20d = method2;
        f21e = method;
    }

    /* renamed from: p */
    public static Object m49p() {
        m48o();
        try {
            return f19c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // p002a0.C0014k
    /* renamed from: b */
    public Typeface mo50b(Context context, C5931e.c cVar, Resources resources, int i10) {
        Object m49p = m49p();
        for (C5931e.d dVar : cVar.m23727a()) {
            File m92e = C0015l.m92e(context);
            if (m92e == null) {
                return null;
            }
            try {
                if (!C0015l.m90c(m92e, resources, dVar.m23729b())) {
                    return null;
                }
                if (!m46l(m49p, m92e.getPath(), dVar.m23732e(), dVar.m23733f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m92e.delete();
            }
        }
        return m47m(m49p);
    }

    @Override // p002a0.C0014k
    /* renamed from: c */
    public Typeface mo51c(Context context, CancellationSignal cancellationSignal, C2279g.b[] bVarArr, int i10) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File m52n = m52n(openFileDescriptor);
                if (m52n != null && m52n.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(m52n);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface mo73d = super.mo73d(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return mo73d;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public final File m52n(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
