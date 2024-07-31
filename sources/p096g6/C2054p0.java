package p096g6;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC1164a;
import p079f6.AbstractC1845e;
import p079f6.C1841a;
import p079f6.InterfaceC1853m;

/* renamed from: g6.p0 */
/* loaded from: classes.dex */
public final class C2054p0 extends C2011d0 {

    /* renamed from: c */
    public final AbstractC1845e f8128c;

    public C2054p0(AbstractC1845e abstractC1845e) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f8128c = abstractC1845e;
    }

    @Override // p079f6.AbstractC1846f
    /* renamed from: a */
    public final <A extends C1841a.b, R extends InterfaceC1853m, T extends AbstractC1164a<R, A>> T mo7588a(T t10) {
        return (T) this.f8128c.doRead((AbstractC1845e) t10);
    }

    @Override // p079f6.AbstractC1846f
    /* renamed from: b */
    public final <A extends C1841a.b, T extends AbstractC1164a<? extends InterfaceC1853m, A>> T mo7589b(T t10) {
        return (T) this.f8128c.doWrite((AbstractC1845e) t10);
    }

    @Override // p079f6.AbstractC1846f
    /* renamed from: e */
    public final Looper mo7591e() {
        return this.f8128c.getLooper();
    }

    @Override // p079f6.AbstractC1846f
    /* renamed from: h */
    public final void mo7594h(C2061r1 c2061r1) {
    }

    @Override // p079f6.AbstractC1846f
    /* renamed from: i */
    public final void mo7595i(C2061r1 c2061r1) {
    }
}
