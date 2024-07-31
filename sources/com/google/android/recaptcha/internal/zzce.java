package com.google.android.recaptcha.internal;

import gd.C2245s;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import td.C4753m;

/* loaded from: classes.dex */
public abstract class zzce implements InvocationHandler {
    private final Object zza;

    public zzce(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (C4753m.m18648a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (C4753m.m18648a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (C4753m.m18648a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z10 = false;
            if (objArr != null && objArr.length != 0) {
                Object obj3 = objArr[0];
                if ((obj3 != null ? obj3.hashCode() : 0) == obj.hashCode()) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
        if (!zza(obj, method, objArr)) {
            return C2245s.f8873a;
        }
        if ((this.zza == null && C4753m.m18648a(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && C4753m.m18648a(zzgd.zza(obj2.getClass()), zzgd.zza(method.getReturnType())))) {
            Object obj4 = this.zza;
            return obj4 == null ? C2245s.f8873a : obj4;
        }
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
