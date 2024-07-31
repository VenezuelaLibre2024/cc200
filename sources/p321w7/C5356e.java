package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w7.e */
/* loaded from: classes.dex */
public class C5356e extends AbstractC2601a {
    public static final Parcelable.Creator<C5356e> CREATOR = new C5425y1();

    /* renamed from: h */
    public final String f20164h;

    /* renamed from: i */
    public final String f20165i;

    /* renamed from: j */
    public final String f20166j;

    /* renamed from: k */
    public final String f20167k;

    /* renamed from: l */
    public final boolean f20168l;

    /* renamed from: m */
    public final String f20169m;

    /* renamed from: n */
    public final boolean f20170n;

    /* renamed from: o */
    public String f20171o;

    /* renamed from: p */
    public int f20172p;

    /* renamed from: q */
    public String f20173q;

    /* renamed from: w7.e$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public String f20174a;

        /* renamed from: b */
        public String f20175b;

        /* renamed from: c */
        public String f20176c;

        /* renamed from: d */
        public boolean f20177d;

        /* renamed from: e */
        public String f20178e;

        /* renamed from: f */
        public boolean f20179f;

        /* renamed from: g */
        public String f20180g;

        public a() {
            this.f20179f = false;
        }

        /* renamed from: a */
        public C5356e m21483a() {
            if (this.f20174a != null) {
                return new C5356e(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        /* renamed from: b */
        public a m21484b(String str, boolean z10, String str2) {
            this.f20176c = str;
            this.f20177d = z10;
            this.f20178e = str2;
            return this;
        }

        /* renamed from: c */
        public a m21485c(String str) {
            this.f20180g = str;
            return this;
        }

        /* renamed from: d */
        public a m21486d(boolean z10) {
            this.f20179f = z10;
            return this;
        }

        /* renamed from: e */
        public a m21487e(String str) {
            this.f20175b = str;
            return this;
        }

        /* renamed from: f */
        public a m21488f(String str) {
            this.f20174a = str;
            return this;
        }
    }

    public C5356e(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7) {
        this.f20164h = str;
        this.f20165i = str2;
        this.f20166j = str3;
        this.f20167k = str4;
        this.f20168l = z10;
        this.f20169m = str5;
        this.f20170n = z11;
        this.f20171o = str6;
        this.f20172p = i10;
        this.f20173q = str7;
    }

    public C5356e(a aVar) {
        this.f20164h = aVar.f20174a;
        this.f20165i = aVar.f20175b;
        this.f20166j = null;
        this.f20167k = aVar.f20176c;
        this.f20168l = aVar.f20177d;
        this.f20169m = aVar.f20178e;
        this.f20170n = aVar.f20179f;
        this.f20173q = aVar.f20180g;
    }

    /* renamed from: O */
    public static a m21465O() {
        return new a();
    }

    /* renamed from: S */
    public static C5356e m21466S() {
        return new C5356e(new a());
    }

    /* renamed from: I */
    public boolean m21467I() {
        return this.f20170n;
    }

    /* renamed from: J */
    public boolean m21468J() {
        return this.f20168l;
    }

    /* renamed from: K */
    public String m21469K() {
        return this.f20169m;
    }

    /* renamed from: L */
    public String m21470L() {
        return this.f20167k;
    }

    /* renamed from: M */
    public String m21471M() {
        return this.f20165i;
    }

    /* renamed from: N */
    public String m21472N() {
        return this.f20164h;
    }

    /* renamed from: P */
    public final int m21473P() {
        return this.f20172p;
    }

    /* renamed from: Q */
    public final void m21474Q(int i10) {
        this.f20172p = i10;
    }

    /* renamed from: R */
    public final void m21475R(String str) {
        this.f20171o = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, m21472N(), false);
        C2603c.m10456F(parcel, 2, m21471M(), false);
        C2603c.m10456F(parcel, 3, this.f20166j, false);
        C2603c.m10456F(parcel, 4, m21470L(), false);
        C2603c.m10471g(parcel, 5, m21468J());
        C2603c.m10456F(parcel, 6, m21469K(), false);
        C2603c.m10471g(parcel, 7, m21467I());
        C2603c.m10456F(parcel, 8, this.f20171o, false);
        C2603c.m10485u(parcel, 9, this.f20172p);
        C2603c.m10456F(parcel, 10, this.f20173q, false);
        C2603c.m10466b(parcel, m10465a);
    }

    public final String zzc() {
        return this.f20173q;
    }

    public final String zzd() {
        return this.f20166j;
    }

    public final String zze() {
        return this.f20171o;
    }
}
