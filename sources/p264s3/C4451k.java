package p264s3;

import p193n5.InterfaceC3752s;
import p206o5.C3920o;
import p206o5.InterfaceC3894b;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;
import p290u4.C4885u0;

/* renamed from: s3.k */
/* loaded from: classes.dex */
public class C4451k implements InterfaceC4493s1 {

    /* renamed from: a */
    public final C3920o f16409a;

    /* renamed from: b */
    public final long f16410b;

    /* renamed from: c */
    public final long f16411c;

    /* renamed from: d */
    public final long f16412d;

    /* renamed from: e */
    public final long f16413e;

    /* renamed from: f */
    public final int f16414f;

    /* renamed from: g */
    public final boolean f16415g;

    /* renamed from: h */
    public final long f16416h;

    /* renamed from: i */
    public final boolean f16417i;

    /* renamed from: j */
    public int f16418j;

    /* renamed from: k */
    public boolean f16419k;

    public C4451k() {
        this(new C3920o(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public C4451k(C3920o c3920o, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        m17375j(i12, 0, "bufferForPlaybackMs", "0");
        m17375j(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m17375j(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        m17375j(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m17375j(i11, i10, "maxBufferMs", "minBufferMs");
        m17375j(i15, 0, "backBufferDurationMs", "0");
        this.f16409a = c3920o;
        this.f16410b = C4041n0.m15396B0(i10);
        this.f16411c = C4041n0.m15396B0(i11);
        this.f16412d = C4041n0.m15396B0(i12);
        this.f16413e = C4041n0.m15396B0(i13);
        this.f16414f = i14;
        this.f16418j = i14 == -1 ? 13107200 : i14;
        this.f16415g = z10;
        this.f16416h = C4041n0.m15396B0(i15);
        this.f16417i = z11;
    }

    /* renamed from: j */
    public static void m17375j(int i10, int i11, String str, String str2) {
        C4014a.m15196b(i10 >= i11, str + " cannot be less than " + str2);
    }

    /* renamed from: l */
    public static int m17376l(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // p264s3.InterfaceC4493s1
    /* renamed from: a */
    public void mo17377a() {
        m17387m(false);
    }

    @Override // p264s3.InterfaceC4493s1
    /* renamed from: b */
    public boolean mo17378b() {
        return this.f16417i;
    }

    @Override // p264s3.InterfaceC4493s1
    /* renamed from: c */
    public long mo17379c() {
        return this.f16416h;
    }

    @Override // p264s3.InterfaceC4493s1
    /* renamed from: d */
    public void mo17380d(InterfaceC4445i3[] interfaceC4445i3Arr, C4885u0 c4885u0, InterfaceC3752s[] interfaceC3752sArr) {
        int i10 = this.f16414f;
        if (i10 == -1) {
            i10 = m17386k(interfaceC4445i3Arr, interfaceC3752sArr);
        }
        this.f16418j = i10;
        this.f16409a.m14870h(i10);
    }

    @Override // p264s3.InterfaceC4493s1
    /* renamed from: e */
    public void mo17381e() {
        m17387m(true);
    }

    @Override // p264s3.InterfaceC4493s1
    /* renamed from: f */
    public boolean mo17382f(long j10, float f10, boolean z10, long j11) {
        long m15454e0 = C4041n0.m15454e0(j10, f10);
        long j12 = z10 ? this.f16413e : this.f16412d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || m15454e0 >= j12 || (!this.f16415g && this.f16409a.m14868f() >= this.f16418j);
    }

    @Override // p264s3.InterfaceC4493s1
    /* renamed from: g */
    public boolean mo17383g(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f16409a.m14868f() >= this.f16418j;
        long j12 = this.f16410b;
        if (f10 > 1.0f) {
            j12 = Math.min(C4041n0.m15443Z(j12, f10), this.f16411c);
        }
        if (j11 < Math.max(j12, 500000L)) {
            if (!this.f16415g && z11) {
                z10 = false;
            }
            this.f16419k = z10;
            if (!z10 && j11 < 500000) {
                C4046r.m15529i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f16411c || z11) {
            this.f16419k = false;
        }
        return this.f16419k;
    }

    @Override // p264s3.InterfaceC4493s1
    /* renamed from: h */
    public InterfaceC3894b mo17384h() {
        return this.f16409a;
    }

    @Override // p264s3.InterfaceC4493s1
    /* renamed from: i */
    public void mo17385i() {
        m17387m(true);
    }

    /* renamed from: k */
    public int m17386k(InterfaceC4445i3[] interfaceC4445i3Arr, InterfaceC3752s[] interfaceC3752sArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < interfaceC4445i3Arr.length; i11++) {
            if (interfaceC3752sArr[i11] != null) {
                i10 += m17376l(interfaceC4445i3Arr[i11].mo17215i());
            }
        }
        return Math.max(13107200, i10);
    }

    /* renamed from: m */
    public final void m17387m(boolean z10) {
        int i10 = this.f16414f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f16418j = i10;
        this.f16419k = false;
        if (z10) {
            this.f16409a.m14869g();
        }
    }
}
