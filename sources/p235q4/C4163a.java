package p235q4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p152k4.C3348a;
import p222p5.C4041n0;

/* renamed from: q4.a */
/* loaded from: classes.dex */
public final class C4163a implements C3348a.b {
    public static final Parcelable.Creator<C4163a> CREATOR = new a();

    /* renamed from: h */
    public final String f14960h;

    /* renamed from: i */
    public final byte[] f14961i;

    /* renamed from: j */
    public final int f14962j;

    /* renamed from: k */
    public final int f14963k;

    /* renamed from: q4.a$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4163a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4163a createFromParcel(Parcel parcel) {
            return new C4163a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4163a[] newArray(int i10) {
            return new C4163a[i10];
        }
    }

    public C4163a(Parcel parcel) {
        this.f14960h = (String) C4041n0.m15463j(parcel.readString());
        this.f14961i = (byte[]) C4041n0.m15463j(parcel.createByteArray());
        this.f14962j = parcel.readInt();
        this.f14963k = parcel.readInt();
    }

    public /* synthetic */ C4163a(Parcel parcel, a aVar) {
        this(parcel);
    }

    public C4163a(String str, byte[] bArr, int i10, int i11) {
        this.f14960h = str;
        this.f14961i = bArr;
        this.f14962j = i10;
        this.f14963k = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4163a.class != obj.getClass()) {
            return false;
        }
        C4163a c4163a = (C4163a) obj;
        return this.f14960h.equals(c4163a.f14960h) && Arrays.equals(this.f14961i, c4163a.f14961i) && this.f14962j == c4163a.f14962j && this.f14963k == c4163a.f14963k;
    }

    public int hashCode() {
        return ((((((527 + this.f14960h.hashCode()) * 31) + Arrays.hashCode(this.f14961i)) * 31) + this.f14962j) * 31) + this.f14963k;
    }

    public String toString() {
        return "mdta: key=" + this.f14960h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14960h);
        parcel.writeByteArray(this.f14961i);
        parcel.writeInt(this.f14962j);
        parcel.writeInt(this.f14963k);
    }
}
