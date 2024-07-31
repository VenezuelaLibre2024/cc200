package p304v3;

import android.media.MediaCodec;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: v3.c */
/* loaded from: classes.dex */
public final class C5106c {

    /* renamed from: a */
    public byte[] f19259a;

    /* renamed from: b */
    public byte[] f19260b;

    /* renamed from: c */
    public int f19261c;

    /* renamed from: d */
    public int[] f19262d;

    /* renamed from: e */
    public int[] f19263e;

    /* renamed from: f */
    public int f19264f;

    /* renamed from: g */
    public int f19265g;

    /* renamed from: h */
    public int f19266h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f19267i;

    /* renamed from: j */
    public final b f19268j;

    /* renamed from: v3.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f19269a;

        /* renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f19270b;

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f19269a = cryptoInfo;
            this.f19270b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public /* synthetic */ b(MediaCodec.CryptoInfo cryptoInfo, a aVar) {
            this(cryptoInfo);
        }

        /* renamed from: b */
        public final void m20757b(int i10, int i11) {
            this.f19270b.set(i10, i11);
            this.f19269a.setPattern(this.f19270b);
        }
    }

    public C5106c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f19267i = cryptoInfo;
        this.f19268j = C4041n0.f14513a >= 24 ? new b(cryptoInfo) : null;
    }

    /* renamed from: a */
    public MediaCodec.CryptoInfo m20753a() {
        return this.f19267i;
    }

    /* renamed from: b */
    public void m20754b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f19262d == null) {
            int[] iArr = new int[1];
            this.f19262d = iArr;
            this.f19267i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f19262d;
        iArr2[0] = iArr2[0] + i10;
    }

    /* renamed from: c */
    public void m20755c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f19264f = i10;
        this.f19262d = iArr;
        this.f19263e = iArr2;
        this.f19260b = bArr;
        this.f19259a = bArr2;
        this.f19261c = i11;
        this.f19265g = i12;
        this.f19266h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f19267i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (C4041n0.f14513a >= 24) {
            ((b) C4014a.m15199e(this.f19268j)).m20757b(i12, i13);
        }
    }
}
