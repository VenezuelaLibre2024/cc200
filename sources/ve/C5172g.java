package ve;

import java.util.List;
import p299ue.C5015c;
import p299ue.C5023k;
import re.C4349b0;
import re.C4353d0;
import re.InterfaceC4354e;
import re.InterfaceC4375w;

/* renamed from: ve.g */
/* loaded from: classes2.dex */
public final class C5172g implements InterfaceC4375w.a {

    /* renamed from: a */
    public final List<InterfaceC4375w> f19508a;

    /* renamed from: b */
    public final C5023k f19509b;

    /* renamed from: c */
    public final C5015c f19510c;

    /* renamed from: d */
    public final int f19511d;

    /* renamed from: e */
    public final C4349b0 f19512e;

    /* renamed from: f */
    public final InterfaceC4354e f19513f;

    /* renamed from: g */
    public final int f19514g;

    /* renamed from: h */
    public final int f19515h;

    /* renamed from: i */
    public final int f19516i;

    /* renamed from: j */
    public int f19517j;

    public C5172g(List<InterfaceC4375w> list, C5023k c5023k, C5015c c5015c, int i10, C4349b0 c4349b0, InterfaceC4354e interfaceC4354e, int i11, int i12, int i13) {
        this.f19508a = list;
        this.f19509b = c5023k;
        this.f19510c = c5015c;
        this.f19511d = i10;
        this.f19512e = c4349b0;
        this.f19513f = interfaceC4354e;
        this.f19514g = i11;
        this.f19515h = i12;
        this.f19516i = i13;
    }

    @Override // re.InterfaceC4375w.a
    /* renamed from: a */
    public int mo16890a() {
        return this.f19515h;
    }

    @Override // re.InterfaceC4375w.a
    /* renamed from: b */
    public int mo16891b() {
        return this.f19516i;
    }

    @Override // re.InterfaceC4375w.a
    /* renamed from: c */
    public C4353d0 mo16892c(C4349b0 c4349b0) {
        return m20948g(c4349b0, this.f19509b, this.f19510c);
    }

    @Override // re.InterfaceC4375w.a
    /* renamed from: d */
    public int mo16893d() {
        return this.f19514g;
    }

    @Override // re.InterfaceC4375w.a
    /* renamed from: e */
    public C4349b0 mo16894e() {
        return this.f19512e;
    }

    /* renamed from: f */
    public C5015c m20947f() {
        C5015c c5015c = this.f19510c;
        if (c5015c != null) {
            return c5015c;
        }
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public C4353d0 m20948g(C4349b0 c4349b0, C5023k c5023k, C5015c c5015c) {
        if (this.f19511d >= this.f19508a.size()) {
            throw new AssertionError();
        }
        this.f19517j++;
        C5015c c5015c2 = this.f19510c;
        if (c5015c2 != null && !c5015c2.m19653c().m19697u(c4349b0.m16666h())) {
            throw new IllegalStateException("network interceptor " + this.f19508a.get(this.f19511d - 1) + " must retain the same host and port");
        }
        if (this.f19510c != null && this.f19517j > 1) {
            throw new IllegalStateException("network interceptor " + this.f19508a.get(this.f19511d - 1) + " must call proceed() exactly once");
        }
        C5172g c5172g = new C5172g(this.f19508a, c5023k, c5015c, this.f19511d + 1, c4349b0, this.f19513f, this.f19514g, this.f19515h, this.f19516i);
        InterfaceC4375w interfaceC4375w = this.f19508a.get(this.f19511d);
        C4353d0 mo16889a = interfaceC4375w.mo16889a(c5172g);
        if (c5015c != null && this.f19511d + 1 < this.f19508a.size() && c5172g.f19517j != 1) {
            throw new IllegalStateException("network interceptor " + interfaceC4375w + " must call proceed() exactly once");
        }
        if (mo16889a == null) {
            throw new NullPointerException("interceptor " + interfaceC4375w + " returned null");
        }
        if (mo16889a.m16703a() != null) {
            return mo16889a;
        }
        throw new IllegalStateException("interceptor " + interfaceC4375w + " returned a response with no body");
    }

    /* renamed from: h */
    public C5023k m20949h() {
        return this.f19509b;
    }
}
