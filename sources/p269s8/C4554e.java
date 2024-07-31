package p269s8;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p239q8.C4204c;
import p239q8.C4205d;
import p239q8.InterfaceC4206e;
import p239q8.InterfaceC4207f;
import p239q8.InterfaceC4208g;
import p239q8.InterfaceC4209h;

/* renamed from: s8.e */
/* loaded from: classes.dex */
public final class C4554e implements InterfaceC4207f, InterfaceC4209h {

    /* renamed from: a */
    public C4554e f17158a = null;

    /* renamed from: b */
    public boolean f17159b = true;

    /* renamed from: c */
    public final JsonWriter f17160c;

    /* renamed from: d */
    public final Map<Class<?>, InterfaceC4206e<?>> f17161d;

    /* renamed from: e */
    public final Map<Class<?>, InterfaceC4208g<?>> f17162e;

    /* renamed from: f */
    public final InterfaceC4206e<Object> f17163f;

    /* renamed from: g */
    public final boolean f17164g;

    public C4554e(Writer writer, Map<Class<?>, InterfaceC4206e<?>> map, Map<Class<?>, InterfaceC4208g<?>> map2, InterfaceC4206e<Object> interfaceC4206e, boolean z10) {
        this.f17160c = new JsonWriter(writer);
        this.f17161d = map;
        this.f17162e = map2;
        this.f17163f = interfaceC4206e;
        this.f17164g = z10;
    }

    @Override // p239q8.InterfaceC4207f
    /* renamed from: a */
    public InterfaceC4207f mo16202a(C4205d c4205d, int i10) {
        return m18004n(c4205d.m16198b(), i10);
    }

    @Override // p239q8.InterfaceC4207f
    /* renamed from: b */
    public InterfaceC4207f mo16203b(C4205d c4205d, long j10) {
        return m18005o(c4205d.m16198b(), j10);
    }

    @Override // p239q8.InterfaceC4207f
    /* renamed from: c */
    public InterfaceC4207f mo16204c(C4205d c4205d, double d10) {
        return m18003m(c4205d.m16198b(), d10);
    }

    @Override // p239q8.InterfaceC4207f
    /* renamed from: e */
    public InterfaceC4207f mo16205e(C4205d c4205d, Object obj) {
        return m18006p(c4205d.m16198b(), obj);
    }

    @Override // p239q8.InterfaceC4207f
    /* renamed from: g */
    public InterfaceC4207f mo16206g(C4205d c4205d, boolean z10) {
        return m18007q(c4205d.m16198b(), z10);
    }

    /* renamed from: h */
    public C4554e m17998h(double d10) {
        m18015y();
        this.f17160c.value(d10);
        return this;
    }

    /* renamed from: i */
    public C4554e m17999i(int i10) {
        m18015y();
        this.f17160c.value(i10);
        return this;
    }

    /* renamed from: j */
    public C4554e m18000j(long j10) {
        m18015y();
        this.f17160c.value(j10);
        return this;
    }

    /* renamed from: k */
    public C4554e m18001k(Object obj, boolean z10) {
        int i10 = 0;
        if (z10 && m18010t(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new C4204c(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f17160c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f17160c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f17160c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m18001k(it.next(), false);
                }
                this.f17160c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f17160c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m18006p((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new C4204c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f17160c.endObject();
                return this;
            }
            InterfaceC4206e<?> interfaceC4206e = this.f17161d.get(obj.getClass());
            if (interfaceC4206e != null) {
                return m18012v(interfaceC4206e, obj, z10);
            }
            InterfaceC4208g<?> interfaceC4208g = this.f17162e.get(obj.getClass());
            if (interfaceC4208g != null) {
                interfaceC4208g.mo7324a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return m18012v(this.f17163f, obj, z10);
            }
            if (obj instanceof InterfaceC4555f) {
                m17999i(((InterfaceC4555f) obj).mo13235a());
            } else {
                mo16207d(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return m18009s((byte[]) obj);
        }
        this.f17160c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f17160c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                m18000j(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f17160c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f17160c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                m18001k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                m18001k(obj2, false);
            }
        }
        this.f17160c.endArray();
        return this;
    }

    @Override // p239q8.InterfaceC4209h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C4554e mo16207d(String str) {
        m18015y();
        this.f17160c.value(str);
        return this;
    }

    /* renamed from: m */
    public C4554e m18003m(String str, double d10) {
        m18015y();
        this.f17160c.name(str);
        return m17998h(d10);
    }

    /* renamed from: n */
    public C4554e m18004n(String str, int i10) {
        m18015y();
        this.f17160c.name(str);
        return m17999i(i10);
    }

    /* renamed from: o */
    public C4554e m18005o(String str, long j10) {
        m18015y();
        this.f17160c.name(str);
        return m18000j(j10);
    }

    /* renamed from: p */
    public C4554e m18006p(String str, Object obj) {
        return this.f17164g ? m18014x(str, obj) : m18013w(str, obj);
    }

    /* renamed from: q */
    public C4554e m18007q(String str, boolean z10) {
        m18015y();
        this.f17160c.name(str);
        return mo16208f(z10);
    }

    @Override // p239q8.InterfaceC4209h
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C4554e mo16208f(boolean z10) {
        m18015y();
        this.f17160c.value(z10);
        return this;
    }

    /* renamed from: s */
    public C4554e m18009s(byte[] bArr) {
        m18015y();
        if (bArr == null) {
            this.f17160c.nullValue();
        } else {
            this.f17160c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: t */
    public final boolean m18010t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: u */
    public void m18011u() {
        m18015y();
        this.f17160c.flush();
    }

    /* renamed from: v */
    public C4554e m18012v(InterfaceC4206e<Object> interfaceC4206e, Object obj, boolean z10) {
        if (!z10) {
            this.f17160c.beginObject();
        }
        interfaceC4206e.mo7324a(obj, this);
        if (!z10) {
            this.f17160c.endObject();
        }
        return this;
    }

    /* renamed from: w */
    public final C4554e m18013w(String str, Object obj) {
        m18015y();
        this.f17160c.name(str);
        if (obj != null) {
            return m18001k(obj, false);
        }
        this.f17160c.nullValue();
        return this;
    }

    /* renamed from: x */
    public final C4554e m18014x(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m18015y();
        this.f17160c.name(str);
        return m18001k(obj, false);
    }

    /* renamed from: y */
    public final void m18015y() {
        if (!this.f17159b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C4554e c4554e = this.f17158a;
        if (c4554e != null) {
            c4554e.m18015y();
            this.f17158a.f17159b = false;
            this.f17158a = null;
            this.f17160c.endObject();
        }
    }
}
