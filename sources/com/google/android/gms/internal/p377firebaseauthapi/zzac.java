package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p079f6.C1841a;

/* loaded from: classes.dex */
public final class zzac {
    private final zzj zza;
    private final boolean zzb;
    private final zzai zzc;
    private final int zzd;

    private zzac(zzai zzaiVar) {
        this(zzaiVar, false, zzn.zza, C1841a.e.API_PRIORITY_OTHER);
    }

    private zzac(zzai zzaiVar, boolean z10, zzj zzjVar, int i10) {
        this.zzc = zzaiVar;
        this.zzb = false;
        this.zza = zzjVar;
        this.zzd = C1841a.e.API_PRIORITY_OTHER;
    }

    public static zzac zza(char c10) {
        zzl zzlVar = new zzl(c10);
        zzz.zza(zzlVar);
        return new zzac(new zzab(zzlVar));
    }

    public static zzac zza(String str) {
        zzs zza = zzy.zza(str);
        if (!zza.zza("").zzc()) {
            return new zzac(new zzad(zza));
        }
        throw new IllegalArgumentException(zzah.zza("The pattern may not match the empty string: %s", zza));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzz.zza(charSequence);
        Iterator<String> zza = this.zzc.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add(zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
