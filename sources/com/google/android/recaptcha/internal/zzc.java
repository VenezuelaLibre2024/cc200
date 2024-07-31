package com.google.android.recaptcha.internal;

import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p038ce.C1038f;
import p038ce.C1063k;
import p038ce.InterfaceC1085p0;
import p038ce.InterfaceC1117x0;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* loaded from: classes.dex */
public final class zzc extends AbstractC3478l implements InterfaceC4584p {
    public int zza;
    public final /* synthetic */ zzg zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zzg zzgVar, String str, long j10, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        zzc zzcVar = new zzc(this.zzb, this.zzc, this.zzd, interfaceC3281d);
        zzcVar.zze = obj;
        return zzcVar;
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzc) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        Object m4312a;
        InterfaceC1117x0 m4455b;
        Object m12581c = C3385c.m12581c();
        int i10 = this.zza;
        C2238l.m8975b(obj);
        if (i10 != 0) {
            m4312a = obj;
        } else {
            InterfaceC1085p0 interfaceC1085p0 = (InterfaceC1085p0) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                m4455b = C1063k.m4455b(interfaceC1085p0, null, null, new zzb((zza) it.next(), this.zzc, this.zzd, null), 3, null);
                arrayList.add(m4455b);
            }
            InterfaceC1117x0[] interfaceC1117x0Arr = (InterfaceC1117x0[]) arrayList.toArray(new InterfaceC1117x0[0]);
            InterfaceC1117x0[] interfaceC1117x0Arr2 = (InterfaceC1117x0[]) Arrays.copyOf(interfaceC1117x0Arr, interfaceC1117x0Arr.length);
            this.zza = 1;
            m4312a = C1038f.m4312a(interfaceC1117x0Arr2, this);
            if (m4312a == m12581c) {
                return m12581c;
            }
        }
        String str = this.zzc;
        zzof zzf = zzog.zzf();
        zzf.zzd(str);
        Iterator it2 = ((List) m4312a).iterator();
        while (it2.hasNext()) {
            Object m8973i = ((C2237k) it2.next()).m8973i();
            if (C2237k.m8971g(m8973i)) {
                zzf.zzg((zzog) m8973i);
            }
        }
        return (zzog) zzf.zzj();
    }
}
