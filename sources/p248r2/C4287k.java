package p248r2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.arthenica.ffmpegkit.AbiDetect;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p233q2.C4129a0;
import p233q2.C4137g;
import p233q2.C4138h;
import p233q2.C4140j;
import p233q2.C4141k;
import p233q2.C4144n;
import p233q2.C4147q;
import p233q2.C4148r;
import p233q2.C4149s;
import p233q2.C4152v;
import p233q2.C4153w;
import p233q2.EnumC4143m;
import p233q2.EnumC4146p;
import p233q2.EnumC4155y;
import p233q2.EnumC4156z;
import p233q2.InterfaceC4131b0;
import p233q2.InterfaceC4139i;
import p233q2.InterfaceC4142l;
import p233q2.InterfaceC4145o;
import p233q2.InterfaceC4150t;
import p233q2.InterfaceC4154x;

/* renamed from: r2.k */
/* loaded from: classes.dex */
public class C4287k implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, PluginRegistry.ActivityResultListener {

    /* renamed from: k */
    public MethodChannel f15550k;

    /* renamed from: l */
    public EventChannel f15551l;

    /* renamed from: m */
    public MethodChannel.Result f15552m;

    /* renamed from: n */
    public Context f15553n;

    /* renamed from: o */
    public Activity f15554o;

    /* renamed from: p */
    public FlutterPlugin.FlutterPluginBinding f15555p;

    /* renamed from: q */
    public ActivityPluginBinding f15556q;

    /* renamed from: r */
    public EventChannel.EventSink f15557r;

    /* renamed from: h */
    public final AtomicBoolean f15547h = new AtomicBoolean(false);

    /* renamed from: i */
    public final AtomicBoolean f15548i = new AtomicBoolean(false);

    /* renamed from: j */
    public final ExecutorService f15549j = Executors.newFixedThreadPool(10);

    /* renamed from: s */
    public final C4281e f15558s = new C4281e();

    /* renamed from: r2.k$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15559a;

        static {
            int[] iArr = new int[EnumC4146p.values().length];
            f15559a = iArr;
            try {
                iArr[EnumC4146p.ALWAYS_PRINT_LOGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15559a[EnumC4146p.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15559a[EnumC4146p.PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15559a[EnumC4146p.PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15559a[EnumC4146p.NEVER_PRINT_LOGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C4287k() {
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin created %s.", this));
    }

    /* renamed from: A0 */
    public static int m16421A0(EnumC4146p enumC4146p) {
        int i10 = a.f15559a[enumC4146p.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            return i10 != 4 ? 4 : 3;
        }
        return 2;
    }

