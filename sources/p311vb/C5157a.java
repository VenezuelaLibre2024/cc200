package p311vb;

import ac.InterfaceC0087b;
import android.media.MediaFormat;
import ec.InterfaceC1766b;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p025bc.InterfaceC0545e;
import p085fc.C1898a;
import p085fc.C1900c;
import p085fc.C1901d;
import p085fc.C1903f;
import p085fc.InterfaceC1902e;
import p296ub.C5002c;
import p325wb.C5472e;
import p325wb.C5474g;
import p325wb.C5475h;
import p371zb.InterfaceC6116a;

/* renamed from: vb.a */
/* loaded from: classes.dex */
public class C5157a {

    /* renamed from: j */
    public static final C5472e f19423j = new C5472e(C5157a.class.getSimpleName());

    /* renamed from: a */
    public InterfaceC6116a f19424a;

    /* renamed from: b */
    public final C5474g<List<InterfaceC0087b>> f19425b = new C5474g<>();

    /* renamed from: c */
    public final C5474g<ArrayList<InterfaceC1902e>> f19426c = new C5474g<>(new ArrayList(), new ArrayList());

    /* renamed from: d */
    public final C5474g<ArrayList<InterfaceC1766b>> f19427d = new C5474g<>(new ArrayList(), new ArrayList());

    /* renamed from: e */
    public final C5474g<Integer> f19428e = new C5474g<>(0, 0);

    /* renamed from: f */
    public final C5474g<EnumC5159c> f19429f = new C5474g<>();

    /* renamed from: g */
    public final C5474g<MediaFormat> f19430g = new C5474g<>();

    /* renamed from: h */
    public volatile double f19431h;

    /* renamed from: i */
    public final c f19432i;

    /* renamed from: vb.a$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC1766b {

        /* renamed from: a */
        public long f19433a;

        /* renamed from: b */
        public long f19434b = Long.MAX_VALUE;

        /* renamed from: c */
        public long f19435c;

        /* renamed from: d */
        public final /* synthetic */ long f19436d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC1766b f19437e;

        public a(long j10, InterfaceC1766b interfaceC1766b) {
            this.f19436d = j10;
            this.f19437e = interfaceC1766b;
            this.f19435c = j10 + 10;
        }

