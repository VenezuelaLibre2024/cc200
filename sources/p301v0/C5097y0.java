package p301v0;

/* renamed from: v0.y0 */
/* loaded from: classes.dex */
public final class C5097y0 {

    /* renamed from: a */
    public static final InterfaceC5093w0 f19238a = m20728c();

    /* renamed from: b */
    public static final InterfaceC5093w0 f19239b = new C5095x0();

    /* renamed from: a */
    public static InterfaceC5093w0 m20726a() {
        return f19238a;
    }

    /* renamed from: b */
    public static InterfaceC5093w0 m20727b() {
        return f19239b;
    }

    /* renamed from: c */
    public static InterfaceC5093w0 m20728c() {
        try {
            return (InterfaceC5093w0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
