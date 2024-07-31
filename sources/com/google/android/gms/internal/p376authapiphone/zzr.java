package com.google.android.gms.internal.p376authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.AbstractC1845e;
import p079f6.C1841a;
import p096g6.AbstractC2071v;
import p096g6.InterfaceC2056q;
import p108h6.C2394s;

/* loaded from: classes.dex */
public final class zzr extends AbstractC1845e {
    private static final C1841a.g zza;
    private static final C1841a.a zzb;
    private static final C1841a zzc;

    static {
        C1841a.g gVar = new C1841a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new C1841a("SmsCodeAutofill.API", zznVar, gVar);
    }

    public zzr(Activity activity) {
        super(activity, (C1841a<C1841a.d.c>) zzc, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    public zzr(Context context) {
        super(context, (C1841a<C1841a.d.c>) zzc, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    public final Task<Integer> checkPermissionState() {
        return doRead(AbstractC2071v.m8266a().m8274d(zzac.zza).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(zzr.this, (TaskCompletionSource) obj2));
            }
        }).m8275e(1564).m8271a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        C2394s.m9619l(str);
        C2394s.m9609b(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(AbstractC2071v.m8266a().m8274d(zzac.zza).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzr.this, (TaskCompletionSource) obj2));
            }
        }).m8275e(1565).m8271a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(AbstractC2071v.m8266a().m8274d(zzac.zza).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(zzr.this, (TaskCompletionSource) obj2));
            }
        }).m8275e(1563).m8271a());
    }
}
