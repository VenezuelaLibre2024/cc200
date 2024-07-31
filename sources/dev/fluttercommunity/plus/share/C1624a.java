package dev.fluttercommunity.plus.share;

import android.content.Context;
import android.content.Intent;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.concurrent.atomic.AtomicBoolean;
import td.C4747g;
import td.C4753m;

/* renamed from: dev.fluttercommunity.plus.share.a */
/* loaded from: classes2.dex */
public final class C1624a implements PluginRegistry.ActivityResultListener {

    /* renamed from: k */
    public static final a f5964k = new a(null);

    /* renamed from: h */
    public final Context f5965h;

    /* renamed from: i */
    public MethodChannel.Result f5966i;

    /* renamed from: j */
    public AtomicBoolean f5967j;

    /* renamed from: dev.fluttercommunity.plus.share.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C1624a(Context context) {
        C4753m.m18653f(context, "context");
        this.f5965h = context;
        this.f5967j = new AtomicBoolean(true);
    }

    /* renamed from: a */
    public final void m6483a(String str) {
        MethodChannel.Result result;
        if (!this.f5967j.compareAndSet(false, true) || (result = this.f5966i) == null) {
            return;
        }
        C4753m.m18650c(result);
        result.success(str);
        this.f5966i = null;
    }

    /* renamed from: b */
    public final boolean m6484b(MethodChannel.Result result) {
        C4753m.m18653f(result, "callback");
        if (!this.f5967j.compareAndSet(true, false)) {
            result.error("Share callback error", "prior share-sheet did not call back, did you await it? Maybe use non-result variant", null);
            return false;
        }
        SharePlusPendingIntent.f5962a.m6482b("");
        this.f5967j.set(false);
        this.f5966i = result;
        return true;
    }

    /* renamed from: c */
    public final void m6485c() {
        m6483a("dev.fluttercommunity.plus/share/unavailable");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 22643) {
            return false;
        }
        m6483a(SharePlusPendingIntent.f5962a.m6481a());
        return true;
    }
}
