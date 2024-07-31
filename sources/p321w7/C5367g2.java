package p321w7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: w7.g2 */
/* loaded from: classes.dex */
public final class C5367g2 implements Continuation<Void, Task<Void>> {
    public C5367g2(FirebaseAuth firebaseAuth) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<Void> task) {
        return (!task.isSuccessful() && (task.getException() instanceof C5399q) && ((C5399q) task.getException()).m21548a().equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? Tasks.forResult(null) : task;
    }
}
