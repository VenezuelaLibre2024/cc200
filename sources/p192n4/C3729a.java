package p192n4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p109h7.C2422e;
import p152k4.C3348a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p264s3.C4528z1;

/* renamed from: n4.a */
/* loaded from: classes.dex */
public final class C3729a implements C3348a.b {
    public static final Parcelable.Creator<C3729a> CREATOR = new a();

    /* renamed from: h */
    public final int f13279h;

    /* renamed from: i */
    public final String f13280i;

    /* renamed from: j */
    public final String f13281j;

    /* renamed from: k */
    public final int f13282k;

    /* renamed from: l */
    public final int f13283l;

    /* renamed from: m */
    public final int f13284m;

    /* renamed from: n */
    public final int f13285n;

    /* renamed from: o */
    public final byte[] f13286o;

    /* renamed from: n4.a$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C3729a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3729a createFromParcel(Parcel parcel) {
            return new C3729a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3729a[] newArray(int i10) {
            return new C3729a[i10];
        }
    }

    public C3729a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f13279h = i10;
        this.f13280i = str;
        this.f13281j = str2;
        this.f13282k = i11;
        this.f13283l = i12;
        this.f13284m = i13;
        this.f13285n = i14;
        this.f13286o = bArr;
    }

    public C3729a(Parcel parcel) {
        this.f13279h = parcel.readInt();
        this.f13280i = (String) C4041n0.m15463j(parcel.readString());
        this.f13281j = (String) C4041n0.m15463j(parcel.readString());
        this.f13282k = parcel.readInt();
        this.f13283l = parcel.readInt();
        this.f13284m = parcel.readInt();
        this.f13285n = parcel.readInt();
        this.f13286o = (byte[]) C4041n0.m15463j(parcel.createByteArray());
    }

    /* renamed from: a */
    public static C3729a m14042a(C4015a0 c4015a0) {
        int m15241p = c4015a0.m15241p();
        String m15208E = c4015a0.m15208E(c4015a0.m15241p(), C2422e.f9745a);
        String m15207D = c4015a0.m15207D(c4015a0.m15241p());
        int m15241p2 = c4015a0.m15241p();
        int m15241p3 = c4015a0.m15241p();
        int m15241p4 = c4015a0.m15241p();
        int m15241p5 = c4015a0.m15241p();
        int m15241p6 = c4015a0.m15241p();
        byte[] bArr = new byte[m15241p6];
        c4015a0.m15237l(bArr, 0, m15241p6);
        return new C3729a(m15241p, m15208E, m15207D, m15241p2, m15241p3, m15241p4, m15241p5, bArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3729a.class != obj.getClass()) {
            return false;
        }
        C3729a c3729a = (C3729a) obj;
        return this.f13279h == c3729a.f13279h && this.f13280i.equals(c3729a.f13280i) && this.f13281j.equals(c3729a.f13281j) && this.f13282k == c3729a.f13282k && this.f13283l == c3729a.f13283l && this.f13284m == c3729a.f13284m && this.f13285n == c3729a.f13285n && Arrays.equals(this.f13286o, c3729a.f13286o);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f13279h) * 31) + this.f13280i.hashCode()) * 31) + this.f13281j.hashCode()) * 31) + this.f13282k) * 31) + this.f13283l) * 31) + this.f13284m) * 31) + this.f13285n) * 31) + Arrays.hashCode(this.f13286o);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f13280i + ", description=" + this.f13281j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13279h);
        parcel.writeString(this.f13280i);
        parcel.writeString(this.f13281j);
        parcel.writeInt(this.f13282k);
        parcel.writeInt(this.f13283l);
        parcel.writeInt(this.f13284m);
        parcel.writeInt(this.f13285n);
        parcel.writeByteArray(this.f13286o);
    }

    @Override // p152k4.C3348a.b
    /* renamed from: z */
    public void mo12419z(C4528z1.b bVar) {
        bVar.m17908I(this.f13286o, this.f13279h);
    }
}
