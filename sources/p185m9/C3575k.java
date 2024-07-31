package p185m9;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2245s;
import p038ce.C1063k;
import p038ce.C1089q0;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import p195n7.C3767g;
import p195n7.C3776p;
import p210o9.C3961f;
import sd.InterfaceC4584p;
import td.C4747g;
import td.C4753m;

/* renamed from: m9.k */
/* loaded from: classes.dex */
public final class C3575k {

    /* renamed from: c */
    public static final b f12581c = new b(null);

    /* renamed from: a */
    public final C3767g f12582a;

    /* renamed from: b */
    public final C3961f f12583b;

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.FirebaseSessions$1", m12917f = "FirebaseSessions.kt", m12918l = {C1417R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle, 48}, m12919m = "invokeSuspend")
    /* renamed from: m9.k$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public int f12584h;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC3284g f12586j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3284g interfaceC3284g, InterfaceC3281d<? super a> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f12586j = interfaceC3284g;
        }

        /* renamed from: j */
        public static final void m13279j(String str, C3776p c3776p) {
            Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            C3572i0.f12577h.m13273a(null);
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            return new a(this.f12586j, interfaceC3281d);
        }

        @Override // sd.InterfaceC4584p
        public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((a) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0076  */
        @Override // p173ld.AbstractC3467a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p161kd.C3385c.m12581c()
                int r1 = r5.f12584h
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                gd.C2238l.m8975b(r6)
                goto L6a
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                gd.C2238l.m8975b(r6)
                goto L2e
            L20:
                gd.C2238l.m8975b(r6)
                n9.a r6 = p197n9.C3780a.f13612a
                r5.f12584h = r4
                java.lang.Object r6 = r6.m14383c(r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L3f
                boolean r1 = r6.isEmpty()
                if (r1 == 0) goto L3f
                goto L56
            L3f:
                java.util.Iterator r6 = r6.iterator()
            L43:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r6.next()
                n9.b r1 = (p197n9.InterfaceC3781b) r1
                boolean r1 = r1.mo6876b()
                if (r1 == 0) goto L43
                r4 = 0
            L56:
                if (r4 == 0) goto L5b
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                goto L78
            L5b:
                m9.k r6 = p185m9.C3575k.this
                o9.f r6 = p185m9.C3575k.m13277b(r6)
                r5.f12584h = r3
                java.lang.Object r6 = r6.m14998g(r5)
                if (r6 != r0) goto L6a
                return r0
            L6a:
                m9.k r6 = p185m9.C3575k.this
                o9.f r6 = p185m9.C3575k.m13277b(r6)
                boolean r6 = r6.m14995d()
                if (r6 != 0) goto L7c
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
            L78:
                android.util.Log.d(r2, r6)
                goto L96
            L7c:
                m9.f0 r6 = new m9.f0
                jd.g r0 = r5.f12586j
                r6.<init>(r0)
                r6.m13258i()
                m9.i0 r0 = p185m9.C3572i0.f12577h
                r0.m13273a(r6)
                m9.k r6 = p185m9.C3575k.this
                n7.g r6 = p185m9.C3575k.m13276a(r6)
                m9.j r0 = new p195n7.InterfaceC3768h() { // from class: m9.j
                    static {
                        /*
                            m9.j r0 = new m9.j
                            r0.<init>()
                            
                            // error: 0x0005: SPUT (r0 I:m9.j) m9.j.a m9.j
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p185m9.C3573j.<clinit>():void");
                    }

                    {
                        /*
                            r0 = this;
                            r0.<init>()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p185m9.C3573j.<init>():void");
                    }

                    @Override // p195n7.InterfaceC3768h
                    /* renamed from: a */
                    public final void mo13274a(java.lang.String r1, p195n7.C3776p r2) {
                        /*
                            r0 = this;
                            p185m9.C3575k.a.m13278a(r1, r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p185m9.C3573j.mo13274a(java.lang.String, n7.p):void");
                    }
                }
                r6.m14345h(r0)
            L96:
                gd.s r6 = gd.C2245s.f8873a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p185m9.C3575k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: m9.k$b */
    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C4747g c4747g) {
            this();
        }
    }

    public C3575k(C3767g c3767g, C3961f c3961f, InterfaceC3284g interfaceC3284g) {
        C4753m.m18653f(c3767g, "firebaseApp");
        C4753m.m18653f(c3961f, "settings");
        C4753m.m18653f(interfaceC3284g, "backgroundDispatcher");
        this.f12582a = c3767g;
        this.f12583b = c3961f;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = c3767g.m14349m().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(C3572i0.f12577h);
            C1063k.m4457d(C1089q0.m4557a(interfaceC3284g), null, null, new a(interfaceC3284g, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
