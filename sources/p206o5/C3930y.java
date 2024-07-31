package p206o5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import p109h7.C2420c;

/* renamed from: o5.y */
/* loaded from: classes.dex */
public class C3930y extends C3912k {

    /* renamed from: i */
    public final C3918n f14181i;

    /* renamed from: j */
    public final int f14182j;

    public C3930y(IOException iOException, C3918n c3918n, int i10, int i11) {
        super(iOException, m14914b(i10, i11));
        this.f14181i = c3918n;
        this.f14182j = i11;
    }

    public C3930y(String str, IOException iOException, C3918n c3918n, int i10, int i11) {
        super(str, iOException, m14914b(i10, i11));
        this.f14181i = c3918n;
        this.f14182j = i11;
    }

    public C3930y(String str, C3918n c3918n, int i10, int i11) {
        super(str, m14914b(i10, i11));
        this.f14181i = c3918n;
        this.f14182j = i11;
    }

    public C3930y(C3918n c3918n, int i10, int i11) {
        super(m14914b(i10, i11));
        this.f14181i = c3918n;
        this.f14182j = i11;
    }

    /* renamed from: b */
    public static int m14914b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    /* renamed from: c */
    public static C3930y m14915c(IOException iOException, C3918n c3918n, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !C2420c.m9665e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new C3929x(iOException, c3918n) : new C3930y(iOException, c3918n, i11, i10);
    }
}
