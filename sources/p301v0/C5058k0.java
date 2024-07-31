package p301v0;

import p301v0.C5086t1;

/* renamed from: v0.k0 */
/* loaded from: classes.dex */
public class C5058k0<K, V> {

    /* renamed from: a */
    public final a<K, V> f19008a;

    /* renamed from: b */
    public final K f19009b;

    /* renamed from: c */
    public final V f19010c;

    /* renamed from: v0.k0$a */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a */
        public final C5086t1.b f19011a;

        /* renamed from: b */
        public final K f19012b;

        /* renamed from: c */
        public final C5086t1.b f19013c;

        /* renamed from: d */
        public final V f19014d;

        public a(C5086t1.b bVar, K k10, C5086t1.b bVar2, V v10) {
            this.f19011a = bVar;
            this.f19012b = k10;
            this.f19013c = bVar2;
            this.f19014d = v10;
        }
    }

    public C5058k0(C5086t1.b bVar, K k10, C5086t1.b bVar2, V v10) {
        this.f19008a = new a<>(bVar, k10, bVar2, v10);
        this.f19009b = k10;
        this.f19010c = v10;
    }

    /* renamed from: b */
    public static <K, V> int m20283b(a<K, V> aVar, K k10, V v10) {
        return C5087u.m20582d(aVar.f19011a, 1, k10) + C5087u.m20582d(aVar.f19013c, 2, v10);
    }

    /* renamed from: d */
    public static <K, V> C5058k0<K, V> m20284d(C5086t1.b bVar, K k10, C5086t1.b bVar2, V v10) {
        return new C5058k0<>(bVar, k10, bVar2, v10);
    }

    /* renamed from: e */
    public static <K, V> void m20285e(AbstractC5057k abstractC5057k, a<K, V> aVar, K k10, V v10) {
        C5087u.m20590z(abstractC5057k, aVar.f19011a, 1, k10);
        C5087u.m20590z(abstractC5057k, aVar.f19013c, 2, v10);
    }

    /* renamed from: a */
    public int m20286a(int i10, K k10, V v10) {
        return AbstractC5057k.m20186V(i10) + AbstractC5057k.m20167C(m20283b(this.f19008a, k10, v10));
    }

    /* renamed from: c */
    public a<K, V> m20287c() {
        return this.f19008a;
    }
}
