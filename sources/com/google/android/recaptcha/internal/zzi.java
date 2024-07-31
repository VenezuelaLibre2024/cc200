package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import gd.C2245s;
import java.util.concurrent.CancellationException;
import p038ce.InterfaceC1117x0;
import sd.InterfaceC4580l;
import td.AbstractC4754n;

/* loaded from: classes.dex */
final class zzi extends AbstractC4754n implements InterfaceC4580l {
    public final /* synthetic */ TaskCompletionSource zza;
    public final /* synthetic */ InterfaceC1117x0 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(TaskCompletionSource taskCompletionSource, InterfaceC1117x0 interfaceC1117x0) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = interfaceC1117x0;
    }

    @Override // sd.InterfaceC4580l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable m4599x = this.zzb.m4599x();
            if (m4599x == null) {
                this.zza.setResult(this.zzb.mo4598j());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception exc = m4599x instanceof Exception ? (Exception) m4599x : null;
                if (exc == null) {
                    exc = new RuntimeExecutionException(m4599x);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return C2245s.f8873a;
    }
}
