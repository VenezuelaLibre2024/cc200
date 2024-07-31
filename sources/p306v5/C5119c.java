package p306v5;

import android.os.Bundle;
import p079f6.C1841a;
import p108h6.C2388q;

/* renamed from: v5.c */
/* loaded from: classes.dex */
public final class C5119c implements C1841a.d {

    /* renamed from: i */
    public static final C5119c f19359i = new C5119c(new Bundle(), null);

    /* renamed from: h */
    public final Bundle f19360h;

    public /* synthetic */ C5119c(Bundle bundle, C5125i c5125i) {
        this.f19360h = bundle;
    }

    /* renamed from: a */
    public final Bundle m20795a() {
        return new Bundle(this.f19360h);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5119c) {
            return C2388q.m9591a(this.f19360h, ((C5119c) obj).f19360h);
        }
        return false;
    }

    public final int hashCode() {
        return C2388q.m9593c(this.f19360h);
    }
}
