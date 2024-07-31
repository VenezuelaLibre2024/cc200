package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p152k4.C3348a;
import p152k4.C3351d;
import p180m4.C3523a;
import p180m4.C3524b;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3906h;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p264s3.C4468n1;
import p264s3.C4499t2;
import p290u4.C4867l0;
import p318w4.AbstractC5266f;
import p333x3.InterfaceC5559b0;
import p350y4.C5802c;

/* renamed from: com.google.android.exoplayer2.source.dash.d */
/* loaded from: classes.dex */
public final class C1153d implements Handler.Callback {

    /* renamed from: h */
    public final InterfaceC3894b f4280h;

    /* renamed from: i */
    public final b f4281i;

    /* renamed from: m */
    public C5802c f4285m;

    /* renamed from: n */
    public long f4286n;

    /* renamed from: o */
    public boolean f4287o;

    /* renamed from: p */
    public boolean f4288p;

    /* renamed from: q */
    public boolean f4289q;

    /* renamed from: l */
    public final TreeMap<Long, Long> f4284l = new TreeMap<>();

    /* renamed from: k */
    public final Handler f4283k = C4041n0.m15491x(this);

    /* renamed from: j */
    public final C3524b f4282j = new C3524b();

    /* renamed from: com.google.android.exoplayer2.source.dash.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f4290a;

        /* renamed from: b */
        public final long f4291b;

