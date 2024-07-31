package p044d2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p029c2.AbstractC0592j;
import p029c2.AbstractC0600r;
import p029c2.AbstractC0603u;
import p029c2.EnumC0586d;
import p029c2.InterfaceC0595m;
import p178m2.RunnableC3501b;

/* renamed from: d2.g */
/* loaded from: classes.dex */
public class C1525g extends AbstractC0600r {

    /* renamed from: j */
    public static final String f5562j = AbstractC0592j.m2972f("WorkContinuationImpl");

    /* renamed from: a */
    public final C1527i f5563a;

    /* renamed from: b */
    public final String f5564b;

    /* renamed from: c */
    public final EnumC0586d f5565c;

    /* renamed from: d */
    public final List<? extends AbstractC0603u> f5566d;

    /* renamed from: e */
    public final List<String> f5567e;

    /* renamed from: f */
    public final List<String> f5568f;

    /* renamed from: g */
    public final List<C1525g> f5569g;

    /* renamed from: h */
    public boolean f5570h;

    /* renamed from: i */
    public InterfaceC0595m f5571i;

    public C1525g(C1527i c1527i, String str, EnumC0586d enumC0586d, List<? extends AbstractC0603u> list, List<C1525g> list2) {
        this.f5563a = c1527i;
        this.f5564b = str;
        this.f5565c = enumC0586d;
        this.f5566d = list;
        this.f5569g = list2;
        this.f5567e = new ArrayList(list.size());
        this.f5568f = new ArrayList();
        if (list2 != null) {
            Iterator<C1525g> it = list2.iterator();
            while (it.hasNext()) {
                this.f5568f.addAll(it.next().f5568f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String m2994b = list.get(i10).m2994b();
            this.f5567e.add(m2994b);
            this.f5568f.add(m2994b);
        }
    }

    public C1525g(C1527i c1527i, List<? extends AbstractC0603u> list) {
        this(c1527i, null, EnumC0586d.KEEP, list, null);
    }

    /* renamed from: i */
    public static boolean m6172i(C1525g c1525g, Set<String> set) {
        set.addAll(c1525g.m6176c());
        Set<String> m6173l = m6173l(c1525g);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (m6173l.contains(it.next())) {
                return true;
            }
        }
        List<C1525g> m6178e = c1525g.m6178e();
        if (m6178e != null && !m6178e.isEmpty()) {
            Iterator<C1525g> it2 = m6178e.iterator();
            while (it2.hasNext()) {
                if (m6172i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c1525g.m6176c());
        return false;
    }

    /* renamed from: l */
    public static Set<String> m6173l(C1525g c1525g) {
        HashSet hashSet = new HashSet();
        List<C1525g> m6178e = c1525g.m6178e();
        if (m6178e != null && !m6178e.isEmpty()) {
            Iterator<C1525g> it = m6178e.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().m6176c());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public InterfaceC0595m m6174a() {
        if (this.f5570h) {
            AbstractC0592j.m2970c().mo2977h(f5562j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f5567e)), new Throwable[0]);
        } else {
            RunnableC3501b runnableC3501b = new RunnableC3501b(this);
            this.f5563a.m6200p().mo14611b(runnableC3501b);
            this.f5571i = runnableC3501b.m13040d();
        }
        return this.f5571i;
    }

    /* renamed from: b */
    public EnumC0586d m6175b() {
        return this.f5565c;
    }

    /* renamed from: c */
    public List<String> m6176c() {
        return this.f5567e;
    }

    /* renamed from: d */
    public String m6177d() {
        return this.f5564b;
    }

    /* renamed from: e */
    public List<C1525g> m6178e() {
        return this.f5569g;
    }

    /* renamed from: f */
    public List<? extends AbstractC0603u> m6179f() {
        return this.f5566d;
    }

    /* renamed from: g */
    public C1527i m6180g() {
        return this.f5563a;
    }

    /* renamed from: h */
    public boolean m6181h() {
        return m6172i(this, new HashSet());
    }

    /* renamed from: j */
    public boolean m6182j() {
        return this.f5570h;
    }

    /* renamed from: k */
    public void m6183k() {
        this.f5570h = true;
    }
}
