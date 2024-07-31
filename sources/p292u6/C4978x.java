package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: u6.x */
/* loaded from: classes.dex */
public class C4978x extends AbstractC4910c0 {
    public static final Parcelable.Creator<C4978x> CREATOR = new C4979x0();

    /* renamed from: h */
    public final byte[] f18654h;

    /* renamed from: i */
    public final Double f18655i;

    /* renamed from: j */
    public final String f18656j;

    /* renamed from: k */
    public final List f18657k;

    /* renamed from: l */
    public final Integer f18658l;

    /* renamed from: m */
    public final C4918e0 f18659m;

    /* renamed from: n */
    public final EnumC4931h1 f18660n;

    /* renamed from: o */
    public final C4913d f18661o;

    /* renamed from: p */
    public final Long f18662p;

    public C4978x(byte[] bArr, Double d10, String str, List list, Integer num, C4918e0 c4918e0, String str2, C4913d c4913d, Long l10) {
        this.f18654h = (byte[]) C2394s.m9619l(bArr);
        this.f18655i = d10;
        this.f18656j = (String) C2394s.m9619l(str);
        this.f18657k = list;
        this.f18658l = num;
        this.f18659m = c4918e0;
        this.f18662p = l10;
        if (str2 != null) {
            try {
                this.f18660n = EnumC4931h1.m19496b(str2);
            } catch (C4927g1 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f18660n = null;
        }
        this.f18661o = c4913d;
    }

    /* renamed from: I */
    public List<C4972v> m19539I() {
        return this.f18657k;
    }

    /* renamed from: J */
    public C4913d m19540J() {
        return this.f18661o;
    }

    /* renamed from: K */
    public byte[] m19541K() {
        return this.f18654h;
    }

    /* renamed from: L */
    public Integer m19542L() {
        return this.f18658l;
    }

    /* renamed from: M */
    public String m19543M() {
        return this.f18656j;
    }

    /* renamed from: N */
    public Double m19544N() {
        return this.f18655i;
    }

    /* renamed from: O */
    public C4918e0 m19545O() {
        return this.f18659m;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof C4978x)) {
            return false;
        }
        C4978x c4978x = (C4978x) obj;
        return Arrays.equals(this.f18654h, c4978x.f18654h) && C2388q.m9592b(this.f18655i, c4978x.f18655i) && C2388q.m9592b(this.f18656j, c4978x.f18656j) && (((list = this.f18657k) == null && c4978x.f18657k == null) || (list != null && (list2 = c4978x.f18657k) != null && list.containsAll(list2) && c4978x.f18657k.containsAll(this.f18657k))) && C2388q.m9592b(this.f18658l, c4978x.f18658l) && C2388q.m9592b(this.f18659m, c4978x.f18659m) && C2388q.m9592b(this.f18660n, c4978x.f18660n) && C2388q.m9592b(this.f18661o, c4978x.f18661o) && C2388q.m9592b(this.f18662p, c4978x.f18662p);
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(Arrays.hashCode(this.f18654h)), this.f18655i, this.f18656j, this.f18657k, this.f18658l, this.f18659m, this.f18660n, this.f18661o, this.f18662p);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10476l(parcel, 2, m19541K(), false);
        C2603c.m10480p(parcel, 3, m19544N(), false);
        C2603c.m10456F(parcel, 4, m19543M(), false);
        C2603c.m10460J(parcel, 5, m19539I(), false);
        C2603c.m10487w(parcel, 6, m19542L(), false);
        C2603c.m10454D(parcel, 7, m19545O(), i10, false);
        EnumC4931h1 enumC4931h1 = this.f18660n;
        C2603c.m10456F(parcel, 8, enumC4931h1 == null ? null : enumC4931h1.toString(), false);
        C2603c.m10454D(parcel, 9, m19540J(), i10, false);
        C2603c.m10451A(parcel, 10, this.f18662p, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
