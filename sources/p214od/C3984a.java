package p214od;

import io.flutter.plugins.firebase.crashlytics.Constants;
import p199nd.C3814a;
import td.C4753m;

/* renamed from: od.a */
/* loaded from: classes2.dex */
public class C3984a extends C3814a {

    /* renamed from: od.a$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f14365a = new a();

        /* renamed from: b */
        public static final Integer f14366b;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        static {
            /*
                od.a$a r0 = new od.a$a
                r0.<init>()
                p214od.C3984a.a.f14365a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                p214od.C3984a.a.f14366b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p214od.C3984a.a.<clinit>():void");
        }
    }

    @Override // p199nd.C3814a
    /* renamed from: a */
    public void mo14513a(Throwable th, Throwable th2) {
        C4753m.m18653f(th, "cause");
        C4753m.m18653f(th2, Constants.EXCEPTION);
        if (m15113c(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo14513a(th, th2);
        }
    }

    /* renamed from: c */
    public final boolean m15113c(int i10) {
        Integer num = a.f14366b;
        return num == null || num.intValue() >= i10;
    }
}
