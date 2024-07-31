package p221p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p222p5.C4041n0;

/* renamed from: p4.f */
/* loaded from: classes.dex */
public final class C4005f extends AbstractC4008i {
    public static final Parcelable.Creator<C4005f> CREATOR = new a();

    /* renamed from: i */
    public final String f14418i;

    /* renamed from: j */
    public final String f14419j;

    /* renamed from: k */
    public final String f14420k;

    /* renamed from: l */
    public final byte[] f14421l;

    /* renamed from: p4.f$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4005f> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4005f createFromParcel(Parcel parcel) {
            return new C4005f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4005f[] newArray(int i10) {
            return new C4005f[i10];
        }
    }

    public C4005f(Parcel parcel) {
        super("GEOB");
        this.f14418i = (String) C4041n0.m15463j(parcel.readString());
        this.f14419j = (String) C4041n0.m15463j(parcel.readString());
        this.f14420k = (String) C4041n0.m15463j(parcel.readString());
        this.f14421l = (byte[]) C4041n0.m15463j(parcel.createByteArray());
    }

    public C4005f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f14418i = str;
        this.f14419j = str2;
        this.f14420k = str3;
        this.f14421l = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4005f.class != obj.getClass()) {
            return false;
        }
        C4005f c4005f = (C4005f) obj;
        return C4041n0.m15449c(this.f14418i, c4005f.f14418i) && C4041n0.m15449c(this.f14419j, c4005f.f14419j) && C4041n0.m15449c(this.f14420k, c4005f.f14420k) && Arrays.equals(this.f14421l, c4005f.f14421l);
    }

    public int hashCode() {
        String str = this.f14418i;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14419j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14420k;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f14421l);
    }

    @Override // p221p4.AbstractC4008i
    public String toString() {
        return this.f14428h + ": mimeType=" + this.f14418i + ", filename=" + this.f14419j + ", description=" + this.f14420k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14418i);
        parcel.writeString(this.f14419j);
        parcel.writeString(this.f14420k);
        parcel.writeByteArray(this.f14421l);
    }
}
