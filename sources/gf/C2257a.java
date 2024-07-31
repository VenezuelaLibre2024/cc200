package gf;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: gf.a */
/* loaded from: classes2.dex */
public class C2257a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: j */
    public static String f8895j = "ThumbnailPlugin";

    /* renamed from: h */
    public ExecutorService f8896h;

    /* renamed from: i */
    public MethodChannel f8897i;

    /* renamed from: gf.a$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ String f8898h;

        /* renamed from: i */
        public final /* synthetic */ Map f8899i;

        /* renamed from: j */
        public final /* synthetic */ String f8900j;

        /* renamed from: k */
        public final /* synthetic */ int f8901k;

        /* renamed from: l */
        public final /* synthetic */ int f8902l;

        /* renamed from: m */
        public final /* synthetic */ int f8903m;

        /* renamed from: n */
        public final /* synthetic */ int f8904n;

        /* renamed from: o */
        public final /* synthetic */ int f8905o;

        /* renamed from: p */
        public final /* synthetic */ MethodChannel.Result f8906p;

        public a(String str, Map map, String str2, int i10, int i11, int i12, int i13, int i14, MethodChannel.Result result) {
            this.f8898h = str;
            this.f8899i = map;
            this.f8900j = str2;
            this.f8901k = i10;
            this.f8902l = i11;
            this.f8903m = i12;
            this.f8904n = i13;
            this.f8905o = i14;
            this.f8906p = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            Object obj2 = null;
            boolean z10 = false;
            try {
                boolean z11 = true;
                if (this.f8898h.equals(Constants.FILE)) {
                    obj = C2257a.this.m9001e(this.f8900j, (String) this.f8899i.get("path"), this.f8901k, this.f8902l, this.f8903m, this.f8904n, this.f8905o);
                } else if (this.f8898h.equals("data")) {
                    obj = C2257a.this.m9000d(this.f8900j, this.f8901k, this.f8902l, this.f8903m, this.f8904n, this.f8905o);
                } else {
                    z11 = false;
                    obj = null;
                }
                e = null;
                obj2 = obj;
                z10 = z11;
            } catch (Exception e10) {
                e = e10;
            }
            C2257a.this.m9002i(this.f8906p, obj2, z10, e);
        }
    }

    /* renamed from: gf.a$b */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ boolean f8908h;

        /* renamed from: i */
        public final /* synthetic */ MethodChannel.Result f8909i;

        /* renamed from: j */
        public final /* synthetic */ Exception f8910j;

        /* renamed from: k */
        public final /* synthetic */ Object f8911k;

        public b(boolean z10, MethodChannel.Result result, Exception exc, Object obj) {
            this.f8908h = z10;
            this.f8909i = result;
            this.f8910j = exc;
            this.f8911k = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f8908h) {
                this.f8909i.notImplemented();
                return;
            }
            Exception exc = this.f8910j;
            if (exc == null) {
                this.f8909i.success(this.f8911k);
            } else {
                exc.printStackTrace();
                this.f8909i.error(Constants.EXCEPTION, this.f8910j.getMessage(), null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[Catch: all -> 0x00ac, IOException -> 0x00ae, RuntimeException -> 0x00b8, IllegalArgumentException -> 0x00c2, TryCatch #8 {IOException -> 0x00ae, blocks: (B:3:0x0006, B:5:0x000e, B:10:0x002e, B:19:0x0037, B:23:0x0041, B:24:0x004d, B:26:0x0056, B:28:0x0060, B:30:0x006b, B:31:0x0074, B:33:0x0012, B:35:0x001a, B:36:0x0020), top: B:2:0x0006, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m8995f(java.lang.String r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.C2257a.m8995f(java.lang.String, int, int, int):android.graphics.Bitmap");
    }

    /* renamed from: g */
    public static String m8996g(int i10) {
        return i10 != 1 ? i10 != 2 ? "jpg" : "webp" : "png";
    }

    /* renamed from: h */
    public static Bitmap.CompressFormat m8997h(int i10) {
        return i10 != 1 ? i10 != 2 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    /* renamed from: j */
    public static void m8998j(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    /* renamed from: k */
    public static void m8999k(String str, MediaMetadataRetriever mediaMetadataRetriever) {
        mediaMetadataRetriever.setDataSource(new FileInputStream(new File(str).getAbsolutePath()).getFD());
    }

    /* renamed from: d */
    public final byte[] m9000d(String str, int i10, int i11, int i12, int i13, int i14) {
        Log.d(f8895j, String.format("buildThumbnailData( format:%d, maxh:%d, maxw:%d, timeMs:%d, quality:%d )", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)));
        Bitmap m8995f = m8995f(str, i11, i12, i13);
        Objects.requireNonNull(m8995f);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m8995f.compress(m8997h(i10), i14, byteArrayOutputStream);
        m8995f.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: e */
    public final String m9001e(String str, String str2, int i10, int i11, int i12, int i13, int i14) {
        StringBuilder sb2;
        Log.d(f8895j, String.format("buildThumbnailFile( format:%d, maxh:%d, maxw:%d, timeMs:%d, quality:%d )", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)));
        byte[] m9000d = m9000d(str, i10, i11, i12, i13, i14);
        String m8996g = m8996g(i10);
        String str3 = str.substring(0, str.lastIndexOf(".") + 1) + m8996g;
        if (str2 != null) {
            if (str2.endsWith(m8996g)) {
                str3 = str2;
            } else {
                int lastIndexOf = str3.lastIndexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                if (str2.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    lastIndexOf++;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                }
                sb2.append(str3.substring(lastIndexOf));
                str3 = sb2.toString();
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str3);
            fileOutputStream.write(m9000d);
            fileOutputStream.close();
            Log.d(f8895j, String.format("buildThumbnailFile( written:%d )", Integer.valueOf(m9000d.length)));
            return str3;
        } catch (IOException e10) {
            e10.getStackTrace();
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: i */
    public final void m9002i(MethodChannel.Result result, Object obj, boolean z10, Exception exc) {
        m8998j(new b(z10, result, exc, obj));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f8896h = Executors.newCachedThreadPool();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.justsoft.xyz/video_thumbnail");
        this.f8897i = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f8897i.setMethodCallHandler(null);
        this.f8897i = null;
        this.f8896h.shutdown();
        this.f8896h = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Map map = (Map) methodCall.arguments();
        String str = (String) map.get("video");
        int intValue = ((Integer) map.get("format")).intValue();
        int intValue2 = ((Integer) map.get("maxh")).intValue();
        int intValue3 = ((Integer) map.get("maxw")).intValue();
        int intValue4 = ((Integer) map.get("timeMs")).intValue();
        int intValue5 = ((Integer) map.get("quality")).intValue();
        this.f8896h.execute(new a(methodCall.method, map, str, intValue, intValue2, intValue3, intValue4, intValue5, result));
    }
}
