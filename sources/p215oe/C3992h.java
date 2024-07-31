package p215oe;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import ne.InterfaceC3817a;

/* renamed from: oe.h */
/* loaded from: classes2.dex */
public class C3992h implements InterfaceC3817a {

    /* renamed from: a */
    public final Uri f14370a = Uri.parse("content://com.android.badge/badge");

    @Override // ne.InterfaceC3817a
    /* renamed from: a */
    public List<String> mo13372a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // ne.InterfaceC3817a
    @TargetApi(11)
    /* renamed from: b */
    public void mo13373b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(this.f14370a, "setAppBadgeCount", (String) null, bundle);
    }
}
