package com.google.android.gms.internal.fido;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzas extends zzat {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzat zzc;

    public zzas(zzat zzatVar, int i10, int i11) {
        this.zzc = zzatVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzam.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzat, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzat
    /* renamed from: zzf */
    public final zzat subList(int i10, int i11) {
        zzam.zze(i10, i11, this.zzb);
        zzat zzatVar = this.zzc;
        int i12 = this.zza;
        return zzatVar.subList(i10 + i12, i11 + i12);
    }
}
