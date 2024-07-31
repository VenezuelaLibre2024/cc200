package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.List;
import ne.C3818b;
import ne.InterfaceC3817a;
import pe.C4118a;

/* loaded from: classes2.dex */
public class NewHtcHomeBadger implements InterfaceC3817a {
    @Override // ne.InterfaceC3817a
    /* renamed from: a */
    public List<String> mo13372a() {
        return Collections.singletonList("com.htc.launcher");
    }

    @Override // ne.InterfaceC3817a
    /* renamed from: b */
    public void mo13373b(Context context, ComponentName componentName, int i10) {
        boolean z10;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i10);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i10);
        boolean z11 = false;
        try {
            C4118a.m15892c(context, intent);
            z10 = true;
        } catch (C3818b unused) {
            z10 = false;
        }
        try {
            C4118a.m15892c(context, intent2);
            z11 = true;
        } catch (C3818b unused2) {
        }
        if (z10 || z11) {
            return;
        }
        throw new C3818b("unable to resolve intent: " + intent2.toString());
    }
}
