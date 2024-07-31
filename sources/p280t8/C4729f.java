package p280t8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p239q8.C4204c;
import p239q8.C4205d;
import p239q8.InterfaceC4206e;
import p239q8.InterfaceC4207f;
import p239q8.InterfaceC4208g;
import p280t8.InterfaceC4727d;

/* renamed from: t8.f */
/* loaded from: classes.dex */
public final class C4729f implements InterfaceC4207f {

    /* renamed from: f */
    public static final Charset f17652f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C4205d f17653g = C4205d.m16196a(Constants.KEY).m16201b(C4724a.m18567b().m18569c(1).m18568a()).m16200a();

    /* renamed from: h */
    public static final C4205d f17654h = C4205d.m16196a("value").m16201b(C4724a.m18567b().m18569c(2).m18568a()).m16200a();

    /* renamed from: i */
    public static final InterfaceC4206e<Map.Entry<Object, Object>> f17655i = new InterfaceC4206e() { // from class: t8.e
        @Override // p239q8.InterfaceC4203b
        /* renamed from: a */
        public final void mo7324a(Object obj, InterfaceC4207f interfaceC4207f) {
            C4729f.m18575w((Map.Entry) obj, interfaceC4207f);
        }
    };

    /* renamed from: a */
    public OutputStream f17656a;

    /* renamed from: b */
    public final Map<Class<?>, InterfaceC4206e<?>> f17657b;

    /* renamed from: c */
    public final Map<Class<?>, InterfaceC4208g<?>> f17658c;

    /* renamed from: d */
    public final InterfaceC4206e<Object> f17659d;

    /* renamed from: e */
    public final C4732i f17660e = new C4732i(this);

    /* renamed from: t8.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17661a;

        static {
            int[] iArr = new int[InterfaceC4727d.a.values().length];
            f17661a = iArr;
            try {
                iArr[InterfaceC4727d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17661a[InterfaceC4727d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17661a[InterfaceC4727d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C4729f(OutputStream outputStream, Map<Class<?>, InterfaceC4206e<?>> map, Map<Class<?>, InterfaceC4208g<?>> map2, InterfaceC4206e<Object> interfaceC4206e) {
        this.f17656a = outputStream;
        this.f17657b = map;
        this.f17658c = map2;
        this.f17659d = interfaceC4206e;
    }

    /* renamed from: p */
    public static ByteBuffer m18572p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: u */
    public static InterfaceC4727d m18573u(C4205d c4205d) {
        InterfaceC4727d interfaceC4727d = (InterfaceC4727d) c4205d.m16199c(InterfaceC4727d.class);
        if (interfaceC4727d != null) {
            return interfaceC4727d;
        }
        throw new C4204c("Field has no @Protobuf config");
    }

    /* renamed from: v */
    public static int m18574v(C4205d c4205d) {
        InterfaceC4727d interfaceC4727d = (InterfaceC4727d) c4205d.m16199c(InterfaceC4727d.class);
        if (interfaceC4727d != null) {
            return interfaceC4727d.tag();
        }
        throw new C4204c("Field has no @Protobuf config");
    }

    /* renamed from: w */
    public static /* synthetic */ void m18575w(Map.Entry entry, InterfaceC4207f interfaceC4207f) {
        interfaceC4207f.mo16205e(f17653g, entry.getKey());
        interfaceC4207f.mo16205e(f17654h, entry.getValue());
    }

    @Override // p239q8.InterfaceC4207f
    /* renamed from: c */
    public InterfaceC4207f mo16204c(C4205d c4205d, double d10) {
        return m18576f(c4205d, d10, true);
    }

    @Override // p239q8.InterfaceC4207f
    /* renamed from: e */
    public InterfaceC4207f mo16205e(C4205d c4205d, Object obj) {
        return m18578i(c4205d, obj, true);
    }

    /* renamed from: f */
    public InterfaceC4207f m18576f(C4205d c4205d, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        m18589x((m18574v(c4205d) << 3) | 1);
        this.f17656a.write(m18572p(8).putDouble(d10).array());
        return this;
    }

    /* renamed from: h */
    public InterfaceC4207f m18577h(C4205d c4205d, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        m18589x((m18574v(c4205d) << 3) | 5);
        this.f17656a.write(m18572p(4).putFloat(f10).array());
        return this;
    }

