package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p292u6.EnumC4914d0;

/* renamed from: u6.d0 */
/* loaded from: classes.dex */
public enum EnumC4914d0 implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<EnumC4914d0> CREATOR = new Parcelable.Creator() { // from class: u6.b1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            try {
                return EnumC4914d0.m19475b(readString);
            } catch (EnumC4914d0.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC4914d0[i10];
        }
    };

    /* renamed from: h */
    public final String f18547h;

    /* renamed from: u6.d0$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Resident key requirement %s not supported", str));
        }
    }

    EnumC4914d0(String str) {
        this.f18547h = str;
    }

    /* renamed from: b */
    public static EnumC4914d0 m19475b(String str) {
        for (EnumC4914d0 enumC4914d0 : values()) {
            if (str.equals(enumC4914d0.f18547h)) {
                return enumC4914d0;
            }
        }
        throw new a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f18547h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18547h);
    }
}
