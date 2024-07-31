package p337x7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p321w7.AbstractC5385l0;
import p321w7.C5349c0;

/* renamed from: x7.l */
/* loaded from: classes.dex */
public final class C5694l implements Continuation<C5349c0, Task<AbstractC5385l0>> {

    /* renamed from: a */
    public final /* synthetic */ C5697m f21208a;

    public C5694l(C5697m c5697m) {
        this.f21208a = c5697m;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<AbstractC5385l0> then(Task<C5349c0> task) {
        C5685i c5685i;
        if (!task.isSuccessful()) {
            return Tasks.forException(task.getException());
        }
        String m21451g = task.getResult().m21451g();
        c5685i = this.f21208a.f21215a;
        return Tasks.forResult(C5706p.m22793J(m21451g, c5685i));
    }
}
