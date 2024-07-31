package sc;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sc.a */
/* loaded from: classes2.dex */
public class C4565a implements Parcelable {
    public static final Parcelable.Creator<C4565a> CREATOR = new a();

    /* renamed from: h */
    public final String f17206h;

    /* renamed from: i */
    public final float f17207i;

    /* renamed from: j */
    public final float f17208j;

    /* renamed from: sc.a$a */
    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<C4565a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4565a createFromParcel(Parcel parcel) {
            return new C4565a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4565a[] newArray(int i10) {
            return new C4565a[i10];
        }
    }

    public C4565a(Parcel parcel) {
        this.f17206h = parcel.readString();
        this.f17207i = parcel.readFloat();
        this.f17208j = parcel.readFloat();
    }

    public C4565a(String str, float f10, float f11) {
        this.f17206h = str;
        this.f17207i = f10;
        this.f17208j = f11;
    }

    /* renamed from: a */
    public String m18061a() {
        return this.f17206h;
    }

    /* renamed from: b */
    public float m18062b() {
        return this.f17207i;
    }

    /* renamed from: d */
    public float m18063d() {
        return this.f17208j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17206h);
        parcel.writeFloat(this.f17207i);
        parcel.writeFloat(this.f17208j);
    }
}
