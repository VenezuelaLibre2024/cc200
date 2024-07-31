package p108h6;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p049d7.C1594a;
import p079f6.C1841a;
import p285u.C4772b;

@VisibleForTesting
/* renamed from: h6.e */
/* loaded from: classes.dex */
public final class C2352e {

    /* renamed from: a */
    public final Account f9590a;

    /* renamed from: b */
    public final Set f9591b;

    /* renamed from: c */
    public final Set f9592c;

    /* renamed from: d */
    public final Map f9593d;

    /* renamed from: e */
    public final int f9594e;

    /* renamed from: f */
    public final View f9595f;

    /* renamed from: g */
    public final String f9596g;

    /* renamed from: h */
    public final String f9597h;

    /* renamed from: i */
    public final C1594a f9598i;

    /* renamed from: j */
    public Integer f9599j;

    /* renamed from: h6.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public Account f9600a;

        /* renamed from: b */
        public C4772b f9601b;

        /* renamed from: c */
        public String f9602c;

        /* renamed from: d */
        public String f9603d;

        /* renamed from: e */
        public C1594a f9604e = C1594a.f5912q;

        /* renamed from: a */
        public C2352e m9530a() {
            return new C2352e(this.f9600a, this.f9601b, null, 0, null, this.f9602c, this.f9603d, this.f9604e, false);
        }

        /* renamed from: b */
        public a m9531b(String str) {
            this.f9602c = str;
            return this;
        }

        /* renamed from: c */
        public final a m9532c(Collection collection) {
            if (this.f9601b == null) {
                this.f9601b = new C4772b();
            }
            this.f9601b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final a m9533d(Account account) {
            this.f9600a = account;
            return this;
        }

        /* renamed from: e */
        public final a m9534e(String str) {
            this.f9603d = str;
            return this;
        }
    }

    public C2352e(Account account, Set set, Map map, int i10, View view, String str, String str2, C1594a c1594a, boolean z10) {
        this.f9590a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f9591b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f9593d = map;
        this.f9595f = view;
        this.f9594e = i10;
        this.f9596g = str;
        this.f9597h = str2;
        this.f9598i = c1594a == null ? C1594a.f5912q : c1594a;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((C2353e0) it.next()).f9605a);
        }
        this.f9592c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account m9519a() {
        return this.f9590a;
    }

    @Deprecated
    /* renamed from: b */
    public String m9520b() {
        Account account = this.f9590a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public Account m9521c() {
        Account account = this.f9590a;
        return account != null ? account : new Account(AbstractC2346c.DEFAULT_ACCOUNT, "com.google");
    }

    /* renamed from: d */
    public Set<Scope> m9522d() {
        return this.f9592c;
    }

    /* renamed from: e */
    public Set<Scope> m9523e(C1841a<?> c1841a) {
        C2353e0 c2353e0 = (C2353e0) this.f9593d.get(c1841a);
        if (c2353e0 == null || c2353e0.f9605a.isEmpty()) {
            return this.f9591b;
        }
        HashSet hashSet = new HashSet(this.f9591b);
        hashSet.addAll(c2353e0.f9605a);
        return hashSet;
    }

    /* renamed from: f */
    public String m9524f() {
        return this.f9596g;
    }

    /* renamed from: g */
    public Set<Scope> m9525g() {
        return this.f9591b;
    }

    /* renamed from: h */
    public final C1594a m9526h() {
        return this.f9598i;
    }

    /* renamed from: i */
    public final Integer m9527i() {
        return this.f9599j;
    }

    /* renamed from: j */
    public final String m9528j() {
        return this.f9597h;
    }

    /* renamed from: k */
    public final void m9529k(Integer num) {
        this.f9599j = num;
    }
}
