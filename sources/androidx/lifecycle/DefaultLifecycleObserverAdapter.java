package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344f;
import td.C4753m;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0350i {

    /* renamed from: h */
    public final DefaultLifecycleObserver f1655h;

    /* renamed from: i */
    public final InterfaceC0350i f1656i;

    /* renamed from: androidx.lifecycle.DefaultLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0329a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1657a;

        static {
            int[] iArr = new int[AbstractC0344f.a.values().length];
            try {
                iArr[AbstractC0344f.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC0344f.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC0344f.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC0344f.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC0344f.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC0344f.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC0344f.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f1657a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC0350i interfaceC0350i) {
        C4753m.m18653f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f1655h = defaultLifecycleObserver;
        this.f1656i = interfaceC0350i;
    }

    @Override // androidx.lifecycle.InterfaceC0350i
    /* renamed from: a */
    public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        C4753m.m18653f(interfaceC0354k, "source");
        C4753m.m18653f(aVar, "event");
        switch (C0329a.f1657a[aVar.ordinal()]) {
            case 1:
                this.f1655h.onCreate(interfaceC0354k);
                break;
            case 2:
                this.f1655h.onStart(interfaceC0354k);
                break;
            case 3:
                this.f1655h.onResume(interfaceC0354k);
                break;
            case 4:
                this.f1655h.onPause(interfaceC0354k);
                break;
            case 5:
                this.f1655h.onStop(interfaceC0354k);
                break;
            case 6:
                this.f1655h.onDestroy(interfaceC0354k);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0350i interfaceC0350i = this.f1656i;
        if (interfaceC0350i != null) {
            interfaceC0350i.mo571a(interfaceC0354k, aVar);
        }
    }
}
