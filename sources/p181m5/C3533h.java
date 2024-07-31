package p181m5;

import android.text.TextUtils;
import java.util.ArrayList;
import p047d5.AbstractC1552g;
import p047d5.C1555j;
import p047d5.InterfaceC1553h;
import p222p5.C4015a0;
import p264s3.C4499t2;

/* renamed from: m5.h */
/* loaded from: classes.dex */
public final class C3533h extends AbstractC1552g {

    /* renamed from: o */
    public final C4015a0 f12412o;

    /* renamed from: p */
    public final C3528c f12413p;

    public C3533h() {
        super("WebvttDecoder");
        this.f12412o = new C4015a0();
        this.f12413p = new C3528c();
    }

    /* renamed from: B */
    public static int m13164B(C4015a0 c4015a0) {
        int i10 = 0;
        int i11 = -1;
        while (i11 == -1) {
            i10 = c4015a0.m15231f();
            String m15243r = c4015a0.m15243r();
            i11 = m15243r == null ? 0 : "STYLE".equals(m15243r) ? 2 : m15243r.startsWith("NOTE") ? 1 : 3;
        }
        c4015a0.m15223T(i10);
        return i11;
    }

    /* renamed from: C */
    public static void m13165C(C4015a0 c4015a0) {
        do {
        } while (!TextUtils.isEmpty(c4015a0.m15243r()));
    }

    @Override // p047d5.AbstractC1552g
    /* renamed from: z */
    public InterfaceC1553h mo6363z(byte[] bArr, int i10, boolean z10) {
        C3530e m13139n;
        this.f12412o.m15221R(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            C3534i.m13170e(this.f12412o);
            do {
            } while (!TextUtils.isEmpty(this.f12412o.m15243r()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int m13164B = m13164B(this.f12412o);
                if (m13164B == 0) {
                    return new C3536k(arrayList2);
                }
                if (m13164B == 1) {
                    m13165C(this.f12412o);
                } else if (m13164B == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new C1555j("A style block was found after the first cue.");
                    }
                    this.f12412o.m15243r();
                    arrayList.addAll(this.f12413p.m13097d(this.f12412o));
                } else if (m13164B == 3 && (m13139n = C3531f.m13139n(this.f12412o, arrayList)) != null) {
                    arrayList2.add(m13139n);
                }
            }
        } catch (C4499t2 e10) {
            throw new C1555j(e10);
        }
    }
}
