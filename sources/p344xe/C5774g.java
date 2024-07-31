package p344xe;

import bf.C0575u;
import bf.InterfaceC0573s;
import bf.InterfaceC0574t;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p299ue.C5017e;
import re.C4349b0;
import re.C4353d0;
import re.C4373u;
import re.C4377y;
import re.EnumC4378z;
import re.InterfaceC4375w;
import se.AbstractC4592a;
import se.C4596e;
import ve.C5170e;
import ve.C5174i;
import ve.C5176k;
import ve.InterfaceC5168c;

/* renamed from: xe.g */
/* loaded from: classes2.dex */
public final class C5774g implements InterfaceC5168c {

    /* renamed from: g */
    public static final List<String> f21469g = C4596e.m18112t("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List<String> f21470h = C4596e.m18112t("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final InterfaceC4375w.a f21471a;

    /* renamed from: b */
    public final C5017e f21472b;

    /* renamed from: c */
    public final C5773f f21473c;

    /* renamed from: d */
    public volatile C5776i f21474d;

    /* renamed from: e */
    public final EnumC4378z f21475e;

    /* renamed from: f */
    public volatile boolean f21476f;

    public C5774g(C4377y c4377y, C5017e c5017e, InterfaceC4375w.a aVar, C5773f c5773f) {
        this.f21472b = c5017e;
        this.f21471a = aVar;
        this.f21473c = c5773f;
        List<EnumC4378z> m16919w = c4377y.m16919w();
        EnumC4378z enumC4378z = EnumC4378z.H2_PRIOR_KNOWLEDGE;
        this.f21475e = m16919w.contains(enumC4378z) ? enumC4378z : EnumC4378z.HTTP_2;
    }

    /* renamed from: i */
    public static List<C5770c> m22995i(C4349b0 c4349b0) {
        C4373u m16662d = c4349b0.m16662d();
        ArrayList arrayList = new ArrayList(m16662d.m16831h() + 4);
        arrayList.add(new C5770c(C5770c.f21368f, c4349b0.m16664f()));
        arrayList.add(new C5770c(C5770c.f21369g, C5174i.m20952c(c4349b0.m16666h())));
        String m16661c = c4349b0.m16661c("Host");
        if (m16661c != null) {
            arrayList.add(new C5770c(C5770c.f21371i, m16661c));
        }
        arrayList.add(new C5770c(C5770c.f21370h, c4349b0.m16666h().m16853B()));
        int m16831h = m16662d.m16831h();
        for (int i10 = 0; i10 < m16831h; i10++) {
            String lowerCase = m16662d.m16829e(i10).toLowerCase(Locale.US);
            if (!f21469g.contains(lowerCase) || (lowerCase.equals("te") && m16662d.m16832i(i10).equals("trailers"))) {
                arrayList.add(new C5770c(lowerCase, m16662d.m16832i(i10)));
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static C4353d0.a m22996j(C4373u c4373u, EnumC4378z enumC4378z) {
        C4373u.a aVar = new C4373u.a();
        int m16831h = c4373u.m16831h();
        C5176k c5176k = null;
        for (int i10 = 0; i10 < m16831h; i10++) {
            String m16829e = c4373u.m16829e(i10);
            String m16832i = c4373u.m16832i(i10);
            if (m16829e.equals(":status")) {
                c5176k = C5176k.m20958a("HTTP/1.1 " + m16832i);
            } else if (!f21470h.contains(m16829e)) {
                AbstractC4592a.f17225a.mo16924b(aVar, m16829e, m16832i);
            }
        }
        if (c5176k != null) {
            return new C4353d0.a().m16725o(enumC4378z).m16717g(c5176k.f19523b).m16722l(c5176k.f19524c).m16720j(aVar.m16837d());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: a */
    public void mo20923a() {
        this.f21474d.m23020h().close();
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: b */
    public InterfaceC0574t mo20924b(C4353d0 c4353d0) {
        return this.f21474d.m23021i();
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: c */
    public void mo20925c(C4349b0 c4349b0) {
        if (this.f21474d != null) {
            return;
        }
        this.f21474d = this.f21473c.m22968g0(m22995i(c4349b0), c4349b0.m16659a() != null);
        if (this.f21476f) {
            this.f21474d.m23018f(EnumC5769b.CANCEL);
            throw new IOException("Canceled");
        }
        C0575u m23024l = this.f21474d.m23024l();
        long mo16890a = this.f21471a.mo16890a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m23024l.mo2884g(mo16890a, timeUnit);
        this.f21474d.m23030r().mo2884g(this.f21471a.mo16891b(), timeUnit);
    }

    @Override // ve.InterfaceC5168c
    public void cancel() {
        this.f21476f = true;
        if (this.f21474d != null) {
            this.f21474d.m23018f(EnumC5769b.CANCEL);
        }
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: d */
    public C4353d0.a mo20926d(boolean z10) {
        C4353d0.a m22996j = m22996j(this.f21474d.m23028p(), this.f21475e);
        if (z10 && AbstractC4592a.f17225a.mo16926d(m22996j) == 100) {
            return null;
        }
        return m22996j;
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: e */
    public InterfaceC0573s mo20927e(C4349b0 c4349b0, long j10) {
        return this.f21474d.m23020h();
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: f */
    public C5017e mo20928f() {
        return this.f21472b;
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: g */
    public void mo20929g() {
        this.f21473c.flush();
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: h */
    public long mo20930h(C4353d0 c4353d0) {
        return C5170e.m20935b(c4353d0);
    }
}
