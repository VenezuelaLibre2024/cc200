package je;

/* renamed from: je.c */
/* loaded from: classes2.dex */
public final class C3288c extends C3291f {

    /* renamed from: p */
    public static final C3288c f11483p = new C3288c();

    public C3288c() {
        super(C3297l.f11496c, C3297l.f11497d, C3297l.f11498e, C3297l.f11494a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p038ce.AbstractC1064k0
    public String toString() {
        return "Dispatchers.Default";
    }
}
