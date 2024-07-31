package p235q4;

import android.os.Parcel;
import android.os.Parcelable;
import p152k4.C3348a;
import p155k7.C3370g;

/* renamed from: q4.b */
/* loaded from: classes.dex */
public final class C4164b implements C3348a.b {
    public static final Parcelable.Creator<C4164b> CREATOR = new a();

    /* renamed from: h */
    public final long f14964h;

    /* renamed from: i */
    public final long f14965i;

    /* renamed from: j */
    public final long f14966j;

    /* renamed from: k */
    public final long f14967k;

    /* renamed from: l */
    public final long f14968l;

    /* renamed from: q4.b$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4164b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4164b createFromParcel(Parcel parcel) {
            return new C4164b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4164b[] newArray(int i10) {
            return new C4164b[i10];
        }
    }

    public C4164b(long j10, long j11, long j12, long j13, long j14) {
        this.f14964h = j10;
        this.f14965i = j11;
        this.f14966j = j12;
        this.f14967k = j13;
        this.f14968l = j14;
    }

    public C4164b(Parcel parcel) {
        this.f14964h = parcel.readLong();
        this.f14965i = parcel.readLong();
        this.f14966j = parcel.readLong();
        this.f14967k = parcel.readLong();
        this.f14968l = parcel.readLong();
    }

    public /* synthetic */ C4164b(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4164b.class != obj.getClass()) {
            return false;
        }
        C4164b c4164b = (C4164b) obj;
        return this.f14964h == c4164b.f14964h && this.f14965i == c4164b.f14965i && this.f14966j == c4164b.f14966j && this.f14967k == c4164b.f14967k && this.f14968l == c4164b.f14968l;
    }

    public int hashCode() {
        return ((((((((527 + C3370g.m12538b(this.f14964h)) * 31) + C3370g.m12538b(this.f14965i)) * 31) + C3370g.m12538b(this.f14966j)) * 31) + C3370g.m12538b(this.f14967k)) * 31) + C3370g.m12538b(this.f14968l);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f14964h + ", photoSize=" + this.f14965i + ", photoPresentationTimestampUs=" + this.f14966j + ", videoStartPosition=" + this.f14967k + ", videoSize=" + this.f14968l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f14964h);
        parcel.writeLong(this.f14965i);
        parcel.writeLong(this.f14966j);
        parcel.writeLong(this.f14967k);
        parcel.writeLong(this.f14968l);
    }
}
