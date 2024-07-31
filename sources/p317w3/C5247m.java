package p317w3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4441i;

/* renamed from: w3.m */
/* loaded from: classes.dex */
public final class C5247m implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<C5247m> CREATOR = new a();

    /* renamed from: h */
    public final b[] f19905h;

    /* renamed from: i */
    public int f19906i;

    /* renamed from: j */
    public final String f19907j;

    /* renamed from: k */
    public final int f19908k;

    /* renamed from: w3.m$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C5247m> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5247m createFromParcel(Parcel parcel) {
            return new C5247m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C5247m[] newArray(int i10) {
            return new C5247m[i10];
        }
    }

    /* renamed from: w3.m$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: h */
        public int f19909h;

        /* renamed from: i */
        public final UUID f19910i;

        /* renamed from: j */
        public final String f19911j;

        /* renamed from: k */
        public final String f19912k;

        /* renamed from: l */
        public final byte[] f19913l;

        /* renamed from: w3.m$b$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel) {
            this.f19910i = new UUID(parcel.readLong(), parcel.readLong());
            this.f19911j = parcel.readString();
            this.f19912k = (String) C4041n0.m15463j(parcel.readString());
            this.f19913l = parcel.createByteArray();
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f19910i = (UUID) C4014a.m15199e(uuid);
            this.f19911j = str;
            this.f19912k = (String) C4014a.m15199e(str2);
            this.f19913l = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        /* renamed from: a */
        public boolean m21263a(b bVar) {
            return m21265d() && !bVar.m21265d() && m21266e(bVar.f19910i);
        }

        /* renamed from: b */
        public b m21264b(byte[] bArr) {
            return new b(this.f19910i, this.f19911j, this.f19912k, bArr);
        }

        /* renamed from: d */
        public boolean m21265d() {
            return this.f19913l != null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public boolean m21266e(UUID uuid) {
            return C4441i.f16297a.equals(this.f19910i) || uuid.equals(this.f19910i);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return C4041n0.m15449c(this.f19911j, bVar.f19911j) && C4041n0.m15449c(this.f19912k, bVar.f19912k) && C4041n0.m15449c(this.f19910i, bVar.f19910i) && Arrays.equals(this.f19913l, bVar.f19913l);
        }

        public int hashCode() {
            if (this.f19909h == 0) {
                int hashCode = this.f19910i.hashCode() * 31;
                String str = this.f19911j;
                this.f19909h = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f19912k.hashCode()) * 31) + Arrays.hashCode(this.f19913l);
            }
            return this.f19909h;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f19910i.getMostSignificantBits());
            parcel.writeLong(this.f19910i.getLeastSignificantBits());
            parcel.writeString(this.f19911j);
            parcel.writeString(this.f19912k);
            parcel.writeByteArray(this.f19913l);
        }
    }

    public C5247m(Parcel parcel) {
        this.f19907j = parcel.readString();
        b[] bVarArr = (b[]) C4041n0.m15463j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f19905h = bVarArr;
        this.f19908k = bVarArr.length;
    }

    public C5247m(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public C5247m(String str, boolean z10, b... bVarArr) {
        this.f19907j = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f19905h = bVarArr;
        this.f19908k = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public C5247m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C5247m(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public C5247m(b... bVarArr) {
        this((String) null, bVarArr);
    }

    /* renamed from: b */
    public static boolean m21255b(ArrayList<b> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f19910i.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static C5247m m21256e(C5247m c5247m, C5247m c5247m2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c5247m != null) {
            str = c5247m.f19907j;
            for (b bVar : c5247m.f19905h) {
                if (bVar.m21265d()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (c5247m2 != null) {
            if (str == null) {
                str = c5247m2.f19907j;
            }
            int size = arrayList.size();
            for (b bVar2 : c5247m2.f19905h) {
                if (bVar2.m21265d() && !m21255b(arrayList, size, bVar2.f19910i)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C5247m(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = C4441i.f16297a;
        return uuid.equals(bVar.f19910i) ? uuid.equals(bVar2.f19910i) ? 0 : 1 : bVar.f19910i.compareTo(bVar2.f19910i);
    }

    /* renamed from: d */
    public C5247m m21258d(String str) {
        return C4041n0.m15449c(this.f19907j, str) ? this : new C5247m(str, false, this.f19905h);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5247m.class != obj.getClass()) {
            return false;
        }
        C5247m c5247m = (C5247m) obj;
        return C4041n0.m15449c(this.f19907j, c5247m.f19907j) && Arrays.equals(this.f19905h, c5247m.f19905h);
    }

    /* renamed from: f */
    public b m21259f(int i10) {
        return this.f19905h[i10];
    }

    /* renamed from: g */
    public C5247m m21260g(C5247m c5247m) {
        String str;
        String str2 = this.f19907j;
        C4014a.m15200f(str2 == null || (str = c5247m.f19907j) == null || TextUtils.equals(str2, str));
        String str3 = this.f19907j;
        if (str3 == null) {
            str3 = c5247m.f19907j;
        }
        return new C5247m(str3, (b[]) C4041n0.m15404F0(this.f19905h, c5247m.f19905h));
    }

    public int hashCode() {
        if (this.f19906i == 0) {
            String str = this.f19907j;
            this.f19906i = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f19905h);
        }
        return this.f19906i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19907j);
        parcel.writeTypedArray(this.f19905h, 0);
    }
}
