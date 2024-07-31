package p235q4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p109h7.C2428k;
import p126i7.AbstractC2637n;
import p152k4.C3348a;
import p222p5.C4014a;
import p222p5.C4041n0;
import p235q4.C4165c;

/* renamed from: q4.c */
/* loaded from: classes.dex */
public final class C4165c implements C3348a.b {
    public static final Parcelable.Creator<C4165c> CREATOR = new a();

    /* renamed from: h */
    public final List<b> f14969h;

    /* renamed from: q4.c$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4165c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4165c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new C4165c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4165c[] newArray(int i10) {
            return new C4165c[i10];
        }
    }

    /* renamed from: q4.c$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable {

        /* renamed from: h */
        public final long f14971h;

        /* renamed from: i */
        public final long f14972i;

        /* renamed from: j */
        public final int f14973j;

        /* renamed from: k */
        public static final Comparator<b> f14970k = new Comparator() { // from class: q4.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m16021b;
                m16021b = C4165c.b.m16021b((C4165c.b) obj, (C4165c.b) obj2);
                return m16021b;
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: q4.c$b$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            C4014a.m15195a(j10 < j11);
            this.f14971h = j10;
            this.f14972i = j11;
            this.f14973j = i10;
        }

        /* renamed from: b */
        public static /* synthetic */ int m16021b(b bVar, b bVar2) {
            return AbstractC2637n.m10705j().mo10707e(bVar.f14971h, bVar2.f14971h).mo10707e(bVar.f14972i, bVar2.f14972i).mo10706d(bVar.f14973j, bVar2.f14973j).mo10711i();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f14971h == bVar.f14971h && this.f14972i == bVar.f14972i && this.f14973j == bVar.f14973j;
        }

        public int hashCode() {
            return C2428k.m9689b(Long.valueOf(this.f14971h), Long.valueOf(this.f14972i), Integer.valueOf(this.f14973j));
        }

        public String toString() {
            return C4041n0.m15397C("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f14971h), Long.valueOf(this.f14972i), Integer.valueOf(this.f14973j));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f14971h);
            parcel.writeLong(this.f14972i);
            parcel.writeInt(this.f14973j);
        }
    }

    public C4165c(List<b> list) {
        this.f14969h = list;
        C4014a.m15195a(!m16017a(list));
    }

    /* renamed from: a */
    public static boolean m16017a(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f14972i;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f14971h < j10) {
                return true;
            }
            j10 = list.get(i10).f14972i;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4165c.class != obj.getClass()) {
            return false;
        }
        return this.f14969h.equals(((C4165c) obj).f14969h);
    }

    public int hashCode() {
        return this.f14969h.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f14969h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f14969h);
    }
}
