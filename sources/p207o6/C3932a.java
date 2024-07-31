package p207o6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p237q6.C4195c;

/* renamed from: o6.a */
/* loaded from: classes.dex */
public class C3932a {
    @Deprecated
    /* renamed from: a */
    public static byte[] m14916a(Context context, String str) {
        MessageDigest m14917b;
        PackageInfo m16180e = C4195c.m16183a(context).m16180e(str, 64);
        Signature[] signatureArr = m16180e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (m14917b = m14917b("SHA1")) == null) {
            return null;
        }
        return m14917b.digest(m16180e.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m14917b(String str) {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
