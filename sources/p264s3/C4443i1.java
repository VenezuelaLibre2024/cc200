package p264s3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p047d5.C1560o;
import p109h7.InterfaceC2438u;
import p126i7.AbstractC2651u;
import p126i7.C2660y0;
import p152k4.C3348a;
import p152k4.C3353f;
import p193n5.AbstractC3734b0;
import p193n5.C3736c0;
import p193n5.InterfaceC3752s;
import p206o5.C3912k;
import p206o5.InterfaceC3900e;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.InterfaceC4020d;
import p222p5.InterfaceC4040n;
import p264s3.AbstractC4505u3;
import p264s3.C4425e3;
import p264s3.C4456l;
import p264s3.C4494s2;
import p264s3.C4503u1;
import p264s3.InterfaceC4445i3;
import p275t3.C4674s1;
import p275t3.InterfaceC4618a;
import p290u4.C4846b;
import p290u4.C4885u0;
import p290u4.InterfaceC4869m0;
import p290u4.InterfaceC4873o0;
import p290u4.InterfaceC4878r;
import p290u4.InterfaceC4882t;
import p317w3.InterfaceC5248n;

/* renamed from: s3.i1 */
/* loaded from: classes.dex */
public final class C4443i1 implements Handler.Callback, InterfaceC4878r.a, AbstractC3734b0.a, C4494s2.d, C4456l.a, C4425e3.a {

    /* renamed from: A */
    public final C4494s2 f16303A;

    /* renamed from: B */
    public final InterfaceC4488r1 f16304B;

    /* renamed from: C */
    public final long f16305C;

    /* renamed from: D */
    public C4465m3 f16306D;

    /* renamed from: E */
    public C4524y2 f16307E;

    /* renamed from: F */
    public e f16308F;

    /* renamed from: G */
    public boolean f16309G;

    /* renamed from: H */
    public boolean f16310H;

    /* renamed from: I */
    public boolean f16311I;

    /* renamed from: J */
    public boolean f16312J;

    /* renamed from: K */
    public boolean f16313K;

    /* renamed from: L */
    public int f16314L;

    /* renamed from: M */
    public boolean f16315M;

    /* renamed from: N */
    public boolean f16316N;

    /* renamed from: O */
    public boolean f16317O;

    /* renamed from: P */
    public boolean f16318P;

    /* renamed from: Q */
    public int f16319Q;

    /* renamed from: R */
    public h f16320R;

    /* renamed from: S */
    public long f16321S;

    /* renamed from: T */
    public int f16322T;

    /* renamed from: U */
    public boolean f16323U;

    /* renamed from: V */
    public C4481q f16324V;

    /* renamed from: W */
    public long f16325W;

    /* renamed from: X */
    public long f16326X = -9223372036854775807L;

    /* renamed from: h */
    public final InterfaceC4445i3[] f16327h;

    /* renamed from: i */
    public final Set<InterfaceC4445i3> f16328i;

    /* renamed from: j */
    public final InterfaceC4450j3[] f16329j;

    /* renamed from: k */
    public final AbstractC3734b0 f16330k;

    /* renamed from: l */
    public final C3736c0 f16331l;

    /* renamed from: m */
    public final InterfaceC4493s1 f16332m;

    /* renamed from: n */
    public final InterfaceC3900e f16333n;

    /* renamed from: o */
    public final InterfaceC4040n f16334o;

    /* renamed from: p */
    public final HandlerThread f16335p;

    /* renamed from: q */
    public final Looper f16336q;

    /* renamed from: r */
    public final AbstractC4505u3.d f16337r;

    /* renamed from: s */
    public final AbstractC4505u3.b f16338s;

    /* renamed from: t */
    public final long f16339t;

    /* renamed from: u */
    public final boolean f16340u;

    /* renamed from: v */
    public final C4456l f16341v;

    /* renamed from: w */
    public final ArrayList<d> f16342w;

    /* renamed from: x */
    public final InterfaceC4020d f16343x;

    /* renamed from: y */
    public final f f16344y;

    /* renamed from: z */
    public final C4419d2 f16345z;

    /* renamed from: s3.i1$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4445i3.a {
        public a() {
        }

        @Override // p264s3.InterfaceC4445i3.a
        /* renamed from: a */
        public void mo17341a() {
            C4443i1.this.f16317O = true;
        }

