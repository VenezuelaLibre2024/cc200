package p029c2;

import android.os.Build;
import androidx.work.C0417b;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p165l2.C3420p;

/* renamed from: c2.u */
/* loaded from: classes.dex */
public abstract class AbstractC0603u {

    /* renamed from: a */
    public UUID f2627a;

    /* renamed from: b */
    public C3420p f2628b;

    /* renamed from: c */
    public Set<String> f2629c;

    /* renamed from: c2.u$a */
    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends AbstractC0603u> {

        /* renamed from: c */
        public C3420p f2632c;

        /* renamed from: e */
        public Class<? extends ListenableWorker> f2634e;

        /* renamed from: a */
        public boolean f2630a = false;

        /* renamed from: d */
        public Set<String> f2633d = new HashSet();

        /* renamed from: b */
        public UUID f2631b = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.f2634e = cls;
            this.f2632c = new C3420p(this.f2631b.toString(), cls.getName());
            m2997a(cls.getName());
        }

        /* renamed from: a */
        public final B m2997a(String str) {
            this.f2633d.add(str);
            return mo2980d();
        }

        /* renamed from: b */
        public final W m2998b() {
            W mo2979c = mo2979c();
            C0584b c0584b = this.f2632c.f12019j;
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = (i10 >= 24 && c0584b.m2940e()) || c0584b.m2941f() || c0584b.m2942g() || (i10 >= 23 && c0584b.m2943h());
            C3420p c3420p = this.f2632c;
            if (c3420p.f12026q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (c3420p.f12016g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f2631b = UUID.randomUUID();
            C3420p c3420p2 = new C3420p(this.f2632c);
            this.f2632c = c3420p2;
            c3420p2.f12010a = this.f2631b.toString();
            return mo2979c;
        }

        /* renamed from: c */
        public abstract W mo2979c();

        /* renamed from: d */
        public abstract B mo2980d();

        /* renamed from: e */
        public final B m2999e(EnumC0583a enumC0583a, long j10, TimeUnit timeUnit) {
            this.f2630a = true;
            C3420p c3420p = this.f2632c;
            c3420p.f12021l = enumC0583a;
            c3420p.m12735e(timeUnit.toMillis(j10));
            return mo2980d();
        }

        /* renamed from: f */
        public final B m3000f(C0584b c0584b) {
            this.f2632c.f12019j = c0584b;
            return mo2980d();
        }

        /* renamed from: g */
        public final B m3001g(C0417b c0417b) {
            this.f2632c.f12014e = c0417b;
            return mo2980d();
        }
    }

    public AbstractC0603u(UUID uuid, C3420p c3420p, Set<String> set) {
        this.f2627a = uuid;
        this.f2628b = c3420p;
        this.f2629c = set;
    }

    /* renamed from: a */
    public UUID m2993a() {
        return this.f2627a;
    }

    /* renamed from: b */
    public String m2994b() {
        return this.f2627a.toString();
    }

    /* renamed from: c */
    public Set<String> m2995c() {
        return this.f2629c;
    }

    /* renamed from: d */
    public C3420p m2996d() {
        return this.f2628b;
    }
}
