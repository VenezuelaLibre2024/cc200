package p244qe;

import android.content.Context;
import android.graphics.Rect;
import com.journeyapps.barcodescanner.BarcodeView;
import p113hb.C2474s;
import td.C4747g;
import td.C4753m;

/* renamed from: qe.a */
/* loaded from: classes2.dex */
public final class C4249a extends BarcodeView {

    /* renamed from: P */
    public static final a f15365P = new a(null);

    /* renamed from: O */
    public int f15366O;

    /* renamed from: qe.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C4249a(Context context) {
        super(context);
        this.f15366O = -1;
    }

    /* renamed from: O */
    public final void m16302O(int i10, int i11, int i12) {
        this.f15366O = i12;
        setFramingRectSize(new C2474s(i10, i11));
    }

    @Override // com.journeyapps.barcodescanner.C1392a
    /* renamed from: k */
    public Rect mo5906k(Rect rect, Rect rect2) {
        C4753m.m18653f(rect, "container");
        C4753m.m18653f(rect2, "surface");
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        Rect mo5906k = super.mo5906k(rect, rect2);
        if (this.f15366O != -1) {
            Rect rect4 = new Rect(mo5906k);
            int i10 = rect4.bottom;
            int i11 = this.f15366O;
            rect4.bottom = i10 - i11;
            rect4.top -= i11;
            if (rect4.intersect(rect3)) {
                return rect4;
            }
        }
        C4753m.m18652e(mo5906k, "scanAreaRect");
        return mo5906k;
    }
}
