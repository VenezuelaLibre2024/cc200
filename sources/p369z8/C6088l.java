package p369z8;

import com.google.android.gms.tasks.TaskCompletionSource;
import p024b9.AbstractC0523d;

/* renamed from: z8.l */
/* loaded from: classes.dex */
public class C6088l implements InterfaceC6091o {

    /* renamed from: a */
    public final TaskCompletionSource<String> f22612a;

    public C6088l(TaskCompletionSource<String> taskCompletionSource) {
        this.f22612a = taskCompletionSource;
    }

    @Override // p369z8.InterfaceC6091o
    /* renamed from: a */
    public boolean mo24334a(AbstractC0523d abstractC0523d) {
        if (!abstractC0523d.m2536l() && !abstractC0523d.m2535k() && !abstractC0523d.m2533i()) {
            return false;
        }
        this.f22612a.trySetResult(abstractC0523d.mo2505d());
        return true;
    }

    @Override // p369z8.InterfaceC6091o
    /* renamed from: b */
    public boolean mo24335b(Exception exc) {
        return false;
    }
}
