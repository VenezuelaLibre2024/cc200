package androidx.window.layout;

import android.app.Activity;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import ee.InterfaceC1776d;
import gd.C2245s;
import p087fe.InterfaceC1907c;
import p146jd.InterfaceC3281d;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import sd.InterfaceC4584p;
import td.C4753m;

@InterfaceC3472f(m12916c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", m12917f = "WindowInfoTrackerImpl.kt", m12918l = {C1417R.styleable.AppCompatTheme_colorControlHighlight, C1417R.styleable.AppCompatTheme_colorControlNormal}, m12919m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends AbstractC3478l implements InterfaceC4584p<InterfaceC1907c<? super WindowLayoutInfo>, InterfaceC3281d<? super C2245s>, Object> {
    public final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, InterfaceC3281d<? super WindowInfoTrackerImpl$windowLayoutInfo$1> interfaceC3281d) {
        super(2, interfaceC3281d);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
    public static final void m24456invokeSuspend$lambda0(InterfaceC1776d interfaceC1776d, WindowLayoutInfo windowLayoutInfo) {
        C4753m.m18652e(windowLayoutInfo, "info");
        interfaceC1776d.mo7116c(windowLayoutInfo);
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, interfaceC3281d);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    @Override // sd.InterfaceC4584p
    public final Object invoke(InterfaceC1907c<? super WindowLayoutInfo> interfaceC1907c, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(interfaceC1907c, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #1 {all -> 0x009e, blocks: (B:11:0x0061, B:16:0x0073, B:18:0x007b), top: B:10:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0090 -> B:10:0x0061). Please report as a decompilation issue!!! */
    @Override // p173ld.AbstractC3467a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p161kd.C3385c.m12581c()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r9.L$2
            ee.e r1 = (ee.InterfaceC1777e) r1
            java.lang.Object r4 = r9.L$1
            j0.a r4 = (p133j0.InterfaceC3202a) r4
            java.lang.Object r5 = r9.L$0
            fe.c r5 = (p087fe.InterfaceC1907c) r5
            gd.C2238l.m8975b(r10)     // Catch: java.lang.Throwable -> La0
            r10 = r5
            goto L60
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            java.lang.Object r1 = r9.L$2
            ee.e r1 = (ee.InterfaceC1777e) r1
            java.lang.Object r4 = r9.L$1
            j0.a r4 = (p133j0.InterfaceC3202a) r4
            java.lang.Object r5 = r9.L$0
            fe.c r5 = (p087fe.InterfaceC1907c) r5
            gd.C2238l.m8975b(r10)     // Catch: java.lang.Throwable -> La0
            r6 = r5
            r5 = r9
            goto L73
        L39:
            gd.C2238l.m8975b(r10)
            java.lang.Object r10 = r9.L$0
            fe.c r10 = (p087fe.InterfaceC1907c) r10
            r1 = 10
            ee.a r4 = ee.EnumC1773a.DROP_OLDEST
            r5 = 4
            r6 = 0
            ee.d r1 = ee.C1778f.m7193b(r1, r4, r6, r5, r6)
            androidx.window.layout.b r4 = new androidx.window.layout.b
            r4.<init>()
            androidx.window.layout.WindowInfoTrackerImpl r5 = r9.this$0
            androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
            android.app.Activity r6 = r9.$activity
            androidx.window.layout.c r7 = androidx.window.layout.ExecutorC0412c.f1952h
            r5.registerLayoutChangeCallback(r6, r7, r4)
            ee.e r1 = r1.iterator()     // Catch: java.lang.Throwable -> La0
        L60:
            r5 = r9
        L61:
            r5.L$0 = r10     // Catch: java.lang.Throwable -> L9e
            r5.L$1 = r4     // Catch: java.lang.Throwable -> L9e
            r5.L$2 = r1     // Catch: java.lang.Throwable -> L9e
            r5.label = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r6 = r1.mo7151a(r5)     // Catch: java.lang.Throwable -> L9e
            if (r6 != r0) goto L70
            return r0
        L70:
            r8 = r6
            r6 = r10
            r10 = r8
        L73:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9e
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9e
            if (r10 == 0) goto L92
            java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L9e
            androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> L9e
            r5.L$0 = r6     // Catch: java.lang.Throwable -> L9e
            r5.L$1 = r4     // Catch: java.lang.Throwable -> L9e
            r5.L$2 = r1     // Catch: java.lang.Throwable -> L9e
            r5.label = r2     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r10 = r6.emit(r10, r5)     // Catch: java.lang.Throwable -> L9e
            if (r10 != r0) goto L90
            return r0
        L90:
            r10 = r6
            goto L61
        L92:
            androidx.window.layout.WindowInfoTrackerImpl r10 = r5.this$0
            androidx.window.layout.WindowBackend r10 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r10)
            r10.unregisterLayoutChangeCallback(r4)
            gd.s r10 = gd.C2245s.f8873a
            return r10
        L9e:
            r10 = move-exception
            goto La2
        La0:
            r10 = move-exception
            r5 = r9
        La2:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r5.this$0
            androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
            r0.unregisterLayoutChangeCallback(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
