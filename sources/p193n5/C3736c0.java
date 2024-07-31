package p193n5;

import p222p5.C4041n0;
import p264s3.C4455k3;
import p264s3.C4530z3;

/* renamed from: n5.c0 */
/* loaded from: classes.dex */
public final class C3736c0 {

    /* renamed from: a */
    public final int f13324a;

    /* renamed from: b */
    public final C4455k3[] f13325b;

    /* renamed from: c */
    public final InterfaceC3752s[] f13326c;

    /* renamed from: d */
    public final C4530z3 f13327d;

    /* renamed from: e */
    public final Object f13328e;

    public C3736c0(C4455k3[] c4455k3Arr, InterfaceC3752s[] interfaceC3752sArr, C4530z3 c4530z3, Object obj) {
        this.f13325b = c4455k3Arr;
        this.f13326c = (InterfaceC3752s[]) interfaceC3752sArr.clone();
        this.f13327d = c4530z3;
        this.f13328e = obj;
        this.f13324a = c4455k3Arr.length;
    }

    /* renamed from: a */
    public boolean m14094a(C3736c0 c3736c0) {
        if (c3736c0 == null || c3736c0.f13326c.length != this.f13326c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f13326c.length; i10++) {
            if (!m14095b(c3736c0, i10)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean m14095b(C3736c0 c3736c0, int i10) {
        return c3736c0 != null && C4041n0.m15449c(this.f13325b[i10], c3736c0.f13325b[i10]) && C4041n0.m15449c(this.f13326c[i10], c3736c0.f13326c[i10]);
    }

    /* renamed from: c */
    public boolean m14096c(int i10) {
        return this.f13325b[i10] != null;
    }
}
