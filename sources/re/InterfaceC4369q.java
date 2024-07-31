package re;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: re.q */
/* loaded from: classes2.dex */
public interface InterfaceC4369q {

    /* renamed from: a */
    public static final InterfaceC4369q f15960a = new InterfaceC4369q() { // from class: re.p
        @Override // re.InterfaceC4369q
        /* renamed from: a */
        public final List mo16791a(String str) {
            List m16793c;
            m16793c = InterfaceC4369q.m16793c(str);
            return m16793c;
        }
    };

    /* renamed from: c */
    static /* synthetic */ List m16793c(String str) {
        if (str == null) {
            throw new UnknownHostException("hostname == null");
        }
        try {
            return Arrays.asList(InetAddress.getAllByName(str));
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }

    /* renamed from: a */
    List<InetAddress> mo16791a(String str);
}
