package androidx.lifecycle;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import td.C4753m;

/* renamed from: androidx.lifecycle.h0 */
/* loaded from: classes.dex */
public class C0349h0 {

    /* renamed from: a */
    public final Map<String, AbstractC0343e0> f1727a = new LinkedHashMap();

    /* renamed from: a */
    public final void m1823a() {
        Iterator<AbstractC0343e0> it = this.f1727a.values().iterator();
        while (it.hasNext()) {
            it.next().m1797a();
        }
        this.f1727a.clear();
    }

    /* renamed from: b */
    public final AbstractC0343e0 m1824b(String str) {
        C4753m.m18653f(str, Constants.KEY);
        return this.f1727a.get(str);
    }

    /* renamed from: c */
    public final Set<String> m1825c() {
        return new HashSet(this.f1727a.keySet());
    }

    /* renamed from: d */
    public final void m1826d(String str, AbstractC0343e0 abstractC0343e0) {
        C4753m.m18653f(str, Constants.KEY);
        C4753m.m18653f(abstractC0343e0, "viewModel");
        AbstractC0343e0 put = this.f1727a.put(str, abstractC0343e0);
        if (put != null) {
            put.mo1376d();
        }
    }
}
