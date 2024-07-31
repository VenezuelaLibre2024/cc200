package p207o6;

import android.util.Base64;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* renamed from: o6.c */
/* loaded from: classes.dex */
public final class C3934c {
    /* renamed from: a */
    public static byte[] m14927a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: b */
    public static byte[] m14928b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    /* renamed from: c */
    public static String m14929c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: d */
    public static String m14930d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: e */
    public static String m14931e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
