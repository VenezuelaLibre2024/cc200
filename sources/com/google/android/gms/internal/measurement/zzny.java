package com.google.android.gms.internal.measurement;

import p109h7.C2439v;
import p109h7.InterfaceC2438u;

/* loaded from: classes.dex */
public final class zzny implements InterfaceC2438u<zzob> {
    private static zzny zza = new zzny();
    private final InterfaceC2438u<zzob> zzb = C2439v.m9733b(new zzoa());

    public static boolean zza() {
        return ((zzob) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzob) zza.get()).zzb();
    }

    @Override // p109h7.InterfaceC2438u
    public final /* synthetic */ zzob get() {
        return this.zzb.get();
    }
}