        @Override // ec.InterfaceC1766b
        /* renamed from: a */
        public long mo7065a(EnumC5160d enumC5160d, long j10) {
            if (j10 == Long.MAX_VALUE) {
                return this.f19433a;
            }
            if (this.f19434b == Long.MAX_VALUE) {
                this.f19434b = j10;
            }
            long j11 = this.f19435c + (j10 - this.f19434b);
            this.f19433a = j11;
            return this.f19437e.mo7065a(enumC5160d, j11);
        }
    }

    /* renamed from: vb.a$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19439a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f19440b;

        static {
            int[] iArr = new int[EnumC5159c.values().length];
            f19440b = iArr;
            try {
                iArr[EnumC5159c.PASS_THROUGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19440b[EnumC5159c.COMPRESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19440b[EnumC5159c.ABSENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19440b[EnumC5159c.REMOVING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[EnumC5160d.values().length];
            f19439a = iArr2;
            try {
                iArr2[EnumC5160d.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19439a[EnumC5160d.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: vb.a$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo19574a(double d10);
    }

    public C5157a(c cVar) {
        this.f19432i = cVar;
    }

    /* renamed from: a */
    public final void m20863a(EnumC5160d enumC5160d) {
        int intValue = this.f19428e.m21697e(enumC5160d).intValue();
        InterfaceC1902e interfaceC1902e = this.f19426c.m21697e(enumC5160d).get(intValue);
        InterfaceC0087b interfaceC0087b = this.f19425b.m21697e(enumC5160d).get(intValue);
        interfaceC1902e.release();
        interfaceC0087b.mo381f(enumC5160d);
        this.f19428e.m21700h(enumC5160d, Integer.valueOf(intValue + 1));
    }

    /* renamed from: b */
    public final void m20864b(EnumC5160d enumC5160d, InterfaceC0545e interfaceC0545e, List<InterfaceC0087b> list) {
        EnumC5159c enumC5159c = EnumC5159c.ABSENT;
        MediaFormat mediaFormat = new MediaFormat();
        if (!list.isEmpty()) {
            C5158b c5158b = new C5158b();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC0087b interfaceC0087b : list) {
                MediaFormat mo380e = interfaceC0087b.mo380e(enumC5160d);
                if (mo380e != null) {
                    arrayList.add(c5158b.m20885h(interfaceC0087b, enumC5160d, mo380e));
                }
            }
            if (arrayList.size() == list.size()) {
                enumC5159c = interfaceC0545e.mo2658a(arrayList, mediaFormat);
            } else if (!arrayList.isEmpty()) {
                throw new IllegalArgumentException("getTrackFormat returned null for " + (list.size() - arrayList.size()) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + list.size() + " sources off " + enumC5160d);
            }
        }
        this.f19430g.m21700h(enumC5160d, mediaFormat);
        this.f19424a.mo24401a(enumC5160d, enumC5159c);
        this.f19429f.m21700h(enumC5160d, enumC5159c);
    }

    /* renamed from: c */
    public final InterfaceC1766b m20865c(EnumC5160d enumC5160d, int i10, InterfaceC1766b interfaceC1766b) {
        return new a(i10 > 0 ? this.f19427d.m21697e(enumC5160d).get(i10 - 1).mo7065a(enumC5160d, Long.MAX_VALUE) : 0L, interfaceC1766b);
    }

    /* renamed from: d */
    public final InterfaceC1902e m20866d(EnumC5160d enumC5160d, C5002c c5002c) {
        int intValue = this.f19428e.m21697e(enumC5160d).intValue();
        int size = this.f19426c.m21697e(enumC5160d).size() - 1;
        if (size == intValue) {
            if (!this.f19426c.m21697e(enumC5160d).get(size).mo7769a()) {
                return this.f19426c.m21697e(enumC5160d).get(intValue);
            }
            m20863a(enumC5160d);
            return m20866d(enumC5160d, c5002c);
        }
        if (size < intValue) {
            m20875m(enumC5160d, c5002c);
            return this.f19426c.m21697e(enumC5160d).get(intValue);
        }
        throw new IllegalStateException("This should never happen. last:" + size + ", current:" + intValue);
    }

    /* renamed from: e */
    public final long m20867e() {
        return Math.min(m20873k() && this.f19429f.m21699g().m20886b() ? m20868f(EnumC5160d.VIDEO) : Long.MAX_VALUE, m20872j() && this.f19429f.m21698f().m20886b() ? m20868f(EnumC5160d.AUDIO) : Long.MAX_VALUE);
    }

    /* renamed from: f */
    public final long m20868f(EnumC5160d enumC5160d) {
        long j10 = 0;
        if (!this.f19429f.m21697e(enumC5160d).m20886b()) {
            return 0L;
        }
        int intValue = this.f19428e.m21697e(enumC5160d).intValue();
        int i10 = 0;
        while (i10 < this.f19425b.m21697e(enumC5160d).size()) {
            InterfaceC0087b interfaceC0087b = this.f19425b.m21697e(enumC5160d).get(i10);
            j10 += i10 < intValue ? interfaceC0087b.mo384i() : interfaceC0087b.mo379d();
            i10++;
        }
        return j10;
    }

    /* renamed from: g */
    public final double m20869g(EnumC5160d enumC5160d) {
        if (!this.f19429f.m21697e(enumC5160d).m20886b()) {
            return 0.0d;
        }
        long m20870h = m20870h(enumC5160d);
        long m20867e = m20867e();
        f19423j.m21686g("getTrackProgress - readUs:" + m20870h + ", totalUs:" + m20867e);
        if (m20867e == 0) {
            m20867e = 1;
        }
        return m20870h / m20867e;
    }

    /* renamed from: h */
    public final long m20870h(EnumC5160d enumC5160d) {
        long j10 = 0;
        if (!this.f19429f.m21697e(enumC5160d).m20886b()) {
            return 0L;
        }
        int intValue = this.f19428e.m21697e(enumC5160d).intValue();
        for (int i10 = 0; i10 < this.f19425b.m21697e(enumC5160d).size(); i10++) {
            InterfaceC0087b interfaceC0087b = this.f19425b.m21697e(enumC5160d).get(i10);
            if (i10 <= intValue) {
                j10 += interfaceC0087b.mo384i();
            }
        }
        return j10;
    }

    /* renamed from: i */
    public final Set<InterfaceC0087b> m20871i() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f19425b.m21699g());
        hashSet.addAll(this.f19425b.m21698f());
        return hashSet;
    }

    /* renamed from: j */
    public final boolean m20872j() {
        return !this.f19425b.m21698f().isEmpty();
    }

    /* renamed from: k */
    public final boolean m20873k() {
        return !this.f19425b.m21699g().isEmpty();
    }

    /* renamed from: l */
    public final boolean m20874l(EnumC5160d enumC5160d) {
        if (this.f19425b.m21697e(enumC5160d).isEmpty()) {
            return true;
        }
        int intValue = this.f19428e.m21697e(enumC5160d).intValue();
        return intValue == this.f19425b.m21697e(enumC5160d).size() - 1 && intValue == this.f19426c.m21697e(enumC5160d).size() - 1 && this.f19426c.m21697e(enumC5160d).get(intValue).mo7769a();
    }

    /* renamed from: m */
    public final void m20875m(EnumC5160d enumC5160d, C5002c c5002c) {
        InterfaceC1902e c1901d;
        InterfaceC1902e c1903f;
        int intValue = this.f19428e.m21697e(enumC5160d).intValue();
        EnumC5159c m21697e = this.f19429f.m21697e(enumC5160d);
        InterfaceC0087b interfaceC0087b = this.f19425b.m21697e(enumC5160d).get(intValue);
        if (m21697e.m20886b()) {
            interfaceC0087b.mo382g(enumC5160d);
        }
        InterfaceC1766b m20865c = m20865c(enumC5160d, intValue, c5002c.m19591p());
        this.f19427d.m21697e(enumC5160d).add(m20865c);
        int i10 = b.f19440b[m21697e.ordinal()];
        if (i10 == 1) {
            c1901d = new C1901d(interfaceC0087b, this.f19424a, enumC5160d, m20865c);
        } else if (i10 != 2) {
            c1901d = new C1900c();
        } else {
            int i11 = b.f19439a[enumC5160d.ordinal()];
            if (i11 == 1) {
                c1903f = new C1903f(interfaceC0087b, this.f19424a, m20865c, c5002c.m19594s());
            } else {
                if (i11 != 2) {
                    throw new RuntimeException("Unknown type: " + enumC5160d);
                }
                c1903f = new C1898a(interfaceC0087b, this.f19424a, m20865c, c5002c.m19588m(), c5002c.m19587l());
            }
            c1901d = c1903f;
        }
        c1901d.mo7770b(this.f19430g.m21697e(enumC5160d));
        this.f19426c.m21697e(enumC5160d).add(c1901d);
    }

    /* renamed from: n */
    public final void m20876n(double d10) {
        this.f19431h = d10;
        c cVar = this.f19432i;
        if (cVar != null) {
            cVar.mo19574a(d10);
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* renamed from: o */
    public void m20877o(C5002c c5002c) {
        boolean z10;
        this.f19424a = c5002c.m19590o();
        this.f19425b.m21702j(c5002c.m19593r());
        this.f19425b.m21701i(c5002c.m19586k());
        boolean z11 = false;
        this.f19424a.mo24404d(0);
        Iterator<InterfaceC0087b> it = m20871i().iterator();
        while (true) {
            z10 = true;
            if (!it.hasNext()) {
                break;
            }
            double[] mo388m = it.next().mo388m();
            if (mo388m != null) {
                this.f19424a.mo24405e(mo388m[0], mo388m[1]);
                break;
            }
        }
        m20864b(EnumC5160d.AUDIO, c5002c.m19589n(), c5002c.m19586k());
        m20864b(EnumC5160d.VIDEO, c5002c.m19595t(), c5002c.m19593r());
        EnumC5159c m21699g = this.f19429f.m21699g();
        EnumC5159c m21698f = this.f19429f.m21698f();
        ?? m20886b = m21699g.m20886b();
        int i10 = m20886b;
        if (m21698f.m20886b()) {
            i10 = m20886b + 1;
        }
        f19423j.m21686g("Duration (us): " + m20867e());
        boolean z12 = m21699g.m20886b() && c5002c.m19594s() != 0;
        if (!c5002c.m19592q().mo9874a(m21699g, m21698f) && !z12) {
            throw new C5475h("Validator returned false.");
        }
        boolean z13 = false;
        boolean z14 = false;
        long j10 = 0;
        while (true) {
            if (z13 && z14) {
                this.f19424a.stop();
                return;
            }
            try {
                C5472e c5472e = f19423j;
                c5472e.m21686g("new step: " + j10);
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                long m20867e = m20867e() + 100;
                EnumC5160d enumC5160d = EnumC5160d.AUDIO;
                boolean z15 = m20870h(enumC5160d) > m20867e ? z10 : z11;
                EnumC5160d enumC5160d2 = EnumC5160d.VIDEO;
                boolean z16 = m20870h(enumC5160d2) > m20867e ? z10 : z11;
                boolean m20874l = m20874l(enumC5160d);
                boolean m20874l2 = m20874l(enumC5160d2);
                InterfaceC1902e m20866d = m20874l ? null : m20866d(enumC5160d, c5002c);
                InterfaceC1902e m20866d2 = m20874l2 ? null : m20866d(enumC5160d2, c5002c);
                boolean mo7771c = !m20874l ? m20866d.mo7771c(z15) | z11 : z11;
                if (!m20874l2) {
                    mo7771c |= m20866d2.mo7771c(z16);
                }
                j10++;
                if (j10 % 10 == 0) {
                    double m20869g = m20869g(enumC5160d);
                    double m20869g2 = m20869g(enumC5160d2);
                    c5472e.m21686g("progress - video:" + m20869g2 + " audio:" + m20869g);
                    m20876n((m20869g2 + m20869g) / ((double) i10));
                }
                if (!mo7771c) {
                    Thread.sleep(10L);
                }
                z13 = m20874l;
                z14 = m20874l2;
                z11 = false;
                z10 = true;
            } finally {
                try {
                    m20863a(EnumC5160d.VIDEO);
                    m20863a(EnumC5160d.AUDIO);
                } catch (Exception unused) {
                }
                this.f19424a.release();
            }
        }
    }
}
