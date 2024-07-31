package p130ib;

import android.graphics.Rect;
import java.util.List;
import p113hb.C2474s;

/* renamed from: ib.m */
/* loaded from: classes.dex */
public class C2698m {

    /* renamed from: a */
    public C2474s f10567a;

    /* renamed from: b */
    public int f10568b;

    /* renamed from: c */
    public boolean f10569c = false;

    /* renamed from: d */
    public AbstractC2702q f10570d = new C2699n();

    public C2698m(int i10, C2474s c2474s) {
        this.f10568b = i10;
        this.f10567a = c2474s;
    }

    /* renamed from: a */
    public C2474s m11009a(List<C2474s> list, boolean z10) {
        return this.f10570d.m11016b(list, m11010b(z10));
    }

    /* renamed from: b */
    public C2474s m11010b(boolean z10) {
        C2474s c2474s = this.f10567a;
        if (c2474s == null) {
            return null;
        }
        return z10 ? c2474s.m9864c() : c2474s;
    }

    /* renamed from: c */
    public int m11011c() {
        return this.f10568b;
    }

    /* renamed from: d */
    public Rect m11012d(C2474s c2474s) {
        return this.f10570d.mo11008d(c2474s, this.f10567a);
    }

    /* renamed from: e */
    public void m11013e(AbstractC2702q abstractC2702q) {
        this.f10570d = abstractC2702q;
    }
}
