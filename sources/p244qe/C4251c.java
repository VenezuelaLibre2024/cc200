package p244qe;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import gd.C2236j;
import gd.C2240n;
import gd.C2245s;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p113hb.C2457b;
import p113hb.C2468m;
import p113hb.InterfaceC2456a;
import p115hd.C2488e0;
import p115hd.C2497j;
import p115hd.C2502n;
import p115hd.C2503o;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p130ib.C2694i;
import p345y.C5782a;
import sd.InterfaceC4569a;
import td.AbstractC4754n;
import td.C4747g;
import td.C4753m;

/* renamed from: qe.c */
/* loaded from: classes2.dex */
public final class C4251c implements PlatformView, MethodChannel.MethodCallHandler, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: q */
    public static final c f15368q = new c(null);

    /* renamed from: h */
    public final Context f15369h;

    /* renamed from: i */
    public final int f15370i;

    /* renamed from: j */
    public final HashMap<String, Object> f15371j;

    /* renamed from: k */
    public boolean f15372k;

    /* renamed from: l */
    public boolean f15373l;

    /* renamed from: m */
    public C4249a f15374m;

    /* renamed from: n */
    public final MethodChannel f15375n;

    /* renamed from: o */
    public C4255g f15376o;

    /* renamed from: p */
    public final int f15377p;

    /* renamed from: qe.c$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4569a<C2245s> {
        public a() {
            super(0);
        }

        /* renamed from: a */
        public final void m16330a() {
            C4249a c4249a;
            if (C4251c.this.f15373l || !C4251c.this.m16317n() || (c4249a = C4251c.this.f15374m) == null) {
                return;
            }
            c4249a.mo5868u();
        }

        @Override // sd.InterfaceC4569a
        public /* bridge */ /* synthetic */ C2245s invoke() {
            m16330a();
            return C2245s.f8873a;
        }
    }

    /* renamed from: qe.c$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC4754n implements InterfaceC4569a<C2245s> {
        public b() {
            super(0);
        }

        /* renamed from: a */
        public final void m16331a() {
            C4249a c4249a;
            if (!C4251c.this.m16317n()) {
                C4251c.this.m16311h();
            } else {
                if (C4251c.this.f15373l || !C4251c.this.m16317n() || (c4249a = C4251c.this.f15374m) == null) {
                    return;
                }
                c4249a.m5918y();
            }
        }

        @Override // sd.InterfaceC4569a
        public /* bridge */ /* synthetic */ C2245s invoke() {
            m16331a();
            return C2245s.f8873a;
        }
    }

    /* renamed from: qe.c$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: qe.c$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC2456a {

        /* renamed from: a */
        public final /* synthetic */ List<EnumC2669a> f15380a;

        /* renamed from: b */
        public final /* synthetic */ C4251c f15381b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends EnumC2669a> list, C4251c c4251c) {
            this.f15380a = list;
            this.f15381b = c4251c;
        }

        @Override // p113hb.InterfaceC2456a
        /* renamed from: a */
        public void mo5883a(List<? extends C2684p> list) {
            C4753m.m18653f(list, "resultPoints");
        }

        @Override // p113hb.InterfaceC2456a
        /* renamed from: b */
        public void mo5884b(C2457b c2457b) {
            C4753m.m18653f(c2457b, "result");
            if (this.f15380a.isEmpty() || this.f15380a.contains(c2457b.m9823a())) {
                this.f15381b.f15375n.invokeMethod("onRecognizeQR", C2488e0.m9897e(C2240n.m8977a("code", c2457b.m9827e()), C2240n.m8977a(ImagePickerCache.MAP_KEY_TYPE, c2457b.m9823a().name()), C2240n.m8977a("rawBytes", c2457b.m9825c())));
            }
        }
    }

    public C4251c(Context context, BinaryMessenger binaryMessenger, int i10, HashMap<String, Object> hashMap) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(binaryMessenger, "messenger");
        C4753m.m18653f(hashMap, "params");
        this.f15369h = context;
        this.f15370i = i10;
        this.f15371j = hashMap;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "net.touchcapture.qr.flutterqr/qrview_" + i10);
        this.f15375n = methodChannel;
        this.f15377p = i10 + 513469796;
        C4254f c4254f = C4254f.f15386a;
        ActivityPluginBinding m16334b = c4254f.m16334b();
        if (m16334b != null) {
            m16334b.addRequestPermissionsResultListener(this);
        }
        methodChannel.setMethodCallHandler(this);
        Activity m16333a = c4254f.m16333a();
        this.f15376o = m16333a != null ? C4253e.m16332a(m16333a, new a(), new b()) : null;
    }

    /* renamed from: A */
    public final void m16308A(MethodChannel.Result result) {
        C4249a c4249a = this.f15374m;
        if (c4249a == null) {
            m16309f(result);
            return;
        }
        if (!m16320q()) {
            result.error("404", "This device doesn't support flash", null);
            return;
        }
        c4249a.setTorch(!this.f15372k);
        boolean z10 = !this.f15372k;
        this.f15372k = z10;
        result.success(Boolean.valueOf(z10));
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        C4255g c4255g = this.f15376o;
        if (c4255g != null) {
            c4255g.m16337a();
        }
        ActivityPluginBinding m16334b = C4254f.f15386a.m16334b();
        if (m16334b != null) {
            m16334b.removeRequestPermissionsResultListener(this);
        }
        C4249a c4249a = this.f15374m;
        if (c4249a != null) {
            c4249a.mo5868u();
        }
        this.f15374m = null;
    }

    /* renamed from: f */
    public final void m16309f(MethodChannel.Result result) {
        result.error("404", "No barcode view found", null);
    }

    /* renamed from: g */
    public final void m16310g(double d10, double d11, double d12, MethodChannel.Result result) {
        m16327x(d10, d11, d12);
        result.success(Boolean.TRUE);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return m16323t();
    }

    /* renamed from: h */
    public final void m16311h() {
        Activity m16333a;
        if (m16317n()) {
            this.f15375n.invokeMethod("onPermissionSet", Boolean.TRUE);
        } else {
            if (Build.VERSION.SDK_INT < 23 || (m16333a = C4254f.f15386a.m16333a()) == null) {
                return;
            }
            m16333a.requestPermissions(new String[]{"android.permission.CAMERA"}, this.f15377p);
        }
    }

    /* renamed from: i */
    public final int m16312i(double d10) {
        return (int) (d10 * this.f15369h.getResources().getDisplayMetrics().density);
    }

    /* renamed from: j */
    public final void m16313j(MethodChannel.Result result) {
        C4249a c4249a = this.f15374m;
        if (c4249a == null) {
            m16309f(result);
            return;
        }
        c4249a.mo5868u();
        C2694i cameraSettings = c4249a.getCameraSettings();
        if (cameraSettings.m10990b() == 1) {
            cameraSettings.m10997i(0);
        } else {
            cameraSettings.m10997i(1);
        }
        c4249a.m5918y();
        result.success(Integer.valueOf(cameraSettings.m10990b()));
    }

    /* renamed from: k */
    public final List<EnumC2669a> m16314k(List<Integer> list, MethodChannel.Result result) {
        List<EnumC2669a> arrayList;
        if (list != null) {
            try {
                arrayList = new ArrayList<>(C2503o.m9995k(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(EnumC2669a.values()[((Number) it.next()).intValue()]);
                }
            } catch (Exception e10) {
                result.error("", e10.getMessage(), null);
                return C2502n.m9989e();
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = C2502n.m9989e();
        }
        return arrayList;
    }

    /* renamed from: l */
    public final void m16315l(MethodChannel.Result result) {
        C4249a c4249a = this.f15374m;
        if (c4249a == null) {
            m16309f(result);
        } else {
            result.success(Integer.valueOf(c4249a.getCameraSettings().m10990b()));
        }
    }

    /* renamed from: m */
    public final void m16316m(MethodChannel.Result result) {
        if (this.f15374m == null) {
            m16309f(result);
        } else {
            result.success(Boolean.valueOf(this.f15372k));
        }
    }

    /* renamed from: n */
    public final boolean m16317n() {
        return Build.VERSION.SDK_INT < 23 || C5782a.checkSelfPermission(this.f15369h, "android.permission.CAMERA") == 0;
    }

    /* renamed from: o */
    public final void m16318o(MethodChannel.Result result) {
        C2694i cameraSettings;
        try {
            C2236j[] c2236jArr = new C2236j[4];
            c2236jArr[0] = C2240n.m8977a("hasFrontCamera", Boolean.valueOf(m16321r()));
            c2236jArr[1] = C2240n.m8977a("hasBackCamera", Boolean.valueOf(m16319p()));
            c2236jArr[2] = C2240n.m8977a("hasFlash", Boolean.valueOf(m16320q()));
            C4249a c4249a = this.f15374m;
            c2236jArr[3] = C2240n.m8977a("activeCamera", (c4249a == null || (cameraSettings = c4249a.getCameraSettings()) == null) ? null : Integer.valueOf(cameraSettings.m10990b()));
            result.success(C2488e0.m9897e(c2236jArr));
        } catch (Exception e10) {
            result.error("", e10.getMessage(), null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0118, code lost:
    
        if (r0.equals("stopCamera") == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r0.equals("pauseCamera") == false) goto L168;
     */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r11, io.flutter.plugin.common.MethodChannel.Result r12) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p244qe.C4251c.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        C4753m.m18653f(strArr, "permissions");
        C4753m.m18653f(iArr, "grantResults");
        boolean z10 = false;
        if (i10 != this.f15377p) {
            return false;
        }
        Integer m9967l = C2497j.m9967l(iArr);
        if (m9967l != null && m9967l.intValue() == 0) {
            z10 = true;
        }
        this.f15375n.invokeMethod("onPermissionSet", Boolean.valueOf(z10));
        return z10;
    }

    @SuppressLint({"UnsupportedChromeOsCameraSystemFeature"})
    /* renamed from: p */
    public final boolean m16319p() {
        return m16322s("android.hardware.camera");
    }

    /* renamed from: q */
    public final boolean m16320q() {
        return m16322s("android.hardware.camera.flash");
    }

    /* renamed from: r */
    public final boolean m16321r() {
        return m16322s("android.hardware.camera.front");
    }

    /* renamed from: s */
    public final boolean m16322s(String str) {
        return this.f15369h.getPackageManager().hasSystemFeature(str);
    }

    /* renamed from: t */
    public final C4249a m16323t() {
        C2694i cameraSettings;
        C4249a c4249a = this.f15374m;
        if (c4249a == null) {
            c4249a = new C4249a(C4254f.f15386a.m16333a());
            this.f15374m = c4249a;
            c4249a.setDecoderFactory(new C2468m(null, null, null, 2));
            Object obj = this.f15371j.get("cameraFacing");
            C4753m.m18651d(obj, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) obj).intValue() == 1 && (cameraSettings = c4249a.getCameraSettings()) != null) {
                cameraSettings.m10997i(1);
            }
        } else if (!this.f15373l) {
            c4249a.m5918y();
        }
        return c4249a;
    }

    /* renamed from: u */
    public final void m16324u(MethodChannel.Result result) {
        C4249a c4249a = this.f15374m;
        if (c4249a == null) {
            m16309f(result);
            return;
        }
        if (c4249a.m5915t()) {
            this.f15373l = true;
            c4249a.mo5868u();
        }
        result.success(Boolean.TRUE);
    }

    /* renamed from: v */
    public final void m16325v(MethodChannel.Result result) {
        C4249a c4249a = this.f15374m;
        if (c4249a == null) {
            m16309f(result);
            return;
        }
        if (!c4249a.m5915t()) {
            this.f15373l = false;
            c4249a.m5918y();
        }
        result.success(Boolean.TRUE);
    }

    /* renamed from: w */
    public final void m16326w(boolean z10) {
        C4249a c4249a = this.f15374m;
        if (c4249a == null) {
            return;
        }
        c4249a.mo5868u();
        c4249a.getCameraSettings().m10998j(z10);
        c4249a.m5918y();
    }

    /* renamed from: x */
    public final void m16327x(double d10, double d11, double d12) {
        C4249a c4249a = this.f15374m;
        if (c4249a != null) {
            c4249a.m16302O(m16312i(d10), m16312i(d11), m16312i(d12));
        }
    }

    /* renamed from: y */
    public final void m16328y(List<Integer> list, MethodChannel.Result result) {
        m16311h();
        List<EnumC2669a> m16314k = m16314k(list, result);
        C4249a c4249a = this.f15374m;
        if (c4249a != null) {
            c4249a.m5862I(new d(m16314k, this));
        }
    }

    /* renamed from: z */
    public final void m16329z() {
        C4249a c4249a = this.f15374m;
        if (c4249a != null) {
            c4249a.m5867N();
        }
    }
}
