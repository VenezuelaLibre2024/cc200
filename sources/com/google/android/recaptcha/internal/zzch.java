package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import p115hd.C2495i;
import p115hd.C2502n;
import td.C4753m;

/* loaded from: classes.dex */
public final class zzch extends zzce {
    private final zzcg zza;
    private final String zzb;

    public zzch(zzcg zzcgVar, String str, Object obj) {
        super(obj);
        this.zza = zzcgVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzce
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List m9989e;
        if (!C4753m.m18648a(method.getName(), this.zzb)) {
            return false;
        }
        zzcg zzcgVar = this.zza;
        if (objArr == null || (m9989e = C2495i.m9931b(objArr)) == null) {
            m9989e = C2502n.m9989e();
        }
        zzcgVar.zzb(m9989e);
        return true;
    }
}
