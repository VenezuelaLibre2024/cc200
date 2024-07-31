package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p207o6.C3946o;

/* loaded from: classes.dex */
public final class zzagn {
    private final int zza;
    private List<String> zzb;

    public zzagn() {
        this(null);
    }

    public zzagn(int i10, List<String> list) {
        List<String> emptyList;
        this.zza = 1;
        if (list == null || list.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.set(i11, C3946o.m14965a(list.get(i11)));
            }
            emptyList = Collections.unmodifiableList(list);
        }
        this.zzb = emptyList;
    }

    private zzagn(List<String> list) {
        this.zza = 1;
        this.zzb = new ArrayList();
    }

    public static zzagn zza() {
        return new zzagn(null);
    }

    public final List<String> zzb() {
        return this.zzb;
    }
}
