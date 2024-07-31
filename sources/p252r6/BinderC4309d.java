package p252r6;

import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import p108h6.C2394s;
import p252r6.InterfaceC4307b;

/* renamed from: r6.d */
/* loaded from: classes.dex */
public final class BinderC4309d<T> extends InterfaceC4307b.a {

    /* renamed from: a */
    public final Object f15635a;

    public BinderC4309d(Object obj) {
        this.f15635a = obj;
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: e */
    public static <T> T m16571e(InterfaceC4307b interfaceC4307b) {
        if (interfaceC4307b instanceof BinderC4309d) {
            return (T) ((BinderC4309d) interfaceC4307b).f15635a;
        }
        IBinder asBinder = interfaceC4307b.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        C2394s.m9619l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }

    /* renamed from: g */
    public static <T> InterfaceC4307b m16572g(T t10) {
        return new BinderC4309d(t10);
    }
}
