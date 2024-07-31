package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import p292u6.EnumC4957q;

/* renamed from: u6.q */
/* loaded from: classes.dex */
public enum EnumC4957q implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<EnumC4957q> CREATOR = new Parcelable.Creator() { // from class: u6.f2
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC4957q.m19514f(parcel.readInt());
            } catch (EnumC4957q.a e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC4957q[i10];
        }
    };

    /* renamed from: h */
    public final int f18623h;

    /* renamed from: u6.q$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(int i10) {
            super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i10)));
        }
    }

    EnumC4957q(int i10) {
        this.f18623h = i10;
    }

    /* renamed from: f */
    public static EnumC4957q m19514f(int i10) {
        for (EnumC4957q enumC4957q : values()) {
            if (i10 == enumC4957q.f18623h) {
                return enumC4957q;
            }
        }
        throw new a(i10);
    }

    /* renamed from: b */
    public int m19515b() {
        return this.f18623h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18623h);
    }
}
