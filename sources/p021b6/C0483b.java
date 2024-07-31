package p021b6;

import com.google.android.gms.common.util.VisibleForTesting;

/* renamed from: b6.b */
/* loaded from: classes.dex */
public class C0483b {

    /* renamed from: b */
    @VisibleForTesting
    public static int f2277b = 31;

    /* renamed from: a */
    public int f2278a = 1;

    /* renamed from: a */
    public C0483b m2416a(Object obj) {
        this.f2278a = (f2277b * this.f2278a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: b */
    public int m2417b() {
        return this.f2278a;
    }

    /* renamed from: c */
    public final C0483b m2418c(boolean z10) {
        this.f2278a = (f2277b * this.f2278a) + (z10 ? 1 : 0);
        return this;
    }
}
