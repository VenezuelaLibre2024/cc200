package p100gc;

import p325wb.C5472e;

/* renamed from: gc.f */
/* loaded from: classes.dex */
public abstract class AbstractC2226f {

    /* renamed from: a */
    public static final C5472e f8851a = new C5472e(AbstractC2226f.class.getSimpleName());

    /* renamed from: gc.f$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC2226f {

        /* renamed from: b */
        public double f8852b;

        /* renamed from: c */
        public double f8853c;

        /* renamed from: d */
        public double f8854d;

        /* renamed from: e */
        public int f8855e;

        public b(int i10, int i11) {
            super();
            this.f8852b = 1.0d / i10;
            this.f8853c = 1.0d / i11;
            AbstractC2226f.f8851a.m21682b("inFrameRateReciprocal:" + this.f8852b + " outFrameRateReciprocal:" + this.f8853c);
        }

        @Override // p100gc.AbstractC2226f
        /* renamed from: c */
        public boolean mo8955c(long j10) {
            C5472e c5472e;
            StringBuilder sb2;
            String str;
            double d10 = this.f8854d + this.f8852b;
            this.f8854d = d10;
            int i10 = this.f8855e;
            this.f8855e = i10 + 1;
            if (i10 == 0) {
                c5472e = AbstractC2226f.f8851a;
                sb2 = new StringBuilder();
                str = "RENDERING (first frame) - frameRateReciprocalSum:";
            } else {
                double d11 = this.f8853c;
                if (d10 <= d11) {
                    AbstractC2226f.f8851a.m21686g("DROPPING - frameRateReciprocalSum:" + this.f8854d);
                    return false;
                }
                this.f8854d = d10 - d11;
                c5472e = AbstractC2226f.f8851a;
                sb2 = new StringBuilder();
                str = "RENDERING - frameRateReciprocalSum:";
            }
            sb2.append(str);
            sb2.append(this.f8854d);
            c5472e.m21686g(sb2.toString());
            return true;
        }
    }

    public AbstractC2226f() {
    }

    /* renamed from: b */
    public static AbstractC2226f m8954b(int i10, int i11) {
        return new b(i10, i11);
    }

    /* renamed from: c */
    public abstract boolean mo8955c(long j10);
}
