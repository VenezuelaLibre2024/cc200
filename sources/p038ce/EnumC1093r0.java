package p038ce;

import gd.C2235i;
import ie.C2705a;
import ie.C2706b;
import p146jd.C3283f;
import p146jd.InterfaceC3281d;
import sd.InterfaceC4584p;

/* renamed from: ce.r0 */
/* loaded from: classes2.dex */
public enum EnumC1093r0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: ce.r0$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4081a;

        static {
            int[] iArr = new int[EnumC1093r0.values().length];
            try {
                iArr[EnumC1093r0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1093r0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1093r0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1093r0.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4081a = iArr;
        }
    }

    /* renamed from: c */
    public final <R, T> void m4568c(InterfaceC4584p<? super R, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p, R r10, InterfaceC3281d<? super T> interfaceC3281d) {
        int i10 = a.f4081a[ordinal()];
        if (i10 == 1) {
            C2705a.m11035d(interfaceC4584p, r10, interfaceC3281d, null, 4, null);
            return;
        }
        if (i10 == 2) {
            C3283f.m11889a(interfaceC4584p, r10, interfaceC3281d);
        } else if (i10 == 3) {
            C2706b.m11036a(interfaceC4584p, r10, interfaceC3281d);
        } else if (i10 != 4) {
            throw new C2235i();
        }
    }

    /* renamed from: f */
    public final boolean m4569f() {
        return this == LAZY;
    }
}
