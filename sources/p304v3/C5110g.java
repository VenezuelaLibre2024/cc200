package p304v3;

import java.nio.ByteBuffer;
import p264s3.C4448j1;

/* renamed from: v3.g */
/* loaded from: classes.dex */
public class C5110g extends AbstractC5104a {

    /* renamed from: i */
    public final C5106c f19283i;

    /* renamed from: j */
    public ByteBuffer f19284j;

    /* renamed from: k */
    public boolean f19285k;

    /* renamed from: l */
    public long f19286l;

    /* renamed from: m */
    public ByteBuffer f19287m;

    /* renamed from: n */
    public final int f19288n;

    /* renamed from: o */
    public final int f19289o;

    /* renamed from: v3.g$a */
    /* loaded from: classes.dex */
    public static final class a extends IllegalStateException {

        /* renamed from: h */
        public final int f19290h;

        /* renamed from: i */
        public final int f19291i;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f19290h = i10;
            this.f19291i = i11;
        }
    }

    static {
        C4448j1.m17365a("goog.exo.decoder");
    }

    public C5110g(int i10) {
        this(i10, 0);
    }

    public C5110g(int i10, int i11) {
        this.f19283i = new C5106c();
        this.f19288n = i10;
        this.f19289o = i11;
    }

    /* renamed from: z */
    public static C5110g m20761z() {
        return new C5110g(0);
    }

    /* renamed from: A */
    public void m20762A(int i10) {
        ByteBuffer byteBuffer = this.f19287m;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f19287m = ByteBuffer.allocate(i10);
        } else {
            this.f19287m.clear();
        }
    }

    @Override // p304v3.AbstractC5104a
    /* renamed from: l */
    public void mo6366l() {
        super.mo6366l();
        ByteBuffer byteBuffer = this.f19284j;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f19287m;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f19285k = false;
    }

    /* renamed from: v */
    public final ByteBuffer m20763v(int i10) {
        int i11 = this.f19288n;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f19284j;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    /* renamed from: w */
    public void m20764w(int i10) {
        int i11 = i10 + this.f19289o;
        ByteBuffer byteBuffer = this.f19284j;
        if (byteBuffer == null) {
            this.f19284j = m20763v(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f19284j = byteBuffer;
            return;
        }
        ByteBuffer m20763v = m20763v(i12);
        m20763v.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m20763v.put(byteBuffer);
        }
        this.f19284j = m20763v;
    }

    /* renamed from: x */
    public final void m20765x() {
        ByteBuffer byteBuffer = this.f19284j;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f19287m;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: y */
    public final boolean m20766y() {
        return m20745n(1073741824);
    }
}
