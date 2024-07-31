package p231q0;

import android.content.Context;
import java.io.File;
import td.C4753m;

/* renamed from: q0.a */
/* loaded from: classes.dex */
public final class C4121a {
    /* renamed from: a */
    public static final File m15894a(Context context, String str) {
        C4753m.m18653f(context, "<this>");
        C4753m.m18653f(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), C4753m.m18660m("datastore/", str));
    }
}
