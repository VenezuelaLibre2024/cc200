package p148k0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: k0.u */
/* loaded from: classes.dex */
public class C3338u {

    /* renamed from: a */
    public int f11647a;

    /* renamed from: b */
    public int f11648b;

    public C3338u(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m12389a() {
        return this.f11647a | this.f11648b;
    }

    /* renamed from: b */
    public void m12390b(View view, View view2, int i10) {
        m12391c(view, view2, i10, 0);
    }

    /* renamed from: c */
    public void m12391c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f11648b = i10;
        } else {
            this.f11647a = i10;
        }
    }

    /* renamed from: d */
    public void m12392d(View view) {
        m12393e(view, 0);
    }

    /* renamed from: e */
    public void m12393e(View view, int i10) {
        if (i10 == 1) {
            this.f11648b = 0;
        } else {
            this.f11647a = 0;
        }
    }
}
