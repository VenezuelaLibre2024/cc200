package androidx.work;

import androidx.work.C0417b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p029c2.AbstractC0590h;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC0590h {
    @Override // p029c2.AbstractC0590h
    /* renamed from: b */
    public C0417b mo2056b(List<C0417b> list) {
        C0417b.a aVar = new C0417b.a();
        HashMap hashMap = new HashMap();
        Iterator<C0417b> it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(it.next().m2114j());
        }
        aVar.m2121d(hashMap);
        return aVar.m2118a();
    }
}
