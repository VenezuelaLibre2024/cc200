package p288u2;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;
import p303v2.C5103c;
import p303v2.EnumC5102b;
import p303v2.InterfaceC5101a;
import p316w2.C5201c;
import p316w2.C5209k;
import p316w2.C5211m;
import p316w2.C5215q;
import p316w2.C5216r;
import p316w2.EnumC5212n;
import p316w2.InterfaceC5213o;
import p316w2.InterfaceC5221w;
import p332x2.C5553b;
import p332x2.EnumC5552a;
import p332x2.InterfaceC5554c;
import p348y2.C5797a;

/* renamed from: u2.k */
/* loaded from: classes.dex */
public class C4801k implements MethodChannel.MethodCallHandler {

    /* renamed from: h */
    public final C5553b f17847h;

    /* renamed from: i */
    public final C5209k f17848i;

    /* renamed from: j */
    public final C5211m f17849j;

    /* renamed from: k */
    public final Map<String, InterfaceC5213o> f17850k = new HashMap();

    /* renamed from: l */
    public Context f17851l;

    /* renamed from: m */
    public Activity f17852m;

    /* renamed from: n */
    public MethodChannel f17853n;

    public C4801k(C5553b c5553b, C5209k c5209k, C5211m c5211m) {
        this.f17847h = c5553b;
        this.f17848i = c5209k;
        this.f17849j = c5211m;
    }

