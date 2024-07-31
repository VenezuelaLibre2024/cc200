package com.scottyab.rootbeer;

import mc.C3609a;

/* loaded from: classes2.dex */
public class RootBeerNative {

    /* renamed from: a */
    public static boolean f5383a = false;

    static {
        try {
            System.loadLibrary("toolChecker");
            f5383a = true;
        } catch (UnsatisfiedLinkError e10) {
            C3609a.m13357b(e10);
        }
    }

    /* renamed from: a */
    public boolean m6000a() {
        return f5383a;
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z10);
}
