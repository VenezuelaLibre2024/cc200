package p337x7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p377firebaseauthapi.zzafm;
import com.google.android.gms.internal.p377firebaseauthapi.zzafp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p108h6.C2394s;
import p125i6.C2603c;
import p195n7.C3767g;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5369h0;
import p321w7.AbstractC5377j0;
import p321w7.C5349c0;
import p321w7.C5428z1;
import p321w7.InterfaceC5345b0;
import p321w7.InterfaceC5346b1;

/* renamed from: x7.i */
/* loaded from: classes.dex */
public class C5685i extends AbstractC5341a0 {
    public static final Parcelable.Creator<C5685i> CREATOR = new C5681h();

    /* renamed from: h */
    public zzafm f21176h;

    /* renamed from: i */
    public C5669e f21177i;

    /* renamed from: j */
    public String f21178j;

    /* renamed from: k */
    public String f21179k;

    /* renamed from: l */
    public List<C5669e> f21180l;

    /* renamed from: m */
    public List<String> f21181m;

    /* renamed from: n */
    public String f21182n;

    /* renamed from: o */
    public Boolean f21183o;

    /* renamed from: p */
    public C5691k f21184p;

    /* renamed from: q */
    public boolean f21185q;

    /* renamed from: r */
    public C5428z1 f21186r;

    /* renamed from: s */
    public C5701n0 f21187s;

    /* renamed from: t */
    public List<zzafp> f21188t;

    public C5685i(zzafm zzafmVar, C5669e c5669e, String str, String str2, List<C5669e> list, List<String> list2, String str3, Boolean bool, C5691k c5691k, boolean z10, C5428z1 c5428z1, C5701n0 c5701n0, List<zzafp> list3) {
        this.f21176h = zzafmVar;
        this.f21177i = c5669e;
        this.f21178j = str;
        this.f21179k = str2;
        this.f21180l = list;
        this.f21181m = list2;
        this.f21182n = str3;
        this.f21183o = bool;
        this.f21184p = c5691k;
        this.f21185q = z10;
        this.f21186r = c5428z1;
        this.f21187s = c5701n0;
        this.f21188t = list3;
    }

    public C5685i(C3767g c3767g, List<? extends InterfaceC5346b1> list) {
        C2394s.m9619l(c3767g);
        this.f21178j = c3767g.m14350q();
        this.f21179k = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f21182n = "2";
        mo21432e0(list);
    }

    @Override // p321w7.AbstractC5341a0, p321w7.InterfaceC5346b1
    /* renamed from: C */
    public String mo21407C() {
        return this.f21177i.mo21407C();
    }

    @Override // p321w7.AbstractC5341a0
    /* renamed from: K */
    public InterfaceC5345b0 mo21410K() {
        return this.f21184p;
    }

    @Override // p321w7.AbstractC5341a0
    /* renamed from: L */
    public /* synthetic */ AbstractC5369h0 mo21411L() {
        return new C5697m(this);
    }

    @Override // p321w7.AbstractC5341a0
    /* renamed from: M */
    public List<? extends InterfaceC5346b1> mo21412M() {
        return this.f21180l;
    }

