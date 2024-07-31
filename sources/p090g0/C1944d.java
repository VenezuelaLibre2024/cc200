package p090g0;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import gd.C2236j;
import java.io.Serializable;
import td.C4753m;

/* renamed from: g0.d */
/* loaded from: classes.dex */
public final class C1944d {
    /* renamed from: a */
    public static final Bundle m7852a(C2236j<String, ? extends Object>... c2236jArr) {
        C4753m.m18653f(c2236jArr, "pairs");
        Bundle bundle = new Bundle(c2236jArr.length);
        for (C2236j<String, ? extends Object> c2236j : c2236jArr) {
            String m8961a = c2236j.m8961a();
            Object m8962b = c2236j.m8962b();
            if (m8962b == null) {
                bundle.putString(m8961a, null);
            } else if (m8962b instanceof Boolean) {
                bundle.putBoolean(m8961a, ((Boolean) m8962b).booleanValue());
            } else if (m8962b instanceof Byte) {
                bundle.putByte(m8961a, ((Number) m8962b).byteValue());
            } else if (m8962b instanceof Character) {
                bundle.putChar(m8961a, ((Character) m8962b).charValue());
            } else if (m8962b instanceof Double) {
                bundle.putDouble(m8961a, ((Number) m8962b).doubleValue());
            } else if (m8962b instanceof Float) {
                bundle.putFloat(m8961a, ((Number) m8962b).floatValue());
            } else if (m8962b instanceof Integer) {
                bundle.putInt(m8961a, ((Number) m8962b).intValue());
            } else if (m8962b instanceof Long) {
                bundle.putLong(m8961a, ((Number) m8962b).longValue());
            } else if (m8962b instanceof Short) {
                bundle.putShort(m8961a, ((Number) m8962b).shortValue());
            } else if (m8962b instanceof Bundle) {
                bundle.putBundle(m8961a, (Bundle) m8962b);
            } else if (m8962b instanceof CharSequence) {
                bundle.putCharSequence(m8961a, (CharSequence) m8962b);
            } else if (m8962b instanceof Parcelable) {
                bundle.putParcelable(m8961a, (Parcelable) m8962b);
            } else if (m8962b instanceof boolean[]) {
                bundle.putBooleanArray(m8961a, (boolean[]) m8962b);
            } else if (m8962b instanceof byte[]) {
                bundle.putByteArray(m8961a, (byte[]) m8962b);
            } else if (m8962b instanceof char[]) {
                bundle.putCharArray(m8961a, (char[]) m8962b);
            } else if (m8962b instanceof double[]) {
                bundle.putDoubleArray(m8961a, (double[]) m8962b);
            } else if (m8962b instanceof float[]) {
                bundle.putFloatArray(m8961a, (float[]) m8962b);
            } else if (m8962b instanceof int[]) {
                bundle.putIntArray(m8961a, (int[]) m8962b);
            } else if (m8962b instanceof long[]) {
                bundle.putLongArray(m8961a, (long[]) m8962b);
            } else if (m8962b instanceof short[]) {
                bundle.putShortArray(m8961a, (short[]) m8962b);
            } else if (m8962b instanceof Object[]) {
                Class<?> componentType = m8962b.getClass().getComponentType();
                C4753m.m18650c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    C4753m.m18651d(m8962b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(m8961a, (Parcelable[]) m8962b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    C4753m.m18651d(m8962b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(m8961a, (String[]) m8962b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    C4753m.m18651d(m8962b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(m8961a, (CharSequence[]) m8962b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + m8961a + '\"');
                    }
                    bundle.putSerializable(m8961a, (Serializable) m8962b);
                }
            } else {
                if (!(m8962b instanceof Serializable)) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 18 && (m8962b instanceof IBinder)) {
                        C1942b.m7849a(bundle, m8961a, (IBinder) m8962b);
                    } else if (i10 >= 21 && (m8962b instanceof Size)) {
                        C1943c.m7850a(bundle, m8961a, (Size) m8962b);
                    } else {
                        if (i10 < 21 || !(m8962b instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + m8962b.getClass().getCanonicalName() + " for key \"" + m8961a + '\"');
                        }
                        C1943c.m7851b(bundle, m8961a, (SizeF) m8962b);
                    }
                }
                bundle.putSerializable(m8961a, (Serializable) m8962b);
            }
        }
        return bundle;
    }
}
