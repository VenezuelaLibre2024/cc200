package p331x1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p148k0.C3308b0;
import p285u.C4771a;
import p285u.C4774d;

/* renamed from: x1.m */
/* loaded from: classes.dex */
public abstract class AbstractC5537m implements Cloneable {

    /* renamed from: N */
    public static final int[] f20736N = {2, 1, 3, 4};

    /* renamed from: O */
    public static final AbstractC5525g f20737O = new a();

    /* renamed from: P */
    public static ThreadLocal<C4771a<Animator, d>> f20738P = new ThreadLocal<>();

    /* renamed from: A */
    public ArrayList<C5544s> f20739A;

    /* renamed from: B */
    public ArrayList<C5544s> f20740B;

    /* renamed from: J */
    public AbstractC5541p f20748J;

    /* renamed from: K */
    public e f20749K;

    /* renamed from: L */
    public C4771a<String, String> f20750L;

    /* renamed from: h */
    public String f20752h = getClass().getName();

    /* renamed from: i */
    public long f20753i = -1;

    /* renamed from: j */
    public long f20754j = -1;

    /* renamed from: k */
    public TimeInterpolator f20755k = null;

    /* renamed from: l */
    public ArrayList<Integer> f20756l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<View> f20757m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<String> f20758n = null;

    /* renamed from: o */
    public ArrayList<Class<?>> f20759o = null;

    /* renamed from: p */
    public ArrayList<Integer> f20760p = null;

    /* renamed from: q */
    public ArrayList<View> f20761q = null;

    /* renamed from: r */
    public ArrayList<Class<?>> f20762r = null;

    /* renamed from: s */
    public ArrayList<String> f20763s = null;

    /* renamed from: t */
    public ArrayList<Integer> f20764t = null;

    /* renamed from: u */
    public ArrayList<View> f20765u = null;

    /* renamed from: v */
    public ArrayList<Class<?>> f20766v = null;

    /* renamed from: w */
    public C5545t f20767w = new C5545t();

    /* renamed from: x */
    public C5545t f20768x = new C5545t();

    /* renamed from: y */
    public C5542q f20769y = null;

    /* renamed from: z */
    public int[] f20770z = f20736N;

    /* renamed from: C */
    public boolean f20741C = false;

    /* renamed from: D */
    public ArrayList<Animator> f20742D = new ArrayList<>();

    /* renamed from: E */
    public int f20743E = 0;

    /* renamed from: F */
    public boolean f20744F = false;

    /* renamed from: G */
    public boolean f20745G = false;

    /* renamed from: H */
    public ArrayList<f> f20746H = null;

    /* renamed from: I */
    public ArrayList<Animator> f20747I = new ArrayList<>();

    /* renamed from: M */
    public AbstractC5525g f20751M = f20737O;

    /* renamed from: x1.m$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC5525g {
        @Override // p331x1.AbstractC5525g
        /* renamed from: a */
        public Path mo22252a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* renamed from: x1.m$b */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C4771a f20771a;

