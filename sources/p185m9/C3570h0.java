package p185m9;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import p195n7.C3767g;
import td.C4747g;
import td.C4753m;

/* renamed from: m9.h0 */
/* loaded from: classes.dex */
public final class C3570h0 implements InterfaceC3568g0 {

    /* renamed from: c */
    public static final a f12571c = new a(null);

    /* renamed from: b */
    public final C3767g f12572b;

    /* renamed from: m9.h0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C3570h0(C3767g c3767g) {
        C4753m.m18653f(c3767g, "firebaseApp");
        this.f12572b = c3767g;
    }

    @Override // p185m9.InterfaceC3568g0
    /* renamed from: a */
    public void mo13270a(Messenger messenger, ServiceConnection serviceConnection) {
        C4753m.m18653f(messenger, "callback");
        C4753m.m18653f(serviceConnection, "serviceConnection");
        Context applicationContext = this.f12572b.m14349m().getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        applicationContext.bindService(intent, serviceConnection, 65);
    }
}
