package p337x7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p321w7.C5420x;
import p321w7.C5428z1;
import p321w7.InterfaceC5372i;

/* renamed from: x7.n */
/* loaded from: classes.dex */
public final class C5700n implements Continuation<InterfaceC5372i, Task<InterfaceC5372i>> {

    /* renamed from: a */
    public final /* synthetic */ C5703o f21220a;

    public C5700n(C5703o c5703o) {
        this.f21220a = c5703o;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<InterfaceC5372i> then(Task<InterfaceC5372i> task) {
        C5428z1 c5428z1;
        C5428z1 c5428z12;
        C5428z1 c5428z13;
        c5428z1 = this.f21220a.f21227k;
        if (c5428z1 == null) {
            return task;
        }
        if (task.isSuccessful()) {
            InterfaceC5372i result = task.getResult();
            C5685i c5685i = (C5685i) result.mo21505B();
            C5676f2 c5676f2 = (C5676f2) result.mo21506v();
            c5428z13 = this.f21220a.f21227k;
            return Tasks.forResult(new C5684h2(c5685i, c5676f2, c5428z13));
        }
        Exception exception = task.getException();
        if (exception instanceof C5420x) {
            c5428z12 = this.f21220a.f21227k;
            ((C5420x) exception).m21568e(c5428z12);
        }
        return Tasks.forException(exception);
    }
}
