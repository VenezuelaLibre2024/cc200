package p299ue;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import re.C4364l;
import se.AbstractC4592a;

/* renamed from: ue.b */
/* loaded from: classes2.dex */
public final class C5014b {

    /* renamed from: a */
    public final List<C4364l> f18744a;

    /* renamed from: b */
    public int f18745b = 0;

    /* renamed from: c */
    public boolean f18746c;

    /* renamed from: d */
    public boolean f18747d;

    public C5014b(List<C4364l> list) {
        this.f18744a = list;
    }

    /* renamed from: a */
    public C4364l m19648a(SSLSocket sSLSocket) {
        C4364l c4364l;
        int i10 = this.f18745b;
        int size = this.f18744a.size();
        while (true) {
            if (i10 >= size) {
                c4364l = null;
                break;
            }
            c4364l = this.f18744a.get(i10);
            i10++;
            if (c4364l.m16759c(sSLSocket)) {
                this.f18745b = i10;
                break;
            }
        }
        if (c4364l != null) {
            this.f18746c = m19650c(sSLSocket);
            AbstractC4592a.f17225a.mo16925c(c4364l, sSLSocket, this.f18747d);
            return c4364l;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f18747d + ", modes=" + this.f18744a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* renamed from: b */
    public boolean m19649b(IOException iOException) {
        this.f18747d = true;
        if (!this.f18746c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return iOException instanceof SSLException;
    }

    /* renamed from: c */
    public final boolean m19650c(SSLSocket sSLSocket) {
        for (int i10 = this.f18745b; i10 < this.f18744a.size(); i10++) {
            if (this.f18744a.get(i10).m16759c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
