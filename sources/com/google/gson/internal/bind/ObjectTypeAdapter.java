package com.google.gson.internal.bind;

import com.google.gson.EnumC1384t;
import com.google.gson.Gson;
import com.google.gson.InterfaceC1385u;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C1364g;
import java.util.ArrayList;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.EnumC5898b;

/* loaded from: classes.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: c */
    public static final InterfaceC1386v f5024c = m5680b(EnumC1384t.f5219h);

    /* renamed from: a */
    public final Gson f5025a;

    /* renamed from: b */
    public final InterfaceC1385u f5026b;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1 */
    /* loaded from: classes.dex */
    public class C13171 implements InterfaceC1386v {
        public C13171() {
        }

        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            if (c5740a.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson, InterfaceC1385u.this);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C1318a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5028a;

        static {
            int[] iArr = new int[EnumC5898b.values().length];
            f5028a = iArr;
            try {
                iArr[EnumC5898b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5028a[EnumC5898b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5028a[EnumC5898b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5028a[EnumC5898b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5028a[EnumC5898b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5028a[EnumC5898b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ObjectTypeAdapter(Gson gson, InterfaceC1385u interfaceC1385u) {
        this.f5025a = gson;
        this.f5026b = interfaceC1385u;
    }

    public /* synthetic */ ObjectTypeAdapter(Gson gson, InterfaceC1385u interfaceC1385u, C13171 c13171) {
        this(gson, interfaceC1385u);
    }

    /* renamed from: a */
    public static InterfaceC1386v m5679a(InterfaceC1385u interfaceC1385u) {
        return interfaceC1385u == EnumC1384t.f5219h ? f5024c : m5680b(interfaceC1385u);
    }

    /* renamed from: b */
    public static InterfaceC1386v m5680b(InterfaceC1385u interfaceC1385u) {
        return new InterfaceC1386v() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            public C13171() {
            }

            @Override // com.google.gson.InterfaceC1386v
            public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
                if (c5740a.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(gson, InterfaceC1385u.this);
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(C5897a c5897a) {
        switch (C1318a.f5028a[c5897a.mo5774r0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                c5897a.mo5764a();
                while (c5897a.mo5755E()) {
                    arrayList.add(read(c5897a));
                }
                c5897a.mo5772n();
                return arrayList;
            case 2:
                C1364g c1364g = new C1364g();
                c5897a.mo5767d();
                while (c5897a.mo5755E()) {
                    c1364g.put(c5897a.mo5769f0(), read(c5897a));
                }
                c5897a.mo5775w();
                return c1364g;
            case 3:
                return c5897a.mo5771l0();
            case 4:
                return this.f5026b.mo5855b(c5897a);
            case 5:
                return Boolean.valueOf(c5897a.mo5763W());
            case 6:
                c5897a.mo5770h0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(C5899c c5899c, Object obj) {
        if (obj == null) {
            c5899c.mo5779W();
            return;
        }
        TypeAdapter m5587j = this.f5025a.m5587j(obj.getClass());
        if (!(m5587j instanceof ObjectTypeAdapter)) {
            m5587j.write(c5899c, obj);
        } else {
            c5899c.mo5781j();
            c5899c.mo5787w();
        }
    }
}
