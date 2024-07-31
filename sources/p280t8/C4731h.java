package p280t8;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p239q8.C4204c;
import p239q8.InterfaceC4206e;
import p239q8.InterfaceC4207f;
import p239q8.InterfaceC4208g;
import p254r8.InterfaceC4322a;
import p254r8.InterfaceC4323b;

/* renamed from: t8.h */
/* loaded from: classes.dex */
public class C4731h {

    /* renamed from: a */
    public final Map<Class<?>, InterfaceC4206e<?>> f17663a;

    /* renamed from: b */
    public final Map<Class<?>, InterfaceC4208g<?>> f17664b;

    /* renamed from: c */
    public final InterfaceC4206e<Object> f17665c;

    /* renamed from: t8.h$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC4323b<a> {

        /* renamed from: d */
        public static final InterfaceC4206e<Object> f17666d = C4730g.f17662a;

        /* renamed from: a */
        public final Map<Class<?>, InterfaceC4206e<?>> f17667a = new HashMap();

        /* renamed from: b */
        public final Map<Class<?>, InterfaceC4208g<?>> f17668b = new HashMap();

        /* renamed from: c */
        public InterfaceC4206e<Object> f17669c = f17666d;

        /* renamed from: e */
        public static /* synthetic */ void m18595e(Object obj, InterfaceC4207f interfaceC4207f) {
            throw new C4204c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C4731h m18596c() {
            return new C4731h(new HashMap(this.f17667a), new HashMap(this.f17668b), this.f17669c);
        }

        /* renamed from: d */
        public a m18597d(InterfaceC4322a interfaceC4322a) {
            interfaceC4322a.mo7323a(this);
            return this;
        }

        @Override // p254r8.InterfaceC4323b
        /* renamed from: f */
        public <U> a mo16576a(Class<U> cls, InterfaceC4206e<? super U> interfaceC4206e) {
            this.f17667a.put(cls, interfaceC4206e);
            this.f17668b.remove(cls);
            return this;
        }
    }

    public C4731h(Map<Class<?>, InterfaceC4206e<?>> map, Map<Class<?>, InterfaceC4208g<?>> map2, InterfaceC4206e<Object> interfaceC4206e) {
        this.f17663a = map;
        this.f17664b = map2;
        this.f17665c = interfaceC4206e;
    }

    /* renamed from: a */
    public static a m18591a() {
        return new a();
    }

    /* renamed from: b */
    public void m18592b(Object obj, OutputStream outputStream) {
        new C4729f(outputStream, this.f17663a, this.f17664b, this.f17665c).m18588t(obj);
    }

    /* renamed from: c */
    public byte[] m18593c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m18592b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
