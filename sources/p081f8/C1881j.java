package p081f8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p023b8.C0515g;
import p098g8.AbstractC2135f0;

/* renamed from: f8.j */
/* loaded from: classes.dex */
public class C1881j {

    /* renamed from: a */
    public final List<AbstractC1880i> f7113a = new ArrayList();

    /* renamed from: b */
    public final int f7114b;

    public C1881j(int i10) {
        this.f7114b = i10;
    }

    /* renamed from: a */
    public List<AbstractC2135f0.e.d.AbstractC6180e> m7692a() {
        List<AbstractC1880i> m7693b = m7693b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < m7693b.size(); i10++) {
            arrayList.add(m7693b.get(i10).m7691h());
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized List<AbstractC1880i> m7693b() {
        return Collections.unmodifiableList(new ArrayList(this.f7113a));
    }

    /* renamed from: c */
    public synchronized boolean m7694c(List<AbstractC1880i> list) {
        this.f7113a.clear();
        if (list.size() <= this.f7114b) {
            return this.f7113a.addAll(list);
        }
        C0515g.m2482f().m2492k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f7114b);
        return this.f7113a.addAll(list.subList(0, this.f7114b));
    }
}
