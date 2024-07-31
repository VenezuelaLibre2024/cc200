package p286u0;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p115hd.C2510v;
import p286u0.AbstractC4782d;
import sd.InterfaceC4580l;
import td.AbstractC4754n;
import td.C4747g;
import td.C4753m;

/* renamed from: u0.a */
/* loaded from: classes.dex */
public final class C4779a extends AbstractC4782d {

    /* renamed from: a */
    public final Map<AbstractC4782d.a<?>, Object> f17803a;

    /* renamed from: b */
    public final AtomicBoolean f17804b;

    /* renamed from: u0.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4580l<Map.Entry<AbstractC4782d.a<?>, Object>, CharSequence> {

        /* renamed from: h */
        public static final a f17805h = new a();

        public a() {
            super(1);
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a */
        public final CharSequence invoke(Map.Entry<AbstractC4782d.a<?>, Object> entry) {
            C4753m.m18653f(entry, "entry");
            return "  " + entry.getKey().m18790a() + " = " + entry.getValue();
        }
    }

    public C4779a() {
        this(null, false, 3, null);
    }

    public C4779a(Map<AbstractC4782d.a<?>, Object> map, boolean z10) {
        C4753m.m18653f(map, "preferencesMap");
        this.f17803a = map;
        this.f17804b = new AtomicBoolean(z10);
    }

    public /* synthetic */ C4779a(Map map, boolean z10, int i10, C4747g c4747g) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    @Override // p286u0.AbstractC4782d
    /* renamed from: a */
    public Map<AbstractC4782d.a<?>, Object> mo18776a() {
        Map<AbstractC4782d.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f17803a);
        C4753m.m18652e(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // p286u0.AbstractC4782d
    /* renamed from: b */
    public <T> T mo18777b(AbstractC4782d.a<T> aVar) {
        C4753m.m18653f(aVar, Constants.KEY);
        return (T) this.f17803a.get(aVar);
    }

    /* renamed from: e */
    public final void m18778e() {
        if (!(!this.f17804b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4779a) {
            return C4753m.m18648a(this.f17803a, ((C4779a) obj).f17803a);
        }
        return false;
    }

    /* renamed from: f */
    public final void m18779f() {
        this.f17804b.set(true);
    }

    /* renamed from: g */
    public final void m18780g(AbstractC4782d.b<?>... bVarArr) {
        C4753m.m18653f(bVarArr, "pairs");
        m18778e();
        for (AbstractC4782d.b<?> bVar : bVarArr) {
            m18783j(bVar.m18791a(), bVar.m18792b());
        }
    }

    /* renamed from: h */
    public final <T> T m18781h(AbstractC4782d.a<T> aVar) {
        C4753m.m18653f(aVar, Constants.KEY);
        m18778e();
        return (T) this.f17803a.remove(aVar);
    }

    public int hashCode() {
        return this.f17803a.hashCode();
    }

    /* renamed from: i */
    public final <T> void m18782i(AbstractC4782d.a<T> aVar, T t10) {
        C4753m.m18653f(aVar, Constants.KEY);
        m18783j(aVar, t10);
    }

    /* renamed from: j */
    public final void m18783j(AbstractC4782d.a<?> aVar, Object obj) {
        Map<AbstractC4782d.a<?>, Object> map;
        C4753m.m18653f(aVar, Constants.KEY);
        m18778e();
        if (obj == null) {
            m18781h(aVar);
            return;
        }
        if (obj instanceof Set) {
            map = this.f17803a;
            obj = Collections.unmodifiableSet(C2510v.m10012O((Iterable) obj));
            C4753m.m18652e(obj, "unmodifiableSet(value.toSet())");
        } else {
            map = this.f17803a;
        }
        map.put(aVar, obj);
    }

    public String toString() {
        return C2510v.m10025x(this.f17803a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f17805h, 24, null);
    }
}
