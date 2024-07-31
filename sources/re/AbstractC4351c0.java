package re;

import bf.InterfaceC0558d;
import java.util.Objects;
import se.C4596e;

/* renamed from: re.c0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4351c0 {

    /* renamed from: re.c0$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractC4351c0 {

        /* renamed from: a */
        public final /* synthetic */ C4376x f15726a;

        /* renamed from: b */
        public final /* synthetic */ int f15727b;

        /* renamed from: c */
        public final /* synthetic */ byte[] f15728c;

        /* renamed from: d */
        public final /* synthetic */ int f15729d;

        public a(C4376x c4376x, int i10, byte[] bArr, int i11) {
            this.f15727b = i10;
            this.f15728c = bArr;
            this.f15729d = i11;
        }

        @Override // re.AbstractC4351c0
        /* renamed from: a */
        public long mo16679a() {
            return this.f15727b;
        }

        @Override // re.AbstractC4351c0
        /* renamed from: b */
        public C4376x mo16680b() {
            return this.f15726a;
        }

        @Override // re.AbstractC4351c0
        /* renamed from: g */
        public void mo16683g(InterfaceC0558d interfaceC0558d) {
            interfaceC0558d.mo2822Y(this.f15728c, this.f15729d, this.f15727b);
        }
    }

    /* renamed from: c */
    public static AbstractC4351c0 m16677c(C4376x c4376x, byte[] bArr) {
        return m16678d(c4376x, bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static AbstractC4351c0 m16678d(C4376x c4376x, byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "content == null");
        C4596e.m18097e(bArr.length, i10, i11);
        return new a(c4376x, i11, bArr, i10);
    }

    /* renamed from: a */
    public abstract long mo16679a();

    /* renamed from: b */
    public abstract C4376x mo16680b();

    /* renamed from: e */
    public boolean m16681e() {
        return false;
    }

    /* renamed from: f */
    public boolean m16682f() {
        return false;
    }

    /* renamed from: g */
    public abstract void mo16683g(InterfaceC0558d interfaceC0558d);
}
