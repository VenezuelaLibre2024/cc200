package p290u4;

import android.os.Bundle;
import java.util.ArrayList;
import p126i7.AbstractC2651u;
import p222p5.C4018c;
import p222p5.C4041n0;
import p222p5.C4046r;
import p264s3.InterfaceC4436h;

/* renamed from: u4.u0 */
/* loaded from: classes.dex */
public final class C4885u0 implements InterfaceC4436h {

    /* renamed from: k */
    public static final C4885u0 f18475k = new C4885u0(new C4881s0[0]);

    /* renamed from: l */
    public static final String f18476l = C4041n0.m15478q0(0);

    /* renamed from: m */
    public static final InterfaceC4436h.a<C4885u0> f18477m = new InterfaceC4436h.a() { // from class: u4.t0
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            C4885u0 m19451d;
            m19451d = C4885u0.m19451d(bundle);
            return m19451d;
        }
    };

    /* renamed from: h */
    public final int f18478h;

    /* renamed from: i */
    public final AbstractC2651u<C4881s0> f18479i;

    /* renamed from: j */
    public int f18480j;

    public C4885u0(C4881s0... c4881s0Arr) {
        this.f18479i = AbstractC2651u.m10769q(c4881s0Arr);
        this.f18478h = c4881s0Arr.length;
        m19454e();
    }

    /* renamed from: d */
    public static /* synthetic */ C4885u0 m19451d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f18476l);
        return parcelableArrayList == null ? new C4885u0(new C4881s0[0]) : new C4885u0((C4881s0[]) C4018c.m15267b(C4881s0.f18464o, parcelableArrayList).toArray(new C4881s0[0]));
    }

    /* renamed from: b */
    public C4881s0 m19452b(int i10) {
        return this.f18479i.get(i10);
    }

    /* renamed from: c */
    public int m19453c(C4881s0 c4881s0) {
        int indexOf = this.f18479i.indexOf(c4881s0);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: e */
    public final void m19454e() {
        int i10 = 0;
        while (i10 < this.f18479i.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f18479i.size(); i12++) {
                if (this.f18479i.get(i10).equals(this.f18479i.get(i12))) {
                    C4046r.m15524d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4885u0.class != obj.getClass()) {
            return false;
        }
        C4885u0 c4885u0 = (C4885u0) obj;
        return this.f18478h == c4885u0.f18478h && this.f18479i.equals(c4885u0.f18479i);
    }

    public int hashCode() {
        if (this.f18480j == 0) {
            this.f18480j = this.f18479i.hashCode();
        }
        return this.f18480j;
    }
}
