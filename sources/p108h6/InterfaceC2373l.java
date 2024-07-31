package p108h6;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: h6.l */
/* loaded from: classes.dex */
public interface InterfaceC2373l extends IInterface {

    /* renamed from: h6.l$a */
    /* loaded from: classes.dex */
    public static abstract class a extends zzb implements InterfaceC2373l {
        /* renamed from: c */
        public static InterfaceC2373l m9580c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof InterfaceC2373l ? (InterfaceC2373l) queryLocalInterface : new C2411x1(iBinder);
        }
    }

    void cancel();
}
