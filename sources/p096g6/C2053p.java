package p096g6;

import com.google.android.gms.tasks.TaskCompletionSource;
import p064e6.C1671d;
import p079f6.C1841a;
import p079f6.C1841a.b;
import p096g6.C2034j;
import p108h6.C2394s;

/* renamed from: g6.p */
/* loaded from: classes.dex */
public class C2053p<A extends C1841a.b, L> {

    /* renamed from: a */
    public final AbstractC2050o<A, L> f8118a;

    /* renamed from: b */
    public final AbstractC2077x f8119b;

    /* renamed from: c */
    public final Runnable f8120c;

    /* renamed from: g6.p$a */
    /* loaded from: classes.dex */
    public static class a<A extends C1841a.b, L> {

        /* renamed from: a */
        public InterfaceC2056q f8121a;

        /* renamed from: b */
        public InterfaceC2056q f8122b;

        /* renamed from: d */
        public C2034j f8124d;

        /* renamed from: e */
        public C1671d[] f8125e;

        /* renamed from: g */
        public int f8127g;

        /* renamed from: c */
        public Runnable f8123c = new Runnable() { // from class: g6.b1
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f */
        public boolean f8126f = true;

        public /* synthetic */ a(C2016e1 c2016e1) {
        }

        /* renamed from: a */
        public C2053p<A, L> m8238a() {
            C2394s.m9609b(this.f8121a != null, "Must set register function");
            C2394s.m9609b(this.f8122b != null, "Must set unregister function");
            C2394s.m9609b(this.f8124d != null, "Must set holder");
            return new C2053p<>(new C2008c1(this, this.f8124d, this.f8125e, this.f8126f, this.f8127g), new C2012d1(this, (C2034j.a) C2394s.m9620m(this.f8124d.m8160b(), "Key must not be null")), this.f8123c, null);
        }

        /* renamed from: b */
        public a<A, L> m8239b(InterfaceC2056q<A, TaskCompletionSource<Void>> interfaceC2056q) {
            this.f8121a = interfaceC2056q;
            return this;
        }

        /* renamed from: c */
        public a<A, L> m8240c(int i10) {
            this.f8127g = i10;
            return this;
        }

        /* renamed from: d */
        public a<A, L> m8241d(InterfaceC2056q<A, TaskCompletionSource<Boolean>> interfaceC2056q) {
            this.f8122b = interfaceC2056q;
            return this;
        }

        /* renamed from: e */
        public a<A, L> m8242e(C2034j<L> c2034j) {
            this.f8124d = c2034j;
            return this;
        }
    }

    public /* synthetic */ C2053p(AbstractC2050o abstractC2050o, AbstractC2077x abstractC2077x, Runnable runnable, C2020f1 c2020f1) {
        this.f8118a = abstractC2050o;
        this.f8119b = abstractC2077x;
        this.f8120c = runnable;
    }

    /* renamed from: a */
    public static <A extends C1841a.b, L> a<A, L> m8235a() {
        return new a<>(null);
    }
}
