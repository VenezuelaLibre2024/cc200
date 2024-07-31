package p228pc;

import java.util.List;
import nc.C3789c0;

/* renamed from: pc.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4110b implements InterfaceC4113e {
    @Override // p228pc.InterfaceC4113e
    /* renamed from: b */
    public C3789c0 mo15870b() {
        return new C3789c0(m15877k(), m15878l());
    }

    @Override // p228pc.InterfaceC4113e
    /* renamed from: c */
    public boolean mo15871c() {
        return Boolean.TRUE.equals(mo15879a("noResult"));
    }

    @Override // p228pc.InterfaceC4113e
    /* renamed from: d */
    public Integer mo15872d() {
        return (Integer) mo15879a("transactionId");
    }

    @Override // p228pc.InterfaceC4113e
    /* renamed from: e */
    public boolean mo15873e() {
        return mo15881g("transactionId") && mo15872d() == null;
    }

    @Override // p228pc.InterfaceC4113e
    /* renamed from: h */
    public Boolean mo15874h() {
        return m15875i("inTransaction");
    }

    /* renamed from: i */
    public final Boolean m15875i(String str) {
        Object mo15879a = mo15879a(str);
        if (mo15879a instanceof Boolean) {
            return (Boolean) mo15879a;
        }
        return null;
    }

    /* renamed from: j */
    public boolean m15876j() {
        return Boolean.TRUE.equals(mo15879a("continueOnError"));
    }

    /* renamed from: k */
    public final String m15877k() {
        return (String) mo15879a("sql");
    }

    /* renamed from: l */
    public final List<Object> m15878l() {
        return (List) mo15879a("arguments");
    }

    public String toString() {
        return "" + mo15880f() + " " + m15877k() + " " + m15878l();
    }
}
