package p321w7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w7.c1 */
/* loaded from: classes.dex */
public class C5350c1 extends AbstractC2601a {
    public static final Parcelable.Creator<C5350c1> CREATOR = new C5419w1();

    /* renamed from: h */
    public String f20152h;

    /* renamed from: i */
    public String f20153i;

    /* renamed from: j */
    public boolean f20154j;

    /* renamed from: k */
    public boolean f20155k;

    /* renamed from: l */
    public Uri f20156l;

    /* renamed from: w7.c1$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public String f20157a;

        /* renamed from: b */
        public Uri f20158b;

        /* renamed from: c */
        public boolean f20159c;

        /* renamed from: d */
        public boolean f20160d;

        /* renamed from: a */
        public C5350c1 m21456a() {
            String str = this.f20157a;
            Uri uri = this.f20158b;
            return new C5350c1(str, uri == null ? null : uri.toString(), this.f20159c, this.f20160d);
        }

        /* renamed from: b */
        public a m21457b(String str) {
            if (str == null) {
                this.f20159c = true;
            } else {
                this.f20157a = str;
            }
            return this;
        }

        /* renamed from: c */
        public a m21458c(Uri uri) {
            if (uri == null) {
                this.f20160d = true;
            } else {
                this.f20158b = uri;
            }
            return this;
        }
    }

    public C5350c1(String str, String str2, boolean z10, boolean z11) {
        this.f20152h = str;
        this.f20153i = str2;
        this.f20154j = z10;
        this.f20155k = z11;
        this.f20156l = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    /* renamed from: I */
    public Uri m21453I() {
        return this.f20156l;
    }

    /* renamed from: J */
    public final boolean m21454J() {
        return this.f20154j;
    }

    /* renamed from: s */
    public String m21455s() {
        return this.f20152h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, m21455s(), false);
        C2603c.m10456F(parcel, 3, this.f20153i, false);
        C2603c.m10471g(parcel, 4, this.f20154j);
        C2603c.m10471g(parcel, 5, this.f20155k);
        C2603c.m10466b(parcel, m10465a);
    }

    public final String zza() {
        return this.f20153i;
    }

    public final boolean zzc() {
        return this.f20155k;
    }
}
