package p289u3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p289u3.InterfaceC4817g;

/* renamed from: u3.x */
/* loaded from: classes.dex */
public abstract class AbstractC4841x implements InterfaceC4817g {

    /* renamed from: b */
    public InterfaceC4817g.a f18195b;

    /* renamed from: c */
    public InterfaceC4817g.a f18196c;

    /* renamed from: d */
    public InterfaceC4817g.a f18197d;

    /* renamed from: e */
    public InterfaceC4817g.a f18198e;

    /* renamed from: f */
    public ByteBuffer f18199f;

    /* renamed from: g */
    public ByteBuffer f18200g;

    /* renamed from: h */
    public boolean f18201h;

    public AbstractC4841x() {
        ByteBuffer byteBuffer = InterfaceC4817g.f18051a;
        this.f18199f = byteBuffer;
        this.f18200g = byteBuffer;
        InterfaceC4817g.a aVar = InterfaceC4817g.a.f18052e;
        this.f18197d = aVar;
        this.f18198e = aVar;
        this.f18195b = aVar;
        this.f18196c = aVar;
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: a */
    public boolean mo19064a() {
        return this.f18198e != InterfaceC4817g.a.f18052e;
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: b */
    public ByteBuffer mo19065b() {
        ByteBuffer byteBuffer = this.f18200g;
        this.f18200g = InterfaceC4817g.f18051a;
        return byteBuffer;
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: c */
    public boolean mo19066c() {
        return this.f18201h && this.f18200g == InterfaceC4817g.f18051a;
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: d */
    public final InterfaceC4817g.a mo19067d(InterfaceC4817g.a aVar) {
        this.f18197d = aVar;
        this.f18198e = mo19010h(aVar);
        return mo19064a() ? this.f18198e : InterfaceC4817g.a.f18052e;
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: f */
    public final void mo19068f() {
        this.f18201h = true;
        mo19078j();
    }

    @Override // p289u3.InterfaceC4817g
    public final void flush() {
        this.f18200g = InterfaceC4817g.f18051a;
        this.f18201h = false;
        this.f18195b = this.f18197d;
        this.f18196c = this.f18198e;
        mo19077i();
    }

    /* renamed from: g */
    public final boolean m19186g() {
        return this.f18200g.hasRemaining();
    }

    /* renamed from: h */
    public abstract InterfaceC4817g.a mo19010h(InterfaceC4817g.a aVar);

    /* renamed from: i */
    public void mo19077i() {
    }

    /* renamed from: j */
    public void mo19078j() {
    }

    /* renamed from: k */
    public void mo19079k() {
    }

    /* renamed from: l */
    public final ByteBuffer m19187l(int i10) {
        if (this.f18199f.capacity() < i10) {
            this.f18199f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f18199f.clear();
        }
        ByteBuffer byteBuffer = this.f18199f;
        this.f18200g = byteBuffer;
        return byteBuffer;
    }

    @Override // p289u3.InterfaceC4817g
    public final void reset() {
        flush();
        this.f18199f = InterfaceC4817g.f18051a;
        InterfaceC4817g.a aVar = InterfaceC4817g.a.f18052e;
        this.f18197d = aVar;
        this.f18198e = aVar;
        this.f18195b = aVar;
        this.f18196c = aVar;
        mo19079k();
    }
}
