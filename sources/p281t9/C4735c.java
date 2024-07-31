package p281t9;

import android.os.Build;
import android.os.Trace;

/* renamed from: t9.c */
/* loaded from: classes.dex */
public final class C4735c {
    /* renamed from: a */
    public static void m18604a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: b */
    public static void m18605b(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
