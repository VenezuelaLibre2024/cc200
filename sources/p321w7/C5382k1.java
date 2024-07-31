package p321w7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p108h6.C2394s;

/* renamed from: w7.k1 */
/* loaded from: classes.dex */
public final class C5382k1 implements Continuation<C5349c0, Task<Void>> {

    /* renamed from: a */
    public final /* synthetic */ C5356e f20217a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC5341a0 f20218b;

    public C5382k1(AbstractC5341a0 abstractC5341a0, C5356e c5356e) {
        this.f20217a = c5356e;
        this.f20218b = abstractC5341a0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<C5349c0> task) {
        return FirebaseAuth.getInstance(this.f20218b.mo21430d0()).m5213N(this.f20217a, (String) C2394s.m9619l(task.getResult().m21451g()));
    }
}
