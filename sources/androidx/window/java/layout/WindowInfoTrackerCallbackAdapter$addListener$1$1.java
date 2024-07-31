package androidx.window.java.layout;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2238l;
import gd.C2245s;
import p038ce.InterfaceC1085p0;
import p087fe.InterfaceC1906b;
import p087fe.InterfaceC1907c;
import p133j0.InterfaceC3202a;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import sd.InterfaceC4584p;

@InterfaceC3472f(m12916c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", m12917f = "WindowInfoTrackerCallbackAdapter.kt", m12918l = {C1417R.styleable.AppCompatTheme_seekBarStyle}, m12919m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {
    public final /* synthetic */ InterfaceC3202a<T> $consumer;
    public final /* synthetic */ InterfaceC1906b<T> $flow;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowInfoTrackerCallbackAdapter$addListener$1$1(InterfaceC1906b<? extends T> interfaceC1906b, InterfaceC3202a<T> interfaceC3202a, InterfaceC3281d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> interfaceC3281d) {
        super(2, interfaceC3281d);
        this.$flow = interfaceC1906b;
        this.$consumer = interfaceC3202a;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        Object m12581c = C3385c.m12581c();
        int i10 = this.label;
        if (i10 == 0) {
            C2238l.m8975b(obj);
            InterfaceC1906b<T> interfaceC1906b = this.$flow;
            C0408x3e71c403 c0408x3e71c403 = new InterfaceC1907c<T>() { // from class: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                public C0408x3e71c403() {
                }

                @Override // p087fe.InterfaceC1907c
                public Object emit(T t10, InterfaceC3281d<? super C2245s> interfaceC3281d) {
                    InterfaceC3202a.this.accept(t10);
                    return C2245s.f8873a;
                }
            };
            this.label = 1;
            if (interfaceC1906b.mo7781a(c0408x3e71c403, this) == m12581c) {
                return m12581c;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2238l.m8975b(obj);
        }
        return C2245s.f8873a;
    }
}
