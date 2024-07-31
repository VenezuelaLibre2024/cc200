package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import ne.InterfaceC3817a;
import pe.C4118a;

/* loaded from: classes2.dex */
public class DefaultBadger implements InterfaceC3817a {
    @Override // ne.InterfaceC3817a
    /* renamed from: a */
    public List<String> mo13372a() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }

    @Override // ne.InterfaceC3817a
    /* renamed from: b */
    public void mo13373b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        C4118a.m15891b(context, intent);
    }

    /* renamed from: c */
    public boolean m13374c(Context context) {
        return C4118a.m15890a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE")).size() > 0 || (Build.VERSION.SDK_INT >= 26 && C4118a.m15890a(context, new Intent("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE")).size() > 0);
    }
}
