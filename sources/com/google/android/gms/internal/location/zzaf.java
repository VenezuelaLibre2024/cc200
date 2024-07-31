package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.C1842b;
import p096g6.C2074w;
import p096g6.InterfaceC2010d;
import p108h6.C2394s;

/* loaded from: classes.dex */
final class zzaf implements InterfaceC2010d {
    private final TaskCompletionSource zza;

    public zzaf(TaskCompletionSource taskCompletionSource) {
        C2394s.m9619l(taskCompletionSource);
        this.zza = taskCompletionSource;
    }

    @Override // p096g6.InterfaceC2010d
    public final void setFailedResult(Status status) {
        if (status == null) {
            return;
        }
        this.zza.setException(new C1842b(status));
    }

    @Override // p096g6.InterfaceC2010d
    public final /* synthetic */ void setResult(Object obj) {
        C2074w.m8279b((Status) obj, null, this.zza);
    }
}
