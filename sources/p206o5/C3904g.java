package p206o5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p222p5.C4041n0;

/* renamed from: o5.g */
/* loaded from: classes.dex */
public final class C3904g extends AbstractC3902f {

    /* renamed from: e */
    public final ContentResolver f14023e;

    /* renamed from: f */
    public Uri f14024f;

    /* renamed from: g */
    public AssetFileDescriptor f14025g;

    /* renamed from: h */
    public FileInputStream f14026h;

    /* renamed from: i */
    public long f14027i;

    /* renamed from: j */
    public boolean f14028j;

    /* renamed from: o5.g$a */
    /* loaded from: classes.dex */
    public static class a extends C3912k {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public C3904g(Context context) {
        super(false);
        this.f14023e = context.getContentResolver();
    }

    @Override // p206o5.InterfaceC3906h
    /* renamed from: c */
    public int mo14769c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14027i;
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
        int read = ((FileInputStream) C4041n0.m15463j(this.f14026h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f14027i;
        if (j11 != -1) {
            this.f14027i = j11 - read;
        }
        m14821q(read);
        return read;
    }

    @Override // p206o5.InterfaceC3910j
    public void close() {
        this.f14024f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f14026h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f14026h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14025g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(e10, 2000);
                    }
                } finally {
                    this.f14025g = null;
                    if (this.f14028j) {
                        this.f14028j = false;
                        m14822r();
                    }
                }
            } catch (Throwable th) {
                this.f14026h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f14025g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f14025g = null;
                        if (this.f14028j) {
                            this.f14028j = false;
                            m14822r();
                        }
                        throw th;
                    } finally {
                        this.f14025g = null;
                        if (this.f14028j) {
                            this.f14028j = false;
                            m14822r();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new a(e12, 2000);
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: k */
    public long mo14770k(C3918n c3918n) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = c3918n.f14071a;
            this.f14024f = uri;
            m14823s(c3918n);
            if ("content".equals(c3918n.f14071a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f14023e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f14023e.openAssetFileDescriptor(uri, "r");
            }
            this.f14025g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f14026h = fileInputStream;
            if (length != -1 && c3918n.f14077g > length) {
                throw new a(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(c3918n.f14077g + startOffset) - startOffset;
            if (skip != c3918n.f14077g) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f14027i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f14027i = position;
                    if (position < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f14027i = j10;
                if (j10 < 0) {
                    throw new a(null, 2008);
                }
            }
            long j11 = c3918n.f14078h;
            if (j11 != -1) {
                long j12 = this.f14027i;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f14027i = j11;
            }
            this.f14028j = true;
            m14824t(c3918n);
            long j13 = c3918n.f14078h;
            return j13 != -1 ? j13 : this.f14027i;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: o */
    public Uri mo14771o() {
        return this.f14024f;
    }
}
