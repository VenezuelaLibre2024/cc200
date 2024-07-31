package com.baseflow.geolocator;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.baseflow.geolocator.GeolocatorLocationService;
import io.flutter.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.PluginRegistry;
import p288u2.C4793c;
import p288u2.C4801k;
import p288u2.C4804n;
import p316w2.C5209k;
import p316w2.C5211m;
import p332x2.C5553b;

/* renamed from: com.baseflow.geolocator.a */
/* loaded from: classes.dex */
public class C1133a implements FlutterPlugin, ActivityAware {

    /* renamed from: k */
    public GeolocatorLocationService f4146k;

    /* renamed from: l */
    public C4801k f4147l;

    /* renamed from: m */
    public C4804n f4148m;

    /* renamed from: o */
    public C4793c f4150o;

    /* renamed from: p */
    public PluginRegistry.Registrar f4151p;

    /* renamed from: q */
    public ActivityPluginBinding f4152q;

    /* renamed from: n */
    public final ServiceConnection f4149n = new a();

    /* renamed from: h */
    public final C5553b f4143h = new C5553b();

    /* renamed from: i */
    public final C5209k f4144i = new C5209k();

    /* renamed from: j */
    public final C5211m f4145j = new C5211m();

    /* renamed from: com.baseflow.geolocator.a$a */
    /* loaded from: classes.dex */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.m11039d("FlutterGeolocator", "Geolocator foreground service connected");
            if (iBinder instanceof GeolocatorLocationService.BinderC1132a) {
                C1133a.this.m4693g(((GeolocatorLocationService.BinderC1132a) iBinder).m4686a());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.m11039d("FlutterGeolocator", "Geolocator foreground service disconnected");
            if (C1133a.this.f4146k != null) {
                C1133a.this.f4146k.m4683m(null);
                C1133a.this.f4146k = null;
            }
        }
    }

    /* renamed from: d */
    public final void m4690d(Context context) {
        context.bindService(new Intent(context, (Class<?>) GeolocatorLocationService.class), this.f4149n, 1);
    }

    /* renamed from: e */
    public final void m4691e() {
        ActivityPluginBinding activityPluginBinding = this.f4152q;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f4144i);
            this.f4152q.removeRequestPermissionsResultListener(this.f4143h);
        }
    }

    /* renamed from: f */
    public final void m4692f() {
        Log.m11039d("FlutterGeolocator", "Disposing Geolocator services");
        C4801k c4801k = this.f4147l;
        if (c4801k != null) {
            c4801k.m18846x();
            this.f4147l.m18844v(null);
            this.f4147l = null;
        }
        C4804n c4804n = this.f4148m;
        if (c4804n != null) {
            c4804n.m18855i();
            this.f4148m.m18853g(null);
            this.f4148m = null;
        }
        C4793c c4793c = this.f4150o;
        if (c4793c != null) {
            c4793c.m18819b(null);
            this.f4150o.m18821d();
            this.f4150o = null;
        }
        GeolocatorLocationService geolocatorLocationService = this.f4146k;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m4683m(null);
        }
    }

    /* renamed from: g */
    public final void m4693g(GeolocatorLocationService geolocatorLocationService) {
        Log.m11039d("FlutterGeolocator", "Initializing Geolocator services");
        this.f4146k = geolocatorLocationService;
        geolocatorLocationService.m4679g();
        C4804n c4804n = this.f4148m;
        if (c4804n != null) {
            c4804n.m18853g(geolocatorLocationService);
        }
    }

    /* renamed from: h */
    public final void m4694h() {
        PluginRegistry.Registrar registrar = this.f4151p;
        if (registrar != null) {
            registrar.addActivityResultListener(this.f4144i);
            this.f4151p.addRequestPermissionsResultListener(this.f4143h);
            return;
        }
        ActivityPluginBinding activityPluginBinding = this.f4152q;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this.f4144i);
            this.f4152q.addRequestPermissionsResultListener(this.f4143h);
        }
    }

    /* renamed from: i */
    public final void m4695i(Context context) {
        GeolocatorLocationService geolocatorLocationService = this.f4146k;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m4680h();
        }
        context.unbindService(this.f4149n);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Log.m11039d("FlutterGeolocator", "Attaching Geolocator to activity");
        this.f4152q = activityPluginBinding;
        m4694h();
        C4801k c4801k = this.f4147l;
        if (c4801k != null) {
            c4801k.m18844v(activityPluginBinding.getActivity());
        }
        C4804n c4804n = this.f4148m;
        if (c4804n != null) {
            c4804n.m18852f(activityPluginBinding.getActivity());
        }
        GeolocatorLocationService geolocatorLocationService = this.f4146k;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m4683m(this.f4152q.getActivity());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4801k c4801k = new C4801k(this.f4143h, this.f4144i, this.f4145j);
        this.f4147l = c4801k;
        c4801k.m18845w(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
        C4804n c4804n = new C4804n(this.f4143h);
        this.f4148m = c4804n;
        c4804n.m18854h(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
        C4793c c4793c = new C4793c();
        this.f4150o = c4793c;
        c4793c.m18819b(flutterPluginBinding.getApplicationContext());
        this.f4150o.m18820c(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
        m4690d(flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        Log.m11039d("FlutterGeolocator", "Detaching Geolocator from activity");
        m4691e();
        C4801k c4801k = this.f4147l;
        if (c4801k != null) {
            c4801k.m18844v(null);
        }
        C4804n c4804n = this.f4148m;
        if (c4804n != null) {
            c4804n.m18852f(null);
        }
        GeolocatorLocationService geolocatorLocationService = this.f4146k;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m4683m(null);
        }
        if (this.f4152q != null) {
            this.f4152q = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m4695i(flutterPluginBinding.getApplicationContext());
        m4692f();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
