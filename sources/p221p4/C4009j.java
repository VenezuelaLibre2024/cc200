package p221p4;

import android.os.Parcel;
import android.os.Parcelable;
import p222p5.C4041n0;

/* renamed from: p4.j */
/* loaded from: classes.dex */
public final class C4009j extends AbstractC4008i {
    public static final Parcelable.Creator<C4009j> CREATOR = new a();

    /* renamed from: i */
    public final String f14429i;

    /* renamed from: j */
    public final String f14430j;

    /* renamed from: k */
    public final String f14431k;

    /* renamed from: p4.j$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4009j> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4009j createFromParcel(Parcel parcel) {
            return new C4009j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4009j[] newArray(int i10) {
            return new C4009j[i10];
        }
    }

    public C4009j(Parcel parcel) {
        super("----");
        this.f14429i = (String) C4041n0.m15463j(parcel.readString());
        this.f14430j = (String) C4041n0.m15463j(parcel.readString());
        this.f14431k = (String) C4041n0.m15463j(parcel.readString());
    }

    public C4009j(String str, String str2, String str3) {
        super("----");
        this.f14429i = str;
        this.f14430j = str2;
        this.f14431k = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4009j.class != obj.getClass()) {
            return false;
        }
        C4009j c4009j = (C4009j) obj;
        return C4041n0.m15449c(this.f14430j, c4009j.f14430j) && C4041n0.m15449c(this.f14429i, c4009j.f14429i) && C4041n0.m15449c(this.f14431k, c4009j.f14431k);
    }

    public int hashCode() {
        String str = this.f14429i;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14430j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14431k;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p221p4.AbstractC4008i
    public String toString() {
        return this.f14428h + ": domain=" + this.f14429i + ", description=" + this.f14430j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14428h);
        parcel.writeString(this.f14429i);
        parcel.writeString(this.f14431k);
    }
}
