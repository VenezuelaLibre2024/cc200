package p331x1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p148k0.C3308b0;
import p285u.C4771a;

/* renamed from: x1.o */
/* loaded from: classes.dex */
public class C5540o {

    /* renamed from: a */
    public static AbstractC5537m f20779a = new C5515b();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<C4771a<ViewGroup, ArrayList<AbstractC5537m>>>> f20780b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f20781c = new ArrayList<>();

    /* renamed from: x1.o$a */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: h */
        public AbstractC5537m f20782h;

        /* renamed from: i */
        public ViewGroup f20783i;

        /* renamed from: x1.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C6216a extends C5539n {

            /* renamed from: a */
            public final /* synthetic */ C4771a f20784a;

            public C6216a(C4771a c4771a) {
                this.f20784a = c4771a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p331x1.AbstractC5537m.f
            /* renamed from: d */
            public void mo22218d(AbstractC5537m abstractC5537m) {
                ((ArrayList) this.f20784a.get(a.this.f20783i)).remove(abstractC5537m);
                abstractC5537m.mo22287T(this);
            }
        }

        public a(AbstractC5537m abstractC5537m, ViewGroup viewGroup) {
            this.f20782h = abstractC5537m;
            this.f20783i = viewGroup;
        }

        /* renamed from: a */
        public final void m22323a() {
            this.f20783i.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f20783i.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m22323a();
            if (!C5540o.f20781c.remove(this.f20783i)) {
                return true;
            }
            C4771a<ViewGroup, ArrayList<AbstractC5537m>> m22320b = C5540o.m22320b();
            ArrayList<AbstractC5537m> arrayList = m22320b.get(this.f20783i);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                m22320b.put(this.f20783i, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f20782h);
            this.f20782h.mo22295b(new C6216a(m22320b));
            this.f20782h.m22307n(this.f20783i, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC5537m) it.next()).mo22289V(this.f20783i);
                }
            }
            this.f20782h.m22286S(this.f20783i);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m22323a();
            C5540o.f20781c.remove(this.f20783i);
            ArrayList<AbstractC5537m> arrayList = C5540o.m22320b().get(this.f20783i);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC5537m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo22289V(this.f20783i);
                }
            }
            this.f20782h.m22308o(true);
        }
    }

    /* renamed from: a */
    public static void m22319a(ViewGroup viewGroup, AbstractC5537m abstractC5537m) {
        if (f20781c.contains(viewGroup) || !C3308b0.m11993G(viewGroup)) {
            return;
        }
        f20781c.add(viewGroup);
        if (abstractC5537m == null) {
            abstractC5537m = f20779a;
        }
        AbstractC5537m clone = abstractC5537m.clone();
        m22322d(viewGroup, clone);
        C5535l.m22268c(viewGroup, null);
        m22321c(viewGroup, clone);
    }

    /* renamed from: b */
    public static C4771a<ViewGroup, ArrayList<AbstractC5537m>> m22320b() {
        C4771a<ViewGroup, ArrayList<AbstractC5537m>> c4771a;
        WeakReference<C4771a<ViewGroup, ArrayList<AbstractC5537m>>> weakReference = f20780b.get();
        if (weakReference != null && (c4771a = weakReference.get()) != null) {
            return c4771a;
        }
        C4771a<ViewGroup, ArrayList<AbstractC5537m>> c4771a2 = new C4771a<>();
        f20780b.set(new WeakReference<>(c4771a2));
        return c4771a2;
    }

    /* renamed from: c */
    public static void m22321c(ViewGroup viewGroup, AbstractC5537m abstractC5537m) {
        if (abstractC5537m == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC5537m, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* renamed from: d */
    public static void m22322d(ViewGroup viewGroup, AbstractC5537m abstractC5537m) {
        ArrayList<AbstractC5537m> arrayList = m22320b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC5537m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo22285R(viewGroup);
            }
        }
        if (abstractC5537m != null) {
            abstractC5537m.m22307n(viewGroup, true);
        }
        C5535l m22267b = C5535l.m22267b(viewGroup);
        if (m22267b != null) {
            m22267b.m22269a();
        }
    }
}
