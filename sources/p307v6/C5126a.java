package p307v6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

@Deprecated
/* renamed from: v6.a */
/* loaded from: classes.dex */
public class C5126a extends AbstractC2601a {
    public static final Parcelable.Creator<C5126a> CREATOR = new C5132g();

    /* renamed from: k */
    public static final C5126a f19367k = new C5126a();

    /* renamed from: l */
    public static final C5126a f19368l = new C5126a("unavailable");

    /* renamed from: m */
    public static final C5126a f19369m = new C5126a("unused");

    /* renamed from: h */
    public final a f19370h;

    /* renamed from: i */
    public final String f19371i;

    /* renamed from: j */
    public final String f19372j;

    /* renamed from: v6.a$a */
    /* loaded from: classes.dex */
    public enum a implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<a> CREATOR = new C5131f();

        /* renamed from: h */
        public final int f19377h;

        a(int i10) {
            this.f19377h = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f19377h);
        }
    }

    /* renamed from: v6.a$b */
    /* loaded from: classes.dex */
    public static class b extends Exception {
        public b(int i10) {
            super(String.format("ChannelIdValueType %s not supported", Integer.valueOf(i10)));
        }
    }

    public C5126a() {
        this.f19370h = a.ABSENT;
        this.f19372j = null;
        this.f19371i = null;
    }

    public C5126a(int i10, String str, String str2) {
        try {
            this.f19370h = m20801L(i10);
            this.f19371i = str;
            this.f19372j = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public C5126a(String str) {
        this.f19371i = (String) C2394s.m9619l(str);
        this.f19370h = a.STRING;
        this.f19372j = null;
    }

    /* renamed from: L */
    public static a m20801L(int i10) {
        for (a aVar : a.values()) {
            if (i10 == aVar.f19377h) {
                return aVar;
            }
        }
        throw new b(i10);
    }

    /* renamed from: I */
    public String m20802I() {
        return this.f19372j;
    }

    /* renamed from: J */
    public String m20803J() {
        return this.f19371i;
    }

    /* renamed from: K */
    public int m20804K() {
        return this.f19370h.f19377h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5126a)) {
            return false;
        }
        C5126a c5126a = (C5126a) obj;
        if (!this.f19370h.equals(c5126a.f19370h)) {
            return false;
        }
        int ordinal = this.f19370h.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            str = this.f19371i;
            str2 = c5126a.f19371i;
        } else {
            if (ordinal != 2) {
                return false;
            }
            str = this.f19372j;
            str2 = c5126a.f19372j;
        }
        return str.equals(str2);
    }

    public int hashCode() {
        int i10;
        String str;
        int hashCode = this.f19370h.hashCode() + 31;
        int ordinal = this.f19370h.ordinal();
        if (ordinal == 1) {
            i10 = hashCode * 31;
            str = this.f19371i;
        } else {
            if (ordinal != 2) {
                return hashCode;
            }
            i10 = hashCode * 31;
            str = this.f19372j;
        }
        return i10 + str.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 2, m20804K());
        C2603c.m10456F(parcel, 3, m20803J(), false);
        C2603c.m10456F(parcel, 4, m20802I(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
