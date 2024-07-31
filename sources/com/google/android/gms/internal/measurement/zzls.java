package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzls extends zzma {
    private final /* synthetic */ zzlo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzls(zzlo zzloVar) {
        super(zzloVar);
        this.zza = zzloVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzma, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzlq(this.zza);
    }
}
