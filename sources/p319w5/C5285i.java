package p319w5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p125i6.C2603c;
import p182m6.AbstractC3537a;
import p285u.C4772b;

/* renamed from: w5.i */
/* loaded from: classes.dex */
public final class C5285i extends zzbz {
    public static final Parcelable.Creator<C5285i> CREATOR = new C5286j();

    /* renamed from: o */
    public static final HashMap f20047o;

    /* renamed from: h */
    public final Set f20048h;

    /* renamed from: i */
    public final int f20049i;

    /* renamed from: j */
    public String f20050j;

    /* renamed from: k */
    public int f20051k;

    /* renamed from: l */
    public byte[] f20052l;

    /* renamed from: m */
    public PendingIntent f20053m;

    /* renamed from: n */
    public C5277a f20054n;

    static {
        HashMap hashMap = new HashMap();
        f20047o = hashMap;
        hashMap.put("accountType", AbstractC3537a.a.m13177M("accountType", 2));
        hashMap.put("status", AbstractC3537a.a.m13176L("status", 3));
        hashMap.put("transferBytes", AbstractC3537a.a.m13173I("transferBytes", 4));
    }

    public C5285i() {
        this.f20048h = new C4772b(3);
        this.f20049i = 1;
    }

    public C5285i(Set set, int i10, String str, int i11, byte[] bArr, PendingIntent pendingIntent, C5277a c5277a) {
        this.f20048h = set;
        this.f20049i = i10;
        this.f20050j = str;
        this.f20051k = i11;
        this.f20052l = bArr;
        this.f20053m = pendingIntent;
        this.f20054n = c5277a;
    }

    @Override // p182m6.AbstractC3537a
    public final /* synthetic */ Map getFieldMappings() {
        return f20047o;
    }

    @Override // p182m6.AbstractC3537a
    public final Object getFieldValue(AbstractC3537a.a aVar) {
        int i10;
        int m13180O = aVar.m13180O();
        if (m13180O == 1) {
            i10 = this.f20049i;
        } else {
            if (m13180O == 2) {
                return this.f20050j;
            }
            if (m13180O != 3) {
                if (m13180O == 4) {
                    return this.f20052l;
                }
                throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m13180O());
            }
            i10 = this.f20051k;
        }
        return Integer.valueOf(i10);
    }

    @Override // p182m6.AbstractC3537a
    public final boolean isFieldSet(AbstractC3537a.a aVar) {
        return this.f20048h.contains(Integer.valueOf(aVar.m13180O()));
    }

    @Override // p182m6.AbstractC3537a
    public final void setDecodedBytesInternal(AbstractC3537a.a aVar, String str, byte[] bArr) {
        int m13180O = aVar.m13180O();
        if (m13180O == 4) {
            this.f20052l = bArr;
            this.f20048h.add(Integer.valueOf(m13180O));
        } else {
            throw new IllegalArgumentException("Field with id=" + m13180O + " is not known to be a byte array.");
        }
    }

    @Override // p182m6.AbstractC3537a
    public final void setIntegerInternal(AbstractC3537a.a aVar, String str, int i10) {
        int m13180O = aVar.m13180O();
        if (m13180O == 3) {
            this.f20051k = i10;
            this.f20048h.add(Integer.valueOf(m13180O));
        } else {
            throw new IllegalArgumentException("Field with id=" + m13180O + " is not known to be an int.");
        }
    }

    @Override // p182m6.AbstractC3537a
    public final void setStringInternal(AbstractC3537a.a aVar, String str, String str2) {
        int m13180O = aVar.m13180O();
        if (m13180O != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(m13180O)));
        }
        this.f20050j = str2;
        this.f20048h.add(Integer.valueOf(m13180O));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        Set set = this.f20048h;
        if (set.contains(1)) {
            C2603c.m10485u(parcel, 1, this.f20049i);
        }
        if (set.contains(2)) {
            C2603c.m10456F(parcel, 2, this.f20050j, true);
        }
        if (set.contains(3)) {
            C2603c.m10485u(parcel, 3, this.f20051k);
        }
        if (set.contains(4)) {
            C2603c.m10476l(parcel, 4, this.f20052l, true);
        }
        if (set.contains(5)) {
            C2603c.m10454D(parcel, 5, this.f20053m, i10, true);
        }
        if (set.contains(6)) {
            C2603c.m10454D(parcel, 6, this.f20054n, i10, true);
        }
        C2603c.m10466b(parcel, m10465a);
    }
}
