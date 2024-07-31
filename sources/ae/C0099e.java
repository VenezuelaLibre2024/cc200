package ae;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p115hd.C2501m;
import p343xd.C5767k;
import td.C4747g;
import td.C4753m;

/* renamed from: ae.e */
/* loaded from: classes2.dex */
public final class C0099e implements Serializable {

    /* renamed from: i */
    public static final a f346i = new a(null);

    /* renamed from: h */
    public final Pattern f347h;

    /* renamed from: ae.e$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0099e(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            td.C4753m.m18653f(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            td.C4753m.m18652e(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.C0099e.<init>(java.lang.String):void");
    }

    public C0099e(Pattern pattern) {
        C4753m.m18653f(pattern, "nativePattern");
        this.f347h = pattern;
    }

    /* renamed from: a */
    public final boolean m410a(CharSequence charSequence) {
        C4753m.m18653f(charSequence, "input");
        return this.f347h.matcher(charSequence).matches();
    }

    /* renamed from: b */
    public final String m411b(CharSequence charSequence, String str) {
        C4753m.m18653f(charSequence, "input");
        C4753m.m18653f(str, "replacement");
        String replaceAll = this.f347h.matcher(charSequence).replaceAll(str);
        C4753m.m18652e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /* renamed from: c */
    public final List<String> m412c(CharSequence charSequence, int i10) {
        C4753m.m18653f(charSequence, "input");
        C0109o.m458Y(i10);
        Matcher matcher = this.f347h.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            return C2501m.m9986b(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? C5767k.m22906c(i10, 10) : 10);
        int i11 = 0;
        int i12 = i10 - 1;
        do {
            arrayList.add(charSequence.subSequence(i11, matcher.start()).toString());
            i11 = matcher.end();
            if (i12 >= 0 && arrayList.size() == i12) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f347h.toString();
        C4753m.m18652e(pattern, "nativePattern.toString()");
        return pattern;
    }
}
