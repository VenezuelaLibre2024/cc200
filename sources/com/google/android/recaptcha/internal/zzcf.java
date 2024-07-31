package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import p115hd.C2502n;
import sd.InterfaceC4584p;
import td.C4753m;

/* loaded from: classes.dex */
public final class zzcf extends zzce {
    private final InterfaceC4584p zza;
    private final String zzb;

    public zzcf(InterfaceC4584p interfaceC4584p, String str, Object obj) {
        super(obj);
        this.zza = interfaceC4584p;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzce
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        Collection m9989e;
        if (!C4753m.m18648a(method.getName(), this.zzb)) {
            return false;
        }
        zzpi zzf = zzpl.zzf();
        if (objArr != null) {
            m9989e = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzpj zzf2 = zzpk.zzf();
                zzf2.zzv(obj2.toString());
                m9989e.add((zzpk) zzf2.zzj());
            }
        } else {
            m9989e = C2502n.m9989e();
        }
        zzf.zzd(m9989e);
        zzpl zzplVar = (zzpl) zzf.zzj();
        InterfaceC4584p interfaceC4584p = this.zza;
        byte[] zzd = zzplVar.zzd();
        interfaceC4584p.invoke(objArr, zzfy.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
