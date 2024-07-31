package p207o6;

import android.content.Context;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p108h6.C2394s;

/* renamed from: o6.f */
/* loaded from: classes.dex */
public final class C3937f {

    /* renamed from: a */
    public static final String[] f14184a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @ResultIgnorabilityUnspecified
    /* renamed from: a */
    public static boolean m14937a(Context context, Throwable th) {
        try {
            C2394s.m9619l(context);
            C2394s.m9619l(th);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
