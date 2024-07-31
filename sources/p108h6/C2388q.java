package p108h6;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: h6.q */
/* loaded from: classes.dex */
public final class C2388q {

    /* renamed from: h6.q$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final List f9683a;

        /* renamed from: b */
        public final Object f9684b;

        public /* synthetic */ a(Object obj, C2351d1 c2351d1) {
            C2394s.m9619l(obj);
            this.f9684b = obj;
            this.f9683a = new ArrayList();
        }

        /* renamed from: a */
        public a m9595a(String str, Object obj) {
            C2394s.m9619l(str);
            this.f9683a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f9684b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f9683a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f9683a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static boolean m9591a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!m9592b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m9592b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: c */
    public static int m9593c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: d */
    public static a m9594d(Object obj) {
        return new a(obj, null);
    }
}
