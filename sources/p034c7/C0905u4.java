package p034c7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p108h6.C2394s;

/* renamed from: c7.u4 */
/* loaded from: classes.dex */
public final class C0905u4 {

    /* renamed from: b */
    public static final AtomicReference<String[]> f3611b = new AtomicReference<>();

    /* renamed from: c */
    public static final AtomicReference<String[]> f3612c = new AtomicReference<>();

    /* renamed from: d */
    public static final AtomicReference<String[]> f3613d = new AtomicReference<>();

    /* renamed from: a */
    public final InterfaceC0891t4 f3614a;

    public C0905u4(InterfaceC0891t4 interfaceC0891t4) {
        this.f3614a = interfaceC0891t4;
    }

    /* renamed from: d */
    public static String m3854d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C2394s.m9619l(strArr);
        C2394s.m9619l(strArr2);
        C2394s.m9619l(atomicReference);
        C2394s.m9608a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i10] == null) {
                        strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                    }
                    str2 = strArr3[i10];
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final String m3855a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f3614a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(m3859f(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? m3858e(new Object[]{obj}) : obj instanceof Object[] ? m3858e((Object[]) obj) : obj instanceof ArrayList ? m3858e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* renamed from: b */
    public final String m3856b(C0705g0 c0705g0) {
        if (c0705g0 == null) {
            return null;
        }
        if (!this.f3614a.zza()) {
            return c0705g0.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(c0705g0.f2945j);
        sb2.append(",name=");
        sb2.append(m3857c(c0705g0.f2943h));
        sb2.append(",params=");
        C0618a0 c0618a0 = c0705g0.f2944i;
        sb2.append(c0618a0 != null ? !this.f3614a.zza() ? c0618a0.toString() : m3855a(c0618a0.m3079L()) : null);
        return sb2.toString();
    }

    /* renamed from: c */
    public final String m3857c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f3614a.zza() ? str : m3854d(str, C0824o7.f3399c, C0824o7.f3397a, f3611b);
    }

    /* renamed from: e */
    public final String m3858e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String m3855a = obj instanceof Bundle ? m3855a((Bundle) obj) : String.valueOf(obj);
            if (m3855a != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(m3855a);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: f */
    public final String m3859f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f3614a.zza() ? str : m3854d(str, C0852q7.f3468b, C0852q7.f3467a, f3612c);
    }

    /* renamed from: g */
    public final String m3860g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f3614a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m3854d(str, C0838p7.f3441b, C0838p7.f3440a, f3613d);
        }
        return "experiment_id(" + str + ")";
    }
}
