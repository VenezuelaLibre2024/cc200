package p182m6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p108h6.C2394s;
import p125i6.C2602b;
import p125i6.C2603c;
import p182m6.AbstractC3537a;
import p207o6.C3933b;
import p207o6.C3934c;
import p207o6.C3942k;
import p207o6.C3943l;

@VisibleForTesting
/* renamed from: m6.c */
/* loaded from: classes.dex */
public class C3539c extends AbstractC3538b {
    public static final Parcelable.Creator<C3539c> CREATOR = new C3547k();

    /* renamed from: h */
    public final int f12430h;

    /* renamed from: i */
    public final Parcel f12431i;

    /* renamed from: j */
    public final int f12432j = 2;

    /* renamed from: k */
    public final C3544h f12433k;

    /* renamed from: l */
    public final String f12434l;

    /* renamed from: m */
    public int f12435m;

    /* renamed from: n */
    public int f12436n;

    public C3539c(int i10, Parcel parcel, C3544h c3544h) {
        this.f12430h = i10;
        this.f12431i = (Parcel) C2394s.m9619l(parcel);
        this.f12433k = c3544h;
        this.f12434l = c3544h == null ? null : c3544h.m13193I();
        this.f12435m = 2;
    }

    /* renamed from: e */
    public static final void m13188e(StringBuilder sb2, int i10, Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                sb2.append(C3942k.m14950a(C2394s.m9619l(obj).toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                sb2.append(C3934c.m14929c((byte[]) obj));
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                sb2.append(C3934c.m14930d((byte[]) obj));
                sb2.append("\"");
                return;
            case 10:
                C3943l.m14951a(sb2, (HashMap) C2394s.m9619l(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i10);
        }
    }

    /* renamed from: f */
    public static final void m13189f(StringBuilder sb2, AbstractC3537a.a aVar, Object obj) {
        if (!aVar.f12421j) {
            m13188e(sb2, aVar.f12420i, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            m13188e(sb2, aVar.f12420i, arrayList.get(i10));
        }
        sb2.append("]");
    }

    /* renamed from: a */
    public final Parcel m13190a() {
        int i10 = this.f12435m;
        if (i10 != 0) {
            if (i10 == 1) {
                C2603c.m10466b(this.f12431i, this.f12436n);
            }
            return this.f12431i;
        }
        int m10465a = C2603c.m10465a(this.f12431i);
        this.f12436n = m10465a;
        C2603c.m10466b(this.f12431i, m10465a);
        this.f12435m = 2;
        return this.f12431i;
    }

    @Override // p182m6.AbstractC3537a
    public final <T extends AbstractC3537a> void addConcreteTypeArrayInternal(AbstractC3537a.a aVar, String str, ArrayList<T> arrayList) {
        m13191b(aVar);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) C2394s.m9619l(arrayList)).size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((C3539c) arrayList.get(i10)).m13190a());
        }
        C2603c.m10453C(this.f12431i, aVar.m13180O(), arrayList2, true);
    }

    @Override // p182m6.AbstractC3537a
    public final <T extends AbstractC3537a> void addConcreteTypeInternal(AbstractC3537a.a aVar, String str, T t10) {
        m13191b(aVar);
        C2603c.m10452B(this.f12431i, aVar.m13180O(), ((C3539c) t10).m13190a(), true);
    }

    /* renamed from: b */
    public final void m13191b(AbstractC3537a.a aVar) {
        if (aVar.f12425n == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f12431i;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i10 = this.f12435m;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f12436n = C2603c.m10465a(parcel);
            this.f12435m = 1;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0071. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x0195. Please report as an issue. */
    /* renamed from: d */
    public final void m13192d(StringBuilder sb2, Map map, Parcel parcel) {
        Object m10427c;
        String m14950a;
        String str;
        Object valueOf;
        Object zaD;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((AbstractC3537a.a) entry.getValue()).m13180O(), entry);
        }
        sb2.append('{');
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(C2602b.m10446v(m10412D));
            if (entry2 != null) {
                if (z10) {
                    sb2.append(",");
                }
                String str2 = (String) entry2.getKey();
                AbstractC3537a.a aVar = (AbstractC3537a.a) entry2.getValue();
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\":");
                if (aVar.m13187W()) {
                    int i10 = aVar.f12422k;
                    switch (i10) {
                        case 0:
                            valueOf = Integer.valueOf(C2602b.m10414F(parcel, m10412D));
                            zaD = AbstractC3537a.zaD(aVar, valueOf);
                            m13189f(sb2, aVar, zaD);
                            break;
                        case 1:
                            valueOf = C2602b.m10427c(parcel, m10412D);
                            zaD = AbstractC3537a.zaD(aVar, valueOf);
                            m13189f(sb2, aVar, zaD);
                            break;
                        case 2:
                            valueOf = Long.valueOf(C2602b.m10417I(parcel, m10412D));
                            zaD = AbstractC3537a.zaD(aVar, valueOf);
                            m13189f(sb2, aVar, zaD);
                            break;
                        case 3:
                            valueOf = Float.valueOf(C2602b.m10410B(parcel, m10412D));
                            zaD = AbstractC3537a.zaD(aVar, valueOf);
                            m13189f(sb2, aVar, zaD);
                            break;
                        case 4:
                            valueOf = Double.valueOf(C2602b.m10450z(parcel, m10412D));
                            zaD = AbstractC3537a.zaD(aVar, valueOf);
                            m13189f(sb2, aVar, zaD);
                            break;
                        case 5:
                            valueOf = C2602b.m10425a(parcel, m10412D);
                            zaD = AbstractC3537a.zaD(aVar, valueOf);
                            m13189f(sb2, aVar, zaD);
                            break;
                        case 6:
                            valueOf = Boolean.valueOf(C2602b.m10447w(parcel, m10412D));
                            zaD = AbstractC3537a.zaD(aVar, valueOf);
                            m13189f(sb2, aVar, zaD);
                            break;
                        case 7:
                            valueOf = C2602b.m10440p(parcel, m10412D);
                            zaD = AbstractC3537a.zaD(aVar, valueOf);
                            m13189f(sb2, aVar, zaD);
                            break;
                        case 8:
                        case 9:
                            zaD = AbstractC3537a.zaD(aVar, C2602b.m10431g(parcel, m10412D));
                            m13189f(sb2, aVar, zaD);
                            break;
                        case 10:
                            Bundle m10430f = C2602b.m10430f(parcel, m10412D);
                            HashMap hashMap = new HashMap();
                            for (String str3 : m10430f.keySet()) {
                                hashMap.put(str3, (String) C2394s.m9619l(m10430f.getString(str3)));
                            }
                            zaD = AbstractC3537a.zaD(aVar, hashMap);
                            m13189f(sb2, aVar, zaD);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i10);
                    }
                } else {
                    if (aVar.f12423l) {
                        sb2.append("[");
                        switch (aVar.f12422k) {
                            case 0:
                                C3933b.m14922e(sb2, C2602b.m10435k(parcel, m10412D));
                                break;
                            case 1:
                                C3933b.m14924g(sb2, C2602b.m10428d(parcel, m10412D));
                                break;
                            case 2:
                                C3933b.m14923f(sb2, C2602b.m10436l(parcel, m10412D));
                                break;
                            case 3:
                                C3933b.m14921d(sb2, C2602b.m10434j(parcel, m10412D));
                                break;
                            case 4:
                                C3933b.m14920c(sb2, C2602b.m10433i(parcel, m10412D));
                                break;
                            case 5:
                                C3933b.m14924g(sb2, C2602b.m10426b(parcel, m10412D));
                                break;
                            case 6:
                                C3933b.m14925h(sb2, C2602b.m10429e(parcel, m10412D));
                                break;
                            case 7:
                                C3933b.m14926i(sb2, C2602b.m10441q(parcel, m10412D));
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                Parcel[] m10438n = C2602b.m10438n(parcel, m10412D);
                                int length = m10438n.length;
                                for (int i11 = 0; i11 < length; i11++) {
                                    if (i11 > 0) {
                                        sb2.append(",");
                                    }
                                    m10438n[i11].setDataPosition(0);
                                    m13192d(sb2, aVar.m13185U(), m10438n[i11]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        str = "]";
                    } else {
                        switch (aVar.f12422k) {
                            case 0:
                                sb2.append(C2602b.m10414F(parcel, m10412D));
                                break;
                            case 1:
                                m10427c = C2602b.m10427c(parcel, m10412D);
                                sb2.append(m10427c);
                                break;
                            case 2:
                                sb2.append(C2602b.m10417I(parcel, m10412D));
                                break;
                            case 3:
                                sb2.append(C2602b.m10410B(parcel, m10412D));
                                break;
                            case 4:
                                sb2.append(C2602b.m10450z(parcel, m10412D));
                                break;
                            case 5:
                                m10427c = C2602b.m10425a(parcel, m10412D);
                                sb2.append(m10427c);
                                break;
                            case 6:
                                sb2.append(C2602b.m10447w(parcel, m10412D));
                                break;
                            case 7:
                                String m10440p = C2602b.m10440p(parcel, m10412D);
                                sb2.append("\"");
                                m14950a = C3942k.m14950a(m10440p);
                                sb2.append(m14950a);
                                sb2.append("\"");
                                break;
                            case 8:
                                byte[] m10431g = C2602b.m10431g(parcel, m10412D);
                                sb2.append("\"");
                                m14950a = C3934c.m14929c(m10431g);
                                sb2.append(m14950a);
                                sb2.append("\"");
                                break;
                            case 9:
                                byte[] m10431g2 = C2602b.m10431g(parcel, m10412D);
                                sb2.append("\"");
                                m14950a = C3934c.m14930d(m10431g2);
                                sb2.append(m14950a);
                                sb2.append("\"");
                                break;
                            case 10:
                                Bundle m10430f2 = C2602b.m10430f(parcel, m10412D);
                                Set<String> keySet = m10430f2.keySet();
                                sb2.append("{");
                                boolean z11 = true;
                                for (String str4 : keySet) {
                                    if (!z11) {
                                        sb2.append(",");
                                    }
                                    sb2.append("\"");
                                    sb2.append(str4);
                                    sb2.append("\":\"");
                                    sb2.append(C3942k.m14950a(m10430f2.getString(str4)));
                                    sb2.append("\"");
                                    z11 = false;
                                }
                                str = "}";
                                break;
                            case 11:
                                Parcel m10437m = C2602b.m10437m(parcel, m10412D);
                                m10437m.setDataPosition(0);
                                m13192d(sb2, aVar.m13185U(), m10437m);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                    sb2.append(str);
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() == m10422N) {
            sb2.append('}');
            return;
        }
        throw new C2602b.a("Overread allowed size end=" + m10422N, parcel);
    }

    @Override // p182m6.AbstractC3537a
    public final Map<String, AbstractC3537a.a<?, ?>> getFieldMappings() {
        C3544h c3544h = this.f12433k;
        if (c3544h == null) {
            return null;
        }
        return c3544h.m13194J((String) C2394s.m9619l(this.f12434l));
    }

    @Override // p182m6.AbstractC3538b, p182m6.AbstractC3537a
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // p182m6.AbstractC3538b, p182m6.AbstractC3537a
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // p182m6.AbstractC3537a
    public final void setBooleanInternal(AbstractC3537a.a<?, ?> aVar, String str, boolean z10) {
        m13191b(aVar);
        C2603c.m10471g(this.f12431i, aVar.m13180O(), z10);
    }

    @Override // p182m6.AbstractC3537a
    public final void setDecodedBytesInternal(AbstractC3537a.a<?, ?> aVar, String str, byte[] bArr) {
        m13191b(aVar);
        C2603c.m10476l(this.f12431i, aVar.m13180O(), bArr, true);
    }

    @Override // p182m6.AbstractC3537a
    public final void setIntegerInternal(AbstractC3537a.a<?, ?> aVar, String str, int i10) {
        m13191b(aVar);
        C2603c.m10485u(this.f12431i, aVar.m13180O(), i10);
    }

    @Override // p182m6.AbstractC3537a
    public final void setLongInternal(AbstractC3537a.a<?, ?> aVar, String str, long j10) {
        m13191b(aVar);
        C2603c.m10489y(this.f12431i, aVar.m13180O(), j10);
    }

    @Override // p182m6.AbstractC3537a
    public final void setStringInternal(AbstractC3537a.a<?, ?> aVar, String str, String str2) {
        m13191b(aVar);
        C2603c.m10456F(this.f12431i, aVar.m13180O(), str2, true);
    }

    @Override // p182m6.AbstractC3537a
    public final void setStringMapInternal(AbstractC3537a.a<?, ?> aVar, String str, Map<String, String> map) {
        m13191b(aVar);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) C2394s.m9619l(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        C2603c.m10474j(this.f12431i, aVar.m13180O(), bundle, true);
    }

    @Override // p182m6.AbstractC3537a
    public final void setStringsInternal(AbstractC3537a.a<?, ?> aVar, String str, ArrayList<String> arrayList) {
        m13191b(aVar);
        int size = ((ArrayList) C2394s.m9619l(arrayList)).size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = arrayList.get(i10);
        }
        C2603c.m10457G(this.f12431i, aVar.m13180O(), strArr, true);
    }

    @Override // p182m6.AbstractC3537a
    public final String toString() {
        C2394s.m9620m(this.f12433k, "Cannot convert to JSON on client side.");
        Parcel m13190a = m13190a();
        m13190a.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        m13192d(sb2, (Map) C2394s.m9619l(this.f12433k.m13194J((String) C2394s.m9619l(this.f12434l))), m13190a);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f12430h);
        C2603c.m10452B(parcel, 2, m13190a(), false);
        C2603c.m10454D(parcel, 3, this.f12432j != 0 ? this.f12433k : null, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }

    @Override // p182m6.AbstractC3537a
    public final void zab(AbstractC3537a.a aVar, String str, BigDecimal bigDecimal) {
        m13191b(aVar);
        C2603c.m10467c(this.f12431i, aVar.m13180O(), bigDecimal, true);
    }

    @Override // p182m6.AbstractC3537a
    public final void zad(AbstractC3537a.a aVar, String str, ArrayList arrayList) {
        m13191b(aVar);
        int size = ((ArrayList) C2394s.m9619l(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        C2603c.m10468d(this.f12431i, aVar.m13180O(), bigDecimalArr, true);
    }

    @Override // p182m6.AbstractC3537a
    public final void zaf(AbstractC3537a.a aVar, String str, BigInteger bigInteger) {
        m13191b(aVar);
        C2603c.m10469e(this.f12431i, aVar.m13180O(), bigInteger, true);
    }

    @Override // p182m6.AbstractC3537a
    public final void zah(AbstractC3537a.a aVar, String str, ArrayList arrayList) {
        m13191b(aVar);
        int size = ((ArrayList) C2394s.m9619l(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        C2603c.m10470f(this.f12431i, aVar.m13180O(), bigIntegerArr, true);
    }

    @Override // p182m6.AbstractC3537a
    public final void zak(AbstractC3537a.a aVar, String str, ArrayList arrayList) {
        m13191b(aVar);
        int size = ((ArrayList) C2394s.m9619l(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        C2603c.m10472h(this.f12431i, aVar.m13180O(), zArr, true);
    }

    @Override // p182m6.AbstractC3537a
    public final void zan(AbstractC3537a.a aVar, String str, double d10) {
        m13191b(aVar);
        C2603c.m10478n(this.f12431i, aVar.m13180O(), d10);
    }

    @Override // p182m6.AbstractC3537a
    public final void zap(AbstractC3537a.a aVar, String str, ArrayList arrayList) {
        m13191b(aVar);
        int size = ((ArrayList) C2394s.m9619l(arrayList)).size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        C2603c.m10479o(this.f12431i, aVar.m13180O(), dArr, true);
    }

    @Override // p182m6.AbstractC3537a
    public final void zar(AbstractC3537a.a aVar, String str, float f10) {
        m13191b(aVar);
        C2603c.m10481q(this.f12431i, aVar.m13180O(), f10);
    }

    @Override // p182m6.AbstractC3537a
    public final void zat(AbstractC3537a.a aVar, String str, ArrayList arrayList) {
        m13191b(aVar);
        int size = ((ArrayList) C2394s.m9619l(arrayList)).size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        C2603c.m10482r(this.f12431i, aVar.m13180O(), fArr, true);
    }

    @Override // p182m6.AbstractC3537a
    public final void zaw(AbstractC3537a.a aVar, String str, ArrayList arrayList) {
        m13191b(aVar);
        int size = ((ArrayList) C2394s.m9619l(arrayList)).size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        C2603c.m10486v(this.f12431i, aVar.m13180O(), iArr, true);
    }

    @Override // p182m6.AbstractC3537a
    public final void zaz(AbstractC3537a.a aVar, String str, ArrayList arrayList) {
        m13191b(aVar);
        int size = ((ArrayList) C2394s.m9619l(arrayList)).size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        C2603c.m10490z(this.f12431i, aVar.m13180O(), jArr, true);
    }
}
