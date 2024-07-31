package p362z1;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p285u.C4771a;

/* renamed from: z1.b */
/* loaded from: classes.dex */
public abstract class AbstractC5943b {

    /* renamed from: a */
    public final C4771a<String, Method> f22096a;

    /* renamed from: b */
    public final C4771a<String, Method> f22097b;

    /* renamed from: c */
    public final C4771a<String, Class> f22098c;

    public AbstractC5943b(C4771a<String, Method> c4771a, C4771a<String, Method> c4771a2, C4771a<String, Class> c4771a3) {
        this.f22096a = c4771a;
        this.f22097b = c4771a2;
        this.f22098c = c4771a3;
    }

    /* renamed from: A */
    public abstract void mo23796A(byte[] bArr);

    /* renamed from: B */
    public void m23797B(byte[] bArr, int i10) {
        mo23832w(i10);
        mo23796A(bArr);
    }

    /* renamed from: C */
    public abstract void mo23798C(CharSequence charSequence);

    /* renamed from: D */
    public void m23799D(CharSequence charSequence, int i10) {
        mo23832w(i10);
        mo23798C(charSequence);
    }

    /* renamed from: E */
    public abstract void mo23800E(int i10);

    /* renamed from: F */
    public void m23801F(int i10, int i11) {
        mo23832w(i11);
        mo23800E(i10);
    }

    /* renamed from: G */
    public abstract void mo23802G(Parcelable parcelable);

    /* renamed from: H */
    public void m23803H(Parcelable parcelable, int i10) {
        mo23832w(i10);
        mo23802G(parcelable);
    }

    /* renamed from: I */
    public abstract void mo23804I(String str);

    /* renamed from: J */
    public void m23805J(String str, int i10) {
        mo23832w(i10);
        mo23804I(str);
    }

    /* renamed from: K */
    public <T extends InterfaceC5945d> void m23806K(T t10, AbstractC5943b abstractC5943b) {
        try {
            m23814e(t10.getClass()).invoke(null, t10, abstractC5943b);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
            throw ((RuntimeException) e13.getCause());
        }
    }

    /* renamed from: L */
    public void m23807L(InterfaceC5945d interfaceC5945d) {
        if (interfaceC5945d == null) {
            mo23804I(null);
            return;
        }
        m23809N(interfaceC5945d);
        AbstractC5943b mo23811b = mo23811b();
        m23806K(interfaceC5945d, mo23811b);
        mo23811b.mo23810a();
    }

    /* renamed from: M */
    public void m23808M(InterfaceC5945d interfaceC5945d, int i10) {
        mo23832w(i10);
        m23807L(interfaceC5945d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    public final void m23809N(InterfaceC5945d interfaceC5945d) {
        try {
            mo23804I(m23812c(interfaceC5945d.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(interfaceC5945d.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    /* renamed from: a */
    public abstract void mo23810a();

    /* renamed from: b */
    public abstract AbstractC5943b mo23811b();

    /* renamed from: c */
    public final Class m23812c(Class<? extends InterfaceC5945d> cls) {
        Class cls2 = this.f22098c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f22098c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    public final Method m23813d(String str) {
        Method method = this.f22096a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC5943b.class.getClassLoader()).getDeclaredMethod("read", AbstractC5943b.class);
        this.f22096a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final Method m23814e(Class cls) {
        Method method = this.f22097b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class m23812c = m23812c(cls);
        System.currentTimeMillis();
        Method declaredMethod = m23812c.getDeclaredMethod("write", cls, AbstractC5943b.class);
        this.f22097b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: f */
    public boolean m23815f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo23816g();

    /* renamed from: h */
    public boolean m23817h(boolean z10, int i10) {
        return !mo23822m(i10) ? z10 : mo23816g();
    }

    /* renamed from: i */
    public abstract byte[] mo23818i();

    /* renamed from: j */
    public byte[] m23819j(byte[] bArr, int i10) {
        return !mo23822m(i10) ? bArr : mo23818i();
    }

    /* renamed from: k */
    public abstract CharSequence mo23820k();

    /* renamed from: l */
    public CharSequence m23821l(CharSequence charSequence, int i10) {
        return !mo23822m(i10) ? charSequence : mo23820k();
    }

    /* renamed from: m */
    public abstract boolean mo23822m(int i10);

    /* renamed from: n */
    public <T extends InterfaceC5945d> T m23823n(String str, AbstractC5943b abstractC5943b) {
        try {
            return (T) m23813d(str).invoke(null, abstractC5943b);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    /* renamed from: o */
    public abstract int mo23824o();

    /* renamed from: p */
    public int m23825p(int i10, int i11) {
        return !mo23822m(i11) ? i10 : mo23824o();
    }

    /* renamed from: q */
    public abstract <T extends Parcelable> T mo23826q();

    /* renamed from: r */
    public <T extends Parcelable> T m23827r(T t10, int i10) {
        return !mo23822m(i10) ? t10 : (T) mo23826q();
    }

    /* renamed from: s */
    public abstract String mo23828s();

    /* renamed from: t */
    public String m23829t(String str, int i10) {
        return !mo23822m(i10) ? str : mo23828s();
    }

    /* renamed from: u */
    public <T extends InterfaceC5945d> T m23830u() {
        String mo23828s = mo23828s();
        if (mo23828s == null) {
            return null;
        }
        return (T) m23823n(mo23828s, mo23811b());
    }

    /* renamed from: v */
    public <T extends InterfaceC5945d> T m23831v(T t10, int i10) {
        return !mo23822m(i10) ? t10 : (T) m23830u();
    }

    /* renamed from: w */
    public abstract void mo23832w(int i10);

    /* renamed from: x */
    public void m23833x(boolean z10, boolean z11) {
    }

    /* renamed from: y */
    public abstract void mo23834y(boolean z10);

    /* renamed from: z */
    public void m23835z(boolean z10, int i10) {
        mo23832w(i10);
        mo23834y(z10);
    }
}
