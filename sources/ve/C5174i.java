package ve;

import java.net.Proxy;
import re.C4349b0;
import re.C4374v;

/* renamed from: ve.i */
/* loaded from: classes2.dex */
public final class C5174i {
    /* renamed from: a */
    public static String m20950a(C4349b0 c4349b0, Proxy.Type type) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c4349b0.m16664f());
        sb2.append(' ');
        boolean m20951b = m20951b(c4349b0, type);
        C4374v m16666h = c4349b0.m16666h();
        if (m20951b) {
            sb2.append(m16666h);
        } else {
            sb2.append(m20952c(m16666h));
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    /* renamed from: b */
    public static boolean m20951b(C4349b0 c4349b0, Proxy.Type type) {
        return !c4349b0.m16663e() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public static String m20952c(C4374v c4374v) {
        String m16857g = c4374v.m16857g();
        String m16859i = c4374v.m16859i();
        if (m16859i == null) {
            return m16857g;
        }
        return m16857g + '?' + m16859i;
    }
}
