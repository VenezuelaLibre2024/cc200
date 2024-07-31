package p301v0;

/* renamed from: v0.x */
/* loaded from: classes.dex */
public class C5094x implements InterfaceC5076q0 {

    /* renamed from: a */
    public static final C5094x f19218a = new C5094x();

    /* renamed from: c */
    public static C5094x m20690c() {
        return f19218a;
    }

    @Override // p301v0.InterfaceC5076q0
    /* renamed from: a */
    public InterfaceC5073p0 mo20134a(Class<?> cls) {
        if (!AbstractC5096y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC5073p0) AbstractC5096y.m20700y(cls.asSubclass(AbstractC5096y.class)).m20704r();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // p301v0.InterfaceC5076q0
    /* renamed from: b */
    public boolean mo20135b(Class<?> cls) {
        return AbstractC5096y.class.isAssignableFrom(cls);
    }
}
