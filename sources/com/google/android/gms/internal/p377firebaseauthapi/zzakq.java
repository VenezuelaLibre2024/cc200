package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzakq<T> implements zzalc<T> {
    private final zzakk zza;
    private final zzamb<?, ?> zzb;
    private final boolean zzc;
    private final zzair<?> zzd;

    private zzakq(zzamb<?, ?> zzambVar, zzair<?> zzairVar, zzakk zzakkVar) {
        this.zzb = zzambVar;
        this.zzc = zzairVar.zza(zzakkVar);
        this.zzd = zzairVar;
        this.zza = zzakkVar;
    }

    public static <T> zzakq<T> zza(zzamb<?, ?> zzambVar, zzair<?> zzairVar, zzakk zzakkVar) {
        return new zzakq<>(zzambVar, zzairVar, zzakkVar);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final int zza(T t10) {
        zzamb<?, ?> zzambVar = this.zzb;
        int zzb = zzambVar.zzb(zzambVar.zzd(t10)) + 0;
        return this.zzc ? zzb + this.zzd.zza(t10).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final T zza() {
        zzakk zzakkVar = this.zza;
        return zzakkVar instanceof zzaja ? (T) ((zzaja) zzakkVar).zzn() : (T) zzakkVar.zzp().zzg();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final void zza(T t10, zzald zzaldVar, zzaip zzaipVar) {
        boolean z10;
        zzamb<?, ?> zzambVar = this.zzb;
        zzair<?> zzairVar = this.zzd;
        Object zzc = zzambVar.zzc(t10);
        zzais<?> zzb = zzairVar.zzb(t10);
        do {
            try {
                if (zzaldVar.zzc() == Integer.MAX_VALUE) {
                    return;
                }
                int zzd = zzaldVar.zzd();
                if (zzd == 11) {
                    int i10 = 0;
                    Object obj = null;
                    zzahm zzahmVar = null;
                    while (zzaldVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzaldVar.zzd();
                        if (zzd2 == 16) {
                            i10 = zzaldVar.zzj();
                            obj = zzairVar.zza(zzaipVar, this.zza, i10);
                        } else if (zzd2 == 26) {
                            if (obj != null) {
                                zzairVar.zza(zzaldVar, obj, zzaipVar, zzb);
                            } else {
                                zzahmVar = zzaldVar.zzp();
                            }
                        } else if (!zzaldVar.zzt()) {
                            break;
                        }
                    }
                    if (zzaldVar.zzd() != 12) {
                        throw zzajj.zzb();
                    }
                    if (zzahmVar != null) {
                        if (obj != null) {
                            zzairVar.zza(zzahmVar, obj, zzaipVar, zzb);
                        } else {
                            zzambVar.zza((zzamb<?, ?>) zzc, i10, zzahmVar);
                        }
                    }
                } else if ((zzd & 7) == 2) {
                    Object zza = zzairVar.zza(zzaipVar, this.zza, zzd >>> 3);
                    if (zza != null) {
                        zzairVar.zza(zzaldVar, zza, zzaipVar, zzb);
                    } else {
                        z10 = zzambVar.zza((zzamb<?, ?>) zzc, zzaldVar);
                    }
                } else {
                    z10 = zzaldVar.zzt();
                }
                z10 = true;
            } finally {
                zzambVar.zzb((Object) t10, (T) zzc);
            }
        } while (z10);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final void zza(T t10, zzanb zzanbVar) {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t10).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzaiu zzaiuVar = (zzaiu) next.getKey();
            if (zzaiuVar.zzc() != zzamy.MESSAGE || zzaiuVar.zze() || zzaiuVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzanbVar.zza(zzaiuVar.zza(), next instanceof zzajn ? ((zzajn) next).zza().zzc() : next.getValue());
        }
        zzamb<?, ?> zzambVar = this.zzb;
        zzambVar.zza((zzamb<?, ?>) zzambVar.zzd(t10), zzanbVar);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final void zza(T t10, T t11) {
        zzale.zza(this.zzb, t10, t11);
        if (this.zzc) {
            zzale.zza(this.zzd, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EDGE_INSN: B:24:0x0099->B:25:0x0099 BREAK  A[LOOP:1: B:10:0x0053->B:18:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.p377firebaseauthapi.zzahl r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase-auth-api.zzaja r0 = (com.google.android.gms.internal.p377firebaseauthapi.zzaja) r0
            com.google.android.gms.internal.firebase-auth-api.zzame r1 = r0.zzb
            com.google.android.gms.internal.firebase-auth-api.zzame r2 = com.google.android.gms.internal.p377firebaseauthapi.zzame.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.firebase-auth-api.zzame r1 = com.google.android.gms.internal.p377firebaseauthapi.zzame.zzd()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.firebase-auth-api.zzaja$zzd r10 = (com.google.android.gms.internal.firebase-auth-api.zzaja.zzd) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.p377firebaseauthapi.zzahi.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.firebase-auth-api.zzair<?> r12 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaip r0 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzakk r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.zzaja$zzf r0 = (com.google.android.gms.internal.firebase-auth-api.zzaja.zzf) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.p377firebaseauthapi.zzahi.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.p377firebaseauthapi.zzaky.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.p377firebaseauthapi.zzahi.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.p377firebaseauthapi.zzahi.zzc(r11, r4, r14)
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
            int r4 = com.google.android.gms.internal.p377firebaseauthapi.zzahi.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.firebase-auth-api.zzahm r2 = (com.google.android.gms.internal.p377firebaseauthapi.zzahm) r2
            goto L53
        L72:
            com.google.android.gms.internal.p377firebaseauthapi.zzaky.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.p377firebaseauthapi.zzahi.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.firebase-auth-api.zzair<?> r0 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaip r5 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzakk r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.firebase-auth-api.zzaja$zzf r0 = (com.google.android.gms.internal.firebase-auth-api.zzaja.zzf) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.p377firebaseauthapi.zzahi.zza(r5, r11, r4, r13, r14)
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
            com.google.android.gms.internal.firebase-auth-api.zzajj r10 = com.google.android.gms.internal.p377firebaseauthapi.zzajj.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p377firebaseauthapi.zzakq.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzahl):void");
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final int zzb(T t10) {
        int hashCode = this.zzb.zzd(t10).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t10).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final boolean zzb(T t10, T t11) {
        if (!this.zzb.zzd(t10).equals(this.zzb.zzd(t11))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t10).equals(this.zzd.zza(t11));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final void zzc(T t10) {
        this.zzb.zzf(t10);
        this.zzd.zzc(t10);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final boolean zzd(T t10) {
        return this.zzd.zza(t10).zzg();
    }
}
