package p365z4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p152k4.C3348a;

/* renamed from: z4.r */
/* loaded from: classes.dex */
public final class C5987r implements C3348a.b {
    public static final Parcelable.Creator<C5987r> CREATOR = new a();

    /* renamed from: h */
    public final String f22345h;

    /* renamed from: i */
    public final String f22346i;

    /* renamed from: j */
    public final List<b> f22347j;

    /* renamed from: z4.r$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C5987r> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5987r createFromParcel(Parcel parcel) {
            return new C5987r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5987r[] newArray(int i10) {
            return new C5987r[i10];
        }
    }

    /* renamed from: z4.r$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: h */
        public final int f22348h;

        /* renamed from: i */
        public final int f22349i;

        /* renamed from: j */
        public final String f22350j;

        /* renamed from: k */
        public final String f22351k;

        /* renamed from: l */
        public final String f22352l;

        /* renamed from: m */
        public final String f22353m;

        /* renamed from: z4.r$b$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f22348h = i10;
            this.f22349i = i11;
            this.f22350j = str;
            this.f22351k = str2;
            this.f22352l = str3;
            this.f22353m = str4;
        }

        public b(Parcel parcel) {
            this.f22348h = parcel.readInt();
            this.f22349i = parcel.readInt();
            this.f22350j = parcel.readString();
            this.f22351k = parcel.readString();
            this.f22352l = parcel.readString();
            this.f22353m = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f22348h == bVar.f22348h && this.f22349i == bVar.f22349i && TextUtils.equals(this.f22350j, bVar.f22350j) && TextUtils.equals(this.f22351k, bVar.f22351k) && TextUtils.equals(this.f22352l, bVar.f22352l) && TextUtils.equals(this.f22353m, bVar.f22353m);
        }

        public int hashCode() {
            int i10 = ((this.f22348h * 31) + this.f22349i) * 31;
            String str = this.f22350j;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f22351k;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f22352l;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f22353m;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f22348h);
            parcel.writeInt(this.f22349i);
            parcel.writeString(this.f22350j);
            parcel.writeString(this.f22351k);
            parcel.writeString(this.f22352l);
            parcel.writeString(this.f22353m);
        }
    }

    public C5987r(Parcel parcel) {
        this.f22345h = parcel.readString();
        this.f22346i = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f22347j = Collections.unmodifiableList(arrayList);
    }

    public C5987r(String str, String str2, List<b> list) {
        this.f22345h = str;
        this.f22346i = str2;
        this.f22347j = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5987r.class != obj.getClass()) {
            return false;
        }
        C5987r c5987r = (C5987r) obj;
        return TextUtils.equals(this.f22345h, c5987r.f22345h) && TextUtils.equals(this.f22346i, c5987r.f22346i) && this.f22347j.equals(c5987r.f22347j);
    }

    public int hashCode() {
        String str = this.f22345h;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22346i;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f22347j.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f22345h != null) {
            str = " [" + this.f22345h + ", " + this.f22346i + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22345h);
        parcel.writeString(this.f22346i);
        int size = this.f22347j.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f22347j.get(i11), 0);
        }
    }
}
