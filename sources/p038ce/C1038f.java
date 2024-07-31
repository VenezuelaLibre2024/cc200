package p038ce;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.List;
import p115hd.C2502n;
import p146jd.InterfaceC3281d;
import p173ld.AbstractC3470d;
import p173ld.InterfaceC3472f;

/* renamed from: ce.f */
/* loaded from: classes2.dex */
public final class C1038f {

    @InterfaceC3472f(m12916c = "kotlinx.coroutines.AwaitKt", m12917f = "Await.kt", m12918l = {C1417R.styleable.AppCompatTheme_dropDownListViewStyle}, m12919m = "joinAll")
    /* renamed from: ce.f$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC3470d {

        /* renamed from: h */
        public Object f3996h;

        /* renamed from: i */
        public /* synthetic */ Object f3997i;

        /* renamed from: j */
        public int f3998j;

        public a(InterfaceC3281d<? super a> interfaceC3281d) {
            super(interfaceC3281d);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f3997i = obj;
            this.f3998j |= Integer.MIN_VALUE;
            return C1038f.m4313b(null, this);
        }
    }

    /* renamed from: a */
    public static final <T> Object m4312a(InterfaceC1117x0<? extends T>[] interfaceC1117x0Arr, InterfaceC3281d<? super List<? extends T>> interfaceC3281d) {
        return interfaceC1117x0Arr.length == 0 ? C2502n.m9989e() : new C1033e(interfaceC1117x0Arr).m4300c(interfaceC3281d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m4313b(java.util.Collection<? extends p038ce.InterfaceC1026c2> r4, p146jd.InterfaceC3281d<? super gd.C2245s> r5) {
        /*
            boolean r0 = r5 instanceof p038ce.C1038f.a
            if (r0 == 0) goto L13
            r0 = r5
            ce.f$a r0 = (p038ce.C1038f.a) r0
            int r1 = r0.f3998j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3998j = r1
            goto L18
        L13:
            ce.f$a r0 = new ce.f$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f3997i
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f3998j
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f3996h
            java.util.Iterator r4 = (java.util.Iterator) r4
            gd.C2238l.m8975b(r5)
            goto L3c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            gd.C2238l.m8975b(r5)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            ce.c2 r5 = (p038ce.InterfaceC1026c2) r5
            r0.f3996h = r4
            r0.f3998j = r3
            java.lang.Object r5 = r5.mo4274P(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            gd.s r4 = gd.C2245s.f8873a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C1038f.m4313b(java.util.Collection, jd.d):java.lang.Object");
    }
}
