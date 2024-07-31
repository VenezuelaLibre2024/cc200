package p250r4;

import android.os.Parcel;
import android.os.Parcelable;
import p222p5.C4015a0;
import p222p5.C4041n0;

/* renamed from: r4.a */
/* loaded from: classes.dex */
public final class C4293a extends AbstractC4294b {
    public static final Parcelable.Creator<C4293a> CREATOR = new a();

    /* renamed from: h */
    public final long f15576h;

    /* renamed from: i */
    public final long f15577i;

    /* renamed from: j */
    public final byte[] f15578j;

    /* renamed from: r4.a$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4293a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4293a createFromParcel(Parcel parcel) {
            return new C4293a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4293a[] newArray(int i10) {
            return new C4293a[i10];
        }
    }

    public C4293a(long j10, byte[] bArr, long j11) {
        this.f15576h = j11;
        this.f15577i = j10;
        this.f15578j = bArr;
    }

    public C4293a(Parcel parcel) {
        this.f15576h = parcel.readLong();
        this.f15577i = parcel.readLong();
        this.f15578j = (byte[]) C4041n0.m15463j(parcel.createByteArray());
    }

    public /* synthetic */ C4293a(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static C4293a m16518a(C4015a0 c4015a0, int i10, long j10) {
        long m15212I = c4015a0.m15212I();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        c4015a0.m15237l(bArr, 0, i11);
        return new C4293a(m15212I, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f15576h);
        parcel.writeLong(this.f15577i);
        parcel.writeByteArray(this.f15578j);
    }
}
