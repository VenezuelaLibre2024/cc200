package p337x7;

import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzach;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import p108h6.C2394s;

/* renamed from: x7.x0 */
/* loaded from: classes.dex */
public final class C5731x0 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ String f21270a;

    /* renamed from: b */
    public final /* synthetic */ C5659b1 f21271b;

    /* renamed from: c */
    public final /* synthetic */ RecaptchaAction f21272c;

    /* renamed from: d */
    public final /* synthetic */ Continuation f21273d;

    public C5731x0(String str, C5659b1 c5659b1, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f21270a = str;
        this.f21271b = c5659b1;
        this.f21272c = recaptchaAction;
        this.f21273d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful() || !zzach.zzb((Exception) C2394s.m9619l(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.f21270a);
        }
        return this.f21271b.m22728b(this.f21270a, Boolean.TRUE, this.f21272c).continueWithTask(this.f21273d);
    }
}
