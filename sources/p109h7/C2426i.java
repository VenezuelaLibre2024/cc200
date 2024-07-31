package p109h7;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/* renamed from: h7.i */
/* loaded from: classes.dex */
public final class C2426i {

    /* renamed from: h7.i$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f9752a;

        /* renamed from: b */
        public final a f9753b;

        /* renamed from: c */
        public a f9754c;

        /* renamed from: d */
        public boolean f9755d;

        /* renamed from: e */
        public boolean f9756e;

        /* renamed from: h7.i$b$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public String f9757a;

            /* renamed from: b */
            public Object f9758b;

            /* renamed from: c */
            public a f9759c;

            public a() {
            }
        }

        public b(String str) {
            a aVar = new a();
            this.f9753b = aVar;
            this.f9754c = aVar;
            this.f9755d = false;
            this.f9756e = false;
            this.f9752a = (String) C2432o.m9704j(str);
        }

        /* renamed from: d */
        public static boolean m9683d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof AbstractC2429l ? !((AbstractC2429l) obj).mo9656c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        /* renamed from: a */
        public final a m9684a() {
            a aVar = new a();
            this.f9754c.f9759c = aVar;
            this.f9754c = aVar;
            return aVar;
        }

        /* renamed from: b */
        public final b m9685b(Object obj) {
            m9684a().f9758b = obj;
            return this;
        }

        /* renamed from: c */
        public b m9686c(Object obj) {
            return m9685b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r8 = this;
                boolean r0 = r8.f9755d
                boolean r1 = r8.f9756e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r8.f9752a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                h7.i$b$a r3 = r8.f9753b
                h7.i$b$a r3 = r3.f9759c
                java.lang.String r4 = ""
            L1b:
                if (r3 == 0) goto L62
                java.lang.Object r5 = r3.f9758b
                if (r5 != 0) goto L24
                if (r0 != 0) goto L5f
                goto L2c
            L24:
                if (r1 == 0) goto L2c
                boolean r6 = m9683d(r5)
                if (r6 != 0) goto L5f
            L2c:
                r2.append(r4)
                java.lang.String r4 = r3.f9757a
                if (r4 == 0) goto L3b
                r2.append(r4)
                r4 = 61
                r2.append(r4)
            L3b:
                if (r5 == 0) goto L5a
                java.lang.Class r4 = r5.getClass()
                boolean r4 = r4.isArray()
                if (r4 == 0) goto L5a
                r4 = 1
                java.lang.Object[] r6 = new java.lang.Object[r4]
                r7 = 0
                r6[r7] = r5
                java.lang.String r5 = java.util.Arrays.deepToString(r6)
                int r6 = r5.length()
                int r6 = r6 - r4
                r2.append(r5, r4, r6)
                goto L5d
            L5a:
                r2.append(r5)
            L5d:
                java.lang.String r4 = ", "
            L5f:
                h7.i$b$a r3 = r3.f9759c
                goto L1b
            L62:
                r0 = 125(0x7d, float:1.75E-43)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p109h7.C2426i.b.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public static <T> T m9681a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        Objects.requireNonNull(t11, "Both parameters are null");
        return t11;
    }

    /* renamed from: b */
    public static b m9682b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
