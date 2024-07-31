package p321w7;

import com.google.android.gms.internal.p377firebaseauthapi.zzagi;
import com.google.android.gms.internal.p377firebaseauthapi.zzago;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import p108h6.C2394s;
import p337x7.C5687i1;

/* renamed from: w7.j2 */
/* loaded from: classes.dex */
public final class C5379j2 implements Continuation<zzagi, Task<InterfaceC5424y0>> {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f20216a;

    public C5379j2(FirebaseAuth firebaseAuth) {
        this.f20216a = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<InterfaceC5424y0> then(Task<zzagi> task) {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) C2394s.m9619l(task.getException()));
        }
        zzagi result = task.getResult();
        if (result instanceof zzago) {
            zzago zzagoVar = (zzago) result;
            return Tasks.forResult(new C5687i1(C2394s.m9613f(zzagoVar.zzf()), C2394s.m9613f(zzagoVar.zze()), zzagoVar.zzc(), zzagoVar.zzb(), zzagoVar.zzd(), C2394s.m9613f(zzagoVar.zza()), this.f20216a));
        }
        throw new IllegalArgumentException("Response should be an instance of StartTotpMfaEnrollmentResponse but was " + result.getClass().getName() + ".");
    }
}
