package p331x1;

import android.view.View;
import android.view.WindowId;

/* renamed from: x1.l0 */
/* loaded from: classes.dex */
public class C5536l0 implements InterfaceC5538m0 {

    /* renamed from: a */
    public final WindowId f20735a;

    public C5536l0(View view) {
        this.f20735a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5536l0) && ((C5536l0) obj).f20735a.equals(this.f20735a);
    }

    public int hashCode() {
        return this.f20735a.hashCode();
    }
}
