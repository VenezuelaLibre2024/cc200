package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.List;
import ne.InterfaceC3817a;
import pe.C4118a;

/* loaded from: classes2.dex */
public class ApexHomeBadger implements InterfaceC3817a {
    @Override // ne.InterfaceC3817a
    /* renamed from: a */
    public List<String> mo13372a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // ne.InterfaceC3817a
    /* renamed from: b */
    public void mo13373b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i10);
        intent.putExtra(Constants.CLASS, componentName.getClassName());
        C4118a.m15892c(context, intent);
    }
}
