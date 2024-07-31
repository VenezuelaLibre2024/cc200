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
import td.C4763w;

/* loaded from: classes.dex */
public final class zzf extends AbstractC3478l implements InterfaceC4584p {
    public int zza;
    public final /* synthetic */ zzg zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzoe zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzg zzgVar, long j10, zzoe zzoeVar, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zzb = zzgVar;
        this.zzc = j10;
        this.zzd = zzoeVar;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, interfaceC3281d);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        Object m4312a;
        C4763w c4763w;
        InterfaceC1117x0 m4455b;
        Object obj2;
        Object m12581c = C3385c.m12581c();
        if (this.zza != 0) {
            c4763w = (C4763w) this.zze;
            C2238l.m8975b(obj);
            m4312a = obj;
        } else {
            C2238l.m8975b(obj);
            InterfaceC1085p0 interfaceC1085p0 = (InterfaceC1085p0) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                m4455b = C1063k.m4455b(interfaceC1085p0, null, null, new zze((zza) it.next(), this.zzc, this.zzd, null), 3, null);
                arrayList.add(m4455b);
            }
            C4763w c4763w2 = new C4763w();
            InterfaceC1117x0[] interfaceC1117x0Arr = (InterfaceC1117x0[]) arrayList.toArray(new InterfaceC1117x0[0]);
            InterfaceC1117x0[] interfaceC1117x0Arr2 = (InterfaceC1117x0[]) Arrays.copyOf(interfaceC1117x0Arr, interfaceC1117x0Arr.length);
            this.zze = c4763w2;
            this.zza = 1;
            m4312a = C1038f.m4312a(interfaceC1117x0Arr2, this);
            if (m4312a == m12581c) {
                return m12581c;
            }
            c4763w = c4763w2;
        }
        Iterator it2 = ((List) m4312a).iterator();
        while (it2.hasNext()) {
            Throwable m8968d = C2237k.m8968d(((C2237k) it2.next()).m8973i());
            if (m8968d != null) {
                T t10 = 0;
                if (c4763w.f17731h != 0) {
                    t10 = new zzp(zzn.zzc, zzl.zzal, null);
                } else if (m8968d instanceof zzp) {
                    t10 = (zzp) m8968d;
                }
                c4763w.f17731h = t10;
            }
        }
        zzp zzpVar = (zzp) c4763w.f17731h;
        if (zzpVar != null) {
            C2237k.a aVar = C2237k.f8865i;
            obj2 = C2238l.m8974a(zzpVar);
        } else {
            C2237k.a aVar2 = C2237k.f8865i;
            obj2 = C2245s.f8873a;
        }
        return C2237k.m8965a(C2237k.m8966b(obj2));
    }
}
