package pe;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import ne.C3818b;

/* renamed from: pe.a */
/* loaded from: classes2.dex */
public class C4118a {
    /* renamed from: a */
    public static List<ResolveInfo> m15890a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null ? queryBroadcastReceivers : Collections.emptyList();
    }

    /* renamed from: b */
    public static void m15891b(Context context, Intent intent) {
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                m15892c(context, intent2);
                z10 = true;
            } catch (C3818b unused) {
            }
        }
        if (z10) {
            return;
        }
        m15892c(context, intent);
    }

    /* renamed from: c */
    public static void m15892c(Context context, Intent intent) {
        List<ResolveInfo> m15890a = m15890a(context, intent);
        if (m15890a.size() == 0) {
            throw new C3818b("unable to resolve intent: " + intent.toString());
        }
        for (ResolveInfo resolveInfo : m15890a) {
            Intent intent2 = new Intent(intent);
            if (resolveInfo != null) {
                intent2.setPackage(resolveInfo.resolvePackageName);
                context.sendBroadcast(intent2);
            }
        }
    }
}
