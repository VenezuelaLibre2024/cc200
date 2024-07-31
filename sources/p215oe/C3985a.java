package p215oe;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import ne.InterfaceC3817a;
import pe.C4118a;

/* renamed from: oe.a */
/* loaded from: classes2.dex */
public class C3985a implements InterfaceC3817a {
    @Override // ne.InterfaceC3817a
    /* renamed from: a */
    public List<String> mo13372a() {
        return Arrays.asList("com.asus.launcher");
    }

    @Override // ne.InterfaceC3817a
    /* renamed from: b */
    public void mo13373b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        C4118a.m15891b(context, intent);
    }
}
