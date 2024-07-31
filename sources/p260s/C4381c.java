package p260s;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p014b.InterfaceC0434a;
import p014b.InterfaceC0435b;

/* renamed from: s.c */
/* loaded from: classes.dex */
public class C4381c {

    /* renamed from: a */
    public final InterfaceC0435b f16059a;

    /* renamed from: b */
    public final ComponentName f16060b;

    /* renamed from: c */
    public final Context f16061c;

    /* renamed from: s.c$a */
    /* loaded from: classes.dex */
    public class a extends InterfaceC0434a.a {

        /* renamed from: a */
        public Handler f16062a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        public final /* synthetic */ C4380b f16063b;

        /* renamed from: s.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC6206a implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ int f16065h;

            /* renamed from: i */
            public final /* synthetic */ Bundle f16066i;

            public RunnableC6206a(int i10, Bundle bundle) {
                this.f16065h = i10;
                this.f16066i = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f16063b.onNavigationEvent(this.f16065h, this.f16066i);
            }
        }

        /* renamed from: s.c$a$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ String f16068h;

            /* renamed from: i */
            public final /* synthetic */ Bundle f16069i;

            public b(String str, Bundle bundle) {
                this.f16068h = str;
                this.f16069i = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f16063b.extraCallback(this.f16068h, this.f16069i);
            }
        }

        /* renamed from: s.c$a$c */
        /* loaded from: classes.dex */
        public class c implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ Bundle f16071h;

            public c(Bundle bundle) {
                this.f16071h = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f16063b.onMessageChannelReady(this.f16071h);
            }
        }

        /* renamed from: s.c$a$d */
        /* loaded from: classes.dex */
        public class d implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ String f16073h;

            /* renamed from: i */
            public final /* synthetic */ Bundle f16074i;

            public d(String str, Bundle bundle) {
                this.f16073h = str;
                this.f16074i = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f16063b.onPostMessage(this.f16073h, this.f16074i);
            }
        }

        /* renamed from: s.c$a$e */
        /* loaded from: classes.dex */
        public class e implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ int f16076h;

            /* renamed from: i */
            public final /* synthetic */ Uri f16077i;

            /* renamed from: j */
            public final /* synthetic */ boolean f16078j;

            /* renamed from: k */
            public final /* synthetic */ Bundle f16079k;

            public e(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f16076h = i10;
                this.f16077i = uri;
                this.f16078j = z10;
                this.f16079k = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f16063b.onRelationshipValidationResult(this.f16076h, this.f16077i, this.f16078j, this.f16079k);
            }
        }

        /* renamed from: s.c$a$f */
        /* loaded from: classes.dex */
        public class f implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ int f16081h;

            /* renamed from: i */
            public final /* synthetic */ int f16082i;

            /* renamed from: j */
            public final /* synthetic */ Bundle f16083j;

            public f(int i10, int i11, Bundle bundle) {
                this.f16081h = i10;
                this.f16082i = i11;
                this.f16083j = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f16063b.onActivityResized(this.f16081h, this.f16082i, this.f16083j);
            }
        }

        public a(C4380b c4380b) {
            this.f16063b = c4380b;
        }

        @Override // p014b.InterfaceC0434a
        /* renamed from: B1 */
        public void mo2232B1(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.f16063b == null) {
                return;
            }
            this.f16062a.post(new e(i10, uri, z10, bundle));
        }

        @Override // p014b.InterfaceC0434a
        /* renamed from: D0 */
        public void mo2233D0(int i10, int i11, Bundle bundle) {
            if (this.f16063b == null) {
                return;
            }
            this.f16062a.post(new f(i10, i11, bundle));
        }

        @Override // p014b.InterfaceC0434a
        /* renamed from: R0 */
        public void mo2234R0(String str, Bundle bundle) {
            if (this.f16063b == null) {
                return;
            }
            this.f16062a.post(new b(str, bundle));
        }

        @Override // p014b.InterfaceC0434a
        /* renamed from: X */
        public Bundle mo2235X(String str, Bundle bundle) {
            C4380b c4380b = this.f16063b;
            if (c4380b == null) {
                return null;
            }
            return c4380b.extraCallbackWithResult(str, bundle);
        }

        @Override // p014b.InterfaceC0434a
        /* renamed from: c1 */
        public void mo2236c1(int i10, Bundle bundle) {
            if (this.f16063b == null) {
                return;
            }
            this.f16062a.post(new RunnableC6206a(i10, bundle));
        }

        @Override // p014b.InterfaceC0434a
        /* renamed from: r1 */
        public void mo2237r1(String str, Bundle bundle) {
            if (this.f16063b == null) {
                return;
            }
            this.f16062a.post(new d(str, bundle));
        }

        @Override // p014b.InterfaceC0434a
        /* renamed from: y1 */
        public void mo2238y1(Bundle bundle) {
            if (this.f16063b == null) {
                return;
            }
            this.f16062a.post(new c(bundle));
        }
    }

    public C4381c(InterfaceC0435b interfaceC0435b, ComponentName componentName, Context context) {
        this.f16059a = interfaceC0435b;
        this.f16060b = componentName;
        this.f16061c = context;
    }

    /* renamed from: a */
    public static boolean m16939a(Context context, String str, AbstractServiceConnectionC4383e abstractServiceConnectionC4383e) {
        abstractServiceConnectionC4383e.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC4383e, 33);
    }

    /* renamed from: c */
    public static String m16940c(Context context, List<String> list) {
        return m16941d(context, list, false);
    }

    /* renamed from: d */
    public static String m16941d(Context context, List<String> list, boolean z10) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    /* renamed from: b */
    public final InterfaceC0434a.a m16942b(C4380b c4380b) {
        return new a(c4380b);
    }

    /* renamed from: e */
    public C4384f m16943e(C4380b c4380b) {
        return m16944f(c4380b, null);
    }

    /* renamed from: f */
    public final C4384f m16944f(C4380b c4380b, PendingIntent pendingIntent) {
        boolean mo2246u0;
        InterfaceC0434a.a m16942b = m16942b(c4380b);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                mo2246u0 = this.f16059a.mo2243V0(m16942b, bundle);
            } else {
                mo2246u0 = this.f16059a.mo2246u0(m16942b);
            }
            if (mo2246u0) {
                return new C4384f(this.f16059a, m16942b, this.f16060b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public boolean m16945g(long j10) {
        try {
            return this.f16059a.mo2245k0(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
