package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzau;
import com.google.android.gms.internal.fido.zzh;
import java.util.Arrays;
import java.util.List;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p292u6.EnumC4984z;

/* renamed from: u6.v */
/* loaded from: classes.dex */
public class C4972v extends AbstractC2601a {

    /* renamed from: h */
    public final EnumC4984z f18649h;

    /* renamed from: i */
    public final byte[] f18650i;

    /* renamed from: j */
    public final List f18651j;

    /* renamed from: k */
    public static final zzau f18648k = zzau.zzi(zzh.zza, zzh.zzb);
    public static final Parcelable.Creator<C4972v> CREATOR = new C4973v0();

    public C4972v(String str, byte[] bArr, List<Transport> list) {
        C2394s.m9619l(str);
        try {
            this.f18649h = EnumC4984z.m19549b(str);
            this.f18650i = (byte[]) C2394s.m9619l(bArr);
            this.f18651j = list;
        } catch (EnumC4984z.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: I */
    public byte[] m19534I() {
        return this.f18650i;
    }

    /* renamed from: J */
    public List<Transport> m19535J() {
        return this.f18651j;
    }

    /* renamed from: K */
    public String m19536K() {
        return this.f18649h.toString();
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C4972v)) {
            return false;
        }
        C4972v c4972v = (C4972v) obj;
        if (!this.f18649h.equals(c4972v.f18649h) || !Arrays.equals(this.f18650i, c4972v.f18650i)) {
            return false;
        }
        List list2 = this.f18651j;
        if (list2 == null && c4972v.f18651j == null) {
            return true;
        }
        return list2 != null && (list = c4972v.f18651j) != null && list2.containsAll(list) && c4972v.f18651j.containsAll(this.f18651j);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18649h, Integer.valueOf(Arrays.hashCode(this.f18650i)), this.f18651j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, m19536K(), false);
        C2603c.m10476l(parcel, 3, m19534I(), false);
        C2603c.m10460J(parcel, 4, m19535J(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
