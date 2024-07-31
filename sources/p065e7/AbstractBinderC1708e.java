package p065e7;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* renamed from: e7.e */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1708e extends zab implements InterfaceC1709f {
    public AbstractBinderC1708e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                zac.zab(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
            case 6:
                zac.zab(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
            default:
                return false;
            case 7:
                zac.zab(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                C1715l c1715l = (C1715l) zac.zaa(parcel, C1715l.CREATOR);
                zac.zab(parcel);
                mo6756w(c1715l);
                parcel2.writeNoException();
                return true;
            case 9:
                zac.zab(parcel);
                parcel2.writeNoException();
                return true;
        }
    }
}
