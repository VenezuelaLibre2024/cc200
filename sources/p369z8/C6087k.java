package p369z8;

import com.google.android.gms.tasks.TaskCompletionSource;
import p024b9.AbstractC0523d;

/* renamed from: z8.k */
/* loaded from: classes.dex */
public class C6087k implements InterfaceC6091o {

    /* renamed from: a */
    public final C6092p f22610a;

    /* renamed from: b */
    public final TaskCompletionSource<AbstractC6089m> f22611b;

    public C6087k(C6092p c6092p, TaskCompletionSource<AbstractC6089m> taskCompletionSource) {
        this.f22610a = c6092p;
        this.f22611b = taskCompletionSource;
    }

    @Override // p369z8.InterfaceC6091o
    /* renamed from: a */
    public boolean mo24334a(AbstractC0523d abstractC0523d) {
        if (!abstractC0523d.m2535k() || this.f22610a.m24347f(abstractC0523d)) {
            return false;
        }
        this.f22611b.setResult(AbstractC6089m.m24336a().mo24297b(abstractC0523d.mo2503b()).mo24299d(abstractC0523d.mo2504c()).mo24298c(abstractC0523d.mo2509h()).mo24296a());
        return true;
    }

    @Override // p369z8.InterfaceC6091o
    /* renamed from: b */
    public boolean mo24335b(Exception exc) {
        this.f22611b.trySetException(exc);
        return true;
    }
}
