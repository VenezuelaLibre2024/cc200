package p042d0;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p079f6.C1841a;
import p133j0.C3205d;

/* renamed from: d0.i */
/* loaded from: classes.dex */
public final class C1517i {

    /* renamed from: a */
    public final int f5522a;

    /* renamed from: b */
    public final long f5523b;

    /* renamed from: c */
    public final long f5524c;

    /* renamed from: d */
    public final long f5525d;

    /* renamed from: e */
    public final int f5526e;

    /* renamed from: f */
    public final float f5527f;

    /* renamed from: g */
    public final long f5528g;

    /* renamed from: d0.i$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static Class<?> f5529a;

        /* renamed from: b */
        public static Method f5530b;

        /* renamed from: c */
        public static Method f5531c;

        /* renamed from: d */
        public static Method f5532d;

        /* renamed from: e */
        public static Method f5533e;

        /* renamed from: f */
        public static Method f5534f;

        /* renamed from: a */
        public static Object m6145a(C1517i c1517i, String str) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    if (f5529a == null) {
                        f5529a = Class.forName("android.location.LocationRequest");
                    }
                    if (f5530b == null) {
                        Method declaredMethod = f5529a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                        f5530b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    Object invoke = f5530b.invoke(null, str, Long.valueOf(c1517i.m6137b()), Float.valueOf(c1517i.m6140e()), Boolean.FALSE);
                    if (invoke == null) {
                        return null;
                    }
                    if (f5531c == null) {
                        Method declaredMethod2 = f5529a.getDeclaredMethod("setQuality", Integer.TYPE);
                        f5531c = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                    }
                    f5531c.invoke(invoke, Integer.valueOf(c1517i.m6142g()));
                    if (f5532d == null) {
                        Method declaredMethod3 = f5529a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                        f5532d = declaredMethod3;
                        declaredMethod3.setAccessible(true);
                    }
                    f5532d.invoke(invoke, Long.valueOf(c1517i.m6141f()));
                    if (c1517i.m6139d() < Integer.MAX_VALUE) {
                        if (f5533e == null) {
                            Method declaredMethod4 = f5529a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                            f5533e = declaredMethod4;
                            declaredMethod4.setAccessible(true);
                        }
                        f5533e.invoke(invoke, Integer.valueOf(c1517i.m6139d()));
                    }
                    if (c1517i.m6136a() < Long.MAX_VALUE) {
                        if (f5534f == null) {
                            Method declaredMethod5 = f5529a.getDeclaredMethod("setExpireIn", Long.TYPE);
                            f5534f = declaredMethod5;
                            declaredMethod5.setAccessible(true);
                        }
                        f5534f.invoke(invoke, Long.valueOf(c1517i.m6136a()));
                    }
                    return invoke;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            return null;
        }
    }

    /* renamed from: d0.i$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static LocationRequest m6146a(C1517i c1517i) {
            return new LocationRequest.Builder(c1517i.m6137b()).setQuality(c1517i.m6142g()).setMinUpdateIntervalMillis(c1517i.m6141f()).setDurationMillis(c1517i.m6136a()).setMaxUpdates(c1517i.m6139d()).setMinUpdateDistanceMeters(c1517i.m6140e()).setMaxUpdateDelayMillis(c1517i.m6138c()).build();
        }
    }

    /* renamed from: d0.i$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public long f5535a;

        /* renamed from: b */
        public int f5536b;

        /* renamed from: c */
        public long f5537c;

        /* renamed from: d */
        public int f5538d;

        /* renamed from: e */
        public long f5539e;

        /* renamed from: f */
        public float f5540f;

        /* renamed from: g */
        public long f5541g;

        public c(long j10) {
            m6148b(j10);
            this.f5536b = C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
            this.f5537c = Long.MAX_VALUE;
            this.f5538d = C1841a.e.API_PRIORITY_OTHER;
            this.f5539e = -1L;
            this.f5540f = 0.0f;
            this.f5541g = 0L;
        }

        /* renamed from: a */
        public C1517i m6147a() {
            C3205d.m11416l((this.f5535a == Long.MAX_VALUE && this.f5539e == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j10 = this.f5535a;
            return new C1517i(j10, this.f5536b, this.f5537c, this.f5538d, Math.min(this.f5539e, j10), this.f5540f, this.f5541g);
        }

        /* renamed from: b */
        public c m6148b(long j10) {
            this.f5535a = C3205d.m11410f(j10, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        /* renamed from: c */
        public c m6149c(float f10) {
            this.f5540f = f10;
            this.f5540f = C3205d.m11408d(f10, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        /* renamed from: d */
        public c m6150d(int i10) {
            C3205d.m11406b(i10 == 104 || i10 == 102 || i10 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i10));
            this.f5536b = i10;
            return this;
        }
    }

    public C1517i(long j10, int i10, long j11, int i11, long j12, float f10, long j13) {
        this.f5523b = j10;
        this.f5522a = i10;
        this.f5524c = j12;
        this.f5525d = j11;
        this.f5526e = i11;
        this.f5527f = f10;
        this.f5528g = j13;
    }

    /* renamed from: a */
    public long m6136a() {
        return this.f5525d;
    }

    /* renamed from: b */
    public long m6137b() {
        return this.f5523b;
    }

    /* renamed from: c */
    public long m6138c() {
        return this.f5528g;
    }

    /* renamed from: d */
    public int m6139d() {
        return this.f5526e;
    }

    /* renamed from: e */
    public float m6140e() {
        return this.f5527f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1517i)) {
            return false;
        }
        C1517i c1517i = (C1517i) obj;
        return this.f5522a == c1517i.f5522a && this.f5523b == c1517i.f5523b && this.f5524c == c1517i.f5524c && this.f5525d == c1517i.f5525d && this.f5526e == c1517i.f5526e && Float.compare(c1517i.f5527f, this.f5527f) == 0 && this.f5528g == c1517i.f5528g;
    }

    /* renamed from: f */
    public long m6141f() {
        long j10 = this.f5524c;
        return j10 == -1 ? this.f5523b : j10;
    }

    /* renamed from: g */
    public int m6142g() {
        return this.f5522a;
    }

    /* renamed from: h */
    public LocationRequest m6143h() {
        return b.m6146a(this);
    }

    public int hashCode() {
        int i10 = this.f5522a * 31;
        long j10 = this.f5523b;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f5524c;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public LocationRequest m6144i(String str) {
        return Build.VERSION.SDK_INT >= 31 ? m6143h() : (LocationRequest) a.m6145a(this, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Request["
            r0.append(r1)
            long r1 = r5.f5523b
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L37
            java.lang.String r1 = "@"
            r0.append(r1)
            long r1 = r5.f5523b
            p133j0.C3207f.m11420b(r1, r0)
            int r1 = r5.f5522a
            r2 = 100
            if (r1 == r2) goto L34
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L31
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L2e
            goto L3c
        L2e:
            java.lang.String r1 = " LOW_POWER"
            goto L39
        L31:
            java.lang.String r1 = " BALANCED"
            goto L39
        L34:
            java.lang.String r1 = " HIGH_ACCURACY"
            goto L39
        L37:
            java.lang.String r1 = "PASSIVE"
        L39:
            r0.append(r1)
        L3c:
            long r1 = r5.f5525d
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L4c
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r5.f5525d
            p133j0.C3207f.m11420b(r1, r0)
        L4c:
            int r1 = r5.f5526e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L5d
            java.lang.String r1 = ", maxUpdates="
            r0.append(r1)
            int r1 = r5.f5526e
            r0.append(r1)
        L5d:
            long r1 = r5.f5524c
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L75
            long r3 = r5.f5523b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L75
            java.lang.String r1 = ", minUpdateInterval="
            r0.append(r1)
            long r1 = r5.f5524c
            p133j0.C3207f.m11420b(r1, r0)
        L75:
            float r1 = r5.f5527f
            double r1 = (double) r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L88
            java.lang.String r1 = ", minUpdateDistance="
            r0.append(r1)
            float r1 = r5.f5527f
            r0.append(r1)
        L88:
            long r1 = r5.f5528g
            r3 = 2
            long r1 = r1 / r3
            long r3 = r5.f5523b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L9d
            java.lang.String r1 = ", maxUpdateDelay="
            r0.append(r1)
            long r1 = r5.f5528g
            p133j0.C3207f.m11420b(r1, r0)
        L9d:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042d0.C1517i.toString():java.lang.String");
    }
}
