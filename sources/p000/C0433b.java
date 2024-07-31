package p000;

import java.util.List;
import p115hd.C2501m;
import td.C4747g;
import td.C4753m;

/* renamed from: b */
/* loaded from: classes.dex */
public final class C0433b {

    /* renamed from: b */
    public static final a f2119b = new a(null);

    /* renamed from: a */
    public final Boolean f2120a;

    /* renamed from: b$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final C0433b m2231a(List<? extends Object> list) {
            C4753m.m18653f(list, "list");
            return new C0433b((Boolean) list.get(0));
        }
    }

    public C0433b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C0433b(Boolean bool) {
        this.f2120a = bool;
    }

    public /* synthetic */ C0433b(Boolean bool, int i10, C4747g c4747g) {
        this((i10 & 1) != 0 ? null : bool);
    }

    /* renamed from: a */
    public final List<Object> m2230a() {
        return C2501m.m9986b(this.f2120a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0433b) && C4753m.m18648a(this.f2120a, ((C0433b) obj).f2120a);
    }

    public int hashCode() {
        Boolean bool = this.f2120a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "IsEnabledMessage(enabled=" + this.f2120a + ')';
    }
}