    /* renamed from: i */
    public static /* synthetic */ void m18830i(MethodChannel.Result result, EnumC5102b enumC5102b) {
        result.error(enumC5102b.toString(), enumC5102b.m20742c(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m18831j(boolean[] zArr, InterfaceC5213o interfaceC5213o, String str, MethodChannel.Result result, Location location) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f17848i.m21093f(interfaceC5213o);
        this.f17850k.remove(str);
        result.success(C5215q.m21102b(location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m18832k(boolean[] zArr, InterfaceC5213o interfaceC5213o, String str, MethodChannel.Result result, EnumC5102b enumC5102b) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f17848i.m21093f(interfaceC5213o);
        this.f17850k.remove(str);
        result.error(enumC5102b.toString(), enumC5102b.m20742c(), null);
    }

    /* renamed from: l */
    public static /* synthetic */ void m18833l(MethodChannel.Result result, Location location) {
        result.success(C5215q.m21102b(location));
    }

    /* renamed from: m */
    public static /* synthetic */ void m18834m(MethodChannel.Result result, EnumC5102b enumC5102b) {
        result.error(enumC5102b.toString(), enumC5102b.m20742c(), null);
    }

    /* renamed from: n */
    public static /* synthetic */ void m18835n(MethodChannel.Result result, EnumC5552a enumC5552a) {
        result.success(Integer.valueOf(enumC5552a.m22358c()));
    }

    /* renamed from: o */
    public static /* synthetic */ void m18836o(MethodChannel.Result result, EnumC5102b enumC5102b) {
        result.error(enumC5102b.toString(), enumC5102b.m20742c(), null);
    }

    /* renamed from: h */
    public final void m18837h(final MethodChannel.Result result, Context context) {
        EnumC5212n m21095a = this.f17849j.m21095a(context, new InterfaceC5101a() { // from class: u2.d
            @Override // p303v2.InterfaceC5101a
            /* renamed from: a */
            public final void mo18816a(EnumC5102b enumC5102b) {
                C4801k.m18830i(MethodChannel.Result.this, enumC5102b);
            }
        });
        if (m21095a != null) {
            result.success(Integer.valueOf(m21095a.ordinal()));
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        boolean m23261b;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1757019252:
                if (str.equals("getCurrentPosition")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1156770336:
                if (str.equals("getLastKnownPosition")) {
                    c10 = 1;
                    break;
                }
                break;
            case -821636766:
                if (str.equals("openLocationSettings")) {
                    c10 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c10 = 3;
                    break;
                }
                break;
            case 356040619:
                if (str.equals("isLocationServiceEnabled")) {
                    c10 = 4;
                    break;
                }
                break;
            case 686218487:
                if (str.equals("checkPermission")) {
                    c10 = 5;
                    break;
                }
                break;
            case 746581438:
                if (str.equals("requestPermission")) {
                    c10 = 6;
                    break;
                }
                break;
            case 877043524:
                if (str.equals("getLocationAccuracy")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1774650278:
                if (str.equals("cancelGetCurrentPosition")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                m18840r(methodCall, result);
                return;
            case 1:
                m18841s(methodCall, result);
                return;
            case 2:
                m23261b = C5797a.m23261b(this.f17851l);
                break;
            case 3:
                m23261b = C5797a.m23260a(this.f17851l);
                break;
            case 4:
                m18842t(result);
                return;
            case 5:
                m18839q(result);
                return;
            case 6:
                m18843u(result);
                return;
            case 7:
                m18837h(result, this.f17851l);
                return;
            case '\b':
                m18838p(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
        result.success(Boolean.valueOf(m23261b));
    }

    /* renamed from: p */
    public final void m18838p(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) ((Map) methodCall.arguments).get("requestId");
        InterfaceC5213o interfaceC5213o = this.f17850k.get(str);
        if (interfaceC5213o != null) {
            interfaceC5213o.mo21085f();
        }
        this.f17850k.remove(str);
        result.success(null);
    }

    /* renamed from: q */
    public final void m18839q(MethodChannel.Result result) {
        try {
            result.success(Integer.valueOf(this.f17847h.m22361a(this.f17851l).m22358c()));
        } catch (C5103c unused) {
            EnumC5102b enumC5102b = EnumC5102b.permissionDefinitionsNotFound;
            result.error(enumC5102b.toString(), enumC5102b.m20742c(), null);
        }
    }

    /* renamed from: r */
    public final void m18840r(MethodCall methodCall, final MethodChannel.Result result) {
        try {
            if (!this.f17847h.m22363d(this.f17851l)) {
                EnumC5102b enumC5102b = EnumC5102b.permissionDenied;
                result.error(enumC5102b.toString(), enumC5102b.m20742c(), null);
                return;
            }
            Map map = (Map) methodCall.arguments;
            boolean booleanValue = map.get("forceLocationManager") != null ? ((Boolean) map.get("forceLocationManager")).booleanValue() : false;
            C5216r m21103e = C5216r.m21103e(map);
            final String str = (String) map.get("requestId");
            final boolean[] zArr = {false};
            final InterfaceC5213o m21088a = this.f17848i.m21088a(this.f17851l, booleanValue, m21103e);
            this.f17850k.put(str, m21088a);
            this.f17848i.m21092e(m21088a, this.f17852m, new InterfaceC5221w() { // from class: u2.i
                @Override // p316w2.InterfaceC5221w
                /* renamed from: a */
                public final void mo18817a(Location location) {
                    C4801k.this.m18831j(zArr, m21088a, str, result, location);
                }
            }, new InterfaceC5101a() { // from class: u2.g
                @Override // p303v2.InterfaceC5101a
                /* renamed from: a */
                public final void mo18816a(EnumC5102b enumC5102b2) {
                    C4801k.this.m18832k(zArr, m21088a, str, result, enumC5102b2);
                }
            });
        } catch (C5103c unused) {
            EnumC5102b enumC5102b2 = EnumC5102b.permissionDefinitionsNotFound;
            result.error(enumC5102b2.toString(), enumC5102b2.m20742c(), null);
        }
    }

    /* renamed from: s */
    public final void m18841s(MethodCall methodCall, final MethodChannel.Result result) {
        try {
            if (this.f17847h.m22363d(this.f17851l)) {
                Boolean bool = (Boolean) methodCall.argument("forceLocationManager");
                this.f17848i.m21089b(this.f17851l, bool != null && bool.booleanValue(), new InterfaceC5221w() { // from class: u2.h
                    @Override // p316w2.InterfaceC5221w
                    /* renamed from: a */
                    public final void mo18817a(Location location) {
                        C4801k.m18833l(MethodChannel.Result.this, location);
                    }
                }, new InterfaceC5101a() { // from class: u2.f
                    @Override // p303v2.InterfaceC5101a
                    /* renamed from: a */
                    public final void mo18816a(EnumC5102b enumC5102b) {
                        C4801k.m18834m(MethodChannel.Result.this, enumC5102b);
                    }
                });
            } else {
                EnumC5102b enumC5102b = EnumC5102b.permissionDenied;
                result.error(enumC5102b.toString(), enumC5102b.m20742c(), null);
            }
        } catch (C5103c unused) {
            EnumC5102b enumC5102b2 = EnumC5102b.permissionDefinitionsNotFound;
            result.error(enumC5102b2.toString(), enumC5102b2.m20742c(), null);
        }
    }

    /* renamed from: t */
    public final void m18842t(MethodChannel.Result result) {
        this.f17848i.m21091d(this.f17851l, new C5201c(result));
    }

    /* renamed from: u */
    public final void m18843u(final MethodChannel.Result result) {
        try {
            this.f17847h.m22364f(this.f17852m, new InterfaceC5554c() { // from class: u2.j
                @Override // p332x2.InterfaceC5554c
                /* renamed from: a */
                public final void mo18822a(EnumC5552a enumC5552a) {
                    C4801k.m18835n(MethodChannel.Result.this, enumC5552a);
                }
            }, new InterfaceC5101a() { // from class: u2.e
                @Override // p303v2.InterfaceC5101a
                /* renamed from: a */
                public final void mo18816a(EnumC5102b enumC5102b) {
                    C4801k.m18836o(MethodChannel.Result.this, enumC5102b);
                }
            });
        } catch (C5103c unused) {
            EnumC5102b enumC5102b = EnumC5102b.permissionDefinitionsNotFound;
            result.error(enumC5102b.toString(), enumC5102b.m20742c(), null);
        }
    }

    /* renamed from: v */
    public void m18844v(Activity activity) {
        this.f17852m = activity;
    }

    /* renamed from: w */
    public void m18845w(Context context, BinaryMessenger binaryMessenger) {
        if (this.f17853n != null) {
            Log.w("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            m18846x();
        }
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter.baseflow.com/geolocator_android");
        this.f17853n = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f17851l = context;
    }

    /* renamed from: x */
    public void m18846x() {
        MethodChannel methodChannel = this.f17853n;
        if (methodChannel == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            methodChannel.setMethodCallHandler(null);
            this.f17853n = null;
        }
    }
}
