package p292u6;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u6.h1 */
/* loaded from: classes.dex */
public enum EnumC4931h1 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<EnumC4931h1> CREATOR = new Parcelable.Creator() { // from class: u6.f1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC4931h1.m19496b(parcel.readString());
            } catch (C4927g1 e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC4931h1[i10];
        }
    };

    /* renamed from: h */
    public final String f18581h;

    EnumC4931h1(String str) {
        this.f18581h = str;
    }

    /* renamed from: b */
    public static EnumC4931h1 m19496b(String str) {
        for (EnumC4931h1 enumC4931h1 : values()) {
            if (str.equals(enumC4931h1.f18581h)) {
                return enumC4931h1;
            }
        }
        throw new C4927g1(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18581h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18581h);
    }
}
