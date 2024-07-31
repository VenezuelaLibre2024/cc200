package com.arthenica.ffmpegkit;

import p233q2.C4151u;

/* loaded from: classes.dex */
public class AbiDetect {

    /* renamed from: a */
    public static boolean f4105a = false;

    static {
        C4151u.m15988h();
    }

    /* renamed from: a */
    public static String m4615a() {
        return f4105a ? "arm-v7a-neon" : getNativeAbi();
    }

    /* renamed from: b */
    public static void m4616b() {
        f4105a = true;
    }

    public static native String getNativeAbi();

    public static native String getNativeBuildConf();

    public static native String getNativeCpuAbi();

    public static native boolean isNativeLTSBuild();
}
