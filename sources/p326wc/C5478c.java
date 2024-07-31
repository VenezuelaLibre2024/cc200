package p326wc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ActionBroadcastReceiver;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p329x.C5484b;
import p345y.C5782a;

/* renamed from: wc.c */
/* loaded from: classes2.dex */
public class C5478c {

    /* renamed from: a */
    public Context f20368a;

    /* renamed from: b */
    public MethodCall f20369b;

    public C5478c(Context context) {
        this.f20368a = context;
    }

    /* renamed from: a */
    public final boolean m21705a() {
        return C5782a.checkSelfPermission(this.f20368a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: b */
    public final void m21706b() {
        Context context = this.f20368a;
        if (context instanceof Activity) {
            C5484b.m21745g((Activity) context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 100);
        }
    }

    /* renamed from: c */
    public void m21707c() {
        m21708d(this.f20369b);
    }

    /* renamed from: d */
    public void m21708d(MethodCall methodCall) {
        if (methodCall == null) {
            return;
        }
        this.f20369b = methodCall;
        List list = (List) methodCall.argument("list");
        String str = (String) methodCall.argument(ImagePickerCache.MAP_KEY_TYPE);
        String str2 = (String) methodCall.argument("sharePanelTitle");
        String str3 = (String) methodCall.argument("subject");
        ArrayList arrayList = (ArrayList) methodCall.argument("extraTexts");
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Non-empty list expected");
        }
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        Intent intent = new Intent();
        intent.addFlags(1);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str3);
        if ("text".equals(str)) {
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", (String) list.get(0));
            intent.setType("text/plain");
        } else {
            if (C5480e.m21716e(list) && !m21705a()) {
                m21706b();
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(C5480e.m21712a(this.f20368a, new File((String) it.next())));
            }
            intent.setType("image".equals(str) ? "image/*" : "video".equals(str) ? "video/*" : "audio".equals(str) ? "audio/*" : "application/*");
            if (arrayList2.size() == 1) {
                intent.putExtra("android.intent.extra.TEXT", (arrayList == null || arrayList.isEmpty()) ? null : (String) arrayList.get(0));
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", arrayList2.get(0));
            } else {
                intent.putExtra("android.intent.extra.TEXT", arrayList);
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList2);
            }
        }
        m21709e(intent, str2, arrayList2);
    }

    /* renamed from: e */
    public final void m21709e(Intent intent, String str, ArrayList<Uri> arrayList) {
        Intent createChooser = Intent.createChooser(intent, str);
        C5480e.m21713b(this.f20368a, arrayList, createChooser);
        Context context = this.f20368a;
        if (!(context instanceof Activity)) {
            createChooser.addFlags(268435456);
            context = this.f20368a;
        }
        context.startActivity(createChooser);
    }
}
