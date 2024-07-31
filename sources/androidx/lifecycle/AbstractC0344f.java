package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import td.C4747g;
import td.C4753m;

/* renamed from: androidx.lifecycle.f */
/* loaded from: classes.dex */
public abstract class AbstractC0344f {

    /* renamed from: a */
    public AtomicReference<Object> f1702a = new AtomicReference<>();

    /* renamed from: androidx.lifecycle.f$a */
    /* loaded from: classes.dex */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C6136a Companion = new C6136a(null);

        /* renamed from: androidx.lifecycle.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C6136a {

            /* renamed from: androidx.lifecycle.f$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C6137a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f1703a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f1703a = iArr;
                }
            }

            public C6136a() {
            }

            public /* synthetic */ C6136a(C4747g c4747g) {
                this();
            }

            /* renamed from: a */
            public final a m1807a(b bVar) {
                C4753m.m18653f(bVar, "state");
                int i10 = C6137a.f1703a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            /* renamed from: b */
            public final a m1808b(b bVar) {
                C4753m.m18653f(bVar, "state");
                int i10 = C6137a.f1703a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            /* renamed from: c */
            public final a m1809c(b bVar) {
                C4753m.m18653f(bVar, "state");
                int i10 = C6137a.f1703a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        /* renamed from: androidx.lifecycle.f$a$b */
        /* loaded from: classes.dex */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f1704a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f1704a = iArr;
            }
        }

        /* renamed from: c */
        public static final a m1804c(b bVar) {
            return Companion.m1807a(bVar);
        }

        /* renamed from: h */
        public static final a m1805h(b bVar) {
            return Companion.m1809c(bVar);
        }

        /* renamed from: f */
        public final b m1806f() {
            switch (b.f1704a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.f$b */
    /* loaded from: classes.dex */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: c */
        public final boolean m1811c(b bVar) {
            C4753m.m18653f(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo1800a(InterfaceC0352j interfaceC0352j);

    /* renamed from: b */
    public abstract b mo1801b();

    /* renamed from: c */
    public abstract void mo1802c(InterfaceC0352j interfaceC0352j);
}
