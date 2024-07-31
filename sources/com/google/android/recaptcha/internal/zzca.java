package com.google.android.recaptcha.internal;

import gd.C2245s;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p038ce.C1063k;
import p038ce.C1089q0;
import p038ce.InterfaceC1085p0;
import p115hd.C2510v;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;

/* loaded from: classes.dex */
public final class zzca implements zzbu {
    public static final zzbv zza = new zzbv(null);
    private final InterfaceC1085p0 zzb;
    private final zzcl zzc;
    private final zzee zzd;
    private final Map zze;
    private final Map zzf;

    public zzca(InterfaceC1085p0 interfaceC1085p0, zzcl zzclVar, zzee zzeeVar, Map map) {
        this.zzb = interfaceC1085p0;
        this.zzc = zzclVar;
        this.zzd = zzeeVar;
        this.zze = map;
        this.zzf = zzclVar.zzb().zzc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzcj zzcjVar, InterfaceC3281d interfaceC3281d) {
        Object m4559c = C1089q0.m4559c(new zzbx(zzcjVar, list, this, null), interfaceC3281d);
        return m4559c == C3385c.m12581c() ? m4559c : C2245s.f8873a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzcj zzcjVar, InterfaceC3281d interfaceC3281d) {
        Object m4559c = C1089q0.m4559c(new zzby(exc, zzcjVar, this, null), interfaceC3281d);
        return m4559c == C3385c.m12581c() ? m4559c : C2245s.f8873a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(zzpr zzprVar, zzcj zzcjVar) {
        zzfh zzb = zzfh.zzb();
        int zza2 = zzcjVar.zza();
        zzdd zzddVar = (zzdd) this.zze.get(Integer.valueOf(zzprVar.zzf()));
        if (zzddVar == null) {
            throw new zzae(5, 2, null);
        }
        int zzg = zzprVar.zzg();
        zzpq[] zzpqVarArr = (zzpq[]) zzprVar.zzj().toArray(new zzpq[0]);
        zzddVar.zza(zzg, zzcjVar, (zzpq[]) Arrays.copyOf(zzpqVarArr, zzpqVarArr.length));
        if (zza2 == zzcjVar.zza()) {
            zzcjVar.zzg(zzcjVar.zza() + 1);
        }
        zzb.zzf();
        long zza3 = zzb.zza(TimeUnit.MICROSECONDS);
        zzv zzvVar = zzv.zza;
        int zzk = zzprVar.zzk();
        if (zzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzv.zza(zzk - 2, zza3);
        zzprVar.zzk();
        zzprVar.zzg();
        C2510v.m10025x(zzprVar.zzj(), null, null, null, 0, null, new zzbw(this), 31, null);
    }

    @Override // com.google.android.recaptcha.internal.zzbu
    public final void zza(String str) {
        C1063k.m4457d(this.zzb, null, null, new zzbz(new zzcj(this.zzc), this, str, null), 3, null);
    }
}
