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
public final class zzdn implements zzdd {
    public static final zzdn zza = new zzdn();

    private zzdn() {
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        Object array;
        boolean z12 = obj instanceof Byte;
        if ((z12 && (obj2 instanceof Byte)) || ((((z10 = obj instanceof Short)) && (obj2 instanceof Short)) || (((z11 = obj instanceof Integer)) && (obj2 instanceof Integer)))) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (z13 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z14 = obj instanceof Float;
        if (z14 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z15 = obj instanceof Double;
        if (z15 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(C0097c.f330b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] % ((Number) obj2).intValue())));
                    i10++;
                }
                return new String(C2510v.m10005H(arrayList), C0097c.f330b);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i10] % ((Number) obj2).intValue()));
                    i10++;
                }
                array = C2510v.m10007J(arrayList2);
                return (Serializable) array;
            }
        }
        if (z12 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Integer.valueOf(b10 % ((Number) obj).intValue()));
            }
            array = arrayList3.toArray(new Integer[0]);
        } else if (z10 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Integer.valueOf(s10 % ((Number) obj).intValue()));
            }
            array = arrayList4.toArray(new Integer[0]);
        } else if (z11 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList5.add(Integer.valueOf(i11 % ((Number) obj).intValue()));
            }
            array = arrayList5.toArray(new Integer[0]);
        } else if (z13 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j10 : jArr) {
                arrayList6.add(Long.valueOf(j10 % ((Number) obj).longValue()));
            }
            array = arrayList6.toArray(new Long[0]);
        } else if (z14 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f10 : fArr) {
                arrayList7.add(Float.valueOf(f10 % ((Number) obj).floatValue()));
            }
            array = arrayList7.toArray(new Float[0]);
        } else if (z15 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d10 : dArr) {
                arrayList8.add(Double.valueOf(d10 % ((Number) obj).doubleValue()));
            }
            array = arrayList8.toArray(new Double[0]);
        } else {
            boolean z16 = obj instanceof byte[];
            if (z16 && (obj2 instanceof Byte)) {
                byte[] bArr2 = (byte[]) obj;
                ArrayList arrayList9 = new ArrayList(bArr2.length);
                for (byte b11 : bArr2) {
                    arrayList9.add(Integer.valueOf(b11 % ((Number) obj2).intValue()));
                }
                array = arrayList9.toArray(new Integer[0]);
            } else {
                boolean z17 = obj instanceof short[];
                if (z17 && (obj2 instanceof Short)) {
                    short[] sArr2 = (short[]) obj;
                    ArrayList arrayList10 = new ArrayList(sArr2.length);
                    for (short s11 : sArr2) {
                        arrayList10.add(Integer.valueOf(s11 % ((Number) obj2).intValue()));
                    }
                    array = arrayList10.toArray(new Integer[0]);
                } else {
                    boolean z18 = obj instanceof int[];
                    if (z18 && (obj2 instanceof Integer)) {
                        int[] iArr2 = (int[]) obj;
                        int length3 = iArr2.length;
                        ArrayList arrayList11 = new ArrayList(length3);
                        while (i10 < length3) {
                            arrayList11.add(Integer.valueOf(iArr2[i10] % ((Number) obj2).intValue()));
                            i10++;
                        }
                        array = C2510v.m10007J(arrayList11);
                    } else {
                        boolean z19 = obj instanceof long[];
                        if (z19 && (obj2 instanceof Long)) {
                            long[] jArr2 = (long[]) obj;
                            ArrayList arrayList12 = new ArrayList(jArr2.length);
                            for (long j11 : jArr2) {
                                arrayList12.add(Long.valueOf(j11 % ((Number) obj2).longValue()));
                            }
                            array = arrayList12.toArray(new Long[0]);
                        } else {
                            boolean z20 = obj instanceof float[];
                            if (z20 && (obj2 instanceof Float)) {
                                float[] fArr2 = (float[]) obj;
                                ArrayList arrayList13 = new ArrayList(fArr2.length);
                                for (float f11 : fArr2) {
                                    arrayList13.add(Float.valueOf(f11 % ((Number) obj2).floatValue()));
                                }
                                array = arrayList13.toArray(new Float[0]);
                            } else {
                                boolean z21 = obj instanceof double[];
                                if (z21 && (obj2 instanceof Double)) {
                                    double[] dArr2 = (double[]) obj;
                                    ArrayList arrayList14 = new ArrayList(dArr2.length);
                                    for (double d11 : dArr2) {
                                        arrayList14.add(Double.valueOf(d11 % ((Number) obj2).doubleValue()));
                                    }
                                    array = arrayList14.toArray(new Double[0]);
                                } else if (z16 && (obj2 instanceof byte[])) {
                                    byte[] bArr3 = (byte[]) obj;
                                    int length4 = bArr3.length;
                                    byte[] bArr4 = (byte[]) obj2;
                                    zzdc.zza(this, length4, bArr4.length);
                                    C5762f m22911h = C5767k.m22911h(0, length4);
                                    ArrayList arrayList15 = new ArrayList(C2503o.m9995k(m22911h, 10));
                                    Iterator<Integer> it = m22911h.iterator();
                                    while (it.hasNext()) {
                                        int mo9877a = ((AbstractC2480a0) it).mo9877a();
                                        arrayList15.add(Integer.valueOf(bArr3[mo9877a] % bArr4[mo9877a]));
                                    }
                                    array = arrayList15.toArray(new Integer[0]);
                                } else if (z17 && (obj2 instanceof short[])) {
                                    short[] sArr3 = (short[]) obj;
                                    int length5 = sArr3.length;
                                    short[] sArr4 = (short[]) obj2;
                                    zzdc.zza(this, length5, sArr4.length);
                                    C5762f m22911h2 = C5767k.m22911h(0, length5);
                                    ArrayList arrayList16 = new ArrayList(C2503o.m9995k(m22911h2, 10));
                                    Iterator<Integer> it2 = m22911h2.iterator();
                                    while (it2.hasNext()) {
                                        int mo9877a2 = ((AbstractC2480a0) it2).mo9877a();
                                        arrayList16.add(Integer.valueOf(sArr3[mo9877a2] % sArr4[mo9877a2]));
                                    }
                                    array = arrayList16.toArray(new Integer[0]);
                                } else if (z18 && (obj2 instanceof int[])) {
                                    int[] iArr3 = (int[]) obj;
                                    int length6 = iArr3.length;
                                    int[] iArr4 = (int[]) obj2;
                                    zzdc.zza(this, length6, iArr4.length);
                                    C5762f m22911h3 = C5767k.m22911h(0, length6);
                                    ArrayList arrayList17 = new ArrayList(C2503o.m9995k(m22911h3, 10));
                                    Iterator<Integer> it3 = m22911h3.iterator();
                                    while (it3.hasNext()) {
                                        int mo9877a3 = ((AbstractC2480a0) it3).mo9877a();
                                        arrayList17.add(Integer.valueOf(iArr3[mo9877a3] % iArr4[mo9877a3]));
                                    }
                                    array = arrayList17.toArray(new Integer[0]);
                                } else if (z19 && (obj2 instanceof long[])) {
                                    long[] jArr3 = (long[]) obj;
                                    int length7 = jArr3.length;
                                    long[] jArr4 = (long[]) obj2;
                                    zzdc.zza(this, length7, jArr4.length);
                                    C5762f m22911h4 = C5767k.m22911h(0, length7);
                                    ArrayList arrayList18 = new ArrayList(C2503o.m9995k(m22911h4, 10));
                                    Iterator<Integer> it4 = m22911h4.iterator();
                                    while (it4.hasNext()) {
                                        int mo9877a4 = ((AbstractC2480a0) it4).mo9877a();
                                        arrayList18.add(Long.valueOf(jArr3[mo9877a4] % jArr4[mo9877a4]));
                                    }
                                    array = arrayList18.toArray(new Long[0]);
                                } else if (z20 && (obj2 instanceof float[])) {
                                    float[] fArr3 = (float[]) obj;
                                    int length8 = fArr3.length;
                                    float[] fArr4 = (float[]) obj2;
                                    zzdc.zza(this, length8, fArr4.length);
                                    C5762f m22911h5 = C5767k.m22911h(0, length8);
                                    ArrayList arrayList19 = new ArrayList(C2503o.m9995k(m22911h5, 10));
                                    Iterator<Integer> it5 = m22911h5.iterator();
                                    while (it5.hasNext()) {
                                        int mo9877a5 = ((AbstractC2480a0) it5).mo9877a();
                                        arrayList19.add(Float.valueOf(fArr3[mo9877a5] % fArr4[mo9877a5]));
                                    }
                                    array = arrayList19.toArray(new Float[0]);
                                } else {
                                    if (!z21 || !(obj2 instanceof double[])) {
                                        throw new zzae(4, 5, null);
                                    }
                                    double[] dArr3 = (double[]) obj;
                                    int length9 = dArr3.length;
                                    double[] dArr4 = (double[]) obj2;
                                    zzdc.zza(this, length9, dArr4.length);
                                    C5762f m22911h6 = C5767k.m22911h(0, length9);
                                    ArrayList arrayList20 = new ArrayList(C2503o.m9995k(m22911h6, 10));
                                    Iterator<Integer> it6 = m22911h6.iterator();
                                    while (it6.hasNext()) {
                                        int mo9877a6 = ((AbstractC2480a0) it6).mo9877a();
                                        arrayList20.add(Double.valueOf(dArr3[mo9877a6] % dArr4[mo9877a6]));
                                    }
                                    array = arrayList20.toArray(new Double[0]);
                                }
                            }
                        }
                    }
                }
            }
        }
        return (Serializable) array;
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
        try {
            zzcjVar.zzc().zzf(i10, zzb(zza2, zza3));
        } catch (ArithmeticException e10) {
            throw new zzae(4, 6, e10);
        }
    }
}
