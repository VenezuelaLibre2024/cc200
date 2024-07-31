package p132j;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p132j.C3199b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: j.d */
/* loaded from: classes.dex */
public class C3201d extends C3199b {

    /* renamed from: t */
    public a f11094t;

    /* renamed from: u */
    public boolean f11095u;

    /* renamed from: j.d$a */
    /* loaded from: classes.dex */
    public static class a extends C3199b.d {

        /* renamed from: J */
        public int[][] f11096J;

        public a(a aVar, C3201d c3201d, Resources resources) {
            super(aVar, c3201d, resources);
            if (aVar != null) {
                this.f11096J = aVar.f11096J;
            } else {
                this.f11096J = new int[m11375f()];
            }
        }

        /* renamed from: A */
        public int m11397A(int[] iArr) {
            int[][] iArr2 = this.f11096J;
            int m11377h = m11377h();
            for (int i10 = 0; i10 < m11377h; i10++) {
                if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C3201d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C3201d(this, resources);
        }

        @Override // p132j.C3199b.d
        /* renamed from: o */
        public void mo11384o(int i10, int i11) {
            super.mo11384o(i10, i11);
            int[][] iArr = new int[i11];
            System.arraycopy(this.f11096J, 0, iArr, 0, i10);
            this.f11096J = iArr;
        }

        @Override // p132j.C3199b.d
        /* renamed from: r */
        public void mo11353r() {
            int[][] iArr = this.f11096J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f11096J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f11096J = iArr2;
        }

        /* renamed from: z */
        public int m11398z(int[] iArr, Drawable drawable) {
            int m11370a = m11370a(drawable);
            this.f11096J[m11370a] = iArr;
            return m11370a;
        }
    }

    public C3201d(a aVar) {
        if (aVar != null) {
            mo11333h(aVar);
        }
    }

    public C3201d(a aVar, Resources resources) {
        mo11333h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p132j.C3199b
    /* renamed from: h */
    public void mo11333h(C3199b.d dVar) {
        super.mo11333h(dVar);
        if (dVar instanceof a) {
            this.f11094t = (a) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p132j.C3199b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a mo11332b() {
        return new a(this.f11094t, this, null);
    }

    /* renamed from: k */
    public int[] m11396k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i10 = 0;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i12 = i10 + 1;
                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i10] = attributeNameResource;
                i10 = i12;
            }
        }
        return StateSet.trimStateSet(iArr, i10);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f11095u && super.mutate() == this) {
            this.f11094t.mo11353r();
            this.f11095u = true;
        }
        return this;
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m11397A = this.f11094t.m11397A(iArr);
        if (m11397A < 0) {
            m11397A = this.f11094t.m11397A(StateSet.WILD_CARD);
        }
        return m11363g(m11397A) || onStateChange;
    }
}
