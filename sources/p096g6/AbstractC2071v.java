package p096g6;

import com.google.android.gms.tasks.TaskCompletionSource;
import p064e6.C1671d;
import p079f6.C1841a;
import p079f6.C1841a.b;
import p108h6.C2394s;

/* renamed from: g6.v */
/* loaded from: classes.dex */
public abstract class AbstractC2071v<A extends C1841a.b, ResultT> {

    /* renamed from: a */
    public final C1671d[] f8147a;

    /* renamed from: b */
    public final boolean f8148b;

    /* renamed from: c */
    public final int f8149c;

    /* renamed from: g6.v$a */
    /* loaded from: classes.dex */
    public static class a<A extends C1841a.b, ResultT> {

        /* renamed from: a */
        public InterfaceC2056q f8150a;

        /* renamed from: c */
        public C1671d[] f8152c;

        /* renamed from: b */
        public boolean f8151b = true;

        /* renamed from: d */
        public int f8153d = 0;

        public /* synthetic */ a(C2049n1 c2049n1) {
        }

        /* renamed from: a */
        public AbstractC2071v<A, ResultT> m8271a() {
            C2394s.m9609b(this.f8150a != null, "execute parameter required");
            return new C2046m1(this, this.f8152c, this.f8151b, this.f8153d);
        }

        /* renamed from: b */
        public a<A, ResultT> m8272b(InterfaceC2056q<A, TaskCompletionSource<ResultT>> interfaceC2056q) {
            this.f8150a = interfaceC2056q;
            return this;
        }

        /* renamed from: c */
        public a<A, ResultT> m8273c(boolean z10) {
            this.f8151b = z10;
            return this;
        }

        /* renamed from: d */
        public a<A, ResultT> m8274d(C1671d... c1671dArr) {
            this.f8152c = c1671dArr;
            return this;
        }

        /* renamed from: e */
        public a<A, ResultT> m8275e(int i10) {
            this.f8153d = i10;
            return this;
        }
    }

    public AbstractC2071v(C1671d[] c1671dArr, boolean z10, int i10) {
        this.f8147a = c1671dArr;
        boolean z11 = false;
        if (c1671dArr != null && z10) {
            z11 = true;
        }
        this.f8148b = z11;
        this.f8149c = i10;
    }

    /* renamed from: a */
    public static <A extends C1841a.b, ResultT> a<A, ResultT> m8266a() {
        return new a<>(null);
    }

    /* renamed from: b */
    public abstract void mo8223b(A a10, TaskCompletionSource<ResultT> taskCompletionSource);

    /* renamed from: c */
    public boolean m8267c() {
        return this.f8148b;
    }

    /* renamed from: d */
    public final int m8268d() {
        return this.f8149c;
    }

    /* renamed from: e */
    public final C1671d[] m8269e() {
        return this.f8147a;
    }
}
