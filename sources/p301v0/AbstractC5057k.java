package p301v0;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p301v0.C5083s1;

/* renamed from: v0.k */
/* loaded from: classes.dex */
public abstract class AbstractC5057k extends AbstractC5045g {

    /* renamed from: c */
    public static final Logger f18995c = Logger.getLogger(AbstractC5057k.class.getName());

    /* renamed from: d */
    public static final boolean f18996d = C5080r1.m20464C();

    /* renamed from: a */
    public C5060l f18997a;

    /* renamed from: b */
    public boolean f18998b;

    /* renamed from: v0.k$b */
    /* loaded from: classes.dex */
    public static abstract class b extends AbstractC5057k {

        /* renamed from: e */
        public final byte[] f18999e;

        /* renamed from: f */
        public final int f19000f;

        /* renamed from: g */
        public int f19001g;

        /* renamed from: h */
        public int f19002h;

        public b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f18999e = bArr;
            this.f19000f = bArr.length;
        }

        /* renamed from: b1 */
        public final void m20269b1(byte b10) {
            byte[] bArr = this.f18999e;
            int i10 = this.f19001g;
            this.f19001g = i10 + 1;
            bArr[i10] = b10;
            this.f19002h++;
        }

        /* renamed from: c1 */
        public final void m20270c1(int i10) {
            byte[] bArr = this.f18999e;
            int i11 = this.f19001g;
            int i12 = i11 + 1;
            this.f19001g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f19001g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f19001g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f19001g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f19002h += 4;
        }

        /* renamed from: d1 */
        public final void m20271d1(long j10) {
            byte[] bArr = this.f18999e;
            int i10 = this.f19001g;
            int i11 = i10 + 1;
            this.f19001g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            this.f19001g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            this.f19001g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            this.f19001g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            this.f19001g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f19001g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f19001g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f19001g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f19002h += 8;
        }

        /* renamed from: e1 */
        public final void m20272e1(int i10) {
            if (i10 >= 0) {
                m20274g1(i10);
            } else {
                m20275h1(i10);
            }
        }

        /* renamed from: f1 */
        public final void m20273f1(int i10, int i11) {
            m20274g1(C5086t1.m20577c(i10, i11));
        }

