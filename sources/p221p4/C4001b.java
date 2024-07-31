package p221p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p222p5.C4041n0;

/* renamed from: p4.b */
/* loaded from: classes.dex */
public final class C4001b extends AbstractC4008i {
    public static final Parcelable.Creator<C4001b> CREATOR = new a();

    /* renamed from: i */
    public final byte[] f14403i;

    /* renamed from: p4.b$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4001b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4001b createFromParcel(Parcel parcel) {
            return new C4001b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4001b[] newArray(int i10) {
            return new C4001b[i10];
        }
    }

    public C4001b(Parcel parcel) {
        super((String) C4041n0.m15463j(parcel.readString()));
        this.f14403i = (byte[]) C4041n0.m15463j(parcel.createByteArray());
    }

    public C4001b(String str, byte[] bArr) {
        super(str);
        this.f14403i = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4001b.class != obj.getClass()) {
            return false;
        }
        C4001b c4001b = (C4001b) obj;
        return this.f14428h.equals(c4001b.f14428h) && Arrays.equals(this.f14403i, c4001b.f14403i);
    }

    public int hashCode() {
        return ((527 + this.f14428h.hashCode()) * 31) + Arrays.hashCode(this.f14403i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14428h);
        parcel.writeByteArray(this.f14403i);
    }
}
