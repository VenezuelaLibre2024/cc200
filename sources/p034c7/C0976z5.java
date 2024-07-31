package p034c7;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import java.util.List;

/* renamed from: c7.z5 */
/* loaded from: classes.dex */
public final class C0976z5 implements zzv {

    /* renamed from: a */
    public final /* synthetic */ C0906u5 f3839a;

    public C0976z5(C0906u5 c0906u5) {
        this.f3839a = c0906u5;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(zzs zzsVar, String str, List<String> list, boolean z10, boolean z11) {
        C0947x4 m3913A;
        int i10 = C0639b6.f2785a[zzsVar.ordinal()];
        if (i10 == 1) {
            m3913A = this.f3839a.zzj().m3913A();
        } else if (i10 == 2) {
            C0919v4 zzj = this.f3839a.zzj();
            m3913A = z10 ? zzj.m3916D() : !z11 ? zzj.m3915C() : zzj.m3914B();
        } else if (i10 != 3) {
            m3913A = i10 != 4 ? this.f3839a.zzj().m3917E() : this.f3839a.zzj().m3918F();
        } else {
            C0919v4 zzj2 = this.f3839a.zzj();
            m3913A = z10 ? zzj2.m3921I() : !z11 ? zzj2.m3920H() : zzj2.m3919G();
        }
        int size = list.size();
        if (size == 1) {
            m3913A.m3996b(str, list.get(0));
            return;
        }
        if (size == 2) {
            m3913A.m3997c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            m3913A.m3995a(str);
        } else {
            m3913A.m3998d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
