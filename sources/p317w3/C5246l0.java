package p317w3;

import android.util.Pair;
import java.util.Map;

/* renamed from: w3.l0 */
/* loaded from: classes.dex */
public final class C5246l0 {
    /* renamed from: a */
    public static long m21253a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public static Pair<Long, Long> m21254b(InterfaceC5248n interfaceC5248n) {
        Map<String, String> mo21123f = interfaceC5248n.mo21123f();
        if (mo21123f == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m21253a(mo21123f, "LicenseDurationRemaining")), Long.valueOf(m21253a(mo21123f, "PlaybackDurationRemaining")));
    }
}
