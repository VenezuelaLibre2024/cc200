package p337x7;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: x7.e1 */
/* loaded from: classes.dex */
public final class C5671e1 implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f21151a;

    public C5671e1(C5666d0 c5666d0, TaskCompletionSource taskCompletionSource) {
        this.f21151a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String str;
        str = C5666d0.f21135b;
        Log.e(str, "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Failing open with a fake token.");
        this.f21151a.setResult(new C5723u1().mo22810c("NO_RECAPTCHA").mo22809b());
    }
}
