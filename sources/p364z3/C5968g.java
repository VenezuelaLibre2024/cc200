package p364z3;

import p126i7.AbstractC2651u;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p264s3.C4463m1;

/* renamed from: z3.g */
/* loaded from: classes.dex */
public final class C5968g implements InterfaceC5962a {

    /* renamed from: a */
    public final C4463m1 f22172a;

    public C5968g(C4463m1 c4463m1) {
        this.f22172a = c4463m1;
    }

    /* renamed from: a */
    public static String m23916a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static String m23917b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    /* renamed from: c */
    public static InterfaceC5962a m23918c(C4015a0 c4015a0) {
        c4015a0.m15224U(4);
        int m15245t = c4015a0.m15245t();
        int m15245t2 = c4015a0.m15245t();
        c4015a0.m15224U(4);
        int m15245t3 = c4015a0.m15245t();
        String m23916a = m23916a(m15245t3);
        if (m23916a != null) {
            C4463m1.b bVar = new C4463m1.b();
            bVar.m17481n0(m15245t).m17460S(m15245t2).m17474g0(m23916a);
            return new C5968g(bVar.m17448G());
        }
        C4046r.m15529i("StreamFormatChunk", "Ignoring track with unsupported compression " + m15245t3);
        return null;
    }

    /* renamed from: d */
    public static InterfaceC5962a m23919d(int i10, C4015a0 c4015a0) {
        if (i10 == 2) {
            return m23918c(c4015a0);
        }
        if (i10 == 1) {
            return m23920e(c4015a0);
        }
        C4046r.m15529i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + C4041n0.m15466k0(i10));
        return null;
    }

    /* renamed from: e */
    public static InterfaceC5962a m23920e(C4015a0 c4015a0) {
        int m15250y = c4015a0.m15250y();
        String m23917b = m23917b(m15250y);
        if (m23917b == null) {
            C4046r.m15529i("StreamFormatChunk", "Ignoring track with unsupported format tag " + m15250y);
            return null;
        }
        int m15250y2 = c4015a0.m15250y();
        int m15245t = c4015a0.m15245t();
        c4015a0.m15224U(6);
        int m15448b0 = C4041n0.m15448b0(c4015a0.m15216M());
        int m15250y3 = c4015a0.m15250y();
        byte[] bArr = new byte[m15250y3];
        c4015a0.m15237l(bArr, 0, m15250y3);
        C4463m1.b bVar = new C4463m1.b();
        bVar.m17474g0(m23917b).m17451J(m15250y2).m17475h0(m15245t);
        if ("audio/raw".equals(m23917b) && m15448b0 != 0) {
            bVar.m17468a0(m15448b0);
        }
        if ("audio/mp4a-latm".equals(m23917b) && m15250y3 > 0) {
            bVar.m17463V(AbstractC2651u.m10771v(bArr));
        }
        return new C5968g(bVar.m17448G());
    }

    @Override // p364z3.InterfaceC5962a
    public int getType() {
        return 1718776947;
    }
}
