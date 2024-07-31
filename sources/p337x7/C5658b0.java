package p337x7;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: x7.b0 */
/* loaded from: classes.dex */
public final class C5658b0 implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f21108a;

    /* renamed from: b */
    public final /* synthetic */ Context f21109b;

    public C5658b0(C5654a0 c5654a0, TaskCompletionSource taskCompletionSource, Context context) {
        this.f21108a = taskCompletionSource;
        this.f21109b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f21108a.setException(exc);
        C5654a0.m22716d(this.f21109b);
    }
}
