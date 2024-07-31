package p255r9;

import android.net.Uri;
import p195n7.C3767g;
import p240q9.C4217h;

/* renamed from: r9.g */
/* loaded from: classes.dex */
public class C4330g extends AbstractC4329f {

    /* renamed from: m */
    public final Uri f15657m;

    /* renamed from: n */
    public final byte[] f15658n;

    /* renamed from: o */
    public final long f15659o;

    /* renamed from: p */
    public final boolean f15660p;

    /* renamed from: q */
    public final int f15661q;

    public C4330g(C4217h c4217h, C3767g c3767g, Uri uri, byte[] bArr, long j10, int i10, boolean z10) {
        super(c4217h, c3767g);
        if (bArr == null && i10 != -1) {
            this.f15647a = new IllegalArgumentException("contentType is null or empty");
        }
        if (j10 < 0) {
            this.f15647a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f15661q = i10;
        this.f15657m = uri;
        this.f15658n = i10 <= 0 ? null : bArr;
        this.f15659o = j10;
        this.f15660p = z10;
        super.m16587G("X-Goog-Upload-Protocol", "resumable");
        super.m16587G("X-Goog-Upload-Command", (!z10 || i10 <= 0) ? z10 ? "finalize" : "upload" : "upload, finalize");
        super.m16587G("X-Goog-Upload-Offset", Long.toString(j10));
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: e */
    public String mo16577e() {
        return "POST";
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: h */
    public byte[] mo16594h() {
        return this.f15658n;
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: i */
    public int mo16595i() {
        int i10 = this.f15661q;
        if (i10 > 0) {
            return i10;
        }
        return 0;
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: u */
    public Uri mo16579u() {
        return this.f15657m;
    }
}
