package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p142j9.C3270h;
import p142j9.InterfaceC3271i;
import p195n7.C3767g;
import p309v8.InterfaceC5150j;
import p322w8.C5443o;
import p322w8.C5444p;
import p322w8.C5445q;
import p338x8.InterfaceC5739a;
import p353y7.C5867c;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p369z8.InterfaceC6084h;

@Keep
/* loaded from: classes.dex */
public final class Registrar implements ComponentRegistrar {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    /* loaded from: classes.dex */
    public static class C1275a implements InterfaceC5739a {

        /* renamed from: a */
        public final FirebaseInstanceId f4833a;

        public C1275a(FirebaseInstanceId firebaseInstanceId) {
            this.f4833a = firebaseInstanceId;
        }

        @Override // p338x8.InterfaceC5739a
        /* renamed from: a */
        public String mo5367a() {
            return this.f4833a.m5354n();
        }

        @Override // p338x8.InterfaceC5739a
        /* renamed from: b */
        public void mo5368b(String str, String str2) {
            this.f4833a.m5347f(str, str2);
        }

        @Override // p338x8.InterfaceC5739a
        /* renamed from: c */
        public void mo5369c(InterfaceC5739a.a aVar) {
            this.f4833a.m5344a(aVar);
        }

        @Override // p338x8.InterfaceC5739a
        /* renamed from: d */
        public Task<String> mo5370d() {
            String m5354n = this.f4833a.m5354n();
            return m5354n != null ? Tasks.forResult(m5354n) : this.f4833a.m5351j().continueWith(C5445q.f20296a);
        }
    }

    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(InterfaceC5869d interfaceC5869d) {
        return new FirebaseInstanceId((C3767g) interfaceC5869d.get(C3767g.class), interfaceC5869d.mo23494c(InterfaceC3271i.class), interfaceC5869d.mo23494c(InterfaceC5150j.class), (InterfaceC6084h) interfaceC5869d.get(InterfaceC6084h.class));
    }

    public static final /* synthetic */ InterfaceC5739a lambda$getComponents$1$Registrar(InterfaceC5869d interfaceC5869d) {
        return new C1275a((FirebaseInstanceId) interfaceC5869d.get(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C5867c<?>> getComponents() {
        return Arrays.asList(C5867c.m23454c(FirebaseInstanceId.class).m23473b(C5885q.m23551j(C3767g.class)).m23473b(C5885q.m23550i(InterfaceC3271i.class)).m23473b(C5885q.m23550i(InterfaceC5150j.class)).m23473b(C5885q.m23551j(InterfaceC6084h.class)).m23477f(C5443o.f20294a).m23474c().m23475d(), C5867c.m23454c(InterfaceC5739a.class).m23473b(C5885q.m23551j(FirebaseInstanceId.class)).m23477f(C5444p.f20295a).m23475d(), C3270h.m11823b("fire-iid", "21.1.0"));
    }
}
