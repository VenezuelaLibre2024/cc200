package p367z6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.maps.zzao;
import com.google.android.gms.internal.maps.zzap;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: z6.c0 */
/* loaded from: classes.dex */
public final class C6001c0 extends AbstractC2601a {
    public static final Parcelable.Creator<C6001c0> CREATOR = new C6019l0();

    /* renamed from: h */
    public zzap f22390h;

    /* renamed from: i */
    public InterfaceC6003d0 f22391i;

    /* renamed from: j */
    public boolean f22392j;

    /* renamed from: k */
    public float f22393k;

    /* renamed from: l */
    public boolean f22394l;

    /* renamed from: m */
    public float f22395m;

    public C6001c0() {
        this.f22392j = true;
        this.f22394l = true;
        this.f22395m = 0.0f;
    }

    public C6001c0(IBinder iBinder, boolean z10, float f10, boolean z11, float f11) {
        this.f22392j = true;
        this.f22394l = true;
        this.f22395m = 0.0f;
        zzap zzc = zzao.zzc(iBinder);
        this.f22390h = zzc;
        this.f22391i = zzc == null ? null : new C6015j0(this);
        this.f22392j = z10;
        this.f22393k = f10;
        this.f22394l = z11;
        this.f22395m = f11;
    }

    /* renamed from: I */
    public C6001c0 m24085I(boolean z10) {
        this.f22394l = z10;
        return this;
    }

    /* renamed from: J */
    public boolean m24086J() {
        return this.f22394l;
    }

    /* renamed from: K */
    public float m24087K() {
        return this.f22395m;
    }

    /* renamed from: L */
    public float m24088L() {
        return this.f22393k;
    }

    /* renamed from: M */
    public boolean m24089M() {
        return this.f22392j;
    }

    /* renamed from: N */
    public C6001c0 m24090N(InterfaceC6003d0 interfaceC6003d0) {
        this.f22391i = (InterfaceC6003d0) C2394s.m9620m(interfaceC6003d0, "tileProvider must not be null.");
        this.f22390h = new BinderC6017k0(this, interfaceC6003d0);
        return this;
    }

    /* renamed from: O */
    public C6001c0 m24091O(float f10) {
        boolean z10 = false;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        C2394s.m9609b(z10, "Transparency must be in the range [0..1]");
        this.f22395m = f10;
        return this;
    }

    /* renamed from: P */
    public C6001c0 m24092P(boolean z10) {
        this.f22392j = z10;
        return this;
    }

    /* renamed from: Q */
    public C6001c0 m24093Q(float f10) {
        this.f22393k = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        zzap zzapVar = this.f22390h;
        C2603c.m10484t(parcel, 2, zzapVar == null ? null : zzapVar.asBinder(), false);
        C2603c.m10471g(parcel, 3, m24089M());
        C2603c.m10481q(parcel, 4, m24088L());
        C2603c.m10471g(parcel, 5, m24086J());
        C2603c.m10481q(parcel, 6, m24087K());
        C2603c.m10466b(parcel, m10465a);
    }
}
