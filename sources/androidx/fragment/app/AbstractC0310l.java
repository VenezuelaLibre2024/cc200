package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public abstract class AbstractC0310l {
    @Deprecated
    /* renamed from: b */
    public Fragment m1541b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: c */
    public abstract View mo1350c(int i10);

    /* renamed from: d */
    public abstract boolean mo1351d();
}
