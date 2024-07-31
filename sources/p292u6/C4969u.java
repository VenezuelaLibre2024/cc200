package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.C2603c;
import p292u6.EnumC4909c;

/* renamed from: u6.u */
/* loaded from: classes.dex */
public class C4969u extends AbstractC4910c0 {
    public static final Parcelable.Creator<C4969u> CREATOR = new C4967t0();

    /* renamed from: h */
    public final C4981y f18637h;

    /* renamed from: i */
    public final C4902a0 f18638i;

    /* renamed from: j */
    public final byte[] f18639j;

    /* renamed from: k */
    public final List f18640k;

    /* renamed from: l */
    public final Double f18641l;

    /* renamed from: m */
    public final List f18642m;

    /* renamed from: n */
    public final C4939k f18643n;

    /* renamed from: o */
    public final Integer f18644o;

    /* renamed from: p */
    public final C4918e0 f18645p;

    /* renamed from: q */
    public final EnumC4909c f18646q;

    /* renamed from: r */
    public final C4913d f18647r;

    public C4969u(C4981y c4981y, C4902a0 c4902a0, byte[] bArr, List list, Double d10, List list2, C4939k c4939k, Integer num, C4918e0 c4918e0, String str, C4913d c4913d) {
        this.f18637h = (C4981y) C2394s.m9619l(c4981y);
        this.f18638i = (C4902a0) C2394s.m9619l(c4902a0);
        this.f18639j = (byte[]) C2394s.m9619l(bArr);
        this.f18640k = (List) C2394s.m9619l(list);
        this.f18641l = d10;
        this.f18642m = list2;
        this.f18643n = c4939k;
        this.f18644o = num;
        this.f18645p = c4918e0;
        if (str != null) {
            try {
                this.f18646q = EnumC4909c.m19472b(str);
            } catch (EnumC4909c.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f18646q = null;
        }
        this.f18647r = c4913d;
    }

    /* renamed from: I */
    public String m19523I() {
        EnumC4909c enumC4909c = this.f18646q;
        if (enumC4909c == null) {
            return null;
        }
        return enumC4909c.toString();
    }

    /* renamed from: J */
    public C4913d m19524J() {
        return this.f18647r;
    }

    /* renamed from: K */
    public C4939k m19525K() {
        return this.f18643n;
    }

    /* renamed from: L */
    public byte[] m19526L() {
        return this.f18639j;
    }

    /* renamed from: M */
    public List<C4972v> m19527M() {
        return this.f18642m;
    }

    /* renamed from: N */
    public List<C4975w> m19528N() {
        return this.f18640k;
    }

    /* renamed from: O */
    public Integer m19529O() {
        return this.f18644o;
    }

    /* renamed from: P */
    public C4981y m19530P() {
        return this.f18637h;
    }

    /* renamed from: Q */
    public Double m19531Q() {
        return this.f18641l;
    }

    /* renamed from: R */
    public C4918e0 m19532R() {
        return this.f18645p;
    }

    /* renamed from: S */
    public C4902a0 m19533S() {
        return this.f18638i;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof C4969u)) {
            return false;
        }
        C4969u c4969u = (C4969u) obj;
        return C2388q.m9592b(this.f18637h, c4969u.f18637h) && C2388q.m9592b(this.f18638i, c4969u.f18638i) && Arrays.equals(this.f18639j, c4969u.f18639j) && C2388q.m9592b(this.f18641l, c4969u.f18641l) && this.f18640k.containsAll(c4969u.f18640k) && c4969u.f18640k.containsAll(this.f18640k) && (((list = this.f18642m) == null && c4969u.f18642m == null) || (list != null && (list2 = c4969u.f18642m) != null && list.containsAll(list2) && c4969u.f18642m.containsAll(this.f18642m))) && C2388q.m9592b(this.f18643n, c4969u.f18643n) && C2388q.m9592b(this.f18644o, c4969u.f18644o) && C2388q.m9592b(this.f18645p, c4969u.f18645p) && C2388q.m9592b(this.f18646q, c4969u.f18646q) && C2388q.m9592b(this.f18647r, c4969u.f18647r);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18637h, this.f18638i, Integer.valueOf(Arrays.hashCode(this.f18639j)), this.f18640k, this.f18641l, this.f18642m, this.f18643n, this.f18644o, this.f18645p, this.f18646q, this.f18647r);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 2, m19530P(), i10, false);
        C2603c.m10454D(parcel, 3, m19533S(), i10, false);
        C2603c.m10476l(parcel, 4, m19526L(), false);
        C2603c.m10460J(parcel, 5, m19528N(), false);
        C2603c.m10480p(parcel, 6, m19531Q(), false);
        C2603c.m10460J(parcel, 7, m19527M(), false);
        C2603c.m10454D(parcel, 8, m19525K(), i10, false);
        C2603c.m10487w(parcel, 9, m19529O(), false);
        C2603c.m10454D(parcel, 10, m19532R(), i10, false);
        C2603c.m10456F(parcel, 11, m19523I(), false);
        C2603c.m10454D(parcel, 12, m19524J(), i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
