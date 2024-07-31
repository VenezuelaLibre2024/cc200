package p029c2;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: c2.c */
/* loaded from: classes.dex */
public final class C0585c {

    /* renamed from: a */
    public final Set<a> f2585a = new HashSet();

    /* renamed from: c2.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Uri f2586a;

        /* renamed from: b */
        public final boolean f2587b;

        public a(Uri uri, boolean z10) {
            this.f2586a = uri;
            this.f2587b = z10;
        }

        /* renamed from: a */
        public Uri m2959a() {
            return this.f2586a;
        }

        /* renamed from: b */
        public boolean m2960b() {
            return this.f2587b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2587b == aVar.f2587b && this.f2586a.equals(aVar.f2586a);
        }

        public int hashCode() {
            return (this.f2586a.hashCode() * 31) + (this.f2587b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void m2956a(Uri uri, boolean z10) {
        this.f2585a.add(new a(uri, z10));
    }

    /* renamed from: b */
    public Set<a> m2957b() {
        return this.f2585a;
    }

    /* renamed from: c */
    public int m2958c() {
        return this.f2585a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0585c.class != obj.getClass()) {
            return false;
        }
        return this.f2585a.equals(((C0585c) obj).f2585a);
    }

    public int hashCode() {
        return this.f2585a.hashCode();
    }
}
