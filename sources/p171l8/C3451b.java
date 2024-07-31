package p171l8;

import org.json.JSONObject;
import p066e8.InterfaceC1756w;
import p171l8.C3453d;

/* renamed from: l8.b */
/* loaded from: classes.dex */
public class C3451b implements InterfaceC3457h {
    /* renamed from: b */
    public static C3453d m12837b(InterfaceC1756w interfaceC1756w) {
        return new C3453d(interfaceC1756w.mo6865a() + 3600000, new C3453d.b(8, 4), new C3453d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // p171l8.InterfaceC3457h
    /* renamed from: a */
    public C3453d mo12838a(InterfaceC1756w interfaceC1756w, JSONObject jSONObject) {
        return m12837b(interfaceC1756w);
    }
}
