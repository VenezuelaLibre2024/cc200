package p290u4;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p206o5.C3918n;

/* renamed from: u4.n */
/* loaded from: classes.dex */
public final class C4870n {

    /* renamed from: h */
    public static final AtomicLong f18399h = new AtomicLong();

    /* renamed from: a */
    public final long f18400a;

    /* renamed from: b */
    public final C3918n f18401b;

    /* renamed from: c */
    public final Uri f18402c;

    /* renamed from: d */
    public final Map<String, List<String>> f18403d;

    /* renamed from: e */
    public final long f18404e;

    /* renamed from: f */
    public final long f18405f;

    /* renamed from: g */
    public final long f18406g;

    public C4870n(long j10, C3918n c3918n, long j11) {
        this(j10, c3918n, c3918n.f14071a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public C4870n(long j10, C3918n c3918n, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f18400a = j10;
        this.f18401b = c3918n;
        this.f18402c = uri;
        this.f18403d = map;
        this.f18404e = j11;
        this.f18405f = j12;
        this.f18406g = j13;
    }

    /* renamed from: a */
    public static long m19398a() {
        return f18399h.getAndIncrement();
    }
}
