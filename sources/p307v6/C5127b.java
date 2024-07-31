package p307v6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import java.util.List;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p207o6.C3934c;
import p307v6.EnumC5128c;

@Deprecated
/* renamed from: v6.b */
/* loaded from: classes.dex */
public class C5127b extends AbstractC2601a {
    public static final Parcelable.Creator<C5127b> CREATOR = new C5133h();

    /* renamed from: h */
    public final int f19378h;

    /* renamed from: i */
    public final byte[] f19379i;

    /* renamed from: j */
    public final EnumC5128c f19380j;

    /* renamed from: k */
    public final List f19381k;

    public C5127b(int i10, byte[] bArr, String str, List list) {
        this.f19378h = i10;
        this.f19379i = bArr;
        try {
            this.f19380j = EnumC5128c.m20810b(str);
            this.f19381k = list;
        } catch (EnumC5128c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: I */
    public byte[] m20806I() {
        return this.f19379i;
    }

    /* renamed from: J */
    public EnumC5128c m20807J() {
        return this.f19380j;
    }

    /* renamed from: K */
    public List<Transport> m20808K() {
        return this.f19381k;
    }

    /* renamed from: L */
    public int m20809L() {
        return this.f19378h;
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5127b)) {
            return false;
        }
        C5127b c5127b = (C5127b) obj;
        if (!Arrays.equals(this.f19379i, c5127b.f19379i) || !this.f19380j.equals(c5127b.f19380j)) {
            return false;
        }
        List list2 = this.f19381k;
        if (list2 == null && c5127b.f19381k == null) {
            return true;
        }
        return list2 != null && (list = c5127b.f19381k) != null && list2.containsAll(list) && c5127b.f19381k.containsAll(this.f19381k);
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(Arrays.hashCode(this.f19379i)), this.f19380j, this.f19381k);
    }

    public String toString() {
        List list = this.f19381k;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", C3934c.m14929c(this.f19379i), this.f19380j, list == null ? "null" : list.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, m20809L());
        C2603c.m10476l(parcel, 2, m20806I(), false);
        C2603c.m10456F(parcel, 3, this.f19380j.toString(), false);
        C2603c.m10460J(parcel, 4, m20808K(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
