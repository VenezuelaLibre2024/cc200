package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzal;
import java.util.Arrays;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.e0 */
/* loaded from: classes.dex */
public class C4918e0 extends AbstractC2601a {
    public static final Parcelable.Creator<C4918e0> CREATOR = new C4915d1();

    /* renamed from: j */
    public static final C4918e0 f18553j = new C4918e0(a.SUPPORTED.toString(), null);

    /* renamed from: k */
    public static final C4918e0 f18554k = new C4918e0(a.NOT_SUPPORTED.toString(), null);

    /* renamed from: h */
    public final a f18555h;

    /* renamed from: i */
    public final String f18556i;

    /* renamed from: u6.e0$a */
    /* loaded from: classes.dex */
    public enum a implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<a> CREATOR = new C4911c1();

        /* renamed from: h */
        public final String f18561h;

        a(String str) {
            this.f18561h = str;
        }

        /* renamed from: b */
        public static a m19480b(String str) {
            for (a aVar : values()) {
                if (str.equals(aVar.f18561h)) {
                    return aVar;
                }
            }
            throw new b(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f18561h;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f18561h);
        }
    }

    /* renamed from: u6.e0$b */
    /* loaded from: classes.dex */
    public static class b extends Exception {
        public b(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    public C4918e0(String str, String str2) {
        C2394s.m9619l(str);
        try {
            this.f18555h = a.m19480b(str);
            this.f18556i = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: I */
    public String m19478I() {
        return this.f18556i;
    }

    /* renamed from: J */
    public String m19479J() {
        return this.f18555h.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4918e0)) {
            return false;
        }
        C4918e0 c4918e0 = (C4918e0) obj;
        return zzal.zza(this.f18555h, c4918e0.f18555h) && zzal.zza(this.f18556i, c4918e0.f18556i);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18555h, this.f18556i});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, m19479J(), false);
        C2603c.m10456F(parcel, 3, m19478I(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
