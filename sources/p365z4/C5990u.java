package p365z4;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p181m5.C3534i;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4033j0;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5586z;

/* renamed from: z4.u */
/* loaded from: classes.dex */
public final class C5990u implements InterfaceC5571k {

    /* renamed from: g */
    public static final Pattern f22355g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    public static final Pattern f22356h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a */
    public final String f22357a;

    /* renamed from: b */
    public final C4033j0 f22358b;

    /* renamed from: d */
    public InterfaceC5573m f22360d;

    /* renamed from: f */
    public int f22362f;

    /* renamed from: c */
    public final C4015a0 f22359c = new C4015a0();

    /* renamed from: e */
    public byte[] f22361e = new byte[1024];

    public C5990u(String str, C4033j0 c4033j0) {
        this.f22357a = str;
        this.f22358b = c4033j0;
    }

    /* renamed from: a */
    public final InterfaceC5559b0 m24064a(long j10) {
        InterfaceC5559b0 mo3032e = this.f22360d.mo3032e(0, 3);
        mo3032e.mo4852b(new C4463m1.b().m17474g0("text/vtt").m17465X(this.f22357a).m17478k0(j10).m17448G());
        this.f22360d.mo3034n();
        return mo3032e;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f22360d = interfaceC5573m;
        interfaceC5573m.mo3033j(new InterfaceC5586z.b(-9223372036854775807L));
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public final void m24065d() {
        C4015a0 c4015a0 = new C4015a0(this.f22361e);
        C3534i.m13170e(c4015a0);
        long j10 = 0;
        long j11 = 0;
        for (String m15243r = c4015a0.m15243r(); !TextUtils.isEmpty(m15243r); m15243r = c4015a0.m15243r()) {
            if (m15243r.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f22355g.matcher(m15243r);
                if (!matcher.find()) {
                    throw C4499t2.m17594a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + m15243r, null);
                }
                Matcher matcher2 = f22356h.matcher(m15243r);
                if (!matcher2.find()) {
                    throw C4499t2.m17594a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + m15243r, null);
                }
                j11 = C3534i.m13169d((String) C4014a.m15199e(matcher.group(1)));
                j10 = C4033j0.m15359f(Long.parseLong((String) C4014a.m15199e(matcher2.group(1))));
            }
        }
        Matcher m13166a = C3534i.m13166a(c4015a0);
        if (m13166a == null) {
            m24064a(0L);
            return;
        }
        long m13169d = C3534i.m13169d((String) C4014a.m15199e(m13166a.group(1)));
        long m15363b = this.f22358b.m15363b(C4033j0.m15361j((j10 + m13169d) - j11));
        InterfaceC5559b0 m24064a = m24064a(m15363b - m13169d);
        this.f22359c.m15221R(this.f22361e, this.f22362f);
        m24064a.m22408e(this.f22359c, this.f22362f);
        m24064a.mo4851a(m15363b, 1, this.f22362f, 0, null);
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        C4014a.m15199e(this.f22360d);
        int mo3029b = (int) interfaceC5572l.mo3029b();
        int i10 = this.f22362f;
        byte[] bArr = this.f22361e;
        if (i10 == bArr.length) {
            this.f22361e = Arrays.copyOf(bArr, ((mo3029b != -1 ? mo3029b : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f22361e;
        int i11 = this.f22362f;
        int mo14769c = interfaceC5572l.mo14769c(bArr2, i11, bArr2.length - i11);
        if (mo14769c != -1) {
            int i12 = this.f22362f + mo14769c;
            this.f22362f = i12;
            if (mo3029b == -1 || i12 != mo3029b) {
                return 0;
            }
        }
        m24065d();
        return -1;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        interfaceC5572l.mo22424e(this.f22361e, 0, 6, false);
        this.f22359c.m15221R(this.f22361e, 6);
        if (C3534i.m13167b(this.f22359c)) {
            return true;
        }
        interfaceC5572l.mo22424e(this.f22361e, 6, 3, false);
        this.f22359c.m15221R(this.f22361e, 9);
        return C3534i.m13167b(this.f22359c);
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }
}
