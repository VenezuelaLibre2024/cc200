package p097g7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: g7.p */
/* loaded from: classes.dex */
public final class C2113p {
    /* renamed from: a */
    public static final List m8330a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2115r abstractC2115r = (AbstractC2115r) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", abstractC2115r.mo8332a());
            bundle.putLong("event_timestamp", abstractC2115r.mo8333b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final void m8331b(int i10, List list) {
        list.add(AbstractC2115r.m8334c(i10, System.currentTimeMillis()));
    }
}
