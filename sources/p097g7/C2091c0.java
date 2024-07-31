package p097g7;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: g7.c0 */
/* loaded from: classes.dex */
public final class C2091c0 {

    /* renamed from: a */
    public final String f8189a;

    public C2091c0(String str) {
        this.f8189a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* renamed from: e */
    public static String m8290e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* renamed from: a */
    public final int m8291a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m8290e(this.f8189a, "Phonesky is not installed.", objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int m8292b(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m8290e(this.f8189a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: c */
    public final int m8293c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m8290e(this.f8189a, str, objArr));
        }
        return 0;
    }

    /* renamed from: d */
    public final int m8294d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m8290e(this.f8189a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
