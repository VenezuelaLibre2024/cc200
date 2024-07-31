package p264s3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p222p5.C4041n0;
import p290u4.InterfaceC4873o0;

/* renamed from: s3.f3 */
/* loaded from: classes.dex */
public final class C4430f3 extends AbstractC4399a {

    /* renamed from: p */
    public final int f16274p;

    /* renamed from: q */
    public final int f16275q;

    /* renamed from: r */
    public final int[] f16276r;

    /* renamed from: s */
    public final int[] f16277s;

    /* renamed from: t */
    public final AbstractC4505u3[] f16278t;

    /* renamed from: u */
    public final Object[] f16279u;

    /* renamed from: v */
    public final HashMap<Object, Integer> f16280v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4430f3(Collection<? extends InterfaceC4424e2> collection, InterfaceC4873o0 interfaceC4873o0) {
        super(false, interfaceC4873o0);
        int i10 = 0;
        int size = collection.size();
        this.f16276r = new int[size];
        this.f16277s = new int[size];
        this.f16278t = new AbstractC4505u3[size];
        this.f16279u = new Object[size];
        this.f16280v = new HashMap<>();
        int i11 = 0;
        int i12 = 0;
        for (InterfaceC4424e2 interfaceC4424e2 : collection) {
            this.f16278t[i12] = interfaceC4424e2.mo17180c();
            this.f16277s[i12] = i10;
            this.f16276r[i12] = i11;
            i10 += this.f16278t[i12].mo4748t();
            i11 += this.f16278t[i12].mo4745m();
            this.f16279u[i12] = interfaceC4424e2.mo17179b();
            this.f16280v.put(this.f16279u[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f16274p = i10;
        this.f16275q = i11;
    }

    @Override // p264s3.AbstractC4399a
    /* renamed from: B */
    public Object mo17019B(int i10) {
        return this.f16279u[i10];
    }

    @Override // p264s3.AbstractC4399a
    /* renamed from: D */
    public int mo17020D(int i10) {
        return this.f16276r[i10];
    }

    @Override // p264s3.AbstractC4399a
    /* renamed from: E */
    public int mo17021E(int i10) {
        return this.f16277s[i10];
    }

    @Override // p264s3.AbstractC4399a
    /* renamed from: H */
    public AbstractC4505u3 mo17024H(int i10) {
        return this.f16278t[i10];
    }

    /* renamed from: I */
    public List<AbstractC4505u3> m17222I() {
        return Arrays.asList(this.f16278t);
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: m */
    public int mo4745m() {
        return this.f16275q;
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: t */
    public int mo4748t() {
        return this.f16274p;
    }

    @Override // p264s3.AbstractC4399a
    /* renamed from: w */
    public int mo17030w(Object obj) {
        Integer num = this.f16280v.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p264s3.AbstractC4399a
    /* renamed from: x */
    public int mo17031x(int i10) {
        return C4041n0.m15459h(this.f16276r, i10 + 1, false, false);
    }

    @Override // p264s3.AbstractC4399a
    /* renamed from: y */
    public int mo17032y(int i10) {
        return C4041n0.m15459h(this.f16277s, i10 + 1, false, false);
    }
}
