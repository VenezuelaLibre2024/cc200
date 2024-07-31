package p029c2;

import android.annotation.SuppressLint;

/* renamed from: c2.m */
/* loaded from: classes.dex */
public interface InterfaceC0595m {

    /* renamed from: a */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c f2607a;

    /* renamed from: b */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C6146b f2608b;

    /* renamed from: c2.m$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: c2.m$b$a */
        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a */
            public final Throwable f2609a;

            public a(Throwable th) {
                this.f2609a = th;
            }

            /* renamed from: a */
            public Throwable m2983a() {
                return this.f2609a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f2609a.getMessage());
            }
        }

        /* renamed from: c2.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C6146b extends b {
            public C6146b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* renamed from: c2.m$b$c */
        /* loaded from: classes.dex */
        public static final class c extends b {
            public c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }
    }

    static {
        f2607a = new b.c();
        f2608b = new b.C6146b();
    }
}
