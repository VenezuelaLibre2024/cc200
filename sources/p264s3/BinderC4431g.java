package p264s3;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p126i7.AbstractC2651u;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: s3.g */
/* loaded from: classes.dex */
public final class BinderC4431g extends Binder {

    /* renamed from: a */
    public static final int f16281a;

    static {
        f16281a = C4041n0.f14513a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    /* renamed from: a */
    public static AbstractC2651u<Bundle> m17223a(IBinder iBinder) {
        int readInt;
        AbstractC2651u.a m10766n = AbstractC2651u.m10766n();
        int i10 = 0;
        int i11 = 1;
        while (i11 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i10);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            m10766n.mo10749a((Bundle) C4014a.m15199e(obtain2.readBundle()));
                            i10++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i11 = readInt;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return m10766n.m10784k();
    }
}
