package p221p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p222p5.C4041n0;

/* renamed from: p4.d */
/* loaded from: classes.dex */
public final class C4003d extends AbstractC4008i {
    public static final Parcelable.Creator<C4003d> CREATOR = new a();

    /* renamed from: i */
    public final String f14410i;

    /* renamed from: j */
    public final boolean f14411j;

    /* renamed from: k */
    public final boolean f14412k;

    /* renamed from: l */
    public final String[] f14413l;

    /* renamed from: m */
    public final AbstractC4008i[] f14414m;

    /* renamed from: p4.d$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4003d> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4003d createFromParcel(Parcel parcel) {
            return new C4003d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4003d[] newArray(int i10) {
            return new C4003d[i10];
        }
    }

    public C4003d(Parcel parcel) {
        super("CTOC");
        this.f14410i = (String) C4041n0.m15463j(parcel.readString());
        this.f14411j = parcel.readByte() != 0;
        this.f14412k = parcel.readByte() != 0;
        this.f14413l = (String[]) C4041n0.m15463j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f14414m = new AbstractC4008i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f14414m[i10] = (AbstractC4008i) parcel.readParcelable(AbstractC4008i.class.getClassLoader());
        }
    }

    public C4003d(String str, boolean z10, boolean z11, String[] strArr, AbstractC4008i[] abstractC4008iArr) {
        super("CTOC");
        this.f14410i = str;
        this.f14411j = z10;
        this.f14412k = z11;
        this.f14413l = strArr;
        this.f14414m = abstractC4008iArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4003d.class != obj.getClass()) {
            return false;
        }
        C4003d c4003d = (C4003d) obj;
        return this.f14411j == c4003d.f14411j && this.f14412k == c4003d.f14412k && C4041n0.m15449c(this.f14410i, c4003d.f14410i) && Arrays.equals(this.f14413l, c4003d.f14413l) && Arrays.equals(this.f14414m, c4003d.f14414m);
    }

    public int hashCode() {
        int i10 = (((527 + (this.f14411j ? 1 : 0)) * 31) + (this.f14412k ? 1 : 0)) * 31;
        String str = this.f14410i;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14410i);
        parcel.writeByte(this.f14411j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14412k ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f14413l);
        parcel.writeInt(this.f14414m.length);
        for (AbstractC4008i abstractC4008i : this.f14414m) {
            parcel.writeParcelable(abstractC4008i, 0);
        }
    }
}
