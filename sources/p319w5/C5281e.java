package p319w5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p125i6.C2603c;
import p182m6.AbstractC3537a;
import p285u.C4771a;

/* renamed from: w5.e */
/* loaded from: classes.dex */
public final class C5281e extends zzbz {
    public static final Parcelable.Creator<C5281e> CREATOR = new C5282f();

    /* renamed from: n */
    public static final C4771a f20033n;

    /* renamed from: h */
    public final int f20034h;

    /* renamed from: i */
    public List f20035i;

    /* renamed from: j */
    public List f20036j;

    /* renamed from: k */
    public List f20037k;

    /* renamed from: l */
    public List f20038l;

    /* renamed from: m */
    public List f20039m;

    static {
        C4771a c4771a = new C4771a();
        f20033n = c4771a;
        c4771a.put("registered", AbstractC3537a.a.m13178N("registered", 2));
        c4771a.put("in_progress", AbstractC3537a.a.m13178N("in_progress", 3));
        c4771a.put("success", AbstractC3537a.a.m13178N("success", 4));
        c4771a.put("failed", AbstractC3537a.a.m13178N("failed", 5));
        c4771a.put("escrowed", AbstractC3537a.a.m13178N("escrowed", 6));
    }

    public C5281e() {
        this.f20034h = 1;
    }

    public C5281e(int i10, List list, List list2, List list3, List list4, List list5) {
        this.f20034h = i10;
        this.f20035i = list;
        this.f20036j = list2;
        this.f20037k = list3;
        this.f20038l = list4;
        this.f20039m = list5;
    }

    @Override // p182m6.AbstractC3537a
    public final Map getFieldMappings() {
        return f20033n;
    }

    @Override // p182m6.AbstractC3537a
    public final Object getFieldValue(AbstractC3537a.a aVar) {
        switch (aVar.m13180O()) {
            case 1:
                return Integer.valueOf(this.f20034h);
            case 2:
                return this.f20035i;
            case 3:
                return this.f20036j;
            case 4:
                return this.f20037k;
            case 5:
                return this.f20038l;
            case 6:
                return this.f20039m;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m13180O());
        }
    }

    @Override // p182m6.AbstractC3537a
    public final boolean isFieldSet(AbstractC3537a.a aVar) {
        return true;
    }

    @Override // p182m6.AbstractC3537a
    public final void setStringsInternal(AbstractC3537a.a aVar, String str, ArrayList arrayList) {
        int m13180O = aVar.m13180O();
        if (m13180O == 2) {
            this.f20035i = arrayList;
            return;
        }
        if (m13180O == 3) {
            this.f20036j = arrayList;
            return;
        }
        if (m13180O == 4) {
            this.f20037k = arrayList;
        } else if (m13180O == 5) {
            this.f20038l = arrayList;
        } else {
            if (m13180O != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(m13180O)));
            }
            this.f20039m = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f20034h);
        C2603c.m10458H(parcel, 2, this.f20035i, false);
        C2603c.m10458H(parcel, 3, this.f20036j, false);
        C2603c.m10458H(parcel, 4, this.f20037k, false);
        C2603c.m10458H(parcel, 5, this.f20038l, false);
        C2603c.m10458H(parcel, 6, this.f20039m, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
