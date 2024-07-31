package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p292u6.EnumC4984z;

/* renamed from: u6.z */
/* loaded from: classes.dex */
public enum EnumC4984z implements Parcelable {
    PUBLIC_KEY("public-key");

    public static final Parcelable.Creator<EnumC4984z> CREATOR = new Parcelable.Creator() { // from class: u6.z0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC4984z.m19549b(parcel.readString());
            } catch (EnumC4984z.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC4984z[i10];
        }
    };

    /* renamed from: h */
    public final String f18668h = "public-key";

    /* renamed from: u6.z$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    EnumC4984z(String str) {
    }

    /* renamed from: b */
    public static EnumC4984z m19549b(String str) {
        for (EnumC4984z enumC4984z : values()) {
            if (str.equals(enumC4984z.f18668h)) {
                return enumC4984z;
            }
        }
        throw new a(String.format("PublicKeyCredentialType %s not supported", str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f18668h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18668h);
    }
}
