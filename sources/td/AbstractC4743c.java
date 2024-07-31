package td;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p259rd.C4345b;
import p359yd.EnumC5920j;
import p359yd.InterfaceC5912b;
import p359yd.InterfaceC5914d;
import p359yd.InterfaceC5919i;

/* renamed from: td.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4743c implements InterfaceC5912b, Serializable {
    public static final Object NO_RECEIVER = a.f17716h;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private transient InterfaceC5912b reflected;
    private final String signature;

    /* renamed from: td.c$a */
    /* loaded from: classes2.dex */
    public static class a implements Serializable {

        /* renamed from: h */
        public static final a f17716h = new a();
    }

    public AbstractC4743c() {
        this(NO_RECEIVER);
    }

    public AbstractC4743c(Object obj) {
        this(obj, null, null, null, false);
    }

    public AbstractC4743c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // p359yd.InterfaceC5912b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p359yd.InterfaceC5912b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC5912b compute() {
        InterfaceC5912b interfaceC5912b = this.reflected;
        if (interfaceC5912b != null) {
            return interfaceC5912b;
        }
        InterfaceC5912b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract InterfaceC5912b computeReflected();

    @Override // p359yd.InterfaceC5911a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public InterfaceC5914d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C4764x.m18673c(cls) : C4764x.m18672b(cls);
    }

    @Override // p359yd.InterfaceC5912b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC5912b getReflected() {
        InterfaceC5912b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C4345b();
    }

    @Override // p359yd.InterfaceC5912b
    public InterfaceC5919i getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p359yd.InterfaceC5912b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p359yd.InterfaceC5912b
    public EnumC5920j getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p359yd.InterfaceC5912b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p359yd.InterfaceC5912b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p359yd.InterfaceC5912b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p359yd.InterfaceC5912b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
