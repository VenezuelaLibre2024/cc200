package p317w3;

import android.net.Uri;
import java.util.Map;
import p126i7.AbstractC2617d1;
import p155k7.C3368e;
import p206o5.C3924s;
import p206o5.InterfaceC3910j;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4503u1;
import p317w3.C5237h;

/* renamed from: w3.l */
/* loaded from: classes.dex */
public final class C5245l implements InterfaceC5258x {

    /* renamed from: a */
    public final Object f19900a = new Object();

    /* renamed from: b */
    public C4503u1.f f19901b;

    /* renamed from: c */
    public InterfaceC5256v f19902c;

    /* renamed from: d */
    public InterfaceC3910j.a f19903d;

    /* renamed from: e */
    public String f19904e;

    @Override // p317w3.InterfaceC5258x
    /* renamed from: a */
    public InterfaceC5256v mo21251a(C4503u1 c4503u1) {
        InterfaceC5256v interfaceC5256v;
        C4014a.m15199e(c4503u1.f16712i);
        C4503u1.f fVar = c4503u1.f16712i.f16788c;
        if (fVar == null || C4041n0.f14513a < 18) {
            return InterfaceC5256v.f19934a;
        }
        synchronized (this.f19900a) {
            if (!C4041n0.m15449c(fVar, this.f19901b)) {
                this.f19901b = fVar;
                this.f19902c = m21252b(fVar);
            }
            interfaceC5256v = (InterfaceC5256v) C4014a.m15199e(this.f19902c);
        }
        return interfaceC5256v;
    }

    /* renamed from: b */
    public final InterfaceC5256v m21252b(C4503u1.f fVar) {
        InterfaceC3910j.a aVar = this.f19903d;
        if (aVar == null) {
            aVar = new C3924s.b().m14904e(this.f19904e);
        }
        Uri uri = fVar.f16752c;
        C5236g0 c5236g0 = new C5236g0(uri == null ? null : uri.toString(), fVar.f16757h, aVar);
        AbstractC2617d1<Map.Entry<String, String>> it = fVar.f16754e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            c5236g0.m21203e(next.getKey(), next.getValue());
        }
        C5237h m21238a = new C5237h.b().m21242e(fVar.f16750a, C5234f0.f19809d).m21239b(fVar.f16755f).m21240c(fVar.f16756g).m21241d(C3368e.m12533l(fVar.f16759j)).m21238a(c5236g0);
        m21238a.m21225F(0, fVar.m17624c());
        return m21238a;
    }
}
