package p236q5;

import android.view.Surface;
import p137j4.C3234m;
import p137j4.C3235n;

/* renamed from: q5.g */
/* loaded from: classes.dex */
public class C4174g extends C3234m {

    /* renamed from: j */
    public final int f15021j;

    /* renamed from: k */
    public final boolean f15022k;

    public C4174g(Throwable th, C3235n c3235n, Surface surface) {
        super(th, c3235n);
        this.f15021j = System.identityHashCode(surface);
        this.f15022k = surface == null || surface.isValid();
    }
}
