package p337x7;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: x7.e0 */
/* loaded from: classes.dex */
public final class C5670e0 implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f21149a;

    /* renamed from: b */
    public final /* synthetic */ Context f21150b;

    public C5670e0(C5654a0 c5654a0, TaskCompletionSource taskCompletionSource, Context context) {
        this.f21149a = taskCompletionSource;
        this.f21150b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f21149a.setException(exc);
        C5654a0.m22716d(this.f21150b);
    }
}
