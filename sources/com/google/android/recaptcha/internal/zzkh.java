package com.google.android.recaptcha.internal;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p079f6.C1841a;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class zzkh<T> implements zzkr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzlv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzke zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzjs zzm;
    private final zzll zzn;
    private final zzif zzo;
    private final zzkk zzp;
    private final zzjz zzq;

    private zzkh(int[] iArr, Object[] objArr, int i10, int i11, zzke zzkeVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzkk zzkkVar, zzjs zzjsVar, zzll zzllVar, zzif zzifVar, zzjz zzjzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzkeVar instanceof zzit;
        boolean z11 = false;
        if (zzifVar != null && zzifVar.zzj(zzkeVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i13;
        this.zzl = i14;
        this.zzp = zzkkVar;
        this.zzm = zzjsVar;
        this.zzn = zzllVar;
        this.zzo = zzifVar;
        this.zzg = zzkeVar;
        this.zzq = zzjzVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzkr zzx = zzx(i10);
        int zzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzkr zzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int zzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzkr zzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzR(obj2, i11, i10)) {
            int zzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzkr zzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i10, zzkq zzkqVar) {
        zzlv.zzs(obj, i10 & 1048575, zzM(i10) ? zzkqVar.zzs() : this.zzi ? zzkqVar.zzr() : zzkqVar.zzp());
    }

    private final void zzH(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = 1048575 & zzr;
        if (j10 == 1048575) {
            return;
        }
        zzlv.zzq(obj, j10, (1 << (zzr >>> 20)) | zzlv.zzc(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzlv.zzq(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = zzr & 1048575;
        if (j10 != 1048575) {
            return (zzlv.zzc(obj, j10) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i10);
        long j11 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzlv.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzlv.zzb(obj, j11)) != 0;
            case 2:
                return zzlv.zzd(obj, j11) != 0;
            case 3:
                return zzlv.zzd(obj, j11) != 0;
            case 4:
                return zzlv.zzc(obj, j11) != 0;
            case 5:
                return zzlv.zzd(obj, j11) != 0;
            case 6:
                return zzlv.zzc(obj, j11) != 0;
            case 7:
                return zzlv.zzw(obj, j11);
            case 8:
                Object zzf = zzlv.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzgw) {
                    return !zzgw.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzlv.zzf(obj, j11) != null;
            case 10:
                return !zzgw.zzb.equals(zzlv.zzf(obj, j11));
            case 11:
                return zzlv.zzc(obj, j11) != 0;
            case 12:
                return zzlv.zzc(obj, j11) != 0;
            case 13:
                return zzlv.zzc(obj, j11) != 0;
            case 14:
                return zzlv.zzd(obj, j11) != 0;
            case 15:
                return zzlv.zzc(obj, j11) != 0;
            case 16:
                return zzlv.zzd(obj, j11) != 0;
            case 17:
                return zzlv.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzkr zzkrVar) {
        return zzkrVar.zzl(zzlv.zzf(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzit) {
            return ((zzit) obj).zzG();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzlv.zzc(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzlv.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzmd zzmdVar) {
        if (obj instanceof String) {
            zzmdVar.zzG(i10, (String) obj);
        } else {
            zzmdVar.zzd(i10, (zzgw) obj);
        }
    }

    public static zzlm zzd(Object obj) {
        zzit zzitVar = (zzit) obj;
        zzlm zzlmVar = zzitVar.zzc;
        if (zzlmVar != zzlm.zzc()) {
            return zzlmVar;
        }
        zzlm zzf = zzlm.zzf();
        zzitVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.recaptcha.internal.zzkh zzm(java.lang.Class r33, com.google.android.recaptcha.internal.zzkb r34, com.google.android.recaptcha.internal.zzkk r35, com.google.android.recaptcha.internal.zzjs r36, com.google.android.recaptcha.internal.zzll r37, com.google.android.recaptcha.internal.zzif r38, com.google.android.recaptcha.internal.zzjz r39) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzkb, com.google.android.recaptcha.internal.zzkk, com.google.android.recaptcha.internal.zzjs, com.google.android.recaptcha.internal.zzll, com.google.android.recaptcha.internal.zzif, com.google.android.recaptcha.internal.zzjz):com.google.android.recaptcha.internal.zzkh");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzlv.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzlv.zzf(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzlv.zzf(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
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

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzlv.zzf(obj, j10)).longValue();
    }

    private final zzix zzw(int i10) {
        int i11 = i10 / 3;
        return (zzix) this.zzd[i11 + i11 + 1];
    }

    private final zzkr zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzkr zzkrVar = (zzkr) objArr[i12];
        if (zzkrVar != null) {
            return zzkrVar;
        }
        zzkr zzb2 = zzkn.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzll zzllVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzf = zzlv.zzf(obj, zzu(i10) & 1048575);
        if (zzf == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x050a, code lost:
    
        if ((r1 instanceof com.google.android.recaptcha.internal.zzgw) != false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if ((r1 instanceof com.google.android.recaptcha.internal.zzgw) != false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x050d, code lost:
    
        r1 = com.google.android.recaptcha.internal.zzhh.zzx((java.lang.String) r1);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0056. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cc, code lost:
    
        if (r2 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e6, code lost:
    
        r1 = r1 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e2, code lost:
    
        r6 = r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e0, code lost:
    
        if (r2 != null) goto L177;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0504, code lost:
    
        if (r1 == 0) goto L878;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0506, code lost:
    
        r13.add(com.google.android.recaptcha.internal.zzgw.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0514, code lost:
    
        if (r0 >= r7) goto L1334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0516, code lost:
    
        r1 = com.google.android.recaptcha.internal.zzgk.zzi(r34, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x051c, code lost:
    
        if (r24 != r12.zza) goto L1336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x051e, code lost:
    
        r0 = com.google.android.recaptcha.internal.zzgk.zzi(r34, r1, r12);
        r1 = r12.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0524, code lost:
    
        if (r1 < 0) goto L1244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0528, code lost:
    
        if (r1 > (r34.length - r0)) goto L1245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x052a, code lost:
    
        if (r1 != 0) goto L879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x050c, code lost:
    
        r13.add(com.google.android.recaptcha.internal.zzgw.zzm(r34, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0531, code lost:
    
        throw com.google.android.recaptcha.internal.zzje.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0536, code lost:
    
        throw com.google.android.recaptcha.internal.zzje.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0537, code lost:
    
        r14 = r0;
        r8 = r12;
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0514, code lost:
    
        r13.add(com.google.android.recaptcha.internal.zzgw.zzm(r34, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x066b, code lost:
    
        if (r1.zzb != 0) goto L969;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x066d, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0671, code lost:
    
        r13.zze(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0674, code lost:
    
        if (r8 >= r7) goto L1349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0676, code lost:
    
        r9 = com.google.android.recaptcha.internal.zzgk.zzi(r34, r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x067c, code lost:
    
        if (r2 != r1.zza) goto L1351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x067e, code lost:
    
        r8 = com.google.android.recaptcha.internal.zzgk.zzl(r34, r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0686, code lost:
    
        if (r1.zzb == 0) goto L970;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x066f, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0671, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0be8, code lost:
    
        if (r5 == r11) goto L1215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0bea, code lost:
    
        r30.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0bf0, code lost:
    
        r10 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0bf5, code lost:
    
        if (r10 >= r12.zzl) goto L1325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0bf7, code lost:
    
        zzy(r33, r12.zzj[r10], null, r12.zzn, r33);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0c0c, code lost:
    
        if (r9 != 0) goto L1225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0c0e, code lost:
    
        if (r6 != r36) goto L1223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0c15, code lost:
    
        throw com.google.android.recaptcha.internal.zzje.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0c1a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0c16, code lost:
    
        if (r6 > r36) goto L1228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0c18, code lost:
    
        if (r8 != r9) goto L1228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0c1f, code lost:
    
        throw com.google.android.recaptcha.internal.zzje.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:198:0x03d6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x08dd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:526:0x00ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:71:0x0b17. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0867 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x087b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0aac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0ac1 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:263:0x052a -> B:255:0x0506). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:293:0x05b4 -> B:287:0x0593). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:310:0x05fe -> B:304:0x05d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:348:0x0686 -> B:342:0x066d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.recaptcha.internal.zzgj r38) {
        /*
            Method dump skipped, instructions count: 3288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzgj):int");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final Object zze() {
        return ((zzit) this.zzg).zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzf(Object obj) {
        int i10;
        if (zzQ(obj)) {
            if (obj instanceof zzit) {
                zzit zzitVar = (zzit) obj;
                zzitVar.zzE(C1841a.e.API_PRIORITY_OTHER);
                zzitVar.zza = 0;
                zzitVar.zzC();
            }
            int[] iArr = this.zzc;
            while (i10 < iArr.length) {
                int zzu = zzu(i10);
                int i11 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j10 = i11;
                if (zzt != 9) {
                    if (zzt == 60 || zzt == 68) {
                        if (!zzR(obj, this.zzc[i10], i10)) {
                        }
                        zzx(i10).zzf(zzb.getObject(obj, j10));
                    } else {
                        switch (zzt) {
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
                                this.zzm.zzb(obj, j10);
                                continue;
                            case C1417R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzjy) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        zzx(i10).zzf(zzb.getObject(obj, j10));
                    }
                }
                i10 = zzN(obj, i10) ? 0 : i10 + 3;
                zzx(i10).zzf(zzb.getObject(obj, j10));
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zzf(obj);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            int i11 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzlv.zzo(obj, j10, zzlv.zza(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzlv.zzp(obj, j10, zzlv.zzb(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzr(obj, j10, zzlv.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 3:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzr(obj, j10, zzlv.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 4:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzq(obj, j10, zzlv.zzc(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 5:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzr(obj, j10, zzlv.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 6:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzq(obj, j10, zzlv.zzc(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 7:
                    if (zzN(obj2, i10)) {
                        zzlv.zzm(obj, j10, zzlv.zzw(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzs(obj, j10, zzlv.zzf(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 9:
                case 17:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzs(obj, j10, zzlv.zzf(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 11:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzq(obj, j10, zzlv.zzc(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 12:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzq(obj, j10, zzlv.zzc(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 13:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzq(obj, j10, zzlv.zzc(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 14:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzr(obj, j10, zzlv.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 15:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzq(obj, j10, zzlv.zzc(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 16:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzlv.zzr(obj, j10, zzlv.zzd(obj2, j10));
                    zzH(obj, i10);
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
                    this.zzm.zzc(obj, obj2, j10);
                    break;
                case C1417R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    int i13 = zzkt.zza;
                    zzlv.zzs(obj, j10, zzjz.zzb(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10)));
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
                    if (!zzR(obj2, i12, i10)) {
                        break;
                    }
                    zzlv.zzs(obj, j10, zzlv.zzf(obj2, j10));
                    zzI(obj, i12, i10);
                    break;
                case C1417R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case C1417R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    zzF(obj, obj2, i10);
                    break;
                case C1417R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case C1417R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case C1417R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case C1417R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case C1417R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case C1417R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case C1417R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (!zzR(obj2, i12, i10)) {
                        break;
                    }
                    zzlv.zzs(obj, j10, zzlv.zzf(obj2, j10));
                    zzI(obj, i12, i10);
                    break;
            }
        }
        zzkt.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzkt.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x00c1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x05d3 A[LOOP:2: B:38:0x05cf->B:40:0x05d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x05e7  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r18, com.google.android.recaptcha.internal.zzkq r19, com.google.android.recaptcha.internal.zzie r20) {
        /*
            Method dump skipped, instructions count: 1658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzkq, com.google.android.recaptcha.internal.zzie):void");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgj zzgjVar) {
        zzc(obj, bArr, i10, i11, 0, zzgjVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0093. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r24, com.google.android.recaptcha.internal.zzmd r25) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzmd):void");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzk(Object obj, Object obj2) {
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            long j10 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i10) && Double.doubleToLongBits(zzlv.zza(obj, j10)) == Double.doubleToLongBits(zzlv.zza(obj2, j10))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i10) && Float.floatToIntBits(zzlv.zzb(obj, j10)) == Float.floatToIntBits(zzlv.zzb(obj2, j10))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i10) && zzlv.zzd(obj, j10) == zzlv.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i10) && zzlv.zzd(obj, j10) == zzlv.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i10) && zzlv.zzc(obj, j10) == zzlv.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i10) && zzlv.zzd(obj, j10) == zzlv.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i10) && zzlv.zzc(obj, j10) == zzlv.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i10) && zzlv.zzw(obj, j10) == zzlv.zzw(obj2, j10)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i10) && zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i10) && zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i10) && zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i10) && zzlv.zzc(obj, j10) == zzlv.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i10) && zzlv.zzc(obj, j10) == zzlv.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i10) && zzlv.zzc(obj, j10) == zzlv.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i10) && zzlv.zzd(obj, j10) == zzlv.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i10) && zzlv.zzc(obj, j10) == zzlv.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i10) && zzlv.zzd(obj, j10) == zzlv.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i10) && zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
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
                case C1417R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    if (!zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10))) {
                        return false;
                    }
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
                case C1417R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case C1417R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case C1417R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case C1417R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case C1417R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case C1417R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case C1417R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case C1417R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case C1417R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    long zzr = zzr(i10) & 1048575;
                    if (zzlv.zzc(obj, zzr) == zzlv.zzc(obj2, zzr) && zzkt.zzH(zzlv.zzf(obj, j10), zzlv.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i14];
            int i16 = iArr2[i15];
            int zzu = zzu(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i16, i15) && !zzP(obj, zzu, zzx(i15))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzjy) zzlv.zzf(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzlv.zzf(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzkr zzx = zzx(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzx.zzl(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i15, i10, i11, i19) && !zzP(obj, zzu, zzx(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.zzh || this.zzo.zzb(obj).zzk();
    }
}
