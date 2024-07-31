package p102h0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import p002a0.C0008e;
import p133j0.C3205d;

/* renamed from: h0.g */
/* loaded from: classes.dex */
public class C2279g {

    /* renamed from: h0.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f9145a;

        /* renamed from: b */
        public final b[] f9146b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f9145a = i10;
            this.f9146b = bVarArr;
        }

        /* renamed from: a */
        public static a m9267a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        /* renamed from: b */
        public b[] m9268b() {
            return this.f9146b;
        }

        /* renamed from: c */
        public int m9269c() {
            return this.f9145a;
        }
    }

    /* renamed from: h0.g$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final Uri f9147a;

        /* renamed from: b */
        public final int f9148b;

        /* renamed from: c */
        public final int f9149c;

        /* renamed from: d */
        public final boolean f9150d;

        /* renamed from: e */
        public final int f9151e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f9147a = (Uri) C3205d.m11414j(uri);
            this.f9148b = i10;
            this.f9149c = i11;
            this.f9150d = z10;
            this.f9151e = i12;
        }

        /* renamed from: a */
        public static b m9270a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        /* renamed from: b */
        public int m9271b() {
            return this.f9151e;
        }

        /* renamed from: c */
        public int m9272c() {
            return this.f9148b;
        }

        /* renamed from: d */
        public Uri m9273d() {
            return this.f9147a;
        }

        /* renamed from: e */
        public int m9274e() {
            return this.f9149c;
        }

        /* renamed from: f */
        public boolean m9275f() {
            return this.f9150d;
        }
    }

    /* renamed from: h0.g$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public void mo44a(int i10) {
            throw null;
        }

        /* renamed from: b */
        public void mo45b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m9264a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return C0008e.m37b(context, cancellationSignal, bVarArr, 0);
    }

    /* renamed from: b */
    public static a m9265b(Context context, CancellationSignal cancellationSignal, C2277e c2277e) {
        return C2276d.m9242e(context, c2277e, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m9266c(Context context, C2277e c2277e, int i10, boolean z10, int i11, Handler handler, c cVar) {
        C2273a c2273a = new C2273a(cVar, handler);
        return z10 ? C2278f.m9258e(context, c2277e, c2273a, i10, i11) : C2278f.m9257d(context, c2277e, i10, null, c2273a);
    }
}
