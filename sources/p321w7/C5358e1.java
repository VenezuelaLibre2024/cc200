package p321w7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p377firebaseauthapi.zzafm;
import com.google.firebase.auth.FirebaseAuth;
import p337x7.InterfaceC5720t1;
import p337x7.InterfaceC5730x;

/* renamed from: w7.e1 */
/* loaded from: classes.dex */
public final class C5358e1 implements InterfaceC5730x, InterfaceC5720t1 {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f20181a;

    public C5358e1(FirebaseAuth firebaseAuth) {
        this.f20181a = firebaseAuth;
    }

    @Override // p337x7.InterfaceC5720t1
    /* renamed from: a */
    public final void mo5269a(zzafm zzafmVar, AbstractC5341a0 abstractC5341a0) {
        this.f20181a.m5239j0(abstractC5341a0, zzafmVar, true, true);
    }

    @Override // p337x7.InterfaceC5730x
    public final void zza(Status status) {
        int m4987J = status.m4987J();
        if (m4987J == 17011 || m4987J == 17021 || m4987J == 17005) {
            this.f20181a.m5200D();
        }
    }
}
