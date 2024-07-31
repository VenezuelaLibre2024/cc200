package com.google.android.gms.internal.measurement;

import p109h7.C2439v;
import p109h7.InterfaceC2438u;

/* loaded from: classes.dex */
public final class zzpb implements InterfaceC2438u<zzpa> {
    private static zzpb zza = new zzpb();
    private final InterfaceC2438u<zzpa> zzb = C2439v.m9733b(new zzpd());

    public static double zza() {
        return ((zzpa) zza.get()).zza();
    }

    public static long zzb() {
        return ((zzpa) zza.get()).zzb();
    }

    public static long zzc() {
        return ((zzpa) zza.get()).zzc();
    }

    public static String zzd() {
        return ((zzpa) zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzpa) zza.get()).zze();
    }

    @Override // p109h7.InterfaceC2438u
    public final /* synthetic */ zzpa get() {
        return this.zzb.get();
    }
}
