package p056df;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import gd.C2245s;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p243qd.C4236c;
import p243qd.C4246m;
import p243qd.C4248o;
import td.C4747g;
import td.C4753m;

/* renamed from: df.g */
/* loaded from: classes2.dex */
public final class C1631g {

    /* renamed from: h */
    public static final a f5981h = new a(null);

    /* renamed from: i */
    public static final C1632h f5982i = new C1632h(0.0f, 0.0f, 3, null);

    /* renamed from: a */
    public final Context f5983a;

    /* renamed from: b */
    public final int f5984b;

    /* renamed from: c */
    public final int f5985c;

    /* renamed from: d */
    public SoundPool f5986d;

    /* renamed from: e */
    public final HashMap<Integer, MethodChannel.Result> f5987e;

    /* renamed from: f */
    public ExecutorService f5988f;

    /* renamed from: g */
    public final Map<Integer, C1632h> f5989g;

    /* renamed from: df.g$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: df.g$b */
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ int f5990h;

        /* renamed from: i */
        public final /* synthetic */ MethodChannel.Result f5991i;

        /* renamed from: j */
        public final /* synthetic */ int f5992j;

        public b(int i10, MethodChannel.Result result, int i11) {
            this.f5990h = i10;
            this.f5991i = result;
            this.f5992j = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f5990h == 0) {
                this.f5991i.success(Integer.valueOf(this.f5992j));
                return;
            }
            this.f5991i.error("Loading failed", "Error code: " + this.f5990h, null);
        }
    }

    /* renamed from: df.g$c */
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {

        /* renamed from: i */
        public final /* synthetic */ int f5994i;

        /* renamed from: j */
        public final /* synthetic */ C1632h f5995j;

        /* renamed from: k */
        public final /* synthetic */ int f5996k;

        /* renamed from: l */
        public final /* synthetic */ double f5997l;

        /* renamed from: m */
        public final /* synthetic */ MethodChannel.Result f5998m;

        public c(int i10, C1632h c1632h, int i11, double d10, MethodChannel.Result result) {
            this.f5994i = i10;
            this.f5995j = c1632h;
            this.f5996k = i11;
            this.f5997l = d10;
            this.f5998m = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1627c.m6490b().post(new k(this.f5998m, C1631g.this.f5986d.play(this.f5994i, this.f5995j.m6504a(), this.f5995j.m6505b(), 0, this.f5996k, (float) this.f5997l)));
        }
    }

    /* renamed from: df.g$d */
    /* loaded from: classes2.dex */
    public static final class d implements Runnable {

        /* renamed from: i */
        public final /* synthetic */ int f6000i;

        /* renamed from: j */
        public final /* synthetic */ MethodChannel.Result f6001j;

        public d(int i10, MethodChannel.Result result) {
            this.f6000i = i10;
            this.f6001j = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1631g.this.f5986d.pause(this.f6000i);
            C1627c.m6490b().post(new l(this.f6001j, this.f6000i));
        }
    }

    /* renamed from: df.g$e */
    /* loaded from: classes2.dex */
    public static final class e implements Runnable {

        /* renamed from: i */
        public final /* synthetic */ int f6003i;

        /* renamed from: j */
        public final /* synthetic */ MethodChannel.Result f6004j;

        public e(int i10, MethodChannel.Result result) {
            this.f6003i = i10;
            this.f6004j = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1631g.this.f5986d.resume(this.f6003i);
            C1627c.m6490b().post(new m(this.f6004j, this.f6003i));
        }
    }

    /* renamed from: df.g$f */
    /* loaded from: classes2.dex */
    public static final class f implements Runnable {

        /* renamed from: i */
        public final /* synthetic */ int f6006i;

        /* renamed from: j */
        public final /* synthetic */ MethodChannel.Result f6007j;

        public f(int i10, MethodChannel.Result result) {
            this.f6006i = i10;
            this.f6007j = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1631g.this.f5986d.stop(this.f6006i);
            C1627c.m6490b().post(new n(this.f6007j, this.f6006i));
        }
    }

    /* renamed from: df.g$g */
    /* loaded from: classes2.dex */
    public static final class g implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ Integer f6008h;

        /* renamed from: i */
        public final /* synthetic */ Integer f6009i;

        /* renamed from: j */
        public final /* synthetic */ C1631g f6010j;

        /* renamed from: k */
        public final /* synthetic */ double f6011k;

        /* renamed from: l */
        public final /* synthetic */ double f6012l;

        /* renamed from: m */
        public final /* synthetic */ MethodChannel.Result f6013m;

        public g(Integer num, Integer num2, C1631g c1631g, double d10, double d11, MethodChannel.Result result) {
            this.f6008h = num;
            this.f6009i = num2;
            this.f6010j = c1631g;
            this.f6011k = d10;
            this.f6012l = d11;
            this.f6013m = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Integer num = this.f6008h;
            if (num != null) {
                this.f6010j.f5986d.setVolume(num.intValue(), (float) this.f6011k, (float) this.f6012l);
            }
            Integer num2 = this.f6009i;
            if (num2 != null) {
                this.f6010j.f5989g.put(Integer.valueOf(num2.intValue()), new C1632h((float) this.f6011k, (float) this.f6012l));
            }
            C1627c.m6490b().post(new o(this.f6013m));
        }
    }

    /* renamed from: df.g$h */
    /* loaded from: classes2.dex */
    public static final class h implements Runnable {

        /* renamed from: i */
        public final /* synthetic */ int f6015i;

        /* renamed from: j */
        public final /* synthetic */ double f6016j;

        /* renamed from: k */
        public final /* synthetic */ MethodChannel.Result f6017k;

        public h(int i10, double d10, MethodChannel.Result result) {
            this.f6015i = i10;
            this.f6016j = d10;
            this.f6017k = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1631g.this.f5986d.setRate(this.f6015i, (float) this.f6016j);
            C1627c.m6490b().post(new p(this.f6017k));
        }
    }

    /* renamed from: df.g$i */
    /* loaded from: classes2.dex */
    public static final class i implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ MethodChannel.Result f6018h;

        /* renamed from: i */
        public final /* synthetic */ int f6019i;

        public i(MethodChannel.Result result, int i10) {
            this.f6018h = result;
            this.f6019i = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6018h.success(Integer.valueOf(this.f6019i));
        }
    }

    /* renamed from: df.g$j */
    /* loaded from: classes2.dex */
    public static final class j implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ MethodChannel.Result f6020h;

        /* renamed from: i */
        public final /* synthetic */ Throwable f6021i;

        public j(MethodChannel.Result result, Throwable th) {
            this.f6020h = result;
            this.f6021i = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6020h.error("URI loading failure", this.f6021i.getMessage(), null);
        }
    }

    /* renamed from: df.g$k */
    /* loaded from: classes2.dex */
    public static final class k implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ MethodChannel.Result f6022h;

        /* renamed from: i */
        public final /* synthetic */ int f6023i;

        public k(MethodChannel.Result result, int i10) {
            this.f6022h = result;
            this.f6023i = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6022h.success(Integer.valueOf(this.f6023i));
        }
    }

    /* renamed from: df.g$l */
    /* loaded from: classes2.dex */
    public static final class l implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ MethodChannel.Result f6024h;

        /* renamed from: i */
        public final /* synthetic */ int f6025i;

        public l(MethodChannel.Result result, int i10) {
            this.f6024h = result;
            this.f6025i = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6024h.success(Integer.valueOf(this.f6025i));
        }
    }

    /* renamed from: df.g$m */
    /* loaded from: classes2.dex */
    public static final class m implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ MethodChannel.Result f6026h;

        /* renamed from: i */
        public final /* synthetic */ int f6027i;

        public m(MethodChannel.Result result, int i10) {
            this.f6026h = result;
            this.f6027i = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6026h.success(Integer.valueOf(this.f6027i));
        }
    }

    /* renamed from: df.g$n */
    /* loaded from: classes2.dex */
    public static final class n implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ MethodChannel.Result f6028h;

        /* renamed from: i */
        public final /* synthetic */ int f6029i;

        public n(MethodChannel.Result result, int i10) {
            this.f6028h = result;
            this.f6029i = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6028h.success(Integer.valueOf(this.f6029i));
        }
    }

    /* renamed from: df.g$o */
    /* loaded from: classes2.dex */
    public static final class o implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ MethodChannel.Result f6030h;

        public o(MethodChannel.Result result) {
            this.f6030h = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6030h.success(null);
        }
    }

    /* renamed from: df.g$p */
    /* loaded from: classes2.dex */
    public static final class p implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ MethodChannel.Result f6031h;

        public p(MethodChannel.Result result) {
            this.f6031h = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6031h.success(null);
        }
    }

    /* renamed from: df.g$q */
    /* loaded from: classes2.dex */
    public static final class q implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ MethodChannel.Result f6032h;

        /* renamed from: i */
        public final /* synthetic */ Throwable f6033i;

        public q(MethodChannel.Result result, Throwable th) {
            this.f6032h = result;
            this.f6033i = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6032h.error("Loading failure", this.f6033i.getMessage(), null);
        }
    }

    /* renamed from: df.g$r */
    /* loaded from: classes2.dex */
    public static final class r implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ MethodChannel.Result f6034h;

        /* renamed from: i */
        public final /* synthetic */ int f6035i;

        public r(MethodChannel.Result result, int i10) {
            this.f6034h = result;
            this.f6035i = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6034h.success(Integer.valueOf(this.f6035i));
        }
    }

    public C1631g(Context context, int i10, int i11) {
        C4753m.m18653f(context, "context");
        this.f5983a = context;
        this.f5984b = i10;
        this.f5985c = i11;
        this.f5986d = m6499f();
        this.f5987e = new HashMap<>();
        this.f5988f = new ThreadPoolExecutor(1, i10, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
        this.f5989g = new LinkedHashMap();
    }

    /* renamed from: g */
    public static final void m6496g(C1631g c1631g, SoundPool soundPool, int i10, int i11) {
        C4753m.m18653f(c1631g, "this$0");
        MethodChannel.Result result = c1631g.f5987e.get(Integer.valueOf(i10));
        if (result != null) {
            C1627c.m6490b().post(new b(i11, result, i10));
            c1631g.f5987e.remove(Integer.valueOf(i10));
        }
    }

    /* renamed from: i */
    public static final void m6497i(MethodCall methodCall, C1631g c1631g, MethodChannel.Result result) {
        int load;
        C4753m.m18653f(methodCall, "$call");
        C4753m.m18653f(c1631g, "this$0");
        C4753m.m18653f(result, "$result");
        try {
            Object obj = methodCall.arguments;
            C4753m.m18651d(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Map map = (Map) obj;
            Object obj2 = map.get("uri");
            C4753m.m18651d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = map.get("priority");
            C4753m.m18651d(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            URI create = URI.create(str);
            if (C4753m.m18648a(create.getScheme(), "content")) {
                load = c1631g.f5986d.load(c1631g.f5983a.getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r"), 1);
            } else {
                File m16295g = C4246m.m16295g("sound", "pool", c1631g.f5983a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(m16295g);
                try {
                    URL url = create.toURL();
                    C4753m.m18652e(url, "uri.toURL()");
                    fileOutputStream.write(C4248o.m16300c(url));
                    C2245s c2245s = C2245s.f8873a;
                    C4236c.m16274a(fileOutputStream, null);
                    m16295g.deleteOnExit();
                    load = c1631g.f5986d.load(m16295g.getAbsolutePath(), intValue);
                } finally {
                }
            }
            if (load <= -1) {
                C1627c.m6490b().post(new i(result, load));
            } else {
                c1631g.f5987e.put(Integer.valueOf(load), result);
            }
        } catch (Throwable th) {
            C1627c.m6490b().post(new j(result, th));
        }
    }

    /* renamed from: j */
    public static final void m6498j(MethodCall methodCall, C1631g c1631g, MethodChannel.Result result) {
        C4753m.m18653f(methodCall, "$call");
        C4753m.m18653f(c1631g, "this$0");
        C4753m.m18653f(result, "$result");
        try {
            Object obj = methodCall.arguments;
            C4753m.m18651d(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Map map = (Map) obj;
            Object obj2 = map.get("rawSound");
            C4753m.m18651d(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr = (byte[]) obj2;
            Object obj3 = map.get("priority");
            C4753m.m18651d(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            File m16295g = C4246m.m16295g("sound", "pool", c1631g.f5983a.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(m16295g);
            try {
                fileOutputStream.write(bArr);
                m16295g.deleteOnExit();
                int load = c1631g.f5986d.load(m16295g.getAbsolutePath(), intValue);
                if (load > -1) {
                    c1631g.f5987e.put(Integer.valueOf(load), result);
                } else {
                    C1627c.m6490b().post(new r(result, load));
                }
                C2245s c2245s = C2245s.f8873a;
                C4236c.m16274a(fileOutputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            C1627c.m6490b().post(new q(result, th));
        }
    }

    /* renamed from: f */
    public final SoundPool m6499f() {
        SoundPool soundPool;
        if (Build.VERSION.SDK_INT >= 21) {
            int i10 = this.f5985c;
            int i11 = 5;
            if (i10 == 2) {
                i11 = 6;
            } else if (i10 == 4) {
                i11 = 4;
            } else if (i10 != 5) {
                i11 = 14;
            }
            soundPool = new SoundPool.Builder().setMaxStreams(this.f5984b).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(this.f5985c).setUsage(i11).build()).build();
        } else {
            soundPool = new SoundPool(this.f5984b, this.f5985c, 1);
        }
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: df.d
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool2, int i12, int i13) {
                C1631g.m6496g(C1631g.this, soundPool2, i12, i13);
            }
        });
        return soundPool;
    }

    /* renamed from: h */
    public final void m6500h() {
        m6502l();
        this.f5988f.shutdownNow();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0023. Please report as an issue. */
    /* renamed from: k */
    public final void m6501k(final MethodCall methodCall, final MethodChannel.Result result) {
        ExecutorService executorService;
        Runnable eVar;
        Executor m6489a;
        Runnable runnable;
        C4753m.m18653f(methodCall, "call");
        C4753m.m18653f(result, "result");
        String str = methodCall.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -934426579:
                    if (str.equals("resume")) {
                        Object obj = methodCall.arguments;
                        C4753m.m18651d(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                        Object obj2 = ((Map) obj).get("streamId");
                        C4753m.m18650c(obj2);
                        int intValue = ((Number) obj2).intValue();
                        executorService = this.f5988f;
                        eVar = new e(intValue, result);
                        executorService.execute(eVar);
                        return;
                    }
                    break;
                case 3327206:
                    if (str.equals("load")) {
                        m6489a = C1627c.m6489a();
                        runnable = new Runnable() { // from class: df.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1631g.m6498j(MethodCall.this, this, result);
                            }
                        };
                        m6489a.execute(runnable);
                        return;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        Object obj3 = methodCall.arguments;
                        C4753m.m18651d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        Map map = (Map) obj3;
                        Integer num = (Integer) map.get("soundId");
                        C4753m.m18650c(num);
                        int intValue2 = num.intValue();
                        Integer num2 = (Integer) map.get("repeat");
                        int intValue3 = num2 != null ? num2.intValue() : 0;
                        Double d10 = (Double) map.get("rate");
                        this.f5988f.execute(new c(intValue2, m6503m(intValue2), intValue3, d10 != null ? d10.doubleValue() : 1.0d, result));
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        Object obj4 = methodCall.arguments;
                        C4753m.m18651d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                        Object obj5 = ((Map) obj4).get("streamId");
                        C4753m.m18650c(obj5);
                        int intValue4 = ((Number) obj5).intValue();
                        executorService = this.f5988f;
                        eVar = new f(intValue4, result);
                        executorService.execute(eVar);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        Object obj6 = methodCall.arguments;
                        C4753m.m18651d(obj6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                        Object obj7 = ((Map) obj6).get("streamId");
                        C4753m.m18650c(obj7);
                        int intValue5 = ((Number) obj7).intValue();
                        executorService = this.f5988f;
                        eVar = new d(intValue5, result);
                        executorService.execute(eVar);
                        return;
                    }
                    break;
                case 336631462:
                    if (str.equals("loadUri")) {
                        m6489a = C1627c.m6489a();
                        runnable = new Runnable() { // from class: df.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1631g.m6497i(MethodCall.this, this, result);
                            }
                        };
                        m6489a.execute(runnable);
                        return;
                    }
                    break;
                case 670514716:
                    if (str.equals("setVolume")) {
                        Object obj8 = methodCall.arguments;
                        C4753m.m18651d(obj8, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                        Map map2 = (Map) obj8;
                        Integer num3 = (Integer) map2.get("streamId");
                        Integer num4 = (Integer) map2.get("soundId");
                        if (num3 == null && num4 == null) {
                            result.error("InvalidParameters", "Either 'streamId' or 'soundId' has to be passed", null);
                        }
                        Object obj9 = map2.get("volumeLeft");
                        C4753m.m18650c(obj9);
                        double doubleValue = ((Double) obj9).doubleValue();
                        Object obj10 = map2.get("volumeRight");
                        C4753m.m18650c(obj10);
                        this.f5988f.execute(new g(num3, num4, this, doubleValue, ((Double) obj10).doubleValue(), result));
                        return;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        m6502l();
                        this.f5986d = m6499f();
                        result.success(null);
                        return;
                    }
                    break;
                case 1984920674:
                    if (str.equals("setRate")) {
                        Object obj11 = methodCall.arguments;
                        C4753m.m18651d(obj11, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                        Map map3 = (Map) obj11;
                        Object obj12 = map3.get("streamId");
                        C4753m.m18650c(obj12);
                        int intValue6 = ((Integer) obj12).intValue();
                        Double d11 = (Double) map3.get("rate");
                        this.f5988f.execute(new h(intValue6, d11 != null ? d11.doubleValue() : 1.0d, result));
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    /* renamed from: l */
    public final void m6502l() {
        this.f5986d.release();
    }

    /* renamed from: m */
    public final C1632h m6503m(int i10) {
        C1632h c1632h = this.f5989g.get(Integer.valueOf(i10));
        return c1632h == null ? f5982i : c1632h;
    }
}
