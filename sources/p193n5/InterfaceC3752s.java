package p193n5;

import java.util.List;
import p206o5.InterfaceC3900e;
import p222p5.C4046r;
import p264s3.AbstractC4505u3;
import p264s3.C4463m1;
import p290u4.C4881s0;
import p290u4.InterfaceC4882t;
import p318w4.AbstractC5266f;
import p318w4.AbstractC5274n;
import p318w4.InterfaceC5275o;

/* renamed from: n5.s */
/* loaded from: classes.dex */
public interface InterfaceC3752s extends InterfaceC3755v {

    /* renamed from: n5.s$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C4881s0 f13466a;

        /* renamed from: b */
        public final int[] f13467b;

        /* renamed from: c */
        public final int f13468c;

        public a(C4881s0 c4881s0, int... iArr) {
            this(c4881s0, iArr, 0);
        }

        public a(C4881s0 c4881s0, int[] iArr, int i10) {
            if (iArr.length == 0) {
                C4046r.m15524d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f13466a = c4881s0;
            this.f13467b = iArr;
            this.f13468c = i10;
        }
    }

    /* renamed from: n5.s$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        InterfaceC3752s[] mo14069a(a[] aVarArr, InterfaceC3900e interfaceC3900e, InterfaceC4882t.b bVar, AbstractC4505u3 abstractC4505u3);
    }

    /* renamed from: f */
    void mo14060f();

    /* renamed from: g */
    int mo14061g();

    /* renamed from: h */
    boolean mo14090h(int i10, long j10);

    /* renamed from: i */
    boolean mo14091i(int i10, long j10);

    /* renamed from: j */
    void mo14062j(long j10, long j11, long j12, List<? extends AbstractC5274n> list, InterfaceC5275o[] interfaceC5275oArr);

    /* renamed from: k */
    default void m14237k(boolean z10) {
    }

    /* renamed from: l */
    void mo14063l();

    /* renamed from: m */
    int mo14064m(long j10, List<? extends AbstractC5274n> list);

    /* renamed from: n */
    int mo14092n();

    /* renamed from: o */
    C4463m1 mo14093o();

    /* renamed from: p */
    int mo14065p();

    /* renamed from: q */
    void mo14066q(float f10);

    /* renamed from: r */
    Object mo14067r();

    /* renamed from: s */
    default void m14238s() {
    }

    /* renamed from: t */
    default boolean m14239t(long j10, AbstractC5266f abstractC5266f, List<? extends AbstractC5274n> list) {
        return false;
    }

    /* renamed from: u */
    default void m14240u() {
    }
}
