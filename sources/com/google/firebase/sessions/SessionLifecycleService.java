package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import be.C0550a;
import java.util.ArrayList;
import p185m9.C3562d0;
import p185m9.InterfaceC3558b0;
import p185m9.InterfaceC3588w;
import p210o9.C3961f;
import td.C4747g;
import td.C4753m;

/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: k */
    public static final C1291a f4917k = new C1291a(null);

    /* renamed from: h */
    public final HandlerThread f4918h = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: i */
    public HandlerC1292b f4919i;

    /* renamed from: j */
    public Messenger f4920j;

    /* renamed from: com.google.firebase.sessions.SessionLifecycleService$a */
    /* loaded from: classes.dex */
    public static final class C1291a {
        public C1291a() {
        }

        public /* synthetic */ C1291a(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: com.google.firebase.sessions.SessionLifecycleService$b */
    /* loaded from: classes.dex */
    public static final class HandlerC1292b extends Handler {

        /* renamed from: a */
        public boolean f4921a;

        /* renamed from: b */
        public long f4922b;

        /* renamed from: c */
        public final ArrayList<Messenger> f4923c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC1292b(Looper looper) {
            super(looper);
            C4753m.m18653f(looper, "looper");
            this.f4923c = new ArrayList<>();
        }

        /* renamed from: a */
        public final void m5568a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Broadcasting new session: ");
            C3562d0.b bVar = C3562d0.f12537f;
            sb2.append(bVar.m13240a().m13238c());
            Log.d("SessionLifecycleService", sb2.toString());
            InterfaceC3558b0.f12469a.m13218a().mo13217a(bVar.m13240a().m13238c());
            for (Messenger messenger : new ArrayList(this.f4923c)) {
                C4753m.m18652e(messenger, "it");
                m5573f(messenger);
            }
        }

        /* renamed from: b */
        public final void m5569b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f4922b = message.getWhen();
        }

        /* renamed from: c */
        public final void m5570c(Message message) {
            this.f4923c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            C4753m.m18652e(messenger, "msg.replyTo");
            m5573f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f4923c.size());
        }

        /* renamed from: d */
        public final void m5571d(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (this.f4921a) {
                if (m5572e(message.getWhen())) {
                    Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                }
                this.f4922b = message.getWhen();
            }
            Log.d("SessionLifecycleService", "Cold start detected.");
            this.f4921a = true;
            m5574g();
            this.f4922b = message.getWhen();
        }

        /* renamed from: e */
        public final boolean m5572e(long j10) {
            return j10 - this.f4922b > C0550a.m2760q(C3961f.f14245c.m15002c().m14994c());
        }

        /* renamed from: f */
        public final void m5573f(Messenger messenger) {
            String mo13293a;
            if (this.f4921a) {
                mo13293a = C3562d0.f12537f.m13240a().m13238c().m13311b();
            } else {
                mo13293a = InterfaceC3588w.f12610a.m13295a().mo13293a();
                Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + mo13293a);
                if (mo13293a == null) {
                    return;
                }
            }
            m5575h(messenger, mo13293a);
        }

        /* renamed from: g */
        public final void m5574g() {
            C3562d0.b bVar = C3562d0.f12537f;
            bVar.m13240a().m13236a();
            Log.d("SessionLifecycleService", "Generated new session " + bVar.m13240a().m13238c().m13311b());
            m5568a();
            InterfaceC3588w.f12610a.m13295a().mo13294b(bVar.m13240a().m13238c().m13311b());
        }

        /* renamed from: h */
        public final void m5575h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain(null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f4923c.remove(messenger);
            } catch (Exception e10) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e10);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C4753m.m18653f(message, "msg");
            if (this.f4922b > message.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.f4922b + '.');
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                m5571d(message);
                return;
            }
            if (i10 == 2) {
                m5569b(message);
                return;
            }
            if (i10 == 4) {
                m5570c(message);
                return;
            }
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
            super.handleMessage(message);
        }
    }

    /* renamed from: a */
    public final Messenger m5567a(Intent intent) {
        return (Messenger) (Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : intent.getParcelableExtra("ClientCallbackMessenger"));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger m5567a = m5567a(intent);
        if (m5567a != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = m5567a;
            HandlerC1292b handlerC1292b = this.f4919i;
            if (handlerC1292b != null) {
                handlerC1292b.sendMessage(obtain);
            }
        }
        Messenger messenger = this.f4920j;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f4918h.start();
        Looper looper = this.f4918h.getLooper();
        C4753m.m18652e(looper, "handlerThread.looper");
        this.f4919i = new HandlerC1292b(looper);
        this.f4920j = new Messenger(this.f4919i);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4918h.quit();
    }
}
