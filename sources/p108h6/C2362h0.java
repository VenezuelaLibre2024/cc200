package p108h6;

import android.content.Intent;
import p096g6.InterfaceC2030i;

/* renamed from: h6.h0 */
/* loaded from: classes.dex */
public final class C2362h0 extends AbstractDialogInterfaceOnClickListenerC2365i0 {

    /* renamed from: h */
    public final /* synthetic */ Intent f9637h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2030i f9638i;

    public C2362h0(Intent intent, InterfaceC2030i interfaceC2030i, int i10) {
        this.f9637h = intent;
        this.f9638i = interfaceC2030i;
    }

    @Override // p108h6.AbstractDialogInterfaceOnClickListenerC2365i0
    /* renamed from: a */
    public final void mo9552a() {
        Intent intent = this.f9637h;
        if (intent != null) {
            this.f9638i.startActivityForResult(intent, 2);
        }
    }
}
