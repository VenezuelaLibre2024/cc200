package p264s3;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;
import p290u4.C4880s;

/* renamed from: s3.q */
/* loaded from: classes.dex */
public final class C4481q extends C4519x2 {

    /* renamed from: p */
    public final int f16611p;

    /* renamed from: q */
    public final String f16612q;

    /* renamed from: r */
    public final int f16613r;

    /* renamed from: s */
    public final C4463m1 f16614s;

    /* renamed from: t */
    public final int f16615t;

    /* renamed from: u */
    public final C4880s f16616u;

    /* renamed from: v */
    public final boolean f16617v;

    /* renamed from: w */
    public static final InterfaceC4436h.a<C4481q> f16607w = new InterfaceC4436h.a() { // from class: s3.p
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            return C4481q.m17503d(bundle);
        }
    };

    /* renamed from: x */
    public static final String f16608x = C4041n0.m15478q0(1001);

    /* renamed from: y */
    public static final String f16609y = C4041n0.m15478q0(1002);

    /* renamed from: z */
    public static final String f16610z = C4041n0.m15478q0(1003);

    /* renamed from: A */
    public static final String f16604A = C4041n0.m15478q0(1004);

    /* renamed from: B */
    public static final String f16605B = C4041n0.m15478q0(1005);

    /* renamed from: C */
    public static final String f16606C = C4041n0.m15478q0(1006);

    public C4481q(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    public C4481q(int i10, Throwable th, String str, int i11, String str2, int i12, C4463m1 c4463m1, int i13, boolean z10) {
        this(m17508j(i10, str, str2, i12, c4463m1, i13), th, i11, i10, str2, i12, c4463m1, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    public C4481q(Bundle bundle) {
        super(bundle);
        this.f16611p = bundle.getInt(f16608x, 2);
        this.f16612q = bundle.getString(f16609y);
        this.f16613r = bundle.getInt(f16610z, -1);
        Bundle bundle2 = bundle.getBundle(f16604A);
        this.f16614s = bundle2 == null ? null : C4463m1.f16479w0.mo6314a(bundle2);
        this.f16615t = bundle.getInt(f16605B, 4);
        this.f16617v = bundle.getBoolean(f16606C, false);
        this.f16616u = null;
    }

    public C4481q(String str, Throwable th, int i10, int i11, String str2, int i12, C4463m1 c4463m1, int i13, C4880s c4880s, long j10, boolean z10) {
        super(str, th, i10, j10);
        C4014a.m15195a(!z10 || i11 == 1);
        C4014a.m15195a(th != null || i11 == 3);
        this.f16611p = i11;
        this.f16612q = str2;
        this.f16613r = i12;
        this.f16614s = c4463m1;
        this.f16615t = i13;
        this.f16616u = c4880s;
        this.f16617v = z10;
    }

    /* renamed from: d */
    public static /* synthetic */ C4481q m17503d(Bundle bundle) {
        return new C4481q(bundle);
    }

    /* renamed from: f */
    public static C4481q m17504f(Throwable th, String str, int i10, C4463m1 c4463m1, int i11, boolean z10, int i12) {
        return new C4481q(1, th, null, i12, str, i10, c4463m1, c4463m1 == null ? 4 : i11, z10);
    }

    /* renamed from: g */
    public static C4481q m17505g(IOException iOException, int i10) {
        return new C4481q(0, iOException, i10);
    }

    @Deprecated
    /* renamed from: h */
    public static C4481q m17506h(RuntimeException runtimeException) {
        return m17507i(runtimeException, 1000);
    }

    /* renamed from: i */
    public static C4481q m17507i(RuntimeException runtimeException, int i10) {
        return new C4481q(2, runtimeException, i10);
    }

    /* renamed from: j */
    public static String m17508j(int i10, String str, String str2, int i11, C4463m1 c4463m1, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + c4463m1 + ", format_supported=" + C4041n0.m15437W(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* renamed from: e */
    public C4481q m17509e(C4880s c4880s) {
        return new C4481q((String) C4041n0.m15463j(getMessage()), getCause(), this.f16978h, this.f16611p, this.f16612q, this.f16613r, this.f16614s, this.f16615t, c4880s, this.f16979i, this.f16617v);
    }
}