        /* renamed from: g1 */
        public final void m20274g1(int i10) {
            if (!AbstractC5057k.f18996d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f18999e;
                    int i11 = this.f19001g;
                    this.f19001g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.f19002h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f18999e;
                int i12 = this.f19001g;
                this.f19001g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f19002h++;
                return;
            }
            long j10 = this.f19001g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f18999e;
                int i13 = this.f19001g;
                this.f19001g = i13 + 1;
                C5080r1.m20469H(bArr3, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f18999e;
            int i14 = this.f19001g;
            this.f19001g = i14 + 1;
            C5080r1.m20469H(bArr4, i14, (byte) i10);
            this.f19002h += (int) (this.f19001g - j10);
        }

        /* renamed from: h1 */
        public final void m20275h1(long j10) {
            if (!AbstractC5057k.f18996d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f18999e;
                    int i10 = this.f19001g;
                    this.f19001g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.f19002h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f18999e;
                int i11 = this.f19001g;
                this.f19001g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f19002h++;
                return;
            }
            long j11 = this.f19001g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f18999e;
                int i12 = this.f19001g;
                this.f19001g = i12 + 1;
                C5080r1.m20469H(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f18999e;
            int i13 = this.f19001g;
            this.f19001g = i13 + 1;
            C5080r1.m20469H(bArr4, i13, (byte) j10);
            this.f19002h += (int) (this.f19001g - j11);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: i0 */
        public final int mo20251i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* renamed from: v0.k$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC5057k {

        /* renamed from: e */
        public final byte[] f19003e;

        /* renamed from: f */
        public final int f19004f;

        /* renamed from: g */
        public final int f19005g;

        /* renamed from: h */
        public int f19006h;

        public c(byte[] bArr, int i10, int i11) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f19003e = bArr;
            this.f19004f = i10;
            this.f19006h = i10;
            this.f19005g = i12;
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: E0 */
        public final void mo20224E0(int i10, int i11) {
            mo20242W0(i10, 0);
            mo20225F0(i11);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: F0 */
        public final void mo20225F0(int i10) {
            if (i10 >= 0) {
                mo20244Y0(i10);
            } else {
                mo20246a1(i10);
            }
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: I0 */
        public final void mo20228I0(int i10, InterfaceC5079r0 interfaceC5079r0, InterfaceC5047g1 interfaceC5047g1) {
            mo20242W0(i10, 2);
            mo20244Y0(((AbstractC5027a) interfaceC5079r0).m19778m(interfaceC5047g1));
            interfaceC5047g1.mo19941d(interfaceC5079r0, this.f18997a);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: J0 */
        public final void mo20229J0(InterfaceC5079r0 interfaceC5079r0) {
            mo20244Y0(interfaceC5079r0.mo20457g());
            interfaceC5079r0.mo20456e(this);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: K0 */
        public final void mo20230K0(int i10, InterfaceC5079r0 interfaceC5079r0) {
            mo20242W0(1, 3);
            mo20243X0(2, i10);
            m20277c1(3, interfaceC5079r0);
            mo20242W0(1, 4);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: L0 */
        public final void mo20231L0(int i10, AbstractC5048h abstractC5048h) {
            mo20242W0(1, 3);
            mo20243X0(2, i10);
            mo20257o0(3, abstractC5048h);
            mo20242W0(1, 4);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: U0 */
        public final void mo20240U0(int i10, String str) {
            mo20242W0(i10, 2);
            mo20241V0(str);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: V0 */
        public final void mo20241V0(String str) {
            int m20533f;
            int i10 = this.f19006h;
            try {
                int m20188X = AbstractC5057k.m20188X(str.length() * 3);
                int m20188X2 = AbstractC5057k.m20188X(str.length());
                if (m20188X2 == m20188X) {
                    int i11 = i10 + m20188X2;
                    this.f19006h = i11;
                    m20533f = C5083s1.m20533f(str, this.f19003e, i11, mo20251i0());
                    this.f19006h = i10;
                    mo20244Y0((m20533f - i10) - m20188X2);
                } else {
                    mo20244Y0(C5083s1.m20534g(str));
                    m20533f = C5083s1.m20533f(str, this.f19003e, this.f19006h, mo20251i0());
                }
                this.f19006h = m20533f;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(e10);
            } catch (C5083s1.d e11) {
                this.f19006h = i10;
                m20249d0(str, e11);
            }
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: W0 */
        public final void mo20242W0(int i10, int i11) {
            mo20244Y0(C5086t1.m20577c(i10, i11));
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: X0 */
        public final void mo20243X0(int i10, int i11) {
            mo20242W0(i10, 0);
            mo20244Y0(i11);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: Y0 */
        public final void mo20244Y0(int i10) {
            if (!AbstractC5057k.f18996d || C5036d.m19830c() || mo20251i0() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f19003e;
                        int i11 = this.f19006h;
                        this.f19006h = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19006h), Integer.valueOf(this.f19005g), 1), e10);
                    }
                }
                byte[] bArr2 = this.f19003e;
                int i12 = this.f19006h;
                this.f19006h = i12 + 1;
                bArr2[i12] = (byte) i10;
                return;
            }
            if ((i10 & (-128)) == 0) {
                byte[] bArr3 = this.f19003e;
                int i13 = this.f19006h;
                this.f19006h = i13 + 1;
                C5080r1.m20469H(bArr3, i13, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f19003e;
            int i14 = this.f19006h;
            this.f19006h = i14 + 1;
            C5080r1.m20469H(bArr4, i14, (byte) (i10 | 128));
            int i15 = i10 >>> 7;
            if ((i15 & (-128)) == 0) {
                byte[] bArr5 = this.f19003e;
                int i16 = this.f19006h;
                this.f19006h = i16 + 1;
                C5080r1.m20469H(bArr5, i16, (byte) i15);
                return;
            }
            byte[] bArr6 = this.f19003e;
            int i17 = this.f19006h;
            this.f19006h = i17 + 1;
            C5080r1.m20469H(bArr6, i17, (byte) (i15 | 128));
            int i18 = i15 >>> 7;
            if ((i18 & (-128)) == 0) {
                byte[] bArr7 = this.f19003e;
                int i19 = this.f19006h;
                this.f19006h = i19 + 1;
                C5080r1.m20469H(bArr7, i19, (byte) i18);
                return;
            }
            byte[] bArr8 = this.f19003e;
            int i20 = this.f19006h;
            this.f19006h = i20 + 1;
            C5080r1.m20469H(bArr8, i20, (byte) (i18 | 128));
            int i21 = i18 >>> 7;
            if ((i21 & (-128)) == 0) {
                byte[] bArr9 = this.f19003e;
                int i22 = this.f19006h;
                this.f19006h = i22 + 1;
                C5080r1.m20469H(bArr9, i22, (byte) i21);
                return;
            }
            byte[] bArr10 = this.f19003e;
            int i23 = this.f19006h;
            this.f19006h = i23 + 1;
            C5080r1.m20469H(bArr10, i23, (byte) (i21 | 128));
            byte[] bArr11 = this.f19003e;
            int i24 = this.f19006h;
            this.f19006h = i24 + 1;
            C5080r1.m20469H(bArr11, i24, (byte) (i21 >>> 7));
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: Z0 */
        public final void mo20245Z0(int i10, long j10) {
            mo20242W0(i10, 0);
            mo20246a1(j10);
        }

        @Override // p301v0.AbstractC5057k, p301v0.AbstractC5045g
        /* renamed from: a */
        public final void mo19937a(byte[] bArr, int i10, int i11) {
            m20276b1(bArr, i10, i11);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: a1 */
        public final void mo20246a1(long j10) {
            if (AbstractC5057k.f18996d && mo20251i0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f19003e;
                    int i10 = this.f19006h;
                    this.f19006h = i10 + 1;
                    C5080r1.m20469H(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f19003e;
                int i11 = this.f19006h;
                this.f19006h = i11 + 1;
                C5080r1.m20469H(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f19003e;
                    int i12 = this.f19006h;
                    this.f19006h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19006h), Integer.valueOf(this.f19005g), 1), e10);
                }
            }
            byte[] bArr4 = this.f19003e;
            int i13 = this.f19006h;
            this.f19006h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        /* renamed from: b1 */
        public final void m20276b1(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f19003e, this.f19006h, i11);
                this.f19006h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19006h), Integer.valueOf(this.f19005g), Integer.valueOf(i11)), e10);
            }
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: c0 */
        public void mo20248c0() {
        }

        /* renamed from: c1 */
        public final void m20277c1(int i10, InterfaceC5079r0 interfaceC5079r0) {
            mo20242W0(i10, 2);
            mo20229J0(interfaceC5079r0);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: i0 */
        public final int mo20251i0() {
            return this.f19005g - this.f19006h;
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: j0 */
        public final void mo20252j0(byte b10) {
            try {
                byte[] bArr = this.f19003e;
                int i10 = this.f19006h;
                this.f19006h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19006h), Integer.valueOf(this.f19005g), 1), e10);
            }
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: k0 */
        public final void mo20253k0(int i10, boolean z10) {
            mo20242W0(i10, 0);
            mo20252j0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: n0 */
        public final void mo20256n0(byte[] bArr, int i10, int i11) {
            mo20244Y0(i11);
            m20276b1(bArr, i10, i11);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: o0 */
        public final void mo20257o0(int i10, AbstractC5048h abstractC5048h) {
            mo20242W0(i10, 2);
            mo20258p0(abstractC5048h);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: p0 */
        public final void mo20258p0(AbstractC5048h abstractC5048h) {
            mo20244Y0(abstractC5048h.size());
            abstractC5048h.mo19957D(this);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: u0 */
        public final void mo20263u0(int i10, int i11) {
            mo20242W0(i10, 5);
            mo20264v0(i11);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: v0 */
        public final void mo20264v0(int i10) {
            try {
                byte[] bArr = this.f19003e;
                int i11 = this.f19006h;
                int i12 = i11 + 1;
                this.f19006h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                this.f19006h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                this.f19006h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f19006h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19006h), Integer.valueOf(this.f19005g), 1), e10);
            }
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: w0 */
        public final void mo20265w0(int i10, long j10) {
            mo20242W0(i10, 1);
            mo20266x0(j10);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: x0 */
        public final void mo20266x0(long j10) {
            try {
                byte[] bArr = this.f19003e;
                int i10 = this.f19006h;
                int i11 = i10 + 1;
                this.f19006h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                this.f19006h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                this.f19006h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                this.f19006h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                this.f19006h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                this.f19006h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                this.f19006h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f19006h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19006h), Integer.valueOf(this.f19005g), 1), e10);
            }
        }
    }

    /* renamed from: v0.k$d */
    /* loaded from: classes.dex */
    public static class d extends IOException {
        public d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        public d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: v0.k$e */
    /* loaded from: classes.dex */
    public static final class e extends b {

        /* renamed from: i */
        public final OutputStream f19007i;

        public e(OutputStream outputStream, int i10) {
            super(i10);
            Objects.requireNonNull(outputStream, "out");
            this.f19007i = outputStream;
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: E0 */
        public void mo20224E0(int i10, int i11) {
            m20279j1(20);
            m20273f1(i10, 0);
            m20272e1(i11);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: F0 */
        public void mo20225F0(int i10) {
            if (i10 >= 0) {
                mo20244Y0(i10);
            } else {
                mo20246a1(i10);
            }
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: I0 */
        public void mo20228I0(int i10, InterfaceC5079r0 interfaceC5079r0, InterfaceC5047g1 interfaceC5047g1) {
            mo20242W0(i10, 2);
            m20282m1(interfaceC5079r0, interfaceC5047g1);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: J0 */
        public void mo20229J0(InterfaceC5079r0 interfaceC5079r0) {
            mo20244Y0(interfaceC5079r0.mo20457g());
            interfaceC5079r0.mo20456e(this);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: K0 */
        public void mo20230K0(int i10, InterfaceC5079r0 interfaceC5079r0) {
            mo20242W0(1, 3);
            mo20243X0(2, i10);
            m20281l1(3, interfaceC5079r0);
            mo20242W0(1, 4);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: L0 */
        public void mo20231L0(int i10, AbstractC5048h abstractC5048h) {
            mo20242W0(1, 3);
            mo20243X0(2, i10);
            mo20257o0(3, abstractC5048h);
            mo20242W0(1, 4);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: U0 */
        public void mo20240U0(int i10, String str) {
            mo20242W0(i10, 2);
            mo20241V0(str);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: V0 */
        public void mo20241V0(String str) {
            int m20534g;
            try {
                int length = str.length() * 3;
                int m20188X = AbstractC5057k.m20188X(length);
                int i10 = m20188X + length;
                int i11 = this.f19000f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int m20533f = C5083s1.m20533f(str, bArr, 0, length);
                    mo20244Y0(m20533f);
                    mo19937a(bArr, 0, m20533f);
                    return;
                }
                if (i10 > i11 - this.f19001g) {
                    m20278i1();
                }
                int m20188X2 = AbstractC5057k.m20188X(str.length());
                int i12 = this.f19001g;
                try {
                    if (m20188X2 == m20188X) {
                        int i13 = i12 + m20188X2;
                        this.f19001g = i13;
                        int m20533f2 = C5083s1.m20533f(str, this.f18999e, i13, this.f19000f - i13);
                        this.f19001g = i12;
                        m20534g = (m20533f2 - i12) - m20188X2;
                        m20274g1(m20534g);
                        this.f19001g = m20533f2;
                    } else {
                        m20534g = C5083s1.m20534g(str);
                        m20274g1(m20534g);
                        this.f19001g = C5083s1.m20533f(str, this.f18999e, this.f19001g, m20534g);
                    }
                    this.f19002h += m20534g;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new d(e10);
                } catch (C5083s1.d e11) {
                    this.f19002h -= this.f19001g - i12;
                    this.f19001g = i12;
                    throw e11;
                }
            } catch (C5083s1.d e12) {
                m20249d0(str, e12);
            }
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: W0 */
        public void mo20242W0(int i10, int i11) {
            mo20244Y0(C5086t1.m20577c(i10, i11));
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: X0 */
        public void mo20243X0(int i10, int i11) {
            m20279j1(20);
            m20273f1(i10, 0);
            m20274g1(i11);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: Y0 */
        public void mo20244Y0(int i10) {
            m20279j1(5);
            m20274g1(i10);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: Z0 */
        public void mo20245Z0(int i10, long j10) {
            m20279j1(20);
            m20273f1(i10, 0);
            m20275h1(j10);
        }

        @Override // p301v0.AbstractC5057k, p301v0.AbstractC5045g
        /* renamed from: a */
        public void mo19937a(byte[] bArr, int i10, int i11) {
            m20280k1(bArr, i10, i11);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: a1 */
        public void mo20246a1(long j10) {
            m20279j1(10);
            m20275h1(j10);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: c0 */
        public void mo20248c0() {
            if (this.f19001g > 0) {
                m20278i1();
            }
        }

        /* renamed from: i1 */
        public final void m20278i1() {
            this.f19007i.write(this.f18999e, 0, this.f19001g);
            this.f19001g = 0;
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: j0 */
        public void mo20252j0(byte b10) {
            if (this.f19001g == this.f19000f) {
                m20278i1();
            }
            m20269b1(b10);
        }

        /* renamed from: j1 */
        public final void m20279j1(int i10) {
            if (this.f19000f - this.f19001g < i10) {
                m20278i1();
            }
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: k0 */
        public void mo20253k0(int i10, boolean z10) {
            m20279j1(11);
            m20273f1(i10, 0);
            m20269b1(z10 ? (byte) 1 : (byte) 0);
        }

        /* renamed from: k1 */
        public void m20280k1(byte[] bArr, int i10, int i11) {
            int i12 = this.f19000f;
            int i13 = this.f19001g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f18999e, i13, i11);
                this.f19001g += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.f18999e, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.f19001g = this.f19000f;
                this.f19002h += i14;
                m20278i1();
                if (i11 <= this.f19000f) {
                    System.arraycopy(bArr, i15, this.f18999e, 0, i11);
                    this.f19001g = i11;
                } else {
                    this.f19007i.write(bArr, i15, i11);
                }
            }
            this.f19002h += i11;
        }

        /* renamed from: l1 */
        public void m20281l1(int i10, InterfaceC5079r0 interfaceC5079r0) {
            mo20242W0(i10, 2);
            mo20229J0(interfaceC5079r0);
        }

        /* renamed from: m1 */
        public void m20282m1(InterfaceC5079r0 interfaceC5079r0, InterfaceC5047g1 interfaceC5047g1) {
            mo20244Y0(((AbstractC5027a) interfaceC5079r0).m19778m(interfaceC5047g1));
            interfaceC5047g1.mo19941d(interfaceC5079r0, this.f18997a);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: n0 */
        public void mo20256n0(byte[] bArr, int i10, int i11) {
            mo20244Y0(i11);
            m20280k1(bArr, i10, i11);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: o0 */
        public void mo20257o0(int i10, AbstractC5048h abstractC5048h) {
            mo20242W0(i10, 2);
            mo20258p0(abstractC5048h);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: p0 */
        public void mo20258p0(AbstractC5048h abstractC5048h) {
            mo20244Y0(abstractC5048h.size());
            abstractC5048h.mo19957D(this);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: u0 */
        public void mo20263u0(int i10, int i11) {
            m20279j1(14);
            m20273f1(i10, 5);
            m20270c1(i11);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: v0 */
        public void mo20264v0(int i10) {
            m20279j1(4);
            m20270c1(i10);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: w0 */
        public void mo20265w0(int i10, long j10) {
            m20279j1(18);
            m20273f1(i10, 1);
            m20271d1(j10);
        }

        @Override // p301v0.AbstractC5057k
        /* renamed from: x0 */
        public void mo20266x0(long j10) {
            m20279j1(8);
            m20271d1(j10);
        }
    }

    public AbstractC5057k() {
    }

    public /* synthetic */ AbstractC5057k(a aVar) {
        this();
    }

    /* renamed from: A */
    public static int m20165A(int i10, C5040e0 c5040e0) {
        return m20186V(i10) + m20166B(c5040e0);
    }

    /* renamed from: B */
    public static int m20166B(C5040e0 c5040e0) {
        return m20167C(c5040e0.m19906b());
    }

    /* renamed from: C */
    public static int m20167C(int i10) {
        return m20188X(i10) + i10;
    }

    /* renamed from: D */
    public static int m20168D(int i10, InterfaceC5079r0 interfaceC5079r0) {
        return (m20186V(1) * 2) + m20187W(2, i10) + m20169E(3, interfaceC5079r0);
    }

    /* renamed from: E */
    public static int m20169E(int i10, InterfaceC5079r0 interfaceC5079r0) {
        return m20186V(i10) + m20171G(interfaceC5079r0);
    }

    /* renamed from: F */
    public static int m20170F(int i10, InterfaceC5079r0 interfaceC5079r0, InterfaceC5047g1 interfaceC5047g1) {
        return m20186V(i10) + m20172H(interfaceC5079r0, interfaceC5047g1);
    }

    /* renamed from: G */
    public static int m20171G(InterfaceC5079r0 interfaceC5079r0) {
        return m20167C(interfaceC5079r0.mo20457g());
    }

    /* renamed from: H */
    public static int m20172H(InterfaceC5079r0 interfaceC5079r0, InterfaceC5047g1 interfaceC5047g1) {
        return m20167C(((AbstractC5027a) interfaceC5079r0).m19778m(interfaceC5047g1));
    }

    /* renamed from: I */
    public static int m20173I(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    /* renamed from: J */
    public static int m20174J(int i10, AbstractC5048h abstractC5048h) {
        return (m20186V(1) * 2) + m20187W(2, i10) + m20198g(3, abstractC5048h);
    }

    @Deprecated
    /* renamed from: K */
    public static int m20175K(int i10) {
        return m20188X(i10);
    }

    /* renamed from: L */
    public static int m20176L(int i10, int i11) {
        return m20186V(i10) + m20177M(i11);
    }

    /* renamed from: M */
    public static int m20177M(int i10) {
        return 4;
    }

    /* renamed from: N */
    public static int m20178N(int i10, long j10) {
        return m20186V(i10) + m20179O(j10);
    }

    /* renamed from: O */
    public static int m20179O(long j10) {
        return 8;
    }

    /* renamed from: P */
    public static int m20180P(int i10, int i11) {
        return m20186V(i10) + m20181Q(i11);
    }

    /* renamed from: Q */
    public static int m20181Q(int i10) {
        return m20188X(m20191a0(i10));
    }

    /* renamed from: R */
    public static int m20182R(int i10, long j10) {
        return m20186V(i10) + m20183S(j10);
    }

    /* renamed from: S */
    public static int m20183S(long j10) {
        return m20190Z(m20193b0(j10));
    }

    /* renamed from: T */
    public static int m20184T(int i10, String str) {
        return m20186V(i10) + m20185U(str);
    }

    /* renamed from: U */
    public static int m20185U(String str) {
        int length;
        try {
            length = C5083s1.m20534g(str);
        } catch (C5083s1.d unused) {
            length = str.getBytes(C5028a0.f18862a).length;
        }
        return m20167C(length);
    }

    /* renamed from: V */
    public static int m20186V(int i10) {
        return m20188X(C5086t1.m20577c(i10, 0));
    }

    /* renamed from: W */
    public static int m20187W(int i10, int i11) {
        return m20186V(i10) + m20188X(i11);
    }

    /* renamed from: X */
    public static int m20188X(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: Y */
    public static int m20189Y(int i10, long j10) {
        return m20186V(i10) + m20190Z(j10);
    }

    /* renamed from: Z */
    public static int m20190Z(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    /* renamed from: a0 */
    public static int m20191a0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    /* renamed from: b0 */
    public static long m20193b0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    /* renamed from: d */
    public static int m20194d(int i10, boolean z10) {
        return m20186V(i10) + m20195e(z10);
    }

    /* renamed from: e */
    public static int m20195e(boolean z10) {
        return 1;
    }

    /* renamed from: f */
    public static int m20196f(byte[] bArr) {
        return m20167C(bArr.length);
    }

    /* renamed from: f0 */
    public static AbstractC5057k m20197f0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    /* renamed from: g */
    public static int m20198g(int i10, AbstractC5048h abstractC5048h) {
        return m20186V(i10) + m20200h(abstractC5048h);
    }

    /* renamed from: g0 */
    public static AbstractC5057k m20199g0(byte[] bArr) {
        return m20201h0(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static int m20200h(AbstractC5048h abstractC5048h) {
        return m20167C(abstractC5048h.size());
    }

    /* renamed from: h0 */
    public static AbstractC5057k m20201h0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    /* renamed from: i */
    public static int m20202i(int i10, double d10) {
        return m20186V(i10) + m20203j(d10);
    }

    /* renamed from: j */
    public static int m20203j(double d10) {
        return 8;
    }

    /* renamed from: k */
    public static int m20204k(int i10, int i11) {
        return m20186V(i10) + m20205l(i11);
    }

    /* renamed from: l */
    public static int m20205l(int i10) {
        return m20216w(i10);
    }

    /* renamed from: m */
    public static int m20206m(int i10, int i11) {
        return m20186V(i10) + m20207n(i11);
    }

    /* renamed from: n */
    public static int m20207n(int i10) {
        return 4;
    }

    /* renamed from: o */
    public static int m20208o(int i10, long j10) {
        return m20186V(i10) + m20209p(j10);
    }

    /* renamed from: p */
    public static int m20209p(long j10) {
        return 8;
    }

    /* renamed from: q */
    public static int m20210q(int i10, float f10) {
        return m20186V(i10) + m20211r(f10);
    }

    /* renamed from: r */
    public static int m20211r(float f10) {
        return 4;
    }

    @Deprecated
    /* renamed from: s */
    public static int m20212s(int i10, InterfaceC5079r0 interfaceC5079r0, InterfaceC5047g1 interfaceC5047g1) {
        return (m20186V(i10) * 2) + m20214u(interfaceC5079r0, interfaceC5047g1);
    }

    @Deprecated
    /* renamed from: t */
    public static int m20213t(InterfaceC5079r0 interfaceC5079r0) {
        return interfaceC5079r0.mo20457g();
    }

    @Deprecated
    /* renamed from: u */
    public static int m20214u(InterfaceC5079r0 interfaceC5079r0, InterfaceC5047g1 interfaceC5047g1) {
        return ((AbstractC5027a) interfaceC5079r0).m19778m(interfaceC5047g1);
    }

    /* renamed from: v */
    public static int m20215v(int i10, int i11) {
        return m20186V(i10) + m20216w(i11);
    }

    /* renamed from: w */
    public static int m20216w(int i10) {
        if (i10 >= 0) {
            return m20188X(i10);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m20217x(int i10, long j10) {
        return m20186V(i10) + m20218y(j10);
    }

    /* renamed from: y */
    public static int m20218y(long j10) {
        return m20190Z(j10);
    }

    /* renamed from: z */
    public static int m20219z(int i10, C5040e0 c5040e0) {
        return (m20186V(1) * 2) + m20187W(2, i10) + m20165A(3, c5040e0);
    }

    @Deprecated
    /* renamed from: A0 */
    public final void m20220A0(int i10, InterfaceC5079r0 interfaceC5079r0) {
        mo20242W0(i10, 3);
        m20222C0(interfaceC5079r0);
        mo20242W0(i10, 4);
    }

    @Deprecated
    /* renamed from: B0 */
    public final void m20221B0(int i10, InterfaceC5079r0 interfaceC5079r0, InterfaceC5047g1 interfaceC5047g1) {
        mo20242W0(i10, 3);
        m20223D0(interfaceC5079r0, interfaceC5047g1);
        mo20242W0(i10, 4);
    }

    @Deprecated
    /* renamed from: C0 */
    public final void m20222C0(InterfaceC5079r0 interfaceC5079r0) {
        interfaceC5079r0.mo20456e(this);
    }

    @Deprecated
    /* renamed from: D0 */
    public final void m20223D0(InterfaceC5079r0 interfaceC5079r0, InterfaceC5047g1 interfaceC5047g1) {
        interfaceC5047g1.mo19941d(interfaceC5079r0, this.f18997a);
    }

    /* renamed from: E0 */
    public abstract void mo20224E0(int i10, int i11);

    /* renamed from: F0 */
    public abstract void mo20225F0(int i10);

    /* renamed from: G0 */
    public final void m20226G0(int i10, long j10) {
        mo20245Z0(i10, j10);
    }

    /* renamed from: H0 */
    public final void m20227H0(long j10) {
        mo20246a1(j10);
    }

    /* renamed from: I0 */
    public abstract void mo20228I0(int i10, InterfaceC5079r0 interfaceC5079r0, InterfaceC5047g1 interfaceC5047g1);

    /* renamed from: J0 */
    public abstract void mo20229J0(InterfaceC5079r0 interfaceC5079r0);

    /* renamed from: K0 */
    public abstract void mo20230K0(int i10, InterfaceC5079r0 interfaceC5079r0);

    /* renamed from: L0 */
    public abstract void mo20231L0(int i10, AbstractC5048h abstractC5048h);

    /* renamed from: M0 */
    public final void m20232M0(int i10, int i11) {
        mo20263u0(i10, i11);
    }

    /* renamed from: N0 */
    public final void m20233N0(int i10) {
        mo20264v0(i10);
    }

    /* renamed from: O0 */
    public final void m20234O0(int i10, long j10) {
        mo20265w0(i10, j10);
    }

    /* renamed from: P0 */
    public final void m20235P0(long j10) {
        mo20266x0(j10);
    }

    /* renamed from: Q0 */
    public final void m20236Q0(int i10, int i11) {
        mo20243X0(i10, m20191a0(i11));
    }

    /* renamed from: R0 */
    public final void m20237R0(int i10) {
        mo20244Y0(m20191a0(i10));
    }

    /* renamed from: S0 */
    public final void m20238S0(int i10, long j10) {
        mo20245Z0(i10, m20193b0(j10));
    }

    /* renamed from: T0 */
    public final void m20239T0(long j10) {
        mo20246a1(m20193b0(j10));
    }

    /* renamed from: U0 */
    public abstract void mo20240U0(int i10, String str);

    /* renamed from: V0 */
    public abstract void mo20241V0(String str);

    /* renamed from: W0 */
    public abstract void mo20242W0(int i10, int i11);

    /* renamed from: X0 */
    public abstract void mo20243X0(int i10, int i11);

    /* renamed from: Y0 */
    public abstract void mo20244Y0(int i10);

    /* renamed from: Z0 */
    public abstract void mo20245Z0(int i10, long j10);

    @Override // p301v0.AbstractC5045g
    /* renamed from: a */
    public abstract void mo19937a(byte[] bArr, int i10, int i11);

    /* renamed from: a1 */
    public abstract void mo20246a1(long j10);

    /* renamed from: c */
    public final void m20247c() {
        if (mo20251i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: c0 */
    public abstract void mo20248c0();

    /* renamed from: d0 */
    public final void m20249d0(String str, C5083s1.d dVar) {
        f18995c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C5028a0.f18862a);
        try {
            mo20244Y0(bytes.length);
            mo19937a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        } catch (d e11) {
            throw e11;
        }
    }

    /* renamed from: e0 */
    public boolean m20250e0() {
        return this.f18998b;
    }

    /* renamed from: i0 */
    public abstract int mo20251i0();

    /* renamed from: j0 */
    public abstract void mo20252j0(byte b10);

    /* renamed from: k0 */
    public abstract void mo20253k0(int i10, boolean z10);

    /* renamed from: l0 */
    public final void m20254l0(boolean z10) {
        mo20252j0(z10 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: m0 */
    public final void m20255m0(byte[] bArr) {
        mo20256n0(bArr, 0, bArr.length);
    }

    /* renamed from: n0 */
    public abstract void mo20256n0(byte[] bArr, int i10, int i11);

    /* renamed from: o0 */
    public abstract void mo20257o0(int i10, AbstractC5048h abstractC5048h);

    /* renamed from: p0 */
    public abstract void mo20258p0(AbstractC5048h abstractC5048h);

    /* renamed from: q0 */
    public final void m20259q0(int i10, double d10) {
        mo20265w0(i10, Double.doubleToRawLongBits(d10));
    }

    /* renamed from: r0 */
    public final void m20260r0(double d10) {
        mo20266x0(Double.doubleToRawLongBits(d10));
    }

    /* renamed from: s0 */
    public final void m20261s0(int i10, int i11) {
        mo20224E0(i10, i11);
    }

    /* renamed from: t0 */
    public final void m20262t0(int i10) {
        mo20225F0(i10);
    }

    /* renamed from: u0 */
    public abstract void mo20263u0(int i10, int i11);

    /* renamed from: v0 */
    public abstract void mo20264v0(int i10);

    /* renamed from: w0 */
    public abstract void mo20265w0(int i10, long j10);

    /* renamed from: x0 */
    public abstract void mo20266x0(long j10);

    /* renamed from: y0 */
    public final void m20267y0(int i10, float f10) {
        mo20263u0(i10, Float.floatToRawIntBits(f10));
    }

    /* renamed from: z0 */
    public final void m20268z0(float f10) {
        mo20264v0(Float.floatToRawIntBits(f10));
    }
}
