package ae;

import gd.C2236j;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p343xd.C5762f;
import p343xd.C5767k;
import p373zd.InterfaceC6124b;
import sd.InterfaceC4584p;
import td.C4753m;

/* renamed from: ae.d */
/* loaded from: classes2.dex */
public final class C0098d implements InterfaceC6124b<C5762f> {

    /* renamed from: a */
    public final CharSequence f336a;

    /* renamed from: b */
    public final int f337b;

    /* renamed from: c */
    public final int f338c;

    /* renamed from: d */
    public final InterfaceC4584p<CharSequence, Integer, C2236j<Integer, Integer>> f339d;

    /* renamed from: ae.d$a */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<C5762f> {

        /* renamed from: h */
        public int f340h = -1;

        /* renamed from: i */
        public int f341i;

        /* renamed from: j */
        public int f342j;

        /* renamed from: k */
        public C5762f f343k;

        /* renamed from: l */
        public int f344l;

        public a() {
            int m22908e = C5767k.m22908e(C0098d.this.f337b, 0, C0098d.this.f336a.length());
            this.f341i = m22908e;
            this.f342j = m22908e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f345m.f338c) goto L9;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m408a() {
            /*
                r6 = this;
                int r0 = r6.f342j
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f340h = r1
                r0 = 0
                r6.f343k = r0
                goto L99
            Lc:
                ae.d r0 = ae.C0098d.this
                int r0 = ae.C0098d.m406c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f344l
                int r0 = r0 + r3
                r6.f344l = r0
                ae.d r4 = ae.C0098d.this
                int r4 = ae.C0098d.m406c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f342j
                ae.d r4 = ae.C0098d.this
                java.lang.CharSequence r4 = ae.C0098d.m405b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                xd.f r0 = new xd.f
                int r1 = r6.f341i
                ae.d r4 = ae.C0098d.this
                java.lang.CharSequence r4 = ae.C0098d.m405b(r4)
                int r4 = ae.C0109o.m485y(r4)
                r0.<init>(r1, r4)
            L42:
                r6.f343k = r0
            L44:
                r6.f342j = r2
                goto L97
            L47:
                ae.d r0 = ae.C0098d.this
                sd.p r0 = ae.C0098d.m404a(r0)
                ae.d r4 = ae.C0098d.this
                java.lang.CharSequence r4 = ae.C0098d.m405b(r4)
                int r5 = r6.f342j
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                gd.j r0 = (gd.C2236j) r0
                if (r0 != 0) goto L73
                xd.f r0 = new xd.f
                int r1 = r6.f341i
                ae.d r4 = ae.C0098d.this
                java.lang.CharSequence r4 = ae.C0098d.m405b(r4)
                int r4 = ae.C0109o.m485y(r4)
                r0.<init>(r1, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.m8961a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m8962b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f341i
                xd.f r4 = p343xd.C5767k.m22911h(r4, r2)
                r6.f343k = r4
                int r2 = r2 + r0
                r6.f341i = r2
                if (r0 != 0) goto L95
                r1 = r3
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f340h = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ae.C0098d.a.m408a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C5762f next() {
            if (this.f340h == -1) {
                m408a();
            }
            if (this.f340h == 0) {
                throw new NoSuchElementException();
            }
            C5762f c5762f = this.f343k;
            C4753m.m18651d(c5762f, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f343k = null;
            this.f340h = -1;
            return c5762f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f340h == -1) {
                m408a();
            }
            return this.f340h == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0098d(CharSequence charSequence, int i10, int i11, InterfaceC4584p<? super CharSequence, ? super Integer, C2236j<Integer, Integer>> interfaceC4584p) {
        C4753m.m18653f(charSequence, "input");
        C4753m.m18653f(interfaceC4584p, "getNextMatch");
        this.f336a = charSequence;
        this.f337b = i10;
        this.f338c = i11;
        this.f339d = interfaceC4584p;
    }

    @Override // p373zd.InterfaceC6124b
    public Iterator<C5762f> iterator() {
        return new a();
    }
}
