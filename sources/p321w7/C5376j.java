package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: w7.j */
/* loaded from: classes.dex */
public class C5376j extends AbstractC5368h {
    public static final Parcelable.Creator<C5376j> CREATOR = new C5347b2();

    /* renamed from: h */
    public String f20208h;

    /* renamed from: i */
    public String f20209i;

    /* renamed from: j */
    public final String f20210j;

    /* renamed from: k */
    public String f20211k;

    /* renamed from: l */
    public boolean f20212l;

    public C5376j(String str, String str2) {
        this(str, str2, null, null, false);
    }

    public C5376j(String str, String str2, String str3, String str4, boolean z10) {
        this.f20208h = C2394s.m9613f(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f20209i = str2;
        this.f20210j = str3;
        this.f20211k = str4;
        this.f20212l = z10;
    }

    /* renamed from: M */
    public static boolean m21508M(String str) {
        C5360f m21490c;
        return (TextUtils.isEmpty(str) || (m21490c = C5360f.m21490c(str)) == null || m21490c.m21493b() != 4) ? false : true;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: I */
    public String mo21462I() {
        return "password";
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: J */
    public String mo21463J() {
        return !TextUtils.isEmpty(this.f20209i) ? "password" : "emailLink";
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: K */
    public final AbstractC5368h mo21464K() {
        return new C5376j(this.f20208h, this.f20209i, this.f20210j, this.f20211k, this.f20212l);
    }

    /* renamed from: L */
    public final C5376j m21509L(AbstractC5341a0 abstractC5341a0) {
        this.f20211k = abstractC5341a0.zze();
        this.f20212l = true;
        return this;
    }

    /* renamed from: N */
    public final String m21510N() {
        return this.f20211k;
    }

    /* renamed from: O */
    public final boolean m21511O() {
        return !TextUtils.isEmpty(this.f20210j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, this.f20208h, false);
        C2603c.m10456F(parcel, 2, this.f20209i, false);
        C2603c.m10456F(parcel, 3, this.f20210j, false);
        C2603c.m10456F(parcel, 4, this.f20211k, false);
        C2603c.m10471g(parcel, 5, this.f20212l);
        C2603c.m10466b(parcel, m10465a);
    }

    public final String zzc() {
        return this.f20208h;
    }

    public final String zzd() {
        return this.f20209i;
    }

    public final String zze() {
        return this.f20210j;
    }

    public final boolean zzg() {
        return this.f20212l;
    }
}
