package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p292u6.EnumC4905b;
import p292u6.EnumC4914d0;

/* renamed from: u6.k */
/* loaded from: classes.dex */
public class C4939k extends AbstractC2601a {
    public static final Parcelable.Creator<C4939k> CREATOR = new C4974v1();

    /* renamed from: h */
    public final EnumC4905b f18586h;

    /* renamed from: i */
    public final Boolean f18587i;

    /* renamed from: j */
    public final EnumC4931h1 f18588j;

    /* renamed from: k */
    public final EnumC4914d0 f18589k;

    public C4939k(String str, Boolean bool, String str2, String str3) {
        EnumC4905b m19471b;
        EnumC4914d0 enumC4914d0 = null;
        if (str == null) {
            m19471b = null;
        } else {
            try {
                m19471b = EnumC4905b.m19471b(str);
            } catch (EnumC4905b.a | EnumC4914d0.a | C4927g1 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f18586h = m19471b;
        this.f18587i = bool;
        this.f18588j = str2 == null ? null : EnumC4931h1.m19496b(str2);
        if (str3 != null) {
            enumC4914d0 = EnumC4914d0.m19475b(str3);
        }
        this.f18589k = enumC4914d0;
    }

    /* renamed from: I */
    public String m19499I() {
        EnumC4905b enumC4905b = this.f18586h;
        if (enumC4905b == null) {
            return null;
        }
        return enumC4905b.toString();
    }

    /* renamed from: J */
    public Boolean m19500J() {
        return this.f18587i;
    }

    /* renamed from: K */
    public String m19501K() {
        EnumC4914d0 enumC4914d0 = this.f18589k;
        if (enumC4914d0 == null) {
            return null;
        }
        return enumC4914d0.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4939k)) {
            return false;
        }
        C4939k c4939k = (C4939k) obj;
        return C2388q.m9592b(this.f18586h, c4939k.f18586h) && C2388q.m9592b(this.f18587i, c4939k.f18587i) && C2388q.m9592b(this.f18588j, c4939k.f18588j) && C2388q.m9592b(this.f18589k, c4939k.f18589k);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18586h, this.f18587i, this.f18588j, this.f18589k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, m19499I(), false);
        C2603c.m10473i(parcel, 3, m19500J(), false);
        EnumC4931h1 enumC4931h1 = this.f18588j;
        C2603c.m10456F(parcel, 4, enumC4931h1 == null ? null : enumC4931h1.toString(), false);
        C2603c.m10456F(parcel, 5, m19501K(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
