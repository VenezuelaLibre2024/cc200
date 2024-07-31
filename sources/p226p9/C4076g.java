package p226p9;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p195n7.C3767g;
import p253r7.InterfaceC4319b;
import p253r7.InterfaceC4321d;
import p308v7.InterfaceC5140b;
import p337x7.InterfaceC5657b;
import p354y8.InterfaceC5896b;

/* renamed from: p9.g */
/* loaded from: classes.dex */
public class C4076g {

    /* renamed from: a */
    public final Map<String, C4074f> f14666a = new HashMap();

    /* renamed from: b */
    public final C3767g f14667b;

    /* renamed from: c */
    public final InterfaceC5896b<InterfaceC5657b> f14668c;

    /* renamed from: d */
    public final InterfaceC5896b<InterfaceC5140b> f14669d;

    public C4076g(C3767g c3767g, InterfaceC5896b<InterfaceC5657b> interfaceC5896b, InterfaceC5896b<InterfaceC5140b> interfaceC5896b2, @InterfaceC4319b Executor executor, @InterfaceC4321d Executor executor2) {
        this.f14667b = c3767g;
        this.f14668c = interfaceC5896b;
        this.f14669d = interfaceC5896b2;
        C4077g0.m15719d(executor, executor2);
    }

    /* renamed from: a */
    public synchronized C4074f m15717a(String str) {
        C4074f c4074f;
        c4074f = this.f14666a.get(str);
        if (c4074f == null) {
            c4074f = new C4074f(str, this.f14667b, this.f14668c, this.f14669d);
            this.f14666a.put(str, c4074f);
        }
        return c4074f;
    }
}
