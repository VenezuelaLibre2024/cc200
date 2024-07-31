package p321w7;

import com.google.android.gms.internal.p377firebaseauthapi.zzah;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: w7.k2 */
/* loaded from: classes.dex */
public final class C5383k2 implements Continuation<RecaptchaTasksClient, Task<Void>> {
    public C5383k2(FirebaseAuth firebaseAuth) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<RecaptchaTasksClient> task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new C5399q("INTERNAL_ERROR", zzah.zzb(exception != null ? exception.getMessage() : "")));
    }
}
