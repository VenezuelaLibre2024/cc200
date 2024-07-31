package p093g3;

import android.annotation.SuppressLint;
import p045d3.EnumC1533e;
import p045d3.InterfaceC1536h;
import p151k3.C3347a;

/* renamed from: g3.l */
/* loaded from: classes.dex */
public final class C1974l {
    @SuppressLint({"DiscouragedApi"})
    /* renamed from: a */
    public static void m7994a(InterfaceC1536h<?> interfaceC1536h, EnumC1533e enumC1533e) {
        if (!(interfaceC1536h instanceof C1981s)) {
            C3347a.m12409g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", interfaceC1536h);
        } else {
            C1983u.m8006c().m8010e().m14029u(((C1981s) interfaceC1536h).m8004d().m8001f(enumC1533e), 1);
        }
    }
}
