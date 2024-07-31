package com.google.android.gms.internal.p377firebaseauthapi;

import p079f6.C1841a;

/* loaded from: classes.dex */
public class zzan<E> {
    public static int zza(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            i12 = Integer.highestOneBit(i11 - 1) << 1;
        }
        return i12 < 0 ? C1841a.e.API_PRIORITY_OTHER : i12;
    }
}
