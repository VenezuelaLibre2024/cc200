package p090g0;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: g0.q */
/* loaded from: classes.dex */
public class C1957q {

    /* renamed from: g0.q$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static boolean m7880a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m7879a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.m7880a(context);
        }
        return true;
    }
}
