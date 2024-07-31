package p205o4;

import android.os.Parcel;
import android.os.Parcelable;
import p152k4.C3348a;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4528z1;

/* renamed from: o4.b */
/* loaded from: classes.dex */
public final class C3890b implements C3348a.b {
    public static final Parcelable.Creator<C3890b> CREATOR = new a();

    /* renamed from: h */
    public final int f13957h;

    /* renamed from: i */
    public final String f13958i;

    /* renamed from: j */
    public final String f13959j;

    /* renamed from: k */
    public final String f13960k;

    /* renamed from: l */
    public final boolean f13961l;

    /* renamed from: m */
    public final int f13962m;

    /* renamed from: o4.b$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C3890b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3890b createFromParcel(Parcel parcel) {
            return new C3890b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3890b[] newArray(int i10) {
            return new C3890b[i10];
        }
    }

    public C3890b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        C4014a.m15195a(i11 == -1 || i11 > 0);
        this.f13957h = i10;
        this.f13958i = str;
        this.f13959j = str2;
        this.f13960k = str3;
        this.f13961l = z10;
        this.f13962m = i11;
    }

    public C3890b(Parcel parcel) {
        this.f13957h = parcel.readInt();
        this.f13958i = parcel.readString();
        this.f13959j = parcel.readString();
        this.f13960k = parcel.readString();
        this.f13961l = C4041n0.m15416L0(parcel);
        this.f13962m = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0065  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p205o4.C3890b m14756a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p205o4.C3890b.m14756a(java.util.Map):o4.b");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3890b.class != obj.getClass()) {
            return false;
        }
        C3890b c3890b = (C3890b) obj;
        return this.f13957h == c3890b.f13957h && C4041n0.m15449c(this.f13958i, c3890b.f13958i) && C4041n0.m15449c(this.f13959j, c3890b.f13959j) && C4041n0.m15449c(this.f13960k, c3890b.f13960k) && this.f13961l == c3890b.f13961l && this.f13962m == c3890b.f13962m;
    }

    public int hashCode() {
        int i10 = (527 + this.f13957h) * 31;
        String str = this.f13958i;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13959j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13960k;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f13961l ? 1 : 0)) * 31) + this.f13962m;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f13959j + "\", genre=\"" + this.f13958i + "\", bitrate=" + this.f13957h + ", metadataInterval=" + this.f13962m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13957h);
        parcel.writeString(this.f13958i);
        parcel.writeString(this.f13959j);
        parcel.writeString(this.f13960k);
        C4041n0.m15444Z0(parcel, this.f13961l);
        parcel.writeInt(this.f13962m);
    }

    @Override // p152k4.C3348a.b
    /* renamed from: z */
    public void mo12419z(C4528z1.b bVar) {
        String str = this.f13959j;
        if (str != null) {
            bVar.m17936k0(str);
        }
        String str2 = this.f13958i;
        if (str2 != null) {
            bVar.m17925Z(str2);
        }
    }
}
