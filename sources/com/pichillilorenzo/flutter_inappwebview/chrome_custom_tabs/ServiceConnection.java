package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import p260s.AbstractServiceConnectionC4383e;
import p260s.C4381c;

/* loaded from: classes.dex */
public class ServiceConnection extends AbstractServiceConnectionC4383e {
    private WeakReference<ServiceConnectionCallback> mConnectionCallback;

    public ServiceConnection(ServiceConnectionCallback serviceConnectionCallback) {
        this.mConnectionCallback = new WeakReference<>(serviceConnectionCallback);
    }

    @Override // p260s.AbstractServiceConnectionC4383e
    public void onCustomTabsServiceConnected(ComponentName componentName, C4381c c4381c) {
        ServiceConnectionCallback serviceConnectionCallback = this.mConnectionCallback.get();
        if (serviceConnectionCallback != null) {
            serviceConnectionCallback.onServiceConnected(c4381c);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ServiceConnectionCallback serviceConnectionCallback = this.mConnectionCallback.get();
        if (serviceConnectionCallback != null) {
            serviceConnectionCallback.onServiceDisconnected();
        }
    }
}
