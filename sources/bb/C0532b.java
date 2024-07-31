package bb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p013ab.C0083a;

/* renamed from: bb.b */
/* loaded from: classes.dex */
public final class C0532b {

    /* renamed from: a */
    public final Map<Integer, Integer> f2370a = new HashMap();

    /* renamed from: a */
    public int[] m2570a() {
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (Map.Entry<Integer, Integer> entry : this.f2370a.entrySet()) {
            if (entry.getValue().intValue() > i10) {
                i10 = entry.getValue().intValue();
                arrayList.clear();
            } else if (entry.getValue().intValue() == i10) {
            }
            arrayList.add(entry.getKey());
        }
        return C0083a.m357b(arrayList);
    }

    /* renamed from: b */
    public void m2571b(int i10) {
        Integer num = this.f2370a.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        this.f2370a.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }
}
