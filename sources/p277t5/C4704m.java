package p277t5;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.zze;

/* renamed from: t5.m */
/* loaded from: classes.dex */
public final class C4704m implements InterfaceC4705n {

    /* renamed from: a */
    public final /* synthetic */ String f17560a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f17561b;

    public C4704m(String str, Bundle bundle) {
        this.f17560a = str;
        this.f17561b = bundle;
    }

    @Override // p277t5.InterfaceC4705n
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo18505a(IBinder iBinder) {
        Bundle zzd = zze.zzb(iBinder).zzd(this.f17560a, this.f17561b);
        C4706o.m18511f(zzd);
        String string = zzd.getString("Error");
        if (zzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new C4695d(string);
    }
}
