package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* loaded from: classes.dex */
public class KeepAliveService extends Service {
    private static final Binder sBinder = new Binder();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return sBinder;
    }
}
