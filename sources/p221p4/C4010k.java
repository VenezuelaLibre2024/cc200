package p221p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p222p5.C4041n0;

/* renamed from: p4.k */
/* loaded from: classes.dex */
public final class C4010k extends AbstractC4008i {
    public static final Parcelable.Creator<C4010k> CREATOR = new a();

    /* renamed from: i */
    public final int f14432i;

    /* renamed from: j */
    public final int f14433j;

    /* renamed from: k */
    public final int f14434k;

    /* renamed from: l */
    public final int[] f14435l;

    /* renamed from: m */
    public final int[] f14436m;

    /* renamed from: p4.k$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4010k> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4010k createFromParcel(Parcel parcel) {
            return new C4010k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4010k[] newArray(int i10) {
            return new C4010k[i10];
        }
    }

    public C4010k(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f14432i = i10;
        this.f14433j = i11;
        this.f14434k = i12;
        this.f14435l = iArr;
        this.f14436m = iArr2;
    }

    public C4010k(Parcel parcel) {
        super("MLLT");
        this.f14432i = parcel.readInt();
        this.f14433j = parcel.readInt();
        this.f14434k = parcel.readInt();
        this.f14435l = (int[]) C4041n0.m15463j(parcel.createIntArray());
        this.f14436m = (int[]) C4041n0.m15463j(parcel.createIntArray());
    }

    @Override // p221p4.AbstractC4008i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4010k.class != obj.getClass()) {
            return false;
        }
        C4010k c4010k = (C4010k) obj;
        return this.f14432i == c4010k.f14432i && this.f14433j == c4010k.f14433j && this.f14434k == c4010k.f14434k && Arrays.equals(this.f14435l, c4010k.f14435l) && Arrays.equals(this.f14436m, c4010k.f14436m);
    }

    public int hashCode() {
        return ((((((((527 + this.f14432i) * 31) + this.f14433j) * 31) + this.f14434k) * 31) + Arrays.hashCode(this.f14435l)) * 31) + Arrays.hashCode(this.f14436m);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14432i);
        parcel.writeInt(this.f14433j);
        parcel.writeInt(this.f14434k);
        parcel.writeIntArray(this.f14435l);
        parcel.writeIntArray(this.f14436m);
    }
}
