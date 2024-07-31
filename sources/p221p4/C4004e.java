package p221p4;

import android.os.Parcel;
import android.os.Parcelable;
import p222p5.C4041n0;

/* renamed from: p4.e */
/* loaded from: classes.dex */
public final class C4004e extends AbstractC4008i {
    public static final Parcelable.Creator<C4004e> CREATOR = new a();

    /* renamed from: i */
    public final String f14415i;

    /* renamed from: j */
    public final String f14416j;

    /* renamed from: k */
    public final String f14417k;

    /* renamed from: p4.e$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4004e> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4004e createFromParcel(Parcel parcel) {
            return new C4004e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4004e[] newArray(int i10) {
            return new C4004e[i10];
        }
    }

    public C4004e(Parcel parcel) {
        super("COMM");
        this.f14415i = (String) C4041n0.m15463j(parcel.readString());
        this.f14416j = (String) C4041n0.m15463j(parcel.readString());
        this.f14417k = (String) C4041n0.m15463j(parcel.readString());
    }

    public C4004e(String str, String str2, String str3) {
        super("COMM");
        this.f14415i = str;
        this.f14416j = str2;
        this.f14417k = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4004e.class != obj.getClass()) {
            return false;
        }
        C4004e c4004e = (C4004e) obj;
        return C4041n0.m15449c(this.f14416j, c4004e.f14416j) && C4041n0.m15449c(this.f14415i, c4004e.f14415i) && C4041n0.m15449c(this.f14417k, c4004e.f14417k);
    }

    public int hashCode() {
        String str = this.f14415i;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14416j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14417k;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p221p4.AbstractC4008i
    public String toString() {
        return this.f14428h + ": language=" + this.f14415i + ", description=" + this.f14416j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14428h);
        parcel.writeString(this.f14415i);
        parcel.writeString(this.f14417k);
    }
}
