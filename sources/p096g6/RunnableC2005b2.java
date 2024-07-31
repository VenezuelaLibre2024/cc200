package p096g6;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import p064e6.C1667b;
import p108h6.C2394s;

/* renamed from: g6.b2 */
/* loaded from: classes.dex */
public final class RunnableC2005b2 implements Runnable {

    /* renamed from: h */
    public final C2085z1 f7997h;

    /* renamed from: i */
    public final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC2009c2 f7998i;

    public RunnableC2005b2(AbstractDialogInterfaceOnCancelListenerC2009c2 abstractDialogInterfaceOnCancelListenerC2009c2, C2085z1 c2085z1) {
        this.f7998i = abstractDialogInterfaceOnCancelListenerC2009c2;
        this.f7997h = c2085z1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7998i.f8007h) {
            C1667b m8286b = this.f7997h.m8286b();
            if (m8286b.m6680L()) {
                AbstractDialogInterfaceOnCancelListenerC2009c2 abstractDialogInterfaceOnCancelListenerC2009c2 = this.f7998i;
                abstractDialogInterfaceOnCancelListenerC2009c2.mLifecycleFragment.startActivityForResult(GoogleApiActivity.m4983a(abstractDialogInterfaceOnCancelListenerC2009c2.getActivity(), (PendingIntent) C2394s.m9619l(m8286b.m6679K()), this.f7997h.m8285a(), false), 1);
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC2009c2 abstractDialogInterfaceOnCancelListenerC2009c22 = this.f7998i;
            if (abstractDialogInterfaceOnCancelListenerC2009c22.f8010k.mo6694b(abstractDialogInterfaceOnCancelListenerC2009c22.getActivity(), m8286b.m6677I(), null) != null) {
                AbstractDialogInterfaceOnCancelListenerC2009c2 abstractDialogInterfaceOnCancelListenerC2009c23 = this.f7998i;
                abstractDialogInterfaceOnCancelListenerC2009c23.f8010k.m6710v(abstractDialogInterfaceOnCancelListenerC2009c23.getActivity(), this.f7998i.mLifecycleFragment, m8286b.m6677I(), 2, this.f7998i);
            } else {
                if (m8286b.m6677I() != 18) {
                    this.f7998i.m8104a(m8286b, this.f7997h.m8285a());
                    return;
                }
                AbstractDialogInterfaceOnCancelListenerC2009c2 abstractDialogInterfaceOnCancelListenerC2009c24 = this.f7998i;
                Dialog m6705q = abstractDialogInterfaceOnCancelListenerC2009c24.f8010k.m6705q(abstractDialogInterfaceOnCancelListenerC2009c24.getActivity(), this.f7998i);
                AbstractDialogInterfaceOnCancelListenerC2009c2 abstractDialogInterfaceOnCancelListenerC2009c25 = this.f7998i;
                abstractDialogInterfaceOnCancelListenerC2009c25.f8010k.m6706r(abstractDialogInterfaceOnCancelListenerC2009c25.getActivity().getApplicationContext(), new C2001a2(this, m6705q));
            }
        }
    }
}
