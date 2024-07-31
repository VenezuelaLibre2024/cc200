package p047d5;

import java.nio.ByteBuffer;
import p222p5.C4014a;
import p304v3.AbstractC5113j;

/* renamed from: d5.g */
/* loaded from: classes.dex */
public abstract class AbstractC1552g extends AbstractC5113j<C1557l, AbstractC1558m, C1555j> implements InterfaceC1554i {

    /* renamed from: n */
    public final String f5830n;

    /* renamed from: d5.g$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC1558m {
        public a() {
        }

        @Override // p304v3.AbstractC5111h
        /* renamed from: v */
        public void mo6349v() {
            AbstractC1552g.this.m20776r(this);
        }
    }

    public AbstractC1552g(String str) {
        super(new C1557l[2], new AbstractC1558m[2]);
        this.f5830n = str;
        m20779u(1024);
    }

    @Override // p304v3.AbstractC5113j
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final C1555j mo6359j(C1557l c1557l, AbstractC1558m abstractC1558m, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C4014a.m15199e(c1557l.f19284j);
            abstractC1558m.m6367w(c1557l.f19286l, mo6363z(byteBuffer.array(), byteBuffer.limit(), z10), c1557l.f5833p);
            abstractC1558m.m20744m(Integer.MIN_VALUE);
            return null;
        } catch (C1555j e10) {
            return e10;
        }
    }

    @Override // p047d5.InterfaceC1554i
    /* renamed from: a */
    public void mo6341a(long j10) {
    }

    @Override // p304v3.AbstractC5113j
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final C1557l mo6356g() {
        return new C1557l();
    }

    @Override // p304v3.AbstractC5113j
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final AbstractC1558m mo6357h() {
        return new a();
    }

    @Override // p304v3.AbstractC5113j
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final C1555j mo6358i(Throwable th) {
        return new C1555j("Unexpected decode error", th);
    }

    /* renamed from: z */
    public abstract InterfaceC1553h mo6363z(byte[] bArr, int i10, boolean z10);
}
