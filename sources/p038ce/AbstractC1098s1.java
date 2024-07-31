package p038ce;

import java.io.Closeable;
import p146jd.AbstractC3279b;
import p146jd.InterfaceC3284g;
import sd.InterfaceC4580l;
import td.AbstractC4754n;
import td.C4747g;

/* renamed from: ce.s1 */
/* loaded from: classes2.dex */
public abstract class AbstractC1098s1 extends AbstractC1064k0 implements Closeable {

    /* renamed from: j */
    public static final a f4083j = new a(null);

    /* renamed from: ce.s1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC3279b<AbstractC1064k0, AbstractC1098s1> {

        /* renamed from: ce.s1$a$a */
        /* loaded from: classes2.dex */
        public static final class C6148a extends AbstractC4754n implements InterfaceC4580l<InterfaceC3284g.b, AbstractC1098s1> {

            /* renamed from: h */
            public static final C6148a f4084h = new C6148a();

            public C6148a() {
                super(1);
            }

            @Override // sd.InterfaceC4580l
            /* renamed from: a */
            public final AbstractC1098s1 invoke(InterfaceC3284g.b bVar) {
                if (bVar instanceof AbstractC1098s1) {
                    return (AbstractC1098s1) bVar;
                }
                return null;
            }
        }

        public a() {
            super(AbstractC1064k0.f4036i, C6148a.f4084h);
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }
}
