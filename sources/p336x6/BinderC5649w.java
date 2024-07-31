package p336x6;

import android.graphics.Bitmap;
import p252r6.BinderC4309d;
import p252r6.InterfaceC4307b;
import p336x6.C5629c;
import p352y6.AbstractBinderC5819a0;

/* renamed from: x6.w */
/* loaded from: classes.dex */
public final class BinderC5649w extends AbstractBinderC5819a0 {

    /* renamed from: a */
    public final /* synthetic */ C5629c.n f21099a;

    public BinderC5649w(C5629c c5629c, C5629c.n nVar) {
        this.f21099a = nVar;
    }

    @Override // p352y6.InterfaceC5821b0
    /* renamed from: E0 */
    public final void mo22711E0(InterfaceC4307b interfaceC4307b) {
        this.f21099a.onSnapshotReady((Bitmap) BinderC4309d.m16571e(interfaceC4307b));
    }

    @Override // p352y6.InterfaceC5821b0
    /* renamed from: V */
    public final void mo22712V(Bitmap bitmap) {
        this.f21099a.onSnapshotReady(bitmap);
    }
}
