package p266s5;

import android.net.Uri;
import java.util.Map;

/* renamed from: s5.b */
/* loaded from: classes.dex */
public final class C4533b extends Thread {

    /* renamed from: h */
    public final /* synthetic */ Map f17133h;

    public C4533b(C4532a c4532a, Map map) {
        this.f17133h = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f17133h;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C4535d.m17966a(buildUpon.build().toString());
    }
}
