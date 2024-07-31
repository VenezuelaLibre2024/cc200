package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import ne.InterfaceC3817a;
import pe.C4118a;

/* loaded from: classes2.dex */
public class AdwHomeBadger implements InterfaceC3817a {
    @Override // ne.InterfaceC3817a
    /* renamed from: a */
    public List<String> mo13372a() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override // ne.InterfaceC3817a
    /* renamed from: b */
    public void mo13373b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i10);
        C4118a.m15892c(context, intent);
    }
}
