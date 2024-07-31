package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.List;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p335x5.C5623x;

/* loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends AbstractC2601a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new C5623x();

    /* renamed from: h */
    public final PendingIntent f4400h;

    /* renamed from: i */
    public final String f4401i;

    /* renamed from: j */
    public final String f4402j;

    /* renamed from: k */
    public final List f4403k;

    /* renamed from: l */
    public final String f4404l;

    /* renamed from: m */
    public final int f4405m;

    /* renamed from: com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$a */
    /* loaded from: classes.dex */
    public static final class C1160a {

        /* renamed from: a */
        public PendingIntent f4406a;

        /* renamed from: b */
        public String f4407b;

        /* renamed from: c */
        public String f4408c;

        /* renamed from: d */
        public List f4409d = new ArrayList();

        /* renamed from: e */
        public String f4410e;

        /* renamed from: f */
        public int f4411f;

        /* renamed from: a */
        public SaveAccountLinkingTokenRequest m4915a() {
            C2394s.m9609b(this.f4406a != null, "Consent PendingIntent cannot be null");
            C2394s.m9609b("auth_code".equals(this.f4407b), "Invalid tokenType");
            C2394s.m9609b(!TextUtils.isEmpty(this.f4408c), "serviceId cannot be null or empty");
            C2394s.m9609b(this.f4409d != null, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.f4406a, this.f4407b, this.f4408c, this.f4409d, this.f4410e, this.f4411f);
        }

        /* renamed from: b */
        public C1160a m4916b(PendingIntent pendingIntent) {
            this.f4406a = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public C1160a m4917c(List<String> list) {
            this.f4409d = list;
            return this;
        }

        /* renamed from: d */
        public C1160a m4918d(String str) {
            this.f4408c = str;
            return this;
        }

        /* renamed from: e */
        public C1160a m4919e(String str) {
            this.f4407b = str;
            return this;
        }

        /* renamed from: f */
        public final C1160a m4920f(String str) {
            this.f4410e = str;
            return this;
        }

        /* renamed from: g */
        public final C1160a m4921g(int i10) {
            this.f4411f = i10;
            return this;
        }
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i10) {
        this.f4400h = pendingIntent;
        this.f4401i = str;
        this.f4402j = str2;
        this.f4403k = list;
        this.f4404l = str3;
        this.f4405m = i10;
    }

    /* renamed from: I */
    public static C1160a m4909I() {
        return new C1160a();
    }

    /* renamed from: N */
    public static C1160a m4910N(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        C2394s.m9619l(saveAccountLinkingTokenRequest);
        C1160a m4909I = m4909I();
        m4909I.m4917c(saveAccountLinkingTokenRequest.m4912K());
        m4909I.m4918d(saveAccountLinkingTokenRequest.m4913L());
        m4909I.m4916b(saveAccountLinkingTokenRequest.m4911J());
        m4909I.m4919e(saveAccountLinkingTokenRequest.m4914M());
        m4909I.m4921g(saveAccountLinkingTokenRequest.f4405m);
        String str = saveAccountLinkingTokenRequest.f4404l;
        if (!TextUtils.isEmpty(str)) {
            m4909I.m4920f(str);
        }
        return m4909I;
    }

    /* renamed from: J */
    public PendingIntent m4911J() {
        return this.f4400h;
    }

    /* renamed from: K */
    public List<String> m4912K() {
        return this.f4403k;
    }

    /* renamed from: L */
    public String m4913L() {
        return this.f4402j;
    }

    /* renamed from: M */
    public String m4914M() {
        return this.f4401i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        return this.f4403k.size() == saveAccountLinkingTokenRequest.f4403k.size() && this.f4403k.containsAll(saveAccountLinkingTokenRequest.f4403k) && C2388q.m9592b(this.f4400h, saveAccountLinkingTokenRequest.f4400h) && C2388q.m9592b(this.f4401i, saveAccountLinkingTokenRequest.f4401i) && C2388q.m9592b(this.f4402j, saveAccountLinkingTokenRequest.f4402j) && C2388q.m9592b(this.f4404l, saveAccountLinkingTokenRequest.f4404l) && this.f4405m == saveAccountLinkingTokenRequest.f4405m;
    }

    public int hashCode() {
        return C2388q.m9593c(this.f4400h, this.f4401i, this.f4402j, this.f4403k, this.f4404l);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, m4911J(), i10, false);
        C2603c.m10456F(parcel, 2, m4914M(), false);
        C2603c.m10456F(parcel, 3, m4913L(), false);
        C2603c.m10458H(parcel, 4, m4912K(), false);
        C2603c.m10456F(parcel, 5, this.f4404l, false);
        C2603c.m10485u(parcel, 6, this.f4405m);
        C2603c.m10466b(parcel, m10465a);
    }
}
