package com.google.android.gms.internal.fido;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaw extends zzat {
    public static final zzat zza = new zzaw(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzaw(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzam.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzat, com.google.android.gms.internal.fido.zzaq
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final Object[] zze() {
        return this.zzb;
    }
}
