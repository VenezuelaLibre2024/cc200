package p070ed;

import android.content.Context;
import android.widget.Toast;
import io.flutter.plugin.common.MethodChannel;
import td.C4753m;

/* renamed from: ed.c */
/* loaded from: classes2.dex */
public final class C1769c implements MethodChannel.MethodCallHandler {

    /* renamed from: h */
    public Context f6525h;

    /* renamed from: i */
    public Toast f6526i;

    /* renamed from: ed.c$a */
    /* loaded from: classes2.dex */
    public static final class a extends Toast.Callback {
        public a() {
        }

        @Override // android.widget.Toast.Callback
        public void onToastHidden() {
            super.onToastHidden();
            C1769c.this.f6526i = null;
        }
    }

    public C1769c(Context context) {
        C4753m.m18653f(context, "context");
        this.f6525h = context;
    }

    /* renamed from: c */
    public static final void m7070c(C1769c c1769c) {
        C4753m.m18653f(c1769c, "this$0");
        Toast toast = c1769c.f6526i;
        if (toast != null) {
            toast.show();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0117, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013f  */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r11, io.flutter.plugin.common.MethodChannel.Result r12) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p070ed.C1769c.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
