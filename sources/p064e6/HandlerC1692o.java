package p064e6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

@SuppressLint({"HandlerLeak"})
/* renamed from: e6.o */
/* loaded from: classes.dex */
public final class HandlerC1692o extends zau {

    /* renamed from: a */
    public final Context f6288a;

    /* renamed from: b */
    public final /* synthetic */ C1673e f6289b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1692o(C1673e c1673e, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f6289b = c1673e;
        this.f6288a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int mo6697g = this.f6289b.mo6697g(this.f6288a);
        if (this.f6289b.mo6699j(mo6697g)) {
            this.f6289b.m6703o(this.f6288a, mo6697g);
        }
    }
}
