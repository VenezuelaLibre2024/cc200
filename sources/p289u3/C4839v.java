package p289u3;

import android.media.AudioTrack;
import android.os.SystemClock;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.reflect.Method;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: u3.v */
/* loaded from: classes.dex */
public final class C4839v {

    /* renamed from: A */
    public long f18160A;

    /* renamed from: B */
    public long f18161B;

    /* renamed from: C */
    public long f18162C;

    /* renamed from: D */
    public long f18163D;

    /* renamed from: E */
    public boolean f18164E;

    /* renamed from: F */
    public long f18165F;

    /* renamed from: G */
    public long f18166G;

    /* renamed from: a */
    public final a f18167a;

    /* renamed from: b */
    public final long[] f18168b;

    /* renamed from: c */
    public AudioTrack f18169c;

    /* renamed from: d */
    public int f18170d;

    /* renamed from: e */
    public int f18171e;

    /* renamed from: f */
    public C4838u f18172f;

    /* renamed from: g */
    public int f18173g;

    /* renamed from: h */
    public boolean f18174h;

    /* renamed from: i */
    public long f18175i;

    /* renamed from: j */
    public float f18176j;

    /* renamed from: k */
    public boolean f18177k;

    /* renamed from: l */
    public long f18178l;

    /* renamed from: m */
    public long f18179m;

    /* renamed from: n */
    public Method f18180n;

    /* renamed from: o */
    public long f18181o;

    /* renamed from: p */
    public boolean f18182p;

    /* renamed from: q */
    public boolean f18183q;

    /* renamed from: r */
    public long f18184r;

    /* renamed from: s */
    public long f18185s;

    /* renamed from: t */
    public long f18186t;

    /* renamed from: u */
    public long f18187u;

    /* renamed from: v */
    public long f18188v;

    /* renamed from: w */
    public int f18189w;

    /* renamed from: x */
    public int f18190x;

    /* renamed from: y */
    public long f18191y;

    /* renamed from: z */
    public long f18192z;

    /* renamed from: u3.v$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo18965a(int i10, long j10);

        /* renamed from: b */
        void mo18966b(long j10);

        /* renamed from: c */
        void mo18967c(long j10);

        /* renamed from: d */
        void mo18968d(long j10, long j11, long j12, long j13);

