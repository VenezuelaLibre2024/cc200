package p188n0;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* renamed from: n0.h */
/* loaded from: classes.dex */
public final class C3681h {

    /* renamed from: n0.h$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static boolean m13837a(ListView listView, int i10) {
            return listView.canScrollList(i10);
        }

        /* renamed from: b */
        public static void m13838b(ListView listView, int i10) {
            listView.scrollListBy(i10);
        }
    }

    /* renamed from: a */
    public static boolean m13835a(ListView listView, int i10) {
        if (Build.VERSION.SDK_INT >= 19) {
            return a.m13837a(listView, i10);
        }
        int childCount = listView.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i10 > 0) {
            return firstVisiblePosition + childCount < listView.getCount() || listView.getChildAt(childCount + (-1)).getBottom() > listView.getHeight() - listView.getListPaddingBottom();
        }
        return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < listView.getListPaddingTop();
    }

    /* renamed from: b */
    public static void m13836b(ListView listView, int i10) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            a.m13838b(listView, i10);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null) {
            return;
        }
        listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i10);
    }
}
