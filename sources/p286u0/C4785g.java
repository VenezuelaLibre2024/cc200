package p286u0;

import gd.C2238l;
import gd.C2245s;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import p246r0.InterfaceC4262f;
import sd.InterfaceC4584p;

/* renamed from: u0.g */
/* loaded from: classes.dex */
public final class C4785g {

    @InterfaceC3472f(m12916c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m12917f = "Preferences.kt", m12918l = {329}, m12919m = "invokeSuspend")
    /* renamed from: u0.g$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3478l implements InterfaceC4584p<AbstractC4782d, InterfaceC3281d<? super AbstractC4782d>, Object> {

        /* renamed from: h */
        public int f17815h;

        /* renamed from: i */
        public /* synthetic */ Object f17816i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC4584p<C4779a, InterfaceC3281d<? super C2245s>, Object> f17817j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC4584p<? super C4779a, ? super InterfaceC3281d<? super C2245s>, ? extends Object> interfaceC4584p, InterfaceC3281d<? super a> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f17817j = interfaceC4584p;
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4782d abstractC4782d, InterfaceC3281d<? super AbstractC4782d> interfaceC3281d) {
            return ((a) create(abstractC4782d, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            a aVar = new a(this.f17817j, interfaceC3281d);
            aVar.f17816i = obj;
            return aVar;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            Object m12581c = C3385c.m12581c();
            int i10 = this.f17815h;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4779a c4779a = (C4779a) this.f17816i;
                C2238l.m8975b(obj);
                return c4779a;
            }
            C2238l.m8975b(obj);
            C4779a m18788c = ((AbstractC4782d) this.f17816i).m18788c();
            InterfaceC4584p<C4779a, InterfaceC3281d<? super C2245s>, Object> interfaceC4584p = this.f17817j;
            this.f17816i = m18788c;
            this.f17815h = 1;
            return interfaceC4584p.invoke(m18788c, this) == m12581c ? m12581c : m18788c;
        }
    }

    /* renamed from: a */
    public static final Object m18802a(InterfaceC4262f<AbstractC4782d> interfaceC4262f, InterfaceC4584p<? super C4779a, ? super InterfaceC3281d<? super C2245s>, ? extends Object> interfaceC4584p, InterfaceC3281d<? super AbstractC4782d> interfaceC3281d) {
        return interfaceC4262f.mo16350a(new a(interfaceC4584p, null), interfaceC3281d);
    }
}
