package p108h6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p237q6.C4195c;

/* renamed from: h6.c1 */
/* loaded from: classes.dex */
public final class C2348c1 {

    /* renamed from: a */
    public static final Object f9584a = new Object();

    /* renamed from: b */
    public static boolean f9585b;

    /* renamed from: c */
    public static String f9586c;

    /* renamed from: d */
    public static int f9587d;

    /* renamed from: a */
    public static int m9517a(Context context) {
        m9518b(context);
        return f9587d;
    }

    /* renamed from: b */
    public static void m9518b(Context context) {
        Bundle bundle;
        synchronized (f9584a) {
            if (f9585b) {
                return;
            }
            f9585b = true;
            try {
                bundle = C4195c.m16183a(context).m16178c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            }
            if (bundle == null) {
                return;
            }
            f9586c = bundle.getString("com.google.app.id");
            f9587d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
