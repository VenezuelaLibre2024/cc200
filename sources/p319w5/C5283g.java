package p319w5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p125i6.C2603c;
import p182m6.AbstractC3537a;

/* renamed from: w5.g */
/* loaded from: classes.dex */
public final class C5283g extends zzbz {
    public static final Parcelable.Creator<C5283g> CREATOR = new C5284h();

    /* renamed from: n */
    public static final HashMap f20040n;

    /* renamed from: h */
    public final Set f20041h;

    /* renamed from: i */
    public final int f20042i;

    /* renamed from: j */
    public C5285i f20043j;

    /* renamed from: k */
    public String f20044k;

    /* renamed from: l */
    public String f20045l;

    /* renamed from: m */
    public String f20046m;

    static {
        HashMap hashMap = new HashMap();
        f20040n = hashMap;
        hashMap.put("authenticatorInfo", AbstractC3537a.a.m13174J("authenticatorInfo", 2, C5285i.class));
        hashMap.put("signature", AbstractC3537a.a.m13177M("signature", 3));
        hashMap.put("package", AbstractC3537a.a.m13177M("package", 4));
    }

    public C5283g() {
        this.f20041h = new HashSet(3);
        this.f20042i = 1;
    }

    public C5283g(Set set, int i10, C5285i c5285i, String str, String str2, String str3) {
        this.f20041h = set;
        this.f20042i = i10;
        this.f20043j = c5285i;
        this.f20044k = str;
        this.f20045l = str2;
        this.f20046m = str3;
    }

    @Override // p182m6.AbstractC3537a
    public final void addConcreteTypeInternal(AbstractC3537a.a aVar, String str, AbstractC3537a abstractC3537a) {
        int m13180O = aVar.m13180O();
        if (m13180O != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(m13180O), abstractC3537a.getClass().getCanonicalName()));
        }
        this.f20043j = (C5285i) abstractC3537a;
        this.f20041h.add(Integer.valueOf(m13180O));
    }

    @Override // p182m6.AbstractC3537a
    public final /* synthetic */ Map getFieldMappings() {
        return f20040n;
    }

    @Override // p182m6.AbstractC3537a
    public final Object getFieldValue(AbstractC3537a.a aVar) {
        int m13180O = aVar.m13180O();
        if (m13180O == 1) {
            return Integer.valueOf(this.f20042i);
        }
        if (m13180O == 2) {
            return this.f20043j;
        }
        if (m13180O == 3) {
            return this.f20044k;
        }
        if (m13180O == 4) {
            return this.f20045l;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m13180O());
    }

    @Override // p182m6.AbstractC3537a
    public final boolean isFieldSet(AbstractC3537a.a aVar) {
        return this.f20041h.contains(Integer.valueOf(aVar.m13180O()));
    }

    @Override // p182m6.AbstractC3537a
    public final void setStringInternal(AbstractC3537a.a aVar, String str, String str2) {
        int m13180O = aVar.m13180O();
        if (m13180O == 3) {
            this.f20044k = str2;
        } else {
            if (m13180O != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(m13180O)));
            }
            this.f20045l = str2;
        }
        this.f20041h.add(Integer.valueOf(m13180O));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        Set set = this.f20041h;
        if (set.contains(1)) {
            C2603c.m10485u(parcel, 1, this.f20042i);
        }
        if (set.contains(2)) {
            C2603c.m10454D(parcel, 2, this.f20043j, i10, true);
        }
        if (set.contains(3)) {
            C2603c.m10456F(parcel, 3, this.f20044k, true);
        }
        if (set.contains(4)) {
            C2603c.m10456F(parcel, 4, this.f20045l, true);
        }
        if (set.contains(5)) {
            C2603c.m10456F(parcel, 5, this.f20046m, true);
        }
        C2603c.m10466b(parcel, m10465a);
    }
}
