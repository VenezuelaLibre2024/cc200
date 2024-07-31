package p182m6;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p169l6.C3435b;
import p207o6.C3934c;
import p207o6.C3942k;
import p207o6.C3943l;

/* renamed from: m6.a */
/* loaded from: classes.dex */
public abstract class AbstractC3537a {

    @VisibleForTesting
    /* renamed from: m6.a$a */
    /* loaded from: classes.dex */
    public static class a<I, O> extends AbstractC2601a {
        public static final C3540d CREATOR = new C3540d();

        /* renamed from: h */
        public final int f12419h;

        /* renamed from: i */
        public final int f12420i;

        /* renamed from: j */
        public final boolean f12421j;

        /* renamed from: k */
        public final int f12422k;

        /* renamed from: l */
        public final boolean f12423l;

        /* renamed from: m */
        public final String f12424m;

        /* renamed from: n */
        public final int f12425n;

        /* renamed from: o */
        public final Class f12426o;

        /* renamed from: p */
        public final String f12427p;

        /* renamed from: q */
        public C3544h f12428q;

        /* renamed from: r */
        public b f12429r;

        public a(int i10, int i11, boolean z10, int i12, boolean z11, String str, int i13, String str2, C3435b c3435b) {
            this.f12419h = i10;
            this.f12420i = i11;
            this.f12421j = z10;
            this.f12422k = i12;
            this.f12423l = z11;
            this.f12424m = str;
            this.f12425n = i13;
            if (str2 == null) {
                this.f12426o = null;
                this.f12427p = null;
            } else {
                this.f12426o = C3539c.class;
                this.f12427p = str2;
            }
            if (c3435b == null) {
                this.f12429r = null;
            } else {
                this.f12429r = c3435b.m12787J();
            }
        }

        public a(int i10, boolean z10, int i11, boolean z11, String str, int i12, Class cls, b bVar) {
            this.f12419h = 1;
            this.f12420i = i10;
            this.f12421j = z10;
            this.f12422k = i11;
            this.f12423l = z11;
            this.f12424m = str;
            this.f12425n = i12;
            this.f12426o = cls;
            this.f12427p = cls == null ? null : cls.getCanonicalName();
            this.f12429r = bVar;
        }

        @VisibleForTesting
        /* renamed from: I */
        public static a<byte[], byte[]> m13173I(String str, int i10) {
            return new a<>(8, false, 8, false, str, i10, null, null);
        }

        /* renamed from: J */
        public static <T extends AbstractC3537a> a<T, T> m13174J(String str, int i10, Class<T> cls) {
            return new a<>(11, false, 11, false, str, i10, cls, null);
        }

        /* renamed from: K */
        public static <T extends AbstractC3537a> a<ArrayList<T>, ArrayList<T>> m13175K(String str, int i10, Class<T> cls) {
            return new a<>(11, true, 11, true, str, i10, cls, null);
        }

        @VisibleForTesting
        /* renamed from: L */
        public static a<Integer, Integer> m13176L(String str, int i10) {
            return new a<>(0, false, 0, false, str, i10, null, null);
        }

        /* renamed from: M */
        public static a<String, String> m13177M(String str, int i10) {
            return new a<>(7, false, 7, false, str, i10, null, null);
        }

        /* renamed from: N */
        public static a<ArrayList<String>, ArrayList<String>> m13178N(String str, int i10) {
            return new a<>(7, true, 7, true, str, i10, null, null);
        }

        /* renamed from: O */
        public int m13180O() {
            return this.f12425n;
        }

        /* renamed from: P */
        public final C3435b m13181P() {
            b bVar = this.f12429r;
            if (bVar == null) {
                return null;
            }
            return C3435b.m12786I(bVar);
        }

        /* renamed from: R */
        public final Object m13182R(Object obj) {
            C2394s.m9619l(this.f12429r);
            return C2394s.m9619l(this.f12429r.mo12785p(obj));
        }

        /* renamed from: S */
        public final Object m13183S(Object obj) {
            C2394s.m9619l(this.f12429r);
            return this.f12429r.mo12784k(obj);
        }

