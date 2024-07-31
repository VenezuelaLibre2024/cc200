package p331x1;

import android.view.ViewGroup;

/* renamed from: x1.l */
/* loaded from: classes.dex */
public class C5535l {

    /* renamed from: a */
    public ViewGroup f20733a;

    /* renamed from: b */
    public Runnable f20734b;

    /* renamed from: b */
    public static C5535l m22267b(ViewGroup viewGroup) {
        return (C5535l) viewGroup.getTag(C5531j.f20711c);
    }

    /* renamed from: c */
    public static void m22268c(ViewGroup viewGroup, C5535l c5535l) {
        viewGroup.setTag(C5531j.f20711c, c5535l);
    }

    /* renamed from: a */
    public void m22269a() {
        Runnable runnable;
        if (m22267b(this.f20733a) != this || (runnable = this.f20734b) == null) {
            return;
        }
        runnable.run();
    }
}
