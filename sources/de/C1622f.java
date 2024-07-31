package de;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import gd.C2237k;
import gd.C2238l;
import td.C4753m;

/* renamed from: de.f */
/* loaded from: classes2.dex */
public final class C1622f {

    /* renamed from: a */
    public static final AbstractC1621e f5961a;
    private static volatile Choreographer choreographer;

    static {
        Object m8966b;
        byte b10 = 0;
        byte b11 = 0;
        try {
            C2237k.a aVar = C2237k.f8865i;
            m8966b = C2237k.m8966b(new C1620d(m6478a(Looper.getMainLooper(), true), b11 == true ? 1 : 0, 2, b10 == true ? 1 : 0));
        } catch (Throwable th) {
            C2237k.a aVar2 = C2237k.f8865i;
            m8966b = C2237k.m8966b(C2238l.m8974a(th));
        }
        f5961a = (AbstractC1621e) (C2237k.m8970f(m8966b) ? null : m8966b);
    }

    /* renamed from: a */
    public static final Handler m6478a(Looper looper, boolean z10) {
        int i10;
        Object newInstance;
        if (!z10 || (i10 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i10 >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            C4753m.m18651d(newInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                newInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) newInstance;
    }
}