        /* renamed from: T */
        public final String m13184T() {
            String str = this.f12427p;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: U */
        public final Map m13185U() {
            C2394s.m9619l(this.f12427p);
            C2394s.m9619l(this.f12428q);
            return (Map) C2394s.m9619l(this.f12428q.m13194J(this.f12427p));
        }

        /* renamed from: V */
        public final void m13186V(C3544h c3544h) {
            this.f12428q = c3544h;
        }

        /* renamed from: W */
        public final boolean m13187W() {
            return this.f12429r != null;
        }

        public final String toString() {
            C2388q.a m9595a = C2388q.m9594d(this).m9595a("versionCode", Integer.valueOf(this.f12419h)).m9595a("typeIn", Integer.valueOf(this.f12420i)).m9595a("typeInArray", Boolean.valueOf(this.f12421j)).m9595a("typeOut", Integer.valueOf(this.f12422k)).m9595a("typeOutArray", Boolean.valueOf(this.f12423l)).m9595a("outputFieldName", this.f12424m).m9595a("safeParcelFieldId", Integer.valueOf(this.f12425n)).m9595a("concreteTypeName", m13184T());
            Class cls = this.f12426o;
            if (cls != null) {
                m9595a.m9595a("concreteType.class", cls.getCanonicalName());
            }
            b bVar = this.f12429r;
            if (bVar != null) {
                m9595a.m9595a("converterName", bVar.getClass().getCanonicalName());
            }
            return m9595a.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int m10465a = C2603c.m10465a(parcel);
            C2603c.m10485u(parcel, 1, this.f12419h);
            C2603c.m10485u(parcel, 2, this.f12420i);
            C2603c.m10471g(parcel, 3, this.f12421j);
            C2603c.m10485u(parcel, 4, this.f12422k);
            C2603c.m10471g(parcel, 5, this.f12423l);
            C2603c.m10456F(parcel, 6, this.f12424m, false);
            C2603c.m10485u(parcel, 7, m13180O());
            C2603c.m10456F(parcel, 8, m13184T(), false);
            C2603c.m10454D(parcel, 9, m13181P(), i10, false);
            C2603c.m10466b(parcel, m10465a);
        }
    }

    /* renamed from: m6.a$b */
    /* loaded from: classes.dex */
    public interface b<I, O> {
        /* renamed from: k */
        Object mo12784k(Object obj);

        /* renamed from: p */
        Object mo12785p(Object obj);
    }

    public static final Object zaD(a aVar, Object obj) {
        return aVar.f12429r != null ? aVar.m13183S(obj) : obj;
    }

