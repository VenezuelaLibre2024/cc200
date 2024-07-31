package p337x7;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: x7.n1 */
/* loaded from: classes.dex */
public final class C5702n1 implements OnSuccessListener<String> {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f21223a;

    public C5702n1(C5666d0 c5666d0, TaskCompletionSource taskCompletionSource) {
        this.f21223a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(String str) {
        this.f21223a.setResult(new C5723u1().mo22810c(str).mo22809b());
    }
}
