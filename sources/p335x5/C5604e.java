package p335x5;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: x5.e */
/* loaded from: classes.dex */
public class C5604e extends AbstractC2601a {
    public static final Parcelable.Creator<C5604e> CREATOR = new C5618s();

    /* renamed from: h */
    public final String f21032h;

    /* renamed from: i */
    public final String f21033i;

    /* renamed from: j */
    public final String f21034j;

    /* renamed from: k */
    public final String f21035k;

    /* renamed from: l */
    public final boolean f21036l;

    /* renamed from: m */
    public final int f21037m;

    /* renamed from: x5.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public String f21038a;

        /* renamed from: b */
        public String f21039b;

        /* renamed from: c */
        public String f21040c;

        /* renamed from: d */
        public String f21041d;

        /* renamed from: e */
        public boolean f21042e;

        /* renamed from: f */
        public int f21043f;

        /* renamed from: a */
        public C5604e m22581a() {
            return new C5604e(this.f21038a, this.f21039b, this.f21040c, this.f21041d, this.f21042e, this.f21043f);
        }

        /* renamed from: b */
        public a m22582b(String str) {
            this.f21039b = str;
            return this;
        }

        /* renamed from: c */
        public a m22583c(String str) {
            this.f21041d = str;
            return this;
        }

        @Deprecated
        /* renamed from: d */
        public a m22584d(boolean z10) {
            this.f21042e = z10;
            return this;
        }

        /* renamed from: e */
        public a m22585e(String str) {
            C2394s.m9619l(str);
            this.f21038a = str;
            return this;
        }

        /* renamed from: f */
        public final a m22586f(String str) {
            this.f21040c = str;
            return this;
        }

        /* renamed from: g */
        public final a m22587g(int i10) {
            this.f21043f = i10;
            return this;
        }
    }

    public C5604e(String str, String str2, String str3, String str4, boolean z10, int i10) {
        C2394s.m9619l(str);
        this.f21032h = str;
        this.f21033i = str2;
        this.f21034j = str3;
        this.f21035k = str4;
        this.f21036l = z10;
        this.f21037m = i10;
    }

    /* renamed from: I */
    public static a m22575I() {
        return new a();
    }

    /* renamed from: N */
    public static a m22576N(C5604e c5604e) {
        C2394s.m9619l(c5604e);
        a m22575I = m22575I();
        m22575I.m22585e(c5604e.m22579L());
        m22575I.m22583c(c5604e.m22578K());
        m22575I.m22582b(c5604e.m22577J());
        m22575I.m22584d(c5604e.f21036l);
        m22575I.m22587g(c5604e.f21037m);
        String str = c5604e.f21034j;
        if (str != null) {
            m22575I.m22586f(str);
        }
        return m22575I;
    }

    /* renamed from: J */
    public String m22577J() {
        return this.f21033i;
    }

    /* renamed from: K */
    public String m22578K() {
        return this.f21035k;
    }

    /* renamed from: L */
    public String m22579L() {
        return this.f21032h;
    }

    @Deprecated
    /* renamed from: M */
    public boolean m22580M() {
        return this.f21036l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5604e)) {
            return false;
        }
        C5604e c5604e = (C5604e) obj;
        return C2388q.m9592b(this.f21032h, c5604e.f21032h) && C2388q.m9592b(this.f21035k, c5604e.f21035k) && C2388q.m9592b(this.f21033i, c5604e.f21033i) && C2388q.m9592b(Boolean.valueOf(this.f21036l), Boolean.valueOf(c5604e.f21036l)) && this.f21037m == c5604e.f21037m;
    }

    public int hashCode() {
        return C2388q.m9593c(this.f21032h, this.f21033i, this.f21035k, Boolean.valueOf(this.f21036l), Integer.valueOf(this.f21037m));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, m22579L(), false);
        C2603c.m10456F(parcel, 2, m22577J(), false);
        C2603c.m10456F(parcel, 3, this.f21034j, false);
        C2603c.m10456F(parcel, 4, m22578K(), false);
        C2603c.m10471g(parcel, 5, m22580M());
        C2603c.m10485u(parcel, 6, this.f21037m);
        C2603c.m10466b(parcel, m10465a);
    }
}
