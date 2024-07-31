package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p292u6.EnumC4905b;

/* renamed from: u6.b */
/* loaded from: classes.dex */
public enum EnumC4905b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC4905b> CREATOR = new Parcelable.Creator() { // from class: u6.i0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC4905b.m19471b(parcel.readString());
            } catch (EnumC4905b.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC4905b[i10];
        }
    };

    /* renamed from: h */
    public final String f18516h;

    /* renamed from: u6.b$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    EnumC4905b(String str) {
        this.f18516h = str;
    }

    /* renamed from: b */
    public static EnumC4905b m19471b(String str) {
        for (EnumC4905b enumC4905b : values()) {
            if (str.equals(enumC4905b.f18516h)) {
                return enumC4905b;
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
        return this.f18516h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18516h);
    }
}
