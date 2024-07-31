package p317w3;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import p222p5.C4041n0;
import p317w3.C5237h;

/* renamed from: w3.y */
/* loaded from: classes.dex */
public final class C5259y {

    /* renamed from: w3.y$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static boolean m21295a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        /* renamed from: b */
        public static boolean m21296b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    /* renamed from: w3.y$b */
    /* loaded from: classes.dex */
    public static final class b {
        /* renamed from: a */
        public static boolean m21297a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        /* renamed from: b */
        public static int m21298b(Throwable th) {
            return C4041n0.m15433U(C4041n0.m15435V(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* renamed from: w3.y$c */
    /* loaded from: classes.dex */
    public static final class c {
        /* renamed from: a */
        public static boolean m21299a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    /* renamed from: a */
    public static int m21294a(Exception exc, int i10) {
        int i11 = C4041n0.f14513a;
        if (i11 >= 21 && b.m21297a(exc)) {
            return b.m21298b(exc);
        }
        if (i11 >= 23 && c.m21299a(exc)) {
            return 6006;
        }
        if (i11 >= 18 && a.m21296b(exc)) {
            return 6002;
        }
        if (i11 >= 18 && a.m21295a(exc)) {
            return 6007;
        }
        if (exc instanceof C5244k0) {
            return 6001;
        }
        if (exc instanceof C5237h.e) {
            return 6003;
        }
        if (exc instanceof C5238h0) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }
}
