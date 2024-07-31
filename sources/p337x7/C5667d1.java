package p337x7;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import p108h6.C2394s;

/* renamed from: x7.d1 */
/* loaded from: classes.dex */
public final class C5667d1 implements Continuation<RecaptchaTasksClient, Task<String>> {

    /* renamed from: a */
    public final /* synthetic */ RecaptchaAction f21138a;

    public C5667d1(C5659b1 c5659b1, RecaptchaAction recaptchaAction) {
        this.f21138a = recaptchaAction;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<String> then(Task<RecaptchaTasksClient> task) {
        if (task.isSuccessful()) {
            return task.getResult().executeTask(this.f21138a);
        }
        Exception exc = (Exception) C2394s.m9619l(task.getException());
        if (!(exc instanceof C5734y0)) {
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exc.getMessage());
        }
        return Tasks.forResult("");
    }
}
