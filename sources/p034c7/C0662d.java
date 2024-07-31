package p034c7;

import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzod;

/* renamed from: c7.d */
/* loaded from: classes.dex */
public final class C0662d extends AbstractC0661cd {

    /* renamed from: g */
    public zzew.zze f2852g;

    /* renamed from: h */
    public final /* synthetic */ C0955xc f2853h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0662d(C0955xc c0955xc, String str, int i10, zzew.zze zzeVar) {
        super(str, i10);
        this.f2853h = c0955xc;
        this.f2852g = zzeVar;
    }

    @Override // p034c7.AbstractC0661cd
    /* renamed from: a */
    public final int mo3085a() {
        return this.f2852g.zza();
    }

    @Override // p034c7.AbstractC0661cd
    /* renamed from: i */
    public final boolean mo3086i() {
        return false;
    }

    @Override // p034c7.AbstractC0661cd
    /* renamed from: j */
    public final boolean mo3087j() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final boolean m3135k(Long l10, Long l11, zzfi.zzn zznVar, boolean z10) {
        C0947x4 m3919G;
        String m3860g;
        String str;
        Boolean m3133g;
        byte b10 = zzod.zza() && this.f2853h.mo3092a().m3260A(this.f2846a, C0733i0.f3106h0);
        boolean zzf = this.f2852g.zzf();
        boolean zzg = this.f2852g.zzg();
        boolean zzh = this.f2852g.zzh();
        byte b11 = zzf || zzg || zzh;
        Boolean bool = null;
        bool = null;
        if (z10 && b11 != true) {
            this.f2853h.zzj().m3918F().m3997c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f2847b), this.f2852g.zzi() ? Integer.valueOf(this.f2852g.zza()) : null);
            return true;
        }
        zzew.zzc zzb = this.f2852g.zzb();
        boolean zzf2 = zzb.zzf();
        if (zznVar.zzk()) {
            if (zzb.zzh()) {
                m3133g = AbstractC0661cd.m3129c(zznVar.zzc(), zzb.zzc());
                bool = AbstractC0661cd.m3130d(m3133g, zzf2);
            } else {
                m3919G = this.f2853h.zzj().m3919G();
                m3860g = this.f2853h.mo3094d().m3860g(zznVar.zzg());
                str = "No number filter for long property. property";
                m3919G.m3996b(str, m3860g);
            }
        } else if (!zznVar.zzi()) {
            if (zznVar.zzm()) {
                if (zzb.zzj()) {
                    m3133g = AbstractC0661cd.m3133g(zznVar.zzh(), zzb.zzd(), this.f2853h.zzj());
                } else if (!zzb.zzh()) {
                    m3919G = this.f2853h.zzj().m3919G();
                    m3860g = this.f2853h.mo3094d().m3860g(zznVar.zzg());
                    str = "No string or number filter defined. property";
                } else if (C0745ic.m3449d0(zznVar.zzh())) {
                    m3133g = AbstractC0661cd.m3131e(zznVar.zzh(), zzb.zzc());
                } else {
                    this.f2853h.zzj().m3919G().m3997c("Invalid user property value for Numeric number filter. property, value", this.f2853h.mo3094d().m3860g(zznVar.zzg()), zznVar.zzh());
                }
                bool = AbstractC0661cd.m3130d(m3133g, zzf2);
            } else {
                m3919G = this.f2853h.zzj().m3919G();
                m3860g = this.f2853h.mo3094d().m3860g(zznVar.zzg());
                str = "User property has no value, property";
            }
            m3919G.m3996b(str, m3860g);
        } else if (zzb.zzh()) {
            m3133g = AbstractC0661cd.m3128b(zznVar.zza(), zzb.zzc());
            bool = AbstractC0661cd.m3130d(m3133g, zzf2);
        } else {
            m3919G = this.f2853h.zzj().m3919G();
            m3860g = this.f2853h.mo3094d().m3860g(zznVar.zzg());
            str = "No number filter for double property. property";
            m3919G.m3996b(str, m3860g);
        }
        this.f2853h.zzj().m3918F().m3996b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f2848c = Boolean.TRUE;
        if (zzh && !bool.booleanValue()) {
            return true;
        }
        if (!z10 || this.f2852g.zzf()) {
            this.f2849d = bool;
        }
        if (bool.booleanValue() && b11 != false && zznVar.zzl()) {
            long zzd = zznVar.zzd();
            if (l10 != null) {
                zzd = l10.longValue();
            }
            if (b10 != false && this.f2852g.zzf() && !this.f2852g.zzg() && l11 != null) {
                zzd = l11.longValue();
            }
            if (this.f2852g.zzg()) {
                this.f2851f = Long.valueOf(zzd);
            } else {
                this.f2850e = Long.valueOf(zzd);
            }
        }
        return true;
    }
}
