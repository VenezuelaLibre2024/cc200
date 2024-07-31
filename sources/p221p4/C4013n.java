package p221p4;

import android.os.Parcel;
import android.os.Parcelable;
import p222p5.C4041n0;

/* renamed from: p4.n */
/* loaded from: classes.dex */
public final class C4013n extends AbstractC4008i {
    public static final Parcelable.Creator<C4013n> CREATOR = new a();

    /* renamed from: i */
    public final String f14442i;

    /* renamed from: j */
    public final String f14443j;

    /* renamed from: p4.n$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4013n> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4013n createFromParcel(Parcel parcel) {
            return new C4013n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4013n[] newArray(int i10) {
            return new C4013n[i10];
        }
    }

    public C4013n(Parcel parcel) {
        super((String) C4041n0.m15463j(parcel.readString()));
        this.f14442i = parcel.readString();
        this.f14443j = (String) C4041n0.m15463j(parcel.readString());
    }

    public C4013n(String str, String str2, String str3) {
        super(str);
        this.f14442i = str2;
        this.f14443j = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4013n.class != obj.getClass()) {
            return false;
        }
        C4013n c4013n = (C4013n) obj;
        return this.f14428h.equals(c4013n.f14428h) && C4041n0.m15449c(this.f14442i, c4013n.f14442i) && C4041n0.m15449c(this.f14443j, c4013n.f14443j);
    }

    public int hashCode() {
        int hashCode = (527 + this.f14428h.hashCode()) * 31;
        String str = this.f14442i;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14443j;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p221p4.AbstractC4008i
    public String toString() {
        return this.f14428h + ": url=" + this.f14443j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14428h);
        parcel.writeString(this.f14442i);
        parcel.writeString(this.f14443j);
    }
}
