package p034c7;

import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzod;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p285u.C4771a;

/* renamed from: c7.zc */
/* loaded from: classes.dex */
public final class C0983zc {

    /* renamed from: a */
    public String f3855a;

    /* renamed from: b */
    public boolean f3856b;

    /* renamed from: c */
    public zzfi.zzl f3857c;

    /* renamed from: d */
    public BitSet f3858d;

    /* renamed from: e */
    public BitSet f3859e;

    /* renamed from: f */
    public Map<Integer, Long> f3860f;

    /* renamed from: g */
    public Map<Integer, List<Long>> f3861g;

    /* renamed from: h */
    public final /* synthetic */ C0955xc f3862h;

    public C0983zc(C0955xc c0955xc, String str) {
        this.f3862h = c0955xc;
        this.f3855a = str;
        this.f3856b = true;
        this.f3858d = new BitSet();
        this.f3859e = new BitSet();
        this.f3860f = new C4771a();
        this.f3861g = new C4771a();
    }

    public C0983zc(C0955xc c0955xc, String str, zzfi.zzl zzlVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f3862h = c0955xc;
        this.f3855a = str;
        this.f3858d = bitSet;
        this.f3859e = bitSet2;
        this.f3860f = map;
        this.f3861g = new C4771a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.f3861g.put(num, arrayList);
            }
        }
        this.f3856b = false;
        this.f3857c = zzlVar;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ BitSet m4139b(C0983zc c0983zc) {
        return c0983zc.f3858d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzfi$zzc$zza, com.google.android.gms.internal.measurement.zzjf$zzb] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.measurement.zzfi$zzl$zza] */
    /* renamed from: a */
    public final zzfi.zzc m4140a(int i10) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? zzb = zzfi.zzc.zzb();
        zzb.zza(i10);
        zzb.zza(this.f3856b);
        zzfi.zzl zzlVar = this.f3857c;
        if (zzlVar != null) {
            zzb.zza(zzlVar);
        }
        ?? zzd = zzfi.zzl.zze().zzb(C0745ic.m3437J(this.f3858d)).zzd(C0745ic.m3437J(this.f3859e));
        if (this.f3860f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f3860f.size());
            Iterator<Integer> it = this.f3860f.keySet().iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                Long l10 = this.f3860f.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    arrayList.add((zzfi.zzd) ((zzjf) zzfi.zzd.zzc().zza(intValue).zza(l10.longValue()).zzah()));
                }
            }
        }
        if (arrayList != null) {
            zzd.zza(arrayList);
        }
        if (this.f3861g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f3861g.size());
            for (Integer num : this.f3861g.keySet()) {
                zzfi.zzm.zza zza = zzfi.zzm.zzc().zza(num.intValue());
                List<Long> list = this.f3861g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    zza.zza(list);
                }
                arrayList2.add((zzfi.zzm) ((zzjf) zza.zzah()));
            }
        }
        zzd.zzc(arrayList2);
        zzb.zza(zzd);
        return (zzfi.zzc) ((zzjf) zzb.zzah());
    }

    /* renamed from: c */
    public final void m4141c(AbstractC0661cd abstractC0661cd) {
        int mo3085a = abstractC0661cd.mo3085a();
        Boolean bool = abstractC0661cd.f2848c;
        if (bool != null) {
            this.f3859e.set(mo3085a, bool.booleanValue());
        }
        Boolean bool2 = abstractC0661cd.f2849d;
        if (bool2 != null) {
            this.f3858d.set(mo3085a, bool2.booleanValue());
        }
        if (abstractC0661cd.f2850e != null) {
            Long l10 = this.f3860f.get(Integer.valueOf(mo3085a));
            long longValue = abstractC0661cd.f2850e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f3860f.put(Integer.valueOf(mo3085a), Long.valueOf(longValue));
            }
        }
        if (abstractC0661cd.f2851f != null) {
            List<Long> list = this.f3861g.get(Integer.valueOf(mo3085a));
            if (list == null) {
                list = new ArrayList<>();
                this.f3861g.put(Integer.valueOf(mo3085a), list);
            }
            if (abstractC0661cd.mo3087j()) {
                list.clear();
            }
            if (zzod.zza() && this.f3862h.mo3092a().m3260A(this.f3855a, C0733i0.f3110j0) && abstractC0661cd.mo3086i()) {
                list.clear();
            }
            if (!zzod.zza() || !this.f3862h.mo3092a().m3260A(this.f3855a, C0733i0.f3110j0)) {
                list.add(Long.valueOf(abstractC0661cd.f2851f.longValue() / 1000));
                return;
            }
            long longValue2 = abstractC0661cd.f2851f.longValue() / 1000;
            if (list.contains(Long.valueOf(longValue2))) {
                return;
            }
            list.add(Long.valueOf(longValue2));
        }
    }
}
