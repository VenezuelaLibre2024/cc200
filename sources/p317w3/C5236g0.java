package p317w3;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p126i7.AbstractC2653v;
import p206o5.C3893a0;
import p206o5.C3918n;
import p206o5.InterfaceC3910j;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4441i;
import p317w3.InterfaceC5226b0;

/* renamed from: w3.g0 */
/* loaded from: classes.dex */
public final class C5236g0 implements InterfaceC5240i0 {

    /* renamed from: a */
    public final InterfaceC3910j.a f19846a;

    /* renamed from: b */
    public final String f19847b;

    /* renamed from: c */
    public final boolean f19848c;

    /* renamed from: d */
    public final Map<String, String> f19849d;

    public C5236g0(String str, boolean z10, InterfaceC3910j.a aVar) {
        C4014a.m15195a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f19846a = aVar;
        this.f19847b = str;
        this.f19848c = z10;
        this.f19849d = new HashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:11|12|13|(2:15|16)(2:17|18)) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r1 = m21200d(r11, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r8 = r8 + 1;
        r9 = r9.m14853a().m14867j(r1).m14858a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        p222p5.C4041n0.m15471n(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        throw r8;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m21199c(p206o5.InterfaceC3910j.a r8, java.lang.String r9, byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            o5.l0 r0 = new o5.l0
            o5.j r8 = r8.mo14830a()
            r0.<init>(r8)
            o5.n$b r8 = new o5.n$b
            r8.<init>()
            o5.n$b r8 = r8.m14867j(r9)
            o5.n$b r8 = r8.m14862e(r11)
            r9 = 2
            o5.n$b r8 = r8.m14861d(r9)
            o5.n$b r8 = r8.m14860c(r10)
            r9 = 1
            o5.n$b r8 = r8.m14859b(r9)
            o5.n r2 = r8.m14858a()
            r8 = 0
            r9 = r2
        L2a:
            o5.l r10 = new o5.l     // Catch: java.lang.Exception -> L57
            r10.<init>(r0, r9)     // Catch: java.lang.Exception -> L57
            byte[] r8 = p222p5.C4041n0.m15434U0(r10)     // Catch: java.lang.Throwable -> L37 p206o5.C3893a0 -> L39
            p222p5.C4041n0.m15471n(r10)     // Catch: java.lang.Exception -> L57
            return r8
        L37:
            r8 = move-exception
            goto L53
        L39:
            r11 = move-exception
            java.lang.String r1 = m21200d(r11, r8)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L52
            int r8 = r8 + 1
            o5.n$b r9 = r9.m14853a()     // Catch: java.lang.Throwable -> L37
            o5.n$b r9 = r9.m14867j(r1)     // Catch: java.lang.Throwable -> L37
            o5.n r9 = r9.m14858a()     // Catch: java.lang.Throwable -> L37
            p222p5.C4041n0.m15471n(r10)     // Catch: java.lang.Exception -> L57
            goto L2a
        L52:
            throw r11     // Catch: java.lang.Throwable -> L37
        L53:
            p222p5.C4041n0.m15471n(r10)     // Catch: java.lang.Exception -> L57
            throw r8     // Catch: java.lang.Exception -> L57
        L57:
            r8 = move-exception
            r7 = r8
            w3.j0 r8 = new w3.j0
            android.net.Uri r9 = r0.m14844r()
            java.lang.Object r9 = p222p5.C4014a.m15199e(r9)
            r3 = r9
            android.net.Uri r3 = (android.net.Uri) r3
            java.util.Map r4 = r0.mo14829j()
            long r5 = r0.m14843q()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p317w3.C5236g0.m21199c(o5.j$a, java.lang.String, byte[], java.util.Map):byte[]");
    }

    /* renamed from: d */
    public static String m21200d(C3893a0 c3893a0, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = c3893a0.f13968k;
        if (!((i11 == 307 || i11 == 308) && i10 < 5) || (map = c3893a0.f13970m) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // p317w3.InterfaceC5240i0
    /* renamed from: a */
    public byte[] mo21201a(UUID uuid, InterfaceC5226b0.d dVar) {
        return m21199c(this.f19846a, dVar.m21144b() + "&signedRequest=" + C4041n0.m15399D(dVar.m21143a()), null, Collections.emptyMap());
    }

    @Override // p317w3.InterfaceC5240i0
    /* renamed from: b */
    public byte[] mo21202b(UUID uuid, InterfaceC5226b0.a aVar) {
        String m21140b = aVar.m21140b();
        if (this.f19848c || TextUtils.isEmpty(m21140b)) {
            m21140b = this.f19847b;
        }
        if (TextUtils.isEmpty(m21140b)) {
            throw new C5242j0(new C3918n.b().m14866i(Uri.EMPTY).m14858a(), Uri.EMPTY, AbstractC2653v.m10800j(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = C4441i.f16301e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : C4441i.f16299c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f19849d) {
            hashMap.putAll(this.f19849d);
        }
        return m21199c(this.f19846a, m21140b, aVar.m21139a(), hashMap);
    }

    /* renamed from: e */
    public void m21203e(String str, String str2) {
        C4014a.m15199e(str);
        C4014a.m15199e(str2);
        synchronized (this.f19849d) {
            this.f19849d.put(str, str2);
        }
    }
}
