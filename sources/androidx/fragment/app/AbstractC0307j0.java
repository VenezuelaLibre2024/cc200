package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p090g0.C1945e;
import p148k0.C3308b0;
import p148k0.ViewTreeObserverOnPreDrawListenerC3342y;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC0307j0 {

    /* renamed from: androidx.fragment.app.j0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ int f1513h;

        /* renamed from: i */
        public final /* synthetic */ ArrayList f1514i;

        /* renamed from: j */
        public final /* synthetic */ ArrayList f1515j;

        /* renamed from: k */
        public final /* synthetic */ ArrayList f1516k;

        /* renamed from: l */
        public final /* synthetic */ ArrayList f1517l;

        public a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f1513h = i10;
            this.f1514i = arrayList;
            this.f1515j = arrayList2;
            this.f1516k = arrayList3;
            this.f1517l = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f1513h; i10++) {
                C3308b0.m12032j0((View) this.f1514i.get(i10), (String) this.f1515j.get(i10));
                C3308b0.m12032j0((View) this.f1516k.get(i10), (String) this.f1517l.get(i10));
            }
        }
    }

    /* renamed from: d */
    public static void m1525d(List<View> list, View view) {
        int size = list.size();
        if (m1526g(list, view, size)) {
            return;
        }
        if (C3308b0.m11987A(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!m1526g(list, childAt, size) && C3308b0.m11987A(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static boolean m1526g(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m1527i(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo1496a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo1497b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo1498c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo1499e(Object obj);

    /* renamed from: f */
    public abstract Object mo1500f(Object obj);

    /* renamed from: h */
    public void m1528h(View view, Rect rect) {
        if (C3308b0.m11992F(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: j */
    public abstract Object mo1501j(Object obj, Object obj2, Object obj3);

    /* renamed from: k */
    public abstract Object mo1502k(Object obj, Object obj2, Object obj3);

    /* renamed from: l */
    public ArrayList<String> m1529l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(C3308b0.m11987A(view));
            C3308b0.m12032j0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: m */
    public abstract void mo1503m(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: n */
    public abstract void mo1504n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: o */
    public abstract void mo1505o(Object obj, Rect rect);

    /* renamed from: p */
    public abstract void mo1506p(Object obj, View view);

    /* renamed from: q */
    public void mo1507q(Fragment fragment, Object obj, C1945e c1945e, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: r */
    public void m1530r(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String m11987A = C3308b0.m11987A(view2);
            arrayList4.add(m11987A);
            if (m11987A != null) {
                C3308b0.m12032j0(view2, null);
                String str = map.get(m11987A);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i11))) {
                        C3308b0.m12032j0(arrayList2.get(i11), m11987A);
                        break;
                    }
                    i11++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC3342y.m12395a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: s */
    public abstract void mo1508s(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: t */
    public abstract void mo1509t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: u */
    public abstract Object mo1510u(Object obj);
}
