package p206o5;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: o5.c */
/* loaded from: classes.dex */
public final class C3896c extends AbstractC3902f {

    /* renamed from: e */
    public final AssetManager f13974e;

    /* renamed from: f */
    public Uri f13975f;

    /* renamed from: g */
    public InputStream f13976g;

    /* renamed from: h */
    public long f13977h;

    /* renamed from: i */
    public boolean f13978i;

    /* renamed from: o5.c$a */
    /* loaded from: classes.dex */
    public static final class a extends C3912k {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public C3896c(Context context) {
        super(false);
        this.f13974e = context.getAssets();
    }

    @Override // p206o5.InterfaceC3906h
    /* renamed from: c */
    public int mo14769c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f13977h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int read = ((InputStream) C4041n0.m15463j(this.f13976g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f13977h;
        if (j11 != -1) {
            this.f13977h = j11 - read;
        }
        m14821q(read);
        return read;
    }

    @Override // p206o5.InterfaceC3910j
    public void close() {
        this.f13975f = null;
        try {
            try {
                InputStream inputStream = this.f13976g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f13976g = null;
            if (this.f13978i) {
                this.f13978i = false;
                m14822r();
            }
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: k */
    public long mo14770k(C3918n c3918n) {
        try {
            Uri uri = c3918n.f14071a;
            this.f13975f = uri;
            String str = (String) C4014a.m15199e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
                str = str.substring(1);
            }
            m14823s(c3918n);
            InputStream open = this.f13974e.open(str, 1);
            this.f13976g = open;
            if (open.skip(c3918n.f14077g) < c3918n.f14077g) {
                throw new a(null, 2008);
            }
            long j10 = c3918n.f14078h;
            if (j10 != -1) {
                this.f13977h = j10;
            } else {
                long available = this.f13976g.available();
                this.f13977h = available;
                if (available == 2147483647L) {
                    this.f13977h = -1L;
                }
            }
            this.f13978i = true;
            m14824t(c3918n);
            return this.f13977h;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: o */
    public Uri mo14771o() {
        return this.f13975f;
    }
}
