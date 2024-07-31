package p337x7;

import p321w7.AbstractC5417w;

/* renamed from: x7.f */
/* loaded from: classes.dex */
public final class C5673f extends AbstractC5417w {

    /* renamed from: a */
    public String f21152a;

    /* renamed from: b */
    public String f21153b;

    /* renamed from: c */
    public boolean f21154c = false;

    /* renamed from: d */
    public boolean f21155d = false;

    @Override // p321w7.AbstractC5417w
    /* renamed from: a */
    public final void mo21559a(boolean z10) {
        this.f21155d = z10;
    }

    @Override // p321w7.AbstractC5417w
    /* renamed from: b */
    public final void mo21560b(boolean z10) {
        this.f21154c = z10;
    }

    @Override // p321w7.AbstractC5417w
    /* renamed from: c */
    public final void mo21561c(String str, String str2) {
        this.f21152a = str;
        this.f21153b = str2;
    }

    /* renamed from: d */
    public final String m22749d() {
        return this.f21152a;
    }

    /* renamed from: e */
    public final String m22750e() {
        return this.f21153b;
    }

    /* renamed from: f */
    public final boolean m22751f() {
        return this.f21155d;
    }

    /* renamed from: g */
    public final boolean m22752g() {
        return (this.f21152a == null || this.f21153b == null) ? false : true;
    }

    /* renamed from: h */
    public final boolean m22753h() {
        return this.f21154c;
    }
}
