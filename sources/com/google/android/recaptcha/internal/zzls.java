package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzls extends zzlu {
    public zzls(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzlv.zzb) {
            zzlv.zzD(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzlv.zzE(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzlv.zzb) {
            zzlv.zzD(obj, j10, b10);
        } else {
            zzlv.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final void zze(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final void zzf(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final boolean zzg(Object obj, long j10) {
        return zzlv.zzb ? zzlv.zzt(obj, j10) : zzlv.zzu(obj, j10);
    }
}
