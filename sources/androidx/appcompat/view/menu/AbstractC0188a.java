package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0196i;
import androidx.appcompat.view.menu.InterfaceC0197j;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public abstract class AbstractC0188a implements InterfaceC0196i {

    /* renamed from: h */
    public Context f675h;

    /* renamed from: i */
    public Context f676i;

    /* renamed from: j */
    public C0192e f677j;

    /* renamed from: k */
    public LayoutInflater f678k;

    /* renamed from: l */
    public LayoutInflater f679l;

    /* renamed from: m */
    public InterfaceC0196i.a f680m;

    /* renamed from: n */
    public int f681n;

    /* renamed from: o */
    public int f682o;

    /* renamed from: p */
    public InterfaceC0197j f683p;

    /* renamed from: q */
    public int f684q;

    public AbstractC0188a(Context context, int i10, int i11) {
        this.f675h = context;
        this.f678k = LayoutInflater.from(context);
        this.f681n = i10;
        this.f682o = i11;
    }

    /* renamed from: a */
    public void m708a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f683p).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: b */
    public void mo709b(C0192e c0192e, boolean z10) {
        InterfaceC0196i.a aVar = this.f680m;
        if (aVar != null) {
            aVar.mo813b(c0192e, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: c */
    public void mo710c(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f683p;
        if (viewGroup == null) {
            return;
        }
        C0192e c0192e = this.f677j;
        int i10 = 0;
        if (c0192e != null) {
            c0192e.m801r();
            ArrayList<C0194g> m759E = this.f677j.m759E();
            int size = m759E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                C0194g c0194g = m759E.get(i12);
                if (mo723q(i11, c0194g)) {
                    View childAt = viewGroup.getChildAt(i11);
                    C0194g itemData = childAt instanceof InterfaceC0197j.a ? ((InterfaceC0197j.a) childAt).getItemData() : null;
                    View mo720n = mo720n(c0194g, childAt, viewGroup);
                    if (c0194g != itemData) {
                        mo720n.setPressed(false);
                        mo720n.jumpDrawablesToCurrentState();
                    }
                    if (mo720n != childAt) {
                        m708a(mo720n, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!mo718l(viewGroup, i10)) {
                i10++;
            }
        }
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
        this.f680m = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: h */
    public void mo714h(Context context, C0192e c0192e) {
        this.f676i = context;
        this.f679l = LayoutInflater.from(context);
        this.f677j = c0192e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: i */
    public boolean mo715i(SubMenuC0199l subMenuC0199l) {
        InterfaceC0196i.a aVar = this.f680m;
        SubMenuC0199l subMenuC0199l2 = subMenuC0199l;
        if (aVar == null) {
            return false;
        }
        if (subMenuC0199l == null) {
            subMenuC0199l2 = this.f677j;
        }
        return aVar.mo814c(subMenuC0199l2);
    }

    /* renamed from: j */
    public abstract void mo716j(C0194g c0194g, InterfaceC0197j.a aVar);

    /* renamed from: k */
    public InterfaceC0197j.a m717k(ViewGroup viewGroup) {
        return (InterfaceC0197j.a) this.f678k.inflate(this.f682o, viewGroup, false);
    }

    /* renamed from: l */
    public boolean mo718l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    /* renamed from: m */
    public InterfaceC0196i.a m719m() {
        return this.f680m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public View mo720n(C0194g c0194g, View view, ViewGroup viewGroup) {
        InterfaceC0197j.a m717k = view instanceof InterfaceC0197j.a ? (InterfaceC0197j.a) view : m717k(viewGroup);
        mo716j(c0194g, m717k);
        return (View) m717k;
    }

    /* renamed from: o */
    public InterfaceC0197j mo721o(ViewGroup viewGroup) {
        if (this.f683p == null) {
            InterfaceC0197j interfaceC0197j = (InterfaceC0197j) this.f678k.inflate(this.f681n, viewGroup, false);
            this.f683p = interfaceC0197j;
            interfaceC0197j.mo701b(this.f677j);
            mo710c(true);
        }
        return this.f683p;
    }

    /* renamed from: p */
    public void m722p(int i10) {
        this.f684q = i10;
    }

    /* renamed from: q */
    public abstract boolean mo723q(int i10, C0194g c0194g);
}
