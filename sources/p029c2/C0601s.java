package p029c2;

import androidx.work.C0417b;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: c2.s */
/* loaded from: classes.dex */
public final class C0601s {

    /* renamed from: a */
    public UUID f2614a;

    /* renamed from: b */
    public a f2615b;

    /* renamed from: c */
    public C0417b f2616c;

    /* renamed from: d */
    public Set<String> f2617d;

    /* renamed from: e */
    public C0417b f2618e;

    /* renamed from: f */
    public int f2619f;

    /* renamed from: c2.s$a */
    /* loaded from: classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        /* renamed from: b */
        public boolean m2986b() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public C0601s(UUID uuid, a aVar, C0417b c0417b, List<String> list, C0417b c0417b2, int i10) {
        this.f2614a = uuid;
        this.f2615b = aVar;
        this.f2616c = c0417b;
        this.f2617d = new HashSet(list);
        this.f2618e = c0417b2;
        this.f2619f = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0601s.class != obj.getClass()) {
            return false;
        }
        C0601s c0601s = (C0601s) obj;
        if (this.f2619f == c0601s.f2619f && this.f2614a.equals(c0601s.f2614a) && this.f2615b == c0601s.f2615b && this.f2616c.equals(c0601s.f2616c) && this.f2617d.equals(c0601s.f2617d)) {
            return this.f2618e.equals(c0601s.f2618e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f2614a.hashCode() * 31) + this.f2615b.hashCode()) * 31) + this.f2616c.hashCode()) * 31) + this.f2617d.hashCode()) * 31) + this.f2618e.hashCode()) * 31) + this.f2619f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f2614a + "', mState=" + this.f2615b + ", mOutputData=" + this.f2616c + ", mTags=" + this.f2617d + ", mProgress=" + this.f2618e + '}';
    }
}
