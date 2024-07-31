package com.czt.mp3recorder.util;

/* loaded from: classes.dex */
public class LameUtil {
    static {
        System.loadLibrary("mp3lame");
    }

    public static native void close();

    public static native int encode(short[] sArr, short[] sArr2, int i10, byte[] bArr);

    public static native int flush(byte[] bArr);

    public static native void init(int i10, int i11, int i12, int i13, int i14);
}
