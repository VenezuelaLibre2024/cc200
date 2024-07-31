package p136j3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p093g3.AbstractC1975m;
import p280t8.InterfaceC4727d;

/* renamed from: j3.a */
/* loaded from: classes.dex */
public final class C3216a {

    /* renamed from: e */
    public static final C3216a f11130e = new a().m11453b();

    /* renamed from: a */
    public final C3221f f11131a;

    /* renamed from: b */
    public final List<C3219d> f11132b;

    /* renamed from: c */
    public final C3217b f11133c;

    /* renamed from: d */
    public final String f11134d;

    /* renamed from: j3.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public C3221f f11135a = null;

        /* renamed from: b */
        public List<C3219d> f11136b = new ArrayList();

        /* renamed from: c */
        public C3217b f11137c = null;

        /* renamed from: d */
        public String f11138d = "";

        /* renamed from: a */
        public a m11452a(C3219d c3219d) {
            this.f11136b.add(c3219d);
            return this;
        }

        /* renamed from: b */
        public C3216a m11453b() {
            return new C3216a(this.f11135a, Collections.unmodifiableList(this.f11136b), this.f11137c, this.f11138d);
        }

        /* renamed from: c */
        public a m11454c(String str) {
            this.f11138d = str;
            return this;
        }

        /* renamed from: d */
        public a m11455d(C3217b c3217b) {
            this.f11137c = c3217b;
            return this;
        }

        /* renamed from: e */
        public a m11456e(C3221f c3221f) {
            this.f11135a = c3221f;
            return this;
        }
    }

    public C3216a(C3221f c3221f, List<C3219d> list, C3217b c3217b, String str) {
        this.f11131a = c3221f;
        this.f11132b = list;
        this.f11133c = c3217b;
        this.f11134d = str;
    }

    /* renamed from: e */
    public static a m11446e() {
        return new a();
    }

    @InterfaceC4727d(tag = 4)
    /* renamed from: a */
    public String m11447a() {
        return this.f11134d;
    }

    @InterfaceC4727d(tag = 3)
    /* renamed from: b */
    public C3217b m11448b() {
        return this.f11133c;
    }

    @InterfaceC4727d(tag = 2)
    /* renamed from: c */
    public List<C3219d> m11449c() {
        return this.f11132b;
    }

    @InterfaceC4727d(tag = 1)
    /* renamed from: d */
    public C3221f m11450d() {
        return this.f11131a;
    }

    /* renamed from: f */
    public byte[] m11451f() {
        return AbstractC1975m.m7995a(this);
    }
}
