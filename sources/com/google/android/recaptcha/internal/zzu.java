package com.google.android.recaptcha.internal;

import ae.C0109o;
import id.C2704a;

/* loaded from: classes.dex */
public final class zzu implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return "avgExecutionTime: " + C0109o.m449P(String.valueOf(this.zzb / this.zza), 10, (char) 0, 2, null) + " us| maxExecutionTime: " + C0109o.m449P(String.valueOf(this.zzc), 10, (char) 0, 2, null) + " us| totalTime: " + C0109o.m449P(String.valueOf(this.zzb), 10, (char) 0, 2, null) + " us| #Usages: " + C0109o.m449P(String.valueOf(this.zza), 5, (char) 0, 2, null);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzu zzuVar) {
        return C2704a.m11031a(Long.valueOf(this.zzb), Long.valueOf(zzuVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
