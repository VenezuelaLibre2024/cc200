package p173ld;

import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;

/* renamed from: ld.c */
/* loaded from: classes2.dex */
public final class C3469c implements InterfaceC3281d<Object> {

    /* renamed from: h */
    public static final C3469c f12178h = new C3469c();

    @Override // p146jd.InterfaceC3281d
    public InterfaceC3284g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // p146jd.InterfaceC3281d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
