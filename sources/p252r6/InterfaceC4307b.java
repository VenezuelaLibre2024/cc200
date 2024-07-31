package p252r6;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: r6.b */
/* loaded from: classes.dex */
public interface InterfaceC4307b extends IInterface {

    /* renamed from: r6.b$a */
    /* loaded from: classes.dex */
    public static abstract class a extends zzb implements InterfaceC4307b {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: c */
        public static InterfaceC4307b m16570c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof InterfaceC4307b ? (InterfaceC4307b) queryLocalInterface : new C4317l(iBinder);
        }
    }
}
