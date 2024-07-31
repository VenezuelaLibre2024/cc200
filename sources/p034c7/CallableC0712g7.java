package p034c7;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzph;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p108h6.C2394s;

/* renamed from: c7.g7 */
/* loaded from: classes.dex */
public final class CallableC0712g7 implements Callable<List<C0856qb>> {

    /* renamed from: a */
    public final /* synthetic */ C0871rc f2993a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f2994b;

    /* renamed from: c */
    public final /* synthetic */ BinderC0823o6 f2995c;

    public CallableC0712g7(BinderC0823o6 binderC0823o6, C0871rc c0871rc, Bundle bundle) {
        this.f2993a = c0871rc;
        this.f2994b = bundle;
        this.f2995c = binderC0823o6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C0856qb> call() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        c0968yb = this.f2995c.f3394a;
        c0968yb.m4097k0();
        c0968yb2 = this.f2995c.f3394a;
        C0871rc c0871rc = this.f2993a;
        Bundle bundle = this.f2994b;
        c0968yb2.zzl().mo3099i();
        if (!zzph.zza() || !c0968yb2.m4078Y().m3291y(c0871rc.f3534h, C0733i0.f3052H0) || c0871rc.f3534h == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    c0968yb2.zzj().m3914B().m3995a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        C0788m m4080a0 = c0968yb2.m4080a0();
                        String str = c0871rc.f3534h;
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        C2394s.m9613f(str);
                        m4080a0.mo3099i();
                        m4080a0.m4002p();
                        try {
                            int delete = m4080a0.m3599w().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            m4080a0.zzj().m3918F().m3998d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            m4080a0.zzj().m3914B().m3997c("Error pruning trigger URIs. appId", C0919v4.m3906q(str), e10);
                        }
                    }
                }
            }
        }
        return c0968yb2.m4080a0().m3553F0(c0871rc.f3534h);
    }
}
