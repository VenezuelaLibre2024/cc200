package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzij {
    private static final zzij zzb = new zzij(true);
    public final zzle zza = new zzku(16);
    private boolean zzc;
    private boolean zzd;

    private zzij() {
    }

    private zzij(boolean z10) {
        zzg();
        zzg();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002f. Please report as an issue. */
    public static int zza(zzii zziiVar, Object obj) {
        long longValue;
        int intValue;
        int zza;
        int intValue2;
        zzmb zzd = zziiVar.zzd();
        int zza2 = zziiVar.zza();
        zziiVar.zzg();
        int i10 = zzhh.zzb;
        int zzy = zzhh.zzy(zza2 << 3);
        if (zzd == zzmb.zzj) {
            zzke zzkeVar = (zzke) obj;
            byte[] bArr = zzjc.zzd;
            if (zzkeVar instanceof zzgg) {
                throw null;
            }
            zzy += zzy;
        }
        zzmc zzmcVar = zzmc.INT;
        int i11 = 4;
        switch (zzd.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i11 = 8;
                return zzy + i11;
            case 1:
                ((Float) obj).floatValue();
                return zzy + i11;
            case 2:
            case 3:
                longValue = ((Long) obj).longValue();
                i11 = zzhh.zzz(longValue);
                return zzy + i11;
            case 4:
                intValue = ((Integer) obj).intValue();
                i11 = zzhh.zzu(intValue);
                return zzy + i11;
            case 5:
            case 15:
                ((Long) obj).longValue();
                i11 = 8;
                return zzy + i11;
            case 6:
            case 14:
                ((Integer) obj).intValue();
                return zzy + i11;
            case 7:
                ((Boolean) obj).booleanValue();
                i11 = 1;
                return zzy + i11;
            case 8:
                if (!(obj instanceof zzgw)) {
                    i11 = zzhh.zzx((String) obj);
                    return zzy + i11;
                }
                zza = ((zzgw) obj).zzd();
                i11 = zzhh.zzy(zza) + zza;
                return zzy + i11;
            case 9:
                i11 = ((zzke) obj).zzn();
                return zzy + i11;
            case 10:
                if (!(obj instanceof zzjj)) {
                    i11 = zzhh.zzv((zzke) obj);
                    return zzy + i11;
                }
                zza = ((zzjj) obj).zza();
                i11 = zzhh.zzy(zza) + zza;
                return zzy + i11;
            case 11:
                if (!(obj instanceof zzgw)) {
                    zza = ((byte[]) obj).length;
                    i11 = zzhh.zzy(zza) + zza;
                    return zzy + i11;
                }
                zza = ((zzgw) obj).zzd();
                i11 = zzhh.zzy(zza) + zza;
                return zzy + i11;
            case 12:
                intValue2 = ((Integer) obj).intValue();
                i11 = zzhh.zzy(intValue2);
                return zzy + i11;
            case 13:
                if (obj instanceof zziv) {
                    intValue = ((zziv) obj).zza();
                    i11 = zzhh.zzu(intValue);
                    return zzy + i11;
                }
                intValue = ((Integer) obj).intValue();
                i11 = zzhh.zzu(intValue);
                return zzy + i11;
            case 16:
                int intValue3 = ((Integer) obj).intValue();
                intValue2 = (intValue3 >> 31) ^ (intValue3 + intValue3);
                i11 = zzhh.zzy(intValue2);
                return zzy + i11;
            case 17:
                long longValue2 = ((Long) obj).longValue();
                longValue = (longValue2 >> 63) ^ (longValue2 + longValue2);
                i11 = zzhh.zzz(longValue);
                return zzy + i11;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzij zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzkj) {
            return ((zzkj) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzke zzj;
        zzii zziiVar = (zzii) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzjj;
        zziiVar.zzg();
        if (zziiVar.zze() != zzmc.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zziiVar, zzl(value));
            return;
        }
        Object zze = zze(zziiVar);
        if (zze == null) {
            this.zza.put(zziiVar, zzl(value));
            if (z10) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z10) {
            throw null;
        }
        if (zze instanceof zzkj) {
            zzj = zziiVar.zzc((zzkj) zze, (zzkj) value);
        } else {
            zzkd zzX = ((zzke) zze).zzX();
            zziiVar.zzb(zzX, (zzke) value);
            zzj = zzX.zzj();
        }
        this.zza.put(zziiVar, zzj);
    }

    private static boolean zzn(Map.Entry entry) {
        zzii zziiVar = (zzii) entry.getKey();
        if (zziiVar.zze() != zzmc.MESSAGE) {
            return true;
        }
        zziiVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzkf) {
            return ((zzkf) value).zzo();
        }
        if (value instanceof zzjj) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        zzii zziiVar = (zzii) entry.getKey();
        Object value = entry.getValue();
        if (zziiVar.zze() != zzmc.MESSAGE) {
            return zza(zziiVar, value);
        }
        zziiVar.zzg();
        zziiVar.zzf();
        boolean z10 = value instanceof zzjj;
        int zza = ((zzii) entry.getKey()).zza();
        if (!z10) {
            int zzy = zzhh.zzy(zza);
            int zzy2 = zzhh.zzy(24) + zzhh.zzv((zzke) value);
            int zzy3 = zzhh.zzy(16);
            int zzy4 = zzhh.zzy(8);
            return zzy4 + zzy4 + zzy3 + zzy + zzy2;
        }
        int zzy5 = zzhh.zzy(zza);
        int zza2 = ((zzjj) value).zza();
        int zzy6 = zzhh.zzy(zza2) + zza2;
        int zzy7 = zzhh.zzy(24);
        int zzy8 = zzhh.zzy(16);
        int zzy9 = zzhh.zzy(8);
        return zzy9 + zzy9 + zzy8 + zzy5 + zzy7 + zzy6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzij) {
            return this.zza.equals(((zzij) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            i10 += zzo(this.zza.zzg(i11));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i10 += zzo((Map.Entry) it.next());
        }
        return i10;
    }

    /* renamed from: zzc */
    public final zzij clone() {
        zzij zzijVar = new zzij();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzijVar.zzi((zzii) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzijVar.zzi((zzii) entry.getKey(), entry.getValue());
        }
        zzijVar.zzd = this.zzd;
        return zzijVar;
    }

    public final Object zze(zzii zziiVar) {
        Object obj = this.zza.get(zziiVar);
        if (!(obj instanceof zzjj)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        return this.zzd ? new zzji(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            if (zzg.getValue() instanceof zzit) {
                ((zzit) zzg.getValue()).zzB();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzij zzijVar) {
        for (int i10 = 0; i10 < zzijVar.zza.zzb(); i10++) {
            zzm(zzijVar.zza.zzg(i10));
        }
        Iterator it = zzijVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zziv) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r0 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzjj) == false) goto L66;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.recaptcha.internal.zzii r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.zzg()
            com.google.android.recaptcha.internal.zzmb r0 = r6.zzd()
            byte[] r1 = com.google.android.recaptcha.internal.zzjc.zzd
            java.util.Objects.requireNonNull(r7)
            com.google.android.recaptcha.internal.zzmb r1 = com.google.android.recaptcha.internal.zzmb.zza
            com.google.android.recaptcha.internal.zzmc r1 = com.google.android.recaptcha.internal.zzmc.INT
            com.google.android.recaptcha.internal.zzmc r0 = r0.zza()
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L47;
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L2f;
                case 7: goto L26;
                case 8: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L57
        L1d:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzke
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzjj
            if (r0 == 0) goto L57
            goto L4b
        L26:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zziv
            if (r0 == 0) goto L57
            goto L4b
        L2f:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4b
        L38:
            boolean r0 = r7 instanceof java.lang.String
            goto L49
        L3b:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L49
        L3e:
            boolean r0 = r7 instanceof java.lang.Double
            goto L49
        L41:
            boolean r0 = r7 instanceof java.lang.Float
            goto L49
        L44:
            boolean r0 = r7 instanceof java.lang.Long
            goto L49
        L47:
            boolean r0 = r7 instanceof java.lang.Integer
        L49:
            if (r0 == 0) goto L57
        L4b:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzjj
            if (r0 == 0) goto L51
            r5.zzd = r1
        L51:
            com.google.android.recaptcha.internal.zzle r0 = r5.zza
            r0.put(r6, r7)
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r6.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            com.google.android.recaptcha.internal.zzmb r6 = r6.zzd()
            com.google.android.recaptcha.internal.zzmc r6 = r6.zza()
            r2[r1] = r6
            r6 = 2
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r2[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzij.zzi(com.google.android.recaptcha.internal.zzii, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzn(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
