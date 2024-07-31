package p276t4;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t4.c */
/* loaded from: classes.dex */
public final class C4691c implements Comparable<C4691c>, Parcelable {
    public static final Parcelable.Creator<C4691c> CREATOR = new a();

    /* renamed from: h */
    public final int f17522h;

    /* renamed from: i */
    public final int f17523i;

    /* renamed from: j */
    public final int f17524j;

    /* renamed from: k */
    @Deprecated
    public final int f17525k;

    /* renamed from: t4.c$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4691c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4691c createFromParcel(Parcel parcel) {
            return new C4691c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4691c[] newArray(int i10) {
            return new C4691c[i10];
        }
    }

    public C4691c(int i10, int i11, int i12) {
        this.f17522h = i10;
        this.f17523i = i11;
        this.f17524j = i12;
        this.f17525k = i12;
    }

    public C4691c(Parcel parcel) {
        this.f17522h = parcel.readInt();
        this.f17523i = parcel.readInt();
        int readInt = parcel.readInt();
        this.f17524j = readInt;
        this.f17525k = readInt;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4691c c4691c) {
        int i10 = this.f17522h - c4691c.f17522h;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f17523i - c4691c.f17523i;
        return i11 == 0 ? this.f17524j - c4691c.f17524j : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4691c.class != obj.getClass()) {
            return false;
        }
        C4691c c4691c = (C4691c) obj;
        return this.f17522h == c4691c.f17522h && this.f17523i == c4691c.f17523i && this.f17524j == c4691c.f17524j;
    }

    public int hashCode() {
        return (((this.f17522h * 31) + this.f17523i) * 31) + this.f17524j;
    }

    public String toString() {
        return this.f17522h + "." + this.f17523i + "." + this.f17524j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f17522h);
        parcel.writeInt(this.f17523i);
        parcel.writeInt(this.f17524j);
    }
}
