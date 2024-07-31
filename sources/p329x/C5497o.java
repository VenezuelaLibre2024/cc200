package p329x;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p026c.InterfaceC0578a;

/* renamed from: x.o */
/* loaded from: classes.dex */
public final class C5497o {

    /* renamed from: d */
    public static String f20546d;

    /* renamed from: g */
    public static f f20549g;

    /* renamed from: a */
    public final Context f20550a;

    /* renamed from: b */
    public final NotificationManager f20551b;

    /* renamed from: c */
    public static final Object f20545c = new Object();

    /* renamed from: e */
    public static Set<String> f20547e = new HashSet();

    /* renamed from: f */
    public static final Object f20548f = new Object();

    /* renamed from: x.o$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static boolean m22079a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        /* renamed from: b */
        public static int m22080b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* renamed from: x.o$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static void m22081a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        /* renamed from: b */
        public static void m22082b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        /* renamed from: c */
        public static void m22083c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        /* renamed from: d */
        public static void m22084d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        /* renamed from: e */
        public static void m22085e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        /* renamed from: f */
        public static void m22086f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        /* renamed from: g */
        public static String m22087g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        /* renamed from: h */
        public static String m22088h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        /* renamed from: i */
        public static NotificationChannel m22089i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        /* renamed from: j */
        public static List<NotificationChannelGroup> m22090j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        /* renamed from: k */
        public static List<NotificationChannel> m22091k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* renamed from: x.o$c */
    /* loaded from: classes.dex */
    public static class c implements g {

        /* renamed from: a */
        public final String f20552a;

        /* renamed from: b */
        public final int f20553b;

        /* renamed from: c */
        public final String f20554c;

        /* renamed from: d */
        public final boolean f20555d;

        public c(String str) {
            this.f20552a = str;
            this.f20553b = 0;
            this.f20554c = null;
            this.f20555d = true;
        }

        public c(String str, int i10, String str2) {
            this.f20552a = str;
            this.f20553b = i10;
            this.f20554c = str2;
            this.f20555d = false;
        }

        @Override // p329x.C5497o.g
        /* renamed from: a */
        public void mo22092a(InterfaceC0578a interfaceC0578a) {
            if (this.f20555d) {
                interfaceC0578a.mo2929P(this.f20552a);
            } else {
                interfaceC0578a.mo2928J0(this.f20552a, this.f20553b, this.f20554c);
            }
        }

        public String toString() {
            return "CancelTask[packageName:" + this.f20552a + ", id:" + this.f20553b + ", tag:" + this.f20554c + ", all:" + this.f20555d + "]";
        }
    }

    /* renamed from: x.o$d */
    /* loaded from: classes.dex */
    public static class d implements g {

        /* renamed from: a */
        public final String f20556a;

        /* renamed from: b */
        public final int f20557b;

        /* renamed from: c */
        public final String f20558c;

        /* renamed from: d */
        public final Notification f20559d;

        public d(String str, int i10, String str2, Notification notification) {
            this.f20556a = str;
            this.f20557b = i10;
            this.f20558c = str2;
            this.f20559d = notification;
        }

        @Override // p329x.C5497o.g
        /* renamed from: a */
        public void mo22092a(InterfaceC0578a interfaceC0578a) {
            interfaceC0578a.mo2930z1(this.f20556a, this.f20557b, this.f20558c, this.f20559d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f20556a + ", id:" + this.f20557b + ", tag:" + this.f20558c + "]";
        }
    }

    /* renamed from: x.o$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public final ComponentName f20560a;

        /* renamed from: b */
        public final IBinder f20561b;

        public e(ComponentName componentName, IBinder iBinder) {
            this.f20560a = componentName;
            this.f20561b = iBinder;
        }
    }

    /* renamed from: x.o$f */
    /* loaded from: classes.dex */
    public static class f implements Handler.Callback, ServiceConnection {

        /* renamed from: h */
        public final Context f20562h;

        /* renamed from: i */
        public final HandlerThread f20563i;

        /* renamed from: j */
        public final Handler f20564j;

        /* renamed from: k */
        public final Map<ComponentName, a> f20565k = new HashMap();

        /* renamed from: l */
        public Set<String> f20566l = new HashSet();

        /* renamed from: x.o$f$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public final ComponentName f20567a;

            /* renamed from: c */
            public InterfaceC0578a f20569c;

            /* renamed from: b */
            public boolean f20568b = false;

            /* renamed from: d */
            public ArrayDeque<g> f20570d = new ArrayDeque<>();

            /* renamed from: e */
            public int f20571e = 0;

            public a(ComponentName componentName) {
                this.f20567a = componentName;
            }
        }

