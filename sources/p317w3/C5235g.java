package p317w3;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p206o5.InterfaceC3899d0;
import p222p5.C4014a;
import p222p5.C4030i;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.InterfaceC4028h;
import p264s3.C4441i;
import p275t3.C4674s1;
import p290u4.C4870n;
import p290u4.C4876q;
import p304v3.InterfaceC5105b;
import p317w3.C5247m;
import p317w3.InterfaceC5226b0;
import p317w3.InterfaceC5248n;
import p317w3.InterfaceC5255u;

/* renamed from: w3.g */
/* loaded from: classes.dex */
public class C5235g implements InterfaceC5248n {

    /* renamed from: a */
    public final List<C5247m.b> f19813a;

    /* renamed from: b */
    public final InterfaceC5226b0 f19814b;

    /* renamed from: c */
    public final a f19815c;

    /* renamed from: d */
    public final b f19816d;

    /* renamed from: e */
    public final int f19817e;

    /* renamed from: f */
    public final boolean f19818f;

    /* renamed from: g */
    public final boolean f19819g;

    /* renamed from: h */
    public final HashMap<String, String> f19820h;

    /* renamed from: i */
    public final C4030i<InterfaceC5255u.a> f19821i;

    /* renamed from: j */
    public final InterfaceC3899d0 f19822j;

    /* renamed from: k */
    public final C4674s1 f19823k;

    /* renamed from: l */
    public final InterfaceC5240i0 f19824l;

    /* renamed from: m */
    public final UUID f19825m;

    /* renamed from: n */
    public final Looper f19826n;

    /* renamed from: o */
    public final e f19827o;

    /* renamed from: p */
    public int f19828p;

    /* renamed from: q */
    public int f19829q;

    /* renamed from: r */
    public HandlerThread f19830r;

    /* renamed from: s */
    public c f19831s;

    /* renamed from: t */
    public InterfaceC5105b f19832t;

    /* renamed from: u */
    public InterfaceC5248n.a f19833u;

    /* renamed from: v */
    public byte[] f19834v;

    /* renamed from: w */
    public byte[] f19835w;

    /* renamed from: x */
    public InterfaceC5226b0.a f19836x;

    /* renamed from: y */
    public InterfaceC5226b0.d f19837y;

    /* renamed from: w3.g$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo21191a(C5235g c5235g);

        /* renamed from: b */
        void mo21192b(Exception exc, boolean z10);

