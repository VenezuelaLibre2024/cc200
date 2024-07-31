package p188n0;

import android.widget.ListView;

/* renamed from: n0.g */
/* loaded from: classes.dex */
public class C3680g extends AbstractViewOnTouchListenerC3674a {

    /* renamed from: z */
    public final ListView f13121z;

    public C3680g(ListView listView) {
        super(listView);
        this.f13121z = listView;
    }

    @Override // p188n0.AbstractViewOnTouchListenerC3674a
    /* renamed from: a */
    public boolean mo13771a(int i10) {
        return false;
    }

    @Override // p188n0.AbstractViewOnTouchListenerC3674a
    /* renamed from: b */
    public boolean mo13772b(int i10) {
        ListView listView = this.f13121z;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p188n0.AbstractViewOnTouchListenerC3674a
    /* renamed from: j */
    public void mo13778j(int i10, int i11) {
        C3681h.m13836b(this.f13121z, i11);
    }
}
