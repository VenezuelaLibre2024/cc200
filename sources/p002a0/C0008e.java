package p002a0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p102h0.C2279g;
import p285u.C4775e;
import p360z.C5931e;
import p360z.C5934h;

/* renamed from: a0.e */
/* loaded from: classes.dex */
public class C0008e {

    /* renamed from: a */
    public static final C0014k f15a;

    /* renamed from: b */
    public static final C4775e<String, Typeface> f16b;

    /* renamed from: a0.e$a */
    /* loaded from: classes.dex */
    public static class a extends C2279g.c {

        /* renamed from: a */
        public C5934h.f f17a;

        public a(C5934h.f fVar) {
            this.f17a = fVar;
        }

        @Override // p102h0.C2279g.c
        /* renamed from: a */
        public void mo44a(int i10) {
            C5934h.f fVar = this.f17a;
            if (fVar != null) {
                fVar.m23764f(i10);
            }
        }

        @Override // p102h0.C2279g.c
        /* renamed from: b */
        public void mo45b(Typeface typeface) {
            C5934h.f fVar = this.f17a;
            if (fVar != null) {
                fVar.m23765g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f15a = i10 >= 29 ? new C0013j() : i10 >= 28 ? new C0012i() : i10 >= 26 ? new C0011h() : (i10 < 24 || !C0010g.m55n()) ? i10 >= 21 ? new C0009f() : new C0014k() : new C0010g();
        f16b = new C4775e<>(16);
    }

    /* renamed from: a */
    public static Typeface m36a(Context context, Typeface typeface, int i10) {
        Typeface m42g;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (m42g = m42g(context, typeface, i10)) == null) ? Typeface.create(typeface, i10) : m42g;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m37b(Context context, CancellationSignal cancellationSignal, C2279g.b[] bVarArr, int i10) {
        return f15a.mo51c(context, cancellationSignal, bVarArr, i10);
    }

    /* renamed from: c */
    public static Typeface m38c(Context context, C5931e.b bVar, Resources resources, int i10, String str, int i11, int i12, C5934h.f fVar, Handler handler, boolean z10) {
        Typeface mo50b;
        if (bVar instanceof C5931e.e) {
            C5931e.e eVar = (C5931e.e) bVar;
            Typeface m43h = m43h(eVar.m23736c());
            if (m43h != null) {
                if (fVar != null) {
                    fVar.m23767d(m43h, handler);
                }
                return m43h;
            }
            boolean z11 = !z10 ? fVar != null : eVar.m23734a() != 0;
            int m23737d = z10 ? eVar.m23737d() : -1;
            mo50b = C2279g.m9266c(context, eVar.m23735b(), i12, z11, m23737d, C5934h.f.m23763e(handler), new a(fVar));
        } else {
            mo50b = f15a.mo50b(context, (C5931e.c) bVar, resources, i12);
            if (fVar != null) {
                if (mo50b != null) {
                    fVar.m23767d(mo50b, handler);
                } else {
                    fVar.m23766c(-3, handler);
                }
            }
        }
        if (mo50b != null) {
            f16b.put(m40e(resources, i10, str, i11, i12), mo50b);
        }
        return mo50b;
    }

    /* renamed from: d */
    public static Typeface m39d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface mo60e = f15a.mo60e(context, resources, i10, str, i12);
        if (mo60e != null) {
            f16b.put(m40e(resources, i10, str, i11, i12), mo60e);
        }
        return mo60e;
    }

    /* renamed from: e */
    public static String m40e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    /* renamed from: f */
    public static Typeface m41f(Resources resources, int i10, String str, int i11, int i12) {
        return f16b.get(m40e(resources, i10, str, i11, i12));
    }

    /* renamed from: g */
    public static Typeface m42g(Context context, Typeface typeface, int i10) {
        C0014k c0014k = f15a;
        C5931e.c m81j = c0014k.m81j(typeface);
        if (m81j == null) {
            return null;
        }
        return c0014k.mo50b(context, m81j, context.getResources(), i10);
    }

    /* renamed from: h */
    public static Typeface m43h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
