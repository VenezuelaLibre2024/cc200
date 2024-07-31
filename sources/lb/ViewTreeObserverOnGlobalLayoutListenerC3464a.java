package lb;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;

/* renamed from: lb.a */
/* loaded from: classes.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC3464a implements FlutterPlugin, ActivityAware, EventChannel.StreamHandler, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: h */
    public EventChannel.EventSink f12168h;

    /* renamed from: i */
    public View f12169i;

    /* renamed from: j */
    public boolean f12170j;

    /* renamed from: a */
    public final void m12893a(BinaryMessenger binaryMessenger) {
        new EventChannel(binaryMessenger, "flutter_keyboard_visibility").setStreamHandler(this);
    }

    /* renamed from: b */
    public final void m12894b(Activity activity) {
        View findViewById = activity.findViewById(R.id.content);
        this.f12169i = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* renamed from: c */
    public final void m12895c() {
        View view = this.f12169i;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f12169i = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        m12894b(activityPluginBinding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m12893a(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f12168h = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        m12895c();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        m12895c();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m12895c();
    }

    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f12169i != null) {
            Rect rect = new Rect();
            this.f12169i.getWindowVisibleDisplayFrame(rect);
            ?? r02 = ((double) rect.height()) / ((double) this.f12169i.getRootView().getHeight()) < 0.85d ? 1 : 0;
            if (r02 != this.f12170j) {
                this.f12170j = r02;
                EventChannel.EventSink eventSink = this.f12168h;
                if (eventSink != null) {
                    eventSink.success(Integer.valueOf((int) r02));
                }
            }
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f12168h = eventSink;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        m12894b(activityPluginBinding.getActivity());
    }
}
