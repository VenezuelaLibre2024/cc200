package p105h3;

import android.content.Context;
import java.util.Objects;
import p234q3.InterfaceC4157a;

/* renamed from: h3.c */
/* loaded from: classes.dex */
public final class C2288c extends AbstractC2293h {

    /* renamed from: a */
    public final Context f9189a;

    /* renamed from: b */
    public final InterfaceC4157a f9190b;

    /* renamed from: c */
    public final InterfaceC4157a f9191c;

    /* renamed from: d */
    public final String f9192d;

    public C2288c(Context context, InterfaceC4157a interfaceC4157a, InterfaceC4157a interfaceC4157a2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f9189a = context;
        Objects.requireNonNull(interfaceC4157a, "Null wallClock");
        this.f9190b = interfaceC4157a;
        Objects.requireNonNull(interfaceC4157a2, "Null monotonicClock");
        this.f9191c = interfaceC4157a2;
        Objects.requireNonNull(str, "Null backendName");
        this.f9192d = str;
    }

    @Override // p105h3.AbstractC2293h
    /* renamed from: b */
    public Context mo9301b() {
        return this.f9189a;
    }

    @Override // p105h3.AbstractC2293h
    /* renamed from: c */
    public String mo9302c() {
        return this.f9192d;
    }

    @Override // p105h3.AbstractC2293h
    /* renamed from: d */
    public InterfaceC4157a mo9303d() {
        return this.f9191c;
    }

    @Override // p105h3.AbstractC2293h
    /* renamed from: e */
    public InterfaceC4157a mo9304e() {
        return this.f9190b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2293h)) {
            return false;
        }
        AbstractC2293h abstractC2293h = (AbstractC2293h) obj;
        return this.f9189a.equals(abstractC2293h.mo9301b()) && this.f9190b.equals(abstractC2293h.mo9304e()) && this.f9191c.equals(abstractC2293h.mo9303d()) && this.f9192d.equals(abstractC2293h.mo9302c());
    }

    public int hashCode() {
        return ((((((this.f9189a.hashCode() ^ 1000003) * 1000003) ^ this.f9190b.hashCode()) * 1000003) ^ this.f9191c.hashCode()) * 1000003) ^ this.f9192d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f9189a + ", wallClock=" + this.f9190b + ", monotonicClock=" + this.f9191c + ", backendName=" + this.f9192d + "}";
    }
}
