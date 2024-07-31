package com.google.android.gms.internal.p377firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzajc {
    public static final byte[] zzb;
    private static final ByteBuffer zze;
    private static final zzaib zzf;
    private static final Charset zzc = Charset.forName("US-ASCII");
    public static final Charset zza = Charset.forName("UTF-8");
    private static final Charset zzd = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzaib.zza(bArr, 0, bArr.length, false);
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static int zza(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int zza2 = zza(length, bArr, 0, length);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    public static <T> T zza(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T zza(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static boolean zza(zzakk zzakkVar) {
        if (!(zzakkVar instanceof zzahe)) {
            return false;
        }
        return false;
    }

    public static String zzb(byte[] bArr) {
        return new String(bArr, zza);
    }

    public static boolean zzc(byte[] bArr) {
        return zzaml.zza(bArr);
    }
}
