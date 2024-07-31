package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
final class zzaju extends zzajt {
    /* JADX INFO: Access modifiers changed from: private */
    public zzaju() {
        super();
    }

    public /* synthetic */ zzaju(zzajx zzajxVar) {
        this();
    }

    private static <E> zzajg<E> zzc(Object obj, long j10) {
        return (zzajg) zzamh.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzajt
    public final <L> List<L> zza(Object obj, long j10) {
        zzajg zzc = zzc(obj, j10);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzajg zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzamh.zza(obj, j10, zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzajt
    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzajg zzc = zzc(obj, j10);
        zzajg zzc2 = zzc(obj2, j10);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzc()) {
                zzc = zzc.zza(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzamh.zza(obj, j10, zzc2);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzajt
    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).mo5024b_();
    }
}
