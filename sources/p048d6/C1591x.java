package p048d6;

import android.os.Bundle;

/* renamed from: d6.x */
/* loaded from: classes.dex */
public final class C1591x extends AbstractC1592y {
    public C1591x(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // p048d6.AbstractC1592y
    /* renamed from: a */
    public final void mo6391a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m6431d(null);
        } else {
            m6430c(new C1593z(4, "Invalid response to one way request", null));
        }
    }

    @Override // p048d6.AbstractC1592y
    /* renamed from: b */
    public final boolean mo6392b() {
        return true;
    }
}
