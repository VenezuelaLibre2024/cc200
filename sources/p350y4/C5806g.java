package p350y4;

import java.util.Collections;
import java.util.List;

/* renamed from: y4.g */
/* loaded from: classes.dex */
public class C5806g {

    /* renamed from: a */
    public final String f21794a;

    /* renamed from: b */
    public final long f21795b;

    /* renamed from: c */
    public final List<C5800a> f21796c;

    /* renamed from: d */
    public final List<C5805f> f21797d;

    /* renamed from: e */
    public final C5804e f21798e;

    public C5806g(String str, long j10, List<C5800a> list, List<C5805f> list2) {
        this(str, j10, list, list2, null);
    }

    public C5806g(String str, long j10, List<C5800a> list, List<C5805f> list2, C5804e c5804e) {
        this.f21794a = str;
        this.f21795b = j10;
        this.f21796c = Collections.unmodifiableList(list);
        this.f21797d = Collections.unmodifiableList(list2);
        this.f21798e = c5804e;
    }

    /* renamed from: a */
    public int m23358a(int i10) {
        int size = this.f21796c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f21796c.get(i11).f21750b == i10) {
                return i11;
            }
        }
        return -1;
    }
}
