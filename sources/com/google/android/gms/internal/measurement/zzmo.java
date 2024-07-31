package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzmo {
    public static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    /* loaded from: classes.dex */
    public static final class zza extends zzc {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final double zza(Object obj, long j10) {
            return Double.longBitsToDouble(zze(obj, j10));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j10, byte b10) {
            if (zzmo.zza) {
                zzmo.zzc(obj, j10, b10);
            } else {
                zzmo.zzd(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j10, double d10) {
            zza(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j10, float f10) {
            zza(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j10, boolean z10) {
            if (zzmo.zza) {
                zzmo.zza(obj, j10, z10);
            } else {
                zzmo.zzb(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final float zzb(Object obj, long j10) {
            return Float.intBitsToFloat(zzd(obj, j10));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final boolean zzc(Object obj, long j10) {
            return zzmo.zza ? zzmo.zzf(obj, j10) : zzmo.zzg(obj, j10);
        }
    }

    /* loaded from: classes.dex */
    public static final class zzb extends zzc {
        public zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final double zza(Object obj, long j10) {
            return Double.longBitsToDouble(zze(obj, j10));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j10, byte b10) {
            if (zzmo.zza) {
                zzmo.zzc(obj, j10, b10);
            } else {
                zzmo.zzd(obj, j10, b10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j10, double d10) {
            zza(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j10, float f10) {
            zza(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j10, boolean z10) {
            if (zzmo.zza) {
                zzmo.zza(obj, j10, z10);
            } else {
                zzmo.zzb(obj, j10, z10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final float zzb(Object obj, long j10) {
            return Float.intBitsToFloat(zzd(obj, j10));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final boolean zzc(Object obj, long j10) {
            return zzmo.zza ? zzmo.zzf(obj, j10) : zzmo.zzg(obj, j10);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class zzc {
        public Unsafe zza;

        public zzc(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j10);

        public abstract void zza(Object obj, long j10, byte b10);

        public abstract void zza(Object obj, long j10, double d10);

        public abstract void zza(Object obj, long j10, float f10);

        public final void zza(Object obj, long j10, int i10) {
            this.zza.putInt(obj, j10, i10);
        }

        public final void zza(Object obj, long j10, long j11) {
            this.zza.putLong(obj, j10, j11);
        }

        public abstract void zza(Object obj, long j10, boolean z10);

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzmo.zza(th);
                return false;
            }
        }

        public abstract float zzb(Object obj, long j10);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzmo.zza() != null;
            } catch (Throwable th) {
                zzmo.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j10);

        public final int zzd(Object obj, long j10) {
            return this.zza.getInt(obj, j10);
        }

        public final long zze(Object obj, long j10) {
            return this.zza.getLong(obj, j10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            sun.misc.Unsafe r6 = zzb()
            com.google.android.gms.internal.measurement.zzmo.zzb = r6
            java.lang.Class r7 = com.google.android.gms.internal.measurement.zzhr.zza()
            com.google.android.gms.internal.measurement.zzmo.zzc = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = zzd(r7)
            com.google.android.gms.internal.measurement.zzmo.zzd = r7
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r8 = zzd(r8)
            com.google.android.gms.internal.measurement.zzmo.zze = r8
            if (r6 == 0) goto L3a
            if (r7 == 0) goto L32
            com.google.android.gms.internal.measurement.zzmo$zza r7 = new com.google.android.gms.internal.measurement.zzmo$zza
            r7.<init>(r6)
            goto L3b
        L32:
            if (r8 == 0) goto L3a
            com.google.android.gms.internal.measurement.zzmo$zzb r7 = new com.google.android.gms.internal.measurement.zzmo$zzb
            r7.<init>(r6)
            goto L3b
        L3a:
            r7 = 0
        L3b:
            com.google.android.gms.internal.measurement.zzmo.zzf = r7
            r6 = 0
            if (r7 != 0) goto L42
            r8 = r6
            goto L46
        L42:
            boolean r8 = r7.zzb()
        L46:
            com.google.android.gms.internal.measurement.zzmo.zzg = r8
            if (r7 != 0) goto L4c
            r8 = r6
            goto L50
        L4c:
            boolean r8 = r7.zza()
        L50:
            com.google.android.gms.internal.measurement.zzmo.zzh = r8
            java.lang.Class<byte[]> r8 = byte[].class
            int r8 = zzb(r8)
            long r8 = (long) r8
            com.google.android.gms.internal.measurement.zzmo.zzi = r8
            int r10 = zzb(r5)
            long r10 = (long) r10
            com.google.android.gms.internal.measurement.zzmo.zzj = r10
            int r5 = zzc(r5)
            long r10 = (long) r5
            com.google.android.gms.internal.measurement.zzmo.zzk = r10
            int r5 = zzb(r4)
            long r10 = (long) r5
            com.google.android.gms.internal.measurement.zzmo.zzl = r10
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.zzmo.zzm = r4
            int r4 = zzb(r3)
            long r4 = (long) r4
            com.google.android.gms.internal.measurement.zzmo.zzn = r4
            int r3 = zzc(r3)
            long r3 = (long) r3
            com.google.android.gms.internal.measurement.zzmo.zzo = r3
            int r3 = zzb(r2)
            long r3 = (long) r3
            com.google.android.gms.internal.measurement.zzmo.zzp = r3
            int r2 = zzc(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.measurement.zzmo.zzq = r2
            int r2 = zzb(r1)
            long r2 = (long) r2
            com.google.android.gms.internal.measurement.zzmo.zzr = r2
            int r1 = zzc(r1)
            long r1 = (long) r1
            com.google.android.gms.internal.measurement.zzmo.zzs = r1
            int r1 = zzb(r0)
            long r1 = (long) r1
            com.google.android.gms.internal.measurement.zzmo.zzt = r1
            int r0 = zzc(r0)
            long r0 = (long) r0
            com.google.android.gms.internal.measurement.zzmo.zzu = r0
            java.lang.reflect.Field r0 = zze()
            if (r0 == 0) goto Lbf
            if (r7 != 0) goto Lb8
            goto Lbf
        Lb8:
            sun.misc.Unsafe r1 = r7.zza
            long r0 = r1.objectFieldOffset(r0)
            goto Lc1
        Lbf:
            r0 = -1
        Lc1:
            com.google.android.gms.internal.measurement.zzmo.zzv = r0
            r0 = 7
            long r0 = r0 & r8
            int r0 = (int) r0
            com.google.android.gms.internal.measurement.zzmo.zzw = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Ld2
            r6 = 1
        Ld2:
            com.google.android.gms.internal.measurement.zzmo.zza = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmo.<clinit>():void");
    }

    private zzmo() {
    }

    public static double zza(Object obj, long j10) {
        return zzf.zza(obj, j10);
    }

    public static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static /* synthetic */ Field zza() {
        return zze();
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zza(Object obj, long j10, double d10) {
        zzf.zza(obj, j10, d10);
    }

    public static void zza(Object obj, long j10, float f10) {
        zzf.zza(obj, j10, f10);
    }

    public static void zza(Object obj, long j10, int i10) {
        zzf.zza(obj, j10, i10);
    }

    public static void zza(Object obj, long j10, long j11) {
        zzf.zza(obj, j10, j11);
    }

    public static void zza(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }

    public static /* synthetic */ void zza(Object obj, long j10, boolean z10) {
        zzc(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzmo.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    public static void zza(byte[] bArr, long j10, byte b10) {
        zzf.zza((Object) bArr, zzi + j10, b10);
    }

    public static float zzb(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmn());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zzb(Object obj, long j10, boolean z10) {
        zzd(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    public static int zzc(Object obj, long j10) {
        return zzf.zzd(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int zzc2 = zzc(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        zza(obj, j11, ((255 & b10) << i10) | (zzc2 & (~(255 << i10))));
    }

    public static void zzc(Object obj, long j10, boolean z10) {
        zzf.zza(obj, j10, z10);
    }

    public static boolean zzc() {
        return zzh;
    }

    public static long zzd(Object obj, long j10) {
        return zzf.zze(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        zza(obj, j11, ((255 & b10) << i10) | (zzc(obj, j11) & (~(255 << i10))));
    }

    public static boolean zzd() {
        return zzg;
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object zze(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    private static Field zze() {
        Field zza2 = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (zza2 != null) {
            return zza2;
        }
        Field zza3 = zza((Class<?>) Buffer.class, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    public static /* synthetic */ boolean zzf(Object obj, long j10) {
        return ((byte) (zzc(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3)))) != 0;
    }

    public static /* synthetic */ boolean zzg(Object obj, long j10) {
        return ((byte) (zzc(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3)))) != 0;
    }

    public static boolean zzh(Object obj, long j10) {
        return zzf.zzc(obj, j10);
    }
}
