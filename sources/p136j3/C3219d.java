package p136j3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p280t8.InterfaceC4727d;

/* renamed from: j3.d */
/* loaded from: classes.dex */
public final class C3219d {

    /* renamed from: c */
    public static final C3219d f11156c = new a().m11470a();

    /* renamed from: a */
    public final String f11157a;

    /* renamed from: b */
    public final List<C3218c> f11158b;

    /* renamed from: j3.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public String f11159a = "";

        /* renamed from: b */
        public List<C3218c> f11160b = new ArrayList();

        /* renamed from: a */
        public C3219d m11470a() {
            return new C3219d(this.f11159a, Collections.unmodifiableList(this.f11160b));
        }

        /* renamed from: b */
        public a m11471b(List<C3218c> list) {
            this.f11160b = list;
            return this;
        }

        /* renamed from: c */
        public a m11472c(String str) {
            this.f11159a = str;
            return this;
        }
    }

    public C3219d(String str, List<C3218c> list) {
        this.f11157a = str;
        this.f11158b = list;
    }

    /* renamed from: c */
    public static a m11467c() {
        return new a();
    }

    @InterfaceC4727d(tag = 2)
    /* renamed from: a */
    public List<C3218c> m11468a() {
        return this.f11158b;
    }

    @InterfaceC4727d(tag = 1)
    /* renamed from: b */
    public String m11469b() {
        return this.f11157a;
    }
}
