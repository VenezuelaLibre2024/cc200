package p185m9;

import ae.C0108n;
import java.util.Locale;
import java.util.UUID;
import p195n7.C3763c;
import p195n7.C3774n;
import sd.InterfaceC4569a;
import td.C4747g;
import td.C4751k;
import td.C4753m;

/* renamed from: m9.d0 */
/* loaded from: classes.dex */
public final class C3562d0 {

    /* renamed from: f */
    public static final b f12537f = new b(null);

    /* renamed from: a */
    public final InterfaceC3574j0 f12538a;

    /* renamed from: b */
    public final InterfaceC4569a<UUID> f12539b;

    /* renamed from: c */
    public final String f12540c;

    /* renamed from: d */
    public int f12541d;

    /* renamed from: e */
    public C3590y f12542e;

    /* renamed from: m9.d0$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends C4751k implements InterfaceC4569a<UUID> {

        /* renamed from: h */
        public static final a f12543h = new a();

        public a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // sd.InterfaceC4569a
        /* renamed from: c */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* renamed from: m9.d0$b */
    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final C3562d0 m13240a() {
            Object m14348k = C3774n.m14361a(C3763c.f13574a).m14348k(C3562d0.class);
            C4753m.m18652e(m14348k, "Firebase.app[SessionGenerator::class.java]");
            return (C3562d0) m14348k;
        }
    }

    public C3562d0(InterfaceC3574j0 interfaceC3574j0, InterfaceC4569a<UUID> interfaceC4569a) {
        C4753m.m18653f(interfaceC3574j0, "timeProvider");
        C4753m.m18653f(interfaceC4569a, "uuidGenerator");
        this.f12538a = interfaceC3574j0;
        this.f12539b = interfaceC4569a;
        this.f12540c = m13237b();
        this.f12541d = -1;
    }

    public /* synthetic */ C3562d0(InterfaceC3574j0 interfaceC3574j0, InterfaceC4569a interfaceC4569a, int i10, C4747g c4747g) {
        this(interfaceC3574j0, (i10 & 2) != 0 ? a.f12543h : interfaceC4569a);
    }

    /* renamed from: a */
    public final C3590y m13236a() {
        int i10 = this.f12541d + 1;
        this.f12541d = i10;
        this.f12542e = new C3590y(i10 == 0 ? this.f12540c : m13237b(), this.f12540c, this.f12541d, this.f12538a.mo13275a());
        return m13238c();
    }

    /* renamed from: b */
    public final String m13237b() {
        String uuid = this.f12539b.invoke().toString();
        C4753m.m18652e(uuid, "uuidGenerator().toString()");
        String lowerCase = C0108n.m431q(uuid, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        C4753m.m18652e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    /* renamed from: c */
    public final C3590y m13238c() {
        C3590y c3590y = this.f12542e;
        if (c3590y != null) {
            return c3590y;
        }
        C4753m.m18667t("currentSession");
        return null;
    }
}
