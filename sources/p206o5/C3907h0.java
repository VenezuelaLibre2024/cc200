package p206o5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: o5.h0 */
/* loaded from: classes.dex */
public final class C3907h0 extends AbstractC3902f {

    /* renamed from: e */
    public final Resources f14035e;

    /* renamed from: f */
    public final String f14036f;

    /* renamed from: g */
    public Uri f14037g;

    /* renamed from: h */
    public AssetFileDescriptor f14038h;

    /* renamed from: i */
    public InputStream f14039i;

    /* renamed from: j */
    public long f14040j;

    /* renamed from: k */
    public boolean f14041k;

    /* renamed from: o5.h0$a */
    /* loaded from: classes.dex */
    public static class a extends C3912k {
        public a(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public C3907h0(Context context) {
        super(false);
        this.f14035e = context.getResources();
        this.f14036f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // p206o5.InterfaceC3906h
    /* renamed from: c */
    public int mo14769c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14040j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int read = ((InputStream) C4041n0.m15463j(this.f14039i)).read(bArr, i10, i11);
        if (read == -1) {
            if (this.f14040j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f14040j;
        if (j11 != -1) {
            this.f14040j = j11 - read;
        }
        m14821q(read);
        return read;
    }

    @Override // p206o5.InterfaceC3910j
    public void close() {
        this.f14037g = null;
        try {
            try {
                InputStream inputStream = this.f14039i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f14039i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14038h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                } finally {
                    this.f14038h = null;
                    if (this.f14041k) {
                        this.f14041k = false;
                        m14822r();
                    }
                }
            } catch (Throwable th) {
                this.f14039i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f14038h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f14038h = null;
                        if (this.f14041k) {
                            this.f14041k = false;
                            m14822r();
                        }
                        throw th;
                    } finally {
                        this.f14038h = null;
                        if (this.f14041k) {
                            this.f14041k = false;
                            m14822r();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(null, e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new a(null, e12, 2000);
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: k */
    public long mo14770k(C3918n c3918n) {
        int parseInt;
        String str;
        Uri uri = c3918n.f14071a;
        this.f14037g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) C4014a.m15199e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = Integer.parseInt((String) C4014a.m15199e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String str2 = (String) C4014a.m15199e(uri.getPath());
            if (str2.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
                str2 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb2.append(str);
            sb2.append(str2);
            parseInt = this.f14035e.getIdentifier(sb2.toString(), "raw", this.f14036f);
            if (parseInt == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        }
        m14823s(c3918n);
        try {
            AssetFileDescriptor openRawResourceFd = this.f14035e.openRawResourceFd(parseInt);
            this.f14038h = openRawResourceFd;
            if (openRawResourceFd == null) {
                throw new a("Resource is compressed: " + uri, null, 2000);
            }
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.f14039i = fileInputStream;
            if (length != -1) {
                try {
                    if (c3918n.f14077g > length) {
                        throw new a(null, null, 2008);
                    }
                } catch (a e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw new a(null, e11, 2000);
                }
            }
            long startOffset = openRawResourceFd.getStartOffset();
            long skip = fileInputStream.skip(c3918n.f14077g + startOffset) - startOffset;
            if (skip != c3918n.f14077g) {
                throw new a(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f14040j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f14040j = size;
                    if (size < 0) {
                        throw new a(null, null, 2008);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f14040j = j10;
                if (j10 < 0) {
                    throw new C3912k(2008);
                }
            }
            long j11 = c3918n.f14078h;
            if (j11 != -1) {
                long j12 = this.f14040j;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f14040j = j11;
            }
            this.f14041k = true;
            m14824t(c3918n);
            long j13 = c3918n.f14078h;
            return j13 != -1 ? j13 : this.f14040j;
        } catch (Resources.NotFoundException e12) {
            throw new a(null, e12, 2005);
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: o */
    public Uri mo14771o() {
        return this.f14037g;
    }
}
