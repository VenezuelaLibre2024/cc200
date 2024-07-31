package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p064e6.C1667b;
import p079f6.C1844d;
import p079f6.C1865y;
import p079f6.InterfaceC1853m;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* loaded from: classes.dex */
public final class Status extends AbstractC2601a implements InterfaceC1853m, ReflectedParcelable {

    /* renamed from: h */
    public final int f4477h;

    /* renamed from: i */
    public final String f4478i;

    /* renamed from: j */
    public final PendingIntent f4479j;

    /* renamed from: k */
    public final C1667b f4480k;

    /* renamed from: l */
    public static final Status f4469l = new Status(-1);

    /* renamed from: m */
    public static final Status f4470m = new Status(0);

    /* renamed from: n */
    public static final Status f4471n = new Status(14);

    /* renamed from: o */
    public static final Status f4472o = new Status(8);

    /* renamed from: p */
    public static final Status f4473p = new Status(15);

    /* renamed from: q */
    public static final Status f4474q = new Status(16);

    /* renamed from: s */
    public static final Status f4476s = new Status(17);

    /* renamed from: r */
    public static final Status f4475r = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new C1865y();

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }

    public Status(int i10, String str, PendingIntent pendingIntent, C1667b c1667b) {
        this.f4477h = i10;
        this.f4478i = str;
        this.f4479j = pendingIntent;
        this.f4480k = c1667b;
    }

    public Status(C1667b c1667b, String str) {
        this(c1667b, str, 17);
    }

    @Deprecated
    public Status(C1667b c1667b, String str, int i10) {
        this(i10, str, c1667b.m6679K(), c1667b);
    }

    /* renamed from: I */
    public C1667b m4986I() {
        return this.f4480k;
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: J */
    public int m4987J() {
        return this.f4477h;
    }

    /* renamed from: K */
    public String m4988K() {
        return this.f4478i;
    }

    /* renamed from: L */
    public boolean m4989L() {
        return this.f4479j != null;
    }

    /* renamed from: M */
    public boolean m4990M() {
        return this.f4477h == 16;
    }

    /* renamed from: N */
    public boolean m4991N() {
        return this.f4477h <= 0;
    }

    /* renamed from: O */
    public void m4992O(Activity activity, int i10) {
        if (m4989L()) {
            PendingIntent pendingIntent = this.f4479j;
            C2394s.m9619l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4477h == status.f4477h && C2388q.m9592b(this.f4478i, status.f4478i) && C2388q.m9592b(this.f4479j, status.f4479j) && C2388q.m9592b(this.f4480k, status.f4480k);
    }

    @Override // p079f6.InterfaceC1853m
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(this.f4477h), this.f4478i, this.f4479j, this.f4480k);
    }

    public String toString() {
        C2388q.a m9594d = C2388q.m9594d(this);
        m9594d.m9595a("statusCode", zza());
        m9594d.m9595a("resolution", this.f4479j);
        return m9594d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, m4987J());
        C2603c.m10456F(parcel, 2, m4988K(), false);
        C2603c.m10454D(parcel, 3, this.f4479j, i10, false);
        C2603c.m10454D(parcel, 4, m4986I(), i10, false);
        C2603c.m10466b(parcel, m10465a);
    }

    public final String zza() {
        String str = this.f4478i;
        return str != null ? str : C1844d.m7583a(this.f4477h);
    }
}
