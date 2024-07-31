package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import gd.C2245s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import p133j0.InterfaceC3202a;
import td.C4753m;

/* loaded from: classes.dex */
public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {
    private final Map<Activity, MulticastConsumer> activityToListeners;
    private final WindowLayoutComponent component;
    private final ReentrantLock extensionWindowBackendLock;
    private final Map<InterfaceC3202a<WindowLayoutInfo>, Activity> listenerToActivity;

    @SuppressLint({"NewApi"})
    /* loaded from: classes.dex */
    public static final class MulticastConsumer implements Consumer<androidx.window.extensions.layout.WindowLayoutInfo> {
        private final Activity activity;
        private WindowLayoutInfo lastKnownValue;
        private final ReentrantLock multicastConsumerLock;
        private final Set<InterfaceC3202a<WindowLayoutInfo>> registeredListeners;

        public MulticastConsumer(Activity activity) {
            C4753m.m18653f(activity, "activity");
            this.activity = activity;
            this.multicastConsumerLock = new ReentrantLock();
            this.registeredListeners = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        public void accept(androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
            C4753m.m18653f(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.activity, windowLayoutInfo);
                Iterator<T> it = this.registeredListeners.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3202a) it.next()).accept(this.lastKnownValue);
                }
                C2245s c2245s = C2245s.f8873a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void addListener(InterfaceC3202a<WindowLayoutInfo> interfaceC3202a) {
            C4753m.m18653f(interfaceC3202a, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                WindowLayoutInfo windowLayoutInfo = this.lastKnownValue;
                if (windowLayoutInfo != null) {
                    interfaceC3202a.accept(windowLayoutInfo);
                }
                this.registeredListeners.add(interfaceC3202a);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean isEmpty() {
            return this.registeredListeners.isEmpty();
        }

        public final void removeListener(InterfaceC3202a<WindowLayoutInfo> interfaceC3202a) {
            C4753m.m18653f(interfaceC3202a, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove(interfaceC3202a);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public ExtensionWindowLayoutInfoBackend(WindowLayoutComponent windowLayoutComponent) {
        C4753m.m18653f(windowLayoutComponent, "component");
        this.component = windowLayoutComponent;
        this.extensionWindowBackendLock = new ReentrantLock();
        this.activityToListeners = new LinkedHashMap();
        this.listenerToActivity = new LinkedHashMap();
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(Activity activity, Executor executor, InterfaceC3202a<WindowLayoutInfo> interfaceC3202a) {
        C2245s c2245s;
        C4753m.m18653f(activity, "activity");
        C4753m.m18653f(executor, "executor");
        C4753m.m18653f(interfaceC3202a, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                c2245s = null;
            } else {
                multicastConsumer.addListener(interfaceC3202a);
                this.listenerToActivity.put(interfaceC3202a, activity);
                c2245s = C2245s.f8873a;
            }
            if (c2245s == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(activity);
                this.activityToListeners.put(activity, multicastConsumer2);
                this.listenerToActivity.put(interfaceC3202a, activity);
                multicastConsumer2.addListener(interfaceC3202a);
                this.component.addWindowLayoutInfoListener(activity, multicastConsumer2);
            }
            C2245s c2245s2 = C2245s.f8873a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(InterfaceC3202a<WindowLayoutInfo> interfaceC3202a) {
        C4753m.m18653f(interfaceC3202a, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            Activity activity = this.listenerToActivity.get(interfaceC3202a);
            if (activity == null) {
                return;
            }
            MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                return;
            }
            multicastConsumer.removeListener(interfaceC3202a);
            if (multicastConsumer.isEmpty()) {
                this.component.removeWindowLayoutInfoListener(multicastConsumer);
            }
            C2245s c2245s = C2245s.f8873a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
