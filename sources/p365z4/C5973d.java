package p365z4;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p062e4.C1655f;
import p077f4.C1826g;
import p106h4.C2301b;
import p106h4.C2307e;
import p106h4.C2313h;
import p106h4.C2314h0;
import p106h4.C2317j;
import p152k4.C3348a;
import p155k7.C3368e;
import p222p5.C4014a;
import p222p5.C4033j0;
import p222p5.C4034k;
import p222p5.C4050v;
import p264s3.C4463m1;
import p275t3.C4674s1;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;

/* renamed from: z4.d */
/* loaded from: classes.dex */
public final class C5973d implements InterfaceC5977h {

    /* renamed from: d */
    public static final int[] f22183d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b */
    public final int f22184b;

    /* renamed from: c */
    public final boolean f22185c;

    public C5973d() {
        this(0, true);
    }

    public C5973d(int i10, boolean z10) {
        this.f22184b = i10;
        this.f22185c = z10;
    }

    /* renamed from: b */
    public static void m23930b(int i10, List<Integer> list) {
        if (C3368e.m12529h(f22183d, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    /* renamed from: e */
    public static C1826g m23931e(C4033j0 c4033j0, C4463m1 c4463m1, List<C4463m1> list) {
        int i10 = m23933g(c4463m1) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C1826g(i10, c4033j0, null, list);
    }

    /* renamed from: f */
    public static C2314h0 m23932f(int i10, boolean z10, C4463m1 c4463m1, List<C4463m1> list, C4033j0 c4033j0) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else {
            list = z10 ? Collections.singletonList(new C4463m1.b().m17474g0("application/cea-608").m17448G()) : Collections.emptyList();
        }
        String str = c4463m1.f16503p;
        if (!TextUtils.isEmpty(str)) {
            if (!C4050v.m15545b(str, "audio/mp4a-latm")) {
                i11 |= 2;
            }
            if (!C4050v.m15545b(str, "video/avc")) {
                i11 |= 4;
            }
        }
        return new C2314h0(2, c4033j0, new C2317j(i11, list));
    }

    /* renamed from: g */
    public static boolean m23933g(C4463m1 c4463m1) {
        C3348a c3348a = c4463m1.f16504q;
        if (c3348a == null) {
            return false;
        }
        for (int i10 = 0; i10 < c3348a.m12414f(); i10++) {
            if (c3348a.m12413e(i10) instanceof C5987r) {
                return !((C5987r) r2).f22347j.isEmpty();
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m23934h(InterfaceC5571k interfaceC5571k, InterfaceC5572l interfaceC5572l) {
        try {
            boolean mo170h = interfaceC5571k.mo170h(interfaceC5572l);
            interfaceC5572l.mo22427l();
            return mo170h;
        } catch (EOFException unused) {
            interfaceC5572l.mo22427l();
            return false;
        } catch (Throwable th) {
            interfaceC5572l.mo22427l();
            throw th;
        }
    }

    @Override // p365z4.InterfaceC5977h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C5971b mo23935a(Uri uri, C4463m1 c4463m1, List<C4463m1> list, C4033j0 c4033j0, Map<String, List<String>> map, InterfaceC5572l interfaceC5572l, C4674s1 c4674s1) {
        int m15369a = C4034k.m15369a(c4463m1.f16506s);
        int m15370b = C4034k.m15370b(map);
        int m15371c = C4034k.m15371c(uri);
        int[] iArr = f22183d;
        ArrayList arrayList = new ArrayList(iArr.length);
        m23930b(m15369a, arrayList);
        m23930b(m15370b, arrayList);
        m23930b(m15371c, arrayList);
        for (int i10 : iArr) {
            m23930b(i10, arrayList);
        }
        InterfaceC5571k interfaceC5571k = null;
        interfaceC5572l.mo22427l();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            InterfaceC5571k interfaceC5571k2 = (InterfaceC5571k) C4014a.m15199e(m23937d(intValue, c4463m1, list, c4033j0));
            if (m23934h(interfaceC5571k2, interfaceC5572l)) {
                return new C5971b(interfaceC5571k2, c4463m1, c4033j0);
            }
            if (interfaceC5571k == null && (intValue == m15369a || intValue == m15370b || intValue == m15371c || intValue == 11)) {
                interfaceC5571k = interfaceC5571k2;
            }
        }
        return new C5971b((InterfaceC5571k) C4014a.m15199e(interfaceC5571k), c4463m1, c4033j0);
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: d */
    public final InterfaceC5571k m23937d(int i10, C4463m1 c4463m1, List<C4463m1> list, C4033j0 c4033j0) {
        if (i10 == 0) {
            return new C2301b();
        }
        if (i10 == 1) {
            return new C2307e();
        }
        if (i10 == 2) {
            return new C2313h();
        }
        if (i10 == 7) {
            return new C1655f(0, 0L);
        }
        if (i10 == 8) {
            return m23931e(c4033j0, c4463m1, list);
        }
        if (i10 == 11) {
            return m23932f(this.f22184b, this.f22185c, c4463m1, list, c4033j0);
        }
        if (i10 != 13) {
            return null;
        }
        return new C5990u(c4463m1.f16497j, c4033j0);
    }
}
