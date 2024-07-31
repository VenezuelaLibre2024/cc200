package p269s8;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p239q8.C4204c;
import p239q8.InterfaceC4202a;
import p239q8.InterfaceC4206e;
import p239q8.InterfaceC4207f;
import p239q8.InterfaceC4208g;
import p239q8.InterfaceC4209h;
import p254r8.InterfaceC4322a;
import p254r8.InterfaceC4323b;

/* renamed from: s8.d */
/* loaded from: classes.dex */
public final class C4553d implements InterfaceC4323b<C4553d> {

    /* renamed from: e */
    public static final InterfaceC4206e<Object> f17148e = C4550a.f17145a;

    /* renamed from: f */
    public static final InterfaceC4208g<String> f17149f = C4552c.f17147a;

    /* renamed from: g */
    public static final InterfaceC4208g<Boolean> f17150g = C4551b.f17146a;

    /* renamed from: h */
    public static final b f17151h = new b(null);

    /* renamed from: a */
    public final Map<Class<?>, InterfaceC4206e<?>> f17152a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, InterfaceC4208g<?>> f17153b = new HashMap();

    /* renamed from: c */
    public InterfaceC4206e<Object> f17154c = f17148e;

    /* renamed from: d */
    public boolean f17155d = false;

    /* renamed from: s8.d$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4202a {
        public a() {
        }

        @Override // p239q8.InterfaceC4202a
        /* renamed from: a */
        public void mo16194a(Object obj, Writer writer) {
            C4554e c4554e = new C4554e(writer, C4553d.this.f17152a, C4553d.this.f17153b, C4553d.this.f17154c, C4553d.this.f17155d);
            c4554e.m18001k(obj, false);
            c4554e.m18011u();
        }

        @Override // p239q8.InterfaceC4202a
        /* renamed from: b */
        public String mo16195b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo16194a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: s8.d$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC4208g<Date> {

        /* renamed from: a */
        public static final DateFormat f17157a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f17157a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(Date date, InterfaceC4209h interfaceC4209h) {
            interfaceC4209h.mo16207d(f17157a.format(date));
        }
    }

    public C4553d() {
        m17996p(String.class, f17149f);
        m17996p(Boolean.class, f17150g);
        m17996p(Date.class, f17151h);
    }

    /* renamed from: l */
    public static /* synthetic */ void m17989l(Object obj, InterfaceC4207f interfaceC4207f) {
        throw new C4204c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: n */
    public static /* synthetic */ void m17991n(Boolean bool, InterfaceC4209h interfaceC4209h) {
        interfaceC4209h.mo16208f(bool.booleanValue());
    }

    /* renamed from: i */
    public InterfaceC4202a m17992i() {
        return new a();
    }

    /* renamed from: j */
    public C4553d m17993j(InterfaceC4322a interfaceC4322a) {
        interfaceC4322a.mo7323a(this);
        return this;
    }

    /* renamed from: k */
    public C4553d m17994k(boolean z10) {
        this.f17155d = z10;
        return this;
    }

    @Override // p254r8.InterfaceC4323b
    /* renamed from: o */
    public <T> C4553d mo16576a(Class<T> cls, InterfaceC4206e<? super T> interfaceC4206e) {
        this.f17152a.put(cls, interfaceC4206e);
        this.f17153b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public <T> C4553d m17996p(Class<T> cls, InterfaceC4208g<? super T> interfaceC4208g) {
        this.f17153b.put(cls, interfaceC4208g);
        this.f17152a.remove(cls);
        return this;
    }
}
