package p096g6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p064e6.C1667b;
import p064e6.C1671d;
import p079f6.C1841a;
import p108h6.AbstractC2346c;
import p108h6.AbstractC2364i;
import p108h6.C2394s;
import p108h6.InterfaceC2370k;

/* renamed from: g6.l */
/* loaded from: classes.dex */
public final class ServiceConnectionC2041l implements C1841a.f, ServiceConnection {

    /* renamed from: s */
    public static final String f8080s = ServiceConnectionC2041l.class.getSimpleName();

    /* renamed from: h */
    public final String f8081h;

    /* renamed from: i */
    public final String f8082i;

    /* renamed from: j */
    public final ComponentName f8083j;

    /* renamed from: k */
    public final Context f8084k;

    /* renamed from: l */
    public final InterfaceC2014e f8085l;

    /* renamed from: m */
    public final Handler f8086m;

    /* renamed from: n */
    public final InterfaceC2044m f8087n;

    /* renamed from: o */
    public IBinder f8088o;

    /* renamed from: p */
    public boolean f8089p;

    /* renamed from: q */
    public String f8090q;

    /* renamed from: r */
    public String f8091r;

    /* renamed from: b */
    public final /* synthetic */ void m8213b() {
        this.f8089p = false;
        this.f8088o = null;
        this.f8085l.mo8108c(1);
    }

    /* renamed from: c */
    public final /* synthetic */ void m8214c(IBinder iBinder) {
        this.f8089p = false;
        this.f8088o = iBinder;
        String.valueOf(iBinder);
        this.f8085l.mo8109g(new Bundle());
    }

    @Override // p079f6.C1841a.f
    public final void connect(AbstractC2346c.c cVar) {
        m8216e();
        String.valueOf(this.f8088o);
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f8083j;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f8081h).setAction(this.f8082i);
            }
            boolean bindService = this.f8084k.bindService(intent, this, AbstractC2364i.m9561b());
            this.f8089p = bindService;
            if (!bindService) {
                this.f8088o = null;
                this.f8087n.mo8194e(new C1667b(16));
            }
            String.valueOf(this.f8088o);
        } catch (SecurityException e10) {
            this.f8089p = false;
            this.f8088o = null;
            throw e10;
        }
    }

    /* renamed from: d */
    public final void m8215d(String str) {
        this.f8091r = str;
    }

    @Override // p079f6.C1841a.f
    public final void disconnect() {
        m8216e();
        String.valueOf(this.f8088o);
        try {
            this.f8084k.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f8089p = false;
        this.f8088o = null;
    }

    @Override // p079f6.C1841a.f
    public final void disconnect(String str) {
        m8216e();
        this.f8090q = str;
        disconnect();
    }

    /* renamed from: e */
    public final void m8216e() {
        if (Thread.currentThread() != this.f8086m.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // p079f6.C1841a.f
    public final C1671d[] getAvailableFeatures() {
        return new C1671d[0];
    }

    @Override // p079f6.C1841a.f
    public final String getEndpointPackageName() {
        String str = this.f8081h;
        if (str != null) {
            return str;
        }
        C2394s.m9619l(this.f8083j);
        return this.f8083j.getPackageName();
    }

    @Override // p079f6.C1841a.f
    public final String getLastDisconnectMessage() {
        return this.f8090q;
    }

    @Override // p079f6.C1841a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // p079f6.C1841a.f
    public final void getRemoteService(InterfaceC2370k interfaceC2370k, Set<Scope> set) {
    }

    @Override // p079f6.C1841a.f
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // p079f6.C1841a.f
    public final boolean isConnected() {
        m8216e();
        return this.f8088o != null;
    }

    @Override // p079f6.C1841a.f
    public final boolean isConnecting() {
        m8216e();
        return this.f8089p;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f8086m.post(new Runnable() { // from class: g6.y0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2041l.this.m8214c(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f8086m.post(new Runnable() { // from class: g6.x0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2041l.this.m8213b();
            }
        });
    }

    @Override // p079f6.C1841a.f
    public final void onUserSignOut(AbstractC2346c.e eVar) {
    }

    @Override // p079f6.C1841a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // p079f6.C1841a.f
    public final boolean requiresSignIn() {
        return false;
    }
}
