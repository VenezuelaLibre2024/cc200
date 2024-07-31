package p097g7;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g7.g0 */
/* loaded from: classes.dex */
public final class C2099g0 extends AbstractRunnableC2093d0 {

    /* renamed from: h */
    public final /* synthetic */ TaskCompletionSource f8209h;

    /* renamed from: i */
    public final /* synthetic */ AbstractRunnableC2093d0 f8210i;

    /* renamed from: j */
    public final /* synthetic */ C2092d f8211j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2099g0(C2092d c2092d, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, AbstractRunnableC2093d0 abstractRunnableC2093d0) {
        super(taskCompletionSource);
        this.f8211j = c2092d;
        this.f8209h = taskCompletionSource2;
        this.f8210i = abstractRunnableC2093d0;
    }

    @Override // p097g7.AbstractRunnableC2093d0
    /* renamed from: b */
    public final void mo5116b() {
        Object obj;
        AtomicInteger atomicInteger;
        C2091c0 c2091c0;
        obj = this.f8211j.f8196f;
        synchronized (obj) {
            C2092d.m8307o(this.f8211j, this.f8209h);
            atomicInteger = this.f8211j.f8202l;
            if (atomicInteger.getAndIncrement() > 0) {
                c2091c0 = this.f8211j.f8192b;
                c2091c0.m8293c("Already connected to the service.", new Object[0]);
            }
            C2092d.m8309q(this.f8211j, this.f8210i);
        }
    }
}
