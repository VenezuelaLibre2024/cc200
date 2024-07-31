package p320w6;

import java.util.Comparator;
import p108h6.C2394s;

/* renamed from: w6.j0 */
/* loaded from: classes.dex */
public final class C5307j0 implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C5292c c5292c = (C5292c) obj;
        C5292c c5292c2 = (C5292c) obj2;
        C2394s.m9619l(c5292c);
        C2394s.m9619l(c5292c2);
        int m21364I = c5292c.m21364I();
        int m21364I2 = c5292c2.m21364I();
        if (m21364I != m21364I2) {
            return m21364I >= m21364I2 ? 1 : -1;
        }
        int m21365J = c5292c.m21365J();
        int m21365J2 = c5292c2.m21365J();
        if (m21365J == m21365J2) {
            return 0;
        }
        return m21365J < m21365J2 ? -1 : 1;
    }
}
