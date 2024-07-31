package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p029c2.AbstractC0591i;
import p029c2.AbstractC0604v;
import p029c2.InterfaceC0589g;
import p029c2.InterfaceC0599q;
import p044d2.C1519a;
import p079f6.C1841a;

/* renamed from: androidx.work.a */
/* loaded from: classes.dex */
public final class C0416a {

    /* renamed from: a */
    public final Executor f1976a;

    /* renamed from: b */
    public final Executor f1977b;

    /* renamed from: c */
    public final AbstractC0604v f1978c;

    /* renamed from: d */
    public final AbstractC0591i f1979d;

    /* renamed from: e */
    public final InterfaceC0599q f1980e;

    /* renamed from: f */
    public final InterfaceC0589g f1981f;

    /* renamed from: g */
    public final String f1982g;

    /* renamed from: h */
    public final int f1983h;

    /* renamed from: i */
    public final int f1984i;

    /* renamed from: j */
    public final int f1985j;

    /* renamed from: k */
    public final int f1986k;

    /* renamed from: l */
    public final boolean f1987l;

    /* renamed from: androidx.work.a$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f1988a = new AtomicInteger(0);

        /* renamed from: b */
        public final /* synthetic */ boolean f1989b;

        public a(boolean z10) {
            this.f1989b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f1989b ? "WM.task-" : "androidx.work-") + this.f1988a.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public Executor f1991a;

        /* renamed from: b */
        public AbstractC0604v f1992b;

        /* renamed from: c */
        public AbstractC0591i f1993c;

        /* renamed from: d */
        public Executor f1994d;

        /* renamed from: e */
        public InterfaceC0599q f1995e;

        /* renamed from: f */
        public InterfaceC0589g f1996f;

        /* renamed from: g */
        public String f1997g;

        /* renamed from: h */
        public int f1998h = 4;

        /* renamed from: i */
        public int f1999i = 0;

        /* renamed from: j */
        public int f2000j = C1841a.e.API_PRIORITY_OTHER;

        /* renamed from: k */
        public int f2001k = 20;

        /* renamed from: a */
        public C0416a m2101a() {
            return new C0416a(this);
        }

        /* renamed from: b */
        public b m2102b(Executor executor) {
            this.f1991a = executor;
            return this;
        }
    }

    /* renamed from: androidx.work.a$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        C0416a m2103a();
    }

    public C0416a(b bVar) {
        Executor executor = bVar.f1991a;
        this.f1976a = executor == null ? m2088a(false) : executor;
        Executor executor2 = bVar.f1994d;
        if (executor2 == null) {
            this.f1987l = true;
            executor2 = m2088a(true);
        } else {
            this.f1987l = false;
        }
        this.f1977b = executor2;
        AbstractC0604v abstractC0604v = bVar.f1992b;
        this.f1978c = abstractC0604v == null ? AbstractC0604v.m3002c() : abstractC0604v;
        AbstractC0591i abstractC0591i = bVar.f1993c;
        this.f1979d = abstractC0591i == null ? AbstractC0591i.m2967c() : abstractC0591i;
        InterfaceC0599q interfaceC0599q = bVar.f1995e;
        this.f1980e = interfaceC0599q == null ? new C1519a() : interfaceC0599q;
        this.f1983h = bVar.f1998h;
        this.f1984i = bVar.f1999i;
        this.f1985j = bVar.f2000j;
        this.f1986k = bVar.f2001k;
        this.f1981f = bVar.f1996f;
        this.f1982g = bVar.f1997g;
    }

    /* renamed from: a */
    public final Executor m2088a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), m2089b(z10));
    }

    /* renamed from: b */
    public final ThreadFactory m2089b(boolean z10) {
        return new a(z10);
    }

    /* renamed from: c */
    public String m2090c() {
        return this.f1982g;
    }

    /* renamed from: d */
    public InterfaceC0589g m2091d() {
        return this.f1981f;
    }

    /* renamed from: e */
    public Executor m2092e() {
        return this.f1976a;
    }

    /* renamed from: f */
    public AbstractC0591i m2093f() {
        return this.f1979d;
    }

    /* renamed from: g */
    public int m2094g() {
        return this.f1985j;
    }

    /* renamed from: h */
    public int m2095h() {
        return Build.VERSION.SDK_INT == 23 ? this.f1986k / 2 : this.f1986k;
    }

    /* renamed from: i */
    public int m2096i() {
        return this.f1984i;
    }

    /* renamed from: j */
    public int m2097j() {
        return this.f1983h;
    }

    /* renamed from: k */
    public InterfaceC0599q m2098k() {
        return this.f1980e;
    }

    /* renamed from: l */
    public Executor m2099l() {
        return this.f1977b;
    }

    /* renamed from: m */
    public AbstractC0604v m2100m() {
        return this.f1978c;
    }
}
