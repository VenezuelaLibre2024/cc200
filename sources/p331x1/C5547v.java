package p331x1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: x1.v */
/* loaded from: classes.dex */
public class C5547v implements InterfaceC5548w {

    /* renamed from: a */
    public final ViewGroupOverlay f20804a;

    public C5547v(ViewGroup viewGroup) {
        this.f20804a = viewGroup.getOverlay();
    }

    @Override // p331x1.InterfaceC5516b0
    /* renamed from: a */
    public void mo22195a(Drawable drawable) {
        this.f20804a.add(drawable);
    }

    @Override // p331x1.InterfaceC5516b0
    /* renamed from: b */
    public void mo22196b(Drawable drawable) {
        this.f20804a.remove(drawable);
    }

    @Override // p331x1.InterfaceC5548w
    /* renamed from: c */
    public void mo22341c(View view) {
        this.f20804a.add(view);
    }

    @Override // p331x1.InterfaceC5548w
    /* renamed from: d */
    public void mo22342d(View view) {
        this.f20804a.remove(view);
    }
}
