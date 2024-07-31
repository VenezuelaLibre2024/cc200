package p321w7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p108h6.C2394s;

/* renamed from: w7.i1 */
/* loaded from: classes.dex */
public final class C5374i1 implements Continuation<C5349c0, Task<Void>> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC5341a0 f20205a;

    public C5374i1(AbstractC5341a0 abstractC5341a0) {
        this.f20205a = abstractC5341a0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<C5349c0> task) {
        return FirebaseAuth.getInstance(this.f20205a.mo21430d0()).m5213N(null, (String) C2394s.m9619l(task.getResult().m21451g()));
    }
}
