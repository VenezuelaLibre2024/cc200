package p350y4;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p222p5.C4041n0;
import p276t4.C4691c;
import p276t4.InterfaceC4689a;

/* renamed from: y4.c */
/* loaded from: classes.dex */
public class C5802c implements InterfaceC4689a<C5802c> {

    /* renamed from: a */
    public final long f21759a;

    /* renamed from: b */
    public final long f21760b;

    /* renamed from: c */
    public final long f21761c;

    /* renamed from: d */
    public final boolean f21762d;

    /* renamed from: e */
    public final long f21763e;

    /* renamed from: f */
    public final long f21764f;

    /* renamed from: g */
    public final long f21765g;

    /* renamed from: h */
    public final long f21766h;

    /* renamed from: i */
    public final C5814o f21767i;

    /* renamed from: j */
    public final C5811l f21768j;

    /* renamed from: k */
    public final Uri f21769k;

    /* renamed from: l */
    public final C5807h f21770l;

    /* renamed from: m */
    public final List<C5806g> f21771m;

    public C5802c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, C5807h c5807h, C5814o c5814o, C5811l c5811l, Uri uri, List<C5806g> list) {
        this.f21759a = j10;
        this.f21760b = j11;
        this.f21761c = j12;
        this.f21762d = z10;
        this.f21763e = j13;
        this.f21764f = j14;
        this.f21765g = j15;
        this.f21766h = j16;
        this.f21770l = c5807h;
        this.f21767i = c5814o;
        this.f21769k = uri;
        this.f21768j = c5811l;
        this.f21771m = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: c */
    public static ArrayList<C5800a> m23277c(List<C5800a> list, LinkedList<C4691c> linkedList) {
        C4691c poll = linkedList.poll();
        int i10 = poll.f17522h;
        ArrayList<C5800a> arrayList = new ArrayList<>();
        do {
            int i11 = poll.f17523i;
            C5800a c5800a = list.get(i11);
            List<AbstractC5809j> list2 = c5800a.f21751c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f17524j));
                poll = linkedList.poll();
                if (poll.f17522h != i10) {
                    break;
                }
            } while (poll.f17523i == i11);
            arrayList.add(new C5800a(c5800a.f21749a, c5800a.f21750b, arrayList2, c5800a.f21752d, c5800a.f21753e, c5800a.f21754f));
        } while (poll.f17522h == i10);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // p276t4.InterfaceC4689a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5802c mo247a(List<C4691c> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C4691c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= m23280e()) {
                break;
            }
            if (((C4691c) linkedList.peek()).f17522h != i10) {
                long m23281f = m23281f(i10);
                if (m23281f != -9223372036854775807L) {
                    j10 += m23281f;
                }
            } else {
                C5806g m23279d = m23279d(i10);
                arrayList.add(new C5806g(m23279d.f21794a, m23279d.f21795b - j10, m23277c(m23279d.f21796c, linkedList), m23279d.f21797d));
            }
            i10++;
        }
        long j11 = this.f21760b;
        return new C5802c(this.f21759a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f21761c, this.f21762d, this.f21763e, this.f21764f, this.f21765g, this.f21766h, this.f21770l, this.f21767i, this.f21768j, this.f21769k, arrayList);
    }

    /* renamed from: d */
    public final C5806g m23279d(int i10) {
        return this.f21771m.get(i10);
    }

    /* renamed from: e */
    public final int m23280e() {
        return this.f21771m.size();
    }

    /* renamed from: f */
    public final long m23281f(int i10) {
        if (i10 != this.f21771m.size() - 1) {
            return this.f21771m.get(i10 + 1).f21795b - this.f21771m.get(i10).f21795b;
        }
        long j10 = this.f21760b;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - this.f21771m.get(i10).f21795b;
    }

    /* renamed from: g */
    public final long m23282g(int i10) {
        return C4041n0.m15396B0(m23281f(i10));
    }
}
