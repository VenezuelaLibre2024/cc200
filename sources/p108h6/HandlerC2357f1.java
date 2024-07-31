package p108h6;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzi;
import p064e6.C1667b;
import p108h6.AbstractC2346c;

/* renamed from: h6.f1 */
/* loaded from: classes.dex */
public final class HandlerC2357f1 extends zzi {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2346c f9614a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2357f1(AbstractC2346c abstractC2346c, Looper looper) {
        super(looper);
        this.f9614a = abstractC2346c;
    }

    /* renamed from: a */
    public static final void m9550a(Message message) {
        AbstractC2360g1 abstractC2360g1 = (AbstractC2360g1) message.obj;
        abstractC2360g1.mo9554b();
        abstractC2360g1.m9557e();
    }

    /* renamed from: b */
    public static final boolean m9551b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC2346c.a aVar;
        AbstractC2346c.a aVar2;
        C1667b c1667b;
        C1667b c1667b2;
        boolean z10;
        if (this.f9614a.zzd.get() != message.arg1) {
            if (m9551b(message)) {
                m9550a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f9614a.enableLocalFallback()) || message.what == 5)) && !this.f9614a.isConnecting()) {
            m9550a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f9614a.zzB = new C1667b(message.arg2);
            if (AbstractC2346c.zzo(this.f9614a)) {
                AbstractC2346c abstractC2346c = this.f9614a;
                z10 = abstractC2346c.zzC;
                if (!z10) {
                    abstractC2346c.zzp(3, null);
                    return;
                }
            }
            AbstractC2346c abstractC2346c2 = this.f9614a;
            c1667b2 = abstractC2346c2.zzB;
            C1667b c1667b3 = c1667b2 != null ? abstractC2346c2.zzB : new C1667b(8);
            this.f9614a.zzc.mo8233b(c1667b3);
            this.f9614a.onConnectionFailed(c1667b3);
            return;
        }
        if (i11 == 5) {
            AbstractC2346c abstractC2346c3 = this.f9614a;
            c1667b = abstractC2346c3.zzB;
            C1667b c1667b4 = c1667b != null ? abstractC2346c3.zzB : new C1667b(8);
            this.f9614a.zzc.mo8233b(c1667b4);
            this.f9614a.onConnectionFailed(c1667b4);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            C1667b c1667b5 = new C1667b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f9614a.zzc.mo8233b(c1667b5);
            this.f9614a.onConnectionFailed(c1667b5);
            return;
        }
        if (i11 == 6) {
            this.f9614a.zzp(5, null);
            AbstractC2346c abstractC2346c4 = this.f9614a;
            aVar = abstractC2346c4.zzw;
            if (aVar != null) {
                aVar2 = abstractC2346c4.zzw;
                aVar2.mo3822c(message.arg2);
            }
            this.f9614a.onConnectionSuspended(message.arg2);
            AbstractC2346c.zzn(this.f9614a, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f9614a.isConnected()) {
            m9550a(message);
            return;
        }
        if (m9551b(message)) {
            ((AbstractC2360g1) message.obj).m9555c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
