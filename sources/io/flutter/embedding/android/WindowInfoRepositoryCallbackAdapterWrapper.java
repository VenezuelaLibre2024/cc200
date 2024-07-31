package io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;
import p133j0.InterfaceC3202a;

/* loaded from: classes2.dex */
public class WindowInfoRepositoryCallbackAdapterWrapper {
    public final WindowInfoTrackerCallbackAdapter adapter;

    public WindowInfoRepositoryCallbackAdapterWrapper(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.adapter = windowInfoTrackerCallbackAdapter;
    }

    public void addWindowLayoutInfoListener(Activity activity, Executor executor, InterfaceC3202a<WindowLayoutInfo> interfaceC3202a) {
        this.adapter.addWindowLayoutInfoListener(activity, executor, interfaceC3202a);
    }

    public void removeWindowLayoutInfoListener(InterfaceC3202a<WindowLayoutInfo> interfaceC3202a) {
        this.adapter.removeWindowLayoutInfoListener(interfaceC3202a);
    }
}
