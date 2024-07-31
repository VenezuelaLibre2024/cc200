package p337x7;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: x7.o1 */
/* loaded from: classes.dex */
public final class C5705o1 implements OnSuccessListener<String> {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f21230a;

    public C5705o1(C5666d0 c5666d0, TaskCompletionSource taskCompletionSource) {
        this.f21230a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(String str) {
        this.f21230a.setResult(new C5723u1().mo22811d(str).mo22809b());
    }
}
