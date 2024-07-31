package p192n4;

import android.os.Parcel;
import android.os.Parcelable;
import p152k4.C3348a;
import p222p5.C4041n0;
import p264s3.C4528z1;

@Deprecated
/* renamed from: n4.b */
/* loaded from: classes.dex */
public class C3730b implements C3348a.b {
    public static final Parcelable.Creator<C3730b> CREATOR = new a();

    /* renamed from: h */
    public final String f13287h;

    /* renamed from: i */
    public final String f13288i;

    /* renamed from: n4.b$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C3730b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3730b createFromParcel(Parcel parcel) {
            return new C3730b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3730b[] newArray(int i10) {
            return new C3730b[i10];
        }
    }

    public C3730b(Parcel parcel) {
        this.f13287h = (String) C4041n0.m15463j(parcel.readString());
        this.f13288i = (String) C4041n0.m15463j(parcel.readString());
    }

    public C3730b(String str, String str2) {
        this.f13287h = str;
        this.f13288i = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3730b c3730b = (C3730b) obj;
        return this.f13287h.equals(c3730b.f13287h) && this.f13288i.equals(c3730b.f13288i);
    }

    public int hashCode() {
        return ((527 + this.f13287h.hashCode()) * 31) + this.f13288i.hashCode();
    }

    public String toString() {
        return "VC: " + this.f13287h + "=" + this.f13288i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13287h);
        parcel.writeString(this.f13288i);
    }

    @Override // p152k4.C3348a.b
    /* renamed from: z */
    public void mo12419z(C4528z1.b bVar) {
        String str = this.f13287h;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bVar.m17913N(this.f13288i);
                return;
            case 1:
                bVar.m17938m0(this.f13288i);
                return;
            case 2:
                bVar.m17920U(this.f13288i);
                return;
            case 3:
                bVar.m17912M(this.f13288i);
                return;
            case 4:
                bVar.m17914O(this.f13288i);
                return;
            default:
                return;
        }
    }
}
