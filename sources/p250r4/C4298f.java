package p250r4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p222p5.C4015a0;

/* renamed from: r4.f */
/* loaded from: classes.dex */
public final class C4298f extends AbstractC4294b {
    public static final Parcelable.Creator<C4298f> CREATOR = new a();

    /* renamed from: h */
    public final List<c> f15598h;

    /* renamed from: r4.f$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4298f> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4298f createFromParcel(Parcel parcel) {
            return new C4298f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4298f[] newArray(int i10) {
            return new C4298f[i10];
        }
    }

    /* renamed from: r4.f$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f15599a;

        /* renamed from: b */
        public final long f15600b;

        public b(int i10, long j10) {
            this.f15599a = i10;
            this.f15600b = j10;
        }

        public /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* renamed from: c */
        public static b m16533c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* renamed from: d */
        public final void m16534d(Parcel parcel) {
            parcel.writeInt(this.f15599a);
            parcel.writeLong(this.f15600b);
        }
    }

    /* renamed from: r4.f$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final long f15601a;

        /* renamed from: b */
        public final boolean f15602b;

        /* renamed from: c */
        public final boolean f15603c;

        /* renamed from: d */
        public final boolean f15604d;

        /* renamed from: e */
        public final long f15605e;

        /* renamed from: f */
        public final List<b> f15606f;

        /* renamed from: g */
        public final boolean f15607g;

        /* renamed from: h */
        public final long f15608h;

        /* renamed from: i */
        public final int f15609i;

        /* renamed from: j */
        public final int f15610j;

        /* renamed from: k */
        public final int f15611k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f15601a = j10;
            this.f15602b = z10;
            this.f15603c = z11;
            this.f15604d = z12;
            this.f15606f = Collections.unmodifiableList(list);
            this.f15605e = j11;
            this.f15607g = z13;
            this.f15608h = j12;
            this.f15609i = i10;
            this.f15610j = i11;
            this.f15611k = i12;
        }

        public c(Parcel parcel) {
            this.f15601a = parcel.readLong();
            this.f15602b = parcel.readByte() == 1;
            this.f15603c = parcel.readByte() == 1;
            this.f15604d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.m16533c(parcel));
            }
            this.f15606f = Collections.unmodifiableList(arrayList);
            this.f15605e = parcel.readLong();
            this.f15607g = parcel.readByte() == 1;
            this.f15608h = parcel.readLong();
            this.f15609i = parcel.readInt();
            this.f15610j = parcel.readInt();
            this.f15611k = parcel.readInt();
        }

        /* renamed from: d */
        public static c m16538d(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: e */
        public static c m16539e(C4015a0 c4015a0) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int i12;
            boolean z12;
            boolean z13;
            long j12;
            long m15212I = c4015a0.m15212I();
            boolean z14 = (c4015a0.m15210G() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = -9223372036854775807L;
                z11 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                z12 = false;
            } else {
                int m15210G = c4015a0.m15210G();
                boolean z15 = (m15210G & 128) != 0;
                boolean z16 = (m15210G & 64) != 0;
                boolean z17 = (m15210G & 32) != 0;
                long m15212I2 = z16 ? c4015a0.m15212I() : -9223372036854775807L;
                if (!z16) {
                    int m15210G2 = c4015a0.m15210G();
                    ArrayList arrayList3 = new ArrayList(m15210G2);
                    for (int i13 = 0; i13 < m15210G2; i13++) {
                        arrayList3.add(new b(c4015a0.m15210G(), c4015a0.m15212I(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long m15210G3 = c4015a0.m15210G();
                    boolean z18 = (128 & m15210G3) != 0;
                    j12 = ((((m15210G3 & 1) << 32) | c4015a0.m15212I()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = -9223372036854775807L;
                }
                int m15216M = c4015a0.m15216M();
                int m15210G4 = c4015a0.m15210G();
                z12 = z16;
                i12 = c4015a0.m15210G();
                j11 = j12;
                arrayList = arrayList2;
                long j13 = m15212I2;
                i10 = m15216M;
                i11 = m15210G4;
                j10 = j13;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new c(m15212I, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, i12);
        }

        /* renamed from: f */
        public final void m16540f(Parcel parcel) {
            parcel.writeLong(this.f15601a);
            parcel.writeByte(this.f15602b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f15603c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f15604d ? (byte) 1 : (byte) 0);
            int size = this.f15606f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f15606f.get(i10).m16534d(parcel);
            }
            parcel.writeLong(this.f15605e);
            parcel.writeByte(this.f15607g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f15608h);
            parcel.writeInt(this.f15609i);
            parcel.writeInt(this.f15610j);
            parcel.writeInt(this.f15611k);
        }
    }

    public C4298f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.m16538d(parcel));
        }
        this.f15598h = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ C4298f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public C4298f(List<c> list) {
        this.f15598h = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public static C4298f m16528a(C4015a0 c4015a0) {
        int m15210G = c4015a0.m15210G();
        ArrayList arrayList = new ArrayList(m15210G);
        for (int i10 = 0; i10 < m15210G; i10++) {
            arrayList.add(c.m16539e(c4015a0));
        }
        return new C4298f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f15598h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f15598h.get(i11).m16540f(parcel);
        }
    }
}