    /* renamed from: i */
    public InterfaceC4207f m18578i(C4205d c4205d, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            m18589x((m18574v(c4205d) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f17652f);
            m18589x(bytes.length);
            this.f17656a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m18578i(c4205d, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m18586r(f17655i, c4205d, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return m18576f(c4205d, ((Double) obj).doubleValue(), z10);
        }
        if (obj instanceof Float) {
            return m18577h(c4205d, ((Float) obj).floatValue(), z10);
        }
        if (obj instanceof Number) {
            return m18582m(c4205d, ((Number) obj).longValue(), z10);
        }
        if (obj instanceof Boolean) {
            return m18584o(c4205d, ((Boolean) obj).booleanValue(), z10);
        }
        if (!(obj instanceof byte[])) {
            InterfaceC4206e<?> interfaceC4206e = this.f17657b.get(obj.getClass());
            if (interfaceC4206e != null) {
                return m18586r(interfaceC4206e, c4205d, obj, z10);
            }
            InterfaceC4208g<?> interfaceC4208g = this.f17658c.get(obj.getClass());
            return interfaceC4208g != null ? m18587s(interfaceC4208g, c4205d, obj, z10) : obj instanceof InterfaceC4726c ? mo16202a(c4205d, ((InterfaceC4726c) obj).mo9805a()) : obj instanceof Enum ? mo16202a(c4205d, ((Enum) obj).ordinal()) : m18586r(this.f17659d, c4205d, obj, z10);
        }
        byte[] bArr = (byte[]) obj;
        if (z10 && bArr.length == 0) {
            return this;
        }
        m18589x((m18574v(c4205d) << 3) | 2);
        m18589x(bArr.length);
        this.f17656a.write(bArr);
        return this;
    }

    @Override // p239q8.InterfaceC4207f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C4729f mo16202a(C4205d c4205d, int i10) {
        return m18580k(c4205d, i10, true);
    }

    /* renamed from: k */
    public C4729f m18580k(C4205d c4205d, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        InterfaceC4727d m18573u = m18573u(c4205d);
        int i11 = a.f17661a[m18573u.intEncoding().ordinal()];
        if (i11 == 1) {
            m18589x(m18573u.tag() << 3);
            m18589x(i10);
        } else if (i11 == 2) {
            m18589x(m18573u.tag() << 3);
            m18589x((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            m18589x((m18573u.tag() << 3) | 5);
            this.f17656a.write(m18572p(4).putInt(i10).array());
        }
        return this;
    }

    @Override // p239q8.InterfaceC4207f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C4729f mo16203b(C4205d c4205d, long j10) {
        return m18582m(c4205d, j10, true);
    }

    /* renamed from: m */
    public C4729f m18582m(C4205d c4205d, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        InterfaceC4727d m18573u = m18573u(c4205d);
        int i10 = a.f17661a[m18573u.intEncoding().ordinal()];
        if (i10 == 1) {
            m18589x(m18573u.tag() << 3);
            m18590y(j10);
        } else if (i10 == 2) {
            m18589x(m18573u.tag() << 3);
            m18590y((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            m18589x((m18573u.tag() << 3) | 1);
            this.f17656a.write(m18572p(8).putLong(j10).array());
        }
        return this;
    }

    @Override // p239q8.InterfaceC4207f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C4729f mo16206g(C4205d c4205d, boolean z10) {
        return m18584o(c4205d, z10, true);
    }

    /* renamed from: o */
    public C4729f m18584o(C4205d c4205d, boolean z10, boolean z11) {
        return m18580k(c4205d, z10 ? 1 : 0, z11);
    }

    /* renamed from: q */
    public final <T> long m18585q(InterfaceC4206e<T> interfaceC4206e, T t10) {
        C4725b c4725b = new C4725b();
        try {
            OutputStream outputStream = this.f17656a;
            this.f17656a = c4725b;
            try {
                interfaceC4206e.mo7324a(t10, this);
                this.f17656a = outputStream;
                long m18570a = c4725b.m18570a();
                c4725b.close();
                return m18570a;
            } catch (Throwable th) {
                this.f17656a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c4725b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: r */
    public final <T> C4729f m18586r(InterfaceC4206e<T> interfaceC4206e, C4205d c4205d, T t10, boolean z10) {
        long m18585q = m18585q(interfaceC4206e, t10);
        if (z10 && m18585q == 0) {
            return this;
        }
        m18589x((m18574v(c4205d) << 3) | 2);
        m18590y(m18585q);
        interfaceC4206e.mo7324a(t10, this);
        return this;
    }

    /* renamed from: s */
    public final <T> C4729f m18587s(InterfaceC4208g<T> interfaceC4208g, C4205d c4205d, T t10, boolean z10) {
        this.f17660e.m18600b(c4205d, z10);
        interfaceC4208g.mo7324a(t10, this.f17660e);
        return this;
    }

    /* renamed from: t */
    public C4729f m18588t(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC4206e<?> interfaceC4206e = this.f17657b.get(obj.getClass());
        if (interfaceC4206e != null) {
            interfaceC4206e.mo7324a(obj, this);
            return this;
        }
        throw new C4204c("No encoder for " + obj.getClass());
    }

    /* renamed from: x */
    public final void m18589x(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f17656a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f17656a.write(i10 & 127);
    }

    /* renamed from: y */
    public final void m18590y(long j10) {
        while (((-128) & j10) != 0) {
            this.f17656a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f17656a.write(((int) j10) & 127);
    }
}
