package p002a0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p079f6.C1841a;
import p102h0.C2279g;
import p360z.C5931e;

/* renamed from: a0.k */
/* loaded from: classes.dex */
public class C0014k {

    /* renamed from: a */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, C5931e.c> f34a = new ConcurrentHashMap<>();

    /* renamed from: a0.k$a */
    /* loaded from: classes.dex */
    public class a implements c<C2279g.b> {
        public a() {
        }

        @Override // p002a0.C0014k.c
        /* renamed from: c */
        public int mo82a(C2279g.b bVar) {
            return bVar.m9274e();
        }

        @Override // p002a0.C0014k.c
        /* renamed from: d */
        public boolean mo83b(C2279g.b bVar) {
            return bVar.m9275f();
        }
    }

    /* renamed from: a0.k$b */
    /* loaded from: classes.dex */
    public class b implements c<C5931e.d> {
        public b() {
        }

        @Override // p002a0.C0014k.c
        /* renamed from: c */
        public int mo82a(C5931e.d dVar) {
            return dVar.m23732e();
        }

        @Override // p002a0.C0014k.c
        /* renamed from: d */
        public boolean mo83b(C5931e.d dVar) {
            return dVar.m23733f();
        }
    }

    /* renamed from: a0.k$c */
    /* loaded from: classes.dex */
    public interface c<T> {
        /* renamed from: a */
        int mo82a(T t10);

        /* renamed from: b */
        boolean mo83b(T t10);
    }

    /* renamed from: g */
    public static <T> T m76g(T[] tArr, int i10, c<T> cVar) {
        return (T) m77h(tArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, cVar);
    }

    /* renamed from: h */
    public static <T> T m77h(T[] tArr, int i10, boolean z10, c<T> cVar) {
        T t10 = null;
        int i11 = C1841a.e.API_PRIORITY_OTHER;
        for (T t11 : tArr) {
            int abs = (Math.abs(cVar.mo82a(t11) - i10) * 2) + (cVar.mo83b(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > abs) {
                t10 = t11;
                i11 = abs;
            }
        }
        return t10;
    }

    /* renamed from: k */
    public static long m78k(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e10) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e10);
            return 0L;
        } catch (NoSuchFieldException e11) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e11);
            return 0L;
        }
    }

    /* renamed from: a */
    public final void m79a(Typeface typeface, C5931e.c cVar) {
        long m78k = m78k(typeface);
        if (m78k != 0) {
            this.f34a.put(Long.valueOf(m78k), cVar);
        }
    }

    /* renamed from: b */
    public Typeface mo50b(Context context, C5931e.c cVar, Resources resources, int i10) {
        C5931e.d m80f = m80f(cVar, i10);
        if (m80f == null) {
            return null;
        }
        Typeface m39d = C0008e.m39d(context, resources, m80f.m23729b(), m80f.m23728a(), 0, i10);
        m79a(m39d, cVar);
        return m39d;
    }

    /* renamed from: c */
    public Typeface mo51c(Context context, CancellationSignal cancellationSignal, C2279g.b[] bVarArr, int i10) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo74i(bVarArr, i10).m9273d());
            try {
                Typeface mo73d = mo73d(context, inputStream);
                C0015l.m88a(inputStream);
                return mo73d;
            } catch (IOException unused) {
                C0015l.m88a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0015l.m88a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: d */
    public Typeface mo73d(Context context, InputStream inputStream) {
        File m92e = C0015l.m92e(context);
        if (m92e == null) {
            return null;
        }
        try {
            if (C0015l.m91d(m92e, inputStream)) {
                return Typeface.createFromFile(m92e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m92e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo60e(Context context, Resources resources, int i10, String str, int i11) {
        File m92e = C0015l.m92e(context);
        if (m92e == null) {
            return null;
        }
        try {
            if (C0015l.m90c(m92e, resources, i10)) {
                return Typeface.createFromFile(m92e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m92e.delete();
        }
    }

    /* renamed from: f */
    public final C5931e.d m80f(C5931e.c cVar, int i10) {
        return (C5931e.d) m76g(cVar.m23727a(), i10, new b());
    }

    /* renamed from: i */
    public C2279g.b mo74i(C2279g.b[] bVarArr, int i10) {
        return (C2279g.b) m76g(bVarArr, i10, new a());
    }

    /* renamed from: j */
    public C5931e.c m81j(Typeface typeface) {
        long m78k = m78k(typeface);
        if (m78k == 0) {
            return null;
        }
        return this.f34a.get(Long.valueOf(m78k));
    }
}
