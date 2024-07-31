package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import p108h6.C2388q;
import p125i6.C2603c;
import p292u6.EnumC4957q;

/* renamed from: u6.i */
/* loaded from: classes.dex */
public class C4933i extends AbstractC4936j {
    public static final Parcelable.Creator<C4933i> CREATOR = new C4971u1();

    /* renamed from: h */
    public final EnumC4957q f18583h;

    /* renamed from: i */
    public final String f18584i;

    /* renamed from: j */
    public final int f18585j;

    public C4933i(int i10, String str, int i11) {
        try {
            this.f18583h = EnumC4957q.m19514f(i10);
            this.f18584i = str;
            this.f18585j = i11;
        } catch (EnumC4957q.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: I */
    public int m19497I() {
        return this.f18583h.m19515b();
    }

    /* renamed from: J */
    public String m19498J() {
        return this.f18584i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4933i)) {
            return false;
        }
        C4933i c4933i = (C4933i) obj;
        return C2388q.m9592b(this.f18583h, c4933i.f18583h) && C2388q.m9592b(this.f18584i, c4933i.f18584i) && C2388q.m9592b(Integer.valueOf(this.f18585j), Integer.valueOf(c4933i.f18585j));
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18583h, this.f18584i, Integer.valueOf(this.f18585j));
    }

    public String toString() {
        zzaj zza = zzak.zza(this);
        zza.zza("errorCode", this.f18583h.m19515b());
        String str = this.f18584i;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 2, m19497I());
        C2603c.m10456F(parcel, 3, m19498J(), false);
        C2603c.m10485u(parcel, 4, this.f18585j);
        C2603c.m10466b(parcel, m10465a);
    }
}
