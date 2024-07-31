package p305v4;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: v4.c */
/* loaded from: classes.dex */
public final class C5116c implements InterfaceC4436h {

    /* renamed from: n */
    public static final C5116c f19315n = new C5116c(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: o */
    public static final a f19316o = new a(0).m20794i(0);

    /* renamed from: p */
    public static final String f19317p = C4041n0.m15478q0(1);

    /* renamed from: q */
    public static final String f19318q = C4041n0.m15478q0(2);

    /* renamed from: r */
    public static final String f19319r = C4041n0.m15478q0(3);

    /* renamed from: s */
    public static final String f19320s = C4041n0.m15478q0(4);

    /* renamed from: t */
    public static final InterfaceC4436h.a<C5116c> f19321t = C5114a.f19313a;

    /* renamed from: h */
    public final Object f19322h;

    /* renamed from: i */
    public final int f19323i;

    /* renamed from: j */
    public final long f19324j;

    /* renamed from: k */
    public final long f19325k;

    /* renamed from: l */
    public final int f19326l;

    /* renamed from: m */
    public final a[] f19327m;

    /* renamed from: v4.c$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC4436h {

        /* renamed from: p */
        public static final String f19328p = C4041n0.m15478q0(0);

        /* renamed from: q */
        public static final String f19329q = C4041n0.m15478q0(1);

        /* renamed from: r */
        public static final String f19330r = C4041n0.m15478q0(2);

        /* renamed from: s */
        public static final String f19331s = C4041n0.m15478q0(3);

        /* renamed from: t */
        public static final String f19332t = C4041n0.m15478q0(4);

        /* renamed from: u */
        public static final String f19333u = C4041n0.m15478q0(5);

        /* renamed from: v */
        public static final String f19334v = C4041n0.m15478q0(6);

        /* renamed from: w */
        public static final String f19335w = C4041n0.m15478q0(7);

        /* renamed from: x */
        public static final InterfaceC4436h.a<a> f19336x = C5115b.f19314a;

        /* renamed from: h */
        public final long f19337h;

        /* renamed from: i */
        public final int f19338i;

        /* renamed from: j */
        public final int f19339j;

        /* renamed from: k */
        public final Uri[] f19340k;

        /* renamed from: l */
        public final int[] f19341l;

        /* renamed from: m */
        public final long[] f19342m;

        /* renamed from: n */
        public final long f19343n;

        /* renamed from: o */
        public final boolean f19344o;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            C4014a.m15195a(iArr.length == uriArr.length);
            this.f19337h = j10;
            this.f19338i = i10;
            this.f19339j = i11;
            this.f19341l = iArr;
            this.f19340k = uriArr;
            this.f19342m = jArr;
            this.f19343n = j11;
            this.f19344o = z10;
        }

        /* renamed from: b */
        public static long[] m20787b(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        /* renamed from: c */
        public static int[] m20788c(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* renamed from: d */
        public static a m20789d(Bundle bundle) {
            long j10 = bundle.getLong(f19328p);
            int i10 = bundle.getInt(f19329q);
            int i11 = bundle.getInt(f19335w);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f19330r);
            int[] intArray = bundle.getIntArray(f19331s);
            long[] longArray = bundle.getLongArray(f19332t);
            long j11 = bundle.getLong(f19333u);
            boolean z10 = bundle.getBoolean(f19334v);
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j10, i10, i11, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j11, z10);
        }

