package p047d5;

import p063e5.C1659a;
import p063e5.C1661c;
import p078f5.C1838a;
import p095g5.C1996a;
import p124i5.C2597a;
import p138j5.C3246a;
import p153k5.C3357c;
import p168l5.C3432a;
import p181m5.C3526a;
import p181m5.C3533h;
import p264s3.C4463m1;

/* renamed from: d5.k */
/* loaded from: classes.dex */
public interface InterfaceC1556k {

    /* renamed from: a */
    public static final InterfaceC1556k f5832a = new a();

    /* renamed from: d5.k$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC1556k {
        @Override // p047d5.InterfaceC1556k
        /* renamed from: a */
        public boolean mo6364a(C4463m1 c4463m1) {
            String str = c4463m1.f16506s;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // p047d5.InterfaceC1556k
        /* renamed from: b */
        public InterfaceC1554i mo6365b(C4463m1 c4463m1) {
            String str = c4463m1.f16506s;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c10 = 11;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new C1838a(c4463m1.f16508u);
                    case 1:
                        return new C1996a();
                    case 2:
                        return new C3526a();
                    case 3:
                        return new C3533h();
                    case 4:
                        return new C3432a(c4463m1.f16508u);
                    case 5:
                        return new C2597a(c4463m1.f16508u);
                    case 6:
                    case '\b':
                        return new C1659a(str, c4463m1.f16490K, 16000L);
                    case 7:
                        return new C1551f();
                    case '\t':
                        return new C1661c(c4463m1.f16490K, c4463m1.f16508u);
                    case '\n':
                        return new C3246a();
                    case 11:
                        return new C3357c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo6364a(C4463m1 c4463m1);

    /* renamed from: b */
    InterfaceC1554i mo6365b(C4463m1 c4463m1);
}
