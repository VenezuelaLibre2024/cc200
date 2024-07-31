package p187n;

import android.os.Build;
import android.view.View;

/* renamed from: n.y0 */
/* loaded from: classes.dex */
public class C3671y0 {

    /* renamed from: n.y0$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m13743a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m13742a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.m13743a(view, charSequence);
        } else {
            ViewOnLongClickListenerC3621b1.m13437h(view, charSequence);
        }
    }
}
