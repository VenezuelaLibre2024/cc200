package p318w4;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p206o5.C3901e0;
import p206o5.C3915l0;
import p206o5.C3918n;
import p206o5.InterfaceC3910j;
import p222p5.C4014a;
import p264s3.C4463m1;
import p290u4.C4870n;

/* renamed from: w4.f */
/* loaded from: classes.dex */
public abstract class AbstractC5266f implements C3901e0.e {

    /* renamed from: a */
    public final long f19966a = C4870n.m19398a();

    /* renamed from: b */
    public final C3918n f19967b;

    /* renamed from: c */
    public final int f19968c;

    /* renamed from: d */
    public final C4463m1 f19969d;

    /* renamed from: e */
    public final int f19970e;

    /* renamed from: f */
    public final Object f19971f;

    /* renamed from: g */
    public final long f19972g;

    /* renamed from: h */
    public final long f19973h;

    /* renamed from: i */
    public final C3915l0 f19974i;

    public AbstractC5266f(InterfaceC3910j interfaceC3910j, C3918n c3918n, int i10, C4463m1 c4463m1, int i11, Object obj, long j10, long j11) {
        this.f19974i = new C3915l0(interfaceC3910j);
        this.f19967b = (C3918n) C4014a.m15199e(c3918n);
        this.f19968c = i10;
        this.f19969d = c4463m1;
        this.f19970e = i11;
        this.f19971f = obj;
        this.f19972g = j10;
        this.f19973h = j11;
    }

    /* renamed from: a */
    public final long m21318a() {
        return this.f19974i.m14843q();
    }

    /* renamed from: d */
    public final long m21319d() {
        return this.f19973h - this.f19972g;
    }

    /* renamed from: e */
    public final Map<String, List<String>> m21320e() {
        return this.f19974i.m14845s();
    }

    /* renamed from: f */
    public final Uri m21321f() {
        return this.f19974i.m14844r();
    }
}
