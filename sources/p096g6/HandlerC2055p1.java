package p096g6;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import p079f6.AbstractC1848h;
import p108h6.C2394s;

/* renamed from: g6.p1 */
/* loaded from: classes.dex */
public final class HandlerC2055p1 extends zau {

    /* renamed from: a */
    public final /* synthetic */ C2061r1 f8129a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2055p1(C2061r1 c2061r1, Looper looper) {
        super(looper);
        this.f8129a = c2061r1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        C2061r1 c2061r1;
        Status m8152a;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i10);
            return;
        }
        AbstractC1848h abstractC1848h = (AbstractC1848h) message.obj;
        obj = this.f8129a.f8137e;
        synchronized (obj) {
            c2061r1 = this.f8129a.f8134b;
            C2061r1 c2061r12 = (C2061r1) C2394s.m9619l(c2061r1);
            if (abstractC1848h == null) {
                m8152a = new Status(13, "Transform returned null");
            } else if (abstractC1848h instanceof C2028h1) {
                m8152a = ((C2028h1) abstractC1848h).m8152a();
            } else {
                c2061r12.m8258j(abstractC1848h);
            }
            c2061r12.m8259k(m8152a);
        }
    }
}
