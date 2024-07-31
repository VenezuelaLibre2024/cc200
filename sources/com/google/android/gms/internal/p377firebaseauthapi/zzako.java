package com.google.android.gms.internal.p377firebaseauthapi;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p079f6.C1841a;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class zzako<T> implements zzalc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzamh.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzakk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final zzakz zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzaks zzo;
    private final zzajt zzp;
    private final zzamb<?, ?> zzq;
    private final zzair<?> zzr;
    private final zzakh zzs;

    private zzako(int[] iArr, Object[] objArr, int i10, int i11, zzakk zzakkVar, zzakz zzakzVar, boolean z10, int[] iArr2, int i12, int i13, zzaks zzaksVar, zzajt zzajtVar, zzamb<?, ?> zzambVar, zzair<?> zzairVar, zzakh zzakhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzakkVar instanceof zzaja;
        this.zzj = zzakzVar;
        this.zzh = zzairVar != null && zzairVar.zza(zzakkVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i12;
        this.zzn = i13;
        this.zzo = zzaksVar;
        this.zzp = zzajtVar;
        this.zzq = zzambVar;
        this.zzr = zzairVar;
        this.zzg = zzakkVar;
        this.zzs = zzakhVar;
    }

    private static <T> double zza(T t10, long j10) {
        return ((Double) zzamh.zze(t10, j10)).doubleValue();
    }

    private final int zza(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zza(i10, 0);
    }

    private final int zza(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private static int zza(byte[] bArr, int i10, int i11, zzamo zzamoVar, Class<?> cls, zzahl zzahlVar) {
        int zzd;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        int i12;
        long j10;
        switch (zzakr.zza[zzamoVar.ordinal()]) {
            case 1:
                zzd = zzahi.zzd(bArr, i10, zzahlVar);
                valueOf = Boolean.valueOf(zzahlVar.zzb != 0);
                zzahlVar.zzc = valueOf;
                return zzd;
            case 2:
                return zzahi.zza(bArr, i10, zzahlVar);
            case 3:
                valueOf2 = Double.valueOf(zzahi.zza(bArr, i10));
                zzahlVar.zzc = valueOf2;
                return i10 + 8;
            case 4:
            case 5:
                valueOf3 = Integer.valueOf(zzahi.zzc(bArr, i10));
                zzahlVar.zzc = valueOf3;
                return i10 + 4;
            case 6:
            case 7:
                valueOf2 = Long.valueOf(zzahi.zzd(bArr, i10));
                zzahlVar.zzc = valueOf2;
                return i10 + 8;
            case 8:
                valueOf3 = Float.valueOf(zzahi.zzb(bArr, i10));
                zzahlVar.zzc = valueOf3;
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                zzd = zzahi.zzc(bArr, i10, zzahlVar);
                i12 = zzahlVar.zza;
                valueOf = Integer.valueOf(i12);
                zzahlVar.zzc = valueOf;
                return zzd;
            case 12:
            case 13:
                zzd = zzahi.zzd(bArr, i10, zzahlVar);
                j10 = zzahlVar.zzb;
                valueOf = Long.valueOf(j10);
                zzahlVar.zzc = valueOf;
                return zzd;
            case 14:
                return zzahi.zza(zzaky.zza().zza((Class) cls), bArr, i10, i11, zzahlVar);
            case 15:
                zzd = zzahi.zzc(bArr, i10, zzahlVar);
                i12 = zzaib.zze(zzahlVar.zza);
                valueOf = Integer.valueOf(i12);
                zzahlVar.zzc = valueOf;
                return zzd;
            case 16:
                zzd = zzahi.zzd(bArr, i10, zzahlVar);
                j10 = zzaib.zza(zzahlVar.zzb);
                valueOf = Long.valueOf(j10);
                zzahlVar.zzc = valueOf;
                return zzd;
            case 17:
                return zzahi.zzb(bArr, i10, zzahlVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.p377firebaseauthapi.zzako<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.p377firebaseauthapi.zzaki r33, com.google.android.gms.internal.p377firebaseauthapi.zzaks r34, com.google.android.gms.internal.p377firebaseauthapi.zzajt r35, com.google.android.gms.internal.p377firebaseauthapi.zzamb<?, ?> r36, com.google.android.gms.internal.p377firebaseauthapi.zzair<?> r37, com.google.android.gms.internal.p377firebaseauthapi.zzakh r38) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p377firebaseauthapi.zzako.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzaki, com.google.android.gms.internal.firebase-auth-api.zzaks, com.google.android.gms.internal.firebase-auth-api.zzajt, com.google.android.gms.internal.firebase-auth-api.zzamb, com.google.android.gms.internal.firebase-auth-api.zzair, com.google.android.gms.internal.firebase-auth-api.zzakh):com.google.android.gms.internal.firebase-auth-api.zzako");
    }

    private final <K, V, UT, UB> UB zza(int i10, int i11, Map<K, V> map, zzajh zzajhVar, UB ub2, zzamb<UT, UB> zzambVar, Object obj) {
        zzakf<?, ?> zza2 = this.zzs.zza(zzf(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzajhVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = zzambVar.zzc(obj);
                }
                zzahv zzc = zzahm.zzc(zzakc.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzakc.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzambVar.zza((zzamb<UT, UB>) ub2, i11, zzc.zza());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i10) {
        zzalc zze = zze(i10);
        long zzc = zzc(i10) & 1048575;
        if (!zzc((zzako<T>) t10, i10)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t10, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i10, int i11) {
        zzalc zze = zze(i11);
        if (!zzc((zzako<T>) t10, i10, i11)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t10, zzc(i11) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    private final <UT, UB> UB zza(Object obj, int i10, UB ub2, zzamb<UT, UB> zzambVar, Object obj2) {
        zzajh zzd;
        int i11 = this.zzc[i10];
        Object zze = zzamh.zze(obj, zzc(i10) & 1048575);
        return (zze == null || (zzd = zzd(i10)) == null) ? ub2 : (UB) zza(i10, i11, this.zzs.zze(zze), zzd, (zzajh) ub2, (zzamb<UT, zzajh>) zzambVar, obj2);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zza(int i10, Object obj, zzanb zzanbVar) {
        if (obj instanceof String) {
            zzanbVar.zza(i10, (String) obj);
        } else {
            zzanbVar.zza(i10, (zzahm) obj);
        }
    }

    private static <UT, UB> void zza(zzamb<UT, UB> zzambVar, T t10, zzanb zzanbVar) {
        zzambVar.zzb((zzamb<UT, UB>) zzambVar.zzd(t10), zzanbVar);
    }

    private final <K, V> void zza(zzanb zzanbVar, int i10, Object obj, int i11) {
        if (obj != null) {
            zzanbVar.zza(i10, this.zzs.zza(zzf(i11)), this.zzs.zzd(obj));
        }
    }

    private final void zza(T t10, int i10, int i11, Object obj) {
        zzb.putObject(t10, zzc(i11) & 1048575, obj);
        zzb((zzako<T>) t10, i10, i11);
    }

    private final void zza(Object obj, int i10, zzald zzaldVar) {
        long j10;
        Object zzp;
        if (zzg(i10)) {
            j10 = i10 & 1048575;
            zzp = zzaldVar.zzr();
        } else {
            int i11 = i10 & 1048575;
            if (this.zzi) {
                j10 = i11;
                zzp = zzaldVar.zzq();
            } else {
                j10 = i11;
                zzp = zzaldVar.zzp();
            }
        }
        zzamh.zza(obj, j10, zzp);
    }

    private final void zza(T t10, int i10, Object obj) {
        zzb.putObject(t10, zzc(i10) & 1048575, obj);
        zzb((zzako<T>) t10, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t10, T t11, int i10) {
        if (zzc((zzako<T>) t11, i10)) {
            long zzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t11));
            }
            zzalc zze = zze(i10);
            if (!zzc((zzako<T>) t10, i10)) {
                if (zzg(object)) {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t10, zzc, zza2);
                } else {
                    unsafe.putObject(t10, zzc, object);
                }
                zzb((zzako<T>) t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t10, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    private final boolean zza(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzc((zzako<T>) t10, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i10, zzalc zzalcVar) {
        return zzalcVar.zzd(zzamh.zze(obj, i10 & 1048575));
    }

    private static <T> float zzb(T t10, long j10) {
        return ((Float) zzamh.zze(t10, j10)).floatValue();
    }

    private final int zzb(int i10) {
        return this.zzc[i10 + 2];
    }

    private final void zzb(T t10, int i10) {
        int zzb2 = zzb(i10);
        long j10 = 1048575 & zzb2;
        if (j10 == 1048575) {
            return;
        }
        zzamh.zza((Object) t10, j10, (1 << (zzb2 >>> 20)) | zzamh.zzc(t10, j10));
    }

    private final void zzb(T t10, int i10, int i11) {
        zzamh.zza((Object) t10, zzb(i11) & 1048575, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t10, T t11, int i10) {
        int i11 = this.zzc[i10];
        if (zzc((zzako<T>) t11, i11, i10)) {
            long zzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t11));
            }
            zzalc zze = zze(i10);
            if (!zzc((zzako<T>) t10, i11, i10)) {
                if (zzg(object)) {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t10, zzc, zza2);
                } else {
                    unsafe.putObject(t10, zzc, object);
                }
                zzb((zzako<T>) t10, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t10, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    private final int zzc(int i10) {
        return this.zzc[i10 + 1];
    }

    private static <T> int zzc(T t10, long j10) {
        return ((Integer) zzamh.zze(t10, j10)).intValue();
    }

    private final boolean zzc(T t10, int i10) {
        int zzb2 = zzb(i10);
        long j10 = zzb2 & 1048575;
        if (j10 != 1048575) {
            return (zzamh.zzc(t10, j10) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i10);
        long j11 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzamh.zza(t10, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzamh.zzb(t10, j11)) != 0;
            case 2:
                return zzamh.zzd(t10, j11) != 0;
            case 3:
                return zzamh.zzd(t10, j11) != 0;
            case 4:
                return zzamh.zzc(t10, j11) != 0;
            case 5:
                return zzamh.zzd(t10, j11) != 0;
            case 6:
                return zzamh.zzc(t10, j11) != 0;
            case 7:
                return zzamh.zzh(t10, j11);
            case 8:
                Object zze = zzamh.zze(t10, j11);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzahm) {
                    return !zzahm.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzamh.zze(t10, j11) != null;
            case 10:
                return !zzahm.zza.equals(zzamh.zze(t10, j11));
            case 11:
                return zzamh.zzc(t10, j11) != 0;
            case 12:
                return zzamh.zzc(t10, j11) != 0;
            case 13:
                return zzamh.zzc(t10, j11) != 0;
            case 14:
                return zzamh.zzd(t10, j11) != 0;
            case 15:
                return zzamh.zzc(t10, j11) != 0;
            case 16:
                return zzamh.zzd(t10, j11) != 0;
            case 17:
                return zzamh.zze(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzc(T t10, int i10, int i11) {
        return zzamh.zzc(t10, (long) (zzb(i11) & 1048575)) == i10;
    }

    private final boolean zzc(T t10, T t11, int i10) {
        return zzc((zzako<T>) t10, i10) == zzc((zzako<T>) t11, i10);
    }

    private static <T> long zzd(T t10, long j10) {
        return ((Long) zzamh.zze(t10, j10)).longValue();
    }

    private final zzajh zzd(int i10) {
        return (zzajh) this.zzd[((i10 / 3) << 1) + 1];
    }

    private final zzalc zze(int i10) {
        int i11 = (i10 / 3) << 1;
        zzalc zzalcVar = (zzalc) this.zzd[i11];
        if (zzalcVar != null) {
            return zzalcVar;
        }
        zzalc<T> zza2 = zzaky.zza().zza((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zza2;
        return zza2;
    }

    private static zzame zze(Object obj) {
        zzaja zzajaVar = (zzaja) obj;
        zzame zzameVar = zzajaVar.zzb;
        if (zzameVar != zzame.zzc()) {
            return zzameVar;
        }
        zzame zzd = zzame.zzd();
        zzajaVar.zzb = zzd;
        return zzd;
    }

    private static <T> boolean zze(T t10, long j10) {
        return ((Boolean) zzamh.zze(t10, j10)).booleanValue();
    }

    private final Object zzf(int i10) {
        return this.zzd[(i10 / 3) << 1];
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean zzg(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzaja) {
            return ((zzaja) obj).zzv();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0238, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0245, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0252, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a3, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0254, code lost:
    
        r12 = r12 + ((com.google.android.gms.internal.p377firebaseauthapi.zzaii.zzg(r13) + com.google.android.gms.internal.p377firebaseauthapi.zzaii.zzh(r0)) + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b1, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bf, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cd, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01db, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e9, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f7, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0204, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0211, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021e, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        if (r0 > 0) goto L345;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x005a. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r19) {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p377firebaseauthapi.zzako.zza(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x0a44, code lost:
    
        throw com.google.android.gms.internal.p377firebaseauthapi.zzajj.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x05c2, code lost:
    
        if (r1 == 0) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x05c4, code lost:
    
        r12.add(com.google.android.gms.internal.p377firebaseauthapi.zzahm.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x05d2, code lost:
    
        if (r0 >= r15) goto L1356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x05d4, code lost:
    
        r1 = com.google.android.gms.internal.p377firebaseauthapi.zzahi.zzc(r14, r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x05da, code lost:
    
        if (r18 != r7.zza) goto L1358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x05dc, code lost:
    
        r0 = com.google.android.gms.internal.p377firebaseauthapi.zzahi.zzc(r14, r1, r7);
        r1 = r7.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x05e2, code lost:
    
        if (r1 < 0) goto L1261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x05e6, code lost:
    
        if (r1 > (r14.length - r0)) goto L1262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05e8, code lost:
    
        if (r1 != 0) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x05ca, code lost:
    
        r12.add(com.google.android.gms.internal.p377firebaseauthapi.zzahm.zza(r14, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05ef, code lost:
    
        throw com.google.android.gms.internal.p377firebaseauthapi.zzajj.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05f4, code lost:
    
        throw com.google.android.gms.internal.p377firebaseauthapi.zzajj.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05d2, code lost:
    
        r12.add(com.google.android.gms.internal.p377firebaseauthapi.zzahm.zza(r14, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0727, code lost:
    
        if (r7.zzb != 0) goto L978;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0729, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x072d, code lost:
    
        r12.zza(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0730, code lost:
    
        if (r0 >= r15) goto L1371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0732, code lost:
    
        r2 = com.google.android.gms.internal.p377firebaseauthapi.zzahi.zzc(r14, r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0738, code lost:
    
        if (r1 != r7.zza) goto L1373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x073a, code lost:
    
        r0 = com.google.android.gms.internal.p377firebaseauthapi.zzahi.zzd(r14, r2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0742, code lost:
    
        if (r7.zzb == 0) goto L979;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x072b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x072d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0d1f, code lost:
    
        if (r14 == 1048575) goto L1222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d21, code lost:
    
        r15.putInt(r10, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d25, code lost:
    
        r3 = null;
        r7 = r9.zzm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d2c, code lost:
    
        if (r7 >= r9.zzn) goto L1344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d2e, code lost:
    
        r3 = (com.google.android.gms.internal.p377firebaseauthapi.zzame) zza((java.lang.Object) r33, r9.zzl[r7], (int) r3, (com.google.android.gms.internal.p377firebaseauthapi.zzamb<UT, int>) r9.zzq, (java.lang.Object) r33);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d44, code lost:
    
        if (r3 == null) goto L1228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0d46, code lost:
    
        r9.zzq.zzb((java.lang.Object) r10, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0d4d, code lost:
    
        if (r6 != 0) goto L1234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0d4f, code lost:
    
        if (r8 != r36) goto L1232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d56, code lost:
    
        throw com.google.android.gms.internal.p377firebaseauthapi.zzajj.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d5b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0d57, code lost:
    
        if (r8 > r36) goto L1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0d59, code lost:
    
        if (r11 != r6) goto L1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0d60, code lost:
    
        throw com.google.android.gms.internal.p377firebaseauthapi.zzajj.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:223:0x047d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:533:0x00ac. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x0a68. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x090b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x08ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0cfe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0c89 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v63, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:235:0x05e8 -> B:227:0x05c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:261:0x066f -> B:255:0x064e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:279:0x06b7 -> B:273:0x068e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:317:0x0742 -> B:311:0x0729). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.p377firebaseauthapi.zzahl r38) {
        /*
            Method dump skipped, instructions count: 3574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p377firebaseauthapi.zzako.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzahl):int");
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00bd. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x05b2 A[Catch: all -> 0x026f, TryCatch #8 {all -> 0x026f, blocks: (B:15:0x0586, B:35:0x05ad, B:37:0x05b2, B:38:0x05b7, B:176:0x00cb, B:84:0x00d8, B:67:0x00dd, B:68:0x00f8, B:71:0x00eb, B:72:0x00fd, B:73:0x010b, B:74:0x0119, B:76:0x0123, B:79:0x012a, B:80:0x0131, B:81:0x013b, B:82:0x0149, B:83:0x0153, B:87:0x0162, B:88:0x016b, B:89:0x017a, B:90:0x0189, B:91:0x0198, B:92:0x01a7, B:93:0x01b6, B:94:0x01c5, B:95:0x01d4, B:96:0x01e3, B:98:0x01f3, B:99:0x0214, B:100:0x01fd, B:102:0x0205, B:103:0x0225, B:104:0x0237, B:105:0x0245, B:106:0x0253, B:107:0x0261), top: B:14:0x0586 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x05e9 A[LOOP:3: B:52:0x05e5->B:54:0x05e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05fd  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.firebase-auth-api.zzald] */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r18, com.google.android.gms.internal.p377firebaseauthapi.zzald r19, com.google.android.gms.internal.p377firebaseauthapi.zzaip r20) {
        /*
            Method dump skipped, instructions count: 1680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p377firebaseauthapi.zzako.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzald, com.google.android.gms.internal.firebase-auth-api.zzaip):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x006a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:313:0x0559. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0b32  */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r24, com.google.android.gms.internal.p377firebaseauthapi.zzanb r25) {
        /*
            Method dump skipped, instructions count: 3178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p377firebaseauthapi.zzako.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanb):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001e. Please report as an issue. */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final void zza(T t10, T t11) {
        zzf(t10);
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzc = zzc(i10);
            long j10 = 1048575 & zzc;
            int i11 = this.zzc[i10];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzako<T>) t11, i10)) {
                        zzamh.zza(t10, j10, zzamh.zza(t11, j10));
                        zzb((zzako<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzako<T>) t11, i10)) {
                        zzamh.zza((Object) t10, j10, zzamh.zzb(t11, j10));
                        zzb((zzako<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza((Object) t10, j10, zzamh.zzd(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 3:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza((Object) t10, j10, zzamh.zzd(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 4:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza((Object) t10, j10, zzamh.zzc(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 5:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza((Object) t10, j10, zzamh.zzd(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 6:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza((Object) t10, j10, zzamh.zzc(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 7:
                    if (zzc((zzako<T>) t11, i10)) {
                        zzamh.zzc(t10, j10, zzamh.zzh(t11, j10));
                        zzb((zzako<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza(t10, j10, zzamh.zze(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 9:
                case 17:
                    zza(t10, t11, i10);
                    break;
                case 10:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza(t10, j10, zzamh.zze(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 11:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza((Object) t10, j10, zzamh.zzc(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 12:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza((Object) t10, j10, zzamh.zzc(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 13:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza((Object) t10, j10, zzamh.zzc(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 14:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza((Object) t10, j10, zzamh.zzd(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 15:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza((Object) t10, j10, zzamh.zzc(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 16:
                    if (!zzc((zzako<T>) t11, i10)) {
                        break;
                    }
                    zzamh.zza((Object) t10, j10, zzamh.zzd(t11, j10));
                    zzb((zzako<T>) t10, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case C1417R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                case C1417R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case C1417R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case C1417R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case C1417R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case C1417R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case C1417R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case C1417R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case 40:
                case C1417R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case C1417R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case C1417R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case C1417R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case C1417R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case C1417R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case C1417R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case 48:
                case C1417R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    this.zzp.zza(t10, t11, j10);
                    break;
                case C1417R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    zzale.zza(this.zzs, t10, t11, j10);
                    break;
                case C1417R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case C1417R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case C1417R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case C1417R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case C1417R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case 56:
                case C1417R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case C1417R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case C1417R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (!zzc((zzako<T>) t11, i11, i10)) {
                        break;
                    }
                    zzamh.zza(t10, j10, zzamh.zze(t11, j10));
                    zzb((zzako<T>) t10, i11, i10);
                    break;
                case C1417R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case C1417R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    zzb(t10, t11, i10);
                    break;
                case C1417R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case C1417R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case C1417R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case C1417R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case C1417R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case C1417R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case C1417R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (!zzc((zzako<T>) t11, i11, i10)) {
                        break;
                    }
                    zzamh.zza(t10, j10, zzamh.zze(t11, j10));
                    zzb((zzako<T>) t10, i11, i10);
                    break;
            }
        }
        zzale.zza(this.zzq, t10, t11);
        if (this.zzh) {
            zzale.zza(this.zzr, t10, t11);
        }
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final void zza(T t10, byte[] bArr, int i10, int i11, zzahl zzahlVar) {
        zza((zzako<T>) t10, bArr, i10, i11, 0, zzahlVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ce, code lost:
    
        if (r3 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e6, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e2, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e0, code lost:
    
        if (r3 != null) goto L177;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(T r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p377firebaseauthapi.zzako.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzale.zza(com.google.android.gms.internal.p377firebaseauthapi.zzamh.zze(r10, r6), com.google.android.gms.internal.p377firebaseauthapi.zzamh.zze(r11, r6)) != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzd(r10, r6) == com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzd(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzc(r10, r6) == com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzc(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzd(r10, r6) == com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzd(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzc(r10, r6) == com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzc(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzc(r10, r6) == com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzc(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzc(r10, r6) == com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzc(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzale.zza(com.google.android.gms.internal.p377firebaseauthapi.zzamh.zze(r10, r6), com.google.android.gms.internal.p377firebaseauthapi.zzamh.zze(r11, r6)) != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzale.zza(com.google.android.gms.internal.p377firebaseauthapi.zzamh.zze(r10, r6), com.google.android.gms.internal.p377firebaseauthapi.zzamh.zze(r11, r6)) != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzale.zza(com.google.android.gms.internal.p377firebaseauthapi.zzamh.zze(r10, r6), com.google.android.gms.internal.p377firebaseauthapi.zzamh.zze(r11, r6)) != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzh(r10, r6) == com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzh(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzc(r10, r6) == com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzc(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzd(r10, r6) == com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzd(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzc(r10, r6) == com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzc(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzd(r10, r6) == com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzd(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzd(r10, r6) == com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzd(r11, r6)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0195, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.p377firebaseauthapi.zzamh.zzb(r11, r6))) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p377firebaseauthapi.zzamh.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p377firebaseauthapi.zzamh.zza(r11, r6))) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.p377firebaseauthapi.zzale.zza(com.google.android.gms.internal.p377firebaseauthapi.zzamh.zze(r10, r6), com.google.android.gms.internal.p377firebaseauthapi.zzamh.zze(r11, r6)) != false) goto L221;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6 A[LOOP:0: B:2:0x0005->B:85:0x01b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b5 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p377firebaseauthapi.zzako.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final void zzc(T t10) {
        int i10;
        if (zzg(t10)) {
            if (t10 instanceof zzaja) {
                zzaja zzajaVar = (zzaja) t10;
                zzajaVar.zzb(C1841a.e.API_PRIORITY_OTHER);
                zzajaVar.zza = 0;
                zzajaVar.zzt();
            }
            int length = this.zzc.length;
            while (i10 < length) {
                int zzc = zzc(i10);
                long j10 = 1048575 & zzc;
                int i11 = (zzc & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 == 60 || i11 == 68) {
                        if (!zzc((zzako<T>) t10, this.zzc[i10], i10)) {
                        }
                        zze(i10).zzc(zzb.getObject(t10, j10));
                    } else {
                        switch (i11) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case C1417R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            case C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                            case C1417R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            case C1417R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            case C1417R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                            case C1417R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                            case C1417R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            case C1417R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            case C1417R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            case 40:
                            case C1417R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            case C1417R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            case C1417R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            case C1417R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                            case C1417R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            case C1417R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            case C1417R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            case 48:
                            case C1417R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                this.zzp.zzb(t10, j10);
                                continue;
                            case C1417R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t10, j10);
                                if (object != null) {
                                    unsafe.putObject(t10, j10, this.zzs.zzc(object));
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        zze(i10).zzc(zzb.getObject(t10, j10));
                    }
                }
                i10 = zzc((zzako<T>) t10, i10) ? 0 : i10 + 3;
                zze(i10).zzc(zzb.getObject(t10, j10));
            }
            this.zzq.zzf(t10);
            if (this.zzh) {
                this.zzr.zzc(t10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzalc] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzalc] */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzalc
    public final boolean zzd(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z10 = true;
            if (i14 >= this.zzm) {
                return !this.zzh || this.zzr.zza(t10).zzg();
            }
            int i15 = this.zzl[i14];
            int i16 = this.zzc[i15];
            int zzc = zzc(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(t10, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (((268435456 & zzc) != 0) && !zza((zzako<T>) t10, i15, i10, i11, i19)) {
                return false;
            }
            int i20 = (267386880 & zzc) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (zzc((zzako<T>) t10, i16, i15) && !zza((Object) t10, zzc, zze(i15))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzs.zzd(zzamh.zze(t10, zzc & 1048575));
                            if (!zzd.isEmpty()) {
                                if (this.zzs.zza(zzf(i15)).zzc.zzb() == zzamy.MESSAGE) {
                                    ?? r12 = 0;
                                    Iterator<?> it = zzd.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        r12 = r12;
                                        if (r12 == 0) {
                                            r12 = zzaky.zza().zza((Class) next.getClass());
                                        }
                                        if (!r12.zzd(next)) {
                                            z10 = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z10) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzamh.zze(t10, zzc & 1048575);
                if (!list.isEmpty()) {
                    ?? zze = zze(i15);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            break;
                        }
                        if (!zze.zzd(list.get(i21))) {
                            z10 = false;
                            break;
                        }
                        i21++;
                    }
                }
                if (!z10) {
                    return false;
                }
            } else if (zza((zzako<T>) t10, i15, i10, i11, i19) && !zza((Object) t10, zzc, zze(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
    }
}
