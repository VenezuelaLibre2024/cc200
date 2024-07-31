package p319w5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p125i6.C2603c;
import p182m6.AbstractC3537a;

/* renamed from: w5.b */
/* loaded from: classes.dex */
public final class C5278b extends zzbz {
    public static final Parcelable.Creator<C5278b> CREATOR = new C5279c();

    /* renamed from: m */
    public static final HashMap f20027m;

    /* renamed from: h */
    public final Set f20028h;

    /* renamed from: i */
    public final int f20029i;

    /* renamed from: j */
    public ArrayList f20030j;

    /* renamed from: k */
    public int f20031k;

    /* renamed from: l */
    public C5281e f20032l;

    static {
        HashMap hashMap = new HashMap();
        f20027m = hashMap;
        hashMap.put("authenticatorData", AbstractC3537a.a.m13175K("authenticatorData", 2, C5283g.class));
        hashMap.put("progress", AbstractC3537a.a.m13174J("progress", 4, C5281e.class));
    }

    public C5278b() {
        this.f20028h = new HashSet(1);
        this.f20029i = 1;
    }

    public C5278b(Set set, int i10, ArrayList arrayList, int i11, C5281e c5281e) {
        this.f20028h = set;
        this.f20029i = i10;
        this.f20030j = arrayList;
        this.f20031k = i11;
        this.f20032l = c5281e;
    }

    @Override // p182m6.AbstractC3537a
    public final void addConcreteTypeArrayInternal(AbstractC3537a.a aVar, String str, ArrayList arrayList) {
        int m13180O = aVar.m13180O();
        if (m13180O != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(m13180O), arrayList.getClass().getCanonicalName()));
        }
        this.f20030j = arrayList;
        this.f20028h.add(Integer.valueOf(m13180O));
    }

    @Override // p182m6.AbstractC3537a
    public final void addConcreteTypeInternal(AbstractC3537a.a aVar, String str, AbstractC3537a abstractC3537a) {
        int m13180O = aVar.m13180O();
        if (m13180O != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(m13180O), abstractC3537a.getClass().getCanonicalName()));
        }
        this.f20032l = (C5281e) abstractC3537a;
        this.f20028h.add(Integer.valueOf(m13180O));
    }

    @Override // p182m6.AbstractC3537a
    public final /* synthetic */ Map getFieldMappings() {
        return f20027m;
    }

    @Override // p182m6.AbstractC3537a
    public final Object getFieldValue(AbstractC3537a.a aVar) {
        int m13180O = aVar.m13180O();
        if (m13180O == 1) {
            return Integer.valueOf(this.f20029i);
        }
        if (m13180O == 2) {
            return this.f20030j;
        }
        if (m13180O == 4) {
            return this.f20032l;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m13180O());
    }

    @Override // p182m6.AbstractC3537a
    public final boolean isFieldSet(AbstractC3537a.a aVar) {
        return this.f20028h.contains(Integer.valueOf(aVar.m13180O()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        Set set = this.f20028h;
        if (set.contains(1)) {
            C2603c.m10485u(parcel, 1, this.f20029i);
        }
        if (set.contains(2)) {
            C2603c.m10460J(parcel, 2, this.f20030j, true);
        }
        if (set.contains(3)) {
            C2603c.m10485u(parcel, 3, this.f20031k);
        }
        if (set.contains(4)) {
            C2603c.m10454D(parcel, 4, this.f20032l, i10, true);
        }
        C2603c.m10466b(parcel, m10465a);
    }
}
