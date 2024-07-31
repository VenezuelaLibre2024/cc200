package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import p108h6.C2394s;
import p125i6.C2603c;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5368h;
import p321w7.C5428z1;
import p321w7.InterfaceC5364g;
import p321w7.InterfaceC5372i;

/* renamed from: x7.h2 */
/* loaded from: classes.dex */
public final class C5684h2 implements InterfaceC5372i {
    public static final Parcelable.Creator<C5684h2> CREATOR = new C5680g2();

    /* renamed from: h */
    public C5685i f21173h;

    /* renamed from: i */
    public C5676f2 f21174i;

    /* renamed from: j */
    public C5428z1 f21175j;

    public C5684h2(C5685i c5685i) {
        C5685i c5685i2 = (C5685i) C2394s.m9619l(c5685i);
        this.f21173h = c5685i2;
        List<C5669e> m22766q0 = c5685i2.m22766q0();
        this.f21174i = null;
        for (int i10 = 0; i10 < m22766q0.size(); i10++) {
            if (!TextUtils.isEmpty(m22766q0.get(i10).zza())) {
                this.f21174i = new C5676f2(m22766q0.get(i10).mo21443c(), m22766q0.get(i10).zza(), c5685i.m22767r0());
            }
        }
        if (this.f21174i == null) {
            this.f21174i = new C5676f2(c5685i.m22767r0());
        }
        this.f21175j = c5685i.m22765p0();
    }

    public C5684h2(C5685i c5685i, C5676f2 c5676f2, C5428z1 c5428z1) {
        this.f21173h = c5685i;
        this.f21174i = c5676f2;
        this.f21175j = c5428z1;
    }

    @Override // p321w7.InterfaceC5372i
    /* renamed from: B */
    public final AbstractC5341a0 mo21505B() {
        return this.f21173h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p321w7.InterfaceC5372i
    /* renamed from: v */
    public final InterfaceC5364g mo21506v() {
        return this.f21174i;
    }

    @Override // p321w7.InterfaceC5372i
    /* renamed from: w */
    public final AbstractC5368h mo21507w() {
        return this.f21175j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, mo21505B(), i10, false);
        C2603c.m10454D(parcel, 2, mo21506v(), i10, false);
        C2603c.m10454D(parcel, 3, this.f21175j, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
