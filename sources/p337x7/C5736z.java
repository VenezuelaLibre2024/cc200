package p337x7;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: x7.z */
/* loaded from: classes.dex */
public final class C5736z implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f21277a;

    /* renamed from: b */
    public final /* synthetic */ Context f21278b;

    public C5736z(C5654a0 c5654a0, TaskCompletionSource taskCompletionSource, Context context) {
        this.f21277a = taskCompletionSource;
        this.f21278b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f21277a.setException(exc);
        C5654a0.m22716d(this.f21278b);
    }
}
