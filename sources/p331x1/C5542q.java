package p331x1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p331x1.AbstractC5537m;

/* renamed from: x1.q */
/* loaded from: classes.dex */
public class C5542q extends AbstractC5537m {

    /* renamed from: S */
    public int f20788S;

    /* renamed from: Q */
    public ArrayList<AbstractC5537m> f20786Q = new ArrayList<>();

    /* renamed from: R */
    public boolean f20787R = true;

    /* renamed from: T */
    public boolean f20789T = false;

    /* renamed from: U */
    public int f20790U = 0;

    /* renamed from: x1.q$a */
    /* loaded from: classes.dex */
    public class a extends C5539n {

        /* renamed from: a */
        public final /* synthetic */ AbstractC5537m f20791a;

        public a(AbstractC5537m abstractC5537m) {
            this.f20791a = abstractC5537m;
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: d */
        public void mo22218d(AbstractC5537m abstractC5537m) {
            this.f20791a.mo22291X();
            abstractC5537m.mo22287T(this);
        }
    }

    /* renamed from: x1.q$b */
    /* loaded from: classes.dex */
    public static class b extends C5539n {

        /* renamed from: a */
        public C5542q f20793a;

        public b(C5542q c5542q) {
            this.f20793a = c5542q;
        }

        @Override // p331x1.C5539n, p331x1.AbstractC5537m.f
        /* renamed from: a */
        public void mo22247a(AbstractC5537m abstractC5537m) {
            C5542q c5542q = this.f20793a;
            if (c5542q.f20789T) {
                return;
            }
            c5542q.m22301e0();
            this.f20793a.f20789T = true;
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: d */
        public void mo22218d(AbstractC5537m abstractC5537m) {
            C5542q c5542q = this.f20793a;
            int i10 = c5542q.f20788S - 1;
            c5542q.f20788S = i10;
            if (i10 == 0) {
                c5542q.f20789T = false;
                c5542q.m22311s();
            }
            abstractC5537m.mo22287T(this);
        }
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: R */
    public void mo22285R(View view) {
        super.mo22285R(view);
        int size = this.f20786Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20786Q.get(i10).mo22285R(view);
        }
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: V */
    public void mo22289V(View view) {
        super.mo22289V(view);
        int size = this.f20786Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20786Q.get(i10).mo22289V(view);
        }
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: X */
    public void mo22291X() {
        if (this.f20786Q.isEmpty()) {
            m22301e0();
            m22311s();
            return;
        }
        m22336s0();
        if (this.f20787R) {
            Iterator<AbstractC5537m> it = this.f20786Q.iterator();
            while (it.hasNext()) {
                it.next().mo22291X();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f20786Q.size(); i10++) {
            this.f20786Q.get(i10 - 1).mo22295b(new a(this.f20786Q.get(i10)));
        }
        AbstractC5537m abstractC5537m = this.f20786Q.get(0);
        if (abstractC5537m != null) {
            abstractC5537m.mo22291X();
        }
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: Z */
    public void mo22293Z(AbstractC5537m.e eVar) {
        super.mo22293Z(eVar);
        this.f20790U |= 8;
        int size = this.f20786Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20786Q.get(i10).mo22293Z(eVar);
        }
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: b0 */
    public void mo22296b0(AbstractC5525g abstractC5525g) {
        super.mo22296b0(abstractC5525g);
        this.f20790U |= 4;
        if (this.f20786Q != null) {
            for (int i10 = 0; i10 < this.f20786Q.size(); i10++) {
                this.f20786Q.get(i10).mo22296b0(abstractC5525g);
            }
        }
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: c0 */
    public void mo22298c0(AbstractC5541p abstractC5541p) {
        super.mo22298c0(abstractC5541p);
        this.f20790U |= 2;
        int size = this.f20786Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20786Q.get(i10).mo22298c0(abstractC5541p);
        }
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: f0 */
    public String mo22302f0(String str) {
        String mo22302f0 = super.mo22302f0(str);
        for (int i10 = 0; i10 < this.f20786Q.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo22302f0);
            sb2.append("\n");
            sb2.append(this.f20786Q.get(i10).mo22302f0(str + "  "));
            mo22302f0 = sb2.toString();
        }
        return mo22302f0;
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public C5542q mo22295b(AbstractC5537m.f fVar) {
        return (C5542q) super.mo22295b(fVar);
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: h */
    public void mo22304h() {
        super.mo22304h();
        int size = this.f20786Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20786Q.get(i10).mo22304h();
        }
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C5542q mo22297c(View view) {
        for (int i10 = 0; i10 < this.f20786Q.size(); i10++) {
            this.f20786Q.get(i10).mo22297c(view);
        }
        return (C5542q) super.mo22297c(view);
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: i */
    public void mo22201i(C5544s c5544s) {
        if (m22279K(c5544s.f20798b)) {
            Iterator<AbstractC5537m> it = this.f20786Q.iterator();
            while (it.hasNext()) {
                AbstractC5537m next = it.next();
                if (next.m22279K(c5544s.f20798b)) {
                    next.mo22201i(c5544s);
                    c5544s.f20799c.add(next);
                }
            }
        }
    }

    /* renamed from: i0 */
    public C5542q m22326i0(AbstractC5537m abstractC5537m) {
        m22327j0(abstractC5537m);
        long j10 = this.f20754j;
        if (j10 >= 0) {
            abstractC5537m.mo22292Y(j10);
        }
        if ((this.f20790U & 1) != 0) {
            abstractC5537m.mo22294a0(m22314v());
        }
        if ((this.f20790U & 2) != 0) {
            abstractC5537m.mo22298c0(m22318z());
        }
        if ((this.f20790U & 4) != 0) {
            abstractC5537m.mo22296b0(m22317y());
        }
        if ((this.f20790U & 8) != 0) {
            abstractC5537m.mo22293Z(m22313u());
        }
        return this;
    }

    /* renamed from: j0 */
    public final void m22327j0(AbstractC5537m abstractC5537m) {
        this.f20786Q.add(abstractC5537m);
        abstractC5537m.f20769y = this;
    }

    /* renamed from: k0 */
    public AbstractC5537m m22328k0(int i10) {
        if (i10 < 0 || i10 >= this.f20786Q.size()) {
            return null;
        }
        return this.f20786Q.get(i10);
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: l */
    public void mo22306l(C5544s c5544s) {
        super.mo22306l(c5544s);
        int size = this.f20786Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20786Q.get(i10).mo22306l(c5544s);
        }
    }

    /* renamed from: l0 */
    public int m22329l0() {
        return this.f20786Q.size();
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: m */
    public void mo22202m(C5544s c5544s) {
        if (m22279K(c5544s.f20798b)) {
            Iterator<AbstractC5537m> it = this.f20786Q.iterator();
            while (it.hasNext()) {
                AbstractC5537m next = it.next();
                if (next.m22279K(c5544s.f20798b)) {
                    next.mo22202m(c5544s);
                    c5544s.f20799c.add(next);
                }
            }
        }
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C5542q mo22287T(AbstractC5537m.f fVar) {
        return (C5542q) super.mo22287T(fVar);
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C5542q mo22288U(View view) {
        for (int i10 = 0; i10 < this.f20786Q.size(); i10++) {
            this.f20786Q.get(i10).mo22288U(view);
        }
        return (C5542q) super.mo22288U(view);
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C5542q mo22292Y(long j10) {
        ArrayList<AbstractC5537m> arrayList;
        super.mo22292Y(j10);
        if (this.f20754j >= 0 && (arrayList = this.f20786Q) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f20786Q.get(i10).mo22292Y(j10);
            }
        }
        return this;
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: p */
    public AbstractC5537m clone() {
        C5542q c5542q = (C5542q) super.clone();
        c5542q.f20786Q = new ArrayList<>();
        int size = this.f20786Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            c5542q.m22327j0(this.f20786Q.get(i10).clone());
        }
        return c5542q;
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C5542q mo22294a0(TimeInterpolator timeInterpolator) {
        this.f20790U |= 1;
        ArrayList<AbstractC5537m> arrayList = this.f20786Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f20786Q.get(i10).mo22294a0(timeInterpolator);
            }
        }
        return (C5542q) super.mo22294a0(timeInterpolator);
    }

    /* renamed from: q0 */
    public C5542q m22334q0(int i10) {
        if (i10 == 0) {
            this.f20787R = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
            }
            this.f20787R = false;
        }
        return this;
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: r */
    public void mo22310r(ViewGroup viewGroup, C5545t c5545t, C5545t c5545t2, ArrayList<C5544s> arrayList, ArrayList<C5544s> arrayList2) {
        long m22273B = m22273B();
        int size = this.f20786Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC5537m abstractC5537m = this.f20786Q.get(i10);
            if (m22273B > 0 && (this.f20787R || i10 == 0)) {
                long m22273B2 = abstractC5537m.m22273B();
                if (m22273B2 > 0) {
                    abstractC5537m.mo22299d0(m22273B2 + m22273B);
                } else {
                    abstractC5537m.mo22299d0(m22273B);
                }
            }
            abstractC5537m.mo22310r(viewGroup, c5545t, c5545t2, arrayList, arrayList2);
        }
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C5542q mo22299d0(long j10) {
        return (C5542q) super.mo22299d0(j10);
    }

    /* renamed from: s0 */
    public final void m22336s0() {
        b bVar = new b(this);
        Iterator<AbstractC5537m> it = this.f20786Q.iterator();
        while (it.hasNext()) {
            it.next().mo22295b(bVar);
        }
        this.f20788S = this.f20786Q.size();
    }
}
