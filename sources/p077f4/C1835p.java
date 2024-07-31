package p077f4;

import p222p5.C4014a;
import p222p5.C4046r;
import p333x3.InterfaceC5559b0;

/* renamed from: f4.p */
/* loaded from: classes.dex */
public final class C1835p {

    /* renamed from: a */
    public final boolean f6939a;

    /* renamed from: b */
    public final String f6940b;

    /* renamed from: c */
    public final InterfaceC5559b0.a f6941c;

    /* renamed from: d */
    public final int f6942d;

    /* renamed from: e */
    public final byte[] f6943e;

    public C1835p(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        C4014a.m15195a((bArr2 == null) ^ (i10 == 0));
        this.f6939a = z10;
        this.f6940b = str;
        this.f6942d = i10;
        this.f6943e = bArr2;
        this.f6941c = new InterfaceC5559b0.a(m7548a(str), bArr, i11, i12);
    }

    /* renamed from: a */
    public static int m7548a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            default:
                C4046r.m15529i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
