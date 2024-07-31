package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import p260s.AbstractServiceConnectionC4383e;
import p260s.C4380b;
import p260s.C4381c;
import p260s.C4382d;
import p260s.C4384f;
import p271t.C4599b;

/* loaded from: classes.dex */
public class CustomTabActivityHelper implements ServiceConnectionCallback {
    private C4381c mClient;
    private AbstractServiceConnectionC4383e mConnection;
    private ConnectionCallback mConnectionCallback;
    private C4380b mCustomTabsCallback;
    private C4384f mCustomTabsSession;

    /* loaded from: classes.dex */
    public interface ConnectionCallback {
        void onCustomTabsConnected();

        void onCustomTabsDisconnected();
    }

    public static boolean isAvailable(Activity activity) {
        return CustomTabsHelper.getPackageNameToUse(activity) != null;
    }

    public static void openCustomTab(Activity activity, C4382d c4382d, Uri uri, int i10) {
        c4382d.f16085a.setData(uri);
        activity.startActivityForResult(c4382d.f16085a, i10);
    }

    public static void openCustomTab(Activity activity, C4599b c4599b, Uri uri, int i10) {
        c4599b.m18121a().setData(uri);
        activity.startActivityForResult(c4599b.m18121a(), i10);
    }

    public void bindCustomTabsService(Activity activity) {
        String packageNameToUse;
        if (this.mClient == null && (packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity)) != null) {
            ServiceConnection serviceConnection = new ServiceConnection(this);
            this.mConnection = serviceConnection;
            C4381c.m16939a(activity, packageNameToUse, serviceConnection);
        }
    }

    public C4384f getSession() {
        C4384f m16943e;
        C4381c c4381c = this.mClient;
        if (c4381c != null) {
            m16943e = this.mCustomTabsSession == null ? c4381c.m16943e(this.mCustomTabsCallback) : null;
            return this.mCustomTabsSession;
        }
        this.mCustomTabsSession = m16943e;
        return this.mCustomTabsSession;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        C4384f session;
        if (this.mClient == null || (session = getSession()) == null) {
            return false;
        }
        return session.m16964f(uri, bundle, list);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceConnected(C4381c c4381c) {
        this.mClient = c4381c;
        c4381c.m16945g(0L);
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsConnected();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceDisconnected() {
        this.mClient = null;
        this.mCustomTabsSession = null;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsDisconnected();
        }
    }

    public void setConnectionCallback(ConnectionCallback connectionCallback) {
        this.mConnectionCallback = connectionCallback;
    }

    public void setCustomTabsCallback(C4380b c4380b) {
        this.mCustomTabsCallback = c4380b;
    }

    public void unbindCustomTabsService(Activity activity) {
        AbstractServiceConnectionC4383e abstractServiceConnectionC4383e = this.mConnection;
        if (abstractServiceConnectionC4383e == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC4383e);
        this.mClient = null;
        this.mCustomTabsSession = null;
        this.mConnection = null;
    }
}
