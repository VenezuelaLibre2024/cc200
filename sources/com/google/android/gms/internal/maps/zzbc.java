package com.google.android.gms.internal.maps;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbc extends zzaz {
    public static final zzaz zza = new zzbc(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzbc(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzas.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzaz, com.google.android.gms.internal.maps.zzaw
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final Object[] zze() {
        return this.zzb;
    }
}
