package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p335x5.C5612m;

/* loaded from: classes.dex */
public class AuthorizationRequest extends AbstractC2601a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new C5612m();

    /* renamed from: h */
    public final List f4384h;

    /* renamed from: i */
    public final String f4385i;

    /* renamed from: j */
    public final boolean f4386j;

    /* renamed from: k */
    public final boolean f4387k;

    /* renamed from: l */
    public final Account f4388l;

    /* renamed from: m */
    public final String f4389m;

    /* renamed from: n */
    public final String f4390n;

    /* renamed from: o */
    public final boolean f4391o;

    /* renamed from: com.google.android.gms.auth.api.identity.AuthorizationRequest$a */
    /* loaded from: classes.dex */
    public static final class C1159a {

        /* renamed from: a */
        public List f4392a;

        /* renamed from: b */
        public String f4393b;

        /* renamed from: c */
        public boolean f4394c;

        /* renamed from: d */
        public boolean f4395d;

        /* renamed from: e */
        public Account f4396e;

        /* renamed from: f */
        public String f4397f;

        /* renamed from: g */
        public String f4398g;

        /* renamed from: h */
        public boolean f4399h;

        /* renamed from: a */
        public AuthorizationRequest m4901a() {
            return new AuthorizationRequest(this.f4392a, this.f4393b, this.f4394c, this.f4395d, this.f4396e, this.f4397f, this.f4398g, this.f4399h);
        }

        /* renamed from: b */
        public C1159a m4902b(String str) {
            this.f4397f = C2394s.m9613f(str);
            return this;
        }

        /* renamed from: c */
        public C1159a m4903c(String str, boolean z10) {
            m4908h(str);
            this.f4393b = str;
            this.f4394c = true;
            this.f4399h = z10;
            return this;
        }

        /* renamed from: d */
        public C1159a m4904d(Account account) {
            this.f4396e = (Account) C2394s.m9619l(account);
            return this;
        }

        /* renamed from: e */
        public C1159a m4905e(List<Scope> list) {
            boolean z10 = false;
            if (list != null && !list.isEmpty()) {
                z10 = true;
            }
            C2394s.m9609b(z10, "requestedScopes cannot be null or empty");
            this.f4392a = list;
            return this;
        }

        /* renamed from: f */
        public final C1159a m4906f(String str) {
            m4908h(str);
            this.f4393b = str;
            this.f4395d = true;
            return this;
        }

        /* renamed from: g */
        public final C1159a m4907g(String str) {
            this.f4398g = str;
            return this;
        }

        /* renamed from: h */
        public final String m4908h(String str) {
            C2394s.m9619l(str);
            String str2 = this.f4393b;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            C2394s.m9609b(z10, "two different server client ids provided");
            return str;
        }
    }

    public AuthorizationRequest(List list, String str, boolean z10, boolean z11, Account account, String str2, String str3, boolean z12) {
        boolean z13 = false;
        if (list != null && !list.isEmpty()) {
            z13 = true;
        }
        C2394s.m9609b(z13, "requestedScopes cannot be null or empty");
        this.f4384h = list;
        this.f4385i = str;
        this.f4386j = z10;
        this.f4387k = z11;
        this.f4388l = account;
        this.f4389m = str2;
        this.f4390n = str3;
        this.f4391o = z12;
    }

    /* renamed from: I */
    public static C1159a m4893I() {
        return new C1159a();
    }

    /* renamed from: O */
    public static C1159a m4894O(AuthorizationRequest authorizationRequest) {
        C2394s.m9619l(authorizationRequest);
        C1159a m4893I = m4893I();
        m4893I.m4905e(authorizationRequest.m4896K());
        boolean m4898M = authorizationRequest.m4898M();
        String m4895J = authorizationRequest.m4895J();
        Account m4900y = authorizationRequest.m4900y();
        String m4897L = authorizationRequest.m4897L();
        String str = authorizationRequest.f4390n;
        if (str != null) {
            m4893I.m4907g(str);
        }
        if (m4895J != null) {
            m4893I.m4902b(m4895J);
        }
        if (m4900y != null) {
            m4893I.m4904d(m4900y);
        }
        if (authorizationRequest.f4387k && m4897L != null) {
            m4893I.m4906f(m4897L);
        }
        if (authorizationRequest.m4899N() && m4897L != null) {
            m4893I.m4903c(m4897L, m4898M);
        }
        return m4893I;
    }

    /* renamed from: J */
    public String m4895J() {
        return this.f4389m;
    }

    /* renamed from: K */
    public List<Scope> m4896K() {
        return this.f4384h;
    }

    /* renamed from: L */
    public String m4897L() {
        return this.f4385i;
    }

    /* renamed from: M */
    public boolean m4898M() {
        return this.f4391o;
    }

    /* renamed from: N */
    public boolean m4899N() {
        return this.f4386j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        return this.f4384h.size() == authorizationRequest.f4384h.size() && this.f4384h.containsAll(authorizationRequest.f4384h) && this.f4386j == authorizationRequest.f4386j && this.f4391o == authorizationRequest.f4391o && this.f4387k == authorizationRequest.f4387k && C2388q.m9592b(this.f4385i, authorizationRequest.f4385i) && C2388q.m9592b(this.f4388l, authorizationRequest.f4388l) && C2388q.m9592b(this.f4389m, authorizationRequest.f4389m) && C2388q.m9592b(this.f4390n, authorizationRequest.f4390n);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f4384h, this.f4385i, Boolean.valueOf(this.f4386j), Boolean.valueOf(this.f4391o), Boolean.valueOf(this.f4387k), this.f4388l, this.f4389m, this.f4390n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10460J(parcel, 1, m4896K(), false);
        C2603c.m10456F(parcel, 2, m4897L(), false);
        C2603c.m10471g(parcel, 3, m4899N());
        C2603c.m10471g(parcel, 4, this.f4387k);
        C2603c.m10454D(parcel, 5, m4900y(), i10, false);
        C2603c.m10456F(parcel, 6, m4895J(), false);
        C2603c.m10456F(parcel, 7, this.f4390n, false);
        C2603c.m10471g(parcel, 8, m4898M());
        C2603c.m10466b(parcel, m10465a);
    }

    /* renamed from: y */
    public Account m4900y() {
        return this.f4388l;
    }
}
