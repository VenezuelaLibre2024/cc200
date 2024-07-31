package p034c7;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzpt;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p108h6.C2394s;

/* renamed from: c7.o9 */
/* loaded from: classes.dex */
public final class C0826o9 extends AbstractC0954xb {
    public C0826o9(C0968yb c0968yb) {
        super(c0968yb);
    }

    /* renamed from: b */
    public static String m3685b(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // p034c7.AbstractC0954xb
    /* renamed from: s */
    public final boolean mo3126s() {
        return false;
    }

    /* renamed from: t */
    public final byte[] m3686t(C0705g0 c0705g0, String str) {
        C0815nc c0815nc;
        zzfi.zzj.zza zzaVar;
        Bundle bundle;
        C0710g5 c0710g5;
        zzfi.zzi.zza zzaVar2;
        byte[] bArr;
        long j10;
        C0648c0 m3115a;
        mo3099i();
        this.f3198a.m3496L();
        C2394s.m9619l(c0705g0);
        C2394s.m9613f(str);
        if (!mo3092a().m3291y(str, C0733i0.f3102f0)) {
            zzj().m3913A().m3996b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(c0705g0.f2943h) && !"_iapx".equals(c0705g0.f2943h)) {
            zzj().m3913A().m3997c("Generating a payload for this event is not available. package_name, event_name", str, c0705g0.f2943h);
            return null;
        }
        zzfi.zzi.zza zzb = zzfi.zzi.zzb();
        mo3122l().m3564L0();
        try {
            C0710g5 m3604y0 = mo3122l().m3604y0(str);
            if (m3604y0 == null) {
                zzj().m3913A().m3996b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!m3604y0.m3231s()) {
                zzj().m3913A().m3996b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            zzfi.zzj.zza zzp = zzfi.zzj.zzu().zzg(1).zzp("android");
            if (!TextUtils.isEmpty(m3604y0.m3238v0())) {
                zzp.zzb(m3604y0.m3238v0());
            }
            if (!TextUtils.isEmpty(m3604y0.m3242x0())) {
                zzp.zzd((String) C2394s.m9619l(m3604y0.m3242x0()));
            }
            if (!TextUtils.isEmpty(m3604y0.m3209h())) {
                zzp.zze((String) C2394s.m9619l(m3604y0.m3209h()));
            }
            if (m3604y0.m3169A() != -2147483648L) {
                zzp.zze((int) m3604y0.m3169A());
            }
            zzp.zzf(m3604y0.m3212i0()).zzd(m3604y0.m3204e0());
            String m3213j = m3604y0.m3213j();
            String m3234t0 = m3604y0.m3234t0();
            if (!TextUtils.isEmpty(m3213j)) {
                zzp.zzm(m3213j);
            } else if (!TextUtils.isEmpty(m3234t0)) {
                zzp.zza(m3234t0);
            }
            zzp.zzj(m3604y0.m3230r0());
            C0810n7 m4066M = this.f3647b.m4066M(str);
            zzp.zzc(m3604y0.m3200c0());
            if (this.f3198a.m3503k() && mo3092a().m3264F(zzp.zzt()) && m4066M.m3643x() && !TextUtils.isEmpty(null)) {
                zzp.zzj((String) null);
            }
            zzp.zzg(m4066M.m3641v());
            if (m4066M.m3643x() && m3604y0.m3229r()) {
                Pair<String, Boolean> m4000u = mo3124n().m4000u(m3604y0.m3238v0(), m4066M);
                if (m3604y0.m3229r() && m4000u != null && !TextUtils.isEmpty((CharSequence) m4000u.first)) {
                    zzp.zzq(m3685b((String) m4000u.first, Long.toString(c0705g0.f2946k)));
                    Object obj = m4000u.second;
                    if (obj != null) {
                        zzp.zzc(((Boolean) obj).booleanValue());
                    }
                }
            }
            mo3093c().m3430k();
            zzfi.zzj.zza zzi = zzp.zzi(Build.MODEL);
            mo3093c().m3430k();
            zzi.zzo(Build.VERSION.RELEASE).zzi((int) mo3093c().m4120q()).zzs(mo3093c().m4121r());
            if (m4066M.m3644y() && m3604y0.m3240w0() != null) {
                zzp.zzc(m3685b((String) C2394s.m9619l(m3604y0.m3240w0()), Long.toString(c0705g0.f2946k)));
            }
            if (!TextUtils.isEmpty(m3604y0.m3211i())) {
                zzp.zzl((String) C2394s.m9619l(m3604y0.m3211i()));
            }
            String m3238v0 = m3604y0.m3238v0();
            List<C0815nc> m3556H0 = mo3122l().m3556H0(m3238v0);
            Iterator<C0815nc> it = m3556H0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c0815nc = null;
                    break;
                }
                c0815nc = it.next();
                if ("_lte".equals(c0815nc.f3379c)) {
                    break;
                }
            }
            if (c0815nc == null || c0815nc.f3381e == null) {
                C0815nc c0815nc2 = new C0815nc(m3238v0, "auto", "_lte", zzb().mo14932a(), 0L);
                m3556H0.add(c0815nc2);
                mo3122l().m3582Y(c0815nc2);
            }
            zzfi.zzn[] zznVarArr = new zzfi.zzn[m3556H0.size()];
            for (int i10 = 0; i10 < m3556H0.size(); i10++) {
                zzfi.zzn.zza zzb2 = zzfi.zzn.zze().zza(m3556H0.get(i10).f3379c).zzb(m3556H0.get(i10).f3380d);
                mo3120j().m3463R(zzb2, m3556H0.get(i10).f3381e);
                zznVarArr[i10] = (zzfi.zzn) ((zzjf) zzb2.zzah());
            }
            zzp.zze(Arrays.asList(zznVarArr));
            mo3120j().m3462Q(zzp);
            if (zzns.zza() && mo3092a().m3281o(C0733i0.f3070Q0)) {
                this.f3647b.m4102n(m3604y0, zzp);
            }
            C0975z4 m4124b = C0975z4.m4124b(c0705g0);
            mo3096f().m3774I(m4124b.f3838d, mo3122l().m3598v0(str));
            mo3096f().m3777K(m4124b, mo3092a().m3282p(str));
            Bundle bundle2 = m4124b.f3838d;
            bundle2.putLong("_c", 1L);
            zzj().m3913A().m3995a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", c0705g0.f2945j);
            if (mo3096f().m3765A0(zzp.zzt())) {
                mo3096f().m3776J(bundle2, "_dbg", 1L);
                mo3096f().m3776J(bundle2, "_r", 1L);
            }
            C0648c0 m3602x0 = mo3122l().m3602x0(str, c0705g0.f2943h);
            if (m3602x0 == null) {
                zzaVar = zzp;
                bundle = bundle2;
                c0710g5 = m3604y0;
                zzaVar2 = zzb;
                bArr = null;
                m3115a = new C0648c0(str, c0705g0.f2943h, 0L, 0L, c0705g0.f2946k, 0L, null, null, null, null);
                j10 = 0;
            } else {
                zzaVar = zzp;
                bundle = bundle2;
                c0710g5 = m3604y0;
                zzaVar2 = zzb;
                bArr = null;
                j10 = m3602x0.f2813f;
                m3115a = m3602x0.m3115a(c0705g0.f2946k);
            }
            mo3122l().m3570P(m3115a);
            C0956y c0956y = new C0956y(this.f3198a, c0705g0.f2945j, str, c0705g0.f2943h, c0705g0.f2946k, j10, bundle);
            zzfi.zze.zza zza = zzfi.zze.zze().zzb(c0956y.f3755d).zza(c0956y.f3753b).zza(c0956y.f3756e);
            Iterator<String> it2 = c0956y.f3757f.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                zzfi.zzg.zza zza2 = zzfi.zzg.zze().zza(next);
                Object m3081N = c0956y.f3757f.m3081N(next);
                if (m3081N != null) {
                    mo3120j().m3461P(zza2, m3081N);
                    zza.zza(zza2);
                }
            }
            zzfi.zzj.zza zzaVar3 = zzaVar;
            zzaVar3.zza(zza).zza(zzfi.zzk.zza().zza(zzfi.zzf.zza().zza(m3115a.f2810c).zza(c0705g0.f2943h)));
            zzaVar3.zza(mo3121k().m4006u(c0710g5.m3238v0(), Collections.emptyList(), zzaVar3.zzab(), Long.valueOf(zza.zzc()), Long.valueOf(zza.zzc())));
            if (zza.zzg()) {
                zzaVar3.zzi(zza.zzc()).zze(zza.zzc());
            }
            long m3216k0 = c0710g5.m3216k0();
            if (m3216k0 != 0) {
                zzaVar3.zzg(m3216k0);
            }
            long m3224o0 = c0710g5.m3224o0();
            if (m3224o0 != 0) {
                zzaVar3.zzh(m3224o0);
            } else if (m3216k0 != 0) {
                zzaVar3.zzh(m3216k0);
            }
            String m3219m = c0710g5.m3219m();
            if (zzpt.zza() && mo3092a().m3291y(str, C0733i0.f3130t0) && m3219m != null) {
                zzaVar3.zzr(m3219m);
            }
            c0710g5.m3227q();
            zzaVar3.zzf((int) c0710g5.m3220m0()).zzl(84002L).zzk(zzb().mo14932a()).zzd(true);
            if (mo3092a().m3281o(C0733i0.f3140y0)) {
                this.f3647b.m4054A(zzaVar3.zzt(), zzaVar3);
            }
            zzfi.zzi.zza zzaVar4 = zzaVar2;
            zzaVar4.zza(zzaVar3);
            C0710g5 c0710g52 = c0710g5;
            c0710g52.m3218l0(zzaVar3.zzf());
            c0710g52.m3210h0(zzaVar3.zze());
            mo3122l().m3572Q(c0710g52);
            mo3122l().m3569O0();
            try {
                return mo3120j().m3467e0(((zzfi.zzi) ((zzjf) zzaVar4.zzah())).zzbv());
            } catch (IOException e10) {
                zzj().m3914B().m3997c("Data loss. Failed to bundle and serialize. appId", C0919v4.m3906q(str), e10);
                return bArr;
            }
        } catch (SecurityException e11) {
            zzj().m3913A().m3996b("Resettable device id encryption failed", e11.getMessage());
            return new byte[0];
        } catch (SecurityException e12) {
            zzj().m3913A().m3996b("app instance id encryption failed", e12.getMessage());
            return new byte[0];
        } finally {
            mo3122l().m3566M0();
        }
    }
}
