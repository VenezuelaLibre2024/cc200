package p294u8;

import p353y7.C5870d0;

/* renamed from: u8.a */
/* loaded from: classes.dex */
public class C4990a<T> {

    /* renamed from: a */
    public final Class<T> f18676a;

    /* renamed from: b */
    public final T f18677b;

    public C4990a(Class<T> cls, T t10) {
        this.f18676a = (Class) C5870d0.m23501b(cls);
        this.f18677b = (T) C5870d0.m23501b(t10);
    }

    /* renamed from: a */
    public T m19561a() {
        return this.f18677b;
    }

    /* renamed from: b */
    public Class<T> m19562b() {
        return this.f18676a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f18676a, this.f18677b);
    }
}
