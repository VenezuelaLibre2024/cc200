package sb;

import android.view.Surface;
import p212ob.C3978b;
import td.C4753m;

/* renamed from: sb.b */
/* loaded from: classes.dex */
public class C4564b extends AbstractC4563a {

    /* renamed from: g */
    public Surface f17204g;

    /* renamed from: h */
    public boolean f17205h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4564b(C3978b c3978b, Surface surface, boolean z10) {
        super(c3978b, c3978b.m15101a(surface));
        C4753m.m18654g(c3978b, "eglCore");
        C4753m.m18654g(surface, "surface");
        this.f17204g = surface;
        this.f17205h = z10;
    }

    @Override // sb.AbstractC4563a
    /* renamed from: d */
    public void mo18058d() {
        super.mo18058d();
        if (this.f17205h) {
            Surface surface = this.f17204g;
            if (surface != null) {
                surface.release();
            }
            this.f17204g = null;
        }
    }

    /* renamed from: f */
    public final boolean m18060f() {
        return m18055a().m15106f(m18056b());
    }
}