        @Override // p264s3.InterfaceC4445i3.a
        /* renamed from: b */
        public void mo17342b() {
            C4443i1.this.f16334o.mo15323f(2);
        }
    }

    /* renamed from: s3.i1$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final List<C4494s2.c> f16347a;

        /* renamed from: b */
        public final InterfaceC4873o0 f16348b;

        /* renamed from: c */
        public final int f16349c;

        /* renamed from: d */
        public final long f16350d;

        public b(List<C4494s2.c> list, InterfaceC4873o0 interfaceC4873o0, int i10, long j10) {
            this.f16347a = list;
            this.f16348b = interfaceC4873o0;
            this.f16349c = i10;
            this.f16350d = j10;
        }

        public /* synthetic */ b(List list, InterfaceC4873o0 interfaceC4873o0, int i10, long j10, a aVar) {
            this(list, interfaceC4873o0, i10, j10);
        }
    }

    /* renamed from: s3.i1$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final int f16351a;

        /* renamed from: b */
        public final int f16352b;

        /* renamed from: c */
        public final int f16353c;

        /* renamed from: d */
        public final InterfaceC4873o0 f16354d;
    }

    /* renamed from: s3.i1$d */
    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: h */
        public final C4425e3 f16355h;

        /* renamed from: i */
        public int f16356i;

        /* renamed from: j */
        public long f16357j;

        /* renamed from: k */
        public Object f16358k;

        public d(C4425e3 c4425e3) {
            this.f16355h = c4425e3;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f16358k;
            if ((obj == null) != (dVar.f16358k == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f16356i - dVar.f16356i;
            return i10 != 0 ? i10 : C4041n0.m15473o(this.f16357j, dVar.f16357j);
        }

        /* renamed from: c */
        public void m17348c(int i10, long j10, Object obj) {
            this.f16356i = i10;
            this.f16357j = j10;
            this.f16358k = obj;
        }
    }

    /* renamed from: s3.i1$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public boolean f16359a;

        /* renamed from: b */
        public C4524y2 f16360b;

        /* renamed from: c */
        public int f16361c;

        /* renamed from: d */
        public boolean f16362d;

        /* renamed from: e */
        public int f16363e;

        /* renamed from: f */
        public boolean f16364f;

        /* renamed from: g */
        public int f16365g;

        public e(C4524y2 c4524y2) {
            this.f16360b = c4524y2;
        }

        /* renamed from: b */
        public void m17350b(int i10) {
            this.f16359a |= i10 > 0;
            this.f16361c += i10;
        }

        /* renamed from: c */
        public void m17351c(int i10) {
            this.f16359a = true;
            this.f16364f = true;
            this.f16365g = i10;
        }

        /* renamed from: d */
        public void m17352d(C4524y2 c4524y2) {
            this.f16359a |= this.f16360b != c4524y2;
            this.f16360b = c4524y2;
        }

        /* renamed from: e */
        public void m17353e(int i10) {
            if (this.f16362d && this.f16363e != 5) {
                C4014a.m15195a(i10 == 5);
                return;
            }
            this.f16359a = true;
            this.f16362d = true;
            this.f16363e = i10;
        }
    }

    /* renamed from: s3.i1$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo17354a(e eVar);
    }

    /* renamed from: s3.i1$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        public final InterfaceC4882t.b f16366a;

        /* renamed from: b */
        public final long f16367b;

        /* renamed from: c */
        public final long f16368c;

        /* renamed from: d */
        public final boolean f16369d;

        /* renamed from: e */
        public final boolean f16370e;

        /* renamed from: f */
        public final boolean f16371f;

        public g(InterfaceC4882t.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f16366a = bVar;
            this.f16367b = j10;
            this.f16368c = j11;
            this.f16369d = z10;
            this.f16370e = z11;
            this.f16371f = z12;
        }
    }

    /* renamed from: s3.i1$h */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a */
        public final AbstractC4505u3 f16372a;

        /* renamed from: b */
        public final int f16373b;

        /* renamed from: c */
        public final long f16374c;

        public h(AbstractC4505u3 abstractC4505u3, int i10, long j10) {
            this.f16372a = abstractC4505u3;
            this.f16373b = i10;
            this.f16374c = j10;
        }
    }

    public C4443i1(InterfaceC4445i3[] interfaceC4445i3Arr, AbstractC3734b0 abstractC3734b0, C3736c0 c3736c0, InterfaceC4493s1 interfaceC4493s1, InterfaceC3900e interfaceC3900e, int i10, boolean z10, InterfaceC4618a interfaceC4618a, C4465m3 c4465m3, InterfaceC4488r1 interfaceC4488r1, long j10, boolean z11, Looper looper, InterfaceC4020d interfaceC4020d, f fVar, C4674s1 c4674s1, Looper looper2) {
        this.f16344y = fVar;
        this.f16327h = interfaceC4445i3Arr;
        this.f16330k = abstractC3734b0;
        this.f16331l = c3736c0;
        this.f16332m = interfaceC4493s1;
        this.f16333n = interfaceC3900e;
        this.f16314L = i10;
        this.f16315M = z10;
        this.f16306D = c4465m3;
        this.f16304B = interfaceC4488r1;
        this.f16305C = j10;
        this.f16325W = j10;
        this.f16310H = z11;
        this.f16343x = interfaceC4020d;
        this.f16339t = interfaceC4493s1.mo17379c();
        this.f16340u = interfaceC4493s1.mo17378b();
        C4524y2 m17858j = C4524y2.m17858j(c3736c0);
        this.f16307E = m17858j;
        this.f16308F = new e(m17858j);
        this.f16329j = new InterfaceC4450j3[interfaceC4445i3Arr.length];
        for (int i11 = 0; i11 < interfaceC4445i3Arr.length; i11++) {
            interfaceC4445i3Arr[i11].mo17218m(i11, c4674s1);
            this.f16329j[i11] = interfaceC4445i3Arr[i11].mo17219q();
        }
        this.f16341v = new C4456l(this, interfaceC4020d);
        this.f16342w = new ArrayList<>();
        this.f16328i = C2660y0.m10841h();
        this.f16337r = new AbstractC4505u3.d();
        this.f16338s = new AbstractC4505u3.b();
        abstractC3734b0.m14075b(this, interfaceC3900e);
        this.f16323U = true;
        InterfaceC4040n mo15273c = interfaceC4020d.mo15273c(looper, null);
        this.f16345z = new C4419d2(interfaceC4618a, mo15273c);
        this.f16303A = new C4494s2(this, interfaceC4618a, mo15273c, c4674s1);
        if (looper2 != null) {
            this.f16335p = null;
            this.f16336q = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f16335p = handlerThread;
            handlerThread.start();
            this.f16336q = handlerThread.getLooper();
        }
        this.f16334o = interfaceC4020d.mo15273c(this.f16336q, this);
    }

    /* renamed from: O */
    public static boolean m17226O(boolean z10, InterfaceC4882t.b bVar, long j10, InterfaceC4882t.b bVar2, AbstractC4505u3.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f18457a.equals(bVar2.f18457a)) {
            return (bVar.m19438b() && bVar3.m17697t(bVar.f18458b)) ? (bVar3.m17688k(bVar.f18458b, bVar.f18459c) == 4 || bVar3.m17688k(bVar.f18458b, bVar.f18459c) == 2) ? false : true : bVar2.m19438b() && bVar3.m17697t(bVar2.f18458b);
        }
        return false;
    }

    /* renamed from: Q */
    public static boolean m17227Q(InterfaceC4445i3 interfaceC4445i3) {
        return interfaceC4445i3.getState() != 0;
    }

    /* renamed from: S */
    public static boolean m17228S(C4524y2 c4524y2, AbstractC4505u3.b bVar) {
        InterfaceC4882t.b bVar2 = c4524y2.f16987b;
        AbstractC4505u3 abstractC4505u3 = c4524y2.f16986a;
        return abstractC4505u3.m17676u() || abstractC4505u3.mo17028l(bVar2.f18457a, bVar).f16837m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ Boolean m17229T() {
        return Boolean.valueOf(this.f16309G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m17230U(C4425e3 c4425e3) {
        try {
            m17318n(c4425e3);
        } catch (C4481q e10) {
            C4046r.m15524d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: t0 */
    public static void m17235t0(AbstractC4505u3 abstractC4505u3, d dVar, AbstractC4505u3.d dVar2, AbstractC4505u3.b bVar) {
        int i10 = abstractC4505u3.m17675r(abstractC4505u3.mo17028l(dVar.f16358k, bVar).f16834j, dVar2).f16875w;
        Object obj = abstractC4505u3.mo4744k(i10, bVar, true).f16833i;
        long j10 = bVar.f16835k;
        dVar.m17348c(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    /* renamed from: u0 */
    public static boolean m17236u0(d dVar, AbstractC4505u3 abstractC4505u3, AbstractC4505u3 abstractC4505u32, int i10, boolean z10, AbstractC4505u3.d dVar2, AbstractC4505u3.b bVar) {
        Object obj = dVar.f16358k;
        if (obj == null) {
            Pair<Object, Long> m17239x0 = m17239x0(abstractC4505u3, new h(dVar.f16355h.m17188h(), dVar.f16355h.m17184d(), dVar.f16355h.m17186f() == Long.MIN_VALUE ? -9223372036854775807L : C4041n0.m15396B0(dVar.f16355h.m17186f())), false, i10, z10, dVar2, bVar);
            if (m17239x0 == null) {
                return false;
            }
            dVar.m17348c(abstractC4505u3.mo4743f(m17239x0.first), ((Long) m17239x0.second).longValue(), m17239x0.first);
            if (dVar.f16355h.m17186f() == Long.MIN_VALUE) {
                m17235t0(abstractC4505u3, dVar, dVar2, bVar);
            }
            return true;
        }
        int mo4743f = abstractC4505u3.mo4743f(obj);
        if (mo4743f == -1) {
            return false;
        }
        if (dVar.f16355h.m17186f() == Long.MIN_VALUE) {
            m17235t0(abstractC4505u3, dVar, dVar2, bVar);
            return true;
        }
        dVar.f16356i = mo4743f;
        abstractC4505u32.mo17028l(dVar.f16358k, bVar);
        if (bVar.f16837m && abstractC4505u32.m17675r(bVar.f16834j, dVar2).f16874v == abstractC4505u32.mo4743f(dVar.f16358k)) {
            Pair<Object, Long> m17673n = abstractC4505u3.m17673n(dVar2, bVar, abstractC4505u3.mo17028l(dVar.f16358k, bVar).f16834j, dVar.f16357j + bVar.m17694q());
            dVar.m17348c(abstractC4505u3.mo4743f(m17673n.first), ((Long) m17673n.second).longValue(), m17673n.first);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0175  */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p264s3.C4443i1.g m17237w0(p264s3.AbstractC4505u3 r30, p264s3.C4524y2 r31, p264s3.C4443i1.h r32, p264s3.C4419d2 r33, int r34, boolean r35, p264s3.AbstractC4505u3.d r36, p264s3.AbstractC4505u3.b r37) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p264s3.C4443i1.m17237w0(s3.u3, s3.y2, s3.i1$h, s3.d2, int, boolean, s3.u3$d, s3.u3$b):s3.i1$g");
    }

    /* renamed from: x */
    public static C4463m1[] m17238x(InterfaceC3752s interfaceC3752s) {
        int length = interfaceC3752s != null ? interfaceC3752s.length() : 0;
        C4463m1[] c4463m1Arr = new C4463m1[length];
        for (int i10 = 0; i10 < length; i10++) {
            c4463m1Arr[i10] = interfaceC3752s.mo14087c(i10);
        }
        return c4463m1Arr;
    }

    /* renamed from: x0 */
    public static Pair<Object, Long> m17239x0(AbstractC4505u3 abstractC4505u3, h hVar, boolean z10, int i10, boolean z11, AbstractC4505u3.d dVar, AbstractC4505u3.b bVar) {
        Pair<Object, Long> m17673n;
        Object m17240y0;
        AbstractC4505u3 abstractC4505u32 = hVar.f16372a;
        if (abstractC4505u3.m17676u()) {
            return null;
        }
        AbstractC4505u3 abstractC4505u33 = abstractC4505u32.m17676u() ? abstractC4505u3 : abstractC4505u32;
        try {
            m17673n = abstractC4505u33.m17673n(dVar, bVar, hVar.f16373b, hVar.f16374c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC4505u3.equals(abstractC4505u33)) {
            return m17673n;
        }
        if (abstractC4505u3.mo4743f(m17673n.first) != -1) {
            return (abstractC4505u33.mo17028l(m17673n.first, bVar).f16837m && abstractC4505u33.m17675r(bVar.f16834j, dVar).f16874v == abstractC4505u33.mo4743f(m17673n.first)) ? abstractC4505u3.m17673n(dVar, bVar, abstractC4505u3.mo17028l(m17673n.first, bVar).f16834j, hVar.f16374c) : m17673n;
        }
        if (z10 && (m17240y0 = m17240y0(dVar, bVar, i10, z11, m17673n.first, abstractC4505u33, abstractC4505u3)) != null) {
            return abstractC4505u3.m17673n(dVar, bVar, abstractC4505u3.mo17028l(m17240y0, bVar).f16834j, -9223372036854775807L);
        }
        return null;
    }

    /* renamed from: y0 */
    public static Object m17240y0(AbstractC4505u3.d dVar, AbstractC4505u3.b bVar, int i10, boolean z10, Object obj, AbstractC4505u3 abstractC4505u3, AbstractC4505u3 abstractC4505u32) {
        int mo4743f = abstractC4505u3.mo4743f(obj);
        int mo4745m = abstractC4505u3.mo4745m();
        int i11 = mo4743f;
        int i12 = -1;
        for (int i13 = 0; i13 < mo4745m && i12 == -1; i13++) {
            i11 = abstractC4505u3.m17671h(i11, bVar, dVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = abstractC4505u32.mo4743f(abstractC4505u3.mo4746q(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return abstractC4505u32.mo4746q(i12);
    }

    /* renamed from: A */
    public final Pair<InterfaceC4882t.b, Long> m17241A(AbstractC4505u3 abstractC4505u3) {
        if (abstractC4505u3.m17676u()) {
            return Pair.create(C4524y2.m17859k(), 0L);
        }
        Pair<Object, Long> m17673n = abstractC4505u3.m17673n(this.f16337r, this.f16338s, abstractC4505u3.mo17025e(this.f16315M), -9223372036854775807L);
        InterfaceC4882t.b m17141B = this.f16345z.m17141B(abstractC4505u3, m17673n.first, 0L);
        long longValue = ((Long) m17673n.second).longValue();
        if (m17141B.m19438b()) {
            abstractC4505u3.mo17028l(m17141B.f18457a, this.f16338s);
            longValue = m17141B.f18459c == this.f16338s.m17691n(m17141B.f18458b) ? this.f16338s.m17687j() : 0L;
        }
        return Pair.create(m17141B, Long.valueOf(longValue));
    }

    /* renamed from: A0 */
    public void m17242A0(AbstractC4505u3 abstractC4505u3, int i10, long j10) {
        this.f16334o.mo15327j(3, new h(abstractC4505u3, i10, j10)).mo15330a();
    }

    /* renamed from: B */
    public Looper m17243B() {
        return this.f16336q;
    }

    /* renamed from: B0 */
    public final void m17244B0(boolean z10) {
        InterfaceC4882t.b bVar = this.f16345z.m17162p().f16139f.f16168a;
        long m17250E0 = m17250E0(bVar, this.f16307E.f17003r, true, false);
        if (m17250E0 != this.f16307E.f17003r) {
            C4524y2 c4524y2 = this.f16307E;
            this.f16307E = m17263L(bVar, m17250E0, c4524y2.f16988c, c4524y2.f16989d, z10, 5);
        }
    }

    /* renamed from: C */
    public final long m17245C() {
        return m17247D(this.f16307E.f17001p);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:6:0x00a2, B:8:0x00ac, B:15:0x00b2, B:17:0x00b8, B:18:0x00bb, B:19:0x00c1, B:21:0x00cb, B:23:0x00d3, B:27:0x00db, B:28:0x00e5, B:30:0x00f5, B:34:0x00ff, B:37:0x0111, B:40:0x011a), top: B:5:0x00a2 }] */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17246C0(p264s3.C4443i1.h r19) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p264s3.C4443i1.m17246C0(s3.i1$h):void");
    }

    /* renamed from: D */
    public final long m17247D(long j10) {
        C4402a2 m17156j = this.f16345z.m17156j();
        if (m17156j == null) {
            return 0L;
        }
        return Math.max(0L, j10 - m17156j.m17058y(this.f16321S));
    }

    /* renamed from: D0 */
    public final long m17248D0(InterfaceC4882t.b bVar, long j10, boolean z10) {
        return m17250E0(bVar, j10, this.f16345z.m17162p() != this.f16345z.m17163q(), z10);
    }

    /* renamed from: E */
    public final void m17249E(InterfaceC4878r interfaceC4878r) {
        if (this.f16345z.m17168v(interfaceC4878r)) {
            this.f16345z.m17170y(this.f16321S);
            m17278V();
        }
    }

    /* renamed from: E0 */
    public final long m17250E0(InterfaceC4882t.b bVar, long j10, boolean z10, boolean z11) {
        m17306i1();
        this.f16312J = false;
        if (z11 || this.f16307E.f16990e == 3) {
            m17287Z0(2);
        }
        C4402a2 m17162p = this.f16345z.m17162p();
        C4402a2 c4402a2 = m17162p;
        while (c4402a2 != null && !bVar.equals(c4402a2.f16139f.f16168a)) {
            c4402a2 = c4402a2.m17044j();
        }
        if (z10 || m17162p != c4402a2 || (c4402a2 != null && c4402a2.m17059z(j10) < 0)) {
            for (InterfaceC4445i3 interfaceC4445i3 : this.f16327h) {
                m17321o(interfaceC4445i3);
            }
            if (c4402a2 != null) {
                while (this.f16345z.m17162p() != c4402a2) {
                    this.f16345z.m17148b();
                }
                this.f16345z.m17171z(c4402a2);
                c4402a2.m17057x(1000000000000L);
                m17329r();
            }
        }
        C4419d2 c4419d2 = this.f16345z;
        if (c4402a2 != null) {
            c4419d2.m17171z(c4402a2);
            if (!c4402a2.f16137d) {
                c4402a2.f16139f = c4402a2.f16139f.m17071b(j10);
            } else if (c4402a2.f16138e) {
                long mo4794m = c4402a2.f16134a.mo4794m(j10);
                c4402a2.f16134a.mo4799t(mo4794m - this.f16339t, this.f16340u);
                j10 = mo4794m;
            }
            m17332s0(j10);
            m17278V();
        } else {
            c4419d2.m17152f();
            m17332s0(j10);
        }
        m17253G(false);
        this.f16334o.mo15323f(2);
        return j10;
    }

    /* renamed from: F */
    public final void m17251F(IOException iOException, int i10) {
        C4481q m17505g = C4481q.m17505g(iOException, i10);
        C4402a2 m17162p = this.f16345z.m17162p();
        if (m17162p != null) {
            m17505g = m17505g.m17509e(m17162p.f16139f.f16168a);
        }
        C4046r.m15524d("ExoPlayerImplInternal", "Playback error", m17505g);
        m17304h1(false, false);
        this.f16307E = this.f16307E.m17864e(m17505g);
    }

    /* renamed from: F0 */
    public final void m17252F0(C4425e3 c4425e3) {
        if (c4425e3.m17186f() == -9223372036854775807L) {
            m17254G0(c4425e3);
            return;
        }
        if (this.f16307E.f16986a.m17676u()) {
            this.f16342w.add(new d(c4425e3));
            return;
        }
        d dVar = new d(c4425e3);
        AbstractC4505u3 abstractC4505u3 = this.f16307E.f16986a;
        if (!m17236u0(dVar, abstractC4505u3, abstractC4505u3, this.f16314L, this.f16315M, this.f16337r, this.f16338s)) {
            c4425e3.m17191k(false);
        } else {
            this.f16342w.add(dVar);
            Collections.sort(this.f16342w);
        }
    }

    /* renamed from: G */
    public final void m17253G(boolean z10) {
        C4402a2 m17156j = this.f16345z.m17156j();
        InterfaceC4882t.b bVar = m17156j == null ? this.f16307E.f16987b : m17156j.f16139f.f16168a;
        boolean z11 = !this.f16307E.f16996k.equals(bVar);
        if (z11) {
            this.f16307E = this.f16307E.m17861b(bVar);
        }
        C4524y2 c4524y2 = this.f16307E;
        c4524y2.f17001p = m17156j == null ? c4524y2.f17003r : m17156j.m17043i();
        this.f16307E.f17002q = m17245C();
        if ((z11 || z10) && m17156j != null && m17156j.f16137d) {
            m17311k1(m17156j.m17048n(), m17156j.m17049o());
        }
    }

    /* renamed from: G0 */
    public final void m17254G0(C4425e3 c4425e3) {
        if (c4425e3.m17183c() != this.f16336q) {
            this.f16334o.mo15327j(15, c4425e3).mo15330a();
            return;
        }
        m17318n(c4425e3);
        int i10 = this.f16307E.f16990e;
        if (i10 == 3 || i10 == 2) {
            this.f16334o.mo15323f(2);
        }
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x0141: MOVE (r5 I:??[long, double]) = (r25 I:??[long, double]), block:B:109:0x0140 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17255H(p264s3.AbstractC4505u3 r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p264s3.C4443i1.m17255H(s3.u3, boolean):void");
    }

    /* renamed from: H0 */
    public final void m17256H0(final C4425e3 c4425e3) {
        Looper m17183c = c4425e3.m17183c();
        if (m17183c.getThread().isAlive()) {
            this.f16343x.mo15273c(m17183c, null).mo15319b(new Runnable() { // from class: s3.h1
                @Override // java.lang.Runnable
                public final void run() {
                    C4443i1.this.m17230U(c4425e3);
                }
            });
        } else {
            C4046r.m15529i("TAG", "Trying to send message on a dead thread.");
            c4425e3.m17191k(false);
        }
    }

    /* renamed from: I */
    public final void m17257I(InterfaceC4878r interfaceC4878r) {
        if (this.f16345z.m17168v(interfaceC4878r)) {
            C4402a2 m17156j = this.f16345z.m17156j();
            m17156j.m17050p(this.f16341v.mo15308h().f16153h, this.f16307E.f16986a);
            m17311k1(m17156j.m17048n(), m17156j.m17049o());
            if (m17156j == this.f16345z.m17162p()) {
                m17332s0(m17156j.f16139f.f16169b);
                m17329r();
                C4524y2 c4524y2 = this.f16307E;
                InterfaceC4882t.b bVar = c4524y2.f16987b;
                long j10 = m17156j.f16139f.f16169b;
                this.f16307E = m17263L(bVar, j10, c4524y2.f16988c, j10, false, 5);
            }
            m17278V();
        }
    }

    /* renamed from: I0 */
    public final void m17258I0(long j10) {
        for (InterfaceC4445i3 interfaceC4445i3 : this.f16327h) {
            if (interfaceC4445i3.mo17214g() != null) {
                m17260J0(interfaceC4445i3, j10);
            }
        }
    }

    /* renamed from: J */
    public final void m17259J(C4403a3 c4403a3, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f16308F.m17350b(1);
            }
            this.f16307E = this.f16307E.m17865f(c4403a3);
        }
        m17323o1(c4403a3.f16153h);
        for (InterfaceC4445i3 interfaceC4445i3 : this.f16327h) {
            if (interfaceC4445i3 != null) {
                interfaceC4445i3.mo11672t(f10, c4403a3.f16153h);
            }
        }
    }

    /* renamed from: J0 */
    public final void m17260J0(InterfaceC4445i3 interfaceC4445i3, long j10) {
        interfaceC4445i3.mo17217l();
        if (interfaceC4445i3 instanceof C1560o) {
            ((C1560o) interfaceC4445i3).m6385j0(j10);
        }
    }

    /* renamed from: K */
    public final void m17261K(C4403a3 c4403a3, boolean z10) {
        m17259J(c4403a3, c4403a3.f16153h, true, z10);
    }

    /* renamed from: K0 */
    public final void m17262K0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f16316N != z10) {
            this.f16316N = z10;
            if (!z10) {
                for (InterfaceC4445i3 interfaceC4445i3 : this.f16327h) {
                    if (!m17227Q(interfaceC4445i3) && this.f16328i.remove(interfaceC4445i3)) {
                        interfaceC4445i3.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    public final C4524y2 m17263L(InterfaceC4882t.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        C4885u0 c4885u0;
        C3736c0 c3736c0;
        this.f16323U = (!this.f16323U && j10 == this.f16307E.f17003r && bVar.equals(this.f16307E.f16987b)) ? false : true;
        m17330r0();
        C4524y2 c4524y2 = this.f16307E;
        C4885u0 c4885u02 = c4524y2.f16993h;
        C3736c0 c3736c02 = c4524y2.f16994i;
        List list2 = c4524y2.f16995j;
        if (this.f16303A.m17547s()) {
            C4402a2 m17162p = this.f16345z.m17162p();
            C4885u0 m17048n = m17162p == null ? C4885u0.f18475k : m17162p.m17048n();
            C3736c0 m17049o = m17162p == null ? this.f16331l : m17162p.m17049o();
            List m17335v = m17335v(m17049o.f13326c);
            if (m17162p != null) {
                C4408b2 c4408b2 = m17162p.f16139f;
                if (c4408b2.f16170c != j11) {
                    m17162p.f16139f = c4408b2.m17070a(j11);
                }
            }
            c4885u0 = m17048n;
            c3736c0 = m17049o;
            list = m17335v;
        } else if (bVar.equals(this.f16307E.f16987b)) {
            list = list2;
            c4885u0 = c4885u02;
            c3736c0 = c3736c02;
        } else {
            c4885u0 = C4885u0.f18475k;
            c3736c0 = this.f16331l;
            list = AbstractC2651u.m10770u();
        }
        if (z10) {
            this.f16308F.m17353e(i10);
        }
        return this.f16307E.m17862c(bVar, j10, j11, j12, m17245C(), c4885u0, c3736c0, list);
    }

    /* renamed from: L0 */
    public final void m17264L0(C4403a3 c4403a3) {
        this.f16334o.mo15326i(16);
        this.f16341v.mo15307d(c4403a3);
    }

    /* renamed from: M */
    public final boolean m17265M(InterfaceC4445i3 interfaceC4445i3, C4402a2 c4402a2) {
        C4402a2 m17044j = c4402a2.m17044j();
        return c4402a2.f16139f.f16173f && m17044j.f16137d && ((interfaceC4445i3 instanceof C1560o) || (interfaceC4445i3 instanceof C3353f) || interfaceC4445i3.mo17197B() >= m17044j.m17047m());
    }

    /* renamed from: M0 */
    public final void m17266M0(b bVar) {
        this.f16308F.m17350b(1);
        if (bVar.f16349c != -1) {
            this.f16320R = new h(new C4430f3(bVar.f16347a, bVar.f16348b), bVar.f16349c, bVar.f16350d);
        }
        m17255H(this.f16303A.m17537C(bVar.f16347a, bVar.f16348b), false);
    }

    /* renamed from: N */
    public final boolean m17267N() {
        C4402a2 m17163q = this.f16345z.m17163q();
        if (!m17163q.f16137d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            InterfaceC4445i3[] interfaceC4445i3Arr = this.f16327h;
            if (i10 >= interfaceC4445i3Arr.length) {
                return true;
            }
            InterfaceC4445i3 interfaceC4445i3 = interfaceC4445i3Arr[i10];
            InterfaceC4869m0 interfaceC4869m0 = m17163q.f16136c[i10];
            if (interfaceC4445i3.mo17214g() != interfaceC4869m0 || (interfaceC4869m0 != null && !interfaceC4445i3.mo17216j() && !m17265M(interfaceC4445i3, m17163q))) {
                break;
            }
            i10++;
        }
        return false;
    }

    /* renamed from: N0 */
    public void m17268N0(List<C4494s2.c> list, int i10, long j10, InterfaceC4873o0 interfaceC4873o0) {
        this.f16334o.mo15327j(17, new b(list, interfaceC4873o0, i10, j10, null)).mo15330a();
    }

    /* renamed from: O0 */
    public final void m17269O0(boolean z10) {
        if (z10 == this.f16318P) {
            return;
        }
        this.f16318P = z10;
        if (z10 || !this.f16307E.f17000o) {
            return;
        }
        this.f16334o.mo15323f(2);
    }

    /* renamed from: P */
    public final boolean m17270P() {
        C4402a2 m17156j = this.f16345z.m17156j();
        return (m17156j == null || m17156j.m17045k() == Long.MIN_VALUE) ? false : true;
    }

    /* renamed from: P0 */
    public final void m17271P0(boolean z10) {
        this.f16310H = z10;
        m17330r0();
        if (!this.f16311I || this.f16345z.m17163q() == this.f16345z.m17162p()) {
            return;
        }
        m17244B0(true);
        m17253G(false);
    }

    /* renamed from: Q0 */
    public void m17272Q0(boolean z10, int i10) {
        this.f16334o.mo15318a(1, z10 ? 1 : 0, i10).mo15330a();
    }

    /* renamed from: R */
    public final boolean m17273R() {
        C4402a2 m17162p = this.f16345z.m17162p();
        long j10 = m17162p.f16139f.f16172e;
        return m17162p.f16137d && (j10 == -9223372036854775807L || this.f16307E.f17003r < j10 || !m17293c1());
    }

    /* renamed from: R0 */
    public final void m17274R0(boolean z10, int i10, boolean z11, int i11) {
        this.f16308F.m17350b(z11 ? 1 : 0);
        this.f16308F.m17351c(i11);
        this.f16307E = this.f16307E.m17863d(z10, i10);
        this.f16312J = false;
        m17299f0(z10);
        if (!m17293c1()) {
            m17306i1();
            m17317m1();
            return;
        }
        int i12 = this.f16307E.f16990e;
        if (i12 == 3) {
            m17300f1();
        } else if (i12 != 2) {
            return;
        }
        this.f16334o.mo15323f(2);
    }

    /* renamed from: S0 */
    public void m17275S0(C4403a3 c4403a3) {
        this.f16334o.mo15327j(4, c4403a3).mo15330a();
    }

    /* renamed from: T0 */
    public final void m17276T0(C4403a3 c4403a3) {
        m17264L0(c4403a3);
        m17261K(this.f16341v.mo15308h(), true);
    }

    /* renamed from: U0 */
    public void m17277U0(int i10) {
        this.f16334o.mo15318a(11, i10, 0).mo15330a();
    }

    /* renamed from: V */
    public final void m17278V() {
        boolean m17291b1 = m17291b1();
        this.f16313K = m17291b1;
        if (m17291b1) {
            this.f16345z.m17156j().m17039d(this.f16321S);
        }
        m17308j1();
    }

    /* renamed from: V0 */
    public final void m17279V0(int i10) {
        this.f16314L = i10;
        if (!this.f16345z.m17146G(this.f16307E.f16986a, i10)) {
            m17244B0(true);
        }
        m17253G(false);
    }

    /* renamed from: W */
    public final void m17280W() {
        this.f16308F.m17352d(this.f16307E);
        if (this.f16308F.f16359a) {
            this.f16344y.mo17354a(this.f16308F);
            this.f16308F = new e(this.f16307E);
        }
    }

    /* renamed from: W0 */
    public final void m17281W0(C4465m3 c4465m3) {
        this.f16306D = c4465m3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r3 = r7.f16342w.get(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r3 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r4 = r3.f16356i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r4 > r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r4 != r0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r3.f16357j <= r8) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1 >= r7.f16342w.size()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r3 = r7.f16342w.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r3 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r3.f16358k == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        r4 = r3.f16356i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r4 < r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r4 != r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r3.f16357j > r8) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r3 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r3.f16358k == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r3.f16356i != r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        r4 = r3.f16357j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r4 <= r8) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (r4 > r10) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        m17254G0(r3.f16355h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if (r3.f16355h.m17182b() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
    
        if (r3.f16355h.m17190j() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        if (r1 >= r7.f16342w.size()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c1, code lost:
    
        r3 = r7.f16342w.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:
    
        r7.f16342w.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cc, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d3, code lost:
    
        if (r3.f16355h.m17182b() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e2, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dd, code lost:
    
        r7.f16342w.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e3, code lost:
    
        r7.f16322T = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007c, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0084, code lost:
    
        if (r1 >= r7.f16342w.size()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0069, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x006a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0053, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0055, code lost:
    
        if (r1 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0044, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0045, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r1 > 0) goto L12;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0055 -> B:10:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0084 -> B:21:0x0060). Please report as a decompilation issue!!! */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17282X(long r8, long r10) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p264s3.C4443i1.m17282X(long, long):void");
    }

    /* renamed from: X0 */
    public final void m17283X0(boolean z10) {
        this.f16315M = z10;
        if (!this.f16345z.m17147H(this.f16307E.f16986a, z10)) {
            m17244B0(true);
        }
        m17253G(false);
    }

    /* renamed from: Y */
    public final void m17284Y() {
        C4408b2 m17161o;
        this.f16345z.m17170y(this.f16321S);
        if (this.f16345z.m17143D() && (m17161o = this.f16345z.m17161o(this.f16321S, this.f16307E)) != null) {
            C4402a2 m17153g = this.f16345z.m17153g(this.f16329j, this.f16330k, this.f16332m.mo17384h(), this.f16303A, m17161o, this.f16331l);
            m17153g.f16134a.mo4792i(this, m17161o.f16169b);
            if (this.f16345z.m17162p() == m17153g) {
                m17332s0(m17161o.f16169b);
            }
            m17253G(false);
        }
        if (!this.f16313K) {
            m17278V();
        } else {
            this.f16313K = m17270P();
            m17308j1();
        }
    }

    /* renamed from: Y0 */
    public final void m17285Y0(InterfaceC4873o0 interfaceC4873o0) {
        this.f16308F.m17350b(1);
        m17255H(this.f16303A.m17538D(interfaceC4873o0), false);
    }

    /* renamed from: Z */
    public final void m17286Z() {
        boolean z10;
        boolean z11 = false;
        while (m17289a1()) {
            if (z11) {
                m17280W();
            }
            C4402a2 c4402a2 = (C4402a2) C4014a.m15199e(this.f16345z.m17148b());
            if (this.f16307E.f16987b.f18457a.equals(c4402a2.f16139f.f16168a.f18457a)) {
                InterfaceC4882t.b bVar = this.f16307E.f16987b;
                if (bVar.f18458b == -1) {
                    InterfaceC4882t.b bVar2 = c4402a2.f16139f.f16168a;
                    if (bVar2.f18458b == -1 && bVar.f18461e != bVar2.f18461e) {
                        z10 = true;
                        C4408b2 c4408b2 = c4402a2.f16139f;
                        InterfaceC4882t.b bVar3 = c4408b2.f16168a;
                        long j10 = c4408b2.f16169b;
                        this.f16307E = m17263L(bVar3, j10, c4408b2.f16170c, j10, !z10, 0);
                        m17330r0();
                        m17317m1();
                        z11 = true;
                    }
                }
            }
            z10 = false;
            C4408b2 c4408b22 = c4402a2.f16139f;
            InterfaceC4882t.b bVar32 = c4408b22.f16168a;
            long j102 = c4408b22.f16169b;
            this.f16307E = m17263L(bVar32, j102, c4408b22.f16170c, j102, !z10, 0);
            m17330r0();
            m17317m1();
            z11 = true;
        }
    }

    /* renamed from: Z0 */
    public final void m17287Z0(int i10) {
        C4524y2 c4524y2 = this.f16307E;
        if (c4524y2.f16990e != i10) {
            if (i10 != 2) {
                this.f16326X = -9223372036854775807L;
            }
            this.f16307E = c4524y2.m17866g(i10);
        }
    }

    /* renamed from: a0 */
    public final void m17288a0() {
        C4402a2 m17163q = this.f16345z.m17163q();
        if (m17163q == null) {
            return;
        }
        int i10 = 0;
        if (m17163q.m17044j() != null && !this.f16311I) {
            if (m17267N()) {
                if (m17163q.m17044j().f16137d || this.f16321S >= m17163q.m17044j().m17047m()) {
                    C3736c0 m17049o = m17163q.m17049o();
                    C4402a2 m17149c = this.f16345z.m17149c();
                    C3736c0 m17049o2 = m17149c.m17049o();
                    AbstractC4505u3 abstractC4505u3 = this.f16307E.f16986a;
                    m17320n1(abstractC4505u3, m17149c.f16139f.f16168a, abstractC4505u3, m17163q.f16139f.f16168a, -9223372036854775807L, false);
                    if (m17149c.f16137d && m17149c.f16134a.mo4795p() != -9223372036854775807L) {
                        m17258I0(m17149c.m17047m());
                        return;
                    }
                    for (int i11 = 0; i11 < this.f16327h.length; i11++) {
                        boolean m14096c = m17049o.m14096c(i11);
                        boolean m14096c2 = m17049o2.m14096c(i11);
                        if (m14096c && !this.f16327h[i11].mo17199D()) {
                            boolean z10 = this.f16329j[i11].mo17215i() == -2;
                            C4455k3 c4455k3 = m17049o.f13325b[i11];
                            C4455k3 c4455k32 = m17049o2.f13325b[i11];
                            if (!m14096c2 || !c4455k32.equals(c4455k3) || z10) {
                                m17260J0(this.f16327h[i11], m17149c.m17047m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!m17163q.f16139f.f16176i && !this.f16311I) {
            return;
        }
        while (true) {
            InterfaceC4445i3[] interfaceC4445i3Arr = this.f16327h;
            if (i10 >= interfaceC4445i3Arr.length) {
                return;
            }
            InterfaceC4445i3 interfaceC4445i3 = interfaceC4445i3Arr[i10];
            InterfaceC4869m0 interfaceC4869m0 = m17163q.f16136c[i10];
            if (interfaceC4869m0 != null && interfaceC4445i3.mo17214g() == interfaceC4869m0 && interfaceC4445i3.mo17216j()) {
                long j10 = m17163q.f16139f.f16172e;
                m17260J0(interfaceC4445i3, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : m17163q.m17046l() + m17163q.f16139f.f16172e);
            }
            i10++;
        }
    }

    /* renamed from: a1 */
    public final boolean m17289a1() {
        C4402a2 m17162p;
        C4402a2 m17044j;
        return m17293c1() && !this.f16311I && (m17162p = this.f16345z.m17162p()) != null && (m17044j = m17162p.m17044j()) != null && this.f16321S >= m17044j.m17047m() && m17044j.f16140g;
    }

    @Override // p264s3.C4425e3.a
    /* renamed from: b */
    public synchronized void mo17195b(C4425e3 c4425e3) {
        if (!this.f16309G && this.f16336q.getThread().isAlive()) {
            this.f16334o.mo15327j(14, c4425e3).mo15330a();
            return;
        }
        C4046r.m15529i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        c4425e3.m17191k(false);
    }

    /* renamed from: b0 */
    public final void m17290b0() {
        C4402a2 m17163q = this.f16345z.m17163q();
        if (m17163q == null || this.f16345z.m17162p() == m17163q || m17163q.f16140g || !m17322o0()) {
            return;
        }
        m17329r();
    }

    /* renamed from: b1 */
    public final boolean m17291b1() {
        if (!m17270P()) {
            return false;
        }
        C4402a2 m17156j = this.f16345z.m17156j();
        long m17247D = m17247D(m17156j.m17045k());
        long m17058y = m17156j == this.f16345z.m17162p() ? m17156j.m17058y(this.f16321S) : m17156j.m17058y(this.f16321S) - m17156j.f16139f.f16169b;
        boolean mo17383g = this.f16332m.mo17383g(m17058y, m17247D, this.f16341v.mo15308h().f16153h);
        if (mo17383g || m17247D >= 500000) {
            return mo17383g;
        }
        if (this.f16339t <= 0 && !this.f16340u) {
            return mo17383g;
        }
        this.f16345z.m17162p().f16134a.mo4799t(this.f16307E.f17003r, false);
        return this.f16332m.mo17383g(m17058y, m17247D, this.f16341v.mo15308h().f16153h);
    }

    @Override // p193n5.AbstractC3734b0.a
    /* renamed from: c */
    public void mo14082c() {
        this.f16334o.mo15323f(10);
    }

    /* renamed from: c0 */
    public final void m17292c0() {
        m17255H(this.f16303A.m17542i(), true);
    }

    /* renamed from: c1 */
    public final boolean m17293c1() {
        C4524y2 c4524y2 = this.f16307E;
        return c4524y2.f16997l && c4524y2.f16998m == 0;
    }

    @Override // p264s3.C4494s2.d
    /* renamed from: d */
    public void mo17294d() {
        this.f16334o.mo15323f(22);
    }

    /* renamed from: d0 */
    public final void m17295d0(c cVar) {
        this.f16308F.m17350b(1);
        m17255H(this.f16303A.m17549v(cVar.f16351a, cVar.f16352b, cVar.f16353c, cVar.f16354d), false);
    }

    /* renamed from: d1 */
    public final boolean m17296d1(boolean z10) {
        if (this.f16319Q == 0) {
            return m17273R();
        }
        if (!z10) {
            return false;
        }
        C4524y2 c4524y2 = this.f16307E;
        if (!c4524y2.f16992g) {
            return true;
        }
        long mo17357b = m17298e1(c4524y2.f16986a, this.f16345z.m17162p().f16139f.f16168a) ? this.f16304B.mo17357b() : -9223372036854775807L;
        C4402a2 m17156j = this.f16345z.m17156j();
        return (m17156j.m17051q() && m17156j.f16139f.f16176i) || (m17156j.f16139f.f16168a.m19438b() && !m17156j.f16137d) || this.f16332m.mo17382f(m17245C(), this.f16341v.mo15308h().f16153h, this.f16312J, mo17357b);
    }

    /* renamed from: e0 */
    public final void m17297e0() {
        for (C4402a2 m17162p = this.f16345z.m17162p(); m17162p != null; m17162p = m17162p.m17044j()) {
            for (InterfaceC3752s interfaceC3752s : m17162p.m17049o().f13326c) {
                if (interfaceC3752s != null) {
                    interfaceC3752s.m14238s();
                }
            }
        }
    }

    /* renamed from: e1 */
    public final boolean m17298e1(AbstractC4505u3 abstractC4505u3, InterfaceC4882t.b bVar) {
        if (bVar.m19438b() || abstractC4505u3.m17676u()) {
            return false;
        }
        abstractC4505u3.m17675r(abstractC4505u3.mo17028l(bVar.f18457a, this.f16338s).f16834j, this.f16337r);
        if (!this.f16337r.m17706g()) {
            return false;
        }
        AbstractC4505u3.d dVar = this.f16337r;
        return dVar.f16868p && dVar.f16865m != -9223372036854775807L;
    }

    /* renamed from: f0 */
    public final void m17299f0(boolean z10) {
        for (C4402a2 m17162p = this.f16345z.m17162p(); m17162p != null; m17162p = m17162p.m17044j()) {
            for (InterfaceC3752s interfaceC3752s : m17162p.m17049o().f13326c) {
                if (interfaceC3752s != null) {
                    interfaceC3752s.m14237k(z10);
                }
            }
        }
    }

    /* renamed from: f1 */
    public final void m17300f1() {
        this.f16312J = false;
        this.f16341v.m17393f();
        for (InterfaceC4445i3 interfaceC4445i3 : this.f16327h) {
            if (m17227Q(interfaceC4445i3)) {
                interfaceC4445i3.start();
            }
        }
    }

    /* renamed from: g0 */
    public final void m17301g0() {
        for (C4402a2 m17162p = this.f16345z.m17162p(); m17162p != null; m17162p = m17162p.m17044j()) {
            for (InterfaceC3752s interfaceC3752s : m17162p.m17049o().f13326c) {
                if (interfaceC3752s != null) {
                    interfaceC3752s.m14240u();
                }
            }
        }
    }

    /* renamed from: g1 */
    public void m17302g1() {
        this.f16334o.mo15320c(6).mo15330a();
    }

    @Override // p290u4.InterfaceC4871n0.a
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void mo4788e(InterfaceC4878r interfaceC4878r) {
        this.f16334o.mo15327j(9, interfaceC4878r).mo15330a();
    }

    /* renamed from: h1 */
    public final void m17304h1(boolean z10, boolean z11) {
        m17328q0(z10 || !this.f16316N, false, true, false);
        this.f16308F.m17350b(z11 ? 1 : 0);
        this.f16332m.mo17385i();
        m17287Z0(1);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10;
        int i11;
        C4402a2 m17163q;
        IOException iOException;
        try {
            switch (message.what) {
                case 0:
                    m17307j0();
                    break;
                case 1:
                    m17274R0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m17324p();
                    break;
                case 3:
                    m17246C0((h) message.obj);
                    break;
                case 4:
                    m17276T0((C4403a3) message.obj);
                    break;
                case 5:
                    m17281W0((C4465m3) message.obj);
                    break;
                case 6:
                    m17304h1(false, true);
                    break;
                case 7:
                    m17313l0();
                    return true;
                case 8:
                    m17257I((InterfaceC4878r) message.obj);
                    break;
                case 9:
                    m17249E((InterfaceC4878r) message.obj);
                    break;
                case 10:
                    m17325p0();
                    break;
                case 11:
                    m17279V0(message.arg1);
                    break;
                case 12:
                    m17283X0(message.arg1 != 0);
                    break;
                case 13:
                    m17262K0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m17252F0((C4425e3) message.obj);
                    break;
                case 15:
                    m17256H0((C4425e3) message.obj);
                    break;
                case 16:
                    m17261K((C4403a3) message.obj, false);
                    break;
                case 17:
                    m17266M0((b) message.obj);
                    break;
                case 18:
                    m17312l((b) message.obj, message.arg1);
                    break;
                case 19:
                    m17295d0((c) message.obj);
                    break;
                case 20:
                    m17316m0(message.arg1, message.arg2, (InterfaceC4873o0) message.obj);
                    break;
                case 21:
                    m17285Y0((InterfaceC4873o0) message.obj);
                    break;
                case 22:
                    m17292c0();
                    break;
                case 23:
                    m17271P0(message.arg1 != 0);
                    break;
                case 24:
                    m17269O0(message.arg1 == 1);
                    break;
                case 25:
                    m17315m();
                    break;
                default:
                    return false;
            }
        } catch (C4846b e10) {
            i10 = 1002;
            iOException = e10;
            m17251F(iOException, i10);
        } catch (IOException e11) {
            i10 = 2000;
            iOException = e11;
            m17251F(iOException, i10);
        } catch (RuntimeException e12) {
            e = C4481q.m17507i(e12, ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) ? 1004 : 1000);
            C4046r.m15524d("ExoPlayerImplInternal", "Playback error", e);
            m17304h1(true, false);
            this.f16307E = this.f16307E.m17864e(e);
        } catch (C3912k e13) {
            i10 = e13.f14048h;
            iOException = e13;
            m17251F(iOException, i10);
        } catch (C4481q e14) {
            e = e14;
            if (e.f16611p == 1 && (m17163q = this.f16345z.m17163q()) != null) {
                e = e.m17509e(m17163q.f16139f.f16168a);
            }
            if (e.f16617v && this.f16324V == null) {
                C4046r.m15530j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f16324V = e;
                InterfaceC4040n interfaceC4040n = this.f16334o;
                interfaceC4040n.mo15322e(interfaceC4040n.mo15327j(25, e));
            } else {
                C4481q c4481q = this.f16324V;
                if (c4481q != null) {
                    c4481q.addSuppressed(e);
                    e = this.f16324V;
                }
                C4046r.m15524d("ExoPlayerImplInternal", "Playback error", e);
                m17304h1(true, false);
                this.f16307E = this.f16307E.m17864e(e);
            }
        } catch (C4499t2 e15) {
            int i12 = e15.f16700i;
            if (i12 == 1) {
                i11 = e15.f16699h ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i11 = e15.f16699h ? 3002 : 3004;
                }
                m17251F(e15, r2);
            }
            r2 = i11;
            m17251F(e15, r2);
        } catch (InterfaceC5248n.a e16) {
            i10 = e16.f19914h;
            iOException = e16;
            m17251F(iOException, i10);
        }
        m17280W();
        return true;
    }

    /* renamed from: i0 */
    public void m17305i0() {
        this.f16334o.mo15320c(0).mo15330a();
    }

    /* renamed from: i1 */
    public final void m17306i1() {
        this.f16341v.m17394g();
        for (InterfaceC4445i3 interfaceC4445i3 : this.f16327h) {
            if (m17227Q(interfaceC4445i3)) {
                m17333t(interfaceC4445i3);
            }
        }
    }

    /* renamed from: j0 */
    public final void m17307j0() {
        this.f16308F.m17350b(1);
        m17328q0(false, false, false, true);
        this.f16332m.mo17377a();
        m17287Z0(this.f16307E.f16986a.m17676u() ? 4 : 2);
        this.f16303A.m17550w(this.f16333n.mo14781e());
        this.f16334o.mo15323f(2);
    }

    /* renamed from: j1 */
    public final void m17308j1() {
        C4402a2 m17156j = this.f16345z.m17156j();
        boolean z10 = this.f16313K || (m17156j != null && m17156j.f16134a.isLoading());
        C4524y2 c4524y2 = this.f16307E;
        if (z10 != c4524y2.f16992g) {
            this.f16307E = c4524y2.m17860a(z10);
        }
    }

    @Override // p290u4.InterfaceC4878r.a
    /* renamed from: k */
    public void mo17309k(InterfaceC4878r interfaceC4878r) {
        this.f16334o.mo15327j(8, interfaceC4878r).mo15330a();
    }

    /* renamed from: k0 */
    public synchronized boolean m17310k0() {
        if (!this.f16309G && this.f16336q.getThread().isAlive()) {
            this.f16334o.mo15323f(7);
            m17326p1(new InterfaceC2438u() { // from class: s3.g1
                @Override // p109h7.InterfaceC2438u
                public final Object get() {
                    Boolean m17229T;
                    m17229T = C4443i1.this.m17229T();
                    return m17229T;
                }
            }, this.f16305C);
            return this.f16309G;
        }
        return true;
    }

    /* renamed from: k1 */
    public final void m17311k1(C4885u0 c4885u0, C3736c0 c3736c0) {
        this.f16332m.mo17380d(this.f16327h, c4885u0, c3736c0.f13326c);
    }

    /* renamed from: l */
    public final void m17312l(b bVar, int i10) {
        this.f16308F.m17350b(1);
        C4494s2 c4494s2 = this.f16303A;
        if (i10 == -1) {
            i10 = c4494s2.m17546q();
        }
        m17255H(c4494s2.m17539f(i10, bVar.f16347a, bVar.f16348b), false);
    }

    /* renamed from: l0 */
    public final void m17313l0() {
        m17328q0(true, false, true, false);
        this.f16332m.mo17381e();
        m17287Z0(1);
        HandlerThread handlerThread = this.f16335p;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f16309G = true;
            notifyAll();
        }
    }

    /* renamed from: l1 */
    public final void m17314l1() {
        if (this.f16307E.f16986a.m17676u() || !this.f16303A.m17547s()) {
            return;
        }
        m17284Y();
        m17288a0();
        m17290b0();
        m17286Z();
    }

    /* renamed from: m */
    public final void m17315m() {
        m17244B0(true);
    }

    /* renamed from: m0 */
    public final void m17316m0(int i10, int i11, InterfaceC4873o0 interfaceC4873o0) {
        this.f16308F.m17350b(1);
        m17255H(this.f16303A.m17535A(i10, i11, interfaceC4873o0), false);
    }

    /* renamed from: m1 */
    public final void m17317m1() {
        C4402a2 m17162p = this.f16345z.m17162p();
        if (m17162p == null) {
            return;
        }
        long mo4795p = m17162p.f16137d ? m17162p.f16134a.mo4795p() : -9223372036854775807L;
        if (mo4795p != -9223372036854775807L) {
            m17332s0(mo4795p);
            if (mo4795p != this.f16307E.f17003r) {
                C4524y2 c4524y2 = this.f16307E;
                this.f16307E = m17263L(c4524y2.f16987b, mo4795p, c4524y2.f16988c, mo4795p, true, 5);
            }
        } else {
            long m17395i = this.f16341v.m17395i(m17162p != this.f16345z.m17163q());
            this.f16321S = m17395i;
            long m17058y = m17162p.m17058y(m17395i);
            m17282X(this.f16307E.f17003r, m17058y);
            this.f16307E.f17003r = m17058y;
        }
        this.f16307E.f17001p = this.f16345z.m17156j().m17043i();
        this.f16307E.f17002q = m17245C();
        C4524y2 c4524y22 = this.f16307E;
        if (c4524y22.f16997l && c4524y22.f16990e == 3 && m17298e1(c4524y22.f16986a, c4524y22.f16987b) && this.f16307E.f16999n.f16153h == 1.0f) {
            float mo17356a = this.f16304B.mo17356a(m17337w(), m17245C());
            if (this.f16341v.mo15308h().f16153h != mo17356a) {
                m17264L0(this.f16307E.f16999n.m17063d(mo17356a));
                m17259J(this.f16307E.f16999n, this.f16341v.mo15308h().f16153h, false, false);
            }
        }
    }

    /* renamed from: n */
    public final void m17318n(C4425e3 c4425e3) {
        if (c4425e3.m17190j()) {
            return;
        }
        try {
            c4425e3.m17187g().mo16091y(c4425e3.m17189i(), c4425e3.m17185e());
        } finally {
            c4425e3.m17191k(true);
        }
    }

    /* renamed from: n0 */
    public void m17319n0(int i10, int i11, InterfaceC4873o0 interfaceC4873o0) {
        this.f16334o.mo15324g(20, i10, i11, interfaceC4873o0).mo15330a();
    }

    /* renamed from: n1 */
    public final void m17320n1(AbstractC4505u3 abstractC4505u3, InterfaceC4882t.b bVar, AbstractC4505u3 abstractC4505u32, InterfaceC4882t.b bVar2, long j10, boolean z10) {
        if (!m17298e1(abstractC4505u3, bVar)) {
            C4403a3 c4403a3 = bVar.m19438b() ? C4403a3.f16149k : this.f16307E.f16999n;
            if (this.f16341v.mo15308h().equals(c4403a3)) {
                return;
            }
            m17264L0(c4403a3);
            m17259J(this.f16307E.f16999n, c4403a3.f16153h, false, false);
            return;
        }
        abstractC4505u3.m17675r(abstractC4505u3.mo17028l(bVar.f18457a, this.f16338s).f16834j, this.f16337r);
        this.f16304B.mo17360e((C4503u1.g) C4041n0.m15463j(this.f16337r.f16870r));
        if (j10 != -9223372036854775807L) {
            this.f16304B.mo17359d(m17338y(abstractC4505u3, bVar.f18457a, j10));
            return;
        }
        if (!C4041n0.m15449c(abstractC4505u32.m17676u() ? null : abstractC4505u32.m17675r(abstractC4505u32.mo17028l(bVar2.f18457a, this.f16338s).f16834j, this.f16337r).f16860h, this.f16337r.f16860h) || z10) {
            this.f16304B.mo17359d(-9223372036854775807L);
        }
    }

    /* renamed from: o */
    public final void m17321o(InterfaceC4445i3 interfaceC4445i3) {
        if (m17227Q(interfaceC4445i3)) {
            this.f16341v.m17389a(interfaceC4445i3);
            m17333t(interfaceC4445i3);
            interfaceC4445i3.mo17213f();
            this.f16319Q--;
        }
    }

    /* renamed from: o0 */
    public final boolean m17322o0() {
        C4402a2 m17163q = this.f16345z.m17163q();
        C3736c0 m17049o = m17163q.m17049o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            InterfaceC4445i3[] interfaceC4445i3Arr = this.f16327h;
            if (i10 >= interfaceC4445i3Arr.length) {
                return !z10;
            }
            InterfaceC4445i3 interfaceC4445i3 = interfaceC4445i3Arr[i10];
            if (m17227Q(interfaceC4445i3)) {
                boolean z11 = interfaceC4445i3.mo17214g() != m17163q.f16136c[i10];
                if (!m17049o.m14096c(i10) || z11) {
                    if (!interfaceC4445i3.mo17199D()) {
                        interfaceC4445i3.mo17196A(m17238x(m17049o.f13326c[i10]), m17163q.f16136c[i10], m17163q.m17047m(), m17163q.m17046l());
                    } else if (interfaceC4445i3.mo6376c()) {
                        m17321o(interfaceC4445i3);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    /* renamed from: o1 */
    public final void m17323o1(float f10) {
        for (C4402a2 m17162p = this.f16345z.m17162p(); m17162p != null; m17162p = m17162p.m17044j()) {
            for (InterfaceC3752s interfaceC3752s : m17162p.m17049o().f13326c) {
                if (interfaceC3752s != null) {
                    interfaceC3752s.mo14066q(f10);
                }
            }
        }
    }

    @Override // p264s3.C4456l.a
    public void onPlaybackParametersChanged(C4403a3 c4403a3) {
        this.f16334o.mo15327j(16, c4403a3).mo15330a();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a5  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17324p() {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p264s3.C4443i1.m17324p():void");
    }

    /* renamed from: p0 */
    public final void m17325p0() {
        float f10 = this.f16341v.mo15308h().f16153h;
        C4402a2 m17163q = this.f16345z.m17163q();
        boolean z10 = true;
        for (C4402a2 m17162p = this.f16345z.m17162p(); m17162p != null && m17162p.f16137d; m17162p = m17162p.m17044j()) {
            C3736c0 m17055v = m17162p.m17055v(f10, this.f16307E.f16986a);
            if (!m17055v.m14094a(m17162p.m17049o())) {
                C4419d2 c4419d2 = this.f16345z;
                if (z10) {
                    C4402a2 m17162p2 = c4419d2.m17162p();
                    boolean m17171z = this.f16345z.m17171z(m17162p2);
                    boolean[] zArr = new boolean[this.f16327h.length];
                    long m17037b = m17162p2.m17037b(m17055v, this.f16307E.f17003r, m17171z, zArr);
                    C4524y2 c4524y2 = this.f16307E;
                    boolean z11 = (c4524y2.f16990e == 4 || m17037b == c4524y2.f17003r) ? false : true;
                    C4524y2 c4524y22 = this.f16307E;
                    this.f16307E = m17263L(c4524y22.f16987b, m17037b, c4524y22.f16988c, c4524y22.f16989d, z11, 5);
                    if (z11) {
                        m17332s0(m17037b);
                    }
                    boolean[] zArr2 = new boolean[this.f16327h.length];
                    int i10 = 0;
                    while (true) {
                        InterfaceC4445i3[] interfaceC4445i3Arr = this.f16327h;
                        if (i10 >= interfaceC4445i3Arr.length) {
                            break;
                        }
                        InterfaceC4445i3 interfaceC4445i3 = interfaceC4445i3Arr[i10];
                        zArr2[i10] = m17227Q(interfaceC4445i3);
                        InterfaceC4869m0 interfaceC4869m0 = m17162p2.f16136c[i10];
                        if (zArr2[i10]) {
                            if (interfaceC4869m0 != interfaceC4445i3.mo17214g()) {
                                m17321o(interfaceC4445i3);
                            } else if (zArr[i10]) {
                                interfaceC4445i3.mo17198C(this.f16321S);
                            }
                        }
                        i10++;
                    }
                    m17331s(zArr2);
                } else {
                    c4419d2.m17171z(m17162p);
                    if (m17162p.f16137d) {
                        m17162p.m17036a(m17055v, Math.max(m17162p.f16139f.f16169b, m17162p.m17058y(this.f16321S)), false);
                    }
                }
                m17253G(true);
                if (this.f16307E.f16990e != 4) {
                    m17278V();
                    m17317m1();
                    this.f16334o.mo15323f(2);
                    return;
                }
                return;
            }
            if (m17162p == m17163q) {
                z10 = false;
            }
        }
    }

    /* renamed from: p1 */
    public final synchronized void m17326p1(InterfaceC2438u<Boolean> interfaceC2438u, long j10) {
        long mo15272b = this.f16343x.mo15272b() + j10;
        boolean z10 = false;
        while (!interfaceC2438u.get().booleanValue() && j10 > 0) {
            try {
                this.f16343x.mo15274d();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = mo15272b - this.f16343x.mo15272b();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: q */
    public final void m17327q(int i10, boolean z10) {
        InterfaceC4445i3 interfaceC4445i3 = this.f16327h[i10];
        if (m17227Q(interfaceC4445i3)) {
            return;
        }
        C4402a2 m17163q = this.f16345z.m17163q();
        boolean z11 = m17163q == this.f16345z.m17162p();
        C3736c0 m17049o = m17163q.m17049o();
        C4455k3 c4455k3 = m17049o.f13325b[i10];
        C4463m1[] m17238x = m17238x(m17049o.f13326c[i10]);
        boolean z12 = m17293c1() && this.f16307E.f16990e == 3;
        boolean z13 = !z10 && z12;
        this.f16319Q++;
        this.f16328i.add(interfaceC4445i3);
        interfaceC4445i3.mo17201F(c4455k3, m17238x, m17163q.f16136c[i10], this.f16321S, z13, z11, m17163q.m17047m(), m17163q.m17046l());
        interfaceC4445i3.mo16091y(11, new a());
        this.f16341v.m17390b(interfaceC4445i3);
        if (z12) {
            interfaceC4445i3.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17328q0(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p264s3.C4443i1.m17328q0(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: r */
    public final void m17329r() {
        m17331s(new boolean[this.f16327h.length]);
    }

    /* renamed from: r0 */
    public final void m17330r0() {
        C4402a2 m17162p = this.f16345z.m17162p();
        this.f16311I = m17162p != null && m17162p.f16139f.f16175h && this.f16310H;
    }

    /* renamed from: s */
    public final void m17331s(boolean[] zArr) {
        C4402a2 m17163q = this.f16345z.m17163q();
        C3736c0 m17049o = m17163q.m17049o();
        for (int i10 = 0; i10 < this.f16327h.length; i10++) {
            if (!m17049o.m14096c(i10) && this.f16328i.remove(this.f16327h[i10])) {
                this.f16327h[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f16327h.length; i11++) {
            if (m17049o.m14096c(i11)) {
                m17327q(i11, zArr[i11]);
            }
        }
        m17163q.f16140g = true;
    }

    /* renamed from: s0 */
    public final void m17332s0(long j10) {
        C4402a2 m17162p = this.f16345z.m17162p();
        long m17059z = m17162p == null ? j10 + 1000000000000L : m17162p.m17059z(j10);
        this.f16321S = m17059z;
        this.f16341v.m17391c(m17059z);
        for (InterfaceC4445i3 interfaceC4445i3 : this.f16327h) {
            if (m17227Q(interfaceC4445i3)) {
                interfaceC4445i3.mo17198C(this.f16321S);
            }
        }
        m17297e0();
    }

    /* renamed from: t */
    public final void m17333t(InterfaceC4445i3 interfaceC4445i3) {
        if (interfaceC4445i3.getState() == 2) {
            interfaceC4445i3.stop();
        }
    }

    /* renamed from: u */
    public void m17334u(long j10) {
        this.f16325W = j10;
    }

    /* renamed from: v */
    public final AbstractC2651u<C3348a> m17335v(InterfaceC3752s[] interfaceC3752sArr) {
        AbstractC2651u.a aVar = new AbstractC2651u.a();
        boolean z10 = false;
        for (InterfaceC3752s interfaceC3752s : interfaceC3752sArr) {
            if (interfaceC3752s != null) {
                C3348a c3348a = interfaceC3752s.mo14087c(0).f16504q;
                if (c3348a == null) {
                    aVar.mo10749a(new C3348a(new C3348a.b[0]));
                } else {
                    aVar.mo10749a(c3348a);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.m10784k() : AbstractC2651u.m10770u();
    }

    /* renamed from: v0 */
    public final void m17336v0(AbstractC4505u3 abstractC4505u3, AbstractC4505u3 abstractC4505u32) {
        if (abstractC4505u3.m17676u() && abstractC4505u32.m17676u()) {
            return;
        }
        for (int size = this.f16342w.size() - 1; size >= 0; size--) {
            if (!m17236u0(this.f16342w.get(size), abstractC4505u3, abstractC4505u32, this.f16314L, this.f16315M, this.f16337r, this.f16338s)) {
                this.f16342w.get(size).f16355h.m17191k(false);
                this.f16342w.remove(size);
            }
        }
        Collections.sort(this.f16342w);
    }

    /* renamed from: w */
    public final long m17337w() {
        C4524y2 c4524y2 = this.f16307E;
        return m17338y(c4524y2.f16986a, c4524y2.f16987b.f18457a, c4524y2.f17003r);
    }

    /* renamed from: y */
    public final long m17338y(AbstractC4505u3 abstractC4505u3, Object obj, long j10) {
        abstractC4505u3.m17675r(abstractC4505u3.mo17028l(obj, this.f16338s).f16834j, this.f16337r);
        AbstractC4505u3.d dVar = this.f16337r;
        if (dVar.f16865m != -9223372036854775807L && dVar.m17706g()) {
            AbstractC4505u3.d dVar2 = this.f16337r;
            if (dVar2.f16868p) {
                return C4041n0.m15396B0(dVar2.m17702c() - this.f16337r.f16865m) - (j10 + this.f16338s.m17694q());
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: z */
    public final long m17339z() {
        C4402a2 m17163q = this.f16345z.m17163q();
        if (m17163q == null) {
            return 0L;
        }
        long m17046l = m17163q.m17046l();
        if (!m17163q.f16137d) {
            return m17046l;
        }
        int i10 = 0;
        while (true) {
            InterfaceC4445i3[] interfaceC4445i3Arr = this.f16327h;
            if (i10 >= interfaceC4445i3Arr.length) {
                return m17046l;
            }
            if (m17227Q(interfaceC4445i3Arr[i10]) && this.f16327h[i10].mo17214g() == m17163q.f16136c[i10]) {
                long mo17197B = this.f16327h[i10].mo17197B();
                if (mo17197B == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                m17046l = Math.max(mo17197B, m17046l);
            }
            i10++;
        }
    }

    /* renamed from: z0 */
    public final void m17340z0(long j10, long j11) {
        this.f16334o.mo15325h(2, j10 + j11);
    }
}
