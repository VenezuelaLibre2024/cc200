package p221p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p222p5.C4041n0;

/* renamed from: p4.l */
/* loaded from: classes.dex */
public final class C4011l extends AbstractC4008i {
    public static final Parcelable.Creator<C4011l> CREATOR = new a();

    /* renamed from: i */
    public final String f14437i;

    /* renamed from: j */
    public final byte[] f14438j;

    /* renamed from: p4.l$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4011l> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4011l createFromParcel(Parcel parcel) {
            return new C4011l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4011l[] newArray(int i10) {
            return new C4011l[i10];
        }
    }

    public C4011l(Parcel parcel) {
        super("PRIV");
        this.f14437i = (String) C4041n0.m15463j(parcel.readString());
        this.f14438j = (byte[]) C4041n0.m15463j(parcel.createByteArray());
    }

    public C4011l(String str, byte[] bArr) {
        super("PRIV");
        this.f14437i = str;
        this.f14438j = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4011l.class != obj.getClass()) {
            return false;
        }
        C4011l c4011l = (C4011l) obj;
        return C4041n0.m15449c(this.f14437i, c4011l.f14437i) && Arrays.equals(this.f14438j, c4011l.f14438j);
    }

    public int hashCode() {
        String str = this.f14437i;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f14438j);
    }

    @Override // p221p4.AbstractC4008i
    public String toString() {
        return this.f14428h + ": owner=" + this.f14437i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14437i);
        parcel.writeByteArray(this.f14438j);
    }
}
