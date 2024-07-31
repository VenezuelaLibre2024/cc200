package p199nd;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Method;
import p312vd.AbstractC5165c;
import p312vd.C5164b;
import td.C4753m;

/* renamed from: nd.a */
/* loaded from: classes2.dex */
public class C3814a {

    /* renamed from: nd.a$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f13738a = new a();

        /* renamed from: b */
        public static final Method f13739b;

        /* renamed from: c */
        public static final Method f13740c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:2:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[EDGE_INSN: B:11:0x0043->B:12:0x0043 BREAK  A[LOOP:0: B:2:0x0015->B:10:0x003f], SYNTHETIC] */
        static {
            /*
                nd.a$a r0 = new nd.a$a
                r0.<init>()
                p199nd.C3814a.a.f13738a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                td.C4753m.m18652e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = td.C4753m.m18648a(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                td.C4753m.m18652e(r7, r8)
                java.lang.Object r7 = p115hd.C2497j.m9948I(r7)
                boolean r7 = td.C4753m.m18648a(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = r3
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                p199nd.C3814a.a.f13739b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = td.C4753m.m18648a(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                p199nd.C3814a.a.f13740c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p199nd.C3814a.a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo14513a(Throwable th, Throwable th2) {
        C4753m.m18653f(th, "cause");
        C4753m.m18653f(th2, Constants.EXCEPTION);
        Method method = a.f13739b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* renamed from: b */
    public AbstractC5165c mo14514b() {
        return new C5164b();
    }
}
