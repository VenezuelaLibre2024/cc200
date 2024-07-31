package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzale {
    private static final Class<?> zza = zzd();
    private static final zzamb<?, ?> zzb = zzc();
    private static final zzamb<?, ?> zzc = new zzamd();

    public static int zza(int i10, Object obj, zzalc zzalcVar) {
        return obj instanceof zzajo ? zzaii.zzb(i10, (zzajo) obj) : zzaii.zzb(i10, (zzakk) obj, zzalcVar);
    }

    public static int zza(int i10, List<zzahm> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzg = size * zzaii.zzg(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzg += zzaii.zza(list.get(i11));
        }
        return zzg;
    }

    public static int zza(int i10, List<zzakk> list, zzalc zzalcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzaii.zza(i10, list.get(i12), zzalcVar);
        }
        return i11;
    }

    public static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaii.zza(i10, true);
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static zzamb<?, ?> zza() {
        return zzb;
    }

    public static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzamb<UT, UB> zzambVar) {
        if (ub2 == null) {
            ub2 = zzambVar.zzc(obj);
        }
        zzambVar.zzb(ub2, i10, i11);
        return ub2;
    }

    public static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzajh zzajhVar, UB ub2, zzamb<UT, UB> zzambVar) {
        if (zzajhVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzajhVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) zza(obj, i10, intValue, ub2, zzambVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzajhVar.zza(intValue2)) {
                    ub2 = (UB) zza(obj, i10, intValue2, ub2, zzambVar);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void zza(int i10, List<zzahm> list, zzanb zzanbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zza(i10, list);
    }

    public static void zza(int i10, List<?> list, zzanb zzanbVar, zzalc zzalcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zza(i10, list, zzalcVar);
    }

    public static void zza(int i10, List<Boolean> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zza(i10, list, z10);
    }

    public static <T, FT extends zzaiu<FT>> void zza(zzair<FT> zzairVar, T t10, T t11) {
        zzais<FT> zza2 = zzairVar.zza(t11);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzairVar.zzb(t10).zza(zza2);
    }

    public static <T> void zza(zzakh zzakhVar, T t10, T t11, long j10) {
        zzamh.zza(t10, j10, zzakhVar.zza(zzamh.zze(t10, j10), zzamh.zze(t11, j10)));
    }

    public static <T, UT, UB> void zza(zzamb<UT, UB> zzambVar, T t10, T t11) {
        zzambVar.zzc(t10, zzambVar.zza(zzambVar.zzd(t10), zzambVar.zzd(t11)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzaja.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zzb(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzg = zzaii.zzg(i10) * size;
        if (list instanceof zzajq) {
            zzajq zzajqVar = (zzajq) list;
            while (i11 < size) {
                Object zzb2 = zzajqVar.zzb(i11);
                zzg += zzb2 instanceof zzahm ? zzaii.zza((zzahm) zzb2) : zzaii.zza((String) zzb2);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                zzg += obj instanceof zzahm ? zzaii.zza((zzahm) obj) : zzaii.zza((String) obj);
                i11++;
            }
        }
        return zzg;
    }

    public static int zzb(int i10, List<?> list, zzalc zzalcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzg = zzaii.zzg(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            zzg += obj instanceof zzajo ? zzaii.zza((zzajo) obj) : zzaii.zza((zzakk) obj, zzalcVar);
        }
        return zzg;
    }

    public static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzaii.zzg(i10));
    }

    public static int zzb(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zza(zzajdVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zza(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzamb<?, ?> zzb() {
        return zzc;
    }

    public static void zzb(int i10, List<String> list, zzanb zzanbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzb(i10, list);
    }

    public static void zzb(int i10, List<?> list, zzanb zzanbVar, zzalc zzalcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzb(i10, list, zzalcVar);
    }

    public static void zzb(int i10, List<Double> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzb(i10, list, z10);
    }

    public static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaii.zzb(i10, 0);
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    private static zzamb<?, ?> zzc() {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzamb) zze.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzc(int i10, List<Integer> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzc(i10, list, z10);
    }

    public static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaii.zza(i10, 0L);
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzd(int i10, List<Integer> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzd(i10, list, z10);
    }

    public static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzaii.zzg(i10));
    }

    public static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzc(zzajdVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzc(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zze(int i10, List<Long> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zze(i10, list, z10);
    }

    public static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzaii.zzg(i10));
    }

    public static int zzf(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzb(zzajzVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzb(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzf(int i10, List<Float> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzf(i10, list, z10);
    }

    public static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzaii.zzg(i10));
    }

    public static int zzg(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzf(zzajdVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzf(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzg(int i10, List<Integer> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzg(i10, list, z10);
    }

    public static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzaii.zzg(i10));
    }

    public static int zzh(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzd(zzajzVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzd(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzh(int i10, List<Long> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzh(i10, list, z10);
    }

    public static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzaii.zzg(i10));
    }

    public static int zzi(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzh(zzajdVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzh(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzi(int i10, List<Integer> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzi(i10, list, z10);
    }

    public static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzaii.zzg(i10));
    }

    public static int zzj(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zze(zzajzVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zze(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzj(int i10, List<Long> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzj(i10, list, z10);
    }

    public static void zzk(int i10, List<Integer> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzk(i10, list, z10);
    }

    public static void zzl(int i10, List<Long> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzl(i10, list, z10);
    }

    public static void zzm(int i10, List<Integer> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzm(i10, list, z10);
    }

    public static void zzn(int i10, List<Long> list, zzanb zzanbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzn(i10, list, z10);
    }
}
