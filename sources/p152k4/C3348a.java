package p152k4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p155k7.C3370g;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p264s3.C4528z1;

/* renamed from: k4.a */
/* loaded from: classes.dex */
public final class C3348a implements Parcelable {
    public static final Parcelable.Creator<C3348a> CREATOR = new a();

    /* renamed from: h */
    public final b[] f11656h;

    /* renamed from: i */
    public final long f11657i;

    /* renamed from: k4.a$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C3348a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C3348a createFromParcel(Parcel parcel) {
            return new C3348a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C3348a[] newArray(int i10) {
            return new C3348a[i10];
        }
    }

    /* renamed from: k4.a$b */
    /* loaded from: classes.dex */
    public interface b extends Parcelable {
        /* renamed from: G */
        default byte[] mo12417G() {
            return null;
        }

        /* renamed from: n */
        default C4463m1 mo12418n() {
            return null;
        }

        /* renamed from: z */
        default void mo12419z(C4528z1.b bVar) {
        }
    }

    public C3348a(long j10, List<? extends b> list) {
        this(j10, (b[]) list.toArray(new b[0]));
    }

    public C3348a(long j10, b... bVarArr) {
        this.f11657i = j10;
        this.f11656h = bVarArr;
    }

    public C3348a(Parcel parcel) {
        this.f11656h = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f11656h;
            if (i10 >= bVarArr.length) {
                this.f11657i = parcel.readLong();
                return;
            } else {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            }
        }
    }

    public C3348a(List<? extends b> list) {
        this((b[]) list.toArray(new b[0]));
    }

    public C3348a(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    /* renamed from: a */
    public C3348a m12410a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new C3348a(this.f11657i, (b[]) C4041n0.m15404F0(this.f11656h, bVarArr));
    }

    /* renamed from: b */
    public C3348a m12411b(C3348a c3348a) {
        return c3348a == null ? this : m12410a(c3348a.f11656h);
    }

    /* renamed from: d */
    public C3348a m12412d(long j10) {
        return this.f11657i == j10 ? this : new C3348a(j10, this.f11656h);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public b m12413e(int i10) {
        return this.f11656h[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3348a.class != obj.getClass()) {
            return false;
        }
        C3348a c3348a = (C3348a) obj;
        return Arrays.equals(this.f11656h, c3348a.f11656h) && this.f11657i == c3348a.f11657i;
    }

    /* renamed from: f */
    public int m12414f() {
        return this.f11656h.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f11656h) * 31) + C3370g.m12538b(this.f11657i);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f11656h));
        if (this.f11657i == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f11657i;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11656h.length);
        for (b bVar : this.f11656h) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f11657i);
    }
}