    /* renamed from: B0 */
    public static List<Object> m16422B0(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object opt = jSONArray.opt(i10);
            if (opt != null) {
                if (opt instanceof JSONArray) {
                    opt = m16422B0((JSONArray) opt);
                } else if (opt instanceof JSONObject) {
                    opt = m16426F0((JSONObject) opt);
                }
                arrayList.add(opt);
            }
        }
        return arrayList;
    }

    /* renamed from: C0 */
    public static List<Map<String, Object>> m16423C0(List<C4144n> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(m16427G0(list.get(i10)));
        }
        return arrayList;
    }

    /* renamed from: D0 */
    public static EnumC4146p m16424D0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? EnumC4146p.NEVER_PRINT_LOGS : EnumC4146p.PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED : EnumC4146p.PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED : EnumC4146p.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED : EnumC4146p.ALWAYS_PRINT_LOGS;
    }

    /* renamed from: E0 */
    public static long m16425E0(Date date) {
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    /* renamed from: F0 */
    public static Map<String, Object> m16426F0(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt != null) {
                    if (opt instanceof JSONArray) {
                        opt = m16422B0((JSONArray) opt);
                    } else if (opt instanceof JSONObject) {
                        opt = m16426F0((JSONObject) opt);
                    }
                    hashMap.put(next, opt);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: G0 */
    public static Map<String, Object> m16427G0(C4144n c4144n) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionId", Long.valueOf(c4144n.m15971c()));
        hashMap.put("level", Integer.valueOf(m16439z0(c4144n.m15969a())));
        hashMap.put(Constants.MESSAGE, c4144n.m15970b());
        return hashMap;
    }

    /* renamed from: H0 */
    public static Map<String, Object> m16428H0(C4147q c4147q) {
        JSONObject m15974a;
        if (c4147q == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        return (c4147q.m15974a() == null || (m15974a = c4147q.m15974a()) == null) ? hashMap : m16426F0(m15974a);
    }

    /* renamed from: I0 */
    public static Map<String, Object> m16429I0(InterfaceC4154x interfaceC4154x) {
        int i10;
        if (interfaceC4154x == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sessionId", Long.valueOf(interfaceC4154x.mo15940q()));
        hashMap.put("createTime", Long.valueOf(m16425E0(interfaceC4154x.mo15934k())));
        hashMap.put("startTime", Long.valueOf(m16425E0(interfaceC4154x.mo15929f())));
        hashMap.put("command", interfaceC4154x.mo15933j());
        if (interfaceC4154x.mo15956d()) {
            i10 = 1;
        } else {
            if (!interfaceC4154x.mo15957r()) {
                if (interfaceC4154x.mo15958s()) {
                    C4147q m15978B = ((C4149s) interfaceC4154x).m15978B();
                    if (m15978B != null) {
                        hashMap.put("mediaInformation", m16428H0(m15978B));
                    }
                    i10 = 3;
                }
                return hashMap;
            }
            i10 = 2;
        }
        hashMap.put(ImagePickerCache.MAP_KEY_TYPE, Integer.valueOf(i10));
        return hashMap;
    }

    /* renamed from: J0 */
    public static Map<String, Object> m16430J0(C4129a0 c4129a0) {
        HashMap hashMap = new HashMap();
        if (c4129a0 != null) {
            hashMap.put("sessionId", Long.valueOf(c4129a0.m15918b()));
            hashMap.put("videoFrameNumber", Integer.valueOf(c4129a0.m15923g()));
            hashMap.put("videoFps", Float.valueOf(c4129a0.m15922f()));
            hashMap.put("videoQuality", Float.valueOf(c4129a0.m15924h()));
            hashMap.put("size", Integer.valueOf((int) (c4129a0.m15919c() < 2147483647L ? c4129a0.m15919c() : c4129a0.m15919c() % 2147483647L)));
            hashMap.put("time", Double.valueOf(c4129a0.m15921e()));
            hashMap.put("bitrate", Double.valueOf(c4129a0.m15917a()));
            hashMap.put("speed", Double.valueOf(c4129a0.m15920d()));
        }
        return hashMap;
    }

    /* renamed from: K0 */
    public static List<Map<String, Object>> m16431K0(List<? extends InterfaceC4154x> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(m16429I0(list.get(i10)));
        }
        return arrayList;
    }

    /* renamed from: L0 */
    public static EnumC4155y m16432L0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? EnumC4155y.COMPLETED : EnumC4155y.FAILED : EnumC4155y.RUNNING : EnumC4155y.CREATED;
    }

    /* renamed from: M0 */
    public static List<Map<String, Object>> m16433M0(List<C4129a0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(m16430J0(list.get(i10)));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public static boolean m16436h0(Integer num) {
        return num != null && num.intValue() >= 0;
    }

    /* renamed from: i0 */
    public /* synthetic */ void m16437i0(C4144n c4144n) {
        if (this.f15547h.get()) {
            m16511x(c4144n);
        }
    }

    /* renamed from: j0 */
    public /* synthetic */ void m16438j0(C4129a0 c4129a0) {
        if (this.f15548i.get()) {
            m16515z(c4129a0);
        }
    }

    /* renamed from: z0 */
    public static int m16439z0(EnumC4143m enumC4143m) {
        if (enumC4143m == null) {
            enumC4143m = EnumC4143m.AV_LOG_TRACE;
        }
        return enumC4143m.m15968f();
    }

    /* renamed from: A */
    public void m16440A() {
        this.f15547h.compareAndSet(false, true);
    }

    /* renamed from: B */
    public void m16441B(MethodChannel.Result result) {
        m16440A();
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: C */
    public void m16442C(MethodChannel.Result result) {
        m16440A();
        m16443D();
        FFmpegKitConfig.m4653o();
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: D */
    public void m16443D() {
        this.f15548i.compareAndSet(false, true);
    }

    /* renamed from: E */
    public void m16444E(MethodChannel.Result result) {
        m16443D();
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: F */
    public void m16445F(List<String> list, MethodChannel.Result result) {
        this.f15558s.m16420m(result, m16429I0(C4138h.m15951A((String[]) list.toArray(new String[0]), null, null, null, EnumC4146p.NEVER_PRINT_LOGS)));
    }

    /* renamed from: G */
    public void m16446G(Integer num, MethodChannel.Result result) {
        C4281e c4281e;
        String str;
        String str2;
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            c4281e = this.f15558s;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m4624H.mo15956d()) {
            this.f15549j.submit(new RunnableC4288l((C4138h) m4624H, this.f15558s, result));
            return;
        } else {
            c4281e = this.f15558s;
            str = "NOT_FFMPEG_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c4281e.m16416e(result, str, str2);
    }

    /* renamed from: H */
    public void m16447H(Integer num, Integer num2, MethodChannel.Result result) {
        C4281e c4281e;
        String str;
        String str2;
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            c4281e = this.f15558s;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m4624H.mo15956d()) {
            this.f15558s.m16420m(result, m16433M0(((C4138h) m4624H).m15952B(m16436h0(num2) ? num2.intValue() : 5000)));
            return;
        } else {
            c4281e = this.f15558s;
            str = "NOT_FFMPEG_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c4281e.m16416e(result, str, str2);
    }

    /* renamed from: I */
    public void m16448I(Integer num, MethodChannel.Result result) {
        C4281e c4281e;
        String str;
        String str2;
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            c4281e = this.f15558s;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m4624H.mo15956d()) {
            this.f15558s.m16420m(result, m16433M0(((C4138h) m4624H).m15954D()));
            return;
        } else {
            c4281e = this.f15558s;
            str = "NOT_FFMPEG_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c4281e.m16416e(result, str, str2);
    }

    /* renamed from: J */
    public void m16449J(List<String> list, MethodChannel.Result result) {
        this.f15558s.m16420m(result, m16429I0(C4141k.m15963z((String[]) list.toArray(new String[0]), null, null, EnumC4146p.NEVER_PRINT_LOGS)));
    }

    /* renamed from: K */
    public void m16450K(Integer num, MethodChannel.Result result) {
        C4281e c4281e;
        String str;
        String str2;
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            c4281e = this.f15558s;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m4624H.mo15957r()) {
            this.f15549j.submit(new RunnableC4289m((C4141k) m4624H, this.f15558s, result));
            return;
        } else {
            c4281e = this.f15558s;
            str = "NOT_FFPROBE_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c4281e.m16416e(result, str, str2);
    }

    /* renamed from: L */
    public void m16451L(MethodChannel.Result result) {
        this.f15558s.m16420m(result, AbiDetect.m4615a());
    }

    /* renamed from: M */
    public void m16452M(MethodChannel.Result result) {
        this.f15558s.m16420m(result, FFmpegKitConfig.m4658t());
    }

    /* renamed from: N */
    public void m16453N(MethodChannel.Result result) {
        this.f15558s.m16420m(result, C4152v.m15995a());
    }

    /* renamed from: N0 */
    public void m16454N0() {
        m16458P0();
        m16456O0();
        ActivityPluginBinding activityPluginBinding = this.f15556q;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.f15553n = null;
        this.f15554o = null;
        this.f15556q = null;
        Log.d("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin uninitialized.");
    }

    /* renamed from: O */
    public void m16455O(MethodChannel.Result result) {
        this.f15558s.m16420m(result, m16431K0(C4137g.m15950c()));
    }

    /* renamed from: O0 */
    public void m16456O0() {
        EventChannel eventChannel = this.f15551l;
        if (eventChannel == null) {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin event channel was already uninitialised.");
        } else {
            eventChannel.setStreamHandler(null);
            this.f15551l = null;
        }
    }

    /* renamed from: P */
    public void m16457P(MethodChannel.Result result) {
        this.f15558s.m16420m(result, FFmpegKitConfig.m4661w());
    }

    /* renamed from: P0 */
    public void m16458P0() {
        MethodChannel methodChannel = this.f15550k;
        if (methodChannel == null) {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin method channel was already uninitialised.");
        } else {
            methodChannel.setMethodCallHandler(null);
            this.f15550k = null;
        }
    }

    /* renamed from: Q */
    public void m16459Q(MethodChannel.Result result) {
        this.f15558s.m16420m(result, m16431K0(C4140j.m15961a()));
    }

    /* renamed from: Q0 */
    public void m16460Q0(String str, String str2, MethodChannel.Result result) {
        this.f15549j.submit(new RunnableC4291o(str, str2, this.f15558s, result));
    }

    /* renamed from: R */
    public void m16461R(MethodChannel.Result result) {
        this.f15558s.m16420m(result, m16429I0(FFmpegKitConfig.m4664z()));
    }

    /* renamed from: S */
    public void m16462S(MethodChannel.Result result) {
        this.f15558s.m16420m(result, m16429I0(FFmpegKitConfig.m4617A()));
    }

    /* renamed from: T */
    public void m16463T(MethodChannel.Result result) {
        this.f15558s.m16420m(result, Integer.valueOf(m16439z0(FFmpegKitConfig.m4618B())));
    }

    /* renamed from: U */
    public void m16464U(MethodChannel.Result result) {
        this.f15558s.m16420m(result, Integer.valueOf(m16421A0(FFmpegKitConfig.m4619C())));
    }

    /* renamed from: V */
    public void m16465V(Integer num, MethodChannel.Result result) {
        C4281e c4281e;
        String str;
        String str2;
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            c4281e = this.f15558s;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m4624H.mo15958s()) {
            this.f15558s.m16420m(result, m16428H0(((C4149s) m4624H).m15978B()));
            return;
        } else {
            c4281e = this.f15558s;
            str = "NOT_MEDIA_INFORMATION_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c4281e.m16416e(result, str, str2);
    }

    /* renamed from: W */
    public void m16466W(MethodChannel.Result result) {
        this.f15558s.m16420m(result, m16431K0(C4140j.m15962b()));
    }

    /* renamed from: X */
    public void m16467X(MethodChannel.Result result) {
        this.f15558s.m16420m(result, C4152v.m15996b());
    }

    /* renamed from: Y */
    public void m16468Y(MethodChannel.Result result) {
        this.f15558s.m16420m(result, "android");
    }

    /* renamed from: Z */
    public void m16469Z(String str, String str2, MethodChannel.Result result) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19) {
            Log.i("ffmpeg-kit-flutter", String.format(Locale.getDefault(), "getSafParameter is not supported on API Level %d", Integer.valueOf(i10)));
            this.f15558s.m16416e(result, "GET_SAF_PARAMETER_FAILED", String.format(Locale.getDefault(), "getSafParameter is not supported on API Level %d", Integer.valueOf(i10)));
            return;
        }
        if (this.f15553n == null) {
            Log.w("ffmpeg-kit-flutter", String.format("Cannot getSafParameter using parameters uriString: %s, openMode: %s. Context is null.", str, str2));
            this.f15558s.m16416e(result, "INVALID_CONTEXT", "Context is null.");
            return;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            Log.w("ffmpeg-kit-flutter", String.format("Cannot getSafParameter using parameters uriString: %s, openMode: %s. Uri string cannot be parsed.", str, str2));
            this.f15558s.m16416e(result, "GET_SAF_PARAMETER_FAILED", "Uri string cannot be parsed.");
        } else {
            String m4623G = FFmpegKitConfig.m4623G(this.f15553n, parse, str2);
            Log.d("ffmpeg-kit-flutter", String.format("getSafParameter using parameters uriString: %s, openMode: %s completed with saf parameter: %s.", str, str2, m4623G));
            this.f15558s.m16420m(result, m4623G);
        }
    }

    /* renamed from: a0 */
    public void m16470a0(Integer num, MethodChannel.Result result) {
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            this.f15558s.m16416e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f15558s.m16420m(result, m16429I0(m4624H));
        }
    }

    /* renamed from: b0 */
    public void m16471b0(MethodChannel.Result result) {
        this.f15558s.m16420m(result, Integer.valueOf(FFmpegKitConfig.m4625I()));
    }

    /* renamed from: c */
    public void m16472c(Integer num, Integer num2, MethodChannel.Result result) {
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            this.f15558s.m16416e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f15558s.m16420m(result, m16423C0(m4624H.mo15932i(m16436h0(num2) ? num2.intValue() : 5000)));
        }
    }

    /* renamed from: c0 */
    public void m16473c0(MethodChannel.Result result) {
        this.f15558s.m16420m(result, m16431K0(FFmpegKitConfig.m4626J()));
    }

    /* renamed from: d */
    public void m16474d(Integer num, Integer num2, MethodChannel.Result result) {
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            this.f15558s.m16416e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f15558s.m16420m(result, m4624H.mo15928e(m16436h0(num2) ? num2.intValue() : 5000));
        }
    }

    /* renamed from: d0 */
    public void m16475d0(Integer num, MethodChannel.Result result) {
        this.f15558s.m16420m(result, m16431K0(FFmpegKitConfig.m4627K(m16432L0(num.intValue()))));
    }

    /* renamed from: e */
    public void m16476e(Integer num, MethodChannel.Result result) {
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            this.f15558s.m16416e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f15558s.m16420m(result, Long.valueOf(m4624H.mo15927c()));
        }
    }

    /* renamed from: e0 */
    public void m16477e0(Integer num, MethodChannel.Result result) {
        int intValue = num.intValue();
        EnumC4156z enumC4156z = EnumC4156z.SIGINT;
        if (intValue != enumC4156z.ordinal()) {
            int intValue2 = num.intValue();
            enumC4156z = EnumC4156z.SIGQUIT;
            if (intValue2 != enumC4156z.ordinal()) {
                int intValue3 = num.intValue();
                enumC4156z = EnumC4156z.SIGPIPE;
                if (intValue3 != enumC4156z.ordinal()) {
                    int intValue4 = num.intValue();
                    enumC4156z = EnumC4156z.SIGTERM;
                    if (intValue4 != enumC4156z.ordinal()) {
                        int intValue5 = num.intValue();
                        enumC4156z = EnumC4156z.SIGXCPU;
                        if (intValue5 != enumC4156z.ordinal()) {
                            enumC4156z = null;
                        }
                    }
                }
            }
        }
        if (enumC4156z == null) {
            this.f15558s.m16416e(result, "INVALID_SIGNAL", "Signal value not supported.");
        } else {
            FFmpegKitConfig.m4629M(enumC4156z);
            this.f15558s.m16420m(result, null);
        }
    }

    /* renamed from: f */
    public void m16478f(Integer num, MethodChannel.Result result) {
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            this.f15558s.m16416e(result, "SESSION_NOT_FOUND", "Session not found.");
            return;
        }
        Date mo15937n = m4624H.mo15937n();
        if (mo15937n == null) {
            this.f15558s.m16420m(result, null);
        } else {
            this.f15558s.m16420m(result, Long.valueOf(mo15937n.getTime()));
        }
    }

    /* renamed from: f0 */
    public void m16479f0(BinaryMessenger binaryMessenger, Context context, Activity activity, PluginRegistry.Registrar registrar, ActivityPluginBinding activityPluginBinding) {
        m16496p0();
        if (this.f15550k == null) {
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter.arthenica.com/ffmpeg_kit");
            this.f15550k = methodChannel;
            methodChannel.setMethodCallHandler(this);
        } else {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin method channel was already initialised.");
        }
        if (this.f15551l == null) {
            EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter.arthenica.com/ffmpeg_kit_event");
            this.f15551l = eventChannel;
            eventChannel.setStreamHandler(this);
        } else {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin event channel was already initialised.");
        }
        this.f15553n = context;
        this.f15554o = activity;
        if (registrar != null) {
            registrar.addActivityResultListener(this);
        } else {
            activityPluginBinding.addActivityResultListener(this);
        }
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin %s initialised with context %s and activity %s.", this, context, activity));
    }

    /* renamed from: g */
    public void m16480g(Integer num, MethodChannel.Result result) {
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            this.f15558s.m16416e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f15558s.m16420m(result, m4624H.mo15935l());
        }
    }

    /* renamed from: g0 */
    public void m16481g0(MethodChannel.Result result) {
        this.f15558s.m16420m(result, Boolean.valueOf(FFmpegKitConfig.m4630N()));
    }

    /* renamed from: h */
    public void m16482h(Integer num, MethodChannel.Result result) {
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            this.f15558s.m16416e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f15558s.m16420m(result, m16423C0(m4624H.mo15938o()));
        }
    }

    /* renamed from: i */
    public void m16483i(Integer num, MethodChannel.Result result) {
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            this.f15558s.m16416e(result, "SESSION_NOT_FOUND", "Session not found.");
            return;
        }
        C4153w mo15941t = m4624H.mo15941t();
        if (mo15941t == null) {
            this.f15558s.m16420m(result, null);
        } else {
            this.f15558s.m16420m(result, Integer.valueOf(mo15941t.m15997a()));
        }
    }

    /* renamed from: j */
    public void m16484j(Integer num, MethodChannel.Result result) {
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            this.f15558s.m16416e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f15558s.m16420m(result, Integer.valueOf(m4624H.getState().ordinal()));
        }
    }

    /* renamed from: k */
    public void m16485k(Integer num, MethodChannel.Result result) {
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            this.f15558s.m16416e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f15558s.m16420m(result, Boolean.valueOf(m4624H.mo15931h()));
        }
    }

    /* renamed from: k0 */
    public void m16486k0(String str, MethodChannel.Result result) {
        try {
            this.f15558s.m16420m(result, m16428H0(C4148r.m15975a(str)));
        } catch (JSONException e10) {
            Log.i("ffmpeg-kit-flutter", "Parsing MediaInformation failed.", e10);
            this.f15558s.m16420m(result, null);
        }
    }

    /* renamed from: l */
    public void m16487l(Integer num, MethodChannel.Result result) {
        C4281e c4281e;
        String str;
        String str2;
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            c4281e = this.f15558s;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m4624H.mo15956d()) {
            FFmpegKitConfig.m4642d((C4138h) m4624H);
            this.f15558s.m16420m(result, null);
            return;
        } else {
            c4281e = this.f15558s;
            str = "NOT_FFMPEG_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c4281e.m16416e(result, str, str2);
    }

    /* renamed from: l0 */
    public void m16488l0(String str, MethodChannel.Result result) {
        try {
            this.f15558s.m16420m(result, m16428H0(C4148r.m15975a(str)));
        } catch (JSONException e10) {
            Log.i("ffmpeg-kit-flutter", "Parsing MediaInformation failed.", e10);
            this.f15558s.m16416e(result, "PARSE_FAILED", "Parsing MediaInformation failed with JSON error.");
        }
    }

    /* renamed from: m */
    public void m16489m(Integer num, MethodChannel.Result result) {
        C4281e c4281e;
        String str;
        String str2;
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            c4281e = this.f15558s;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m4624H.mo15957r()) {
            FFmpegKitConfig.m4643e((C4141k) m4624H);
            this.f15558s.m16420m(result, null);
            return;
        } else {
            c4281e = this.f15558s;
            str = "NOT_FFPROBE_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c4281e.m16416e(result, str, str2);
    }

    /* renamed from: m0 */
    public void m16490m0(List<String> list, MethodChannel.Result result) {
        this.f15558s.m16420m(result, m16429I0(C4149s.m15976z((String[]) list.toArray(new String[0]), null, null)));
    }

    /* renamed from: n */
    public void m16491n(Integer num, Integer num2, MethodChannel.Result result) {
        C4281e c4281e;
        String str;
        String str2;
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            c4281e = this.f15558s;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m4624H.mo15958s()) {
            FFmpegKitConfig.m4644f((C4149s) m4624H, m16436h0(num2) ? num2.intValue() : 5000);
            this.f15558s.m16420m(result, null);
            return;
        } else {
            c4281e = this.f15558s;
            str = "NOT_MEDIA_INFORMATION_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c4281e.m16416e(result, str, str2);
    }

    /* renamed from: n0 */
    public void m16492n0(Integer num, Integer num2, MethodChannel.Result result) {
        C4281e c4281e;
        String str;
        String str2;
        InterfaceC4154x m4624H = FFmpegKitConfig.m4624H(num.longValue());
        if (m4624H == null) {
            c4281e = this.f15558s;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m4624H.mo15958s()) {
            this.f15549j.submit(new RunnableC4290n((C4149s) m4624H, m16436h0(num2) ? num2.intValue() : 5000, this.f15558s, result));
            return;
        } else {
            c4281e = this.f15558s;
            str = "NOT_MEDIA_INFORMATION_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c4281e.m16416e(result, str, str2);
    }

    /* renamed from: o */
    public void m16493o(MethodChannel.Result result) {
        C4137g.m15948a();
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: o0 */
    public void m16494o0(Integer num, MethodChannel.Result result) {
        this.f15558s.m16420m(result, Integer.valueOf(FFmpegKitConfig.messagesInTransmit(num.longValue())));
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i10);
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = intent == null ? null : intent.toString();
        Log.d("ffmpeg-kit-flutter", String.format("selectDocument completed with requestCode: %d, resultCode: %d, data: %s.", objArr));
        if (i10 != 10000 && i10 != 20000) {
            Log.i("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin ignored unsupported activity result for requestCode: %d.", Integer.valueOf(i10)));
            return false;
        }
        if (i11 != -1) {
            this.f15558s.m16416e(this.f15552m, "SELECT_CANCELLED", String.valueOf(i11));
        } else if (intent == null) {
            this.f15558s.m16420m(this.f15552m, null);
        } else {
            Uri data = intent.getData();
            this.f15558s.m16420m(this.f15552m, data != null ? data.toString() : null);
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin %s attached to activity %s.", this, activityPluginBinding.getActivity()));
        m16479f0(this.f15555p.getBinaryMessenger(), this.f15555p.getApplicationContext(), activityPluginBinding.getActivity(), null, activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f15555p = flutterPluginBinding;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f15557r = null;
        Log.d("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin stopped listening to events.");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        m16454N0();
        Log.d("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin detached from activity.");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f15555p = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f15557r = eventSink;
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin %s started listening to events on %s.", this, eventSink));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:196:0x03b2. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C4281e c4281e;
        String str;
        String str2;
        Integer num = (Integer) methodCall.argument("sessionId");
        Integer num2 = (Integer) methodCall.argument("waitTimeout");
        List<String> list = (List) methodCall.argument("arguments");
        String str3 = (String) methodCall.argument("ffprobeJsonOutput");
        Boolean bool = (Boolean) methodCall.argument("writable");
        String str4 = methodCall.method;
        str4.hashCode();
        char c10 = 65535;
        switch (str4.hashCode()) {
            case -2120516313:
                if (str4.equals("getSafParameter")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2103441263:
                if (str4.equals("ffmpegSession")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1912785202:
                if (str4.equals("mediaInformationSession")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1866655603:
                if (str4.equals("isLTSBuild")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1743798884:
                if (str4.equals("setFontDirectory")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1722024362:
                if (str4.equals("abstractSessionGetDuration")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1653941728:
                if (str4.equals("asyncFFmpegSessionExecute")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1411074938:
                if (str4.equals("getBuildDate")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1389627233:
                if (str4.equals("ffmpegSessionGetAllStatistics")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1367724422:
                if (str4.equals("cancel")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1273119136:
                if (str4.equals("getSession")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -1236521429:
                if (str4.equals("disableStatistics")) {
                    c10 = 11;
                    break;
                }
                break;
            case -1232550904:
                if (str4.equals("ffmpegSessionGetStatistics")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -1219192049:
                if (str4.equals("abstractSessionGetState")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -1197813889:
                if (str4.equals("abstractSessionGetReturnCode")) {
                    c10 = 14;
                    break;
                }
                break;
            case -1149109195:
                if (str4.equals("getSessionHistorySize")) {
                    c10 = 15;
                    break;
                }
                break;
            case -1066083862:
                if (str4.equals("getLastSession")) {
                    c10 = 16;
                    break;
                }
                break;
            case -1007401687:
                if (str4.equals("enableRedirection")) {
                    c10 = 17;
                    break;
                }
                break;
            case -1004092829:
                if (str4.equals("asyncMediaInformationSessionExecute")) {
                    c10 = 18;
                    break;
                }
                break;
            case -986804548:
                if (str4.equals("cancelSession")) {
                    c10 = 19;
                    break;
                }
                break;
            case -873593625:
                if (str4.equals("getSessionsByState")) {
                    c10 = 20;
                    break;
                }
                break;
            case -811987437:
                if (str4.equals("getSessions")) {
                    c10 = 21;
                    break;
                }
                break;
            case -395332803:
                if (str4.equals("getFFmpegVersion")) {
                    c10 = 22;
                    break;
                }
                break;
            case -393893135:
                if (str4.equals("abstractSessionGetAllLogsAsString")) {
                    c10 = 23;
                    break;
                }
                break;
            case -342383127:
                if (str4.equals("getPlatform")) {
                    c10 = 24;
                    break;
                }
                break;
            case -329192698:
                if (str4.equals("enableStatistics")) {
                    c10 = 25;
                    break;
                }
                break;
            case -309915358:
                if (str4.equals("setLogLevel")) {
                    c10 = 26;
                    break;
                }
                break;
            case -275249448:
                if (str4.equals("getFFmpegSessions")) {
                    c10 = 27;
                    break;
                }
                break;
            case -221335530:
                if (str4.equals("getLogLevel")) {
                    c10 = 28;
                    break;
                }
                break;
            case -134939106:
                if (str4.equals("getMediaInformation")) {
                    c10 = 29;
                    break;
                }
                break;
            case -75679540:
                if (str4.equals("getArch")) {
                    c10 = 30;
                    break;
                }
                break;
            case 39238969:
                if (str4.equals("thereAreAsynchronousMessagesInTransmit")) {
                    c10 = 31;
                    break;
                }
                break;
            case 97596186:
                if (str4.equals("ignoreSignal")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 134287517:
                if (str4.equals("abstractSessionGetFailStackTrace")) {
                    c10 = '!';
                    break;
                }
                break;
            case 179624467:
                if (str4.equals("asyncFFprobeSessionExecute")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 265484683:
                if (str4.equals("closeFFmpegPipe")) {
                    c10 = '#';
                    break;
                }
                break;
            case 268490427:
                if (str4.equals("getPackageName")) {
                    c10 = '$';
                    break;
                }
                break;
            case 616732055:
                if (str4.equals("getFFprobeSessions")) {
                    c10 = '%';
                    break;
                }
                break;
            case 666848778:
                if (str4.equals("clearSessions")) {
                    c10 = '&';
                    break;
                }
                break;
            case 754414928:
                if (str4.equals("registerNewFFmpegPipe")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 898447750:
                if (str4.equals("ffprobeSession")) {
                    c10 = '(';
                    break;
                }
                break;
            case 930178724:
                if (str4.equals("disableRedirection")) {
                    c10 = ')';
                    break;
                }
                break;
            case 1038283172:
                if (str4.equals("ffmpegSessionExecute")) {
                    c10 = '*';
                    break;
                }
                break;
            case 1068836721:
                if (str4.equals("abstractSessionGetLogs")) {
                    c10 = '+';
                    break;
                }
                break;
            case 1120963409:
                if (str4.equals("getLogRedirectionStrategy")) {
                    c10 = ',';
                    break;
                }
                break;
            case 1172412742:
                if (str4.equals("abstractSessionGetEndTime")) {
                    c10 = '-';
                    break;
                }
                break;
            case 1215775213:
                if (str4.equals("setEnvironmentVariable")) {
                    c10 = '.';
                    break;
                }
                break;
            case 1294348535:
                if (str4.equals("getLastCompletedSession")) {
                    c10 = '/';
                    break;
                }
                break;
            case 1353099447:
                if (str4.equals("disableLogs")) {
                    c10 = '0';
                    break;
                }
                break;
            case 1387101761:
                if (str4.equals("setSessionHistorySize")) {
                    c10 = '1';
                    break;
                }
                break;
            case 1435234184:
                if (str4.equals("writeToPipe")) {
                    c10 = '2';
                    break;
                }
                break;
            case 1453176007:
                if (str4.equals("mediaInformationSessionExecute")) {
                    c10 = '3';
                    break;
                }
                break;
            case 1466586152:
                if (str4.equals("setFontconfigConfigurationPath")) {
                    c10 = '4';
                    break;
                }
                break;
            case 1555761752:
                if (str4.equals("getExternalLibraries")) {
                    c10 = '5';
                    break;
                }
                break;
            case 1566113121:
                if (str4.equals("messagesInTransmit")) {
                    c10 = '6';
                    break;
                }
                break;
            case 1639331035:
                if (str4.equals("getMediaInformationSessions")) {
                    c10 = '7';
                    break;
                }
                break;
            case 1714653353:
                if (str4.equals("mediaInformationJsonParserFromWithError")) {
                    c10 = '8';
                    break;
                }
                break;
            case 1755559002:
                if (str4.equals("setFontDirectoryList")) {
                    c10 = '9';
                    break;
                }
                break;
            case 1814015543:
                if (str4.equals("selectDocument")) {
                    c10 = ':';
                    break;
                }
                break;
            case 1867262446:
                if (str4.equals("abstractSessionGetAllLogs")) {
                    c10 = ';';
                    break;
                }
                break;
            case 1893000658:
                if (str4.equals("enableLogs")) {
                    c10 = '<';
                    break;
                }
                break;
            case 1945437241:
                if (str4.equals("mediaInformationJsonParserFrom")) {
                    c10 = '=';
                    break;
                }
                break;
            case 1964255069:
                if (str4.equals("setLogRedirectionStrategy")) {
                    c10 = '>';
                    break;
                }
                break;
            case 2034217743:
                if (str4.equals("ffprobeSessionExecute")) {
                    c10 = '?';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String str5 = (String) methodCall.argument("uri");
                String str6 = (String) methodCall.argument("openMode");
                if (str5 != null && str6 != null) {
                    m16469Z(str5, str6, result);
                    return;
                }
                c4281e = this.f15558s;
                if (str5 != null) {
                    str = "INVALID_OPEN_MODE";
                    str2 = "Invalid openMode value.";
                } else {
                    str = "INVALID_URI";
                    str2 = "Invalid uri value.";
                }
                c4281e.m16416e(result, str, str2);
                return;
            case 1:
                if (list != null) {
                    m16445F(list, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_ARGUMENTS", "Invalid arguments array.");
                return;
            case 2:
                if (list != null) {
                    m16490m0(list, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_ARGUMENTS", "Invalid arguments array.");
                return;
            case 3:
                m16481g0(result);
                return;
            case 4:
                String str7 = (String) methodCall.argument("fontDirectory");
                Map<String, String> map = (Map) methodCall.argument("fontNameMap");
                if (str7 != null) {
                    m16504t0(str7, map, result);
                    return;
                }
                c4281e = this.f15558s;
                str = "INVALID_FONT_DIRECTORY";
                str2 = "Invalid font directory.";
                c4281e.m16416e(result, str, str2);
                return;
            case 5:
                if (num != null) {
                    m16476e(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 6:
                if (num != null) {
                    m16487l(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 7:
                m16452M(result);
                return;
            case '\b':
                if (num != null) {
                    m16447H(num, num2, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '\t':
                m16493o(result);
                return;
            case '\n':
                if (num != null) {
                    m16470a0(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 11:
                m16509w(result);
                return;
            case '\f':
                if (num != null) {
                    m16448I(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '\r':
                if (num != null) {
                    m16484j(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 14:
                if (num != null) {
                    m16483i(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 15:
                m16471b0(result);
                return;
            case 16:
                m16462S(result);
                return;
            case 17:
                m16442C(result);
                return;
            case 18:
                if (num != null) {
                    m16491n(num, num2, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 19:
                if (num != null) {
                    m16495p(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 20:
                Integer num3 = (Integer) methodCall.argument("state");
                if (num3 != null) {
                    m16475d0(num3, result);
                    return;
                }
                c4281e = this.f15558s;
                str = "INVALID_SESSION_STATE";
                str2 = "Invalid session state value.";
                c4281e.m16416e(result, str, str2);
                return;
            case 21:
                m16473c0(result);
                return;
            case 22:
                m16457P(result);
                return;
            case 23:
                if (num != null) {
                    m16474d(num, num2, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 24:
                m16468Y(result);
                return;
            case 25:
                m16444E(result);
                return;
            case 26:
                Integer num4 = (Integer) methodCall.argument("level");
                if (num4 != null) {
                    m16510w0(num4, result);
                    return;
                }
                c4281e = this.f15558s;
                str = "INVALID_LEVEL";
                str2 = "Invalid level value.";
                c4281e.m16416e(result, str, str2);
                return;
            case 27:
                m16455O(result);
                return;
            case 28:
                m16463T(result);
                return;
            case 29:
                if (num != null) {
                    m16465V(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case C1417R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                m16451L(result);
                return;
            case C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                if (num != null) {
                    m16485k(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                Integer num5 = (Integer) methodCall.argument("signal");
                if (num5 != null) {
                    m16477e0(num5, result);
                    return;
                }
                c4281e = this.f15558s;
                str = "INVALID_SIGNAL";
                str2 = "Invalid signal value.";
                c4281e.m16416e(result, str, str2);
                return;
            case C1417R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                if (num != null) {
                    m16480g(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case C1417R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                if (num != null) {
                    m16489m(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case C1417R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                String str8 = (String) methodCall.argument("ffmpegPipePath");
                if (str8 != null) {
                    m16499r(str8, result);
                    return;
                }
                c4281e = this.f15558s;
                str = "INVALID_PIPE_PATH";
                str2 = "Invalid ffmpeg pipe path.";
                c4281e.m16416e(result, str, str2);
                return;
            case C1417R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                m16467X(result);
                return;
            case C1417R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                m16459Q(result);
                return;
            case C1417R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                m16497q(result);
                return;
            case C1417R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                m16498q0(result);
                return;
            case '(':
                if (list != null) {
                    m16449J(list, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_ARGUMENTS", "Invalid arguments array.");
                return;
            case C1417R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                m16505u(result);
                return;
            case C1417R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                if (num != null) {
                    m16446G(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case C1417R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                if (num != null) {
                    m16482h(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case C1417R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                m16464U(result);
                return;
            case C1417R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                if (num != null) {
                    m16478f(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case C1417R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                String str9 = (String) methodCall.argument("variableName");
                String str10 = (String) methodCall.argument("variableValue");
                if (str9 != null && str10 != null) {
                    m16502s0(str9, str10, result);
                    return;
                }
                if (str10 != null) {
                    c4281e = this.f15558s;
                    str = "INVALID_NAME";
                    str2 = "Invalid environment variable name.";
                } else {
                    c4281e = this.f15558s;
                    str = "INVALID_VALUE";
                    str2 = "Invalid environment variable value.";
                }
                c4281e.m16416e(result, str, str2);
                return;
            case C1417R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                m16461R(result);
                return;
            case '0':
                m16503t(result);
                return;
            case C1417R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                Integer num6 = (Integer) methodCall.argument("sessionHistorySize");
                if (num6 != null) {
                    m16514y0(num6, result);
                    return;
                }
                c4281e = this.f15558s;
                str = "INVALID_SIZE";
                str2 = "Invalid session history size value.";
                c4281e.m16416e(result, str, str2);
                return;
            case C1417R.styleable.AppCompatTheme_colorAccent /* 50 */:
                String str11 = (String) methodCall.argument("input");
                String str12 = (String) methodCall.argument("pipe");
                if (str11 != null && str12 != null) {
                    m16460Q0(str11, str12, result);
                    return;
                }
                if (str12 != null) {
                    c4281e = this.f15558s;
                    str = "INVALID_INPUT";
                    str2 = "Invalid input value.";
                } else {
                    c4281e = this.f15558s;
                    str = "INVALID_PIPE";
                    str2 = "Invalid pipe value.";
                }
                c4281e.m16416e(result, str, str2);
                return;
            case C1417R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                if (num != null) {
                    m16492n0(num, num2, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case C1417R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                String str13 = (String) methodCall.argument("path");
                if (str13 != null) {
                    m16508v0(str13, result);
                    return;
                }
                c4281e = this.f15558s;
                str = "INVALID_PATH";
                str2 = "Invalid path.";
                c4281e.m16416e(result, str, str2);
                return;
            case C1417R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                m16453N(result);
                return;
            case C1417R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                if (num != null) {
                    m16494o0(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case C1417R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                m16466W(result);
                return;
            case '8':
                if (str3 != null) {
                    m16488l0(str3, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_FFPROBE_JSON_OUTPUT", "Invalid ffprobe json output.");
                return;
            case C1417R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                List<String> list2 = (List) methodCall.argument("fontDirectoryList");
                Map<String, String> map2 = (Map) methodCall.argument("fontNameMap");
                if (list2 != null) {
                    m16506u0(list2, map2, result);
                    return;
                }
                c4281e = this.f15558s;
                str = "INVALID_FONT_DIRECTORY_LIST";
                str2 = "Invalid font directory list.";
                c4281e.m16416e(result, str, str2);
                return;
            case C1417R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                String str14 = (String) methodCall.argument("title");
                String str15 = (String) methodCall.argument(ImagePickerCache.MAP_KEY_TYPE);
                List list3 = (List) methodCall.argument("extraTypes");
                String[] strArr = list3 != null ? (String[]) list3.toArray(new String[0]) : null;
                if (bool != null) {
                    m16500r0(bool, str14, str15, strArr, result);
                    return;
                }
                c4281e = this.f15558s;
                str = "INVALID_WRITABLE";
                str2 = "Invalid writable value.";
                c4281e.m16416e(result, str, str2);
                return;
            case C1417R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (num != null) {
                    m16472c(num, num2, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case C1417R.styleable.AppCompatTheme_controlBackground /* 60 */:
                m16441B(result);
                return;
            case C1417R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                if (str3 != null) {
                    m16486k0(str3, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_FFPROBE_JSON_OUTPUT", "Invalid ffprobe json output.");
                return;
            case C1417R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                Integer num7 = (Integer) methodCall.argument("strategy");
                if (num7 != null) {
                    m16512x0(num7, result);
                    return;
                }
                c4281e = this.f15558s;
                str = "INVALID_LOG_REDIRECTION_STRATEGY";
                str2 = "Invalid log redirection strategy value.";
                c4281e.m16416e(result, str, str2);
                return;
            case C1417R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                if (num != null) {
                    m16450K(num, result);
                    return;
                }
                this.f15558s.m16416e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            default:
                this.f15558s.m16418k(result);
                return;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    /* renamed from: p */
    public void m16495p(Integer num, MethodChannel.Result result) {
        C4137g.m15949b(num.longValue());
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: p0 */
    public void m16496p0() {
        FFmpegKitConfig.m4649k(new InterfaceC4139i() { // from class: r2.f
            public /* synthetic */ C4282f() {
            }

            @Override // p233q2.InterfaceC4139i
            /* renamed from: a */
            public final void mo15960a(C4138h c4138h) {
                C4287k.this.m16513y(c4138h);
            }
        });
        FFmpegKitConfig.m4650l(new InterfaceC4142l() { // from class: r2.g
            public /* synthetic */ C4283g() {
            }

            @Override // p233q2.InterfaceC4142l
            /* renamed from: a */
            public final void mo15965a(C4141k c4141k) {
                C4287k.this.m16513y(c4141k);
            }
        });
        FFmpegKitConfig.m4652n(new InterfaceC4150t() { // from class: r2.i
            public /* synthetic */ C4285i() {
            }

            @Override // p233q2.InterfaceC4150t
            /* renamed from: a */
            public final void mo15980a(C4149s c4149s) {
                C4287k.this.m16513y(c4149s);
            }
        });
        FFmpegKitConfig.m4651m(new InterfaceC4145o() { // from class: r2.h
            public /* synthetic */ C4284h() {
            }

            @Override // p233q2.InterfaceC4145o
            /* renamed from: a */
            public final void mo15972a(C4144n c4144n) {
                C4287k.this.m16437i0(c4144n);
            }
        });
        FFmpegKitConfig.m4654p(new InterfaceC4131b0() { // from class: r2.j
            public /* synthetic */ C4286j() {
            }

            @Override // p233q2.InterfaceC4131b0
            /* renamed from: a */
            public final void mo15947a(C4129a0 c4129a0) {
                C4287k.this.m16438j0(c4129a0);
            }
        });
    }

    /* renamed from: q */
    public void m16497q(MethodChannel.Result result) {
        FFmpegKitConfig.m4645g();
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: q0 */
    public void m16498q0(MethodChannel.Result result) {
        Context context = this.f15553n;
        if (context != null) {
            this.f15558s.m16420m(result, FFmpegKitConfig.m4631O(context));
        } else {
            Log.w("ffmpeg-kit-flutter", "Cannot registerNewFFmpegPipe. Context is null.");
            this.f15558s.m16416e(result, "INVALID_CONTEXT", "Context is null.");
        }
    }

    /* renamed from: r */
    public void m16499r(String str, MethodChannel.Result result) {
        FFmpegKitConfig.m4646h(str);
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: r0 */
    public void m16500r0(Boolean bool, String str, String str2, String[] strArr, MethodChannel.Result result) {
        Intent intent;
        C4281e c4281e;
        String str3;
        String str4;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19) {
            Log.i("ffmpeg-kit-flutter", String.format(Locale.getDefault(), "selectDocument is not supported on API Level %d", Integer.valueOf(i10)));
            this.f15558s.m16416e(result, "SELECT_FAILED", String.format(Locale.getDefault(), "selectDocument is not supported on API Level %d", Integer.valueOf(i10)));
            return;
        }
        if (bool.booleanValue()) {
            intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addFlags(3);
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.addFlags(1);
        }
        if (str2 != null) {
            intent.setType(str2);
        } else {
            intent.setType("*/*");
        }
        if (str != null) {
            intent.putExtra("android.intent.extra.TITLE", str);
        }
        if (strArr != null) {
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        }
        if (this.f15553n != null) {
            Activity activity = this.f15554o;
            if (activity != null) {
                try {
                    this.f15552m = result;
                    activity.startActivityForResult(intent, bool.booleanValue() ? 20000 : 10000);
                    return;
                } catch (Exception e10) {
                    Object[] objArr = new Object[4];
                    objArr[0] = bool;
                    objArr[1] = str2;
                    objArr[2] = str;
                    objArr[3] = strArr != null ? Arrays.toString(strArr) : null;
                    Log.i("ffmpeg-kit-flutter", String.format("Failed to selectDocument using parameters writable: %s, type: %s, title: %s and extra types: %s!", objArr), e10);
                    this.f15558s.m16416e(result, "SELECT_FAILED", e10.getMessage());
                    return;
                }
            }
            Object[] objArr2 = new Object[4];
            objArr2[0] = bool;
            objArr2[1] = str2;
            objArr2[2] = str;
            objArr2[3] = strArr != null ? Arrays.toString(strArr) : null;
            Log.w("ffmpeg-kit-flutter", String.format("Cannot selectDocument using parameters writable: %s, type: %s, title: %s and extra types: %s. Activity is null.", objArr2));
            c4281e = this.f15558s;
            str3 = "INVALID_ACTIVITY";
            str4 = "Activity is null.";
        } else {
            Object[] objArr3 = new Object[4];
            objArr3[0] = bool;
            objArr3[1] = str2;
            objArr3[2] = str;
            objArr3[3] = strArr != null ? Arrays.toString(strArr) : null;
            Log.w("ffmpeg-kit-flutter", String.format("Cannot selectDocument using parameters writable: %s, type: %s, title: %s and extra types: %s. Context is null.", objArr3));
            c4281e = this.f15558s;
            str3 = "INVALID_CONTEXT";
            str4 = "Context is null.";
        }
        c4281e.m16416e(result, str3, str4);
    }

    /* renamed from: s */
    public void m16501s() {
        this.f15547h.compareAndSet(true, false);
    }

    /* renamed from: s0 */
    public void m16502s0(String str, String str2, MethodChannel.Result result) {
        FFmpegKitConfig.m4632P(str, str2);
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: t */
    public void m16503t(MethodChannel.Result result) {
        m16501s();
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: t0 */
    public void m16504t0(String str, Map<String, String> map, MethodChannel.Result result) {
        Context context = this.f15553n;
        if (context != null) {
            FFmpegKitConfig.m4633Q(context, str, map);
            this.f15558s.m16420m(result, null);
        } else {
            Log.w("ffmpeg-kit-flutter", "Cannot setFontDirectory. Context is null.");
            this.f15558s.m16416e(result, "INVALID_CONTEXT", "Context is null.");
        }
    }

    /* renamed from: u */
    public void m16505u(MethodChannel.Result result) {
        FFmpegKitConfig.m4648j();
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: u0 */
    public void m16506u0(List<String> list, Map<String, String> map, MethodChannel.Result result) {
        Context context = this.f15553n;
        if (context != null) {
            FFmpegKitConfig.m4634R(context, list, map);
            this.f15558s.m16420m(result, null);
        } else {
            Log.w("ffmpeg-kit-flutter", "Cannot setFontDirectoryList. Context is null.");
            this.f15558s.m16416e(result, "INVALID_CONTEXT", "Context is null.");
        }
    }

    /* renamed from: v */
    public void m16507v() {
        this.f15548i.compareAndSet(true, false);
    }

    /* renamed from: v0 */
    public void m16508v0(String str, MethodChannel.Result result) {
        FFmpegKitConfig.m4635S(str);
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: w */
    public void m16509w(MethodChannel.Result result) {
        m16507v();
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: w0 */
    public void m16510w0(Integer num, MethodChannel.Result result) {
        FFmpegKitConfig.m4636T(EnumC4143m.m15967c(num.intValue()));
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: x */
    public void m16511x(C4144n c4144n) {
        HashMap hashMap = new HashMap();
        hashMap.put("FFmpegKitLogCallbackEvent", m16427G0(c4144n));
        this.f15558s.m16419l(this.f15557r, hashMap);
    }

    /* renamed from: x0 */
    public void m16512x0(Integer num, MethodChannel.Result result) {
        FFmpegKitConfig.m4637U(m16424D0(num.intValue()));
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: y */
    public void m16513y(InterfaceC4154x interfaceC4154x) {
        HashMap hashMap = new HashMap();
        hashMap.put("FFmpegKitCompleteCallbackEvent", m16429I0(interfaceC4154x));
        this.f15558s.m16419l(this.f15557r, hashMap);
    }

    /* renamed from: y0 */
    public void m16514y0(Integer num, MethodChannel.Result result) {
        FFmpegKitConfig.m4638V(num.intValue());
        this.f15558s.m16420m(result, null);
    }

    /* renamed from: z */
    public void m16515z(C4129a0 c4129a0) {
        HashMap hashMap = new HashMap();
        hashMap.put("FFmpegKitStatisticsCallbackEvent", m16430J0(c4129a0));
        this.f15558s.m16419l(this.f15557r, hashMap);
    }
}
