package p048d6;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.zzf;

/* renamed from: d6.h */
/* loaded from: classes.dex */
public final class HandlerC1575h extends zzf {

    /* renamed from: a */
    public final /* synthetic */ C1567d f5884a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1575h(C1567d c1567d, Looper looper) {
        super(looper);
        this.f5884a = c1567d;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1567d.m6408e(this.f5884a, message);
    }
}
