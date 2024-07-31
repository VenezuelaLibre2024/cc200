package p108h6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import p079f6.AbstractC1848h;
import p108h6.C2391r;

/* renamed from: h6.o0 */
/* loaded from: classes.dex */
public final class C2383o0 implements AbstractC1848h.a {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1848h f9664a;

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f9665b;

    /* renamed from: c */
    public final /* synthetic */ C2391r.a f9666c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2389q0 f9667d;

    public C2383o0(AbstractC1848h abstractC1848h, TaskCompletionSource taskCompletionSource, C2391r.a aVar, InterfaceC2389q0 interfaceC2389q0) {
        this.f9664a = abstractC1848h;
        this.f9665b = taskCompletionSource;
        this.f9666c = aVar;
        this.f9667d = interfaceC2389q0;
    }

    @Override // p079f6.AbstractC1848h.a
    /* renamed from: a */
    public final void mo7596a(Status status) {
        if (!status.m4991N()) {
            this.f9665b.setException(C2343b.m9513a(status));
        } else {
            this.f9665b.setResult(this.f9666c.mo300a(this.f9664a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
