package p038ce;

import ae.C0109o;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p146jd.AbstractC3278a;
import p146jd.InterfaceC3284g;
import td.C4747g;
import td.C4753m;

@IgnoreJRERequirement
/* renamed from: ce.n0 */
/* loaded from: classes2.dex */
public final class C1077n0 extends AbstractC3278a implements InterfaceC1119x2<String> {

    /* renamed from: j */
    public static final a f4056j = new a(null);

    /* renamed from: i */
    public final long f4057i;

    /* renamed from: ce.n0$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC3284g.c<C1077n0> {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C1077n0(long j10) {
        super(f4056j);
        this.f4057i = j10;
    }

    /* renamed from: H0 */
    public final long m4495H0() {
        return this.f4057i;
    }

    @Override // p038ce.InterfaceC1119x2
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public void mo4494E(InterfaceC3284g interfaceC3284g, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // p038ce.InterfaceC1119x2
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public String mo4498r0(InterfaceC3284g interfaceC3284g) {
        String str;
        C1081o0 c1081o0 = (C1081o0) interfaceC3284g.mo4368d(C1081o0.f4065j);
        if (c1081o0 == null || (str = c1081o0.m4524H0()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int m443J = C0109o.m443J(name, " @", 0, false, 6, null);
        if (m443J < 0) {
            m443J = name.length();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + m443J + 10);
        String substring = name.substring(0, m443J);
        C4753m.m18652e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append(" @");
        sb2.append(str);
        sb2.append('#');
        sb2.append(this.f4057i);
        String sb3 = sb2.toString();
        C4753m.m18652e(sb3, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb3);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1077n0) && this.f4057i == ((C1077n0) obj).f4057i;
    }

    public int hashCode() {
        return Long.hashCode(this.f4057i);
    }

    public String toString() {
        return "CoroutineId(" + this.f4057i + ')';
    }
}
