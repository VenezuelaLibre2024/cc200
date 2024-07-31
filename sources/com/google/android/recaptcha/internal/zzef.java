package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import p115hd.C2497j;
import p115hd.C2502n;
import p115hd.C2510v;

/* loaded from: classes.dex */
public final class zzef {
    private List zza = C2502n.m9989e();

    public final long zza(long[] jArr) {
        Iterator it = C2510v.m9998A(this.zza, C2497j.m9953N(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = C2497j.m9953N(jArr);
    }
}
