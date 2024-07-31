package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import p109h7.InterfaceC2424g;

/* loaded from: classes.dex */
public final class zzhd {
    public final String zza;
    public final Uri zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final InterfaceC2424g<Context, Boolean> zzh;
    private final boolean zzi;

    public zzhd(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzhd(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC2424g<Context, Boolean> interfaceC2424g) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = z11;
        this.zzi = z12;
        this.zzg = z13;
        this.zzh = interfaceC2424g;
    }

    public final zzgv<Double> zza(String str, double d10) {
        return zzgv.zza(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzgv<Long> zza(String str, long j10) {
        return zzgv.zza(this, str, Long.valueOf(j10), true);
    }

    public final zzgv<String> zza(String str, String str2) {
        return zzgv.zza(this, str, str2, true);
    }

    public final zzgv<Boolean> zza(String str, boolean z10) {
        return zzgv.zza(this, str, Boolean.valueOf(z10), true);
    }

    public final zzhd zza() {
        return new zzhd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzhd zzb() {
        if (!this.zzc.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        InterfaceC2424g<Context, Boolean> interfaceC2424g = this.zzh;
        if (interfaceC2424g == null) {
            return new zzhd(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, interfaceC2424g);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }
}
