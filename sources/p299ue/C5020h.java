package p299ue;

import java.util.LinkedHashSet;
import java.util.Set;
import re.C4357f0;

/* renamed from: ue.h */
/* loaded from: classes2.dex */
public final class C5020h {

    /* renamed from: a */
    public final Set<C4357f0> f18798a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void m19707a(C4357f0 c4357f0) {
        this.f18798a.remove(c4357f0);
    }

    /* renamed from: b */
    public synchronized void m19708b(C4357f0 c4357f0) {
        this.f18798a.add(c4357f0);
    }

    /* renamed from: c */
    public synchronized boolean m19709c(C4357f0 c4357f0) {
        return this.f18798a.contains(c4357f0);
    }
}
