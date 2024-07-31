package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzaiu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzais<T extends zzaiu<T>> {
    private static final zzais zzb = new zzais(true);
    public final zzalh<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzais() {
        this.zza = zzalh.zza(16);
    }

    private zzais(zzalh<T, Object> zzalhVar) {
        this.zza = zzalhVar;
        zze();
    }

    private zzais(boolean z10) {
        this(zzalh.zza(0));
        zze();
    }

    public static int zza(zzaiu<?> zzaiuVar, Object obj) {
        zzamo zzb2 = zzaiuVar.zzb();
        int zza = zzaiuVar.zza();
        if (!zzaiuVar.zze()) {
            return zza(zzb2, zza, obj);
        }
        List list = (List) obj;
        int i10 = 0;
        if (!zzaiuVar.zzd()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i10 += zza(zzb2, zza, it.next());
            }
            return i10;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i10 += zza(zzb2, it2.next());
        }
        return zzaii.zzg(zza) + i10 + zzaii.zzh(i10);
    }

    public static int zza(zzamo zzamoVar, int i10, Object obj) {
        int zzg = zzaii.zzg(i10);
        if (zzamoVar == zzamo.zzj) {
            zzajc.zza((zzakk) obj);
            zzg <<= 1;
        }
        return zzg + zza(zzamoVar, obj);
    }

    private static int zza(zzamo zzamoVar, Object obj) {
        switch (zzaiv.zzb[zzamoVar.ordinal()]) {
            case 1:
                return zzaii.zza(((Double) obj).doubleValue());
            case 2:
                return zzaii.zza(((Float) obj).floatValue());
            case 3:
                return zzaii.zzb(((Long) obj).longValue());
            case 4:
                return zzaii.zze(((Long) obj).longValue());
            case 5:
                return zzaii.zzc(((Integer) obj).intValue());
            case 6:
                return zzaii.zza(((Long) obj).longValue());
            case 7:
                return zzaii.zzb(((Integer) obj).intValue());
            case 8:
                return zzaii.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzaii.zza((zzakk) obj);
            case 10:
                return obj instanceof zzajk ? zzaii.zza((zzajk) obj) : zzaii.zzb((zzakk) obj);
            case 11:
                return obj instanceof zzahm ? zzaii.zza((zzahm) obj) : zzaii.zza((String) obj);
            case 12:
                return obj instanceof zzahm ? zzaii.zza((zzahm) obj) : zzaii.zza((byte[]) obj);
            case 13:
                return zzaii.zzh(((Integer) obj).intValue());
            case 14:
                return zzaii.zze(((Integer) obj).intValue());
            case 15:
                return zzaii.zzc(((Long) obj).longValue());
            case 16:
                return zzaii.zzf(((Integer) obj).intValue());
            case 17:
                return zzaii.zzd(((Long) obj).longValue());
            case 18:
                return obj instanceof zzajf ? zzaii.zza(((zzajf) obj).zza()) : zzaii.zza(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() != zzamy.MESSAGE || key.zze() || key.zzd()) {
            return zza((zzaiu<?>) key, value);
        }
        boolean z10 = value instanceof zzajk;
        int zza = entry.getKey().zza();
        return z10 ? zzaii.zza(zza, (zzajk) value) : zzaii.zza(zza, (zzakk) value);
    }

    private final Object zza(T t10) {
        Object obj = this.zza.get(t10);
        if (!(obj instanceof zzajk)) {
            return obj;
        }
        return zzajk.zza();
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzakt) {
            return ((zzakt) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void zza(zzaii zzaiiVar, zzamo zzamoVar, int i10, Object obj) {
        if (zzamoVar == zzamo.zzj) {
            zzakk zzakkVar = (zzakk) obj;
            zzajc.zza(zzakkVar);
            zzaiiVar.zzj(i10, 3);
            zzakkVar.zza(zzaiiVar);
            zzaiiVar.zzj(i10, 4);
            return;
        }
        zzaiiVar.zzj(i10, zzamoVar.zza());
        switch (zzaiv.zzb[zzamoVar.ordinal()]) {
            case 1:
                zzaiiVar.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzaiiVar.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzaiiVar.zzh(((Long) obj).longValue());
                return;
            case 4:
                zzaiiVar.zzh(((Long) obj).longValue());
                return;
            case 5:
                zzaiiVar.zzj(((Integer) obj).intValue());
                return;
            case 6:
                zzaiiVar.zzf(((Long) obj).longValue());
                return;
            case 7:
                zzaiiVar.zzi(((Integer) obj).intValue());
                return;
            case 8:
                zzaiiVar.zzb(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzakk) obj).zza(zzaiiVar);
                return;
            case 10:
                zzaiiVar.zzc((zzakk) obj);
                return;
            case 11:
                if (obj instanceof zzahm) {
                    zzaiiVar.zzb((zzahm) obj);
                    return;
                } else {
                    zzaiiVar.zzb((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzahm) {
                    zzaiiVar.zzb((zzahm) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzaiiVar.zzb(bArr, 0, bArr.length);
                    return;
                }
            case 13:
                zzaiiVar.zzl(((Integer) obj).intValue());
                return;
            case 14:
                zzaiiVar.zzi(((Integer) obj).intValue());
                return;
            case 15:
                zzaiiVar.zzf(((Long) obj).longValue());
                return;
            case 16:
                zzaiiVar.zzk(((Integer) obj).intValue());
                return;
            case 17:
                zzaiiVar.zzg(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzajf) {
                    zzaiiVar.zzj(((zzajf) obj).zza());
                    return;
                } else {
                    zzaiiVar.zzj(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static <T extends zzaiu<T>> zzais<T> zzb() {
        return zzb;
    }

    private final void zzb(T t10, Object obj) {
        if (!t10.zze()) {
            zzc(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                zzc(t10, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzajk) {
            this.zzd = true;
        }
        this.zza.zza((zzalh<T, Object>) t10, (T) obj);
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzajk;
        if (key.zze()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object zza = zza((zzais<T>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) zza).add(zza(it.next()));
            }
            this.zza.zza((zzalh<T, Object>) key, (T) zza);
            return;
        }
        if (key.zzc() != zzamy.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzalh<T, Object>) key, (T) zza(value));
            return;
        }
        Object zza2 = zza((zzais<T>) key);
        if (zza2 == null) {
            this.zza.zza((zzalh<T, Object>) key, (T) zza(value));
            if (z10) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z10) {
            value = zzajk.zza();
        }
        this.zza.zza((zzalh<T, Object>) key, (T) (zza2 instanceof zzakt ? key.zza((zzakt) zza2, (zzakt) value) : key.zza(((zzakk) zza2).zzq(), (zzakk) value).zzf()));
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzakm) {
            return ((zzakm) obj).zzu();
        }
        if (obj instanceof zzajk) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.p377firebaseauthapi.zzajk) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.p377firebaseauthapi.zzajf) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzc(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.firebase-auth-api.zzamo r0 = r5.zzb()
            com.google.android.gms.internal.p377firebaseauthapi.zzajc.zza(r6)
            int[] r1 = com.google.android.gms.internal.p377firebaseauthapi.zzaiv.zza
            com.google.android.gms.internal.firebase-auth-api.zzamy r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = r2
            goto L47
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.p377firebaseauthapi.zzakk
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.p377firebaseauthapi.zzajk
            if (r0 == 0) goto L18
            goto L34
        L23:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.p377firebaseauthapi.zzajf
            if (r0 == 0) goto L18
            goto L34
        L2c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.p377firebaseauthapi.zzahm
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
        L34:
            r0 = r1
            goto L47
        L36:
            boolean r0 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            com.google.android.gms.internal.firebase-auth-api.zzamo r5 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzamy r5 = r5.zzb()
            r3[r1] = r5
            r5 = 2
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r3[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p377firebaseauthapi.zzais.zzc(com.google.android.gms.internal.firebase-auth-api.zzaiu, java.lang.Object):void");
    }

    private static <T extends zzaiu<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzamy.MESSAGE) {
            return true;
        }
        boolean zze = key.zze();
        Object value = entry.getValue();
        if (!zze) {
            return zzb(value);
        }
        Iterator it = ((List) value).iterator();
        while (it.hasNext()) {
            if (!zzb(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        zzais zzaisVar = new zzais();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i10);
            zzaisVar.zzb(zzb2.getKey(), zzb2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzc()) {
            zzaisVar.zzb(entry.getKey(), entry.getValue());
        }
        zzaisVar.zzd = this.zzd;
        return zzaisVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzais) {
            return this.zza.equals(((zzais) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zza() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            i10 += zza((Map.Entry) this.zza.zzb(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i10 += zza((Map.Entry) it.next());
        }
        return i10;
    }

    public final void zza(zzais<T> zzaisVar) {
        for (int i10 = 0; i10 < zzaisVar.zza.zzb(); i10++) {
            zzb((Map.Entry) zzaisVar.zza.zzb(i10));
        }
        Iterator<Map.Entry<T, Object>> it = zzaisVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zzd ? new zzajp(this.zza.zzd().iterator()) : this.zza.zzd().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zzd ? new zzajp(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i10);
            if (zzb2.getValue() instanceof zzaja) {
                ((zzaja) zzb2.getValue()).zzs();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzc(this.zza.zzb(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzc(it.next())) {
                return false;
            }
        }
        return true;
    }
}
