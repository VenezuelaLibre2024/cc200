package p250r4;

import android.os.Parcel;
import android.os.Parcelable;
import p222p5.C4015a0;
import p222p5.C4033j0;

/* renamed from: r4.g */
/* loaded from: classes.dex */
public final class C4299g extends AbstractC4294b {
    public static final Parcelable.Creator<C4299g> CREATOR = new a();

    /* renamed from: h */
    public final long f15612h;

    /* renamed from: i */
    public final long f15613i;

    /* renamed from: r4.g$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4299g> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4299g createFromParcel(Parcel parcel) {
            return new C4299g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4299g[] newArray(int i10) {
            return new C4299g[i10];
        }
    }

    public C4299g(long j10, long j11) {
        this.f15612h = j10;
        this.f15613i = j11;
    }

    public /* synthetic */ C4299g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    /* renamed from: a */
    public static C4299g m16541a(C4015a0 c4015a0, long j10, C4033j0 c4033j0) {
        long m16542b = m16542b(c4015a0, j10);
        return new C4299g(m16542b, c4033j0.m15363b(m16542b));
    }

    /* renamed from: b */
    public static long m16542b(C4015a0 c4015a0, long j10) {
        long m15210G = c4015a0.m15210G();
        if ((128 & m15210G) != 0) {
            return 8589934591L & ((((m15210G & 1) << 32) | c4015a0.m15212I()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f15612h);
        parcel.writeLong(this.f15613i);
    }
}
