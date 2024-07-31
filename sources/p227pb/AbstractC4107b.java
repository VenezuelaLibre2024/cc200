package p227pb;

import java.nio.FloatBuffer;
import p212ob.AbstractC3982f;
import p212ob.C3979c;

/* renamed from: pb.b */
/* loaded from: classes.dex */
public abstract class AbstractC4107b extends AbstractC3982f {

    /* renamed from: d */
    public final float[] f14820d = (float[]) C3979c.f14357a.clone();

    /* renamed from: e */
    public int f14821e;

    /* renamed from: a */
    public abstract void mo15863a();

    /* renamed from: b */
    public abstract int mo15861b();

    /* renamed from: c */
    public final float[] m15864c() {
        return this.f14820d;
    }

    /* renamed from: d */
    public abstract FloatBuffer mo15865d();

    /* renamed from: e */
    public final int m15866e() {
        return this.f14821e;
    }

    /* renamed from: f */
    public int m15867f() {
        return mo15865d().limit() / mo15861b();
    }

    /* renamed from: g */
    public int m15868g() {
        return mo15861b() * 4;
    }
}
