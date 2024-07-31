package p181m5;

import java.util.ArrayList;
import java.util.Collections;
import p047d5.AbstractC1552g;
import p047d5.C1547b;
import p047d5.C1555j;
import p047d5.InterfaceC1553h;
import p222p5.C4015a0;
import p222p5.C4041n0;

/* renamed from: m5.a */
/* loaded from: classes.dex */
public final class C3526a extends AbstractC1552g {

    /* renamed from: o */
    public final C4015a0 f12361o;

    public C3526a() {
        super("Mp4WebvttDecoder");
        this.f12361o = new C4015a0();
    }

    /* renamed from: B */
    public static C1547b m13083B(C4015a0 c4015a0, int i10) {
        CharSequence charSequence = null;
        C1547b.b bVar = null;
        while (i10 > 0) {
            if (i10 < 8) {
                throw new C1555j("Incomplete vtt cue box header found.");
            }
            int m15241p = c4015a0.m15241p();
            int m15241p2 = c4015a0.m15241p();
            int i11 = m15241p - 8;
            String m15401E = C4041n0.m15401E(c4015a0.m15230e(), c4015a0.m15231f(), i11);
            c4015a0.m15224U(i11);
            i10 = (i10 - 8) - i11;
            if (m15241p2 == 1937011815) {
                bVar = C3531f.m13140o(m15401E);
            } else if (m15241p2 == 1885436268) {
                charSequence = C3531f.m13142q(null, m15401E.trim(), Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return bVar != null ? bVar.m6332o(charSequence).m6318a() : C3531f.m13137l(charSequence);
    }

    @Override // p047d5.AbstractC1552g
    /* renamed from: z */
    public InterfaceC1553h mo6363z(byte[] bArr, int i10, boolean z10) {
        this.f12361o.m15221R(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f12361o.m15226a() > 0) {
            if (this.f12361o.m15226a() < 8) {
                throw new C1555j("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int m15241p = this.f12361o.m15241p();
            if (this.f12361o.m15241p() == 1987343459) {
                arrayList.add(m13083B(this.f12361o, m15241p - 8));
            } else {
                this.f12361o.m15224U(m15241p - 8);
            }
        }
        return new C3527b(arrayList);
    }
}
