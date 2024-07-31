package p321w7;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.internal.p377firebaseauthapi.zzafm;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p195n7.C3767g;

/* renamed from: w7.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC5341a0 extends AbstractC2601a implements InterfaceC5346b1 {
    @Override // p321w7.InterfaceC5346b1
    /* renamed from: C */
    public abstract String mo21407C();

    /* renamed from: I */
    public Task<Void> m21408I() {
        return FirebaseAuth.getInstance(mo21430d0()).m5215P(this);
    }

    /* renamed from: J */
    public Task<C5349c0> m21409J(boolean z10) {
        return FirebaseAuth.getInstance(mo21430d0()).m5222W(this, z10);
    }

    /* renamed from: K */
    public abstract InterfaceC5345b0 mo21410K();

    /* renamed from: L */
    public abstract AbstractC5369h0 mo21411L();

    /* renamed from: M */
    public abstract List<? extends InterfaceC5346b1> mo21412M();

    /* renamed from: N */
    public abstract String mo21413N();

    /* renamed from: O */
    public abstract boolean mo21414O();

    /* renamed from: P */
    public Task<InterfaceC5372i> m21415P(AbstractC5368h abstractC5368h) {
        C2394s.m9619l(abstractC5368h);
        return FirebaseAuth.getInstance(mo21430d0()).m5217R(this, abstractC5368h);
    }

    /* renamed from: Q */
    public Task<InterfaceC5372i> m21416Q(AbstractC5368h abstractC5368h) {
        C2394s.m9619l(abstractC5368h);
        return FirebaseAuth.getInstance(mo21430d0()).m5258u0(this, abstractC5368h);
    }

    /* renamed from: R */
    public Task<Void> m21417R() {
        return FirebaseAuth.getInstance(mo21430d0()).m5245m0(this);
    }

    /* renamed from: S */
    public Task<Void> m21418S() {
        return FirebaseAuth.getInstance(mo21430d0()).m5222W(this, false).continueWithTask(new C5374i1(this));
    }

    /* renamed from: T */
    public Task<Void> m21419T(C5356e c5356e) {
        return FirebaseAuth.getInstance(mo21430d0()).m5222W(this, false).continueWithTask(new C5382k1(this, c5356e));
    }

    /* renamed from: U */
    public Task<InterfaceC5372i> m21420U(Activity activity, AbstractC5390n abstractC5390n) {
        C2394s.m9619l(activity);
        C2394s.m9619l(abstractC5390n);
        return FirebaseAuth.getInstance(mo21430d0()).m5209J(activity, abstractC5390n, this);
    }

    /* renamed from: V */
    public Task<InterfaceC5372i> m21421V(Activity activity, AbstractC5390n abstractC5390n) {
        C2394s.m9619l(activity);
        C2394s.m9619l(abstractC5390n);
        return FirebaseAuth.getInstance(mo21430d0()).m5243l0(activity, abstractC5390n, this);
    }

    /* renamed from: W */
    public Task<InterfaceC5372i> m21422W(String str) {
        C2394s.m9613f(str);
        return FirebaseAuth.getInstance(mo21430d0()).m5247n0(this, str);
    }

    @Deprecated
    /* renamed from: X */
    public Task<Void> m21423X(String str) {
        C2394s.m9613f(str);
        return FirebaseAuth.getInstance(mo21430d0()).m5256t0(this, str);
    }

    /* renamed from: Y */
    public Task<Void> m21424Y(String str) {
        C2394s.m9613f(str);
        return FirebaseAuth.getInstance(mo21430d0()).m5262w0(this, str);
    }

    /* renamed from: Z */
    public Task<Void> m21425Z(C5394o0 c5394o0) {
        return FirebaseAuth.getInstance(mo21430d0()).m5219T(this, c5394o0);
    }

    /* renamed from: a0 */
    public Task<Void> m21426a0(C5350c1 c5350c1) {
        C2394s.m9619l(c5350c1);
        return FirebaseAuth.getInstance(mo21430d0()).m5220U(this, c5350c1);
    }

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: b */
    public abstract String mo21427b();

    /* renamed from: b0 */
    public Task<Void> m21428b0(String str) {
        return m21429c0(str, null);
    }

    /* renamed from: c0 */
    public Task<Void> m21429c0(String str, C5356e c5356e) {
        return FirebaseAuth.getInstance(mo21430d0()).m5222W(this, false).continueWithTask(new C5378j1(this, str, c5356e));
    }

    /* renamed from: d0 */
    public abstract C3767g mo21430d0();

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: e */
    public abstract Uri mo21431e();

    /* renamed from: e0 */
    public abstract AbstractC5341a0 mo21432e0(List<? extends InterfaceC5346b1> list);

    /* renamed from: f0 */
    public abstract void mo21433f0(zzafm zzafmVar);

    /* renamed from: g0 */
    public abstract AbstractC5341a0 mo21434g0();

    /* renamed from: h0 */
    public abstract void mo21435h0(List<AbstractC5377j0> list);

    /* renamed from: i0 */
    public abstract zzafm mo21436i0();

    /* renamed from: j0 */
    public abstract List<String> mo21437j0();

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: m */
    public abstract String mo21438m();

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: s */
    public abstract String mo21439s();

    public abstract String zzd();

    public abstract String zze();
}
