package p235q4;

import android.os.Parcel;
import android.os.Parcelable;
import p152k4.C3348a;
import p155k7.C3366c;

/* renamed from: q4.e */
/* loaded from: classes.dex */
public final class C4167e implements C3348a.b {
    public static final Parcelable.Creator<C4167e> CREATOR = new a();

    /* renamed from: h */
    public final float f14975h;

    /* renamed from: i */
    public final int f14976i;

    /* renamed from: q4.e$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4167e> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4167e createFromParcel(Parcel parcel) {
            return new C4167e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4167e[] newArray(int i10) {
            return new C4167e[i10];
        }
    }

    public C4167e(float f10, int i10) {
        this.f14975h = f10;
        this.f14976i = i10;
    }

    public C4167e(Parcel parcel) {
        this.f14975h = parcel.readFloat();
        this.f14976i = parcel.readInt();
    }

    public /* synthetic */ C4167e(Parcel parcel, a aVar) {
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
        if (obj == null || C4167e.class != obj.getClass()) {
            return false;
        }
        C4167e c4167e = (C4167e) obj;
        return this.f14975h == c4167e.f14975h && this.f14976i == c4167e.f14976i;
    }

    public int hashCode() {
        return ((527 + C3366c.m12521a(this.f14975h)) * 31) + this.f14976i;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f14975h + ", svcTemporalLayerCount=" + this.f14976i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f14975h);
        parcel.writeInt(this.f14976i);
    }
}
