package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzir implements zzne {
    private final zzio zza;

    private zzir(zzio zzioVar) {
        zzio zzioVar2 = (zzio) zzjh.zza(zzioVar, "output");
        this.zza = zzioVar2;
        zzioVar2.zza = this;
    }

    public static zzir zza(zzio zzioVar) {
        zzir zzirVar = zzioVar.zza;
        return zzirVar != null ? zzirVar : new zzir(zzioVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final int zza() {
        return zznh.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    @Deprecated
    public final void zza(int i10) {
        this.zza.zzc(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i10, double d10) {
        this.zza.zzb(i10, d10);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i10, float f10) {
        this.zza.zzb(i10, f10);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i10, int i11) {
        this.zza.zzb(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i10, long j10) {
        this.zza.zza(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i10, zzhu zzhuVar) {
        this.zza.zza(i10, zzhuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final <K, V> void zza(int i10, zzkm<K, V> zzkmVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzc(i10, 2);
            this.zza.zzc(zzkj.zza(zzkmVar, entry.getKey(), entry.getValue()));
            zzkj.zza(this.zza, zzkmVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i10, Object obj) {
        if (obj instanceof zzhu) {
            this.zza.zzb(i10, (zzhu) obj);
        } else {
            this.zza.zza(i10, (zzkr) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i10, Object obj, zzlj zzljVar) {
        zzio zzioVar = this.zza;
        zzioVar.zzc(i10, 3);
        zzljVar.zza((zzlj) obj, (zzne) zzioVar.zza);
        zzioVar.zzc(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i10, String str) {
        this.zza.zza(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i10, List<zzhu> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zza(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i10, List<?> list, zzlj zzljVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, list.get(i11), zzljVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zza(list.get(i13).booleanValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zza(int i10, boolean z10) {
        this.zza.zza(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    @Deprecated
    public final void zzb(int i10) {
        this.zza.zzc(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzb(int i10, int i11) {
        this.zza.zza(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzb(int i10, long j10) {
        this.zza.zzb(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzb(int i10, Object obj, zzlj zzljVar) {
        this.zza.zza(i10, (zzkr) obj, zzljVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzb(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof zzjx)) {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11));
                i11++;
            }
            return;
        }
        zzjx zzjxVar = (zzjx) list;
        while (i11 < list.size()) {
            Object zzb = zzjxVar.zzb(i11);
            if (zzb instanceof String) {
                this.zza.zza(i10, (String) zzb);
            } else {
                this.zza.zza(i10, (zzhu) zzb);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzb(int i10, List<?> list, zzlj zzljVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, list.get(i11), zzljVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzb(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zza(list.get(i13).doubleValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzc(int i10, int i11) {
        this.zza.zzb(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzc(int i10, long j10) {
        this.zza.zza(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzc(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zzd(list.get(i13).intValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzd(int i10, int i11) {
        this.zza.zza(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzd(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzd(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zze(list.get(i13).intValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zza(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zze(int i10, int i11) {
        this.zza.zzk(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zze(int i10, long j10) {
        this.zza.zzb(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zze(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zzc(list.get(i13).longValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zza(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzf(int i10, int i11) {
        this.zza.zzd(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzf(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zza(list.get(i13).floatValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzg(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zzf(list.get(i13).intValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzh(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zzd(list.get(i13).longValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzi(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zzg(list.get(i13).intValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zza(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzj(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zze(list.get(i13).longValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zza(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzk(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zzh(list.get(i13).intValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzk(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzl(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zzf(list.get(i13).longValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzh(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzd(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zzj(list.get(i13).intValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzc(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final void zzn(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzio.zzg(list.get(i13).longValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).longValue());
            i11++;
        }
    }
}
