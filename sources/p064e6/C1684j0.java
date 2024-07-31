package p064e6;

import java.util.concurrent.Callable;

/* renamed from: e6.j0 */
/* loaded from: classes.dex */
public final class C1684j0 extends C1688l0 {

    /* renamed from: f */
    public final Callable f6274f;

    public /* synthetic */ C1684j0(Callable callable, C1682i0 c1682i0) {
        super();
        this.f6274f = callable;
    }

    @Override // p064e6.C1688l0
    /* renamed from: a */
    public final String mo6735a() {
        try {
            return (String) this.f6274f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
