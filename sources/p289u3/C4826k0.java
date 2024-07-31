package p289u3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p222p5.C4014a;
import p222p5.C4041n0;
import p289u3.InterfaceC4817g;

/* renamed from: u3.k0 */
/* loaded from: classes.dex */
public final class C4826k0 implements InterfaceC4817g {

    /* renamed from: b */
    public int f18099b;

    /* renamed from: c */
    public float f18100c = 1.0f;

    /* renamed from: d */
    public float f18101d = 1.0f;

    /* renamed from: e */
    public InterfaceC4817g.a f18102e;

    /* renamed from: f */
    public InterfaceC4817g.a f18103f;

    /* renamed from: g */
    public InterfaceC4817g.a f18104g;

    /* renamed from: h */
    public InterfaceC4817g.a f18105h;

    /* renamed from: i */
    public boolean f18106i;

    /* renamed from: j */
    public C4824j0 f18107j;

    /* renamed from: k */
    public ByteBuffer f18108k;

    /* renamed from: l */
    public ShortBuffer f18109l;

    /* renamed from: m */
    public ByteBuffer f18110m;

    /* renamed from: n */
    public long f18111n;

    /* renamed from: o */
    public long f18112o;

    /* renamed from: p */
    public boolean f18113p;

    public C4826k0() {
        InterfaceC4817g.a aVar = InterfaceC4817g.a.f18052e;
        this.f18102e = aVar;
        this.f18103f = aVar;
        this.f18104g = aVar;
        this.f18105h = aVar;
        ByteBuffer byteBuffer = InterfaceC4817g.f18051a;
        this.f18108k = byteBuffer;
        this.f18109l = byteBuffer.asShortBuffer();
        this.f18110m = byteBuffer;
        this.f18099b = -1;
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: a */
    public boolean mo19064a() {
        return this.f18103f.f18053a != -1 && (Math.abs(this.f18100c - 1.0f) >= 1.0E-4f || Math.abs(this.f18101d - 1.0f) >= 1.0E-4f || this.f18103f.f18053a != this.f18102e.f18053a);
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: b */
    public ByteBuffer mo19065b() {
        int m19102k;
        C4824j0 c4824j0 = this.f18107j;
        if (c4824j0 != null && (m19102k = c4824j0.m19102k()) > 0) {
            if (this.f18108k.capacity() < m19102k) {
                ByteBuffer order = ByteBuffer.allocateDirect(m19102k).order(ByteOrder.nativeOrder());
                this.f18108k = order;
                this.f18109l = order.asShortBuffer();
            } else {
                this.f18108k.clear();
                this.f18109l.clear();
            }
            c4824j0.m19101j(this.f18109l);
            this.f18112o += m19102k;
            this.f18108k.limit(m19102k);
            this.f18110m = this.f18108k;
        }
        ByteBuffer byteBuffer = this.f18110m;
        this.f18110m = InterfaceC4817g.f18051a;
        return byteBuffer;
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: c */
    public boolean mo19066c() {
        C4824j0 c4824j0;
        return this.f18113p && ((c4824j0 = this.f18107j) == null || c4824j0.m19102k() == 0);
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: d */
    public InterfaceC4817g.a mo19067d(InterfaceC4817g.a aVar) {
        if (aVar.f18055c != 2) {
            throw new InterfaceC4817g.b(aVar);
        }
        int i10 = this.f18099b;
        if (i10 == -1) {
            i10 = aVar.f18053a;
        }
        this.f18102e = aVar;
        InterfaceC4817g.a aVar2 = new InterfaceC4817g.a(i10, aVar.f18054b, 2);
        this.f18103f = aVar2;
        this.f18106i = true;
        return aVar2;
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: e */
    public void mo19009e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C4824j0 c4824j0 = (C4824j0) C4014a.m15199e(this.f18107j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f18111n += remaining;
            c4824j0.m19110t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: f */
    public void mo19068f() {
        C4824j0 c4824j0 = this.f18107j;
        if (c4824j0 != null) {
            c4824j0.m19109s();
        }
        this.f18113p = true;
    }

    @Override // p289u3.InterfaceC4817g
    public void flush() {
        if (mo19064a()) {
            InterfaceC4817g.a aVar = this.f18102e;
            this.f18104g = aVar;
            InterfaceC4817g.a aVar2 = this.f18103f;
            this.f18105h = aVar2;
            if (this.f18106i) {
                this.f18107j = new C4824j0(aVar.f18053a, aVar.f18054b, this.f18100c, this.f18101d, aVar2.f18053a);
            } else {
                C4824j0 c4824j0 = this.f18107j;
                if (c4824j0 != null) {
                    c4824j0.m19100i();
                }
            }
        }
        this.f18110m = InterfaceC4817g.f18051a;
        this.f18111n = 0L;
        this.f18112o = 0L;
        this.f18113p = false;
    }

    /* renamed from: g */
    public long m19114g(long j10) {
        if (this.f18112o < 1024) {
            return (long) (this.f18100c * j10);
        }
        long m19103l = this.f18111n - ((C4824j0) C4014a.m15199e(this.f18107j)).m19103l();
        int i10 = this.f18105h.f18053a;
        int i11 = this.f18104g.f18053a;
        return i10 == i11 ? C4041n0.m15420N0(j10, m19103l, this.f18112o) : C4041n0.m15420N0(j10, m19103l * i10, this.f18112o * i11);
    }

    /* renamed from: h */
    public void m19115h(float f10) {
        if (this.f18101d != f10) {
            this.f18101d = f10;
            this.f18106i = true;
        }
    }

    /* renamed from: i */
    public void m19116i(float f10) {
        if (this.f18100c != f10) {
            this.f18100c = f10;
            this.f18106i = true;
        }
    }

    @Override // p289u3.InterfaceC4817g
    public void reset() {
        this.f18100c = 1.0f;
        this.f18101d = 1.0f;
        InterfaceC4817g.a aVar = InterfaceC4817g.a.f18052e;
        this.f18102e = aVar;
        this.f18103f = aVar;
        this.f18104g = aVar;
        this.f18105h = aVar;
        ByteBuffer byteBuffer = InterfaceC4817g.f18051a;
        this.f18108k = byteBuffer;
        this.f18109l = byteBuffer.asShortBuffer();
        this.f18110m = byteBuffer;
        this.f18099b = -1;
        this.f18106i = false;
        this.f18107j = null;
        this.f18111n = 0L;
        this.f18112o = 0L;
        this.f18113p = false;
    }
}
