package p187n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: n.v0 */
/* loaded from: classes.dex */
public class C3665v0 extends C3651o0 {

    /* renamed from: b */
    public final WeakReference<Context> f13044b;

    public C3665v0(Context context, Resources resources) {
        super(resources);
        this.f13044b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable m13649a = m13649a(i10);
        Context context = this.f13044b.get();
        if (m13649a != null && context != null) {
            C3649n0.m13623h().m13644x(context, i10, m13649a);
        }
        return m13649a;
    }
}
