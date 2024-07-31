package p117hf;

import ae.C0108n;
import android.content.Context;
import android.os.Handler;
import gd.C2240n;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.C1506d;
import p115hd.C2488e0;
import td.C4747g;
import td.C4753m;

/* renamed from: hf.a */
/* loaded from: classes2.dex */
public final class C2563a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: n */
    public static final a f10035n = new a(null);

    /* renamed from: h */
    public MethodChannel f10036h;

    /* renamed from: i */
    public Context f10037i;

    /* renamed from: j */
    public final Map<String, AbstractC2565c> f10038j = new LinkedHashMap();

    /* renamed from: k */
    public final Handler f10039k = new Handler();

    /* renamed from: l */
    public Runnable f10040l;

    /* renamed from: m */
    public boolean f10041m;

    /* renamed from: hf.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: c */
        public final Map<String, Object> m10230c(String str, Object obj) {
            return C2488e0.m9897e(C2240n.m8977a("playerId", str), C2240n.m8977a("value", obj));
        }

        /* renamed from: d */
        public final Exception m10231d(String str) {
            return new IllegalArgumentException(str);
        }
    }

    /* renamed from: hf.a$b */
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {

        /* renamed from: h */
        public final WeakReference<Map<String, AbstractC2565c>> f10042h;

        /* renamed from: i */
        public final WeakReference<MethodChannel> f10043i;

        /* renamed from: j */
        public final WeakReference<Handler> f10044j;

        /* renamed from: k */
        public final WeakReference<C2563a> f10045k;

        public b(Map<String, ? extends AbstractC2565c> map, MethodChannel methodChannel, Handler handler, C2563a c2563a) {
            C4753m.m18653f(map, "mediaPlayers");
            C4753m.m18653f(methodChannel, "channel");
            C4753m.m18653f(handler, "handler");
            C4753m.m18653f(c2563a, "audioplayersPlugin");
            this.f10042h = new WeakReference<>(map);
            this.f10043i = new WeakReference<>(methodChannel);
            this.f10044j = new WeakReference<>(handler);
            this.f10045k = new WeakReference<>(c2563a);
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, AbstractC2565c> map = this.f10042h.get();
            MethodChannel methodChannel = this.f10043i.get();
            Handler handler = this.f10044j.get();
            C2563a c2563a = this.f10045k.get();
            if (map == null || methodChannel == null || handler == null || c2563a == null) {
                if (c2563a != null) {
                    c2563a.m10227n();
                    return;
                }
                return;
            }
            boolean z10 = true;
            for (AbstractC2565c abstractC2565c : map.values()) {
                if (abstractC2565c.mo10237e()) {
                    try {
                        String mo10236d = abstractC2565c.mo10236d();
                        Integer mo10235c = abstractC2565c.mo10235c();
                        Integer mo10234b = abstractC2565c.mo10234b();
                        a aVar = C2563a.f10035n;
                        methodChannel.invokeMethod("audio.onDuration", aVar.m10230c(mo10236d, Integer.valueOf(mo10235c != null ? mo10235c.intValue() : 0)));
                        methodChannel.invokeMethod("audio.onCurrentPosition", aVar.m10230c(mo10236d, Integer.valueOf(mo10234b != null ? mo10234b.intValue() : 0)));
                        if (c2563a.f10041m) {
                            methodChannel.invokeMethod("audio.onSeekComplete", aVar.m10230c(abstractC2565c.mo10236d(), Boolean.TRUE));
                            c2563a.f10041m = false;
                        }
                    } catch (UnsupportedOperationException unused) {
                    }
                    z10 = false;
                }
            }
            if (z10) {
                c2563a.m10227n();
            } else {
                handler.postDelayed(this, 200L);
            }
        }
    }

    /* renamed from: d */
    public final void m10217d(MethodCall methodCall, AbstractC2565c abstractC2565c) {
        Boolean bool = (Boolean) methodCall.argument("respectSilence");
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) methodCall.argument("stayAwake");
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        boolean booleanValue2 = bool2.booleanValue();
        Boolean bool3 = (Boolean) methodCall.argument("duckAudio");
        if (bool3 == null) {
            bool3 = Boolean.FALSE;
        }
        abstractC2565c.mo10233a(booleanValue, booleanValue2, bool3.booleanValue());
        Double d10 = (Double) methodCall.argument("volume");
        if (d10 == null) {
            d10 = Double.valueOf(1.0d);
        }
        abstractC2565c.mo10247p(d10.doubleValue());
    }

    /* renamed from: e */
    public final Context m10218e() {
        Context context = this.f10037i;
        if (context == null) {
            C4753m.m18667t("context");
            context = null;
        }
        Context applicationContext = context.getApplicationContext();
        C4753m.m18652e(applicationContext, "context.applicationContext");
        return applicationContext;
    }

    /* renamed from: f */
    public final AbstractC2565c m10219f(String str, String str2) {
        Map<String, AbstractC2565c> map = this.f10038j;
        AbstractC2565c abstractC2565c = map.get(str);
        if (abstractC2565c == null) {
            abstractC2565c = C0108n.m427m(str2, "PlayerMode.MEDIA_PLAYER", true) ? new C2568f(this, str) : new C2570h(str);
            map.put(str, abstractC2565c);
        }
        return abstractC2565c;
    }

    /* renamed from: g */
    public final void m10220g(AbstractC2565c abstractC2565c) {
        C4753m.m18653f(abstractC2565c, "player");
        MethodChannel methodChannel = this.f10036h;
        if (methodChannel == null) {
            C4753m.m18667t("channel");
            methodChannel = null;
        }
        methodChannel.invokeMethod("audio.onComplete", f10035n.m10230c(abstractC2565c.mo10236d(), Boolean.TRUE));
    }

    /* renamed from: h */
    public final void m10221h(AbstractC2565c abstractC2565c) {
        C4753m.m18653f(abstractC2565c, "player");
        MethodChannel methodChannel = this.f10036h;
        if (methodChannel == null) {
            C4753m.m18667t("channel");
            methodChannel = null;
        }
        a aVar = f10035n;
        String mo10236d = abstractC2565c.mo10236d();
        Integer mo10235c = abstractC2565c.mo10235c();
        methodChannel.invokeMethod("audio.onDuration", aVar.m10230c(mo10236d, Integer.valueOf(mo10235c != null ? mo10235c.intValue() : 0)));
    }

    /* renamed from: i */
    public final void m10222i(AbstractC2565c abstractC2565c, String str) {
        C4753m.m18653f(abstractC2565c, "player");
        C4753m.m18653f(str, Constants.MESSAGE);
        MethodChannel methodChannel = this.f10036h;
        if (methodChannel == null) {
            C4753m.m18667t("channel");
            methodChannel = null;
        }
        methodChannel.invokeMethod("audio.onError", f10035n.m10230c(abstractC2565c.mo10236d(), str));
    }

    /* renamed from: j */
    public final void m10223j() {
        m10226m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0250, code lost:
    
        if (td.C4753m.m18648a(r10, "PlayerMode.LOW_LATENCY") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:
    
        if (td.C4753m.m18648a(r10, "PlayerMode.LOW_LATENCY") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
    
        r3.mo10241j(r1.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0204, code lost:
    
        if (r11.equals("resume") == false) goto L128;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x007b. Please report as an issue. */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10224k(io.flutter.plugin.common.MethodCall r17, io.flutter.plugin.common.MethodChannel.Result r18) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p117hf.C2563a.m10224k(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    /* renamed from: l */
    public final void m10225l() {
        this.f10041m = true;
    }

    /* renamed from: m */
    public final void m10226m() {
        if (this.f10040l != null) {
            return;
        }
        Map<String, AbstractC2565c> map = this.f10038j;
        MethodChannel methodChannel = this.f10036h;
        if (methodChannel == null) {
            C4753m.m18667t("channel");
            methodChannel = null;
        }
        b bVar = new b(map, methodChannel, this.f10039k, this);
        this.f10039k.post(bVar);
        this.f10040l = bVar;
    }

    /* renamed from: n */
    public final void m10227n() {
        this.f10040l = null;
        this.f10039k.removeCallbacksAndMessages(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        this.f10036h = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "xyz.luan/audioplayers");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        C4753m.m18652e(applicationContext, "binding.applicationContext");
        this.f10037i = applicationContext;
        this.f10041m = false;
        MethodChannel methodChannel = this.f10036h;
        if (methodChannel == null) {
            C4753m.m18667t("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C4753m.m18653f(methodCall, "call");
        C4753m.m18653f(result, "response");
        try {
            m10224k(methodCall, result);
        } catch (Exception e10) {
            C1506d.f5490a.m6105a("Unexpected error!", e10);
            result.error("Unexpected error!", e10.getMessage(), e10);
        }
    }
}
