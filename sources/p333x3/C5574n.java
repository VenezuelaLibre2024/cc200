package p333x3;

import java.io.EOFException;
import p264s3.C4499t2;

/* renamed from: x3.n */
/* loaded from: classes.dex */
public final class C5574n {
    /* renamed from: a */
    public static void m22460a(boolean z10, String str) {
        if (!z10) {
            throw C4499t2.m17594a(str, null);
        }
    }

    /* renamed from: b */
    public static boolean m22461b(InterfaceC5572l interfaceC5572l, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return interfaceC5572l.mo22424e(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    /* renamed from: c */
    public static int m22462c(InterfaceC5572l interfaceC5572l, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int mo22426i = interfaceC5572l.mo22426i(bArr, i10 + i12, i11 - i12);
            if (mo22426i == -1) {
                break;
            }
            i12 += mo22426i;
        }
        return i12;
    }

    /* renamed from: d */
    public static boolean m22463d(InterfaceC5572l interfaceC5572l, byte[] bArr, int i10, int i11) {
        try {
            interfaceC5572l.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m22464e(InterfaceC5572l interfaceC5572l, int i10) {
        try {
            interfaceC5572l.mo22428m(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
