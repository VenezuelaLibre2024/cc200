package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import gd.C2238l;
import gd.C2245s;
import java.util.List;
import p038ce.InterfaceC1085p0;
import p115hd.C2510v;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* loaded from: classes.dex */
final class zzbl extends AbstractC3478l implements InterfaceC4584p {
    public final /* synthetic */ zzbm zza;
    public final /* synthetic */ zzpd zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbl(zzbm zzbmVar, zzpd zzpdVar, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zza = zzbmVar;
        this.zzb = zzpdVar;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzbl(this.zza, this.zzb, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbl) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        zzaz zzazVar;
        C2245s c2245s;
        zzaz zzazVar2;
        zzaz zzazVar3;
        zzaz zzazVar4;
        zzaz zzazVar5;
        zzaz zzazVar6;
        C3385c.m12581c();
        C2238l.m8975b(obj);
        zzbm zzbmVar = this.zza;
        zzpd zzpdVar = this.zzb;
        synchronized (zzbh.class) {
            zzazVar = zzbmVar.zze;
            if (zzazVar != null) {
                byte[] zzd = zzpdVar.zzd();
                zzba zzbaVar = new zzba(zzfy.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                zzazVar2 = zzbmVar.zze;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ss", zzbaVar.zzc());
                contentValues.put("ts", Long.valueOf(zzbaVar.zzb()));
                zzazVar2.getWritableDatabase().insert("ce", null, contentValues);
                zzazVar3 = zzbmVar.zze;
                int zzb = zzazVar3.zzb() - 500;
                if (zzb > 0) {
                    zzazVar5 = zzbmVar.zze;
                    List m10004G = C2510v.m10004G(zzazVar5.zzd(), zzb);
                    zzazVar6 = zzbmVar.zze;
                    zzazVar6.zza(m10004G);
                }
                zzazVar4 = zzbmVar.zze;
                if (zzazVar4.zzb() >= 20) {
                    zzbmVar.zzg();
                }
            }
            c2245s = C2245s.f8873a;
        }
        return c2245s;
    }
}
