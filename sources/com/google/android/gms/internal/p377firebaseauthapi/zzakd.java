package com.google.android.gms.internal.p377firebaseauthapi;

/* loaded from: classes.dex */
final class zzakd implements zzakl {
    private zzakl[] zza;

    public zzakd(zzakl... zzaklVarArr) {
        this.zza = zzaklVarArr;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakl
    public final zzaki zza(Class<?> cls) {
        for (zzakl zzaklVar : this.zza) {
            if (zzaklVar.zzb(cls)) {
                return zzaklVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakl
    public final boolean zzb(Class<?> cls) {
        for (zzakl zzaklVar : this.zza) {
            if (zzaklVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
