package de;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p038ce.InterfaceC1069l0;
import p146jd.AbstractC3278a;
import p146jd.InterfaceC3284g;

/* renamed from: de.b */
/* loaded from: classes2.dex */
public final class C1618b extends AbstractC3278a implements InterfaceC1069l0 {
    private volatile Object _preHandler;

    public C1618b() {
        super(InterfaceC1069l0.f4048b);
        this._preHandler = this;
    }

    /* renamed from: H0 */
    public final Method m6473H0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z10 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z10 = true;
                }
            }
            if (z10) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // p038ce.InterfaceC1069l0
    /* renamed from: n */
    public void mo4471n(InterfaceC3284g interfaceC3284g, Throwable th) {
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            Method m6473H0 = m6473H0();
            Object invoke = m6473H0 != null ? m6473H0.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
