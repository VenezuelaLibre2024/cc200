package p286u0;

import gd.C2235i;
import gd.C2245s;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p115hd.C2510v;
import p146jd.InterfaceC3281d;
import p246r0.C4257a;
import p246r0.InterfaceC4267k;
import p272t0.C4604d;
import p272t0.C4606f;
import p272t0.C4607g;
import p272t0.C4608h;
import p286u0.AbstractC4782d;
import td.C4753m;

/* renamed from: u0.h */
/* loaded from: classes.dex */
public final class C4786h implements InterfaceC4267k<AbstractC4782d> {

    /* renamed from: a */
    public static final C4786h f17818a = new C4786h();

    /* renamed from: b */
    public static final String f17819b = "preferences_pb";

    /* renamed from: u0.h$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17820a;

        static {
            int[] iArr = new int[C4608h.b.values().length];
            iArr[C4608h.b.BOOLEAN.ordinal()] = 1;
            iArr[C4608h.b.FLOAT.ordinal()] = 2;
            iArr[C4608h.b.DOUBLE.ordinal()] = 3;
            iArr[C4608h.b.INTEGER.ordinal()] = 4;
            iArr[C4608h.b.LONG.ordinal()] = 5;
            iArr[C4608h.b.STRING.ordinal()] = 6;
            iArr[C4608h.b.STRING_SET.ordinal()] = 7;
            iArr[C4608h.b.VALUE_NOT_SET.ordinal()] = 8;
            f17820a = iArr;
        }
    }

    @Override // p246r0.InterfaceC4267k
    /* renamed from: c */
    public Object mo16357c(InputStream inputStream, InterfaceC3281d<? super AbstractC4782d> interfaceC3281d) {
        C4606f m18135a = C4604d.f17261a.m18135a(inputStream);
        C4779a m18794b = C4783e.m18794b(new AbstractC4782d.b[0]);
        Map<String, C4608h> m18141O = m18135a.m18141O();
        C4753m.m18652e(m18141O, "preferencesProto.preferencesMap");
        for (Map.Entry<String, C4608h> entry : m18141O.entrySet()) {
            String key = entry.getKey();
            C4608h value = entry.getValue();
            C4786h c4786h = f17818a;
            C4753m.m18652e(key, "name");
            C4753m.m18652e(value, "value");
            c4786h.m18804d(key, value, m18794b);
        }
        return m18794b.m18789d();
    }

    /* renamed from: d */
    public final void m18804d(String str, C4608h c4608h, C4779a c4779a) {
        Object m18795a;
        Object valueOf;
        C4608h.b m18171b0 = c4608h.m18171b0();
        switch (m18171b0 == null ? -1 : a.f17820a[m18171b0.ordinal()]) {
            case -1:
                throw new C4257a("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new C2235i();
            case 1:
                m18795a = C4784f.m18795a(str);
                valueOf = Boolean.valueOf(c4608h.m18164T());
                break;
            case 2:
                m18795a = C4784f.m18797c(str);
                valueOf = Float.valueOf(c4608h.m18166W());
                break;
            case 3:
                m18795a = C4784f.m18796b(str);
                valueOf = Double.valueOf(c4608h.m18165V());
                break;
            case 4:
                m18795a = C4784f.m18798d(str);
                valueOf = Integer.valueOf(c4608h.m18167X());
                break;
            case 5:
                m18795a = C4784f.m18799e(str);
                valueOf = Long.valueOf(c4608h.m18168Y());
                break;
            case 6:
                m18795a = C4784f.m18800f(str);
                valueOf = c4608h.m18169Z();
                C4753m.m18652e(valueOf, "value.string");
                break;
            case 7:
                m18795a = C4784f.m18801g(str);
                List<String> m18152Q = c4608h.m18170a0().m18152Q();
                C4753m.m18652e(m18152Q, "value.stringSet.stringsList");
                valueOf = C2510v.m10012O(m18152Q);
                break;
            case 8:
                throw new C4257a("Value not set.", null, 2, null);
        }
        c4779a.m18782i(m18795a, valueOf);
    }

    @Override // p246r0.InterfaceC4267k
    /* renamed from: e */
    public AbstractC4782d mo16356b() {
        return C4783e.m18793a();
    }

    /* renamed from: f */
    public final String m18806f() {
        return f17819b;
    }

    /* renamed from: g */
    public final C4608h m18807g(Object obj) {
        C4608h mo20461a;
        String str;
        if (obj instanceof Boolean) {
            mo20461a = C4608h.m18163c0().m18184y(((Boolean) obj).booleanValue()).mo20461a();
            str = "newBuilder().setBoolean(value).build()";
        } else if (obj instanceof Float) {
            mo20461a = C4608h.m18163c0().m18179A(((Number) obj).floatValue()).mo20461a();
            str = "newBuilder().setFloat(value).build()";
        } else if (obj instanceof Double) {
            mo20461a = C4608h.m18163c0().m18185z(((Number) obj).doubleValue()).mo20461a();
            str = "newBuilder().setDouble(value).build()";
        } else if (obj instanceof Integer) {
            mo20461a = C4608h.m18163c0().m18180B(((Number) obj).intValue()).mo20461a();
            str = "newBuilder().setInteger(value).build()";
        } else if (obj instanceof Long) {
            mo20461a = C4608h.m18163c0().m18181C(((Number) obj).longValue()).mo20461a();
            str = "newBuilder().setLong(value).build()";
        } else if (obj instanceof String) {
            mo20461a = C4608h.m18163c0().m18182D((String) obj).mo20461a();
            str = "newBuilder().setString(value).build()";
        } else {
            if (!(obj instanceof Set)) {
                throw new IllegalStateException(C4753m.m18660m("PreferencesSerializer does not support type: ", obj.getClass().getName()));
            }
            mo20461a = C4608h.m18163c0().m18183F(C4607g.m18149R().m18153y((Set) obj)).mo20461a();
            str = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
        }
        C4753m.m18652e(mo20461a, str);
        return mo20461a;
    }

    @Override // p246r0.InterfaceC4267k
    /* renamed from: h */
    public Object mo16355a(AbstractC4782d abstractC4782d, OutputStream outputStream, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        Map<AbstractC4782d.a<?>, Object> mo18776a = abstractC4782d.mo18776a();
        C4606f.a m18138R = C4606f.m18138R();
        for (Map.Entry<AbstractC4782d.a<?>, Object> entry : mo18776a.entrySet()) {
            m18138R.m18145y(entry.getKey().m18790a(), m18807g(entry.getValue()));
        }
        m18138R.mo20461a().m19782q(outputStream);
        return C2245s.f8873a;
    }
}
