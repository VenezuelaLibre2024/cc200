package p167l4;

import android.os.Parcel;
import android.os.Parcelable;
import p152k4.C3348a;
import p222p5.C4014a;

/* renamed from: l4.a */
/* loaded from: classes.dex */
public final class C3430a implements C3348a.b {
    public static final Parcelable.Creator<C3430a> CREATOR = new a();

    /* renamed from: h */
    public final int f12064h;

    /* renamed from: i */
    public final String f12065i;

    /* renamed from: l4.a$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C3430a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3430a createFromParcel(Parcel parcel) {
            return new C3430a(parcel.readInt(), (String) C4014a.m15199e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3430a[] newArray(int i10) {
            return new C3430a[i10];
        }
    }

    public C3430a(int i10, String str) {
        this.f12064h = i10;
        this.f12065i = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f12064h + ",url=" + this.f12065i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12065i);
        parcel.writeInt(this.f12064h);
    }
}
