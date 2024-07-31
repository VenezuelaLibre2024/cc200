package p320w6;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p207o6.C3948q;

/* renamed from: w6.e */
/* loaded from: classes.dex */
public final class C5296e extends AbstractC2601a {
    public static final Parcelable.Creator<C5296e> CREATOR = new C5311l0();

    /* renamed from: h */
    public final long f20064h;

    /* renamed from: i */
    public final int f20065i;

    /* renamed from: j */
    public final int f20066j;

    /* renamed from: k */
    public final long f20067k;

    /* renamed from: l */
    public final boolean f20068l;

    /* renamed from: m */
    public final int f20069m;

    /* renamed from: n */
    public final String f20070n;

    /* renamed from: o */
    public final WorkSource f20071o;

    /* renamed from: p */
    public final zzd f20072p;

    /* renamed from: w6.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public long f20073a = 60000;

        /* renamed from: b */
        public int f20074b = 0;

        /* renamed from: c */
        public int f20075c = C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;

        /* renamed from: d */
        public long f20076d = Long.MAX_VALUE;

        /* renamed from: e */
        public boolean f20077e = false;

        /* renamed from: f */
        public int f20078f = 0;

        /* renamed from: g */
        public String f20079g = null;

        /* renamed from: h */
        public WorkSource f20080h = null;

        /* renamed from: i */
        public zzd f20081i = null;

        /* renamed from: a */
        public C5296e m21375a() {
            return new C5296e(this.f20073a, this.f20074b, this.f20075c, this.f20076d, this.f20077e, this.f20078f, this.f20079g, new WorkSource(this.f20080h), this.f20081i);
        }

        /* renamed from: b */
        public a m21376b(int i10) {
            C5291b0.m21362a(i10);
            this.f20075c = i10;
            return this;
        }
    }

    public C5296e(long j10, int i10, int i11, long j11, boolean z10, int i12, String str, WorkSource workSource, zzd zzdVar) {
        boolean z11 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z11 = false;
        }
        C2394s.m9608a(z11);
        this.f20064h = j10;
        this.f20065i = i10;
        this.f20066j = i11;
        this.f20067k = j11;
        this.f20068l = z10;
        this.f20069m = i12;
        this.f20070n = str;
        this.f20071o = workSource;
        this.f20072p = zzdVar;
    }

    /* renamed from: I */
    public long m21368I() {
        return this.f20067k;
    }

    /* renamed from: J */
    public int m21369J() {
        return this.f20065i;
    }

    /* renamed from: K */
    public long m21370K() {
        return this.f20064h;
    }

    /* renamed from: L */
    public int m21371L() {
        return this.f20066j;
    }

    /* renamed from: M */
    public final int m21372M() {
        return this.f20069m;
    }

    /* renamed from: N */
    public final WorkSource m21373N() {
        return this.f20071o;
    }

    /* renamed from: O */
    public final boolean m21374O() {
        return this.f20068l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5296e)) {
            return false;
        }
        C5296e c5296e = (C5296e) obj;
        return this.f20064h == c5296e.f20064h && this.f20065i == c5296e.f20065i && this.f20066j == c5296e.f20066j && this.f20067k == c5296e.f20067k && this.f20068l == c5296e.f20068l && this.f20069m == c5296e.f20069m && C2388q.m9592b(this.f20070n, c5296e.f20070n) && C2388q.m9592b(this.f20071o, c5296e.f20071o) && C2388q.m9592b(this.f20072p, c5296e.f20072p);
    }

    public int hashCode() {
        return C2388q.m9593c(Long.valueOf(this.f20064h), Integer.valueOf(this.f20065i), Integer.valueOf(this.f20066j), Long.valueOf(this.f20067k));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLocationRequest[");
        sb2.append(C5291b0.m21363b(this.f20066j));
        if (this.f20064h != Long.MAX_VALUE) {
            sb2.append(", maxAge=");
            zzdj.zzb(this.f20064h, sb2);
        }
        if (this.f20067k != Long.MAX_VALUE) {
            sb2.append(", duration=");
            sb2.append(this.f20067k);
            sb2.append("ms");
        }
        if (this.f20065i != 0) {
            sb2.append(", ");
            sb2.append(C5317o0.m21391b(this.f20065i));
        }
        if (this.f20068l) {
            sb2.append(", bypass");
        }
        if (this.f20069m != 0) {
            sb2.append(", ");
            sb2.append(C5295d0.m21367a(this.f20069m));
        }
        if (this.f20070n != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f20070n);
        }
        if (!C3948q.m14972d(this.f20071o)) {
            sb2.append(", workSource=");
            sb2.append(this.f20071o);
        }
        if (this.f20072p != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f20072p);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10489y(parcel, 1, m21370K());
        C2603c.m10485u(parcel, 2, m21369J());
        C2603c.m10485u(parcel, 3, m21371L());
        C2603c.m10489y(parcel, 4, m21368I());
        C2603c.m10471g(parcel, 5, this.f20068l);
        C2603c.m10454D(parcel, 6, this.f20071o, i10, false);
        C2603c.m10485u(parcel, 7, this.f20069m);
        C2603c.m10456F(parcel, 8, this.f20070n, false);
        C2603c.m10454D(parcel, 9, this.f20072p, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }

    @Deprecated
    public final String zzd() {
        return this.f20070n;
    }
}
