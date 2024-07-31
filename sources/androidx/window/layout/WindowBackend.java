package androidx.window.layout;

import android.app.Activity;
import java.util.concurrent.Executor;
import p133j0.InterfaceC3202a;

/* loaded from: classes.dex */
public interface WindowBackend {
    void registerLayoutChangeCallback(Activity activity, Executor executor, InterfaceC3202a<WindowLayoutInfo> interfaceC3202a);

    void unregisterLayoutChangeCallback(InterfaceC3202a<WindowLayoutInfo> interfaceC3202a);
}
