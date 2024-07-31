package p125i6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2394s;
import p207o6.C3934c;

/* renamed from: i6.e */
/* loaded from: classes.dex */
public final class C2605e {
    /* renamed from: a */
    public static <T extends InterfaceC2604d> T m10491a(byte[] bArr, Parcelable.Creator<T> creator) {
        C2394s.m9619l(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    /* renamed from: b */
    public static <T extends InterfaceC2604d> T m10492b(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) m10491a(byteArrayExtra, creator);
    }

    /* renamed from: c */
    public static <T extends InterfaceC2604d> T m10493c(String str, Parcelable.Creator<T> creator) {
        return (T) m10491a(C3934c.m14927a(str), creator);
    }

    /* renamed from: d */
    public static <T extends InterfaceC2604d> byte[] m10494d(T t10) {
        Parcel obtain = Parcel.obtain();
        t10.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: e */
    public static <T extends InterfaceC2604d> void m10495e(T t10, Intent intent, String str) {
        intent.putExtra(str, m10494d(t10));
    }

    /* renamed from: f */
    public static <T extends InterfaceC2604d> String m10496f(T t10) {
        return C3934c.m14930d(m10494d(t10));
    }
}
