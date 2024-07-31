package p152k4;

import p167l4.C3431b;
import p180m4.C3524b;
import p205o4.C3889a;
import p221p4.C4007h;
import p250r4.C4295c;
import p264s3.C4463m1;

/* renamed from: k4.c */
/* loaded from: classes.dex */
public interface InterfaceC3350c {

    /* renamed from: a */
    public static final InterfaceC3350c f11658a = new a();

    /* renamed from: k4.c$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC3350c {
        @Override // p152k4.InterfaceC3350c
        /* renamed from: a */
        public boolean mo12421a(C4463m1 c4463m1) {
            String str = c4463m1.f16506s;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // p152k4.InterfaceC3350c
        /* renamed from: b */
        public InterfaceC3349b mo12422b(C4463m1 c4463m1) {
            String str = c4463m1.f16506s;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new C3431b();
                    case 1:
                        return new C3889a();
                    case 2:
                        return new C4007h();
                    case 3:
                        return new C3524b();
                    case 4:
                        return new C4295c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo12421a(C4463m1 c4463m1);

    /* renamed from: b */
    InterfaceC3349b mo12422b(C4463m1 c4463m1);
}
