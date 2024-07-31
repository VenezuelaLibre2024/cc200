package nc;

/* renamed from: nc.n */
/* loaded from: classes2.dex */
public interface InterfaceC3801n {

    /* renamed from: nc.n$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC3797j {

        /* renamed from: a */
        public final /* synthetic */ C3796i f13699a;

        public a(C3796i c3796i) {
            this.f13699a = c3796i;
        }

        @Override // nc.InterfaceC3797j
        /* renamed from: a */
        public int mo14488a() {
            return this.f13699a.f13677c;
        }

        @Override // nc.InterfaceC3797j
        /* renamed from: b */
        public boolean mo14489b() {
            return this.f13699a.m14466F();
        }
    }

    /* renamed from: b */
    static InterfaceC3801n m14500b(String str, int i10, int i11) {
        return i10 == 1 ? new C3805r(str, i11) : new C3803p(str, i10, i11);
    }

    /* renamed from: a */
    void mo14501a(C3798k c3798k);

    /* renamed from: c */
    void mo14502c();

    /* renamed from: d */
    default void m14503d(C3796i c3796i, Runnable runnable) {
        mo14501a(new C3798k(c3796i == null ? null : new a(c3796i), runnable));
    }

    void start();
}
