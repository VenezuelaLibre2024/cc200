package p337x7;

import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzach;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import p108h6.C2394s;

/* renamed from: x7.s0 */
/* loaded from: classes.dex */
public abstract class AbstractC5716s0<T> {
    /* renamed from: a */
    public static /* synthetic */ Task m22817a(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) C2394s.m9619l(task.getException());
        if (zzach.zzc(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + String.valueOf(recaptchaAction));
            }
            if (firebaseAuth.m5250p0() == null) {
                firebaseAuth.m5241k0(new C5659b1(firebaseAuth.m5236i(), firebaseAuth));
            }
            return m22818d(firebaseAuth.m5250p0(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static <T> Task<T> m22818d(C5659b1 c5659b1, RecaptchaAction recaptchaAction, String str, Continuation<String, Task<T>> continuation) {
        Task<String> m22728b = c5659b1.m22728b(str, Boolean.FALSE, recaptchaAction);
        return m22728b.continueWithTask(continuation).continueWithTask(new C5731x0(str, c5659b1, recaptchaAction, continuation));
    }

    /* renamed from: b */
    public final Task<T> m22819b(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: x7.u0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                String str3;
                AbstractC5716s0 abstractC5716s0 = AbstractC5716s0.this;
                if (task.isSuccessful()) {
                    str3 = (String) task.getResult();
                } else {
                    Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) C2394s.m9619l(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
                    str3 = "NO_RECAPTCHA";
                }
                return abstractC5716s0.mo5294c(str3);
            }
        };
        C5659b1 m5250p0 = firebaseAuth.m5250p0();
        return (m5250p0 == null || !m5250p0.m22729d(str2)) ? (Task<T>) mo5294c(null).continueWithTask(new Continuation() { // from class: x7.v0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return AbstractC5716s0.m22817a(RecaptchaAction.this, firebaseAuth, str, continuation, task);
            }
        }) : m22818d(m5250p0, recaptchaAction, str, continuation);
    }

    /* renamed from: c */
    public abstract Task<T> mo5294c(String str);
}