        public f(Context context) {
            this.f20562h = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f20563i = handlerThread;
            handlerThread.start();
            this.f20564j = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        public final boolean m22093a(a aVar) {
            if (aVar.f20568b) {
                return true;
            }
            boolean bindService = this.f20562h.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f20567a), this, 33);
            aVar.f20568b = bindService;
            if (bindService) {
                aVar.f20571e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f20567a);
                this.f20562h.unbindService(this);
            }
            return aVar.f20568b;
        }

        /* renamed from: b */
        public final void m22094b(a aVar) {
            if (aVar.f20568b) {
                this.f20562h.unbindService(this);
                aVar.f20568b = false;
            }
            aVar.f20569c = null;
        }

        /* renamed from: c */
        public final void m22095c(g gVar) {
            m22102j();
            for (a aVar : this.f20565k.values()) {
                aVar.f20570d.add(gVar);
                m22099g(aVar);
            }
        }

        /* renamed from: d */
        public final void m22096d(ComponentName componentName) {
            a aVar = this.f20565k.get(componentName);
            if (aVar != null) {
                m22099g(aVar);
            }
        }

        /* renamed from: e */
        public final void m22097e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f20565k.get(componentName);
            if (aVar != null) {
                aVar.f20569c = InterfaceC0578a.a.m2931c(iBinder);
                aVar.f20571e = 0;
                m22099g(aVar);
            }
        }

        /* renamed from: f */
        public final void m22098f(ComponentName componentName) {
            a aVar = this.f20565k.get(componentName);
            if (aVar != null) {
                m22094b(aVar);
            }
        }

        /* renamed from: g */
        public final void m22099g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f20567a + ", " + aVar.f20570d.size() + " queued tasks");
            }
            if (aVar.f20570d.isEmpty()) {
                return;
            }
            if (!m22093a(aVar) || aVar.f20569c == null) {
                m22101i(aVar);
                return;
            }
            while (true) {
                g peek = aVar.f20570d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + peek);
                    }
                    peek.mo22092a(aVar.f20569c);
                    aVar.f20570d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f20567a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f20567a, e10);
                }
            }
            if (aVar.f20570d.isEmpty()) {
                return;
            }
            m22101i(aVar);
        }

        /* renamed from: h */
        public void m22100h(g gVar) {
            this.f20564j.obtainMessage(0, gVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                m22095c((g) message.obj);
                return true;
            }
            if (i10 == 1) {
                e eVar = (e) message.obj;
                m22097e(eVar.f20560a, eVar.f20561b);
                return true;
            }
            if (i10 == 2) {
                m22098f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            m22096d((ComponentName) message.obj);
            return true;
        }

        /* renamed from: i */
        public final void m22101i(a aVar) {
            if (this.f20564j.hasMessages(3, aVar.f20567a)) {
                return;
            }
            int i10 = aVar.f20571e + 1;
            aVar.f20571e = i10;
            if (i10 <= 6) {
                int i11 = (1 << (i10 - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
                }
                this.f20564j.sendMessageDelayed(this.f20564j.obtainMessage(3, aVar.f20567a), i11);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f20570d.size() + " tasks to " + aVar.f20567a + " after " + aVar.f20571e + " retries");
            aVar.f20570d.clear();
        }

        /* renamed from: j */
        public final void m22102j() {
            Set<String> m22068g = C5497o.m22068g(this.f20562h);
            if (m22068g.equals(this.f20566l)) {
                return;
            }
            this.f20566l = m22068g;
            List<ResolveInfo> queryIntentServices = this.f20562h.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (m22068g.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f20565k.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f20565k.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f20565k.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    m22094b(next.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f20564j.obtainMessage(1, new e(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f20564j.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: x.o$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        void mo22092a(InterfaceC0578a interfaceC0578a);
    }

    public C5497o(Context context) {
        this.f20550a = context;
        this.f20551b = (NotificationManager) context.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
    }

    /* renamed from: f */
    public static C5497o m22067f(Context context) {
        return new C5497o(context);
    }

    /* renamed from: g */
    public static Set<String> m22068g(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f20545c) {
            if (string != null) {
                if (!string.equals(f20546d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f20547e = hashSet;
                    f20546d = string;
                }
            }
            set = f20547e;
        }
        return set;
    }

    /* renamed from: l */
    public static boolean m22069l(Notification notification) {
        Bundle m21812a = C5494l.m21812a(notification);
        return m21812a != null && m21812a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    public boolean m22070a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return a.m22079a(this.f20551b);
        }
        if (i10 < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f20550a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f20550a.getApplicationInfo();
        String packageName = this.f20550a.getApplicationContext().getPackageName();
        int i11 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i11), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public void m22071b(int i10) {
        m22072c(null, i10);
    }

    /* renamed from: c */
    public void m22072c(String str, int i10) {
        this.f20551b.cancel(str, i10);
        if (Build.VERSION.SDK_INT <= 19) {
            m22078k(new c(this.f20550a.getPackageName(), i10, str));
        }
    }

    /* renamed from: d */
    public void m22073d() {
        this.f20551b.cancelAll();
        if (Build.VERSION.SDK_INT <= 19) {
            m22078k(new c(this.f20550a.getPackageName()));
        }
    }

    /* renamed from: e */
    public void m22074e(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.m22081a(this.f20551b, notificationChannel);
        }
    }

    /* renamed from: h */
    public List<NotificationChannel> m22075h() {
        return Build.VERSION.SDK_INT >= 26 ? b.m22091k(this.f20551b) : Collections.emptyList();
    }

    /* renamed from: i */
    public void m22076i(int i10, Notification notification) {
        m22077j(null, i10, notification);
    }

    /* renamed from: j */
    public void m22077j(String str, int i10, Notification notification) {
        if (!m22069l(notification)) {
            this.f20551b.notify(str, i10, notification);
        } else {
            m22078k(new d(this.f20550a.getPackageName(), i10, str, notification));
            this.f20551b.cancel(str, i10);
        }
    }

    /* renamed from: k */
    public final void m22078k(g gVar) {
        synchronized (f20548f) {
            if (f20549g == null) {
                f20549g = new f(this.f20550a.getApplicationContext());
            }
            f20549g.m22100h(gVar);
        }
    }
}
