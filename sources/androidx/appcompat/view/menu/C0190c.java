package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC0196i;
import androidx.appcompat.view.menu.InterfaceC0197j;
import java.util.ArrayList;
import p089g.C1937g;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public class C0190c implements InterfaceC0196i, AdapterView.OnItemClickListener {

    /* renamed from: h */
    public Context f722h;

    /* renamed from: i */
    public LayoutInflater f723i;

    /* renamed from: j */
    public C0192e f724j;

    /* renamed from: k */
    public ExpandedMenuView f725k;

    /* renamed from: l */
    public int f726l;

    /* renamed from: m */
    public int f727m;

    /* renamed from: n */
    public int f728n;

    /* renamed from: o */
    public InterfaceC0196i.a f729o;

    /* renamed from: p */
    public a f730p;

    /* renamed from: androidx.appcompat.view.menu.c$a */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: h */
        public int f731h = -1;

        public a() {
            m748a();
        }

        /* renamed from: a */
        public void m748a() {
            C0194g m805v = C0190c.this.f724j.m805v();
            if (m805v != null) {
                ArrayList<C0194g> m809z = C0190c.this.f724j.m809z();
                int size = m809z.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (m809z.get(i10) == m805v) {
                        this.f731h = i10;
                        return;
                    }
                }
            }
            this.f731h = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public C0194g getItem(int i10) {
            ArrayList<C0194g> m809z = C0190c.this.f724j.m809z();
            int i11 = i10 + C0190c.this.f726l;
            int i12 = this.f731h;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return m809z.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0190c.this.f724j.m809z().size() - C0190c.this.f726l;
            return this.f731h < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0190c c0190c = C0190c.this;
                view = c0190c.f723i.inflate(c0190c.f728n, viewGroup, false);
            }
            ((InterfaceC0197j.a) view).mo693d(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m748a();
            super.notifyDataSetChanged();
        }
    }

    public C0190c(int i10, int i11) {
        this.f728n = i10;
        this.f727m = i11;
    }

    public C0190c(Context context, int i10) {
        this(i10, 0);
        this.f722h = context;
        this.f723i = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m746a() {
        if (this.f730p == null) {
            this.f730p = new a();
        }
        return this.f730p;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: b */
    public void mo709b(C0192e c0192e, boolean z10) {
        InterfaceC0196i.a aVar = this.f729o;
        if (aVar != null) {
            aVar.mo813b(c0192e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: c */
    public void mo710c(boolean z10) {
        a aVar = this.f730p;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: d */
    public boolean mo730d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: e */
    public boolean mo711e(C0192e c0192e, C0194g c0194g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: f */
    public boolean mo712f(C0192e c0192e, C0194g c0194g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: g */
    public void mo713g(InterfaceC0196i.a aVar) {
        this.f729o = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo714h(android.content.Context r3, androidx.appcompat.view.menu.C0192e r4) {
        /*
            r2 = this;
            int r0 = r2.f727m
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f727m
            r0.<init>(r3, r1)
            r2.f722h = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f723i = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f722h
            if (r0 == 0) goto L23
            r2.f722h = r3
            android.view.LayoutInflater r0 = r2.f723i
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f724j = r4
            androidx.appcompat.view.menu.c$a r3 = r2.f730p
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0190c.mo714h(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: i */
    public boolean mo715i(SubMenuC0199l subMenuC0199l) {
        if (!subMenuC0199l.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0193f(subMenuC0199l).m815d(null);
        InterfaceC0196i.a aVar = this.f729o;
        if (aVar == null) {
            return true;
        }
        aVar.mo814c(subMenuC0199l);
        return true;
    }

    /* renamed from: j */
    public InterfaceC0197j m747j(ViewGroup viewGroup) {
        if (this.f725k == null) {
            this.f725k = (ExpandedMenuView) this.f723i.inflate(C1937g.f7472g, viewGroup, false);
            if (this.f730p == null) {
                this.f730p = new a();
            }
            this.f725k.setAdapter((ListAdapter) this.f730p);
            this.f725k.setOnItemClickListener(this);
        }
        return this.f725k;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f724j.m767M(this.f730p.getItem(i10), this, 0);
    }
}
