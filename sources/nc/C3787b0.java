package nc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p213oc.C3983a;
import p228pc.C4112d;

/* renamed from: nc.b0 */
/* loaded from: classes2.dex */
public class C3787b0 implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: o */
    public static String f13647o;

    /* renamed from: s */
    public static InterfaceC3801n f13651s;

    /* renamed from: h */
    public Context f13652h;

    /* renamed from: i */
    public MethodChannel f13653i;

    /* renamed from: j */
    public static final Map<String, Integer> f13642j = new HashMap();

    /* renamed from: k */
    @SuppressLint({"UseSparseArrays"})
    public static final Map<Integer, C3796i> f13643k = new HashMap();

    /* renamed from: l */
    public static final Object f13644l = new Object();

    /* renamed from: m */
    public static final Object f13645m = new Object();

    /* renamed from: n */
    public static int f13646n = 0;

    /* renamed from: p */
    public static int f13648p = 0;

    /* renamed from: q */
    public static int f13649q = 1;

    /* renamed from: r */
    public static int f13650r = 0;

    /* renamed from: nc.b0$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ C3796i f13654h;

        /* renamed from: i */
        public final /* synthetic */ MethodChannel.Result f13655i;

        public a(C3796i c3796i, MethodChannel.Result result) {
            this.f13654h = c3796i;
            this.f13655i = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C3787b0.f13645m) {
                C3787b0.this.m14427l(this.f13654h);
            }
            this.f13655i.success(null);
        }
    }

    /* renamed from: nc.b0$b */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ C3796i f13657h;

        /* renamed from: i */
        public final /* synthetic */ String f13658i;

        /* renamed from: j */
        public final /* synthetic */ MethodChannel.Result f13659j;

        public b(C3796i c3796i, String str, MethodChannel.Result result) {
            this.f13657h = c3796i;
            this.f13658i = str;
            this.f13659j = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C3787b0.f13645m) {
                C3796i c3796i = this.f13657h;
                if (c3796i != null) {
                    C3787b0.this.m14427l(c3796i);
                }
                try {
                    if (C3804q.m14512c(C3787b0.f13646n)) {
                        Log.d("Sqflite", "delete database " + this.f13658i);
                    }
                    C3796i.m14458o(this.f13658i);
                } catch (Exception e10) {
                    Log.e("Sqflite", "error " + e10 + " while closing database " + C3787b0.f13650r);
                }
            }
            this.f13659j.success(null);
        }
    }

    /* renamed from: o */
    public static boolean m14403o(String str) {
        return str == null || str.equals(":memory:");
    }

    /* renamed from: q */
    public static /* synthetic */ void m14405q(MethodCall methodCall, MethodChannel.Result result, C3796i c3796i) {
        c3796i.m14485v(new C4112d(methodCall, result));
    }

    /* renamed from: r */
    public static /* synthetic */ void m14406r(MethodCall methodCall, MethodChannel.Result result, C3796i c3796i) {
        c3796i.m14465E(new C4112d(methodCall, result));
    }

    /* renamed from: s */
    public static /* synthetic */ void m14407s(boolean z10, String str, MethodChannel.Result result, Boolean bool, C3796i c3796i, MethodCall methodCall, boolean z11, int i10) {
        synchronized (f13645m) {
            if (!z10) {
                try {
                    File file = new File(new File(str).getParent());
                    if (!file.exists() && !file.mkdirs() && !file.exists()) {
                        result.error("sqlite_error", "open_failed " + str, null);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                if (Boolean.TRUE.equals(bool)) {
                    c3796i.m14468N();
                } else {
                    c3796i.m14467M();
                }
                synchronized (f13644l) {
                    if (z11) {
                        f13642j.put(str, Integer.valueOf(i10));
                    }
                    f13643k.put(Integer.valueOf(i10), c3796i);
                }
                if (C3804q.m14511b(c3796i.f13678d)) {
                    Log.d("Sqflite", c3796i.m14461A() + "opened " + i10 + " " + str);
                }
                result.success(m14412x(i10, false, false));
            } catch (Exception e10) {
                c3796i.m14464D(e10, new C4112d(methodCall, result));
            }
        }
    }

    /* renamed from: t */
    public static /* synthetic */ void m14408t(MethodCall methodCall, MethodChannel.Result result, C3796i c3796i) {
        c3796i.m14469O(new C4112d(methodCall, result));
    }

    /* renamed from: u */
    public static /* synthetic */ void m14409u(MethodCall methodCall, MethodChannel.Result result, C3796i c3796i) {
        c3796i.m14470P(new C4112d(methodCall, result));
    }

    /* renamed from: v */
    public static /* synthetic */ void m14410v(MethodCall methodCall, C3796i c3796i, MethodChannel.Result result) {
        try {
            c3796i.f13683i.setLocale(C3791d0.m14442e((String) methodCall.argument("locale")));
            result.success(null);
        } catch (Exception e10) {
            result.error("sqlite_error", "Error calling setLocale: " + e10.getMessage(), null);
        }
    }

    /* renamed from: w */
    public static /* synthetic */ void m14411w(MethodCall methodCall, MethodChannel.Result result, C3796i c3796i) {
        c3796i.m14472R(new C4112d(methodCall, result));
    }

    /* renamed from: x */
    public static Map m14412x(int i10, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i10));
        if (z10) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z11) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    /* renamed from: A */
    public final void m14413A(MethodCall methodCall, MethodChannel.Result result) {
        int intValue = ((Integer) methodCall.argument("id")).intValue();
        C3796i m14429n = m14429n(methodCall, result);
        if (m14429n == null) {
            return;
        }
        if (C3804q.m14511b(m14429n.f13678d)) {
            Log.d("Sqflite", m14429n.m14461A() + "closing " + intValue + " " + m14429n.f13676b);
        }
        String str = m14429n.f13676b;
        synchronized (f13644l) {
            f13643k.remove(Integer.valueOf(intValue));
            if (m14429n.f13675a) {
                f13642j.remove(str);
            }
        }
        f13651s.m14503d(m14429n, new a(m14429n, result));
    }

    /* renamed from: B */
    public final void m14414B(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(C3796i.m14459x((String) methodCall.argument("path"))));
    }

    /* renamed from: C */
    public final void m14415C(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("cmd");
        HashMap hashMap = new HashMap();
        if ("get".equals(str)) {
            int i10 = f13646n;
            if (i10 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i10));
            }
            Map<Integer, C3796i> map = f13643k;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Integer, C3796i> entry : map.entrySet()) {
                    C3796i value = entry.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", value.f13676b);
                    hashMap3.put("singleInstance", Boolean.valueOf(value.f13675a));
                    int i11 = value.f13678d;
                    if (i11 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i11));
                    }
                    hashMap2.put(entry.getKey().toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        result.success(hashMap);
    }

    /* renamed from: D */
    public final void m14416D(MethodCall methodCall, MethodChannel.Result result) {
        C3983a.f14362a = Boolean.TRUE.equals(methodCall.arguments());
        C3983a.f14364c = C3983a.f14363b && C3983a.f14362a;
        if (!C3983a.f14362a) {
            f13646n = 0;
        } else if (C3983a.f14364c) {
            f13646n = 2;
        } else if (C3983a.f14362a) {
            f13646n = 1;
        }
        result.success(null);
    }

    /* renamed from: E */
    public final void m14417E(MethodCall methodCall, MethodChannel.Result result) {
        C3796i c3796i;
        Map<Integer, C3796i> map;
        String str = (String) methodCall.argument("path");
        synchronized (f13644l) {
            if (C3804q.m14512c(f13646n)) {
                Log.d("Sqflite", "Look for " + str + " in " + f13642j.keySet());
            }
            Map<String, Integer> map2 = f13642j;
            Integer num = map2.get(str);
            if (num == null || (c3796i = (map = f13643k).get(num)) == null || !c3796i.f13683i.isOpen()) {
                c3796i = null;
            } else {
                if (C3804q.m14512c(f13646n)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c3796i.m14461A());
                    sb2.append("found single instance ");
                    sb2.append(c3796i.m14466F() ? "(in transaction) " : "");
                    sb2.append(num);
                    sb2.append(" ");
                    sb2.append(str);
                    Log.d("Sqflite", sb2.toString());
                }
                map.remove(num);
                map2.remove(str);
            }
        }
        b bVar = new b(c3796i, str, result);
        InterfaceC3801n interfaceC3801n = f13651s;
        if (interfaceC3801n != null) {
            interfaceC3801n.m14503d(c3796i, bVar);
        } else {
            bVar.run();
        }
    }

    /* renamed from: F */
    public final void m14418F(final MethodCall methodCall, final MethodChannel.Result result) {
        final C3796i m14429n = m14429n(methodCall, result);
        if (m14429n == null) {
            return;
        }
        f13651s.m14503d(m14429n, new Runnable() { // from class: nc.w
            @Override // java.lang.Runnable
            public final void run() {
                C3787b0.m14405q(MethodCall.this, result, m14429n);
            }
        });
    }

    /* renamed from: G */
    public void m14419G(MethodCall methodCall, MethodChannel.Result result) {
        if (f13647o == null) {
            f13647o = this.f13652h.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        result.success(f13647o);
    }

    /* renamed from: H */
    public final void m14420H(final MethodCall methodCall, final MethodChannel.Result result) {
        final C3796i m14429n = m14429n(methodCall, result);
        if (m14429n == null) {
            return;
        }
        f13651s.m14503d(m14429n, new Runnable() { // from class: nc.u
            @Override // java.lang.Runnable
            public final void run() {
                C3787b0.m14406r(MethodCall.this, result, m14429n);
            }
        });
    }

    /* renamed from: I */
    public final void m14421I(final MethodCall methodCall, final MethodChannel.Result result) {
        final int i10;
        C3796i c3796i;
        final String str = (String) methodCall.argument("path");
        final Boolean bool = (Boolean) methodCall.argument("readOnly");
        final boolean m14403o = m14403o(str);
        boolean z10 = (Boolean.FALSE.equals(methodCall.argument("singleInstance")) || m14403o) ? false : true;
        if (z10) {
            synchronized (f13644l) {
                if (C3804q.m14512c(f13646n)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f13642j.keySet());
                }
                Integer num = f13642j.get(str);
                if (num != null && (c3796i = f13643k.get(num)) != null) {
                    if (c3796i.f13683i.isOpen()) {
                        if (C3804q.m14512c(f13646n)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c3796i.m14461A());
                            sb2.append("re-opened single instance ");
                            sb2.append(c3796i.m14466F() ? "(in transaction) " : "");
                            sb2.append(num);
                            sb2.append(" ");
                            sb2.append(str);
                            Log.d("Sqflite", sb2.toString());
                        }
                        result.success(m14412x(num.intValue(), true, c3796i.m14466F()));
                        return;
                    }
                    if (C3804q.m14512c(f13646n)) {
                        Log.d("Sqflite", c3796i.m14461A() + "single instance database of " + str + " not opened");
                    }
                }
            }
        }
        Object obj = f13644l;
        synchronized (obj) {
            i10 = f13650r + 1;
            f13650r = i10;
        }
        final C3796i c3796i2 = new C3796i(this.f13652h, str, i10, z10, f13646n);
        synchronized (obj) {
            if (f13651s == null) {
                InterfaceC3801n m14500b = InterfaceC3801n.m14500b("Sqflite", f13649q, f13648p);
                f13651s = m14500b;
                m14500b.start();
                if (C3804q.m14511b(c3796i2.f13678d)) {
                    Log.d("Sqflite", c3796i2.m14461A() + "starting worker pool with priority " + f13648p);
                }
            }
            c3796i2.f13682h = f13651s;
            if (C3804q.m14511b(c3796i2.f13678d)) {
                Log.d("Sqflite", c3796i2.m14461A() + "opened " + i10 + " " + str);
            }
            final boolean z11 = z10;
            f13651s.m14503d(c3796i2, new Runnable() { // from class: nc.a0
                @Override // java.lang.Runnable
                public final void run() {
                    C3787b0.m14407s(m14403o, str, result, bool, c3796i2, methodCall, z11, i10);
                }
            });
        }
    }

    /* renamed from: J */
    public void m14422J(MethodCall methodCall, MethodChannel.Result result) {
        Object argument = methodCall.argument("androidThreadPriority");
        if (argument != null) {
            f13648p = ((Integer) argument).intValue();
        }
        Object argument2 = methodCall.argument("androidThreadCount");
        if (argument2 != null && !argument2.equals(Integer.valueOf(f13649q))) {
            f13649q = ((Integer) argument2).intValue();
            InterfaceC3801n interfaceC3801n = f13651s;
            if (interfaceC3801n != null) {
                interfaceC3801n.mo14502c();
                f13651s = null;
            }
        }
        Integer m14510a = C3804q.m14510a(methodCall);
        if (m14510a != null) {
            f13646n = m14510a.intValue();
        }
        result.success(null);
    }

    /* renamed from: K */
    public final void m14423K(final MethodCall methodCall, final MethodChannel.Result result) {
        final C3796i m14429n = m14429n(methodCall, result);
        if (m14429n == null) {
            return;
        }
        f13651s.m14503d(m14429n, new Runnable() { // from class: nc.t
            @Override // java.lang.Runnable
            public final void run() {
                C3787b0.m14408t(MethodCall.this, result, m14429n);
            }
        });
    }

    /* renamed from: L */
    public final void m14424L(final MethodCall methodCall, final MethodChannel.Result result) {
        final C3796i m14429n = m14429n(methodCall, result);
        if (m14429n == null) {
            return;
        }
        f13651s.m14503d(m14429n, new Runnable() { // from class: nc.x
            @Override // java.lang.Runnable
            public final void run() {
                C3787b0.m14409u(MethodCall.this, result, m14429n);
            }
        });
    }

    /* renamed from: M */
    public final void m14425M(final MethodCall methodCall, final MethodChannel.Result result) {
        final C3796i m14429n = m14429n(methodCall, result);
        if (m14429n == null) {
            return;
        }
        f13651s.m14503d(m14429n, new Runnable() { // from class: nc.y
            @Override // java.lang.Runnable
            public final void run() {
                C3787b0.m14410v(MethodCall.this, m14429n, result);
            }
        });
    }

    /* renamed from: N */
    public final void m14426N(final MethodCall methodCall, final MethodChannel.Result result) {
        final C3796i m14429n = m14429n(methodCall, result);
        if (m14429n == null) {
            return;
        }
        f13651s.m14503d(m14429n, new Runnable() { // from class: nc.v
            @Override // java.lang.Runnable
            public final void run() {
                C3787b0.m14411w(MethodCall.this, result, m14429n);
            }
        });
    }

    /* renamed from: l */
    public final void m14427l(C3796i c3796i) {
        try {
            if (C3804q.m14511b(c3796i.f13678d)) {
                Log.d("Sqflite", c3796i.m14461A() + "closing database ");
            }
            c3796i.m14475k();
        } catch (Exception e10) {
            Log.e("Sqflite", "error " + e10 + " while closing database " + f13650r);
        }
        synchronized (f13644l) {
            if (f13643k.isEmpty() && f13651s != null) {
                if (C3804q.m14511b(c3796i.f13678d)) {
                    Log.d("Sqflite", c3796i.m14461A() + "stopping thread");
                }
                f13651s.mo14502c();
                f13651s = null;
            }
        }
    }

    /* renamed from: m */
    public final C3796i m14428m(int i10) {
        return f13643k.get(Integer.valueOf(i10));
    }

    /* renamed from: n */
    public final C3796i m14429n(MethodCall methodCall, MethodChannel.Result result) {
        int intValue = ((Integer) methodCall.argument("id")).intValue();
        C3796i m14428m = m14428m(intValue);
        if (m14428m != null) {
            return m14428m;
        }
        result.error("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m14430y(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f13652h = null;
        this.f13653i.setMethodCallHandler(null);
        this.f13653i = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c10 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c10 = 4;
                    break;
                }
                break;
            case -396289107:
                if (str.equals("androidSetLocale")) {
                    c10 = 5;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c10 = 6;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c10 = 7;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c10 = 11;
                    break;
                }
                break;
            case 956410295:
                if (str.equals("databaseExists")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1193546321:
                if (str.equals("queryCursorNext")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c10 = 15;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                m14418F(methodCall, result);
                return;
            case 1:
                m14413A(methodCall, result);
                return;
            case 2:
                m14422J(methodCall, result);
                return;
            case 3:
                m14420H(methodCall, result);
                return;
            case 4:
                m14426N(methodCall, result);
                return;
            case 5:
                m14425M(methodCall, result);
                return;
            case 6:
                m14417E(methodCall, result);
                return;
            case 7:
                m14416D(methodCall, result);
                return;
            case '\b':
                m14421I(methodCall, result);
                return;
            case '\t':
                m14431z(methodCall, result);
                return;
            case '\n':
                m14415C(methodCall, result);
                return;
            case 11:
                m14423K(methodCall, result);
                return;
            case '\f':
                m14414B(methodCall, result);
                return;
            case '\r':
                m14424L(methodCall, result);
                return;
            case 14:
                result.success("Android " + Build.VERSION.RELEASE);
                return;
            case 15:
                m14419G(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    /* renamed from: y */
    public final void m14430y(Context context, BinaryMessenger binaryMessenger) {
        this.f13652h = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.tekartik.sqflite", StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        this.f13653i = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* renamed from: z */
    public final void m14431z(final MethodCall methodCall, final MethodChannel.Result result) {
        final C3796i m14429n = m14429n(methodCall, result);
        if (m14429n == null) {
            return;
        }
        f13651s.m14503d(m14429n, new Runnable() { // from class: nc.z
            @Override // java.lang.Runnable
            public final void run() {
                C3796i.this.m14474h(methodCall, result);
            }
        });
    }
}
