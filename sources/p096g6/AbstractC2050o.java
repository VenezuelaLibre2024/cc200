package p096g6;

import com.google.android.gms.tasks.TaskCompletionSource;
import p064e6.C1671d;
import p079f6.C1841a;
import p079f6.C1841a.b;
import p096g6.C2034j;

/* renamed from: g6.o */
/* loaded from: classes.dex */
public abstract class AbstractC2050o<A extends C1841a.b, L> {

    /* renamed from: a */
    public final C2034j f8106a;

    /* renamed from: b */
    public final C1671d[] f8107b;

    /* renamed from: c */
    public final boolean f8108c;

    /* renamed from: d */
    public final int f8109d;

    public AbstractC2050o(C2034j<L> c2034j, C1671d[] c1671dArr, boolean z10, int i10) {
        this.f8106a = c2034j;
        this.f8107b = c1671dArr;
        this.f8108c = z10;
        this.f8109d = i10;
    }

    /* renamed from: a */
    public void m8224a() {
        this.f8106a.m8159a();
    }

    /* renamed from: b */
    public C2034j.a<L> m8225b() {
        return this.f8106a.m8160b();
    }

    /* renamed from: c */
    public C1671d[] m8226c() {
        return this.f8107b;
    }

    /* renamed from: d */
    public abstract void mo8100d(A a10, TaskCompletionSource<Void> taskCompletionSource);

    /* renamed from: e */
    public final int m8227e() {
        return this.f8109d;
    }

    /* renamed from: f */
    public final boolean m8228f() {
        return this.f8108c;
    }
}
