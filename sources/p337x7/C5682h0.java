package p337x7;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import p321w7.InterfaceC5372i;

/* renamed from: x7.h0 */
/* loaded from: classes.dex */
public final class C5682h0 implements OnSuccessListener<InterfaceC5372i> {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f21171a;

    /* renamed from: b */
    public final /* synthetic */ Context f21172b;

    public C5682h0(C5654a0 c5654a0, TaskCompletionSource taskCompletionSource, Context context) {
        this.f21171a = taskCompletionSource;
        this.f21172b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(InterfaceC5372i interfaceC5372i) {
        this.f21171a.setResult(interfaceC5372i);
        C5654a0.m22716d(this.f21172b);
    }
}
