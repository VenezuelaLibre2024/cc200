package p331x1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: x1.a0 */
/* loaded from: classes.dex */
public class C5514a0 implements InterfaceC5516b0 {

    /* renamed from: a */
    public final ViewOverlay f20631a;

    public C5514a0(View view) {
        this.f20631a = view.getOverlay();
    }

    @Override // p331x1.InterfaceC5516b0
    /* renamed from: a */
    public void mo22195a(Drawable drawable) {
        this.f20631a.add(drawable);
    }

    @Override // p331x1.InterfaceC5516b0
    /* renamed from: b */
    public void mo22196b(Drawable drawable) {
        this.f20631a.remove(drawable);
    }
}
