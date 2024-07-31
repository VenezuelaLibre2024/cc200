package p363z2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* renamed from: z2.a */
/* loaded from: classes.dex */
public final class C5946a {

    @FunctionalInterface
    /* renamed from: z2.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo23837a(boolean z10);
    }

    /* renamed from: a */
    public void m23836a(Context context, a aVar, InterfaceC5947b interfaceC5947b) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            interfaceC5947b.mo23838a("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            aVar.mo23837a(true);
        } catch (Exception unused) {
            aVar.mo23837a(false);
        }
    }
}
