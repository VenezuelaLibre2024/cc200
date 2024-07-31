package p056df;

import ae.C0099e;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import td.C4747g;
import td.C4753m;

/* renamed from: df.b */
/* loaded from: classes2.dex */
public final class C1626b implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: j */
    public static final a f5969j = new a(null);

    /* renamed from: h */
    public Context f5970h;

    /* renamed from: i */
    public final List<C1631g> f5971i = new ArrayList();

    /* renamed from: df.b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: c */
    public static final boolean m6487c(File file, String str) {
        C4753m.m18652e(str, "name");
        return new C0099e("sound(.*)pool").m410a(str);
    }

    /* renamed from: b */
    public final void m6488b(Context context, BinaryMessenger binaryMessenger) {
        String[] list;
        Context applicationContext = context.getApplicationContext();
        C4753m.m18652e(applicationContext, "context.applicationContext");
        this.f5970h = applicationContext;
        new MethodChannel(binaryMessenger, "pl.ukaszapps/soundpool").setMethodCallHandler(this);
        Context context2 = this.f5970h;
        if (context2 == null) {
            C4753m.m18667t("application");
            context2 = null;
        }
        File cacheDir = context2.getCacheDir();
        if (cacheDir == null || (list = cacheDir.list(new FilenameFilter() { // from class: df.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m6487c;
                m6487c = C1626b.m6487c(file, str);
                return m6487c;
            }
        })) == null) {
            return;
        }
        C4753m.m18652e(list, "list { _, name -> name.m…und(.*)pool\".toRegex()) }");
        for (String str : list) {
            new File(cacheDir, str).delete();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        C4753m.m18652e(applicationContext, "binding.applicationContext");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        C4753m.m18652e(binaryMessenger, "binding.binaryMessenger");
        m6488b(applicationContext, binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        Iterator<T> it = this.f5971i.iterator();
        while (it.hasNext()) {
            ((C1631g) it.next()).m6500h();
        }
        this.f5971i.clear();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        int i10;
        C4753m.m18653f(methodCall, "call");
        C4753m.m18653f(result, "result");
        String str = methodCall.method;
        Context context = null;
        if (!C4753m.m18648a(str, "initSoundpool")) {
            if (!C4753m.m18648a(str, "dispose")) {
                Object obj = methodCall.arguments;
                C4753m.m18651d(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                Object obj2 = ((Map) obj).get("poolId");
                C4753m.m18651d(obj2, "null cannot be cast to non-null type kotlin.Int");
                this.f5971i.get(((Integer) obj2).intValue()).m6501k(methodCall, result);
                return;
            }
            Object obj3 = methodCall.arguments;
            C4753m.m18651d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
            Object obj4 = ((Map) obj3).get("poolId");
            C4753m.m18650c(obj4);
            int intValue = ((Number) obj4).intValue();
            this.f5971i.get(intValue).m6500h();
            this.f5971i.remove(intValue);
            result.success(null);
            return;
        }
        Object obj5 = methodCall.arguments;
        C4753m.m18651d(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
        Map map = (Map) obj5;
        Integer num = (Integer) map.get("streamType");
        Integer num2 = (Integer) map.get("maxStreams");
        int intValue2 = num2 != null ? num2.intValue() : 1;
        int i11 = 3;
        if (num != null && num.intValue() == 0) {
            i11 = 2;
        } else if (num != null && num.intValue() == 1) {
            i11 = 4;
        } else if (num == null || num.intValue() != 2) {
            i11 = (num != null && num.intValue() == 3) ? 5 : -1;
        }
        if (i11 > -1) {
            Context context2 = this.f5970h;
            if (context2 == null) {
                C4753m.m18667t("application");
            } else {
                context = context2;
            }
            C1631g c1631g = new C1631g(context, intValue2, i11);
            int size = this.f5971i.size();
            this.f5971i.add(c1631g);
            i10 = Integer.valueOf(size);
        } else {
            i10 = -1;
        }
        result.success(i10);
    }
}
