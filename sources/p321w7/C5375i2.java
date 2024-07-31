package p321w7;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import p337x7.InterfaceC5733y;

/* renamed from: w7.i2 */
/* loaded from: classes.dex */
public final class C5375i2 implements InterfaceC5733y {

    /* renamed from: a */
    public final /* synthetic */ AbstractC5341a0 f20206a;

    /* renamed from: b */
    public final /* synthetic */ FirebaseAuth f20207b;

    public C5375i2(FirebaseAuth firebaseAuth, AbstractC5341a0 abstractC5341a0) {
        this.f20206a = abstractC5341a0;
        this.f20207b = firebaseAuth;
    }

    @Override // p337x7.InterfaceC5733y
    public final void zza() {
        AbstractC5341a0 abstractC5341a0;
        AbstractC5341a0 abstractC5341a02;
        abstractC5341a0 = this.f20207b.f4735f;
        if (abstractC5341a0 != null) {
            abstractC5341a02 = this.f20207b.f4735f;
            if (abstractC5341a02.mo21427b().equalsIgnoreCase(this.f20206a.mo21427b())) {
                this.f20207b.m5205G0();
            }
        }
    }

    @Override // p337x7.InterfaceC5730x
    public final void zza(Status status) {
        if (status.m4987J() == 17011 || status.m4987J() == 17021 || status.m4987J() == 17005) {
            this.f20207b.m5200D();
        }
    }
}
