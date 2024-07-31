package p152k4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p152k4.C3348a;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.AbstractC4426f;
import p264s3.C4463m1;
import p264s3.C4468n1;
import p264s3.InterfaceC4450j3;

/* renamed from: k4.f */
/* loaded from: classes.dex */
public final class C3353f extends AbstractC4426f implements Handler.Callback {

    /* renamed from: A */
    public boolean f11660A;

    /* renamed from: B */
    public boolean f11661B;

    /* renamed from: C */
    public long f11662C;

    /* renamed from: D */
    public C3348a f11663D;

    /* renamed from: E */
    public long f11664E;

    /* renamed from: u */
    public final InterfaceC3350c f11665u;

    /* renamed from: v */
    public final InterfaceC3352e f11666v;

    /* renamed from: w */
    public final Handler f11667w;

    /* renamed from: x */
    public final C3351d f11668x;

    /* renamed from: y */
    public final boolean f11669y;

    /* renamed from: z */
    public InterfaceC3349b f11670z;

    public C3353f(InterfaceC3352e interfaceC3352e, Looper looper) {
        this(interfaceC3352e, looper, InterfaceC3350c.f11658a);
    }

    public C3353f(InterfaceC3352e interfaceC3352e, Looper looper, InterfaceC3350c interfaceC3350c) {
        this(interfaceC3352e, looper, interfaceC3350c, false);
    }

    public C3353f(InterfaceC3352e interfaceC3352e, Looper looper, InterfaceC3350c interfaceC3350c, boolean z10) {
        super(5);
        this.f11666v = (InterfaceC3352e) C4014a.m15199e(interfaceC3352e);
        this.f11667w = looper == null ? null : C4041n0.m15487v(looper, this);
        this.f11665u = (InterfaceC3350c) C4014a.m15199e(interfaceC3350c);
        this.f11669y = z10;
        this.f11668x = new C3351d();
        this.f11664E = -9223372036854775807L;
    }

    @Override // p264s3.AbstractC4426f
    /* renamed from: P */
    public void mo6368P() {
        this.f11663D = null;
        this.f11670z = null;
        this.f11664E = -9223372036854775807L;
    }

    @Override // p264s3.AbstractC4426f
    /* renamed from: R */
    public void mo6369R(long j10, boolean z10) {
        this.f11663D = null;
        this.f11660A = false;
        this.f11661B = false;
    }

    @Override // p264s3.AbstractC4426f
    /* renamed from: V */
    public void mo6370V(C4463m1[] c4463m1Arr, long j10, long j11) {
        this.f11670z = this.f11665u.mo12422b(c4463m1Arr[0]);
        C3348a c3348a = this.f11663D;
        if (c3348a != null) {
            this.f11663D = c3348a.m12412d((c3348a.f11657i + this.f11664E) - j11);
        }
        this.f11664E = j11;
    }

    /* renamed from: Z */
    public final void m12423Z(C3348a c3348a, List<C3348a.b> list) {
        for (int i10 = 0; i10 < c3348a.m12414f(); i10++) {
            C4463m1 mo12418n = c3348a.m12413e(i10).mo12418n();
            if (mo12418n == null || !this.f11665u.mo12421a(mo12418n)) {
                list.add(c3348a.m12413e(i10));
            } else {
                InterfaceC3349b mo12422b = this.f11665u.mo12422b(mo12418n);
                byte[] bArr = (byte[]) C4014a.m15199e(c3348a.m12413e(i10).mo12417G());
                this.f11668x.mo6366l();
                this.f11668x.m20764w(bArr.length);
                ((ByteBuffer) C4041n0.m15463j(this.f11668x.f19284j)).put(bArr);
                this.f11668x.m20765x();
                C3348a mo12420a = mo12422b.mo12420a(this.f11668x);
                if (mo12420a != null) {
                    m12423Z(mo12420a, list);
                }
            }
        }
    }

    @Override // p264s3.InterfaceC4450j3
    /* renamed from: a */
    public int mo6372a(C4463m1 c4463m1) {
        if (this.f11665u.mo12421a(c4463m1)) {
            return InterfaceC4450j3.m17374v(c4463m1.f16493N == 0 ? 4 : 2);
        }
        return InterfaceC4450j3.m17374v(0);
    }

    /* renamed from: a0 */
    public final long m12424a0(long j10) {
        C4014a.m15200f(j10 != -9223372036854775807L);
        C4014a.m15200f(this.f11664E != -9223372036854775807L);
        return j10 - this.f11664E;
    }

    @Override // p264s3.InterfaceC4445i3, p264s3.InterfaceC4450j3
    /* renamed from: b */
    public String mo6374b() {
        return "MetadataRenderer";
    }

    /* renamed from: b0 */
    public final void m12425b0(C3348a c3348a) {
        Handler handler = this.f11667w;
        if (handler != null) {
            handler.obtainMessage(0, c3348a).sendToTarget();
        } else {
            m12426c0(c3348a);
        }
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: c */
    public boolean mo6376c() {
        return this.f11661B;
    }

    /* renamed from: c0 */
    public final void m12426c0(C3348a c3348a) {
        this.f11666v.onMetadata(c3348a);
    }

    /* renamed from: d0 */
    public final boolean m12427d0(long j10) {
        boolean z10;
        C3348a c3348a = this.f11663D;
        if (c3348a == null || (!this.f11669y && c3348a.f11657i > m12424a0(j10))) {
            z10 = false;
        } else {
            m12425b0(this.f11663D);
            this.f11663D = null;
            z10 = true;
        }
        if (this.f11660A && this.f11663D == null) {
            this.f11661B = true;
        }
        return z10;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: e */
    public boolean mo6379e() {
        return true;
    }

    /* renamed from: e0 */
    public final void m12428e0() {
        if (this.f11660A || this.f11663D != null) {
            return;
        }
        this.f11668x.mo6366l();
        C4468n1 m17205K = m17205K();
        int m17210W = m17210W(m17205K, this.f11668x, 0);
        if (m17210W != -4) {
            if (m17210W == -5) {
                this.f11662C = ((C4463m1) C4014a.m15199e(m17205K.f16559b)).f16510w;
            }
        } else {
            if (this.f11668x.m20748q()) {
                this.f11660A = true;
                return;
            }
            C3351d c3351d = this.f11668x;
            c3351d.f11659p = this.f11662C;
            c3351d.m20765x();
            C3348a mo12420a = ((InterfaceC3349b) C4041n0.m15463j(this.f11670z)).mo12420a(this.f11668x);
            if (mo12420a != null) {
                ArrayList arrayList = new ArrayList(mo12420a.m12414f());
                m12423Z(mo12420a, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f11663D = new C3348a(m12424a0(this.f11668x.f19286l), arrayList);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m12426c0((C3348a) message.obj);
        return true;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: x */
    public void mo6387x(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            m12428e0();
            z10 = m12427d0(j10);
        }
    }
}
