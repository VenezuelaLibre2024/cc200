package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p079f6.C1841a;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p207o6.C3948q;
import p320w6.C5291b0;
import p320w6.C5295d0;
import p320w6.C5317o0;
import p320w6.C5335x0;

/* loaded from: classes.dex */
public final class LocationRequest extends AbstractC2601a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C5335x0();

    /* renamed from: h */
    public int f4534h;

    /* renamed from: i */
    public long f4535i;

    /* renamed from: j */
    public long f4536j;

    /* renamed from: k */
    public long f4537k;

    /* renamed from: l */
    public long f4538l;

    /* renamed from: m */
    public int f4539m;

    /* renamed from: n */
    public float f4540n;

    /* renamed from: o */
    public boolean f4541o;

    /* renamed from: p */
    public long f4542p;

    /* renamed from: q */
    public final int f4543q;

    /* renamed from: r */
    public final int f4544r;

    /* renamed from: s */
    public final String f4545s;

    /* renamed from: t */
    public final boolean f4546t;

    /* renamed from: u */
    public final WorkSource f4547u;

    /* renamed from: v */
    public final zzd f4548v;

    /* renamed from: com.google.android.gms.location.LocationRequest$a */
    /* loaded from: classes.dex */
    public static final class C1178a {

        /* renamed from: a */
        public int f4549a;

        /* renamed from: b */
        public long f4550b;

        /* renamed from: c */
        public long f4551c;

        /* renamed from: d */
        public long f4552d;

        /* renamed from: e */
        public long f4553e;

        /* renamed from: f */
        public int f4554f;

        /* renamed from: g */
        public float f4555g;

        /* renamed from: h */
        public boolean f4556h;

        /* renamed from: i */
        public long f4557i;

        /* renamed from: j */
        public int f4558j;

        /* renamed from: k */
        public int f4559k;

        /* renamed from: l */
        public String f4560l;

        /* renamed from: m */
        public boolean f4561m;

        /* renamed from: n */
        public WorkSource f4562n;

        /* renamed from: o */
        public zzd f4563o;

        public C1178a(int i10, long j10) {
            C2394s.m9609b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            C5291b0.m21362a(i10);
            this.f4549a = i10;
            this.f4550b = j10;
            this.f4551c = -1L;
            this.f4552d = 0L;
            this.f4553e = Long.MAX_VALUE;
            this.f4554f = C1841a.e.API_PRIORITY_OTHER;
            this.f4555g = 0.0f;
            this.f4556h = true;
            this.f4557i = -1L;
            this.f4558j = 0;
            this.f4559k = 0;
            this.f4560l = null;
            this.f4561m = false;
            this.f4562n = null;
            this.f4563o = null;
        }

        public C1178a(long j10) {
            C2394s.m9609b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f4550b = j10;
            this.f4549a = C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
            this.f4551c = -1L;
            this.f4552d = 0L;
            this.f4553e = Long.MAX_VALUE;
            this.f4554f = C1841a.e.API_PRIORITY_OTHER;
            this.f4555g = 0.0f;
            this.f4556h = true;
            this.f4557i = -1L;
            this.f4558j = 0;
            this.f4559k = 0;
            this.f4560l = null;
            this.f4561m = false;
            this.f4562n = null;
            this.f4563o = null;
        }

        public C1178a(LocationRequest locationRequest) {
            this.f4549a = locationRequest.m5040R();
            this.f4550b = locationRequest.m5034L();
            this.f4551c = locationRequest.m5039Q();
            this.f4552d = locationRequest.m5036N();
            this.f4553e = locationRequest.m5032J();
            this.f4554f = locationRequest.m5037O();
            this.f4555g = locationRequest.m5038P();
            this.f4556h = locationRequest.m5043U();
            this.f4557i = locationRequest.m5035M();
            this.f4558j = locationRequest.m5033K();
            this.f4559k = locationRequest.m5048Z();
            this.f4560l = locationRequest.zzd();
            this.f4561m = locationRequest.m5051c0();
            this.f4562n = locationRequest.m5049a0();
            this.f4563o = locationRequest.m5050b0();
        }

        /* renamed from: a */
        public LocationRequest m5052a() {
            int i10 = this.f4549a;
            long j10 = this.f4550b;
            long j11 = this.f4551c;
            if (j11 == -1) {
                j11 = j10;
            } else if (i10 != 105) {
                j11 = Math.min(j11, j10);
            }
            long max = Math.max(this.f4552d, this.f4550b);
            long j12 = this.f4553e;
            int i11 = this.f4554f;
            float f10 = this.f4555g;
            boolean z10 = this.f4556h;
            long j13 = this.f4557i;
            return new LocationRequest(i10, j10, j11, max, Long.MAX_VALUE, j12, i11, f10, z10, j13 == -1 ? this.f4550b : j13, this.f4558j, this.f4559k, this.f4560l, this.f4561m, new WorkSource(this.f4562n), this.f4563o);
        }

        /* renamed from: b */
        public C1178a m5053b(long j10) {
            C2394s.m9609b(j10 > 0, "durationMillis must be greater than 0");
            this.f4553e = j10;
            return this;
        }

        /* renamed from: c */
        public C1178a m5054c(int i10) {
            C5317o0.m21390a(i10);
            this.f4558j = i10;
            return this;
        }

        /* renamed from: d */
        public C1178a m5055d(long j10) {
            C2394s.m9609b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f4550b = j10;
            return this;
        }

        /* renamed from: e */
        public C1178a m5056e(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            C2394s.m9609b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f4557i = j10;
            return this;
        }

        /* renamed from: f */
        public C1178a m5057f(float f10) {
            C2394s.m9609b(f10 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f4555g = f10;
            return this;
        }

        /* renamed from: g */
        public C1178a m5058g(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            C2394s.m9609b(z10, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f4551c = j10;
            return this;
        }

        /* renamed from: h */
        public C1178a m5059h(int i10) {
            C5291b0.m21362a(i10);
            this.f4549a = i10;
            return this;
        }

        /* renamed from: i */
        public C1178a m5060i(boolean z10) {
            this.f4556h = z10;
            return this;
        }

        /* renamed from: j */
        public final C1178a m5061j(boolean z10) {
            this.f4561m = z10;
            return this;
        }

        @Deprecated
        /* renamed from: k */
        public final C1178a m5062k(String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.f4560l = str;
            }
            return this;
        }

        /* renamed from: l */
        public final C1178a m5063l(int i10) {
            boolean z10;
            int i11 = 2;
            if (i10 == 0 || i10 == 1) {
                i11 = i10;
            } else {
                if (i10 != 2) {
                    i11 = i10;
                    z10 = false;
                    C2394s.m9610c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
                    this.f4559k = i11;
                    return this;
                }
                i10 = 2;
            }
            z10 = true;
            C2394s.m9610c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
            this.f4559k = i11;
            return this;
        }

        /* renamed from: m */
        public final C1178a m5064m(WorkSource workSource) {
            this.f4562n = workSource;
            return this;
        }
    }

    @Deprecated
    public LocationRequest() {
        this(C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, C1841a.e.API_PRIORITY_OTHER, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, String str, boolean z11, WorkSource workSource, zzd zzdVar) {
        this.f4534h = i10;
        long j16 = j10;
        this.f4535i = j16;
        this.f4536j = j11;
        this.f4537k = j12;
        this.f4538l = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f4539m = i11;
        this.f4540n = f10;
        this.f4541o = z10;
        this.f4542p = j15 != -1 ? j15 : j16;
        this.f4543q = i12;
        this.f4544r = i13;
        this.f4545s = str;
        this.f4546t = z11;
        this.f4547u = workSource;
        this.f4548v = zzdVar;
    }

    @Deprecated
    /* renamed from: I */
    public static LocationRequest m5030I() {
        return new LocationRequest(C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, C1841a.e.API_PRIORITY_OTHER, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    /* renamed from: d0 */
    public static String m5031d0(long j10) {
        return j10 == Long.MAX_VALUE ? "∞" : zzdj.zza(j10);
    }

    /* renamed from: J */
    public long m5032J() {
        return this.f4538l;
    }

    /* renamed from: K */
    public int m5033K() {
        return this.f4543q;
    }

    /* renamed from: L */
    public long m5034L() {
        return this.f4535i;
    }

    /* renamed from: M */
    public long m5035M() {
        return this.f4542p;
    }

    /* renamed from: N */
    public long m5036N() {
        return this.f4537k;
    }

    /* renamed from: O */
    public int m5037O() {
        return this.f4539m;
    }

    /* renamed from: P */
    public float m5038P() {
        return this.f4540n;
    }

    /* renamed from: Q */
    public long m5039Q() {
        return this.f4536j;
    }

    /* renamed from: R */
    public int m5040R() {
        return this.f4534h;
    }

    /* renamed from: S */
    public boolean m5041S() {
        long j10 = this.f4537k;
        return j10 > 0 && (j10 >> 1) >= this.f4535i;
    }

    /* renamed from: T */
    public boolean m5042T() {
        return this.f4534h == 105;
    }

    /* renamed from: U */
    public boolean m5043U() {
        return this.f4541o;
    }

    @Deprecated
    /* renamed from: V */
    public LocationRequest m5044V(long j10) {
        C2394s.m9610c(j10 >= 0, "illegal fastest interval: %d", Long.valueOf(j10));
        this.f4536j = j10;
        return this;
    }

    @Deprecated
    /* renamed from: W */
    public LocationRequest m5045W(long j10) {
        C2394s.m9609b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
        long j11 = this.f4536j;
        long j12 = this.f4535i;
        if (j11 == j12 / 6) {
            this.f4536j = j10 / 6;
        }
        if (this.f4542p == j12) {
            this.f4542p = j10;
        }
        this.f4535i = j10;
        return this;
    }

    @Deprecated
    /* renamed from: X */
    public LocationRequest m5046X(int i10) {
        C5291b0.m21362a(i10);
        this.f4534h = i10;
        return this;
    }

    @Deprecated
    /* renamed from: Y */
    public LocationRequest m5047Y(float f10) {
        if (f10 >= 0.0f) {
            this.f4540n = f10;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f10);
    }

    /* renamed from: Z */
    public final int m5048Z() {
        return this.f4544r;
    }

    /* renamed from: a0 */
    public final WorkSource m5049a0() {
        return this.f4547u;
    }

    /* renamed from: b0 */
    public final zzd m5050b0() {
        return this.f4548v;
    }

    /* renamed from: c0 */
    public final boolean m5051c0() {
        return this.f4546t;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f4534h == locationRequest.f4534h && ((m5042T() || this.f4535i == locationRequest.f4535i) && this.f4536j == locationRequest.f4536j && m5041S() == locationRequest.m5041S() && ((!m5041S() || this.f4537k == locationRequest.f4537k) && this.f4538l == locationRequest.f4538l && this.f4539m == locationRequest.f4539m && this.f4540n == locationRequest.f4540n && this.f4541o == locationRequest.f4541o && this.f4543q == locationRequest.f4543q && this.f4544r == locationRequest.f4544r && this.f4546t == locationRequest.f4546t && this.f4547u.equals(locationRequest.f4547u) && C2388q.m9592b(this.f4545s, locationRequest.f4545s) && C2388q.m9592b(this.f4548v, locationRequest.f4548v)))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(this.f4534h), Long.valueOf(this.f4535i), Long.valueOf(this.f4536j), this.f4547u);
    }

    public String toString() {
        long j10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (!m5042T()) {
            sb2.append("@");
            if (m5041S()) {
                zzdj.zzb(this.f4535i, sb2);
                sb2.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                j10 = this.f4537k;
            } else {
                j10 = this.f4535i;
            }
            zzdj.zzb(j10, sb2);
            sb2.append(" ");
        }
        sb2.append(C5291b0.m21363b(this.f4534h));
        if (m5042T() || this.f4536j != this.f4535i) {
            sb2.append(", minUpdateInterval=");
            sb2.append(m5031d0(this.f4536j));
        }
        if (this.f4540n > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f4540n);
        }
        boolean m5042T = m5042T();
        long j11 = this.f4542p;
        if (!m5042T ? j11 != this.f4535i : j11 != Long.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(m5031d0(this.f4542p));
        }
        if (this.f4538l != Long.MAX_VALUE) {
            sb2.append(", duration=");
            zzdj.zzb(this.f4538l, sb2);
        }
        if (this.f4539m != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f4539m);
        }
        if (this.f4544r != 0) {
            sb2.append(", ");
            sb2.append(C5295d0.m21367a(this.f4544r));
        }
        if (this.f4543q != 0) {
            sb2.append(", ");
            sb2.append(C5317o0.m21391b(this.f4543q));
        }
        if (this.f4541o) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f4546t) {
            sb2.append(", bypass");
        }
        if (this.f4545s != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f4545s);
        }
        if (!C3948q.m14972d(this.f4547u)) {
            sb2.append(", ");
            sb2.append(this.f4547u);
        }
        if (this.f4548v != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f4548v);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, m5040R());
        C2603c.m10489y(parcel, 2, m5034L());
        C2603c.m10489y(parcel, 3, m5039Q());
        C2603c.m10485u(parcel, 6, m5037O());
        C2603c.m10481q(parcel, 7, m5038P());
        C2603c.m10489y(parcel, 8, m5036N());
        C2603c.m10471g(parcel, 9, m5043U());
        C2603c.m10489y(parcel, 10, m5032J());
        C2603c.m10489y(parcel, 11, m5035M());
        C2603c.m10485u(parcel, 12, m5033K());
        C2603c.m10485u(parcel, 13, this.f4544r);
        C2603c.m10456F(parcel, 14, this.f4545s, false);
        C2603c.m10471g(parcel, 15, this.f4546t);
        C2603c.m10454D(parcel, 16, this.f4547u, i10, false);
        C2603c.m10454D(parcel, 17, this.f4548v, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }

    @Deprecated
    public final String zzd() {
        return this.f4545s;
    }
}
