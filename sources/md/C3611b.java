package md;

import sd.InterfaceC4569a;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: md.b */
/* loaded from: classes2.dex */
public final class C3611b {

    /* renamed from: md.b$a */
    /* loaded from: classes2.dex */
    public static final class a<E> extends AbstractC4754n implements InterfaceC4569a<E[]> {

        /* renamed from: h */
        public final /* synthetic */ Enum[] f12739h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Enum[] enumArr) {
            super(0);
            this.f12739h = enumArr;
        }

        @Override // sd.InterfaceC4569a
        /* renamed from: a */
        public final Enum[] invoke() {
            return this.f12739h;
        }
    }

    /* renamed from: a */
    public static final <E extends Enum<E>> InterfaceC3610a<E> m13362a(E[] eArr) {
        C4753m.m18653f(eArr, "entries");
        C3612c c3612c = new C3612c(new a(eArr));
        c3612c.size();
        return c3612c;
    }
}
