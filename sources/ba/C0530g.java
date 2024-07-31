package ba;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.LinkedHashSet;
import p012aa.InterfaceC0080a;
import p012aa.InterfaceC0081b;

/* renamed from: ba.g */
/* loaded from: classes.dex */
public class C0530g<T extends InterfaceC0081b> implements InterfaceC0080a<T> {

    /* renamed from: a */
    public final LatLng f2363a;

    /* renamed from: b */
    public final Collection<T> f2364b = new LinkedHashSet();

    public C0530g(LatLng latLng) {
        this.f2363a = latLng;
    }

    /* renamed from: a */
    public boolean m2563a(T t10) {
        return this.f2364b.add(t10);
    }

    @Override // p012aa.InterfaceC0080a
    /* renamed from: b */
    public Collection<T> mo336b() {
        return this.f2364b;
    }

    @Override // p012aa.InterfaceC0080a
    /* renamed from: c */
    public int mo337c() {
        return this.f2364b.size();
    }

    /* renamed from: d */
    public boolean m2564d(T t10) {
        return this.f2364b.remove(t10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0530g)) {
            return false;
        }
        C0530g c0530g = (C0530g) obj;
        return c0530g.f2363a.equals(this.f2363a) && c0530g.f2364b.equals(this.f2364b);
    }

    @Override // p012aa.InterfaceC0080a
    public LatLng getPosition() {
        return this.f2363a;
    }

    public int hashCode() {
        return this.f2363a.hashCode() + this.f2364b.hashCode();
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.f2363a + ", mItems.size=" + this.f2364b.size() + '}';
    }
}
