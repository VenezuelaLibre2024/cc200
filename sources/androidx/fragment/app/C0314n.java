package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import p133j0.C3205d;

/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
public class C0314n {

    /* renamed from: a */
    public final AbstractC0318p<?> f1566a;

    public C0314n(AbstractC0318p<?> abstractC0318p) {
        this.f1566a = abstractC0318p;
    }

    /* renamed from: b */
    public static C0314n m1577b(AbstractC0318p<?> abstractC0318p) {
        return new C0314n((AbstractC0318p) C3205d.m11415k(abstractC0318p, "callbacks == null"));
    }

    /* renamed from: a */
    public void m1578a(Fragment fragment) {
        AbstractC0318p<?> abstractC0318p = this.f1566a;
        abstractC0318p.f1572l.m1707n(abstractC0318p, abstractC0318p, fragment);
    }

    /* renamed from: c */
    public void m1579c() {
        this.f1566a.f1572l.m1741z();
    }

    /* renamed from: d */
    public boolean m1580d(MenuItem menuItem) {
        return this.f1566a.f1572l.m1639C(menuItem);
    }

    /* renamed from: e */
    public void m1581e() {
        this.f1566a.f1572l.m1640D();
    }

    /* renamed from: f */
    public void m1582f() {
        this.f1566a.f1572l.m1644F();
    }

    /* renamed from: g */
    public void m1583g() {
        this.f1566a.f1572l.m1661O();
    }

    /* renamed from: h */
    public void m1584h() {
        this.f1566a.f1572l.m1667S();
    }

    /* renamed from: i */
    public void m1585i() {
        this.f1566a.f1572l.m1668T();
    }

    /* renamed from: j */
    public void m1586j() {
        this.f1566a.f1572l.m1670V();
    }

    /* renamed from: k */
    public boolean m1587k() {
        return this.f1566a.f1572l.m1684c0(true);
    }

    /* renamed from: l */
    public AbstractC0326x m1588l() {
        return this.f1566a.f1572l;
    }

    /* renamed from: m */
    public void m1589m() {
        this.f1566a.f1572l.m1679Z0();
    }

    /* renamed from: n */
    public View m1590n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1566a.f1572l.m1735w0().onCreateView(view, str, context, attributeSet);
    }
}
