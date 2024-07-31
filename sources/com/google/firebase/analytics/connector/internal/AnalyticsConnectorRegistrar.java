package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p142j9.C3270h;
import p195n7.C3767g;
import p224p7.C4060b;
import p224p7.InterfaceC4059a;
import p294u8.InterfaceC4993d;
import p353y7.C5867c;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C5867c<?>> getComponents() {
        return Arrays.asList(C5867c.m23454c(InterfaceC4059a.class).m23473b(C5885q.m23551j(C3767g.class)).m23473b(C5885q.m23551j(Context.class)).m23473b(C5885q.m23551j(InterfaceC4993d.class)).m23477f(new InterfaceC5875g() { // from class: q7.b
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                InterfaceC4059a m15616d;
                m15616d = C4060b.m15616d((C3767g) interfaceC5869d.get(C3767g.class), (Context) interfaceC5869d.get(Context.class), (InterfaceC4993d) interfaceC5869d.get(InterfaceC4993d.class));
                return m15616d;
            }
        }).m23476e().m23475d(), C3270h.m11823b("fire-analytics", "21.5.1"));
    }
}
