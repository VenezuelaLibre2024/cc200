package p109h7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p079f6.C1841a;

/* renamed from: h7.s */
/* loaded from: classes.dex */
public final class C2436s {

    /* renamed from: a */
    public final AbstractC2421d f9764a;

    /* renamed from: b */
    public final boolean f9765b;

    /* renamed from: c */
    public final c f9766c;

    /* renamed from: d */
    public final int f9767d;

    /* renamed from: h7.s$a */
    /* loaded from: classes.dex */
    public class a implements c {

        /* renamed from: a */
        public final /* synthetic */ AbstractC2421d f9768a;

        /* renamed from: h7.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C6183a extends b {
            public C6183a(C2436s c2436s, CharSequence charSequence) {
                super(c2436s, charSequence);
            }

            @Override // p109h7.C2436s.b
            /* renamed from: f */
            public int mo9725f(int i10) {
                return i10 + 1;
            }

            @Override // p109h7.C2436s.b
            /* renamed from: g */
            public int mo9726g(int i10) {
                return a.this.f9768a.mo9672c(this.f9770j, i10);
            }
        }

        public a(AbstractC2421d abstractC2421d) {
            this.f9768a = abstractC2421d;
        }

        @Override // p109h7.C2436s.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo9723a(C2436s c2436s, CharSequence charSequence) {
            return new C6183a(c2436s, charSequence);
        }
    }

    /* renamed from: h7.s$b */
    /* loaded from: classes.dex */
    public static abstract class b extends AbstractC2419b<String> {

        /* renamed from: j */
        public final CharSequence f9770j;

        /* renamed from: k */
        public final AbstractC2421d f9771k;

        /* renamed from: l */
        public final boolean f9772l;

        /* renamed from: m */
        public int f9773m = 0;

        /* renamed from: n */
        public int f9774n;

        public b(C2436s c2436s, CharSequence charSequence) {
            this.f9771k = c2436s.f9764a;
            this.f9772l = c2436s.f9765b;
            this.f9774n = c2436s.f9767d;
            this.f9770j = charSequence;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        
            if (r0 >= r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        
            if (r6.f9771k.mo9673e(r6.f9770j.charAt(r0)) == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            r0 = r0 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        
            if (r1 <= r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        
            if (r6.f9771k.mo9673e(r6.f9770j.charAt(r1 - 1)) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        
            r1 = r1 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        
            if (r6.f9772l == false) goto L39;
         */
        @Override // p109h7.AbstractC2419b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String mo9657a() {
            /*
                r6 = this;
            L0:
                int r0 = r6.f9773m
            L2:
                int r1 = r6.f9773m
                r2 = -1
                if (r1 == r2) goto L8e
                int r1 = r6.mo9726g(r1)
                if (r1 != r2) goto L16
                java.lang.CharSequence r1 = r6.f9770j
                int r1 = r1.length()
                r6.f9773m = r2
                goto L1c
            L16:
                int r3 = r6.mo9725f(r1)
                r6.f9773m = r3
            L1c:
                int r3 = r6.f9773m
                if (r3 != r0) goto L2f
                int r3 = r3 + 1
                r6.f9773m = r3
                java.lang.CharSequence r1 = r6.f9770j
                int r1 = r1.length()
                if (r3 <= r1) goto L2
                r6.f9773m = r2
                goto L2
            L2f:
                if (r0 >= r1) goto L42
                h7.d r3 = r6.f9771k
                java.lang.CharSequence r4 = r6.f9770j
                char r4 = r4.charAt(r0)
                boolean r3 = r3.mo9673e(r4)
                if (r3 == 0) goto L42
                int r0 = r0 + 1
                goto L2f
            L42:
                if (r1 <= r0) goto L57
                h7.d r3 = r6.f9771k
                java.lang.CharSequence r4 = r6.f9770j
                int r5 = r1 + (-1)
                char r4 = r4.charAt(r5)
                boolean r3 = r3.mo9673e(r4)
                if (r3 == 0) goto L57
                int r1 = r1 + (-1)
                goto L42
            L57:
                boolean r3 = r6.f9772l
                if (r3 == 0) goto L5e
                if (r0 != r1) goto L5e
                goto L0
            L5e:
                int r3 = r6.f9774n
                r4 = 1
                if (r3 != r4) goto L80
                java.lang.CharSequence r1 = r6.f9770j
                int r1 = r1.length()
                r6.f9773m = r2
            L6b:
                if (r1 <= r0) goto L83
                h7.d r2 = r6.f9771k
                java.lang.CharSequence r3 = r6.f9770j
                int r4 = r1 + (-1)
                char r3 = r3.charAt(r4)
                boolean r2 = r2.mo9673e(r3)
                if (r2 == 0) goto L83
                int r1 = r1 + (-1)
                goto L6b
            L80:
                int r3 = r3 - r4
                r6.f9774n = r3
            L83:
                java.lang.CharSequence r2 = r6.f9770j
                java.lang.CharSequence r0 = r2.subSequence(r0, r1)
                java.lang.String r0 = r0.toString()
                return r0
            L8e:
                java.lang.Object r0 = r6.m9658c()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p109h7.C2436s.b.mo9657a():java.lang.String");
        }

        /* renamed from: f */
        public abstract int mo9725f(int i10);

        /* renamed from: g */
        public abstract int mo9726g(int i10);
    }

    /* renamed from: h7.s$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        Iterator<String> mo9723a(C2436s c2436s, CharSequence charSequence);
    }

    public C2436s(c cVar) {
        this(cVar, false, AbstractC2421d.m9669f(), C1841a.e.API_PRIORITY_OTHER);
    }

    public C2436s(c cVar, boolean z10, AbstractC2421d abstractC2421d, int i10) {
        this.f9766c = cVar;
        this.f9765b = z10;
        this.f9764a = abstractC2421d;
        this.f9767d = i10;
    }

    /* renamed from: d */
    public static C2436s m9719d(char c10) {
        return m9720e(AbstractC2421d.m9668d(c10));
    }

    /* renamed from: e */
    public static C2436s m9720e(AbstractC2421d abstractC2421d) {
        C2432o.m9704j(abstractC2421d);
        return new C2436s(new a(abstractC2421d));
    }

    /* renamed from: f */
    public List<String> m9721f(CharSequence charSequence) {
        C2432o.m9704j(charSequence);
        Iterator<String> m9722g = m9722g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (m9722g.hasNext()) {
            arrayList.add(m9722g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    public final Iterator<String> m9722g(CharSequence charSequence) {
        return this.f9766c.mo9723a(this, charSequence);
    }
}
