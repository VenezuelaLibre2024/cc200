package p124i5;

import android.text.Layout;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p047d5.AbstractC1552g;
import p047d5.C1547b;
import p047d5.InterfaceC1553h;
import p109h7.C2422e;
import p124i5.C2599c;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: i5.a */
/* loaded from: classes.dex */
public final class C2597a extends AbstractC1552g {

    /* renamed from: t */
    public static final Pattern f10195t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o */
    public final boolean f10196o;

    /* renamed from: p */
    public final C2598b f10197p;

    /* renamed from: q */
    public Map<String, C2599c> f10198q;

    /* renamed from: r */
    public float f10199r;

    /* renamed from: s */
    public float f10200s;

    public C2597a(List<byte[]> list) {
        super("SsaDecoder");
        this.f10199r = -3.4028235E38f;
        this.f10200s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f10196o = false;
            this.f10197p = null;
            return;
        }
        this.f10196o = true;
        String m15399D = C4041n0.m15399D(list.get(0));
        C4014a.m15195a(m15399D.startsWith("Format:"));
        this.f10197p = (C2598b) C4014a.m15199e(C2598b.m10394a(m15399D));
        m10392H(new C4015a0(list.get(1)), C2422e.f9747c);
    }

    /* renamed from: B */
    public static int m10381B(long j10, List<Long> list, List<List<C1547b>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (list.get(size).longValue() == j10) {
                return size;
            }
            if (list.get(size).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    /* renamed from: C */
    public static float m10382C(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p047d5.C1547b m10383D(java.lang.String r8, p124i5.C2599c r9, p124i5.C2599c.b r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p124i5.C2597a.m10383D(java.lang.String, i5.c, i5.c$b, float, float):d5.b");
    }

    /* renamed from: J */
    public static Map<String, C2599c> m10384J(C4015a0 c4015a0, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2599c.a aVar = null;
        while (true) {
            String m15244s = c4015a0.m15244s(charset);
            if (m15244s == null || (c4015a0.m15226a() != 0 && c4015a0.m15233h(charset) == '[')) {
                break;
            }
            if (m15244s.startsWith("Format:")) {
                aVar = C2599c.a.m10404a(m15244s);
            } else if (m15244s.startsWith("Style:")) {
                if (aVar == null) {
                    C4046r.m15529i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + m15244s);
                } else {
                    C2599c m10396b = C2599c.m10396b(m15244s, aVar);
                    if (m10396b != null) {
                        linkedHashMap.put(m10396b.f10206a, m10396b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: K */
    public static long m10385K(String str) {
        Matcher matcher = f10195t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) C4041n0.m15463j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) C4041n0.m15463j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) C4041n0.m15463j(matcher.group(3))) * 1000000) + (Long.parseLong((String) C4041n0.m15463j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    /* renamed from: L */
    public static int m10386L(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                C4046r.m15529i("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    /* renamed from: M */
    public static int m10387M(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                C4046r.m15529i("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    /* renamed from: N */
    public static Layout.Alignment m10388N(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                C4046r.m15529i("SsaDecoder", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    /* renamed from: E */
    public final Charset m10389E(C4015a0 c4015a0) {
        Charset m15218O = c4015a0.m15218O();
        return m15218O != null ? m15218O : C2422e.f9747c;
    }

    /* renamed from: F */
    public final void m10390F(String str, C2598b c2598b, List<List<C1547b>> list, List<Long> list2) {
        int i10;
        StringBuilder sb2;
        C4014a.m15195a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", c2598b.f10205e);
        if (split.length != c2598b.f10205e) {
            sb2 = new StringBuilder();
            sb2.append("Skipping dialogue line with fewer columns than format: ");
        } else {
            long m10385K = m10385K(split[c2598b.f10201a]);
            if (m10385K == -9223372036854775807L) {
                sb2 = new StringBuilder();
            } else {
                long m10385K2 = m10385K(split[c2598b.f10202b]);
                if (m10385K2 != -9223372036854775807L) {
                    Map<String, C2599c> map = this.f10198q;
                    C2599c c2599c = (map == null || (i10 = c2598b.f10203c) == -1) ? null : map.get(split[i10].trim());
                    String str2 = split[c2598b.f10204d];
                    C1547b m10383D = m10383D(C2599c.b.m10408d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), c2599c, C2599c.b.m10406b(str2), this.f10199r, this.f10200s);
                    int m10381B = m10381B(m10385K2, list2, list);
                    for (int m10381B2 = m10381B(m10385K, list2, list); m10381B2 < m10381B; m10381B2++) {
                        list.get(m10381B2).add(m10383D);
                    }
                    return;
                }
                sb2 = new StringBuilder();
            }
            sb2.append("Skipping invalid timing: ");
        }
        sb2.append(str);
        C4046r.m15529i("SsaDecoder", sb2.toString());
    }

    /* renamed from: G */
    public final void m10391G(C4015a0 c4015a0, List<List<C1547b>> list, List<Long> list2, Charset charset) {
        C2598b c2598b = this.f10196o ? this.f10197p : null;
        while (true) {
            String m15244s = c4015a0.m15244s(charset);
            if (m15244s == null) {
                return;
            }
            if (m15244s.startsWith("Format:")) {
                c2598b = C2598b.m10394a(m15244s);
            } else if (m15244s.startsWith("Dialogue:")) {
                if (c2598b == null) {
                    C4046r.m15529i("SsaDecoder", "Skipping dialogue line before complete format: " + m15244s);
                } else {
                    m10390F(m15244s, c2598b, list, list2);
                }
            }
        }
    }

    /* renamed from: H */
    public final void m10392H(C4015a0 c4015a0, Charset charset) {
        while (true) {
            String m15244s = c4015a0.m15244s(charset);
            if (m15244s == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(m15244s)) {
                m10393I(c4015a0, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(m15244s)) {
                this.f10198q = m10384J(c4015a0, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(m15244s)) {
                C4046r.m15526f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(m15244s)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0006  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10393I(p222p5.C4015a0 r5, java.nio.charset.Charset r6) {
        /*
            r4 = this;
        L0:
            java.lang.String r0 = r5.m15244s(r6)
            if (r0 == 0) goto L59
            int r1 = r5.m15226a()
            if (r1 == 0) goto L14
            char r1 = r5.m15233h(r6)
            r2 = 91
            if (r1 == r2) goto L59
        L14:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L1f
            goto L0
        L1f:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = p109h7.C2420c.m9665e(r1)
            r1.hashCode()
            java.lang.String r2 = "playresx"
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 != 0) goto L4c
            java.lang.String r2 = "playresy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f10200s = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L4c:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f10199r = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124i5.C2597a.m10393I(p5.a0, java.nio.charset.Charset):void");
    }

    @Override // p047d5.AbstractC1552g
    /* renamed from: z */
    public InterfaceC1553h mo6363z(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C4015a0 c4015a0 = new C4015a0(bArr, i10);
        Charset m10389E = m10389E(c4015a0);
        if (!this.f10196o) {
            m10392H(c4015a0, m10389E);
        }
        m10391G(c4015a0, arrayList, arrayList2, m10389E);
        return new C2600d(arrayList, arrayList2);
    }
}
