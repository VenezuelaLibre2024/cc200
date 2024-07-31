package p202o1;

import java.io.File;
import p262s1.InterfaceC4389c;

/* renamed from: o1.j */
/* loaded from: classes.dex */
public class C3837j implements InterfaceC4389c.c {

    /* renamed from: a */
    public final String f13846a;

    /* renamed from: b */
    public final File f13847b;

    /* renamed from: c */
    public final InterfaceC4389c.c f13848c;

    public C3837j(String str, File file, InterfaceC4389c.c cVar) {
        this.f13846a = str;
        this.f13847b = file;
        this.f13848c = cVar;
    }

    @Override // p262s1.InterfaceC4389c.c
    /* renamed from: a */
    public InterfaceC4389c mo2137a(InterfaceC4389c.b bVar) {
        return new C3836i(bVar.f16106a, this.f13846a, this.f13847b, bVar.f16108c.f16105a, this.f13848c.mo2137a(bVar));
    }
}