        public b(C4771a c4771a) {
            this.f20771a = c4771a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f20771a.remove(animator);
            AbstractC5537m.this.f20742D.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC5537m.this.f20742D.add(animator);
        }
    }

    /* renamed from: x1.m$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC5537m.this.m22311s();
            animator.removeListener(this);
        }
    }

    /* renamed from: x1.m$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public View f20774a;

        /* renamed from: b */
        public String f20775b;

        /* renamed from: c */
        public C5544s f20776c;

        /* renamed from: d */
        public InterfaceC5538m0 f20777d;

        /* renamed from: e */
        public AbstractC5537m f20778e;

        public d(View view, String str, AbstractC5537m abstractC5537m, InterfaceC5538m0 interfaceC5538m0, C5544s c5544s) {
            this.f20774a = view;
            this.f20775b = str;
            this.f20776c = c5544s;
            this.f20777d = interfaceC5538m0;
            this.f20778e = abstractC5537m;
        }
    }

    /* renamed from: x1.m$e */
    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* renamed from: x1.m$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo22247a(AbstractC5537m abstractC5537m);

        /* renamed from: b */
        void mo22216b(AbstractC5537m abstractC5537m);

        /* renamed from: c */
        void mo22217c(AbstractC5537m abstractC5537m);

        /* renamed from: d */
        void mo22218d(AbstractC5537m abstractC5537m);

        /* renamed from: e */
        void mo22219e(AbstractC5537m abstractC5537m);
    }

    /* renamed from: A */
    public static C4771a<Animator, d> m22270A() {
        C4771a<Animator, d> c4771a = f20738P.get();
        if (c4771a != null) {
            return c4771a;
        }
        C4771a<Animator, d> c4771a2 = new C4771a<>();
        f20738P.set(c4771a2);
        return c4771a2;
    }

    /* renamed from: L */
    public static boolean m22271L(C5544s c5544s, C5544s c5544s2, String str) {
        Object obj = c5544s.f20797a.get(str);
        Object obj2 = c5544s2.f20797a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: f */
    public static void m22272f(C5545t c5545t, View view, C5544s c5544s) {
        c5545t.f20800a.put(view, c5544s);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (c5545t.f20801b.indexOfKey(id2) >= 0) {
                c5545t.f20801b.put(id2, null);
            } else {
                c5545t.f20801b.put(id2, view);
            }
        }
        String m11987A = C3308b0.m11987A(view);
        if (m11987A != null) {
            if (c5545t.f20803d.containsKey(m11987A)) {
                c5545t.f20803d.put(m11987A, null);
            } else {
                c5545t.f20803d.put(m11987A, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c5545t.f20802c.m18736i(itemIdAtPosition) < 0) {
                    C3308b0.m12022e0(view, true);
                    c5545t.f20802c.m18738l(itemIdAtPosition, view);
                    return;
                }
                View m18734g = c5545t.f20802c.m18734g(itemIdAtPosition);
                if (m18734g != null) {
                    C3308b0.m12022e0(m18734g, false);
                    c5545t.f20802c.m18738l(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: B */
    public long m22273B() {
        return this.f20753i;
    }

    /* renamed from: C */
    public List<Integer> m22274C() {
        return this.f20756l;
    }

    /* renamed from: D */
    public List<String> m22275D() {
        return this.f20758n;
    }

    /* renamed from: F */
    public List<Class<?>> m22276F() {
        return this.f20759o;
    }

    /* renamed from: G */
    public List<View> m22277G() {
        return this.f20757m;
    }

    /* renamed from: H */
    public String[] mo22198H() {
        return null;
    }

    /* renamed from: I */
    public C5544s m22278I(View view, boolean z10) {
        C5542q c5542q = this.f20769y;
        if (c5542q != null) {
            return c5542q.m22278I(view, z10);
        }
        return (z10 ? this.f20767w : this.f20768x).f20800a.get(view);
    }

    /* renamed from: J */
    public boolean mo22258J(C5544s c5544s, C5544s c5544s2) {
        if (c5544s == null || c5544s2 == null) {
            return false;
        }
        String[] mo22198H = mo22198H();
        if (mo22198H == null) {
            Iterator<String> it = c5544s.f20797a.keySet().iterator();
            while (it.hasNext()) {
                if (m22271L(c5544s, c5544s2, it.next())) {
                }
            }
            return false;
        }
        for (String str : mo22198H) {
            if (!m22271L(c5544s, c5544s2, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: K */
    public boolean m22279K(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f20760p;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f20761q;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f20762r;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f20762r.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f20763s != null && C3308b0.m11987A(view) != null && this.f20763s.contains(C3308b0.m11987A(view))) {
            return false;
        }
        if ((this.f20756l.size() == 0 && this.f20757m.size() == 0 && (((arrayList = this.f20759o) == null || arrayList.isEmpty()) && ((arrayList2 = this.f20758n) == null || arrayList2.isEmpty()))) || this.f20756l.contains(Integer.valueOf(id2)) || this.f20757m.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f20758n;
        if (arrayList6 != null && arrayList6.contains(C3308b0.m11987A(view))) {
            return true;
        }
        if (this.f20759o != null) {
            for (int i11 = 0; i11 < this.f20759o.size(); i11++) {
                if (this.f20759o.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: M */
    public final void m22280M(C4771a<View, C5544s> c4771a, C4771a<View, C5544s> c4771a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && m22279K(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && m22279K(view)) {
                C5544s c5544s = c4771a.get(valueAt);
                C5544s c5544s2 = c4771a2.get(view);
                if (c5544s != null && c5544s2 != null) {
                    this.f20739A.add(c5544s);
                    this.f20740B.add(c5544s2);
                    c4771a.remove(valueAt);
                    c4771a2.remove(view);
                }
            }
        }
    }

    /* renamed from: N */
    public final void m22281N(C4771a<View, C5544s> c4771a, C4771a<View, C5544s> c4771a2) {
        C5544s remove;
        for (int size = c4771a.size() - 1; size >= 0; size--) {
            View m18761i = c4771a.m18761i(size);
            if (m18761i != null && m22279K(m18761i) && (remove = c4771a2.remove(m18761i)) != null && m22279K(remove.f20798b)) {
                this.f20739A.add(c4771a.m18763k(size));
                this.f20740B.add(remove);
            }
        }
    }

    /* renamed from: O */
    public final void m22282O(C4771a<View, C5544s> c4771a, C4771a<View, C5544s> c4771a2, C4774d<View> c4774d, C4774d<View> c4774d2) {
        View m18734g;
        int m18740n = c4774d.m18740n();
        for (int i10 = 0; i10 < m18740n; i10++) {
            View m18741o = c4774d.m18741o(i10);
            if (m18741o != null && m22279K(m18741o) && (m18734g = c4774d2.m18734g(c4774d.m18737k(i10))) != null && m22279K(m18734g)) {
                C5544s c5544s = c4771a.get(m18741o);
                C5544s c5544s2 = c4771a2.get(m18734g);
                if (c5544s != null && c5544s2 != null) {
                    this.f20739A.add(c5544s);
                    this.f20740B.add(c5544s2);
                    c4771a.remove(m18741o);
                    c4771a2.remove(m18734g);
                }
            }
        }
    }

    /* renamed from: P */
    public final void m22283P(C4771a<View, C5544s> c4771a, C4771a<View, C5544s> c4771a2, C4771a<String, View> c4771a3, C4771a<String, View> c4771a4) {
        View view;
        int size = c4771a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View m18765m = c4771a3.m18765m(i10);
            if (m18765m != null && m22279K(m18765m) && (view = c4771a4.get(c4771a3.m18761i(i10))) != null && m22279K(view)) {
                C5544s c5544s = c4771a.get(m18765m);
                C5544s c5544s2 = c4771a2.get(view);
                if (c5544s != null && c5544s2 != null) {
                    this.f20739A.add(c5544s);
                    this.f20740B.add(c5544s2);
                    c4771a.remove(m18765m);
                    c4771a2.remove(view);
                }
            }
        }
    }

    /* renamed from: Q */
    public final void m22284Q(C5545t c5545t, C5545t c5545t2) {
        C4771a<View, C5544s> c4771a = new C4771a<>(c5545t.f20800a);
        C4771a<View, C5544s> c4771a2 = new C4771a<>(c5545t2.f20800a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f20770z;
            if (i10 >= iArr.length) {
                m22300e(c4771a, c4771a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                m22281N(c4771a, c4771a2);
            } else if (i11 == 2) {
                m22283P(c4771a, c4771a2, c5545t.f20803d, c5545t2.f20803d);
            } else if (i11 == 3) {
                m22280M(c4771a, c4771a2, c5545t.f20801b, c5545t2.f20801b);
            } else if (i11 == 4) {
                m22282O(c4771a, c4771a2, c5545t.f20802c, c5545t2.f20802c);
            }
            i10++;
        }
    }

    /* renamed from: R */
    public void mo22285R(View view) {
        if (this.f20745G) {
            return;
        }
        for (int size = this.f20742D.size() - 1; size >= 0; size--) {
            C5513a.m22193b(this.f20742D.get(size));
        }
        ArrayList<f> arrayList = this.f20746H;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f20746H.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((f) arrayList2.get(i10)).mo22216b(this);
            }
        }
        this.f20744F = true;
    }

    /* renamed from: S */
    public void m22286S(ViewGroup viewGroup) {
        d dVar;
        this.f20739A = new ArrayList<>();
        this.f20740B = new ArrayList<>();
        m22284Q(this.f20767w, this.f20768x);
        C4771a<Animator, d> m22270A = m22270A();
        int size = m22270A.size();
        InterfaceC5538m0 m22226d = C5518c0.m22226d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator m18761i = m22270A.m18761i(i10);
            if (m18761i != null && (dVar = m22270A.get(m18761i)) != null && dVar.f20774a != null && m22226d.equals(dVar.f20777d)) {
                C5544s c5544s = dVar.f20776c;
                View view = dVar.f20774a;
                C5544s m22278I = m22278I(view, true);
                C5544s m22315w = m22315w(view, true);
                if (m22278I == null && m22315w == null) {
                    m22315w = this.f20768x.f20800a.get(view);
                }
                if (!(m22278I == null && m22315w == null) && dVar.f20778e.mo22258J(c5544s, m22315w)) {
                    if (m18761i.isRunning() || m18761i.isStarted()) {
                        m18761i.cancel();
                    } else {
                        m22270A.remove(m18761i);
                    }
                }
            }
        }
        mo22310r(viewGroup, this.f20767w, this.f20768x, this.f20739A, this.f20740B);
        mo22291X();
    }

    /* renamed from: T */
    public AbstractC5537m mo22287T(f fVar) {
        ArrayList<f> arrayList = this.f20746H;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f20746H.size() == 0) {
            this.f20746H = null;
        }
        return this;
    }

    /* renamed from: U */
    public AbstractC5537m mo22288U(View view) {
        this.f20757m.remove(view);
        return this;
    }

    /* renamed from: V */
    public void mo22289V(View view) {
        if (this.f20744F) {
            if (!this.f20745G) {
                for (int size = this.f20742D.size() - 1; size >= 0; size--) {
                    C5513a.m22194c(this.f20742D.get(size));
                }
                ArrayList<f> arrayList = this.f20746H;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f20746H.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((f) arrayList2.get(i10)).mo22219e(this);
                    }
                }
            }
            this.f20744F = false;
        }
    }

    /* renamed from: W */
    public final void m22290W(Animator animator, C4771a<Animator, d> c4771a) {
        if (animator != null) {
            animator.addListener(new b(c4771a));
            m22303g(animator);
        }
    }

    /* renamed from: X */
    public void mo22291X() {
        m22301e0();
        C4771a<Animator, d> m22270A = m22270A();
        Iterator<Animator> it = this.f20747I.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m22270A.containsKey(next)) {
                m22301e0();
                m22290W(next, m22270A);
            }
        }
        this.f20747I.clear();
        m22311s();
    }

    /* renamed from: Y */
    public AbstractC5537m mo22292Y(long j10) {
        this.f20754j = j10;
        return this;
    }

    /* renamed from: Z */
    public void mo22293Z(e eVar) {
        this.f20749K = eVar;
    }

    /* renamed from: a0 */
    public AbstractC5537m mo22294a0(TimeInterpolator timeInterpolator) {
        this.f20755k = timeInterpolator;
        return this;
    }

    /* renamed from: b */
    public AbstractC5537m mo22295b(f fVar) {
        if (this.f20746H == null) {
            this.f20746H = new ArrayList<>();
        }
        this.f20746H.add(fVar);
        return this;
    }

    /* renamed from: b0 */
    public void mo22296b0(AbstractC5525g abstractC5525g) {
        if (abstractC5525g == null) {
            abstractC5525g = f20737O;
        }
        this.f20751M = abstractC5525g;
    }

    /* renamed from: c */
    public AbstractC5537m mo22297c(View view) {
        this.f20757m.add(view);
        return this;
    }

    /* renamed from: c0 */
    public void mo22298c0(AbstractC5541p abstractC5541p) {
    }

    /* renamed from: d0 */
    public AbstractC5537m mo22299d0(long j10) {
        this.f20753i = j10;
        return this;
    }

    /* renamed from: e */
    public final void m22300e(C4771a<View, C5544s> c4771a, C4771a<View, C5544s> c4771a2) {
        for (int i10 = 0; i10 < c4771a.size(); i10++) {
            C5544s m18765m = c4771a.m18765m(i10);
            if (m22279K(m18765m.f20798b)) {
                this.f20739A.add(m18765m);
                this.f20740B.add(null);
            }
        }
        for (int i11 = 0; i11 < c4771a2.size(); i11++) {
            C5544s m18765m2 = c4771a2.m18765m(i11);
            if (m22279K(m18765m2.f20798b)) {
                this.f20740B.add(m18765m2);
                this.f20739A.add(null);
            }
        }
    }

    /* renamed from: e0 */
    public void m22301e0() {
        if (this.f20743E == 0) {
            ArrayList<f> arrayList = this.f20746H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f20746H.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).mo22247a(this);
                }
            }
            this.f20745G = false;
        }
        this.f20743E++;
    }

    /* renamed from: f0 */
    public String mo22302f0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f20754j != -1) {
            str2 = str2 + "dur(" + this.f20754j + ") ";
        }
        if (this.f20753i != -1) {
            str2 = str2 + "dly(" + this.f20753i + ") ";
        }
        if (this.f20755k != null) {
            str2 = str2 + "interp(" + this.f20755k + ") ";
        }
        if (this.f20756l.size() <= 0 && this.f20757m.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f20756l.size() > 0) {
            for (int i10 = 0; i10 < this.f20756l.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f20756l.get(i10);
            }
        }
        if (this.f20757m.size() > 0) {
            for (int i11 = 0; i11 < this.f20757m.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f20757m.get(i11);
            }
        }
        return str3 + ")";
    }

    /* renamed from: g */
    public void m22303g(Animator animator) {
        if (animator == null) {
            m22311s();
            return;
        }
        if (m22312t() >= 0) {
            animator.setDuration(m22312t());
        }
        if (m22273B() >= 0) {
            animator.setStartDelay(m22273B() + animator.getStartDelay());
        }
        if (m22314v() != null) {
            animator.setInterpolator(m22314v());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* renamed from: h */
    public void mo22304h() {
        for (int size = this.f20742D.size() - 1; size >= 0; size--) {
            this.f20742D.get(size).cancel();
        }
        ArrayList<f> arrayList = this.f20746H;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f20746H.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f) arrayList2.get(i10)).mo22217c(this);
        }
    }

    /* renamed from: i */
    public abstract void mo22201i(C5544s c5544s);

    /* renamed from: k */
    public final void m22305k(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f20760p;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f20761q;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f20762r;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f20762r.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C5544s c5544s = new C5544s(view);
                    if (z10) {
                        mo22202m(c5544s);
                    } else {
                        mo22201i(c5544s);
                    }
                    c5544s.f20799c.add(this);
                    mo22306l(c5544s);
                    m22272f(z10 ? this.f20767w : this.f20768x, view, c5544s);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f20764t;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f20765u;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f20766v;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f20766v.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                m22305k(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public void mo22306l(C5544s c5544s) {
    }

    /* renamed from: m */
    public abstract void mo22202m(C5544s c5544s);

    /* renamed from: n */
    public void m22307n(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C4771a<String, String> c4771a;
        m22308o(z10);
        if ((this.f20756l.size() > 0 || this.f20757m.size() > 0) && (((arrayList = this.f20758n) == null || arrayList.isEmpty()) && ((arrayList2 = this.f20759o) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f20756l.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f20756l.get(i10).intValue());
                if (findViewById != null) {
                    C5544s c5544s = new C5544s(findViewById);
                    if (z10) {
                        mo22202m(c5544s);
                    } else {
                        mo22201i(c5544s);
                    }
                    c5544s.f20799c.add(this);
                    mo22306l(c5544s);
                    m22272f(z10 ? this.f20767w : this.f20768x, findViewById, c5544s);
                }
            }
            for (int i11 = 0; i11 < this.f20757m.size(); i11++) {
                View view = this.f20757m.get(i11);
                C5544s c5544s2 = new C5544s(view);
                if (z10) {
                    mo22202m(c5544s2);
                } else {
                    mo22201i(c5544s2);
                }
                c5544s2.f20799c.add(this);
                mo22306l(c5544s2);
                m22272f(z10 ? this.f20767w : this.f20768x, view, c5544s2);
            }
        } else {
            m22305k(viewGroup, z10);
        }
        if (z10 || (c4771a = this.f20750L) == null) {
            return;
        }
        int size = c4771a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f20767w.f20803d.remove(this.f20750L.m18761i(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f20767w.f20803d.put(this.f20750L.m18765m(i13), view2);
            }
        }
    }

    /* renamed from: o */
    public void m22308o(boolean z10) {
        C5545t c5545t;
        if (z10) {
            this.f20767w.f20800a.clear();
            this.f20767w.f20801b.clear();
            c5545t = this.f20767w;
        } else {
            this.f20768x.f20800a.clear();
            this.f20768x.f20801b.clear();
            c5545t = this.f20768x;
        }
        c5545t.f20802c.m18731c();
    }

    @Override // 
    /* renamed from: p */
    public AbstractC5537m clone() {
        try {
            AbstractC5537m abstractC5537m = (AbstractC5537m) super.clone();
            abstractC5537m.f20747I = new ArrayList<>();
            abstractC5537m.f20767w = new C5545t();
            abstractC5537m.f20768x = new C5545t();
            abstractC5537m.f20739A = null;
            abstractC5537m.f20740B = null;
            return abstractC5537m;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: q */
    public Animator mo22203q(ViewGroup viewGroup, C5544s c5544s, C5544s c5544s2) {
        return null;
    }

    /* renamed from: r */
    public void mo22310r(ViewGroup viewGroup, C5545t c5545t, C5545t c5545t2, ArrayList<C5544s> arrayList, ArrayList<C5544s> arrayList2) {
        int i10;
        View view;
        Animator animator;
        C5544s c5544s;
        Animator animator2;
        C5544s c5544s2;
        C4771a<Animator, d> m22270A = m22270A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            C5544s c5544s3 = arrayList.get(i11);
            C5544s c5544s4 = arrayList2.get(i11);
            if (c5544s3 != null && !c5544s3.f20799c.contains(this)) {
                c5544s3 = null;
            }
            if (c5544s4 != null && !c5544s4.f20799c.contains(this)) {
                c5544s4 = null;
            }
            if (c5544s3 != null || c5544s4 != null) {
                if (c5544s3 == null || c5544s4 == null || mo22258J(c5544s3, c5544s4)) {
                    Animator mo22203q = mo22203q(viewGroup, c5544s3, c5544s4);
                    if (mo22203q != null) {
                        if (c5544s4 != null) {
                            View view2 = c5544s4.f20798b;
                            String[] mo22198H = mo22198H();
                            if (mo22198H != null && mo22198H.length > 0) {
                                c5544s2 = new C5544s(view2);
                                C5544s c5544s5 = c5545t2.f20800a.get(view2);
                                if (c5544s5 != null) {
                                    int i12 = 0;
                                    while (i12 < mo22198H.length) {
                                        c5544s2.f20797a.put(mo22198H[i12], c5544s5.f20797a.get(mo22198H[i12]));
                                        i12++;
                                        mo22203q = mo22203q;
                                        size = size;
                                        c5544s5 = c5544s5;
                                    }
                                }
                                Animator animator3 = mo22203q;
                                i10 = size;
                                int size2 = m22270A.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    d dVar = m22270A.get(m22270A.m18761i(i13));
                                    if (dVar.f20776c != null && dVar.f20774a == view2 && dVar.f20775b.equals(m22316x()) && dVar.f20776c.equals(c5544s2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                i10 = size;
                                animator2 = mo22203q;
                                c5544s2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            c5544s = c5544s2;
                        } else {
                            i10 = size;
                            view = c5544s3.f20798b;
                            animator = mo22203q;
                            c5544s = null;
                        }
                        if (animator != null) {
                            m22270A.put(animator, new d(view, m22316x(), this, C5518c0.m22226d(viewGroup), c5544s));
                            this.f20747I.add(animator);
                        }
                        i11++;
                        size = i10;
                    }
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator4 = this.f20747I.get(sparseIntArray.keyAt(i14));
                animator4.setStartDelay((sparseIntArray.valueAt(i14) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* renamed from: s */
    public void m22311s() {
        int i10 = this.f20743E - 1;
        this.f20743E = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.f20746H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f20746H.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).mo22218d(this);
                }
            }
            for (int i12 = 0; i12 < this.f20767w.f20802c.m18740n(); i12++) {
                View m18741o = this.f20767w.f20802c.m18741o(i12);
                if (m18741o != null) {
                    C3308b0.m12022e0(m18741o, false);
                }
            }
            for (int i13 = 0; i13 < this.f20768x.f20802c.m18740n(); i13++) {
                View m18741o2 = this.f20768x.f20802c.m18741o(i13);
                if (m18741o2 != null) {
                    C3308b0.m12022e0(m18741o2, false);
                }
            }
            this.f20745G = true;
        }
    }

    /* renamed from: t */
    public long m22312t() {
        return this.f20754j;
    }

    public String toString() {
        return mo22302f0("");
    }

    /* renamed from: u */
    public e m22313u() {
        return this.f20749K;
    }

    /* renamed from: v */
    public TimeInterpolator m22314v() {
        return this.f20755k;
    }

    /* renamed from: w */
    public C5544s m22315w(View view, boolean z10) {
        C5542q c5542q = this.f20769y;
        if (c5542q != null) {
            return c5542q.m22315w(view, z10);
        }
        ArrayList<C5544s> arrayList = z10 ? this.f20739A : this.f20740B;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            C5544s c5544s = arrayList.get(i11);
            if (c5544s == null) {
                return null;
            }
            if (c5544s.f20798b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 >= 0) {
            return (z10 ? this.f20740B : this.f20739A).get(i10);
        }
        return null;
    }

    /* renamed from: x */
    public String m22316x() {
        return this.f20752h;
    }

    /* renamed from: y */
    public AbstractC5525g m22317y() {
        return this.f20751M;
    }

    /* renamed from: z */
    public AbstractC5541p m22318z() {
        return this.f20748J;
    }
}
