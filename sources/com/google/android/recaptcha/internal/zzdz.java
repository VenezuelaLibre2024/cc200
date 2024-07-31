package com.google.android.recaptcha.internal;

import ae.C0097c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import p115hd.AbstractC2480a0;
import p115hd.C2503o;
import p115hd.C2510v;
import p343xd.C5762f;
import p343xd.C5767k;

/* loaded from: classes.dex */
public final class zzdz implements zzdd {
    public static final zzdz zza = new zzdz();

    private zzdz() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzpqVarArr.length != 2) {
            throw new zzae(4, 3, null);
        }
        Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzae(4, 5, null);
        }
        Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
        if (true != (zza3 instanceof Object)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzae(4, 5, null);
        }
        zzcjVar.zzc().zzf(i10, zzb(zza2, zza3));
    }

    public final Object zzb(Object obj, Object obj2) {
        Object array;
        boolean z10 = obj instanceof Byte;
        if (z10 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z11 = obj instanceof Short;
        if (z11 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z12 = obj instanceof Integer;
        if (z12 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (z13 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(C0097c.f330b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] ^ ((Number) obj2).byteValue())));
                    i10++;
                }
                array = C2510v.m10005H(arrayList);
            } else if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i10] ^ ((Number) obj2).intValue()));
                    i10++;
                }
                array = C2510v.m10007J(arrayList2);
            }
            return (Serializable) array;
        }
        if (z10 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b10 ^ ((Number) obj).byteValue())));
            }
            array = arrayList3.toArray(new Byte[0]);
        } else if (z11 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Short.valueOf((short) (s10 ^ ((Number) obj).shortValue())));
            }
            array = arrayList4.toArray(new Short[0]);
        } else if (z12 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList5.add(Integer.valueOf(i11 ^ ((Number) obj).intValue()));
            }
            array = arrayList5.toArray(new Integer[0]);
        } else if (z13 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j10 : jArr) {
                arrayList6.add(Long.valueOf(j10 ^ ((Number) obj).longValue()));
            }
            array = arrayList6.toArray(new Long[0]);
        } else {
            boolean z14 = obj instanceof byte[];
            if (z14 && (obj2 instanceof Byte)) {
                byte[] bArr2 = (byte[]) obj;
                ArrayList arrayList7 = new ArrayList(bArr2.length);
                for (byte b11 : bArr2) {
                    arrayList7.add(Byte.valueOf((byte) (b11 ^ ((Number) obj2).byteValue())));
                }
                array = arrayList7.toArray(new Byte[0]);
            } else {
                boolean z15 = obj instanceof short[];
                if (z15 && (obj2 instanceof Short)) {
                    short[] sArr2 = (short[]) obj;
                    ArrayList arrayList8 = new ArrayList(sArr2.length);
                    for (short s11 : sArr2) {
                        arrayList8.add(Short.valueOf((short) (s11 ^ ((Number) obj2).shortValue())));
                    }
                    array = arrayList8.toArray(new Short[0]);
                } else {
                    boolean z16 = obj instanceof int[];
                    if (z16 && (obj2 instanceof Integer)) {
                        int[] iArr2 = (int[]) obj;
                        ArrayList arrayList9 = new ArrayList(iArr2.length);
                        for (int i12 : iArr2) {
                            arrayList9.add(Integer.valueOf(i12 ^ ((Number) obj2).intValue()));
                        }
                        array = arrayList9.toArray(new Integer[0]);
                    } else {
                        boolean z17 = obj instanceof long[];
                        if (z17 && (obj2 instanceof Long)) {
                            long[] jArr2 = (long[]) obj;
                            ArrayList arrayList10 = new ArrayList(jArr2.length);
                            for (long j11 : jArr2) {
                                arrayList10.add(Long.valueOf(j11 ^ ((Number) obj2).longValue()));
                            }
                            array = arrayList10.toArray(new Long[0]);
                        } else if (z14 && (obj2 instanceof byte[])) {
                            byte[] bArr3 = (byte[]) obj;
                            int length3 = bArr3.length;
                            byte[] bArr4 = (byte[]) obj2;
                            zzdc.zza(this, length3, bArr4.length);
                            C5762f m22911h = C5767k.m22911h(0, length3);
                            ArrayList arrayList11 = new ArrayList(C2503o.m9995k(m22911h, 10));
                            Iterator<Integer> it = m22911h.iterator();
                            while (it.hasNext()) {
                                int mo9877a = ((AbstractC2480a0) it).mo9877a();
                                arrayList11.add(Byte.valueOf((byte) (bArr4[mo9877a] ^ bArr3[mo9877a])));
                            }
                            array = arrayList11.toArray(new Byte[0]);
                        } else if (z15 && (obj2 instanceof short[])) {
                            short[] sArr3 = (short[]) obj;
                            int length4 = sArr3.length;
                            short[] sArr4 = (short[]) obj2;
                            zzdc.zza(this, length4, sArr4.length);
                            C5762f m22911h2 = C5767k.m22911h(0, length4);
                            ArrayList arrayList12 = new ArrayList(C2503o.m9995k(m22911h2, 10));
                            Iterator<Integer> it2 = m22911h2.iterator();
                            while (it2.hasNext()) {
                                int mo9877a2 = ((AbstractC2480a0) it2).mo9877a();
                                arrayList12.add(Short.valueOf((short) (sArr4[mo9877a2] ^ sArr3[mo9877a2])));
                            }
                            array = arrayList12.toArray(new Short[0]);
                        } else if (z16 && (obj2 instanceof int[])) {
                            int[] iArr3 = (int[]) obj;
                            int length5 = iArr3.length;
                            int[] iArr4 = (int[]) obj2;
                            zzdc.zza(this, length5, iArr4.length);
                            C5762f m22911h3 = C5767k.m22911h(0, length5);
                            ArrayList arrayList13 = new ArrayList(C2503o.m9995k(m22911h3, 10));
                            Iterator<Integer> it3 = m22911h3.iterator();
                            while (it3.hasNext()) {
                                int mo9877a3 = ((AbstractC2480a0) it3).mo9877a();
                                arrayList13.add(Integer.valueOf(iArr4[mo9877a3] ^ iArr3[mo9877a3]));
                            }
                            array = arrayList13.toArray(new Integer[0]);
                        } else {
                            if (!z17 || !(obj2 instanceof long[])) {
                                throw new zzae(4, 5, null);
                            }
                            long[] jArr3 = (long[]) obj;
                            int length6 = jArr3.length;
                            long[] jArr4 = (long[]) obj2;
                            zzdc.zza(this, length6, jArr4.length);
                            C5762f m22911h4 = C5767k.m22911h(0, length6);
                            ArrayList arrayList14 = new ArrayList(C2503o.m9995k(m22911h4, 10));
                            Iterator<Integer> it4 = m22911h4.iterator();
                            while (it4.hasNext()) {
                                int mo9877a4 = ((AbstractC2480a0) it4).mo9877a();
                                arrayList14.add(Long.valueOf(jArr3[mo9877a4] ^ jArr4[mo9877a4]));
                            }
                            array = arrayList14.toArray(new Long[0]);
                        }
                    }
                }
            }
        }
        return (Serializable) array;
    }
}
