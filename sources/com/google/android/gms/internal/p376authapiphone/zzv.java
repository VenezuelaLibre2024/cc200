package com.google.android.gms.internal.p376authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.AbstractC1845e;
import p079f6.C1841a;
import p096g6.AbstractC2071v;
import p096g6.InterfaceC2056q;

/* loaded from: classes.dex */
public final class zzv extends AbstractC1845e {
    private static final C1841a.g zza;
    private static final C1841a.a zzb;
    private static final C1841a zzc;

    static {
        C1841a.g gVar = new C1841a.g();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new C1841a("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, (C1841a<C1841a.d.c>) zzc, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    public zzv(Context context) {
        super(context, (C1841a<C1841a.d.c>) zzc, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(AbstractC2071v.m8266a().m8274d(zzac.zzb).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(zzv.this, (TaskCompletionSource) obj2));
            }
        }).m8275e(1566).m8271a());
    }
}
