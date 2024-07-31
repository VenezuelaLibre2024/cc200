package p367z6;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzap;

/* renamed from: z6.j0 */
/* loaded from: classes.dex */
public final class C6015j0 implements InterfaceC6003d0 {

    /* renamed from: b */
    public final zzap f22419b;

    /* renamed from: c */
    public final /* synthetic */ C6001c0 f22420c;

    public C6015j0(C6001c0 c6001c0) {
        zzap zzapVar;
        this.f22420c = c6001c0;
        zzapVar = c6001c0.f22390h;
        this.f22419b = zzapVar;
    }

    @Override // p367z6.InterfaceC6003d0
    public final C5997a0 getTile(int i10, int i11, int i12) {
        try {
            return this.f22419b.zzb(i10, i11, i12);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
