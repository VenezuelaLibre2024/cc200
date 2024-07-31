package ba;

import com.google.android.gms.maps.model.CameraPosition;
import java.util.Set;
import p012aa.InterfaceC0080a;
import p012aa.InterfaceC0081b;

/* renamed from: ba.f */
/* loaded from: classes.dex */
public class C0529f<T extends InterfaceC0081b> extends AbstractC0524a<T> implements InterfaceC0528e<T> {

    /* renamed from: b */
    public InterfaceC0525b<T> f2362b;

    public C0529f(InterfaceC0525b<T> interfaceC0525b) {
        this.f2362b = interfaceC0525b;
    }

    @Override // ba.InterfaceC0528e
    /* renamed from: a */
    public void mo2561a(CameraPosition cameraPosition) {
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: b */
    public Set<? extends InterfaceC0080a<T>> mo2546b(float f10) {
        return this.f2362b.mo2546b(f10);
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: c */
    public void mo2547c() {
        this.f2362b.mo2547c();
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: d */
    public boolean mo2548d(T t10) {
        return this.f2362b.mo2548d(t10);
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: g */
    public int mo2549g() {
        return this.f2362b.mo2549g();
    }

    @Override // ba.InterfaceC0528e
    /* renamed from: h */
    public boolean mo2562h() {
        return false;
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: i */
    public boolean mo2550i(T t10) {
        return this.f2362b.mo2550i(t10);
    }
}
