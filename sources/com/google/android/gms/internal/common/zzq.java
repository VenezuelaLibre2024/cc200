package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes.dex */
public final class zzq {
    public static final CharSequence zza(Object obj, String str) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
