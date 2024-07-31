package p032c5;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p077f4.C1835p;
import p222p5.C4014a;
import p222p5.C4037l0;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p276t4.C4691c;
import p276t4.InterfaceC4689a;

/* renamed from: c5.a */
/* loaded from: classes.dex */
public class C0613a implements InterfaceC4689a<C0613a> {

    /* renamed from: a */
    public final int f2676a;

    /* renamed from: b */
    public final int f2677b;

    /* renamed from: c */
    public final int f2678c;

    /* renamed from: d */
    public final boolean f2679d;

    /* renamed from: e */
    public final a f2680e;

    /* renamed from: f */
    public final b[] f2681f;

    /* renamed from: g */
    public final long f2682g;

    /* renamed from: h */
    public final long f2683h;

    /* renamed from: c5.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final UUID f2684a;

        /* renamed from: b */
        public final byte[] f2685b;

        /* renamed from: c */
        public final C1835p[] f2686c;

        public a(UUID uuid, byte[] bArr, C1835p[] c1835pArr) {
            this.f2684a = uuid;
            this.f2685b = bArr;
            this.f2686c = c1835pArr;
        }
    }

    /* renamed from: c5.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final int f2687a;

        /* renamed from: b */
        public final String f2688b;

        /* renamed from: c */
        public final long f2689c;

        /* renamed from: d */
        public final String f2690d;

        /* renamed from: e */
        public final int f2691e;

        /* renamed from: f */
        public final int f2692f;

        /* renamed from: g */
        public final int f2693g;

        /* renamed from: h */
        public final int f2694h;

        /* renamed from: i */
        public final String f2695i;

        /* renamed from: j */
        public final C4463m1[] f2696j;

        /* renamed from: k */
        public final int f2697k;

        /* renamed from: l */
        public final String f2698l;

        /* renamed from: m */
        public final String f2699m;

        /* renamed from: n */
        public final List<Long> f2700n;

        /* renamed from: o */
        public final long[] f2701o;

        /* renamed from: p */
        public final long f2702p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, C4463m1[] c4463m1Arr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, c4463m1Arr, list, C4041n0.m15422O0(list, 1000000L, j10), C4041n0.m15420N0(j11, 1000000L, j10));
        }

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, C4463m1[] c4463m1Arr, List<Long> list, long[] jArr, long j11) {
            this.f2698l = str;
            this.f2699m = str2;
            this.f2687a = i10;
            this.f2688b = str3;
            this.f2689c = j10;
            this.f2690d = str4;
            this.f2691e = i11;
            this.f2692f = i12;
            this.f2693g = i13;
            this.f2694h = i14;
            this.f2695i = str5;
            this.f2696j = c4463m1Arr;
            this.f2700n = list;
            this.f2701o = jArr;
            this.f2702p = j11;
            this.f2697k = list.size();
        }

        /* renamed from: a */
        public Uri m3045a(int i10, int i11) {
            C4014a.m15200f(this.f2696j != null);
            C4014a.m15200f(this.f2700n != null);
            C4014a.m15200f(i11 < this.f2700n.size());
            String num = Integer.toString(this.f2696j[i10].f16502o);
            String l10 = this.f2700n.get(i11).toString();
            return C4037l0.m15388e(this.f2698l, this.f2699m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        }

        /* renamed from: b */
        public b m3046b(C4463m1[] c4463m1Arr) {
            return new b(this.f2698l, this.f2699m, this.f2687a, this.f2688b, this.f2689c, this.f2690d, this.f2691e, this.f2692f, this.f2693g, this.f2694h, this.f2695i, c4463m1Arr, this.f2700n, this.f2701o, this.f2702p);
        }

        /* renamed from: c */
        public long m3047c(int i10) {
            if (i10 == this.f2697k - 1) {
                return this.f2702p;
            }
            long[] jArr = this.f2701o;
            return jArr[i10 + 1] - jArr[i10];
        }

        /* renamed from: d */
        public int m3048d(long j10) {
            return C4041n0.m15461i(this.f2701o, j10, true, true);
        }

        /* renamed from: e */
        public long m3049e(int i10) {
            return this.f2701o[i10];
        }
    }

    public C0613a(int i10, int i11, long j10, long j11, int i12, boolean z10, a aVar, b[] bVarArr) {
        this.f2676a = i10;
        this.f2677b = i11;
        this.f2682g = j10;
        this.f2683h = j11;
        this.f2678c = i12;
        this.f2679d = z10;
        this.f2680e = aVar;
        this.f2681f = bVarArr;
    }

    public C0613a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, a aVar, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : C4041n0.m15420N0(j11, 1000000L, j10), j12 != 0 ? C4041n0.m15420N0(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, aVar, bVarArr);
    }

    @Override // p276t4.InterfaceC4689a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0613a mo247a(List<C4691c> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            C4691c c4691c = (C4691c) arrayList.get(i10);
            b bVar2 = this.f2681f[c4691c.f17523i];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.m3046b((C4463m1[]) arrayList3.toArray(new C4463m1[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f2696j[c4691c.f17524j]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.m3046b((C4463m1[]) arrayList3.toArray(new C4463m1[0])));
        }
        return new C0613a(this.f2676a, this.f2677b, this.f2682g, this.f2683h, this.f2678c, this.f2679d, this.f2680e, (b[]) arrayList2.toArray(new b[0]));
    }
}
