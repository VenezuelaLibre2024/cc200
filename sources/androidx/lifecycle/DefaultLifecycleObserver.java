package androidx.lifecycle;

import td.C4753m;

/* loaded from: classes.dex */
public interface DefaultLifecycleObserver extends InterfaceC0352j {
    default void onCreate(InterfaceC0354k interfaceC0354k) {
        C4753m.m18653f(interfaceC0354k, "owner");
    }

    default void onDestroy(InterfaceC0354k interfaceC0354k) {
        C4753m.m18653f(interfaceC0354k, "owner");
    }

    default void onPause(InterfaceC0354k interfaceC0354k) {
        C4753m.m18653f(interfaceC0354k, "owner");
    }

    default void onResume(InterfaceC0354k interfaceC0354k) {
        C4753m.m18653f(interfaceC0354k, "owner");
    }

    default void onStart(InterfaceC0354k interfaceC0354k) {
        C4753m.m18653f(interfaceC0354k, "owner");
    }

    default void onStop(InterfaceC0354k interfaceC0354k) {
        C4753m.m18653f(interfaceC0354k, "owner");
    }
}
