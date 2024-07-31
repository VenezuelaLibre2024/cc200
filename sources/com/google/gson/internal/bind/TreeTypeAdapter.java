package com.google.gson.internal.bind;

import com.google.gson.AbstractC1374j;
import com.google.gson.Gson;
import com.google.gson.InterfaceC1306h;
import com.google.gson.InterfaceC1307i;
import com.google.gson.InterfaceC1380p;
import com.google.gson.InterfaceC1381q;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C1309a;
import com.google.gson.internal.C1368k;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;

/* loaded from: classes.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a */
    public final InterfaceC1381q<T> f5046a;

    /* renamed from: b */
    public final InterfaceC1307i<T> f5047b;

    /* renamed from: c */
    public final Gson f5048c;

    /* renamed from: d */
    public final C5740a<T> f5049d;

    /* renamed from: e */
    public final InterfaceC1386v f5050e;

    /* renamed from: f */
    public final TreeTypeAdapter<T>.C1322b f5051f = new C1322b();

    /* renamed from: g */
    public TypeAdapter<T> f5052g;

    /* loaded from: classes.dex */
    public static final class SingleTypeFactory implements InterfaceC1386v {

        /* renamed from: h */
        public final C5740a<?> f5053h;

        /* renamed from: i */
        public final boolean f5054i;

        /* renamed from: j */
        public final Class<?> f5055j;

        /* renamed from: k */
        public final InterfaceC1381q<?> f5056k;

        /* renamed from: l */
        public final InterfaceC1307i<?> f5057l;

        public SingleTypeFactory(Object obj, C5740a<?> c5740a, boolean z10, Class<?> cls) {
            InterfaceC1381q<?> interfaceC1381q = obj instanceof InterfaceC1381q ? (InterfaceC1381q) obj : null;
            this.f5056k = interfaceC1381q;
            InterfaceC1307i<?> interfaceC1307i = obj instanceof InterfaceC1307i ? (InterfaceC1307i) obj : null;
            this.f5057l = interfaceC1307i;
            C1309a.m5635a((interfaceC1381q == null && interfaceC1307i == null) ? false : true);
            this.f5053h = c5740a;
            this.f5054i = z10;
            this.f5055j = cls;
        }

        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            C5740a<?> c5740a2 = this.f5053h;
            if (c5740a2 != null ? c5740a2.equals(c5740a) || (this.f5054i && this.f5053h.getType() == c5740a.getRawType()) : this.f5055j.isAssignableFrom(c5740a.getRawType())) {
                return new TreeTypeAdapter(this.f5056k, this.f5057l, gson, c5740a, this);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$b */
    /* loaded from: classes.dex */
    public final class C1322b implements InterfaceC1380p, InterfaceC1306h {
        public C1322b() {
        }
    }

    public TreeTypeAdapter(InterfaceC1381q<T> interfaceC1381q, InterfaceC1307i<T> interfaceC1307i, Gson gson, C5740a<T> c5740a, InterfaceC1386v interfaceC1386v) {
        this.f5046a = interfaceC1381q;
        this.f5047b = interfaceC1307i;
        this.f5048c = gson;
        this.f5049d = c5740a;
        this.f5050e = interfaceC1386v;
    }

    /* renamed from: b */
    public static InterfaceC1386v m5689b(C5740a<?> c5740a, Object obj) {
        return new SingleTypeFactory(obj, c5740a, c5740a.getType() == c5740a.getRawType(), null);
    }

    /* renamed from: a */
    public final TypeAdapter<T> m5690a() {
        TypeAdapter<T> typeAdapter = this.f5052g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> m5589l = this.f5048c.m5589l(this.f5050e, this.f5049d);
        this.f5052g = m5589l;
        return m5589l;
    }

    @Override // com.google.gson.TypeAdapter
    public T read(C5897a c5897a) {
        if (this.f5047b == null) {
            return m5690a().read(c5897a);
        }
        AbstractC1374j m5821a = C1368k.m5821a(c5897a);
        if (m5821a.m5839j()) {
            return null;
        }
        return this.f5047b.deserialize(m5821a, this.f5049d.getType(), this.f5051f);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(C5899c c5899c, T t10) {
        InterfaceC1381q<T> interfaceC1381q = this.f5046a;
        if (interfaceC1381q == null) {
            m5690a().write(c5899c, t10);
        } else if (t10 == null) {
            c5899c.mo5779W();
        } else {
            C1368k.m5822b(interfaceC1381q.m5854a(t10, this.f5049d.getType(), this.f5051f), c5899c);
        }
    }
}
