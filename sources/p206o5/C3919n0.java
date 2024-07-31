package p206o5;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import p222p5.C4014a;

/* renamed from: o5.n0 */
/* loaded from: classes.dex */
public final class C3919n0 extends AbstractC3902f {

    /* renamed from: e */
    public final int f14092e;

    /* renamed from: f */
    public final byte[] f14093f;

    /* renamed from: g */
    public final DatagramPacket f14094g;

    /* renamed from: h */
    public Uri f14095h;

    /* renamed from: i */
    public DatagramSocket f14096i;

    /* renamed from: j */
    public MulticastSocket f14097j;

    /* renamed from: k */
    public InetAddress f14098k;

    /* renamed from: l */
    public boolean f14099l;

    /* renamed from: m */
    public int f14100m;

    /* renamed from: o5.n0$a */
    /* loaded from: classes.dex */
    public static final class a extends C3912k {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public C3919n0() {
        this(2000);
    }

    public C3919n0(int i10) {
        this(i10, 8000);
    }

    public C3919n0(int i10, int i11) {
        super(true);
        this.f14092e = i11;
        byte[] bArr = new byte[i10];
        this.f14093f = bArr;
        this.f14094g = new DatagramPacket(bArr, 0, i10);
    }

    @Override // p206o5.InterfaceC3906h
    /* renamed from: c */
    public int mo14769c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f14100m == 0) {
            try {
                ((DatagramSocket) C4014a.m15199e(this.f14096i)).receive(this.f14094g);
                int length = this.f14094g.getLength();
                this.f14100m = length;
                m14821q(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f14094g.getLength();
        int i12 = this.f14100m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f14093f, length2 - i12, bArr, i10, min);
        this.f14100m -= min;
        return min;
    }

    @Override // p206o5.InterfaceC3910j
    public void close() {
        this.f14095h = null;
        MulticastSocket multicastSocket = this.f14097j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C4014a.m15199e(this.f14098k));
            } catch (IOException unused) {
            }
            this.f14097j = null;
        }
        DatagramSocket datagramSocket = this.f14096i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f14096i = null;
        }
        this.f14098k = null;
        this.f14100m = 0;
        if (this.f14099l) {
            this.f14099l = false;
            m14822r();
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: k */
    public long mo14770k(C3918n c3918n) {
        Uri uri = c3918n.f14071a;
        this.f14095h = uri;
        String str = (String) C4014a.m15199e(uri.getHost());
        int port = this.f14095h.getPort();
        m14823s(c3918n);
        try {
            this.f14098k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f14098k, port);
            if (this.f14098k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f14097j = multicastSocket;
                multicastSocket.joinGroup(this.f14098k);
                this.f14096i = this.f14097j;
            } else {
                this.f14096i = new DatagramSocket(inetSocketAddress);
            }
            this.f14096i.setSoTimeout(this.f14092e);
            this.f14099l = true;
            m14824t(c3918n);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: o */
    public Uri mo14771o() {
        return this.f14095h;
    }
}
