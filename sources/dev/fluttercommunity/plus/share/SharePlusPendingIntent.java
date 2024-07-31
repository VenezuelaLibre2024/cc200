package dev.fluttercommunity.plus.share;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import td.C4747g;
import td.C4753m;

/* loaded from: classes2.dex */
public final class SharePlusPendingIntent extends BroadcastReceiver {

    /* renamed from: a */
    public static final C1623a f5962a = new C1623a(null);

    /* renamed from: b */
    public static String f5963b = "";

    /* renamed from: dev.fluttercommunity.plus.share.SharePlusPendingIntent$a */
    /* loaded from: classes2.dex */
    public static final class C1623a {
        public C1623a() {
        }

        public /* synthetic */ C1623a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final String m6481a() {
            return SharePlusPendingIntent.f5963b;
        }

        /* renamed from: b */
        public final void m6482b(String str) {
            C4753m.m18653f(str, "<set-?>");
            SharePlusPendingIntent.f5963b = str;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(intent, "intent");
        ComponentName componentName = (ComponentName) (Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class) : intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT"));
        if (componentName != null) {
            String flattenToString = componentName.flattenToString();
            C4753m.m18652e(flattenToString, "chosenComponent.flattenToString()");
            f5963b = flattenToString;
        }
    }
}
