package p248r2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: r2.e */
/* loaded from: classes.dex */
public class C4281e {

    /* renamed from: a */
    public final Handler f15541a = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public static /* synthetic */ void m16412g(MethodChannel.Result result, String str, String str2, Object obj) {
        if (result != null) {
            result.error(str, str2, obj);
        } else {
            Log.w("ffmpeg-kit-flutter", String.format("ResultHandler can not send failure response %s:%s on a null method call result.", str, str2));
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m16413h(MethodChannel.Result result) {
        if (result != null) {
            result.notImplemented();
        } else {
            Log.w("ffmpeg-kit-flutter", "ResultHandler can not send not implemented response on a null method call result.");
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m16414i(MethodChannel.Result result, Object obj) {
        if (result != null) {
            result.success(obj);
        } else {
            Log.w("ffmpeg-kit-flutter", String.format("ResultHandler can not send successful response %s on a null method call result.", obj));
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m16415j(EventChannel.EventSink eventSink, Object obj) {
        if (eventSink != null) {
            eventSink.success(obj);
        } else {
            Log.w("ffmpeg-kit-flutter", String.format("ResultHandler can not send event %s on a null event sink.", obj));
        }
    }

    /* renamed from: e */
    public void m16416e(MethodChannel.Result result, String str, String str2) {
        m16417f(result, str, str2, null);
    }

    /* renamed from: f */
    public void m16417f(final MethodChannel.Result result, final String str, final String str2, final Object obj) {
        this.f15541a.post(new Runnable() { // from class: r2.d
            @Override // java.lang.Runnable
            public final void run() {
                C4281e.m16412g(MethodChannel.Result.this, str, str2, obj);
            }
        });
    }

    /* renamed from: k */
    public void m16418k(final MethodChannel.Result result) {
        this.f15541a.post(new Runnable() { // from class: r2.b
            @Override // java.lang.Runnable
            public final void run() {
                C4281e.m16413h(MethodChannel.Result.this);
            }
        });
    }

    /* renamed from: l */
    public void m16419l(final EventChannel.EventSink eventSink, final Object obj) {
        this.f15541a.post(new Runnable() { // from class: r2.a
            @Override // java.lang.Runnable
            public final void run() {
                C4281e.m16415j(EventChannel.EventSink.this, obj);
            }
        });
    }

    /* renamed from: m */
    public void m16420m(final MethodChannel.Result result, final Object obj) {
        this.f15541a.post(new Runnable() { // from class: r2.c
            @Override // java.lang.Runnable
            public final void run() {
                C4281e.m16414i(MethodChannel.Result.this, obj);
            }
        });
    }
}
