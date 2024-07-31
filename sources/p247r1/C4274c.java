package p247r1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0344f;
import androidx.savedstate.C0395a;
import androidx.savedstate.Recreator;
import td.C4747g;
import td.C4753m;

/* renamed from: r1.c */
/* loaded from: classes.dex */
public final class C4274c {

    /* renamed from: d */
    public static final a f15528d = new a(null);

    /* renamed from: a */
    public final InterfaceC4275d f15529a;

    /* renamed from: b */
    public final C0395a f15530b;

    /* renamed from: c */
    public boolean f15531c;

    /* renamed from: r1.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final C4274c m16406a(InterfaceC4275d interfaceC4275d) {
            C4753m.m18653f(interfaceC4275d, "owner");
            return new C4274c(interfaceC4275d, null);
        }
    }

    public C4274c(InterfaceC4275d interfaceC4275d) {
        this.f15529a = interfaceC4275d;
        this.f15530b = new C0395a();
    }

    public /* synthetic */ C4274c(InterfaceC4275d interfaceC4275d, C4747g c4747g) {
        this(interfaceC4275d);
    }

    /* renamed from: a */
    public static final C4274c m16401a(InterfaceC4275d interfaceC4275d) {
        return f15528d.m16406a(interfaceC4275d);
    }

    /* renamed from: b */
    public final C0395a m16402b() {
        return this.f15530b;
    }

    /* renamed from: c */
    public final void m16403c() {
        AbstractC0344f lifecycle = this.f15529a.getLifecycle();
        if (!(lifecycle.mo1801b() == AbstractC0344f.b.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.mo1800a(new Recreator(this.f15529a));
        this.f15530b.m1994e(lifecycle);
        this.f15531c = true;
    }

    /* renamed from: d */
    public final void m16404d(Bundle bundle) {
        if (!this.f15531c) {
            m16403c();
        }
        AbstractC0344f lifecycle = this.f15529a.getLifecycle();
        if (!lifecycle.mo1801b().m1811c(AbstractC0344f.b.STARTED)) {
            this.f15530b.m1995f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo1801b()).toString());
    }

    /* renamed from: e */
    public final void m16405e(Bundle bundle) {
        C4753m.m18653f(bundle, "outBundle");
        this.f15530b.m1996g(bundle);
    }
}
