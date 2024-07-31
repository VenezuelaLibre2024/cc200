package p307v6;

import android.os.Parcel;
import android.os.Parcelable;
import p307v6.EnumC5128c;

@Deprecated
/* renamed from: v6.c */
/* loaded from: classes.dex */
public enum EnumC5128c implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");

    public static final Parcelable.Creator<EnumC5128c> CREATOR = new Parcelable.Creator() { // from class: v6.i
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC5128c.m20810b(parcel.readString());
            } catch (EnumC5128c.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC5128c[i10];
        }
    };

    /* renamed from: h */
    public final String f19386h;

    /* renamed from: v6.c$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Protocol version %s not supported", str));
        }
    }

    EnumC5128c(String str) {
        this.f19386h = str;
    }

    /* renamed from: b */
    public static EnumC5128c m20810b(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (EnumC5128c enumC5128c : values()) {
            if (str.equals(enumC5128c.f19386h)) {
                return enumC5128c;
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
        return this.f19386h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19386h);
    }
}