        /* renamed from: c */
        void mo21193c();
    }

    /* renamed from: w3.g$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo21194a(C5235g c5235g, int i10);

        /* renamed from: b */
        void mo21195b(C5235g c5235g, int i10);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: w3.g$c */
    /* loaded from: classes.dex */
    public class c extends Handler {

        /* renamed from: a */
        public boolean f19838a;

        public c(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final boolean m21196a(Message message, C5242j0 c5242j0) {
            d dVar = (d) message.obj;
            if (!dVar.f19841b) {
                return false;
            }
            int i10 = dVar.f19844e + 1;
            dVar.f19844e = i10;
            if (i10 > C5235g.this.f19822j.mo14778d(3)) {
                return false;
            }
            long mo14775a = C5235g.this.f19822j.mo14775a(new InterfaceC3899d0.c(new C4870n(dVar.f19840a, c5242j0.f19894h, c5242j0.f19895i, c5242j0.f19896j, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f19842c, c5242j0.f19897k), new C4876q(3), c5242j0.getCause() instanceof IOException ? (IOException) c5242j0.getCause() : new f(c5242j0.getCause()), dVar.f19844e));
            if (mo14775a == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f19838a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), mo14775a);
                return true;
            }
        }

        /* renamed from: b */
        public void m21197b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(C4870n.m19398a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* renamed from: c */
        public synchronized void m21198c() {
            removeCallbacksAndMessages(null);
            this.f19838a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    th = C5235g.this.f19824l.mo21201a(C5235g.this.f19825m, (InterfaceC5226b0.d) dVar.f19843d);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    th = C5235g.this.f19824l.mo21202b(C5235g.this.f19825m, (InterfaceC5226b0.a) dVar.f19843d);
                }
            } catch (C5242j0 e10) {
                boolean m21196a = m21196a(message, e10);
                th = e10;
                if (m21196a) {
                    return;
                }
            } catch (Exception e11) {
                C4046r.m15530j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                th = e11;
            }
            C5235g.this.f19822j.m14776b(dVar.f19840a);
            synchronized (this) {
                if (!this.f19838a) {
                    C5235g.this.f19827o.obtainMessage(message.what, Pair.create(dVar.f19843d, th)).sendToTarget();
                }
            }
        }
    }

    /* renamed from: w3.g$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final long f19840a;

        /* renamed from: b */
        public final boolean f19841b;

        /* renamed from: c */
        public final long f19842c;

        /* renamed from: d */
        public final Object f19843d;

        /* renamed from: e */
        public int f19844e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f19840a = j10;
            this.f19841b = z10;
            this.f19842c = j11;
            this.f19843d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: w3.g$e */
    /* loaded from: classes.dex */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                C5235g.this.m21178F(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                C5235g.this.m21190z(obj, obj2);
            }
        }
    }

    /* renamed from: w3.g$f */
    /* loaded from: classes.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public C5235g(UUID uuid, InterfaceC5226b0 interfaceC5226b0, a aVar, b bVar, List<C5247m.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, InterfaceC5240i0 interfaceC5240i0, Looper looper, InterfaceC3899d0 interfaceC3899d0, C4674s1 c4674s1) {
        List<C5247m.b> unmodifiableList;
        if (i10 == 1 || i10 == 3) {
            C4014a.m15199e(bArr);
        }
        this.f19825m = uuid;
        this.f19815c = aVar;
        this.f19816d = bVar;
        this.f19814b = interfaceC5226b0;
        this.f19817e = i10;
        this.f19818f = z10;
        this.f19819g = z11;
        if (bArr != null) {
            this.f19835w = bArr;
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList((List) C4014a.m15199e(list));
        }
        this.f19813a = unmodifiableList;
        this.f19820h = hashMap;
        this.f19824l = interfaceC5240i0;
        this.f19821i = new C4030i<>();
        this.f19822j = interfaceC3899d0;
        this.f19823k = c4674s1;
        this.f19828p = 2;
        this.f19826n = looper;
        this.f19827o = new e(looper);
    }

    /* renamed from: A */
    public final void m21173A(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f19815c.mo21191a(this);
        } else {
            m21189y(exc, z10 ? 1 : 2);
        }
    }

    /* renamed from: B */
    public final void m21174B() {
        if (this.f19817e == 0 && this.f19828p == 4) {
            C4041n0.m15463j(this.f19834v);
            m21185s(false);
        }
    }

    /* renamed from: C */
    public void m21175C(int i10) {
        if (i10 != 2) {
            return;
        }
        m21174B();
    }

    /* renamed from: D */
    public void m21176D() {
        if (m21179G()) {
            m21185s(true);
        }
    }

    /* renamed from: E */
    public void m21177E(Exception exc, boolean z10) {
        m21189y(exc, z10 ? 1 : 3);
    }

    /* renamed from: F */
    public final void m21178F(Object obj, Object obj2) {
        if (obj == this.f19837y) {
            if (this.f19828p == 2 || m21188v()) {
                this.f19837y = null;
                if (obj2 instanceof Exception) {
                    this.f19815c.mo21192b((Exception) obj2, false);
                    return;
                }
                try {
                    this.f19814b.mo21136k((byte[]) obj2);
                    this.f19815c.mo21193c();
                } catch (Exception e10) {
                    this.f19815c.mo21192b(e10, true);
                }
            }
        }
    }

    /* renamed from: G */
    public final boolean m21179G() {
        if (m21188v()) {
            return true;
        }
        try {
            byte[] mo21129d = this.f19814b.mo21129d();
            this.f19834v = mo21129d;
            this.f19814b.mo21131f(mo21129d, this.f19823k);
            this.f19832t = this.f19814b.mo21128c(this.f19834v);
            this.f19828p = 3;
            m21184r(new InterfaceC4028h() { // from class: w3.b

                /* renamed from: a */
                public final /* synthetic */ int f19792a;

                public /* synthetic */ C5225b(int i10) {
                    r1 = i10;
                }

                @Override // p222p5.InterfaceC4028h
                public final void accept(Object obj) {
                    ((InterfaceC5255u.a) obj).m21287k(r1);
                }
            });
            C4014a.m15199e(this.f19834v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f19815c.mo21191a(this);
            return false;
        } catch (Exception e10) {
            m21189y(e10, 1);
            return false;
        }
    }

    /* renamed from: H */
    public final void m21180H(byte[] bArr, int i10, boolean z10) {
        try {
            this.f19836x = this.f19814b.mo21137l(bArr, this.f19813a, i10, this.f19820h);
            ((c) C4041n0.m15463j(this.f19831s)).m21197b(1, C4014a.m15199e(this.f19836x), z10);
        } catch (Exception e10) {
            m21173A(e10, true);
        }
    }

    /* renamed from: I */
    public void m21181I() {
        this.f19837y = this.f19814b.mo21127b();
        ((c) C4041n0.m15463j(this.f19831s)).m21197b(0, C4014a.m15199e(this.f19837y), true);
    }

    /* renamed from: J */
    public final boolean m21182J() {
        try {
            this.f19814b.mo21133h(this.f19834v, this.f19835w);
            return true;
        } catch (Exception e10) {
            m21189y(e10, 1);
            return false;
        }
    }

    /* renamed from: K */
    public final void m21183K() {
        if (Thread.currentThread() != this.f19826n.getThread()) {
            C4046r.m15530j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f19826n.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p317w3.InterfaceC5248n
    /* renamed from: a */
    public final InterfaceC5248n.a mo21118a() {
        m21183K();
        if (this.f19828p == 1) {
            return this.f19833u;
        }
        return null;
    }

    @Override // p317w3.InterfaceC5248n
    /* renamed from: b */
    public final UUID mo21119b() {
        m21183K();
        return this.f19825m;
    }

    @Override // p317w3.InterfaceC5248n
    /* renamed from: c */
    public void mo21120c(InterfaceC5255u.a aVar) {
        m21183K();
        if (this.f19829q < 0) {
            C4046r.m15523c("DefaultDrmSession", "Session reference count less than zero: " + this.f19829q);
            this.f19829q = 0;
        }
        if (aVar != null) {
            this.f19821i.m15334a(aVar);
        }
        int i10 = this.f19829q + 1;
        this.f19829q = i10;
        if (i10 == 1) {
            C4014a.m15200f(this.f19828p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f19830r = handlerThread;
            handlerThread.start();
            this.f19831s = new c(this.f19830r.getLooper());
            if (m21179G()) {
                m21185s(true);
            }
        } else if (aVar != null && m21188v() && this.f19821i.m15335b(aVar) == 1) {
            aVar.m21287k(this.f19828p);
        }
        this.f19816d.mo21195b(this, this.f19829q);
    }

    @Override // p317w3.InterfaceC5248n
    /* renamed from: d */
    public void mo21121d(InterfaceC5255u.a aVar) {
        m21183K();
        int i10 = this.f19829q;
        if (i10 <= 0) {
            C4046r.m15523c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f19829q = i11;
        if (i11 == 0) {
            this.f19828p = 0;
            ((e) C4041n0.m15463j(this.f19827o)).removeCallbacksAndMessages(null);
            ((c) C4041n0.m15463j(this.f19831s)).m21198c();
            this.f19831s = null;
            ((HandlerThread) C4041n0.m15463j(this.f19830r)).quit();
            this.f19830r = null;
            this.f19832t = null;
            this.f19833u = null;
            this.f19836x = null;
            this.f19837y = null;
            byte[] bArr = this.f19834v;
            if (bArr != null) {
                this.f19814b.mo21134i(bArr);
                this.f19834v = null;
            }
        }
        if (aVar != null) {
            this.f19821i.m15336c(aVar);
            if (this.f19821i.m15335b(aVar) == 0) {
                aVar.m21289m();
            }
        }
        this.f19816d.mo21194a(this, this.f19829q);
    }

    @Override // p317w3.InterfaceC5248n
    /* renamed from: e */
    public boolean mo21122e() {
        m21183K();
        return this.f19818f;
    }

    @Override // p317w3.InterfaceC5248n
    /* renamed from: f */
    public Map<String, String> mo21123f() {
        m21183K();
        byte[] bArr = this.f19834v;
        if (bArr == null) {
            return null;
        }
        return this.f19814b.mo21126a(bArr);
    }

    @Override // p317w3.InterfaceC5248n
    public final int getState() {
        m21183K();
        return this.f19828p;
    }

    @Override // p317w3.InterfaceC5248n
    /* renamed from: h */
    public boolean mo21124h(String str) {
        m21183K();
        return this.f19814b.mo21132g((byte[]) C4014a.m15202h(this.f19834v), str);
    }

    @Override // p317w3.InterfaceC5248n
    /* renamed from: i */
    public final InterfaceC5105b mo21125i() {
        m21183K();
        return this.f19832t;
    }

    /* renamed from: r */
    public final void m21184r(InterfaceC4028h<InterfaceC5255u.a> interfaceC4028h) {
        Iterator<InterfaceC5255u.a> it = this.f19821i.m15337g().iterator();
        while (it.hasNext()) {
            interfaceC4028h.accept(it.next());
        }
    }

    /* renamed from: s */
    public final void m21185s(boolean z10) {
        if (this.f19819g) {
            return;
        }
        byte[] bArr = (byte[]) C4041n0.m15463j(this.f19834v);
        int i10 = this.f19817e;
        if (i10 == 0 || i10 == 1) {
            if (this.f19835w == null) {
                m21180H(bArr, 1, z10);
                return;
            }
            if (this.f19828p != 4 && !m21182J()) {
                return;
            }
            long m21186t = m21186t();
            if (this.f19817e != 0 || m21186t > 60) {
                if (m21186t <= 0) {
                    m21189y(new C5238h0(), 2);
                    return;
                } else {
                    this.f19828p = 4;
                    m21184r(C5233f.f19808a);
                    return;
                }
            }
            C4046r.m15522b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + m21186t);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                C4014a.m15199e(this.f19835w);
                C4014a.m15199e(this.f19834v);
                m21180H(this.f19835w, 3, z10);
                return;
            }
            if (this.f19835w != null && !m21182J()) {
                return;
            }
        }
        m21180H(bArr, 2, z10);
    }

    /* renamed from: t */
    public final long m21186t() {
        if (!C4441i.f16300d.equals(this.f19825m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C4014a.m15199e(C5246l0.m21254b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    /* renamed from: u */
    public boolean m21187u(byte[] bArr) {
        m21183K();
        return Arrays.equals(this.f19834v, bArr);
    }

    /* renamed from: v */
    public final boolean m21188v() {
        int i10 = this.f19828p;
        return i10 == 3 || i10 == 4;
    }

    /* renamed from: y */
    public final void m21189y(Exception exc, int i10) {
        this.f19833u = new InterfaceC5248n.a(exc, C5259y.m21294a(exc, i10));
        C4046r.m15524d("DefaultDrmSession", "DRM session error", exc);
        m21184r(new InterfaceC4028h() { // from class: w3.c

            /* renamed from: a */
            public final /* synthetic */ Exception f19798a;

            public /* synthetic */ C5227c(Exception exc2) {
                r1 = exc2;
            }

            @Override // p222p5.InterfaceC4028h
            public final void accept(Object obj) {
                ((InterfaceC5255u.a) obj).m21288l(r1);
            }
        });
        if (this.f19828p != 4) {
            this.f19828p = 1;
        }
    }

    /* renamed from: z */
    public final void m21190z(Object obj, Object obj2) {
        InterfaceC4028h<InterfaceC5255u.a> interfaceC4028h;
        if (obj == this.f19836x && m21188v()) {
            this.f19836x = null;
            if (obj2 instanceof Exception) {
                m21173A((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f19817e == 3) {
                    this.f19814b.mo21135j((byte[]) C4041n0.m15463j(this.f19835w), bArr);
                    interfaceC4028h = C5231e.f19806a;
                } else {
                    byte[] mo21135j = this.f19814b.mo21135j(this.f19834v, bArr);
                    int i10 = this.f19817e;
                    if ((i10 == 2 || (i10 == 0 && this.f19835w != null)) && mo21135j != null && mo21135j.length != 0) {
                        this.f19835w = mo21135j;
                    }
                    this.f19828p = 4;
                    interfaceC4028h = C5229d.f19803a;
                }
                m21184r(interfaceC4028h);
            } catch (Exception e10) {
                m21173A(e10, true);
            }
        }
    }
}
