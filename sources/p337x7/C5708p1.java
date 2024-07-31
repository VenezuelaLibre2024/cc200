package p337x7;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import p321w7.C5399q;

/* renamed from: x7.p1 */
/* loaded from: classes.dex */
public final class C5708p1 implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f21242a;

    public C5708p1(C5666d0 c5666d0, TaskCompletionSource taskCompletionSource) {
        this.f21242a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String str;
        str = C5666d0.f21135b;
        Log.e(str, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        if ((exc instanceof C5399q) && ((C5399q) exc).m21548a().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.f21242a.setException(exc);
        } else {
            this.f21242a.setResult(new C5723u1().mo22809b());
        }
    }
}
