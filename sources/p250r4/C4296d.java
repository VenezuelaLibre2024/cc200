package p250r4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p222p5.C4015a0;
import p222p5.C4033j0;

/* renamed from: r4.d */
/* loaded from: classes.dex */
public final class C4296d extends AbstractC4294b {
    public static final Parcelable.Creator<C4296d> CREATOR = new a();

    /* renamed from: h */
    public final long f15582h;

    /* renamed from: i */
    public final boolean f15583i;

    /* renamed from: j */
    public final boolean f15584j;

    /* renamed from: k */
    public final boolean f15585k;

    /* renamed from: l */
    public final boolean f15586l;

    /* renamed from: m */
    public final long f15587m;

    /* renamed from: n */
    public final long f15588n;

    /* renamed from: o */
    public final List<b> f15589o;

    /* renamed from: p */
    public final boolean f15590p;

    /* renamed from: q */
    public final long f15591q;

    /* renamed from: r */
    public final int f15592r;

    /* renamed from: s */
    public final int f15593s;

    /* renamed from: t */
    public final int f15594t;

    /* renamed from: r4.d$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4296d> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4296d createFromParcel(Parcel parcel) {
            return new C4296d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4296d[] newArray(int i10) {
            return new C4296d[i10];
        }
    }

    /* renamed from: r4.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f15595a;

        /* renamed from: b */
        public final long f15596b;

        /* renamed from: c */
        public final long f15597c;

        public b(int i10, long j10, long j11) {
            this.f15595a = i10;
            this.f15596b = j10;
            this.f15597c = j11;
        }

        public /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        /* renamed from: a */
        public static b m16524a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void m16525b(Parcel parcel) {
            parcel.writeInt(this.f15595a);
            parcel.writeLong(this.f15596b);
            parcel.writeLong(this.f15597c);
        }
    }

    public C4296d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f15582h = j10;
        this.f15583i = z10;
        this.f15584j = z11;
        this.f15585k = z12;
        this.f15586l = z13;
        this.f15587m = j11;
        this.f15588n = j12;
        this.f15589o = Collections.unmodifiableList(list);
        this.f15590p = z14;
        this.f15591q = j13;
        this.f15592r = i10;
        this.f15593s = i11;
        this.f15594t = i12;
    }

    public C4296d(Parcel parcel) {
        this.f15582h = parcel.readLong();
        this.f15583i = parcel.readByte() == 1;
        this.f15584j = parcel.readByte() == 1;
        this.f15585k = parcel.readByte() == 1;
        this.f15586l = parcel.readByte() == 1;
        this.f15587m = parcel.readLong();
        this.f15588n = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.m16524a(parcel));
        }
        this.f15589o = Collections.unmodifiableList(arrayList);
        this.f15590p = parcel.readByte() == 1;
        this.f15591q = parcel.readLong();
        this.f15592r = parcel.readInt();
        this.f15593s = parcel.readInt();
        this.f15594t = parcel.readInt();
    }

    public /* synthetic */ C4296d(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static C4296d m16521a(C4015a0 c4015a0, long j10, C4033j0 c4033j0) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int i10;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        long j13;
        long m15212I = c4015a0.m15212I();
        boolean z15 = (c4015a0.m15210G() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z15) {
            list = emptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z13 = false;
        } else {
            int m15210G = c4015a0.m15210G();
            boolean z16 = (m15210G & 128) != 0;
            boolean z17 = (m15210G & 64) != 0;
            boolean z18 = (m15210G & 32) != 0;
            boolean z19 = (m15210G & 16) != 0;
            long m16542b = (!z17 || z19) ? -9223372036854775807L : C4299g.m16542b(c4015a0, j10);
            if (!z17) {
                int m15210G2 = c4015a0.m15210G();
                ArrayList arrayList = new ArrayList(m15210G2);
                for (int i13 = 0; i13 < m15210G2; i13++) {
                    int m15210G3 = c4015a0.m15210G();
                    long m16542b2 = !z19 ? C4299g.m16542b(c4015a0, j10) : -9223372036854775807L;
                    arrayList.add(new b(m15210G3, m16542b2, c4033j0.m15363b(m16542b2), null));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long m15210G4 = c4015a0.m15210G();
                boolean z20 = (128 & m15210G4) != 0;
                j13 = ((((m15210G4 & 1) << 32) | c4015a0.m15212I()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = -9223372036854775807L;
            }
            i10 = c4015a0.m15216M();
            z13 = z17;
            i11 = c4015a0.m15210G();
            i12 = c4015a0.m15210G();
            list = emptyList;
            long j14 = m16542b;
            z12 = z14;
            j12 = j13;
            z11 = z19;
            z10 = z16;
            j11 = j14;
        }
        return new C4296d(m15212I, z15, z10, z13, z11, j11, c4033j0.m15363b(j11), list, z12, j12, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f15582h);
        parcel.writeByte(this.f15583i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15584j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15585k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15586l ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f15587m);
        parcel.writeLong(this.f15588n);
        int size = this.f15589o.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f15589o.get(i11).m16525b(parcel);
        }
        parcel.writeByte(this.f15590p ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f15591q);
        parcel.writeInt(this.f15592r);
        parcel.writeInt(this.f15593s);
        parcel.writeInt(this.f15594t);
    }
}
