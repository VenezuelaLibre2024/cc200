package p138j5;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p047d5.AbstractC1552g;
import p047d5.C1547b;
import p047d5.InterfaceC1553h;
import p109h7.C2422e;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4046r;
import p222p5.C4047s;

/* renamed from: j5.a */
/* loaded from: classes.dex */
public final class C3246a extends AbstractC1552g {

    /* renamed from: q */
    public static final Pattern f11342q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r */
    public static final Pattern f11343r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o */
    public final StringBuilder f11344o;

    /* renamed from: p */
    public final ArrayList<String> f11345p;

    public C3246a() {
        super("SubripDecoder");
        this.f11344o = new StringBuilder();
        this.f11345p = new ArrayList<>();
    }

    /* renamed from: D */
    public static float m11746D(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: E */
    public static long m11747E(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) C4014a.m15199e(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) C4014a.m15199e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: B */
    public final C1547b m11748B(Spanned spanned, String str) {
        char c10;
        char c11;
        C1547b.b m6332o = new C1547b.b().m6332o(spanned);
        if (str == null) {
            return m6332o.m6318a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1 || c10 == 2) {
            m6332o.m6329l(0);
        } else if (c10 == 3 || c10 == 4 || c10 == 5) {
            m6332o.m6329l(2);
        } else {
            m6332o.m6329l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0 || c11 == 1 || c11 == 2) {
            m6332o.m6326i(2);
        } else if (c11 == 3 || c11 == 4 || c11 == 5) {
            m6332o.m6326i(0);
        } else {
            m6332o.m6326i(1);
        }
        return m6332o.m6328k(m11746D(m6332o.m6321d())).m6325h(m11746D(m6332o.m6320c()), 0).m6318a();
    }

    /* renamed from: C */
    public final Charset m11749C(C4015a0 c4015a0) {
        Charset m15218O = c4015a0.m15218O();
        return m15218O != null ? m15218O : C2422e.f9747c;
    }

    /* renamed from: F */
    public final String m11750F(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f11343r.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // p047d5.AbstractC1552g
    /* renamed from: z */
    public InterfaceC1553h mo6363z(byte[] bArr, int i10, boolean z10) {
        StringBuilder sb2;
        String str;
        ArrayList arrayList = new ArrayList();
        C4047s c4047s = new C4047s();
        C4015a0 c4015a0 = new C4015a0(bArr, i10);
        Charset m11749C = m11749C(c4015a0);
        while (true) {
            String m15244s = c4015a0.m15244s(m11749C);
            int i11 = 0;
            if (m15244s == null) {
                break;
            }
            if (m15244s.length() != 0) {
                try {
                    Integer.parseInt(m15244s);
                    m15244s = c4015a0.m15244s(m11749C);
                } catch (NumberFormatException unused) {
                    sb2 = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
                if (m15244s == null) {
                    C4046r.m15529i("SubripDecoder", "Unexpected end");
                    break;
                }
                Matcher matcher = f11342q.matcher(m15244s);
                if (matcher.matches()) {
                    c4047s.m15535a(m11747E(matcher, 1));
                    c4047s.m15535a(m11747E(matcher, 6));
                    this.f11344o.setLength(0);
                    this.f11345p.clear();
                    while (true) {
                        String m15244s2 = c4015a0.m15244s(m11749C);
                        if (TextUtils.isEmpty(m15244s2)) {
                            break;
                        }
                        if (this.f11344o.length() > 0) {
                            this.f11344o.append("<br>");
                        }
                        this.f11344o.append(m11750F(m15244s2, this.f11345p));
                    }
                    Spanned fromHtml = Html.fromHtml(this.f11344o.toString());
                    String str2 = null;
                    while (true) {
                        if (i11 >= this.f11345p.size()) {
                            break;
                        }
                        String str3 = this.f11345p.get(i11);
                        if (str3.matches("\\{\\\\an[1-9]\\}")) {
                            str2 = str3;
                            break;
                        }
                        i11++;
                    }
                    arrayList.add(m11748B(fromHtml, str2));
                    arrayList.add(C1547b.f5779y);
                } else {
                    sb2 = new StringBuilder();
                    str = "Skipping invalid timing: ";
                    sb2.append(str);
                    sb2.append(m15244s);
                    C4046r.m15529i("SubripDecoder", sb2.toString());
                }
            }
        }
        return new C3247b((C1547b[]) arrayList.toArray(new C1547b[0]), c4047s.m15538d());
    }
}
