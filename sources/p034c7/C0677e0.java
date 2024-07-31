package p034c7;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: c7.e0 */
/* loaded from: classes.dex */
public final class C0677e0 implements Iterator<String> {

    /* renamed from: h */
    public Iterator<String> f2880h;

    /* renamed from: i */
    public final /* synthetic */ C0618a0 f2881i;

    public C0677e0(C0618a0 c0618a0) {
        Bundle bundle;
        this.f2881i = c0618a0;
        bundle = c0618a0.f2754h;
        this.f2880h = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2880h.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f2880h.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
