package vn.hunghd.flutterdownloader;

import ae.C0109o;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.work.C0417b;
import gd.C2245s;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p029c2.AbstractC0602t;
import p029c2.AbstractC0603u;
import p029c2.C0584b;
import p029c2.C0594l;
import p029c2.EnumC0583a;
import p029c2.EnumC0593k;
import p088ff.C1923b;
import p088ff.C1927f;
import p088ff.C1929h;
import p088ff.EnumC1922a;
import p329x.C5497o;
import td.C4747g;
import td.C4753m;

/* renamed from: vn.hunghd.flutterdownloader.a */
/* loaded from: classes2.dex */
public final class C5180a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: p */
    public static final a f19555p = new a(null);

    /* renamed from: h */
    public MethodChannel f19556h;

    /* renamed from: i */
    public C1929h f19557i;

    /* renamed from: j */
    public Context f19558j;

    /* renamed from: k */
    public long f19559k;

    /* renamed from: l */
    public int f19560l;

    /* renamed from: m */
    public int f19561m;

    /* renamed from: n */
    public int f19562n;

    /* renamed from: o */
    public final Object f19563o = new Object();

    /* renamed from: vn.hunghd.flutterdownloader.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: a */
    public final AbstractC0603u m20990a(String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, boolean z15) {
        C0594l m2998b = new C0594l.a(DownloadWorker.class).m3000f(new C0584b.a().m2955c(z13).m2954b(z15 ? EnumC0593k.CONNECTED : EnumC0593k.UNMETERED).m2953a()).m2997a("flutter_download_task").m2999e(EnumC0583a.EXPONENTIAL, 10L, TimeUnit.SECONDS).m3001g(new C0417b.a().m2125h(WebViewActivity.URL_EXTRA, str).m2125h("saved_file", str2).m2125h("file_name", str3).m2125h("headers", str4).m2122e("show_notification", z10).m2122e("open_file_from_notification", z11).m2122e("is_resume", z12).m2124g("callback_handle", this.f19559k).m2123f("step", this.f19560l).m2122e("debug", this.f19561m == 1).m2122e("ignoreSsl", this.f19562n == 1).m2122e("save_in_public_storage", z14).m2123f("timeout", i10).m2118a()).m2998b();
        C4753m.m18652e(m2998b, "Builder(DownloadWorker::…   )\n            .build()");
        return m2998b;
    }

    /* renamed from: b */
    public final void m20991b(MethodCall methodCall, MethodChannel.Result result) {
        AbstractC0602t.m2987e(m21004o()).mo2990b(UUID.fromString((String) m21003n(methodCall, "task_id")));
        result.success(null);
    }

    /* renamed from: c */
    public final void m20992c(MethodChannel.Result result) {
        AbstractC0602t.m2987e(m21004o()).mo2989a("flutter_download_task");
        result.success(null);
    }

    /* renamed from: d */
    public final void m20993d(File file) {
        String[] strArr = {"_id"};
        String absolutePath = file.getAbsolutePath();
        C4753m.m18652e(absolutePath, "file.absolutePath");
        String[] strArr2 = {absolutePath};
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        C4753m.m18652e(uri, "EXTERNAL_CONTENT_URI");
        ContentResolver contentResolver = m21004o().getContentResolver();
        C4753m.m18652e(contentResolver, "requireContext().contentResolver");
        Cursor query = contentResolver.query(uri, strArr, "_data = ?", strArr2, null);
        if (query == null || !query.moveToFirst()) {
            Cursor query2 = contentResolver.query(uri, strArr, "_data = ?", strArr2, null);
            if (query2 != null && query2.moveToFirst()) {
                Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query2.getLong(query2.getColumnIndexOrThrow("_id")));
                C4753m.m18652e(withAppendedId, "withAppendedId(MediaStor…EXTERNAL_CONTENT_URI, id)");
                contentResolver.delete(withAppendedId, null, null);
            }
            if (query2 != null) {
                query2.close();
            }
        } else {
            Uri withAppendedId2 = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow("_id")));
            C4753m.m18652e(withAppendedId2, "withAppendedId(MediaStor…EXTERNAL_CONTENT_URI, id)");
            contentResolver.delete(withAppendedId2, null, null);
        }
        if (query != null) {
            query.close();
        }
    }

    /* renamed from: e */
    public final void m20994e(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) m21003n(methodCall, WebViewActivity.URL_EXTRA);
        String str2 = (String) m21003n(methodCall, "saved_dir");
        String str3 = (String) methodCall.argument("file_name");
        String str4 = (String) m21003n(methodCall, "headers");
        int intValue = ((Number) m21003n(methodCall, "timeout")).intValue();
        boolean booleanValue = ((Boolean) m21003n(methodCall, "show_notification")).booleanValue();
        boolean booleanValue2 = ((Boolean) m21003n(methodCall, "open_file_from_notification")).booleanValue();
        boolean booleanValue3 = ((Boolean) m21003n(methodCall, "requires_storage_not_low")).booleanValue();
        boolean booleanValue4 = ((Boolean) m21003n(methodCall, "save_in_public_storage")).booleanValue();
        boolean booleanValue5 = ((Boolean) m21003n(methodCall, "allow_cellular")).booleanValue();
        AbstractC0603u m20990a = m20990a(str, str2, str3, str4, booleanValue, booleanValue2, false, booleanValue3, booleanValue4, intValue, booleanValue5);
        AbstractC0602t.m2987e(m21004o()).m2991c(m20990a);
        String uuid = m20990a.m2993a().toString();
        C4753m.m18652e(uuid, "request.id.toString()");
        result.success(uuid);
        EnumC1922a enumC1922a = EnumC1922a.ENQUEUED;
        m21007r(uuid, enumC1922a, 0);
        C1929h c1929h = this.f19557i;
        C4753m.m18650c(c1929h);
        c1929h.m7836b(uuid, str, enumC1922a, 0, str3, str2, str4, booleanValue, booleanValue2, booleanValue4, booleanValue5);
    }

    /* renamed from: f */
    public final void m20995f(MethodCall methodCall, MethodChannel.Result result) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putLong;
        Object obj = methodCall.arguments;
        C4753m.m18651d(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        long parseLong = Long.parseLong(String.valueOf(list.get(0)));
        this.f19561m = Integer.parseInt(String.valueOf(list.get(1)));
        this.f19562n = Integer.parseInt(String.valueOf(list.get(2)));
        Context context = this.f19558j;
        SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("vn.hunghd.downloader.pref", 0) : null;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putLong = edit.putLong("callback_dispatcher_handle_key", parseLong)) != null) {
            putLong.apply();
        }
        result.success(null);
    }

    /* renamed from: g */
    public final void m20996g(MethodChannel.Result result) {
        C1929h c1929h = this.f19557i;
        C4753m.m18650c(c1929h);
        List<C1923b> m7837c = c1929h.m7837c();
        ArrayList arrayList = new ArrayList();
        for (C1923b c1923b : m7837c) {
            HashMap hashMap = new HashMap();
            hashMap.put("task_id", c1923b.m7829m());
            hashMap.put("status", Integer.valueOf(c1923b.m7828l().ordinal()));
            hashMap.put("progress", Integer.valueOf(c1923b.m7823g()));
            hashMap.put(WebViewActivity.URL_EXTRA, c1923b.m7831o());
            hashMap.put("file_name", c1923b.m7818b());
            hashMap.put("saved_dir", c1923b.m7826j());
            hashMap.put("time_created", Long.valueOf(c1923b.m7830n()));
            hashMap.put("allow_cellular", Boolean.valueOf(c1923b.m7817a()));
            arrayList.add(hashMap);
        }
        result.success(arrayList);
    }

    /* renamed from: h */
    public final void m20997h(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) m21003n(methodCall, "query");
        C1929h c1929h = this.f19557i;
        C4753m.m18650c(c1929h);
        List<C1923b> m7839e = c1929h.m7839e(str);
        ArrayList arrayList = new ArrayList();
        for (C1923b c1923b : m7839e) {
            HashMap hashMap = new HashMap();
            hashMap.put("task_id", c1923b.m7829m());
            hashMap.put("status", Integer.valueOf(c1923b.m7828l().ordinal()));
            hashMap.put("progress", Integer.valueOf(c1923b.m7823g()));
            hashMap.put(WebViewActivity.URL_EXTRA, c1923b.m7831o());
            hashMap.put("file_name", c1923b.m7818b());
            hashMap.put("saved_dir", c1923b.m7826j());
            hashMap.put("time_created", Long.valueOf(c1923b.m7830n()));
            hashMap.put("allow_cellular", Boolean.valueOf(c1923b.m7817a()));
            arrayList.add(hashMap);
        }
        result.success(arrayList);
    }

    /* renamed from: i */
    public final void m20998i(Context context, BinaryMessenger binaryMessenger) {
        synchronized (this.f19563o) {
            if (this.f19556h != null) {
                return;
            }
            this.f19558j = context;
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "vn.hunghd/downloader");
            this.f19556h = methodChannel;
            methodChannel.setMethodCallHandler(this);
            this.f19557i = new C1929h(C5181b.f19564h.m21010a(this.f19558j));
            C2245s c2245s = C2245s.f8873a;
        }
    }

    /* renamed from: j */
    public final void m20999j(MethodCall methodCall, MethodChannel.Result result) {
        Boolean bool;
        String str = (String) m21003n(methodCall, "task_id");
        C1929h c1929h = this.f19557i;
        C4753m.m18650c(c1929h);
        C1923b m7838d = c1929h.m7838d(str);
        if (m7838d == null) {
            result.error("invalid_task_id", "not found task with id " + str, null);
            return;
        }
        if (m7838d.m7828l() != EnumC1922a.COMPLETE) {
            result.error("invalid_status", "only completed tasks can be opened", null);
            return;
        }
        String m7831o = m7838d.m7831o();
        String m7826j = m7838d.m7826j();
        String m7818b = m7838d.m7818b();
        if (m7818b == null) {
            m7818b = m7831o.substring(C0109o.m443J(m7831o, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 0, false, 6, null) + 1, m7831o.length());
            C4753m.m18652e(m7818b, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Intent m7834c = C1927f.f7304a.m7834c(m21004o(), m7826j + File.separator + m7818b, m7838d.m7820d());
        if (m7834c != null) {
            m21004o().startActivity(m7834c);
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        result.success(bool);
    }

    /* renamed from: k */
    public final void m21000k(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) m21003n(methodCall, "task_id");
        C1929h c1929h = this.f19557i;
        C4753m.m18650c(c1929h);
        c1929h.m7844j(str, true);
        AbstractC0602t.m2987e(m21004o()).mo2990b(UUID.fromString(str));
        result.success(null);
    }

    /* renamed from: l */
    public final void m21001l(MethodCall methodCall, MethodChannel.Result result) {
        Object obj = methodCall.arguments;
        C4753m.m18651d(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        this.f19559k = Long.parseLong(String.valueOf(list.get(0)));
        this.f19560l = Integer.parseInt(String.valueOf(list.get(1)));
        result.success(null);
    }

    /* renamed from: m */
    public final void m21002m(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) m21003n(methodCall, "task_id");
        boolean booleanValue = ((Boolean) m21003n(methodCall, "should_delete_content")).booleanValue();
        C1929h c1929h = this.f19557i;
        C4753m.m18650c(c1929h);
        C1923b m7838d = c1929h.m7838d(str);
        if (m7838d == null) {
            result.error("invalid_task_id", "not found task corresponding to given task id", null);
            return;
        }
        if (m7838d.m7828l() == EnumC1922a.ENQUEUED || m7838d.m7828l() == EnumC1922a.RUNNING) {
            AbstractC0602t.m2987e(m21004o()).mo2990b(UUID.fromString(str));
        }
        if (booleanValue) {
            String m7818b = m7838d.m7818b();
            if (m7818b == null) {
                m7818b = m7838d.m7831o().substring(C0109o.m443J(m7838d.m7831o(), FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 0, false, 6, null) + 1, m7838d.m7831o().length());
                C4753m.m18652e(m7818b, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            File file = new File(m7838d.m7826j() + File.separator + m7818b);
            if (file.exists()) {
                try {
                    m20993d(file);
                } catch (SecurityException unused) {
                    Log.d("FlutterDownloader", "Failed to delete file in media store, will fall back to normal delete()");
                }
                file.delete();
            }
        }
        C1929h c1929h2 = this.f19557i;
        C4753m.m18650c(c1929h2);
        c1929h2.m7835a(str);
        C5497o.m22067f(m21004o()).m22071b(m7838d.m7822f());
        result.success(null);
    }

    /* renamed from: n */
    public final <T> T m21003n(MethodCall methodCall, String str) {
        T t10 = (T) methodCall.argument(str);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(("Required key '" + str + "' was null").toString());
    }

    /* renamed from: o */
    public final Context m21004o() {
        Context context = this.f19558j;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        C4753m.m18652e(binaryMessenger, "binding.binaryMessenger");
        m20998i(applicationContext, binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        this.f19558j = null;
        MethodChannel methodChannel = this.f19556h;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f19556h = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C4753m.m18653f(methodCall, "call");
        C4753m.m18653f(result, "result");
        String str = methodCall.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1594257912:
                    if (str.equals("enqueue")) {
                        m20994e(methodCall, result);
                        return;
                    }
                    break;
                case -1367724422:
                    if (str.equals("cancel")) {
                        m20991b(methodCall, result);
                        return;
                    }
                    break;
                case -934610812:
                    if (str.equals("remove")) {
                        m21002m(methodCall, result);
                        return;
                    }
                    break;
                case -934426579:
                    if (str.equals("resume")) {
                        m21005p(methodCall, result);
                        return;
                    }
                    break;
                case -403218424:
                    if (str.equals("registerCallback")) {
                        m21001l(methodCall, result);
                        return;
                    }
                    break;
                case 3417674:
                    if (str.equals("open")) {
                        m20999j(methodCall, result);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        m21000k(methodCall, result);
                        return;
                    }
                    break;
                case 108405416:
                    if (str.equals("retry")) {
                        m21006q(methodCall, result);
                        return;
                    }
                    break;
                case 230377166:
                    if (str.equals("loadTasksWithRawQuery")) {
                        m20997h(methodCall, result);
                        return;
                    }
                    break;
                case 476547271:
                    if (str.equals("cancelAll")) {
                        m20992c(result);
                        return;
                    }
                    break;
                case 871091088:
                    if (str.equals("initialize")) {
                        m20995f(methodCall, result);
                        return;
                    }
                    break;
                case 1378870856:
                    if (str.equals("loadTasks")) {
                        m20996g(result);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    /* renamed from: p */
    public final void m21005p(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        String str2;
        String str3 = (String) m21003n(methodCall, "task_id");
        C1929h c1929h = this.f19557i;
        C4753m.m18650c(c1929h);
        C1923b m7838d = c1929h.m7838d(str3);
        boolean booleanValue = ((Boolean) m21003n(methodCall, "requires_storage_not_low")).booleanValue();
        int intValue = ((Number) m21003n(methodCall, "timeout")).intValue();
        if (m7838d == null) {
            str = "invalid_task_id";
            str2 = "not found task corresponding to given task id";
        } else if (m7838d.m7828l() == EnumC1922a.PAUSED) {
            String m7818b = m7838d.m7818b();
            if (m7818b == null) {
                m7818b = m7838d.m7831o().substring(C0109o.m443J(m7838d.m7831o(), FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 0, false, 6, null) + 1, m7838d.m7831o().length());
                C4753m.m18652e(m7818b, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (new File(m7838d.m7826j() + File.separator + m7818b).exists()) {
                AbstractC0603u m20990a = m20990a(m7838d.m7831o(), m7838d.m7826j(), m7838d.m7818b(), m7838d.m7819c(), m7838d.m7827k(), m7838d.m7821e(), true, booleanValue, m7838d.m7825i(), intValue, m7838d.m7817a());
                String uuid = m20990a.m2993a().toString();
                C4753m.m18652e(uuid, "request.id.toString()");
                result.success(uuid);
                EnumC1922a enumC1922a = EnumC1922a.RUNNING;
                m21007r(uuid, enumC1922a, m7838d.m7823g());
                C1929h c1929h2 = this.f19557i;
                C4753m.m18650c(c1929h2);
                c1929h2.m7842h(str3, uuid, enumC1922a, m7838d.m7823g(), false);
                AbstractC0602t.m2987e(m21004o()).m2991c(m20990a);
                return;
            }
            C1929h c1929h3 = this.f19557i;
            C4753m.m18650c(c1929h3);
            c1929h3.m7844j(str3, false);
            str = "invalid_data";
            str2 = "not found partial downloaded data, this task cannot be resumed";
        } else {
            str = "invalid_status";
            str2 = "only paused task can be resumed";
        }
        result.error(str, str2, null);
    }

    /* renamed from: q */
    public final void m21006q(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        String str2;
        String str3 = (String) m21003n(methodCall, "task_id");
        C1929h c1929h = this.f19557i;
        C4753m.m18650c(c1929h);
        C1923b m7838d = c1929h.m7838d(str3);
        boolean booleanValue = ((Boolean) m21003n(methodCall, "requires_storage_not_low")).booleanValue();
        int intValue = ((Number) m21003n(methodCall, "timeout")).intValue();
        if (m7838d == null) {
            str = "invalid_task_id";
            str2 = "not found task corresponding to given task id";
        } else {
            if (m7838d.m7828l() == EnumC1922a.FAILED || m7838d.m7828l() == EnumC1922a.CANCELED) {
                AbstractC0603u m20990a = m20990a(m7838d.m7831o(), m7838d.m7826j(), m7838d.m7818b(), m7838d.m7819c(), m7838d.m7827k(), m7838d.m7821e(), false, booleanValue, m7838d.m7825i(), intValue, m7838d.m7817a());
                String uuid = m20990a.m2993a().toString();
                C4753m.m18652e(uuid, "request.id.toString()");
                result.success(uuid);
                EnumC1922a enumC1922a = EnumC1922a.ENQUEUED;
                m21007r(uuid, enumC1922a, m7838d.m7823g());
                C1929h c1929h2 = this.f19557i;
                C4753m.m18650c(c1929h2);
                c1929h2.m7842h(str3, uuid, enumC1922a, m7838d.m7823g(), false);
                AbstractC0602t.m2987e(m21004o()).m2991c(m20990a);
                return;
            }
            str = "invalid_status";
            str2 = "only failed and canceled task can be retried";
        }
        result.error(str, str2, null);
    }

    /* renamed from: r */
    public final void m21007r(String str, EnumC1922a enumC1922a, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("task_id", str);
        hashMap.put("status", Integer.valueOf(enumC1922a.ordinal()));
        hashMap.put("progress", Integer.valueOf(i10));
        MethodChannel methodChannel = this.f19556h;
        if (methodChannel != null) {
            methodChannel.invokeMethod("updateProgress", hashMap);
        }
    }
}
