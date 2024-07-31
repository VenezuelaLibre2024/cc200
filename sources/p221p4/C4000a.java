package p221p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p222p5.C4041n0;
import p264s3.C4528z1;

/* renamed from: p4.a */
/* loaded from: classes.dex */
public final class C4000a extends AbstractC4008i {
    public static final Parcelable.Creator<C4000a> CREATOR = new a();

    /* renamed from: i */
    public final String f14399i;

    /* renamed from: j */
    public final String f14400j;

    /* renamed from: k */
    public final int f14401k;

    /* renamed from: l */
    public final byte[] f14402l;

    /* renamed from: p4.a$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4000a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4000a createFromParcel(Parcel parcel) {
            return new C4000a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4000a[] newArray(int i10) {
            return new C4000a[i10];
        }
    }

    public C4000a(Parcel parcel) {
        super("APIC");
        this.f14399i = (String) C4041n0.m15463j(parcel.readString());
        this.f14400j = parcel.readString();
        this.f14401k = parcel.readInt();
        this.f14402l = (byte[]) C4041n0.m15463j(parcel.createByteArray());
    }

    public C4000a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f14399i = str;
        this.f14400j = str2;
        this.f14401k = i10;
        this.f14402l = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4000a.class != obj.getClass()) {
            return false;
        }
        C4000a c4000a = (C4000a) obj;
        return this.f14401k == c4000a.f14401k && C4041n0.m15449c(this.f14399i, c4000a.f14399i) && C4041n0.m15449c(this.f14400j, c4000a.f14400j) && Arrays.equals(this.f14402l, c4000a.f14402l);
    }

    public int hashCode() {
        int i10 = (527 + this.f14401k) * 31;
        String str = this.f14399i;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14400j;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f14402l);
    }

    @Override // p221p4.AbstractC4008i
    public String toString() {
        return this.f14428h + ": mimeType=" + this.f14399i + ", description=" + this.f14400j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14399i);
        parcel.writeString(this.f14400j);
        parcel.writeInt(this.f14401k);
        parcel.writeByteArray(this.f14402l);
    }

    @Override // p152k4.C3348a.b
    /* renamed from: z */
    public void mo12419z(C4528z1.b bVar) {
        bVar.m17908I(this.f14402l, this.f14401k);
    }
}
