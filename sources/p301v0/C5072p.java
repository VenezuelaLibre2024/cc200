package p301v0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p301v0.AbstractC5096y;

/* renamed from: v0.p */
/* loaded from: classes.dex */
public class C5072p {

    /* renamed from: b */
    public static boolean f19038b = true;

    /* renamed from: d */
    public static volatile C5072p f19040d;

    /* renamed from: a */
    public final Map<a, AbstractC5096y.e<?, ?>> f19042a;

    /* renamed from: c */
    public static final Class<?> f19039c = m20420c();

    /* renamed from: e */
    public static final C5072p f19041e = new C5072p(true);

    /* renamed from: v0.p$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Object f19043a;

        /* renamed from: b */
        public final int f19044b;

        public a(Object obj, int i10) {
            this.f19043a = obj;
            this.f19044b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19043a == aVar.f19043a && this.f19044b == aVar.f19044b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f19043a) * 65535) + this.f19044b;
        }
    }

    public C5072p() {
        this.f19042a = new HashMap();
    }

    public C5072p(boolean z10) {
        this.f19042a = Collections.emptyMap();
    }

    /* renamed from: b */
    public static C5072p m20419b() {
        C5072p c5072p = f19040d;
        if (c5072p == null) {
            synchronized (C5072p.class) {
                c5072p = f19040d;
                if (c5072p == null) {
                    c5072p = f19038b ? C5069o.m20396a() : f19041e;
                    f19040d = c5072p;
                }
            }
        }
        return c5072p;
    }

    /* renamed from: c */
    public static Class<?> m20420c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public <ContainingType extends InterfaceC5079r0> AbstractC5096y.e<ContainingType, ?> m20421a(ContainingType containingtype, int i10) {
        return (AbstractC5096y.e) this.f19042a.get(new a(containingtype, i10));
    }
}
