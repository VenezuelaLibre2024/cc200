package p153k5;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p047d5.C1547b;
import p047d5.InterfaceC1553h;
import p222p5.C4041n0;

/* renamed from: k5.h */
/* loaded from: classes.dex */
public final class C3362h implements InterfaceC1553h {

    /* renamed from: h */
    public final C3358d f11738h;

    /* renamed from: i */
    public final long[] f11739i;

    /* renamed from: j */
    public final Map<String, C3361g> f11740j;

    /* renamed from: k */
    public final Map<String, C3359e> f11741k;

    /* renamed from: l */
    public final Map<String, String> f11742l;

    public C3362h(C3358d c3358d, Map<String, C3361g> map, Map<String, C3359e> map2, Map<String, String> map3) {
        this.f11738h = c3358d;
        this.f11741k = map2;
        this.f11742l = map3;
        this.f11740j = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f11739i = c3358d.m12457j();
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: b */
    public int mo6350b(long j10) {
        int m15453e = C4041n0.m15453e(this.f11739i, j10, false, false);
        if (m15453e < this.f11739i.length) {
            return m15453e;
        }
        return -1;
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: c */
    public long mo6351c(int i10) {
        return this.f11739i[i10];
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: f */
    public List<C1547b> mo6352f(long j10) {
        return this.f11738h.m12455h(j10, this.f11740j, this.f11741k, this.f11742l);
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: h */
    public int mo6353h() {
        return this.f11739i.length;
    }
}
