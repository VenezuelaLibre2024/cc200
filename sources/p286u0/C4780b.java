package p286u0;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2238l;
import gd.C2245s;
import p087fe.InterfaceC1906b;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import p246r0.InterfaceC4262f;
import sd.InterfaceC4584p;
import td.C4753m;

/* renamed from: u0.b */
/* loaded from: classes.dex */
public final class C4780b implements InterfaceC4262f<AbstractC4782d> {

    /* renamed from: a */
    public final InterfaceC4262f<AbstractC4782d> f17806a;

    @InterfaceC3472f(m12916c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m12917f = "PreferenceDataStoreFactory.kt", m12918l = {C1417R.styleable.AppCompatTheme_listPreferredItemPaddingStart}, m12919m = "invokeSuspend")
    /* renamed from: u0.b$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3478l implements InterfaceC4584p<AbstractC4782d, InterfaceC3281d<? super AbstractC4782d>, Object> {

        /* renamed from: h */
        public int f17807h;

        /* renamed from: i */
        public /* synthetic */ Object f17808i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC4584p<AbstractC4782d, InterfaceC3281d<? super AbstractC4782d>, Object> f17809j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC4584p<? super AbstractC4782d, ? super InterfaceC3281d<? super AbstractC4782d>, ? extends Object> interfaceC4584p, InterfaceC3281d<? super a> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f17809j = interfaceC4584p;
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4782d abstractC4782d, InterfaceC3281d<? super AbstractC4782d> interfaceC3281d) {
            return ((a) create(abstractC4782d, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            a aVar = new a(this.f17809j, interfaceC3281d);
            aVar.f17808i = obj;
            return aVar;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            Object m12581c = C3385c.m12581c();
            int i10 = this.f17807h;
            if (i10 == 0) {
                C2238l.m8975b(obj);
                AbstractC4782d abstractC4782d = (AbstractC4782d) this.f17808i;
                InterfaceC4584p<AbstractC4782d, InterfaceC3281d<? super AbstractC4782d>, Object> interfaceC4584p = this.f17809j;
                this.f17807h = 1;
                obj = interfaceC4584p.invoke(abstractC4782d, this);
                if (obj == m12581c) {
                    return m12581c;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2238l.m8975b(obj);
            }
            AbstractC4782d abstractC4782d2 = (AbstractC4782d) obj;
            ((C4779a) abstractC4782d2).m18779f();
            return abstractC4782d2;
        }
    }

    public C4780b(InterfaceC4262f<AbstractC4782d> interfaceC4262f) {
        C4753m.m18653f(interfaceC4262f, "delegate");
        this.f17806a = interfaceC4262f;
    }

    @Override // p246r0.InterfaceC4262f
    /* renamed from: a */
    public Object mo16350a(InterfaceC4584p<? super AbstractC4782d, ? super InterfaceC3281d<? super AbstractC4782d>, ? extends Object> interfaceC4584p, InterfaceC3281d<? super AbstractC4782d> interfaceC3281d) {
        return this.f17806a.mo16350a(new a(interfaceC4584p, null), interfaceC3281d);
    }

    @Override // p246r0.InterfaceC4262f
    public InterfaceC1906b<AbstractC4782d> getData() {
        return this.f17806a.getData();
    }
}
