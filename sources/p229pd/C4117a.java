package p229pd;

import p214od.C3984a;
import p312vd.AbstractC5165c;
import p327wd.C5481a;

/* renamed from: pd.a */
/* loaded from: classes2.dex */
public class C4117a extends C3984a {

    /* renamed from: pd.a$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f14839a = new a();

        /* renamed from: b */
        public static final Integer f14840b;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        static {
            /*
                pd.a$a r0 = new pd.a$a
                r0.<init>()
                p229pd.C4117a.a.f14839a = r0
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
                p229pd.C4117a.a.f14840b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p229pd.C4117a.a.<clinit>():void");
        }
    }

    /* renamed from: c */
    private final boolean m15889c(int i10) {
        Integer num = a.f14840b;
        return num == null || num.intValue() >= i10;
    }

    @Override // p199nd.C3814a
    /* renamed from: b */
    public AbstractC5165c mo14514b() {
        return m15889c(34) ? new C5481a() : super.mo14514b();
    }
}
