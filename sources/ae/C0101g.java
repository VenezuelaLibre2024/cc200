package ae;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p115hd.C2502n;
import p115hd.C2503o;
import p115hd.C2510v;
import sd.InterfaceC4580l;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: ae.g */
/* loaded from: classes2.dex */
public class C0101g extends C0100f {

    /* renamed from: ae.g$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4580l<String, String> {

        /* renamed from: h */
        public static final a f348h = new a();

        public a() {
            super(1);
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a */
        public final String invoke(String str) {
            C4753m.m18653f(str, Constants.LINE);
            return str;
        }
    }

    /* renamed from: ae.g$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC4754n implements InterfaceC4580l<String, String> {

        /* renamed from: h */
        public final /* synthetic */ String f349h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f349h = str;
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a */
        public final String invoke(String str) {
            C4753m.m18653f(str, Constants.LINE);
            return this.f349h + str;
        }
    }

    /* renamed from: b */
    public static final InterfaceC4580l<String, String> m414b(String str) {
        return str.length() == 0 ? a.f348h : new b(str);
    }

    /* renamed from: c */
    public static final int m415c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!C0095a.m402c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    /* renamed from: d */
    public static final String m416d(String str, String str2) {
        Appendable m10022u;
        String invoke;
        C4753m.m18653f(str, "<this>");
        C4753m.m18653f(str2, "newIndent");
        List<String> m446M = C0109o.m446M(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m446M) {
            if (!C0108n.m428n((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C2503o.m9995k(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m415c((String) it.next())));
        }
        Integer num = (Integer) C2510v.m10027z(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * m446M.size());
        InterfaceC4580l<String, String> m414b = m414b(str2);
        int m9990f = C2502n.m9990f(m446M);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : m446M) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C2502n.m9994j();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == m9990f) && C0108n.m428n(str3)) {
                str3 = null;
            } else {
                String m490u0 = C0111q.m490u0(str3, intValue);
                if (m490u0 != null && (invoke = m414b.invoke(m490u0)) != null) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        m10022u = C2510v.m10022u(arrayList3, new StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb2 = ((StringBuilder) m10022u).toString();
        C4753m.m18652e(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    /* renamed from: e */
    public static final String m417e(String str) {
        C4753m.m18653f(str, "<this>");
        return m416d(str, "");
    }
}
