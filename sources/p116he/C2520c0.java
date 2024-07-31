package p116he;

import gd.C2229c;
import p038ce.AbstractC1079n2;
import p038ce.InterfaceC1055i1;
import p038ce.InterfaceC1125z0;
import p146jd.InterfaceC3284g;

/* renamed from: he.c0 */
/* loaded from: classes2.dex */
public final class C2520c0 extends AbstractC1079n2 implements InterfaceC1125z0 {

    /* renamed from: j */
    public final Throwable f9957j;

    /* renamed from: k */
    public final String f9958k;

    public C2520c0(Throwable th, String str) {
        this.f9957j = th;
        this.f9958k = str;
    }

    @Override // p038ce.InterfaceC1125z0
    /* renamed from: G0 */
    public InterfaceC1055i1 mo4501G0(long j10, Runnable runnable, InterfaceC3284g interfaceC3284g) {
        m10056N0();
        throw new C2229c();
    }

    @Override // p038ce.AbstractC1064k0
    /* renamed from: I0 */
    public boolean mo4340I0(InterfaceC3284g interfaceC3284g) {
        m10056N0();
        throw new C2229c();
    }

    @Override // p038ce.AbstractC1079n2
    /* renamed from: K0 */
    public AbstractC1079n2 mo4521K0() {
        return this;
    }

    @Override // p038ce.AbstractC1064k0
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public Void mo4339H0(InterfaceC3284g interfaceC3284g, Runnable runnable) {
        m10056N0();
        throw new C2229c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1 == null) goto L8;
     */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Void m10056N0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f9957j
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f9958k
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f9957j
            r1.<init>(r0, r2)
            throw r1
        L36:
            p116he.C2518b0.m10051d()
            gd.c r0 = new gd.c
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p116he.C2520c0.m10056N0():java.lang.Void");
    }

    @Override // p038ce.AbstractC1079n2, p038ce.AbstractC1064k0
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f9957j != null) {
            str = ", cause=" + this.f9957j;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
