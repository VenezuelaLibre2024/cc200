package p335x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: x5.b */
/* loaded from: classes.dex */
public final class C5598b extends AbstractC2601a {
    public static final Parcelable.Creator<C5598b> CREATOR = new C5614o();

    /* renamed from: h */
    public final e f20990h;

    /* renamed from: i */
    public final b f20991i;

    /* renamed from: j */
    public final String f20992j;

    /* renamed from: k */
    public final boolean f20993k;

    /* renamed from: l */
    public final int f20994l;

    /* renamed from: m */
    public final d f20995m;

    /* renamed from: n */
    public final c f20996n;

    /* renamed from: x5.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public e f20997a;

        /* renamed from: b */
        public b f20998b;

        /* renamed from: c */
        public d f20999c;

        /* renamed from: d */
        public c f21000d;

        /* renamed from: e */
        public String f21001e;

        /* renamed from: f */
        public boolean f21002f;

        /* renamed from: g */
        public int f21003g;

        public a() {
            e.a m22570I = e.m22570I();
            m22570I.m22573b(false);
            this.f20997a = m22570I.m22572a();
            b.a m22549I = b.m22549I();
            m22549I.m22558b(false);
            this.f20998b = m22549I.m22557a();
            d.a m22564I = d.m22564I();
            m22564I.m22569b(false);
            this.f20999c = m22564I.m22568a();
            c.a m22559I = c.m22559I();
            m22559I.m22563b(false);
            this.f21000d = m22559I.m22562a();
        }

        /* renamed from: a */
        public C5598b m22541a() {
            return new C5598b(this.f20997a, this.f20998b, this.f21001e, this.f21002f, this.f21003g, this.f20999c, this.f21000d);
        }

        /* renamed from: b */
        public a m22542b(boolean z10) {
            this.f21002f = z10;
            return this;
        }

        /* renamed from: c */
        public a m22543c(b bVar) {
            this.f20998b = (b) C2394s.m9619l(bVar);
            return this;
        }

        /* renamed from: d */
        public a m22544d(c cVar) {
            this.f21000d = (c) C2394s.m9619l(cVar);
            return this;
        }

        @Deprecated
        /* renamed from: e */
        public a m22545e(d dVar) {
            this.f20999c = (d) C2394s.m9619l(dVar);
            return this;
        }

        /* renamed from: f */
        public a m22546f(e eVar) {
            this.f20997a = (e) C2394s.m9619l(eVar);
            return this;
        }

        /* renamed from: g */
        public final a m22547g(String str) {
            this.f21001e = str;
            return this;
        }

