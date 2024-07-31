package p000;

import java.util.List;
import p115hd.C2501m;
import td.C4747g;
import td.C4753m;

/* renamed from: f */
/* loaded from: classes.dex */
public final class C1792f {

    /* renamed from: b */
    public static final a f6595b = new a(null);

    /* renamed from: a */
    public final Boolean f6596a;

    /* renamed from: f$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final C1792f m7244a(List<? extends Object> list) {
            C4753m.m18653f(list, "list");
            return new C1792f((Boolean) list.get(0));
        }
    }

    public C1792f() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C1792f(Boolean bool) {
        this.f6596a = bool;
    }

    public /* synthetic */ C1792f(Boolean bool, int i10, C4747g c4747g) {
        this((i10 & 1) != 0 ? null : bool);
    }

    /* renamed from: a */
    public final Boolean m7242a() {
        return this.f6596a;
    }

    /* renamed from: b */
    public final List<Object> m7243b() {
        return C2501m.m9986b(this.f6596a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1792f) && C4753m.m18648a(this.f6596a, ((C1792f) obj).f6596a);
    }

    public int hashCode() {
        Boolean bool = this.f6596a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "ToggleMessage(enable=" + this.f6596a + ')';
    }
}
