package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import td.C4753m;

/* renamed from: androidx.lifecycle.n */
/* loaded from: classes.dex */
public class ServiceC0358n extends Service implements InterfaceC0354k {

    /* renamed from: h */
    public final C0341d0 f1739h = new C0341d0(this);

    @Override // androidx.lifecycle.InterfaceC0354k
    public AbstractC0344f getLifecycle() {
        return this.f1739h.m1790a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        C4753m.m18653f(intent, "intent");
        this.f1739h.m1791b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f1739h.m1792c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f1739h.m1793d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f1739h.m1794e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
