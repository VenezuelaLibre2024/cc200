package p221p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p222p5.C4041n0;

/* renamed from: p4.c */
/* loaded from: classes.dex */
public final class C4002c extends AbstractC4008i {
    public static final Parcelable.Creator<C4002c> CREATOR = new a();

    /* renamed from: i */
    public final String f14404i;

    /* renamed from: j */
    public final int f14405j;

    /* renamed from: k */
    public final int f14406k;

    /* renamed from: l */
    public final long f14407l;

    /* renamed from: m */
    public final long f14408m;

    /* renamed from: n */
    public final AbstractC4008i[] f14409n;

    /* renamed from: p4.c$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4002c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4002c createFromParcel(Parcel parcel) {
            return new C4002c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4002c[] newArray(int i10) {
            return new C4002c[i10];
        }
    }

    public C4002c(Parcel parcel) {
        super("CHAP");
        this.f14404i = (String) C4041n0.m15463j(parcel.readString());
        this.f14405j = parcel.readInt();
        this.f14406k = parcel.readInt();
        this.f14407l = parcel.readLong();
        this.f14408m = parcel.readLong();
        int readInt = parcel.readInt();
        this.f14409n = new AbstractC4008i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f14409n[i10] = (AbstractC4008i) parcel.readParcelable(AbstractC4008i.class.getClassLoader());
        }
    }

    public C4002c(String str, int i10, int i11, long j10, long j11, AbstractC4008i[] abstractC4008iArr) {
        super("CHAP");
        this.f14404i = str;
        this.f14405j = i10;
        this.f14406k = i11;
        this.f14407l = j10;
        this.f14408m = j11;
        this.f14409n = abstractC4008iArr;
    }

    @Override // p221p4.AbstractC4008i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4002c.class != obj.getClass()) {
            return false;
        }
        C4002c c4002c = (C4002c) obj;
        return this.f14405j == c4002c.f14405j && this.f14406k == c4002c.f14406k && this.f14407l == c4002c.f14407l && this.f14408m == c4002c.f14408m && C4041n0.m15449c(this.f14404i, c4002c.f14404i) && Arrays.equals(this.f14409n, c4002c.f14409n);
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f14405j) * 31) + this.f14406k) * 31) + ((int) this.f14407l)) * 31) + ((int) this.f14408m)) * 31;
        String str = this.f14404i;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14404i);
        parcel.writeInt(this.f14405j);
        parcel.writeInt(this.f14406k);
        parcel.writeLong(this.f14407l);
        parcel.writeLong(this.f14408m);
        parcel.writeInt(this.f14409n.length);
        for (AbstractC4008i abstractC4008i : this.f14409n) {
            parcel.writeParcelable(abstractC4008i, 0);
        }
    }
}
