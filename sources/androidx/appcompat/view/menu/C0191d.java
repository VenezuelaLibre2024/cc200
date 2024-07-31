package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0197j;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public class C0191d extends BaseAdapter {

    /* renamed from: h */
    public C0192e f733h;

    /* renamed from: i */
    public int f734i = -1;

    /* renamed from: j */
    public boolean f735j;

    /* renamed from: k */
    public final boolean f736k;

    /* renamed from: l */
    public final LayoutInflater f737l;

    /* renamed from: m */
    public final int f738m;

    public C0191d(C0192e c0192e, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f736k = z10;
        this.f737l = layoutInflater;
        this.f733h = c0192e;
        this.f738m = i10;
        m750a();
    }

    /* renamed from: a */
    public void m750a() {
        C0194g m805v = this.f733h.m805v();
        if (m805v != null) {
            ArrayList<C0194g> m809z = this.f733h.m809z();
            int size = m809z.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (m809z.get(i10) == m805v) {
                    this.f734i = i10;
                    return;
                }
            }
        }
        this.f734i = -1;
    }

    /* renamed from: b */
    public C0192e m751b() {
        return this.f733h;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0194g getItem(int i10) {
        ArrayList<C0194g> m809z = this.f736k ? this.f733h.m809z() : this.f733h.m759E();
        int i11 = this.f734i;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return m809z.get(i10);
    }

    /* renamed from: d */
    public void m753d(boolean z10) {
        this.f735j = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0194g> m809z = this.f736k ? this.f733h.m809z() : this.f733h.m759E();
        int i10 = this.f734i;
        int size = m809z.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f737l.inflate(this.f738m, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f733h.mo760F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        InterfaceC0197j.a aVar = (InterfaceC0197j.a) view;
        if (this.f735j) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo693d(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m750a();
        super.notifyDataSetChanged();
    }
}
