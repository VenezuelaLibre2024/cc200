package p156k8;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import p045d3.C1531c;
import p045d3.InterfaceC1535g;
import p045d3.InterfaceC1537i;
import p061e3.C1645a;
import p066e8.AbstractC1754u;
import p066e8.C1730g0;
import p093g3.C1983u;
import p098g8.AbstractC2135f0;
import p110h8.C2450j;
import p171l8.InterfaceC3458i;

/* renamed from: k8.b */
/* loaded from: classes.dex */
public class C3373b {

    /* renamed from: c */
    public static final C2450j f11751c = new C2450j();

    /* renamed from: d */
    public static final String f11752d = m12544e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e */
    public static final String f11753e = m12544e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f */
    public static final InterfaceC1535g<AbstractC2135f0, byte[]> f11754f = new InterfaceC1535g() { // from class: k8.a
        @Override // p045d3.InterfaceC1535g
        public final Object apply(Object obj) {
            byte[] m12543d;
            m12543d = C3373b.m12543d((AbstractC2135f0) obj);
            return m12543d;
        }
    };

    /* renamed from: a */
    public final C3376e f11755a;

    /* renamed from: b */
    public final InterfaceC1535g<AbstractC2135f0, byte[]> f11756b;

    public C3373b(C3376e c3376e, InterfaceC1535g<AbstractC2135f0, byte[]> interfaceC1535g) {
        this.f11755a = c3376e;
        this.f11756b = interfaceC1535g;
    }

    /* renamed from: b */
    public static C3373b m12542b(Context context, InterfaceC3458i interfaceC3458i, C1730g0 c1730g0) {
        C1983u.m8008f(context);
        InterfaceC1537i m8011g = C1983u.m8006c().m8011g(new C1645a(f11752d, f11753e));
        C1531c m6232b = C1531c.m6232b("json");
        InterfaceC1535g<AbstractC2135f0, byte[]> interfaceC1535g = f11754f;
        return new C3373b(new C3376e(m8011g.mo6240a("FIREBASE_CRASHLYTICS_REPORT", AbstractC2135f0.class, m6232b, interfaceC1535g), interfaceC3458i.mo12858b(), c1730g0), interfaceC1535g);
    }

    /* renamed from: d */
    public static /* synthetic */ byte[] m12543d(AbstractC2135f0 abstractC2135f0) {
        return f11751c.m9773M(abstractC2135f0).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    public static String m12544e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public Task<AbstractC1754u> m12545c(AbstractC1754u abstractC1754u, boolean z10) {
        return this.f11755a.m12557i(abstractC1754u, z10).getTask();
    }
}