        /* renamed from: e */
        public int m20790e() {
            return m20791f(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19337h == aVar.f19337h && this.f19338i == aVar.f19338i && this.f19339j == aVar.f19339j && Arrays.equals(this.f19340k, aVar.f19340k) && Arrays.equals(this.f19341l, aVar.f19341l) && Arrays.equals(this.f19342m, aVar.f19342m) && this.f19343n == aVar.f19343n && this.f19344o == aVar.f19344o;
        }

        /* renamed from: f */
        public int m20791f(int i10) {
            int i11 = i10 + 1;
            while (true) {
                int[] iArr = this.f19341l;
                if (i11 >= iArr.length || this.f19344o || iArr[i11] == 0 || iArr[i11] == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        /* renamed from: g */
        public boolean m20792g() {
            if (this.f19338i == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f19338i; i10++) {
                int[] iArr = this.f19341l;
                if (iArr[i10] == 0 || iArr[i10] == 1) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public boolean m20793h() {
            return this.f19338i == -1 || m20790e() < this.f19338i;
        }

        public int hashCode() {
            int i10 = ((this.f19338i * 31) + this.f19339j) * 31;
            long j10 = this.f19337h;
            int hashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f19340k)) * 31) + Arrays.hashCode(this.f19341l)) * 31) + Arrays.hashCode(this.f19342m)) * 31;
            long j11 = this.f19343n;
            return ((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f19344o ? 1 : 0);
        }

        /* renamed from: i */
        public a m20794i(int i10) {
            int[] m20788c = m20788c(this.f19341l, i10);
            long[] m20787b = m20787b(this.f19342m, i10);
            return new a(this.f19337h, i10, this.f19339j, m20788c, (Uri[]) Arrays.copyOf(this.f19340k, i10), m20787b, this.f19343n, this.f19344o);
        }
    }

    public C5116c(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f19322h = obj;
        this.f19324j = j10;
        this.f19325k = j11;
        this.f19323i = aVarArr.length + i10;
        this.f19327m = aVarArr;
        this.f19326l = i10;
    }

    /* renamed from: b */
    public static C5116c m20781b(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f19317p);
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = a.f19336x.mo6314a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        String str = f19318q;
        C5116c c5116c = f19315n;
        return new C5116c(null, aVarArr, bundle.getLong(str, c5116c.f19324j), bundle.getLong(f19319r, c5116c.f19325k), bundle.getInt(f19320s, c5116c.f19326l));
    }

    /* renamed from: c */
    public a m20782c(int i10) {
        int i11 = this.f19326l;
        return i10 < i11 ? f19316o : this.f19327m[i10 - i11];
    }

    /* renamed from: d */
    public int m20783d(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f19326l;
        while (i10 < this.f19323i && ((m20782c(i10).f19337h != Long.MIN_VALUE && m20782c(i10).f19337h <= j10) || !m20782c(i10).m20793h())) {
            i10++;
        }
        if (i10 < this.f19323i) {
            return i10;
        }
        return -1;
    }

    /* renamed from: e */
    public int m20784e(long j10, long j11) {
        int i10 = this.f19323i - 1;
        while (i10 >= 0 && m20785f(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !m20782c(i10).m20792g()) {
            return -1;
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5116c.class != obj.getClass()) {
            return false;
        }
        C5116c c5116c = (C5116c) obj;
        return C4041n0.m15449c(this.f19322h, c5116c.f19322h) && this.f19323i == c5116c.f19323i && this.f19324j == c5116c.f19324j && this.f19325k == c5116c.f19325k && this.f19326l == c5116c.f19326l && Arrays.equals(this.f19327m, c5116c.f19327m);
    }

    /* renamed from: f */
    public final boolean m20785f(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = m20782c(i10).f19337h;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    public int hashCode() {
        int i10 = this.f19323i * 31;
        Object obj = this.f19322h;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f19324j)) * 31) + ((int) this.f19325k)) * 31) + this.f19326l) * 31) + Arrays.hashCode(this.f19327m);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f19322h);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f19324j);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f19327m.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f19327m[i10].f19337h);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f19327m[i10].f19341l.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f19327m[i10].f19341l[i11];
                sb2.append(i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb2.append(", durationUs=");
                sb2.append(this.f19327m[i10].f19342m[i11]);
                sb2.append(')');
                if (i11 < this.f19327m[i10].f19341l.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f19327m.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
