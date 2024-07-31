package p215oe;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import ne.InterfaceC3817a;
import pe.C4118a;

/* renamed from: oe.d */
/* loaded from: classes2.dex */
public class C3988d implements InterfaceC3817a {

    /* renamed from: a */
    public int f14367a = -1;

    @Override // ne.InterfaceC3817a
    /* renamed from: a */
    public List<String> mo13372a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // ne.InterfaceC3817a
    /* renamed from: b */
    public void mo13373b(Context context, ComponentName componentName, int i10) {
        if (this.f14367a == i10) {
            return;
        }
        this.f14367a = i10;
        if (Build.VERSION.SDK_INT >= 11) {
            m15115d(context, i10);
        } else {
            m15114c(context, componentName, i10);
        }
    }

    /* renamed from: c */
    public final void m15114c(Context context, ComponentName componentName, int i10) {
        if (i10 == 0) {
            i10 = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i10);
        intent.putExtra("upgradeNumber", i10);
        C4118a.m15892c(context, intent);
    }

    @TargetApi(11)
    /* renamed from: d */
    public final void m15115d(Context context, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }
}