    @Override // p321w7.AbstractC5341a0
    /* renamed from: N */
    public String mo21413N() {
        Map map;
        zzafm zzafmVar = this.f21176h;
        if (zzafmVar == null || zzafmVar.zzc() == null || (map = (Map) C5698m0.m22786a(this.f21176h.zzc()).m21446b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // p321w7.AbstractC5341a0
    /* renamed from: O */
    public boolean mo21414O() {
        C5349c0 m22786a;
        Boolean bool = this.f21183o;
        if (bool == null || bool.booleanValue()) {
            zzafm zzafmVar = this.f21176h;
            String str = "";
            if (zzafmVar != null && (m22786a = C5698m0.m22786a(zzafmVar.zzc())) != null) {
                str = m22786a.m21449e();
            }
            boolean z10 = true;
            if (mo21412M().size() > 1 || (str != null && str.equals("custom"))) {
                z10 = false;
            }
            this.f21183o = Boolean.valueOf(z10);
        }
        return this.f21183o.booleanValue();
    }

    @Override // p321w7.AbstractC5341a0, p321w7.InterfaceC5346b1
    /* renamed from: b */
    public String mo21427b() {
        return this.f21177i.mo21427b();
    }

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: c */
    public String mo21443c() {
        return this.f21177i.mo21443c();
    }

    @Override // p321w7.AbstractC5341a0
    /* renamed from: d0 */
    public final C3767g mo21430d0() {
        return C3767g.m14335p(this.f21178j);
    }

    @Override // p321w7.AbstractC5341a0, p321w7.InterfaceC5346b1
    /* renamed from: e */
    public Uri mo21431e() {
        return this.f21177i.mo21431e();
    }

    @Override // p321w7.AbstractC5341a0
    /* renamed from: e0 */
    public final synchronized AbstractC5341a0 mo21432e0(List<? extends InterfaceC5346b1> list) {
        C2394s.m9619l(list);
        this.f21180l = new ArrayList(list.size());
        this.f21181m = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC5346b1 interfaceC5346b1 = list.get(i10);
            if (interfaceC5346b1.mo21443c().equals("firebase")) {
                this.f21177i = (C5669e) interfaceC5346b1;
            } else {
                this.f21181m.add(interfaceC5346b1.mo21443c());
            }
            this.f21180l.add((C5669e) interfaceC5346b1);
        }
        if (this.f21177i == null) {
            this.f21177i = this.f21180l.get(0);
        }
        return this;
    }

    @Override // p321w7.AbstractC5341a0
    /* renamed from: f0 */
    public final void mo21433f0(zzafm zzafmVar) {
        this.f21176h = (zzafm) C2394s.m9619l(zzafmVar);
    }

    @Override // p321w7.AbstractC5341a0
    /* renamed from: g0 */
    public final /* synthetic */ AbstractC5341a0 mo21434g0() {
        this.f21183o = Boolean.FALSE;
        return this;
    }

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: h */
    public boolean mo21444h() {
        return this.f21177i.mo21444h();
    }

    @Override // p321w7.AbstractC5341a0
    /* renamed from: h0 */
    public final void mo21435h0(List<AbstractC5377j0> list) {
        this.f21187s = C5701n0.m22787J(list);
    }

    @Override // p321w7.AbstractC5341a0
    /* renamed from: i0 */
    public final zzafm mo21436i0() {
        return this.f21176h;
    }

    @Override // p321w7.AbstractC5341a0
    /* renamed from: j0 */
    public final List<String> mo21437j0() {
        return this.f21181m;
    }

    /* renamed from: k0 */
    public final C5685i m22760k0(String str) {
        this.f21182n = str;
        return this;
    }

    /* renamed from: l0 */
    public final void m22761l0(C5428z1 c5428z1) {
        this.f21186r = c5428z1;
    }

    @Override // p321w7.AbstractC5341a0, p321w7.InterfaceC5346b1
    /* renamed from: m */
    public String mo21438m() {
        return this.f21177i.mo21438m();
    }

    /* renamed from: m0 */
    public final void m22762m0(C5691k c5691k) {
        this.f21184p = c5691k;
    }

    /* renamed from: n0 */
    public final void m22763n0(boolean z10) {
        this.f21185q = z10;
    }

    /* renamed from: o0 */
    public final void m22764o0(List<zzafp> list) {
        C2394s.m9619l(list);
        this.f21188t = list;
    }

    /* renamed from: p0 */
    public final C5428z1 m22765p0() {
        return this.f21186r;
    }

    /* renamed from: q0 */
    public final List<C5669e> m22766q0() {
        return this.f21180l;
    }

    /* renamed from: r0 */
    public final boolean m22767r0() {
        return this.f21185q;
    }

    @Override // p321w7.AbstractC5341a0, p321w7.InterfaceC5346b1
    /* renamed from: s */
    public String mo21439s() {
        return this.f21177i.mo21439s();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, mo21436i0(), i10, false);
        C2603c.m10454D(parcel, 2, this.f21177i, i10, false);
        C2603c.m10456F(parcel, 3, this.f21178j, false);
        C2603c.m10456F(parcel, 4, this.f21179k, false);
        C2603c.m10460J(parcel, 5, this.f21180l, false);
        C2603c.m10458H(parcel, 6, mo21437j0(), false);
        C2603c.m10456F(parcel, 7, this.f21182n, false);
        C2603c.m10473i(parcel, 8, Boolean.valueOf(mo21414O()), false);
        C2603c.m10454D(parcel, 9, mo21410K(), i10, false);
        C2603c.m10471g(parcel, 10, this.f21185q);
        C2603c.m10454D(parcel, 11, this.f21186r, i10, false);
        C2603c.m10454D(parcel, 12, this.f21187s, i10, false);
        C2603c.m10460J(parcel, 13, this.f21188t, false);
        C2603c.m10466b(parcel, m10465a);
    }

    @Override // p321w7.AbstractC5341a0
    public final String zzd() {
        return mo21436i0().zzc();
    }

    @Override // p321w7.AbstractC5341a0
    public final String zze() {
        return this.f21176h.zzf();
    }

    public final List<AbstractC5377j0> zzh() {
        C5701n0 c5701n0 = this.f21187s;
        return c5701n0 != null ? c5701n0.m22788I() : new ArrayList();
    }
}