    private final void zaE(a aVar, Object obj) {
        String str = aVar.f12424m;
        Object m13182R = aVar.m13182R(obj);
        int i10 = aVar.f12422k;
        switch (i10) {
            case 0:
                if (m13182R != null) {
                    setIntegerInternal(aVar, str, ((Integer) m13182R).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(aVar, str, (BigInteger) m13182R);
                return;
            case 2:
                if (m13182R != null) {
                    setLongInternal(aVar, str, ((Long) m13182R).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i10);
            case 4:
                if (m13182R != null) {
                    zan(aVar, str, ((Double) m13182R).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(aVar, str, (BigDecimal) m13182R);
                return;
            case 6:
                if (m13182R != null) {
                    setBooleanInternal(aVar, str, ((Boolean) m13182R).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(aVar, str, (String) m13182R);
                return;
            case 8:
            case 9:
                if (m13182R != null) {
                    setDecodedBytesInternal(aVar, str, (byte[]) m13182R);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder sb2, a aVar, Object obj) {
        String abstractC3537a;
        int i10 = aVar.f12420i;
        if (i10 == 11) {
            Class cls = aVar.f12426o;
            C2394s.m9619l(cls);
            abstractC3537a = ((AbstractC3537a) cls.cast(obj)).toString();
        } else if (i10 != 7) {
            sb2.append(obj);
            return;
        } else {
            abstractC3537a = "\"";
            sb2.append("\"");
            sb2.append(C3942k.m14950a((String) obj));
        }
        sb2.append(abstractC3537a);
    }

    private static final void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    public <T extends AbstractC3537a> void addConcreteTypeArrayInternal(a aVar, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends AbstractC3537a> void addConcreteTypeInternal(a aVar, String str, T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, a<?, ?>> getFieldMappings();

    public Object getFieldValue(a aVar) {
        String str = aVar.f12424m;
        if (aVar.f12426o == null) {
            return getValueObject(str);
        }
        C2394s.m9624q(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", aVar.f12424m);
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(a aVar) {
        if (aVar.f12422k != 11) {
            return isPrimitiveFieldSet(aVar.f12424m);
        }
        if (aVar.f12423l) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(a<?, ?> aVar, String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(a<?, ?> aVar, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(a<?, ?> aVar, String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(a<?, ?> aVar, String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(a<?, ?> aVar, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(a<?, ?> aVar, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(a<?, ?> aVar, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x005b. Please report as an issue. */
    public String toString() {
        String str;
        String m14929c;
        Map<String, a<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str2 : fieldMappings.keySet()) {
            a<?, ?> aVar = fieldMappings.get(str2);
            if (isFieldSet(aVar)) {
                Object zaD = zaD(aVar, getFieldValue(aVar));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\":");
                if (zaD != null) {
                    switch (aVar.f12422k) {
                        case 8:
                            sb2.append("\"");
                            m14929c = C3934c.m14929c((byte[]) zaD);
                            sb2.append(m14929c);
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            m14929c = C3934c.m14930d((byte[]) zaD);
                            sb2.append(m14929c);
                            sb2.append("\"");
                            break;
                        case 10:
                            C3943l.m14951a(sb2, (HashMap) zaD);
                            break;
                        default:
                            if (aVar.f12421j) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        zaF(sb2, aVar, obj);
                                    }
                                }
                                str = "]";
                                break;
                            } else {
                                zaF(sb2, aVar, zaD);
                                break;
                            }
                    }
                } else {
                    str = "null";
                }
                sb2.append(str);
            }
        }
        sb2.append(sb2.length() > 0 ? "}" : "{}");
        return sb2.toString();
    }

    public final void zaA(a aVar, String str) {
        if (aVar.f12429r != null) {
            zaE(aVar, str);
        } else {
            setStringInternal(aVar, aVar.f12424m, str);
        }
    }

    public final void zaB(a aVar, Map map) {
        if (aVar.f12429r != null) {
            zaE(aVar, map);
        } else {
            setStringMapInternal(aVar, aVar.f12424m, map);
        }
    }

    public final void zaC(a aVar, ArrayList arrayList) {
        if (aVar.f12429r != null) {
            zaE(aVar, arrayList);
        } else {
            setStringsInternal(aVar, aVar.f12424m, arrayList);
        }
    }

    public final void zaa(a aVar, BigDecimal bigDecimal) {
        if (aVar.f12429r != null) {
            zaE(aVar, bigDecimal);
        } else {
            zab(aVar, aVar.f12424m, bigDecimal);
        }
    }

    public void zab(a aVar, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(a aVar, ArrayList arrayList) {
        if (aVar.f12429r != null) {
            zaE(aVar, arrayList);
        } else {
            zad(aVar, aVar.f12424m, arrayList);
        }
    }

    public void zad(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(a aVar, BigInteger bigInteger) {
        if (aVar.f12429r != null) {
            zaE(aVar, bigInteger);
        } else {
            zaf(aVar, aVar.f12424m, bigInteger);
        }
    }

    public void zaf(a aVar, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(a aVar, ArrayList arrayList) {
        if (aVar.f12429r != null) {
            zaE(aVar, arrayList);
        } else {
            zah(aVar, aVar.f12424m, arrayList);
        }
    }

    public void zah(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(a aVar, boolean z10) {
        if (aVar.f12429r != null) {
            zaE(aVar, Boolean.valueOf(z10));
        } else {
            setBooleanInternal(aVar, aVar.f12424m, z10);
        }
    }

    public final void zaj(a aVar, ArrayList arrayList) {
        if (aVar.f12429r != null) {
            zaE(aVar, arrayList);
        } else {
            zak(aVar, aVar.f12424m, arrayList);
        }
    }

    public void zak(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(a aVar, byte[] bArr) {
        if (aVar.f12429r != null) {
            zaE(aVar, bArr);
        } else {
            setDecodedBytesInternal(aVar, aVar.f12424m, bArr);
        }
    }

    public final void zam(a aVar, double d10) {
        if (aVar.f12429r != null) {
            zaE(aVar, Double.valueOf(d10));
        } else {
            zan(aVar, aVar.f12424m, d10);
        }
    }

    public void zan(a aVar, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(a aVar, ArrayList arrayList) {
        if (aVar.f12429r != null) {
            zaE(aVar, arrayList);
        } else {
            zap(aVar, aVar.f12424m, arrayList);
        }
    }

    public void zap(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(a aVar, float f10) {
        if (aVar.f12429r != null) {
            zaE(aVar, Float.valueOf(f10));
        } else {
            zar(aVar, aVar.f12424m, f10);
        }
    }

    public void zar(a aVar, String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(a aVar, ArrayList arrayList) {
        if (aVar.f12429r != null) {
            zaE(aVar, arrayList);
        } else {
            zat(aVar, aVar.f12424m, arrayList);
        }
    }

    public void zat(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(a aVar, int i10) {
        if (aVar.f12429r != null) {
            zaE(aVar, Integer.valueOf(i10));
        } else {
            setIntegerInternal(aVar, aVar.f12424m, i10);
        }
    }

    public final void zav(a aVar, ArrayList arrayList) {
        if (aVar.f12429r != null) {
            zaE(aVar, arrayList);
        } else {
            zaw(aVar, aVar.f12424m, arrayList);
        }
    }

    public void zaw(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(a aVar, long j10) {
        if (aVar.f12429r != null) {
            zaE(aVar, Long.valueOf(j10));
        } else {
            setLongInternal(aVar, aVar.f12424m, j10);
        }
    }

    public final void zay(a aVar, ArrayList arrayList) {
        if (aVar.f12429r != null) {
            zaE(aVar, arrayList);
        } else {
            zaz(aVar, aVar.f12424m, arrayList);
        }
    }

    public void zaz(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
