package p264s3;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: s3.x2 */
/* loaded from: classes.dex */
public class C4519x2 extends Exception implements InterfaceC4436h {

    /* renamed from: j */
    public static final String f16972j = C4041n0.m15478q0(0);

    /* renamed from: k */
    public static final String f16973k = C4041n0.m15478q0(1);

    /* renamed from: l */
    public static final String f16974l = C4041n0.m15478q0(2);

    /* renamed from: m */
    public static final String f16975m = C4041n0.m15478q0(3);

    /* renamed from: n */
    public static final String f16976n = C4041n0.m15478q0(4);

    /* renamed from: o */
    public static final InterfaceC4436h.a<C4519x2> f16977o = new InterfaceC4436h.a() { // from class: s3.w2
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            return new C4519x2(bundle);
        }
    };

    /* renamed from: h */
    public final int f16978h;

    /* renamed from: i */
    public final long f16979i;

    public C4519x2(Bundle bundle) {
        this(bundle.getString(f16974l), m17857c(bundle), bundle.getInt(f16972j, 1000), bundle.getLong(f16973k, SystemClock.elapsedRealtime()));
    }

    public C4519x2(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f16978h = i10;
        this.f16979i = j10;
    }

    /* renamed from: a */
    public static RemoteException m17855a(String str) {
        return new RemoteException(str);
    }

    /* renamed from: b */
    public static Throwable m17856b(Class<?> cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    /* renamed from: c */
    public static Throwable m17857c(Bundle bundle) {
        String string = bundle.getString(f16975m);
        String string2 = bundle.getString(f16976n);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, C4519x2.class.getClassLoader());
            Throwable m17856b = Throwable.class.isAssignableFrom(cls) ? m17856b(cls, string2) : null;
            if (m17856b != null) {
                return m17856b;
            }
        } catch (Throwable unused) {
        }
        return m17855a(string2);
    }
}
