package p333x3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p152k4.C3348a;
import p221p4.C4004e;
import p221p4.C4009j;
import p222p5.C4041n0;

/* renamed from: x3.v */
/* loaded from: classes.dex */
public final class C5582v {

    /* renamed from: c */
    public static final Pattern f20954c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f20955a = -1;

    /* renamed from: b */
    public int f20956b = -1;

    /* renamed from: a */
    public boolean m22498a() {
        return (this.f20955a == -1 || this.f20956b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean m22499b(String str) {
        Matcher matcher = f20954c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) C4041n0.m15463j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) C4041n0.m15463j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f20955a = parseInt;
            this.f20956b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean m22500c(C3348a c3348a) {
        for (int i10 = 0; i10 < c3348a.m12414f(); i10++) {
            C3348a.b m12413e = c3348a.m12413e(i10);
            if (m12413e instanceof C4004e) {
                C4004e c4004e = (C4004e) m12413e;
                if ("iTunSMPB".equals(c4004e.f14416j) && m22499b(c4004e.f14417k)) {
                    return true;
                }
            } else if (m12413e instanceof C4009j) {
                C4009j c4009j = (C4009j) m12413e;
                if ("com.apple.iTunes".equals(c4009j.f14429i) && "iTunSMPB".equals(c4009j.f14430j) && m22499b(c4009j.f14431k)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m22501d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f20955a = i11;
        this.f20956b = i12;
        return true;
    }
}
