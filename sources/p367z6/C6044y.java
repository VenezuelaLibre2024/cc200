package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: z6.y */
/* loaded from: classes.dex */
public final class C6044y extends AbstractC2601a {
    public static final Parcelable.Creator<C6044y> CREATOR = new C6009g0();

    /* renamed from: h */
    public final float f22481h;

    /* renamed from: i */
    public final int f22482i;

    /* renamed from: j */
    public final int f22483j;

    /* renamed from: k */
    public final boolean f22484k;

    /* renamed from: l */
    public final C6042x f22485l;

    /* renamed from: z6.y$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public float f22486a;

        /* renamed from: b */
        public int f22487b;

        /* renamed from: c */
        public int f22488c;

        /* renamed from: d */
        public boolean f22489d;

        /* renamed from: e */
        public C6042x f22490e;

        public a(C6044y c6044y) {
            this.f22486a = c6044y.m24243K();
            Pair m24244L = c6044y.m24244L();
            this.f22487b = ((Integer) m24244L.first).intValue();
            this.f22488c = ((Integer) m24244L.second).intValue();
            this.f22489d = c6044y.m24242J();
            this.f22490e = c6044y.m24241I();
        }

        /* renamed from: a */
        public C6044y m24245a() {
            return new C6044y(this.f22486a, this.f22487b, this.f22488c, this.f22489d, this.f22490e);
        }

        /* renamed from: b */
        public final a m24246b(boolean z10) {
            this.f22489d = z10;
            return this;
        }

        /* renamed from: c */
        public final a m24247c(float f10) {
            this.f22486a = f10;
            return this;
        }
    }

    public C6044y(float f10, int i10, int i11, boolean z10, C6042x c6042x) {
        this.f22481h = f10;
        this.f22482i = i10;
        this.f22483j = i11;
        this.f22484k = z10;
        this.f22485l = c6042x;
    }

    /* renamed from: I */
    public C6042x m24241I() {
        return this.f22485l;
    }

    /* renamed from: J */
    public boolean m24242J() {
        return this.f22484k;
    }

    /* renamed from: K */
    public final float m24243K() {
        return this.f22481h;
    }

    /* renamed from: L */
    public final Pair m24244L() {
        return new Pair(Integer.valueOf(this.f22482i), Integer.valueOf(this.f22483j));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10481q(parcel, 2, this.f22481h);
        C2603c.m10485u(parcel, 3, this.f22482i);
        C2603c.m10485u(parcel, 4, this.f22483j);
        C2603c.m10471g(parcel, 5, m24242J());
        C2603c.m10454D(parcel, 6, m24241I(), i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
