package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p292u6.EnumC4909c;

/* renamed from: u6.c */
/* loaded from: classes.dex */
public enum EnumC4909c implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC4909c> CREATOR = new Parcelable.Creator() { // from class: u6.j1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC4909c.m19472b(parcel.readString());
            } catch (EnumC4909c.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC4909c[i10];
        }
    };

    /* renamed from: h */
    public final String f18532h;

    /* renamed from: u6.c$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    EnumC4909c(String str) {
        this.f18532h = str;
    }

    /* renamed from: b */
    public static EnumC4909c m19472b(String str) {
        for (EnumC4909c enumC4909c : values()) {
            if (str.equals(enumC4909c.f18532h)) {
                return enumC4909c;
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
        return this.f18532h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18532h);
    }
}
