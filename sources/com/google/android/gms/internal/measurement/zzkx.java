package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzkx<T> implements zzlj<T> {
    private final zzkr zza;
    private final zzmi<?, ?> zzb;
    private final boolean zzc;
    private final zziu<?> zzd;

    private zzkx(zzmi<?, ?> zzmiVar, zziu<?> zziuVar, zzkr zzkrVar) {
        this.zzb = zzmiVar;
        this.zzc = zziuVar.zza(zzkrVar);
        this.zzd = zziuVar;
        this.zza = zzkrVar;
    }

    public static <T> zzkx<T> zza(zzmi<?, ?> zzmiVar, zziu<?> zziuVar, zzkr zzkrVar) {
        return new zzkx<>(zzmiVar, zziuVar, zzkrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final int zza(T t10) {
        zzmi<?, ?> zzmiVar = this.zzb;
        int zzb = zzmiVar.zzb(zzmiVar.zzd(t10)) + 0;
        return this.zzc ? zzb + this.zzd.zza(t10).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final T zza() {
        zzkr zzkrVar = this.zza;
        return zzkrVar instanceof zzjf ? (T) ((zzjf) zzkrVar).zzbz() : (T) zzkrVar.zzcd().zzai();
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final void zza(T t10, zzlk zzlkVar, zzis zzisVar) {
        boolean z10;
        zzmi<?, ?> zzmiVar = this.zzb;
        zziu<?> zziuVar = this.zzd;
        Object zzc = zzmiVar.zzc(t10);
        zziy<?> zzb = zziuVar.zzb(t10);
        do {
            try {
                if (zzlkVar.zzc() == Integer.MAX_VALUE) {
                    return;
                }
                int zzd = zzlkVar.zzd();
                if (zzd == 11) {
                    int i10 = 0;
                    Object obj = null;
                    zzhu zzhuVar = null;
                    while (zzlkVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzlkVar.zzd();
                        if (zzd2 == 16) {
                            i10 = zzlkVar.zzj();
                            obj = zziuVar.zza(zzisVar, this.zza, i10);
                        } else if (zzd2 == 26) {
                            if (obj != null) {
                                zziuVar.zza(zzlkVar, obj, zzisVar, zzb);
                            } else {
                                zzhuVar = zzlkVar.zzp();
                            }
                        } else if (!zzlkVar.zzt()) {
                            break;
                        }
                    }
                    if (zzlkVar.zzd() != 12) {
                        throw zzjq.zzb();
                    }
                    if (zzhuVar != null) {
                        if (obj != null) {
                            zziuVar.zza(zzhuVar, obj, zzisVar, zzb);
                        } else {
                            zzmiVar.zza((zzmi<?, ?>) zzc, i10, zzhuVar);
                        }
                    }
                } else if ((zzd & 7) == 2) {
                    Object zza = zziuVar.zza(zzisVar, this.zza, zzd >>> 3);
                    if (zza != null) {
                        zziuVar.zza(zzlkVar, zza, zzisVar, zzb);
                    } else {
                        z10 = zzmiVar.zza((zzmi<?, ?>) zzc, zzlkVar);
                    }
                } else {
                    z10 = zzlkVar.zzt();
                }
                z10 = true;
            } finally {
                zzmiVar.zzb((Object) t10, (T) zzc);
            }
        } while (z10);
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final void zza(T t10, zzne zzneVar) {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t10).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzja zzjaVar = (zzja) next.getKey();
            if (zzjaVar.zzc() != zznf.MESSAGE || zzjaVar.zze() || zzjaVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzneVar.zza(zzjaVar.zza(), next instanceof zzju ? ((zzju) next).zza().zzc() : next.getValue());
        }
        zzmi<?, ?> zzmiVar = this.zzb;
        zzmiVar.zza((zzmi<?, ?>) zzmiVar.zzd(t10), zzneVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final void zza(T t10, T t11) {
        zzll.zza(this.zzb, t10, t11);
        if (this.zzc) {
            zzll.zza(this.zzd, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EDGE_INSN: B:24:0x0099->B:25:0x0099 BREAK  A[LOOP:1: B:10:0x0053->B:18:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.zzht r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzjf r0 = (com.google.android.gms.internal.measurement.zzjf) r0
            com.google.android.gms.internal.measurement.zzmh r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzmh r2 = com.google.android.gms.internal.measurement.zzmh.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.zzmh r1 = com.google.android.gms.internal.measurement.zzmh.zzd()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.measurement.zzjf$zzd r10 = (com.google.android.gms.internal.measurement.zzjf.zzd) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.zzhq.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.zziu<?> r12 = r9.zzd
            com.google.android.gms.internal.measurement.zzis r0 = r14.zzd
            com.google.android.gms.internal.measurement.zzkr r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzjf$zzf r0 = (com.google.android.gms.internal.measurement.zzjf.zzf) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.zzhq.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.zzlf.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.zzhq.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzhq.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzhq.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.measurement.zzhu r2 = (com.google.android.gms.internal.measurement.zzhu) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.zzlf.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzhq.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.measurement.zziu<?> r0 = r9.zzd
            com.google.android.gms.internal.measurement.zzis r5 = r14.zzd
            com.google.android.gms.internal.measurement.zzkr r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzjf$zzf r0 = (com.google.android.gms.internal.measurement.zzjf.zzf) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzhq.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.zzjq r10 = com.google.android.gms.internal.measurement.zzjq.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzht):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final int zzb(T t10) {
        int hashCode = this.zzb.zzd(t10).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t10).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final boolean zzb(T t10, T t11) {
        if (!this.zzb.zzd(t10).equals(this.zzb.zzd(t11))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t10).equals(this.zzd.zza(t11));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final void zzc(T t10) {
        this.zzb.zzf(t10);
        this.zzd.zzc(t10);
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final boolean zzd(T t10) {
        return this.zzd.zza(t10).zzg();
    }
}
