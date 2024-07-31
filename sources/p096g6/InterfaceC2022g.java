package p096g6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* renamed from: g6.g */
/* loaded from: classes.dex */
public interface InterfaceC2022g extends IInterface {

    /* renamed from: g6.g$a */
    /* loaded from: classes.dex */
    public static abstract class a extends zab implements InterfaceC2022g {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static InterfaceC2022g asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return queryLocalInterface instanceof InterfaceC2022g ? (InterfaceC2022g) queryLocalInterface : new C2063s0(iBinder);
        }

        @Override // com.google.android.gms.internal.base.zab
        public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) zac.zaa(parcel, Status.CREATOR);
            zac.zab(parcel);
            onResult(status);
            return true;
        }
    }

    void onResult(Status status);
}