        /* renamed from: e */
        void mo18969e(long j10, long j11, long j12, long j13);
    }

    public C4839v(a aVar) {
        this.f18167a = (a) C4014a.m15199e(aVar);
        if (C4041n0.f14513a >= 18) {
            try {
                this.f18180n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f18168b = new long[10];
    }

    /* renamed from: o */
    public static boolean m19164o(int i10) {
        return C4041n0.f14513a < 23 && (i10 == 5 || i10 == 6);
    }

    /* renamed from: a */
    public final boolean m19165a() {
        return this.f18174h && ((AudioTrack) C4014a.m15199e(this.f18169c)).getPlayState() == 2 && m19169e() == 0;
    }

    /* renamed from: b */
    public final long m19166b(long j10) {
        return (j10 * 1000000) / this.f18173g;
    }

    /* renamed from: c */
    public int m19167c(long j10) {
        return this.f18171e - ((int) (j10 - (m19169e() * this.f18170d)));
    }

    /* renamed from: d */
    public long m19168d(boolean z10) {
        long m19170f;
        if (((AudioTrack) C4014a.m15199e(this.f18169c)).getPlayState() == 3) {
            m19177m();
        }
        long nanoTime = System.nanoTime() / 1000;
        C4838u c4838u = (C4838u) C4014a.m15199e(this.f18172f);
        boolean m19156d = c4838u.m19156d();
        if (m19156d) {
            m19170f = m19166b(c4838u.m19154b()) + C4041n0.m15443Z(nanoTime - c4838u.m19155c(), this.f18176j);
        } else {
            m19170f = this.f18190x == 0 ? m19170f() : C4041n0.m15443Z(this.f18178l + nanoTime, this.f18176j);
            if (!z10) {
                m19170f = Math.max(0L, m19170f - this.f18181o);
            }
        }
        if (this.f18164E != m19156d) {
            this.f18166G = this.f18163D;
            this.f18165F = this.f18162C;
        }
        long j10 = nanoTime - this.f18166G;
        if (j10 < 1000000) {
            long m15443Z = this.f18165F + C4041n0.m15443Z(j10, this.f18176j);
            long j11 = (j10 * 1000) / 1000000;
            m19170f = ((m19170f * j11) + ((1000 - j11) * m15443Z)) / 1000;
        }
        if (!this.f18177k) {
            long j12 = this.f18162C;
            if (m19170f > j12) {
                this.f18177k = true;
                this.f18167a.mo18966b(System.currentTimeMillis() - C4041n0.m15442Y0(C4041n0.m15454e0(C4041n0.m15442Y0(m19170f - j12), this.f18176j)));
            }
        }
        this.f18163D = nanoTime;
        this.f18162C = m19170f;
        this.f18164E = m19156d;
        return m19170f;
    }

    /* renamed from: e */
    public final long m19169e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f18191y;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.f18161B, this.f18160A + ((C4041n0.m15443Z((elapsedRealtime * 1000) - j10, this.f18176j) * this.f18173g) / 1000000));
        }
        if (elapsedRealtime - this.f18185s >= 5) {
            m19185v(elapsedRealtime);
            this.f18185s = elapsedRealtime;
        }
        return this.f18186t + (this.f18187u << 32);
    }

    /* renamed from: f */
    public final long m19170f() {
        return m19166b(m19169e());
    }

    /* renamed from: g */
    public void m19171g(long j10) {
        this.f18160A = m19169e();
        this.f18191y = SystemClock.elapsedRealtime() * 1000;
        this.f18161B = j10;
    }

    /* renamed from: h */
    public boolean m19172h(long j10) {
        return j10 > m19169e() || m19165a();
    }

    /* renamed from: i */
    public boolean m19173i() {
        return ((AudioTrack) C4014a.m15199e(this.f18169c)).getPlayState() == 3;
    }

    /* renamed from: j */
    public boolean m19174j(long j10) {
        return this.f18192z != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f18192z >= 200;
    }

    /* renamed from: k */
    public boolean m19175k(long j10) {
        int playState = ((AudioTrack) C4014a.m15199e(this.f18169c)).getPlayState();
        if (this.f18174h) {
            if (playState == 2) {
                this.f18182p = false;
                return false;
            }
            if (playState == 1 && m19169e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f18182p;
        boolean m19172h = m19172h(j10);
        this.f18182p = m19172h;
        if (z10 && !m19172h && playState != 1) {
            this.f18167a.mo18965a(this.f18171e, C4041n0.m15442Y0(this.f18175i));
        }
        return true;
    }

    /* renamed from: l */
    public final void m19176l(long j10) {
        C4838u c4838u = (C4838u) C4014a.m15199e(this.f18172f);
        if (c4838u.m19157e(j10)) {
            long m19155c = c4838u.m19155c();
            long m19154b = c4838u.m19154b();
            long m19170f = m19170f();
            if (Math.abs(m19155c - j10) > 5000000) {
                this.f18167a.mo18969e(m19154b, m19155c, j10, m19170f);
            } else {
                if (Math.abs(m19166b(m19154b) - m19170f) <= 5000000) {
                    c4838u.m19153a();
                    return;
                }
                this.f18167a.mo18968d(m19154b, m19155c, j10, m19170f);
            }
            c4838u.m19158f();
        }
    }

    /* renamed from: m */
    public final void m19177m() {
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f18179m >= 30000) {
            long m19170f = m19170f();
            if (m19170f != 0) {
                this.f18168b[this.f18189w] = C4041n0.m15454e0(m19170f, this.f18176j) - nanoTime;
                this.f18189w = (this.f18189w + 1) % 10;
                int i10 = this.f18190x;
                if (i10 < 10) {
                    this.f18190x = i10 + 1;
                }
                this.f18179m = nanoTime;
                this.f18178l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f18190x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f18178l += this.f18168b[i11] / i12;
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f18174h) {
            return;
        }
        m19176l(nanoTime);
        m19178n(nanoTime);
    }

    /* renamed from: n */
    public final void m19178n(long j10) {
        Method method;
        if (!this.f18183q || (method = this.f18180n) == null || j10 - this.f18184r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) C4041n0.m15463j((Integer) method.invoke(C4014a.m15199e(this.f18169c), new Object[0]))).intValue() * 1000) - this.f18175i;
            this.f18181o = intValue;
            long max = Math.max(intValue, 0L);
            this.f18181o = max;
            if (max > 5000000) {
                this.f18167a.mo18967c(max);
                this.f18181o = 0L;
            }
        } catch (Exception unused) {
            this.f18180n = null;
        }
        this.f18184r = j10;
    }

    /* renamed from: p */
    public boolean m19179p() {
        m19181r();
        if (this.f18191y != -9223372036854775807L) {
            return false;
        }
        ((C4838u) C4014a.m15199e(this.f18172f)).m19159g();
        return true;
    }

    /* renamed from: q */
    public void m19180q() {
        m19181r();
        this.f18169c = null;
        this.f18172f = null;
    }

    /* renamed from: r */
    public final void m19181r() {
        this.f18178l = 0L;
        this.f18190x = 0;
        this.f18189w = 0;
        this.f18179m = 0L;
        this.f18163D = 0L;
        this.f18166G = 0L;
        this.f18177k = false;
    }

    /* renamed from: s */
    public void m19182s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f18169c = audioTrack;
        this.f18170d = i11;
        this.f18171e = i12;
        this.f18172f = new C4838u(audioTrack);
        this.f18173g = audioTrack.getSampleRate();
        this.f18174h = z10 && m19164o(i10);
        boolean m15484t0 = C4041n0.m15484t0(i10);
        this.f18183q = m15484t0;
        this.f18175i = m15484t0 ? m19166b(i12 / i11) : -9223372036854775807L;
        this.f18186t = 0L;
        this.f18187u = 0L;
        this.f18188v = 0L;
        this.f18182p = false;
        this.f18191y = -9223372036854775807L;
        this.f18192z = -9223372036854775807L;
        this.f18184r = 0L;
        this.f18181o = 0L;
        this.f18176j = 1.0f;
    }

    /* renamed from: t */
    public void m19183t(float f10) {
        this.f18176j = f10;
        C4838u c4838u = this.f18172f;
        if (c4838u != null) {
            c4838u.m19159g();
        }
        m19181r();
    }

    /* renamed from: u */
    public void m19184u() {
        ((C4838u) C4014a.m15199e(this.f18172f)).m19159g();
    }

    /* renamed from: v */
    public final void m19185v(long j10) {
        int playState = ((AudioTrack) C4014a.m15199e(this.f18169c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = KeyboardMap.kValueMask & r0.getPlaybackHeadPosition();
        if (this.f18174h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f18188v = this.f18186t;
            }
            playbackHeadPosition += this.f18188v;
        }
        if (C4041n0.f14513a <= 29) {
            if (playbackHeadPosition == 0 && this.f18186t > 0 && playState == 3) {
                if (this.f18192z == -9223372036854775807L) {
                    this.f18192z = j10;
                    return;
                }
                return;
            }
            this.f18192z = -9223372036854775807L;
        }
        if (this.f18186t > playbackHeadPosition) {
            this.f18187u++;
        }
        this.f18186t = playbackHeadPosition;
    }
}
