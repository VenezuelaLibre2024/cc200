package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.AbstractC1845e;
import p079f6.C1841a;
import p096g6.AbstractC2071v;
import p096g6.C2074w;
import p096g6.InterfaceC2056q;
import p108h6.C2394s;
import p154k6.C3363a;
import p277t5.C4693b;
import p277t5.C4701j;
import p277t5.C4702k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzab extends AbstractC1845e implements zzg {
    private static final C1841a.g zza;
    private static final C1841a.a zzb;
    private static final C1841a zzc;
    private static final C3363a zzd;
    private final Context zze;

    static {
        C1841a.g gVar = new C1841a.g();
        zza = gVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new C1841a("GoogleAuthService.API", zzvVar, gVar);
        zzd = C4701j.m18504a("GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        super(context, (C1841a<C1841a.d.c>) zzc, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
        this.zze = context;
    }

    public static /* bridge */ /* synthetic */ void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (C2074w.m8280c(status, obj, taskCompletionSource)) {
            return;
        }
        zzd.m12513h("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        return doWrite(AbstractC2071v.m8266a().m8274d(C4702k.f17550l).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        }).m8275e(1513).m8271a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final C4693b c4693b) {
        C2394s.m9620m(c4693b, "request cannot be null.");
        return doWrite(AbstractC2071v.m8266a().m8274d(C4702k.f17549k).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth.zzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                C4693b c4693b2 = c4693b;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), c4693b2);
            }
        }).m8275e(1515).m8271a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        C2394s.m9620m(account, "Account name cannot be null!");
        C2394s.m9614g(str, "Scope cannot be null!");
        return doWrite(AbstractC2071v.m8266a().m8274d(C4702k.f17550l).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        }).m8275e(1512).m8271a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        C2394s.m9620m(account, "account cannot be null.");
        return doWrite(AbstractC2071v.m8266a().m8274d(C4702k.f17549k).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        }).m8275e(1517).m8271a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        C2394s.m9620m(str, "Client package name cannot be null!");
        return doWrite(AbstractC2071v.m8266a().m8274d(C4702k.f17549k).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        }).m8275e(1514).m8271a());
    }
}
