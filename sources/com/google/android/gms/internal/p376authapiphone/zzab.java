package com.google.android.gms.internal.p376authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.AbstractC2071v;
import p096g6.InterfaceC2056q;
import p351y5.AbstractC5816b;

/* loaded from: classes.dex */
public final class zzab extends AbstractC5816b {
    public zzab(Activity activity) {
        super(activity);
    }

    public zzab(Context context) {
        super(context);
    }

    @Override // p351y5.AbstractC5816b
    public final Task<Void> startSmsRetriever() {
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(zzab.this, (TaskCompletionSource) obj2));
            }
        }).m8274d(zzac.zzc).m8275e(1567).m8271a());
    }

    @Override // p351y5.AbstractC5816b
    public final Task<Void> startSmsUserConsent(final String str) {
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzab.this, (TaskCompletionSource) obj2));
            }
        }).m8274d(zzac.zzd).m8275e(1568).m8271a());
    }
}
