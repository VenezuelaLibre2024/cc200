package p321w7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p108h6.C2394s;

/* renamed from: w7.j1 */
/* loaded from: classes.dex */
public final class C5378j1 implements Continuation<C5349c0, Task<Void>> {

    /* renamed from: a */
    public final /* synthetic */ String f20213a;

    /* renamed from: b */
    public final /* synthetic */ C5356e f20214b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC5341a0 f20215c;

    public C5378j1(AbstractC5341a0 abstractC5341a0, String str, C5356e c5356e) {
        this.f20213a = str;
        this.f20214b = c5356e;
        this.f20215c = abstractC5341a0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<C5349c0> task) {
        return FirebaseAuth.getInstance(this.f20215c.mo21430d0()).m5212M((String) C2394s.m9619l(task.getResult().m21451g()), this.f20213a, this.f20214b);
    }
}