        /* renamed from: h */
        public final a m22548h(int i10) {
            this.f21003g = i10;
            return this;
        }
    }

    /* renamed from: x5.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2601a {
        public static final Parcelable.Creator<b> CREATOR = new C5619t();

        /* renamed from: h */
        public final boolean f21004h;

        /* renamed from: i */
        public final String f21005i;

        /* renamed from: j */
        public final String f21006j;

        /* renamed from: k */
        public final boolean f21007k;

        /* renamed from: l */
        public final String f21008l;

        /* renamed from: m */
        public final List f21009m;

        /* renamed from: n */
        public final boolean f21010n;

        /* renamed from: x5.b$b$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            public boolean f21011a = false;

            /* renamed from: b */
            public String f21012b = null;

            /* renamed from: c */
            public String f21013c = null;

            /* renamed from: d */
            public boolean f21014d = true;

            /* renamed from: e */
            public String f21015e = null;

            /* renamed from: f */
            public List f21016f = null;

            /* renamed from: g */
            public boolean f21017g = false;

            /* renamed from: a */
            public b m22557a() {
                return new b(this.f21011a, this.f21012b, this.f21013c, this.f21014d, this.f21015e, this.f21016f, this.f21017g);
            }

            /* renamed from: b */
            public a m22558b(boolean z10) {
                this.f21011a = z10;
                return this;
            }
        }

        public b(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            C2394s.m9609b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f21004h = z10;
            if (z10) {
                C2394s.m9620m(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f21005i = str;
            this.f21006j = str2;
            this.f21007k = z11;
            Parcelable.Creator<C5598b> creator = C5598b.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f21009m = arrayList;
            this.f21008l = str3;
            this.f21010n = z12;
        }

        /* renamed from: I */
        public static a m22549I() {
            return new a();
        }

        /* renamed from: J */
        public boolean m22550J() {
            return this.f21007k;
        }

        /* renamed from: K */
        public List<String> m22551K() {
            return this.f21009m;
        }

        /* renamed from: L */
        public String m22552L() {
            return this.f21008l;
        }

        /* renamed from: M */
        public String m22553M() {
            return this.f21006j;
        }

        /* renamed from: N */
        public String m22554N() {
            return this.f21005i;
        }

        /* renamed from: O */
        public boolean m22555O() {
            return this.f21004h;
        }

        @Deprecated
        /* renamed from: P */
        public boolean m22556P() {
            return this.f21010n;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f21004h == bVar.f21004h && C2388q.m9592b(this.f21005i, bVar.f21005i) && C2388q.m9592b(this.f21006j, bVar.f21006j) && this.f21007k == bVar.f21007k && C2388q.m9592b(this.f21008l, bVar.f21008l) && C2388q.m9592b(this.f21009m, bVar.f21009m) && this.f21010n == bVar.f21010n;
        }

        public int hashCode() {
            return C2388q.m9593c(Boolean.valueOf(this.f21004h), this.f21005i, this.f21006j, Boolean.valueOf(this.f21007k), this.f21008l, this.f21009m, Boolean.valueOf(this.f21010n));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m10465a = C2603c.m10465a(parcel);
            C2603c.m10471g(parcel, 1, m22555O());
            C2603c.m10456F(parcel, 2, m22554N(), false);
            C2603c.m10456F(parcel, 3, m22553M(), false);
            C2603c.m10471g(parcel, 4, m22550J());
            C2603c.m10456F(parcel, 5, m22552L(), false);
            C2603c.m10458H(parcel, 6, m22551K(), false);
            C2603c.m10471g(parcel, 7, m22556P());
            C2603c.m10466b(parcel, m10465a);
        }
    }

    /* renamed from: x5.b$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC2601a {
        public static final Parcelable.Creator<c> CREATOR = new C5620u();

        /* renamed from: h */
        public final boolean f21018h;

        /* renamed from: i */
        public final String f21019i;

        /* renamed from: x5.b$c$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            public boolean f21020a = false;

            /* renamed from: b */
            public String f21021b;

            /* renamed from: a */
            public c m22562a() {
                return new c(this.f21020a, this.f21021b);
            }

            /* renamed from: b */
            public a m22563b(boolean z10) {
                this.f21020a = z10;
                return this;
            }
        }

        public c(boolean z10, String str) {
            if (z10) {
                C2394s.m9619l(str);
            }
            this.f21018h = z10;
            this.f21019i = str;
        }

        /* renamed from: I */
        public static a m22559I() {
            return new a();
        }

        /* renamed from: J */
        public String m22560J() {
            return this.f21019i;
        }

        /* renamed from: K */
        public boolean m22561K() {
            return this.f21018h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f21018h == cVar.f21018h && C2388q.m9592b(this.f21019i, cVar.f21019i);
        }

        public int hashCode() {
            return C2388q.m9593c(Boolean.valueOf(this.f21018h), this.f21019i);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m10465a = C2603c.m10465a(parcel);
            C2603c.m10471g(parcel, 1, m22561K());
            C2603c.m10456F(parcel, 2, m22560J(), false);
            C2603c.m10466b(parcel, m10465a);
        }
    }

    @Deprecated
    /* renamed from: x5.b$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC2601a {
        public static final Parcelable.Creator<d> CREATOR = new C5621v();

        /* renamed from: h */
        public final boolean f21022h;

        /* renamed from: i */
        public final byte[] f21023i;

        /* renamed from: j */
        public final String f21024j;

        /* renamed from: x5.b$d$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            public boolean f21025a = false;

            /* renamed from: b */
            public byte[] f21026b;

            /* renamed from: c */
            public String f21027c;

            /* renamed from: a */
            public d m22568a() {
                return new d(this.f21025a, this.f21026b, this.f21027c);
            }

            /* renamed from: b */
            public a m22569b(boolean z10) {
                this.f21025a = z10;
                return this;
            }
        }

        public d(boolean z10, byte[] bArr, String str) {
            if (z10) {
                C2394s.m9619l(bArr);
                C2394s.m9619l(str);
            }
            this.f21022h = z10;
            this.f21023i = bArr;
            this.f21024j = str;
        }

        /* renamed from: I */
        public static a m22564I() {
            return new a();
        }

        /* renamed from: J */
        public byte[] m22565J() {
            return this.f21023i;
        }

        /* renamed from: K */
        public String m22566K() {
            return this.f21024j;
        }

        /* renamed from: L */
        public boolean m22567L() {
            return this.f21022h;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f21022h == dVar.f21022h && Arrays.equals(this.f21023i, dVar.f21023i) && ((str = this.f21024j) == (str2 = dVar.f21024j) || (str != null && str.equals(str2)));
        }

        public int hashCode() {
            return (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f21022h), this.f21024j}) * 31) + Arrays.hashCode(this.f21023i);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m10465a = C2603c.m10465a(parcel);
            C2603c.m10471g(parcel, 1, m22567L());
            C2603c.m10476l(parcel, 2, m22565J(), false);
            C2603c.m10456F(parcel, 3, m22566K(), false);
            C2603c.m10466b(parcel, m10465a);
        }
    }

    /* renamed from: x5.b$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC2601a {
        public static final Parcelable.Creator<e> CREATOR = new C5622w();

        /* renamed from: h */
        public final boolean f21028h;

        /* renamed from: x5.b$e$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            public boolean f21029a = false;

            /* renamed from: a */
            public e m22572a() {
                return new e(this.f21029a);
            }

            /* renamed from: b */
            public a m22573b(boolean z10) {
                this.f21029a = z10;
                return this;
            }
        }

        public e(boolean z10) {
            this.f21028h = z10;
        }

        /* renamed from: I */
        public static a m22570I() {
            return new a();
        }

        /* renamed from: J */
        public boolean m22571J() {
            return this.f21028h;
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && this.f21028h == ((e) obj).f21028h;
        }

        public int hashCode() {
            return C2388q.m9593c(Boolean.valueOf(this.f21028h));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m10465a = C2603c.m10465a(parcel);
            C2603c.m10471g(parcel, 1, m22571J());
            C2603c.m10466b(parcel, m10465a);
        }
    }

    public C5598b(e eVar, b bVar, String str, boolean z10, int i10, d dVar, c cVar) {
        this.f20990h = (e) C2394s.m9619l(eVar);
        this.f20991i = (b) C2394s.m9619l(bVar);
        this.f20992j = str;
        this.f20993k = z10;
        this.f20994l = i10;
        if (dVar == null) {
            d.a m22564I = d.m22564I();
            m22564I.m22569b(false);
            dVar = m22564I.m22568a();
        }
        this.f20995m = dVar;
        if (cVar == null) {
            c.a m22559I = c.m22559I();
            m22559I.m22563b(false);
            cVar = m22559I.m22562a();
        }
        this.f20996n = cVar;
    }

    /* renamed from: I */
    public static a m22534I() {
        return new a();
    }

    /* renamed from: O */
    public static a m22535O(C5598b c5598b) {
        C2394s.m9619l(c5598b);
        a m22534I = m22534I();
        m22534I.m22543c(c5598b.m22536J());
        m22534I.m22546f(c5598b.m22539M());
        m22534I.m22545e(c5598b.m22538L());
        m22534I.m22544d(c5598b.m22537K());
        m22534I.m22542b(c5598b.f20993k);
        m22534I.m22548h(c5598b.f20994l);
        String str = c5598b.f20992j;
        if (str != null) {
            m22534I.m22547g(str);
        }
        return m22534I;
    }

    /* renamed from: J */
    public b m22536J() {
        return this.f20991i;
    }

    /* renamed from: K */
    public c m22537K() {
        return this.f20996n;
    }

    /* renamed from: L */
    public d m22538L() {
        return this.f20995m;
    }

    /* renamed from: M */
    public e m22539M() {
        return this.f20990h;
    }

    /* renamed from: N */
    public boolean m22540N() {
        return this.f20993k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5598b)) {
            return false;
        }
        C5598b c5598b = (C5598b) obj;
        return C2388q.m9592b(this.f20990h, c5598b.f20990h) && C2388q.m9592b(this.f20991i, c5598b.f20991i) && C2388q.m9592b(this.f20995m, c5598b.f20995m) && C2388q.m9592b(this.f20996n, c5598b.f20996n) && C2388q.m9592b(this.f20992j, c5598b.f20992j) && this.f20993k == c5598b.f20993k && this.f20994l == c5598b.f20994l;
    }

    public int hashCode() {
        return C2388q.m9593c(this.f20990h, this.f20991i, this.f20995m, this.f20996n, this.f20992j, Boolean.valueOf(this.f20993k));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, m22539M(), i10, false);
        C2603c.m10454D(parcel, 2, m22536J(), i10, false);
        C2603c.m10456F(parcel, 3, this.f20992j, false);
        C2603c.m10471g(parcel, 4, m22540N());
        C2603c.m10485u(parcel, 5, this.f20994l);
        C2603c.m10454D(parcel, 6, m22538L(), i10, false);
        C2603c.m10454D(parcel, 7, m22537K(), i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
