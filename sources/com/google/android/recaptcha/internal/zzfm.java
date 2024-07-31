package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class zzfm implements Iterable {
    private final zzfe zza = zzfe.zza();

    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z10 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }
}