        public a(long j10, long j11) {
            this.f4290a = j10;
            this.f4291b = j11;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.d$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo4750a();

        /* renamed from: b */
        void mo4751b(long j10);
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.d$c */
    /* loaded from: classes.dex */
    public final class c implements InterfaceC5559b0 {

        /* renamed from: a */
        public final C4867l0 f4292a;

        /* renamed from: b */
        public final C4468n1 f4293b = new C4468n1();

        /* renamed from: c */
        public final C3351d f4294c = new C3351d();

        /* renamed from: d */
        public long f4295d = -9223372036854775807L;

        public c(InterfaceC3894b interfaceC3894b) {
            this.f4292a = C4867l0.m19347l(interfaceC3894b);
        }

        @Override // p333x3.InterfaceC5559b0
        /* renamed from: a */
        public void mo4851a(long j10, int i10, int i11, int i12, InterfaceC5559b0.a aVar) {
            this.f4292a.mo4851a(j10, i10, i11, i12, aVar);
            m4860l();
        }

        @Override // p333x3.InterfaceC5559b0
        /* renamed from: b */
        public void mo4852b(C4463m1 c4463m1) {
            this.f4292a.mo4852b(c4463m1);
        }

        @Override // p333x3.InterfaceC5559b0
        /* renamed from: d */
        public void mo4853d(C4015a0 c4015a0, int i10, int i11) {
            this.f4292a.m22408e(c4015a0, i10);
        }

        @Override // p333x3.InterfaceC5559b0
        /* renamed from: f */
        public int mo4854f(InterfaceC3906h interfaceC3906h, int i10, boolean z10, int i11) {
            return this.f4292a.m22407c(interfaceC3906h, i10, z10);
        }

        /* renamed from: g */
        public final C3351d m4855g() {
            this.f4294c.mo6366l();
            if (this.f4292a.m19365S(this.f4293b, this.f4294c, 0, false) != -4) {
                return null;
            }
            this.f4294c.m20765x();
            return this.f4294c;
        }

        /* renamed from: h */
        public boolean m4856h(long j10) {
            return C1153d.this.m4843j(j10);
        }

        /* renamed from: i */
        public void m4857i(AbstractC5266f abstractC5266f) {
            long j10 = this.f4295d;
            if (j10 == -9223372036854775807L || abstractC5266f.f19973h > j10) {
                this.f4295d = abstractC5266f.f19973h;
            }
            C1153d.this.m4846m(abstractC5266f);
        }

        /* renamed from: j */
        public boolean m4858j(AbstractC5266f abstractC5266f) {
            long j10 = this.f4295d;
            return C1153d.this.m4847n(j10 != -9223372036854775807L && j10 < abstractC5266f.f19972g);
        }

        /* renamed from: k */
        public final void m4859k(long j10, long j11) {
            C1153d.this.f4283k.sendMessage(C1153d.this.f4283k.obtainMessage(1, new a(j10, j11)));
        }

        /* renamed from: l */
        public final void m4860l() {
            while (this.f4292a.m19358K(false)) {
                C3351d m4855g = m4855g();
                if (m4855g != null) {
                    long j10 = m4855g.f19286l;
                    C3348a mo12420a = C1153d.this.f4282j.mo12420a(m4855g);
                    if (mo12420a != null) {
                        C3523a c3523a = (C3523a) mo12420a.m12413e(0);
                        if (C1153d.m4839h(c3523a.f12353h, c3523a.f12354i)) {
                            m4861m(j10, c3523a);
                        }
                    }
                }
            }
            this.f4292a.m19389s();
        }

        /* renamed from: m */
        public final void m4861m(long j10, C3523a c3523a) {
            long m4838f = C1153d.m4838f(c3523a);
            if (m4838f == -9223372036854775807L) {
                return;
            }
            m4859k(j10, m4838f);
        }

        /* renamed from: n */
        public void m4862n() {
            this.f4292a.m19366T();
        }
    }

    public C1153d(C5802c c5802c, b bVar, InterfaceC3894b interfaceC3894b) {
        this.f4285m = c5802c;
        this.f4281i = bVar;
        this.f4280h = interfaceC3894b;
    }

    /* renamed from: f */
    public static long m4838f(C3523a c3523a) {
        try {
            return C4041n0.m15410I0(C4041n0.m15399D(c3523a.f12357l));
        } catch (C4499t2 unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: h */
    public static boolean m4839h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    /* renamed from: e */
    public final Map.Entry<Long, Long> m4840e(long j10) {
        return this.f4284l.ceilingEntry(Long.valueOf(j10));
    }

    /* renamed from: g */
    public final void m4841g(long j10, long j11) {
        Long l10 = this.f4284l.get(Long.valueOf(j11));
        if (l10 != null && l10.longValue() <= j10) {
            return;
        }
        this.f4284l.put(Long.valueOf(j11), Long.valueOf(j10));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f4289q) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        m4841g(aVar.f4290a, aVar.f4291b);
        return true;
    }

    /* renamed from: i */
    public final void m4842i() {
        if (this.f4287o) {
            this.f4288p = true;
            this.f4287o = false;
            this.f4281i.mo4750a();
        }
    }

    /* renamed from: j */
    public boolean m4843j(long j10) {
        C5802c c5802c = this.f4285m;
        boolean z10 = false;
        if (!c5802c.f21762d) {
            return false;
        }
        if (this.f4288p) {
            return true;
        }
        Map.Entry<Long, Long> m4840e = m4840e(c5802c.f21766h);
        if (m4840e != null && m4840e.getValue().longValue() < j10) {
            this.f4286n = m4840e.getKey().longValue();
            m4845l();
            z10 = true;
        }
        if (z10) {
            m4842i();
        }
        return z10;
    }

    /* renamed from: k */
    public c m4844k() {
        return new c(this.f4280h);
    }

    /* renamed from: l */
    public final void m4845l() {
        this.f4281i.mo4751b(this.f4286n);
    }

    /* renamed from: m */
    public void m4846m(AbstractC5266f abstractC5266f) {
        this.f4287o = true;
    }

    /* renamed from: n */
    public boolean m4847n(boolean z10) {
        if (!this.f4285m.f21762d) {
            return false;
        }
        if (this.f4288p) {
            return true;
        }
        if (!z10) {
            return false;
        }
        m4842i();
        return true;
    }

    /* renamed from: o */
    public void m4848o() {
        this.f4289q = true;
        this.f4283k.removeCallbacksAndMessages(null);
    }

    /* renamed from: p */
    public final void m4849p() {
        Iterator<Map.Entry<Long, Long>> it = this.f4284l.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f4285m.f21766h) {
                it.remove();
            }
        }
    }

    /* renamed from: q */
    public void m4850q(C5802c c5802c) {
        this.f4288p = false;
        this.f4286n = -9223372036854775807L;
        this.f4285m = c5802c;
        m4849p();
    }
}
