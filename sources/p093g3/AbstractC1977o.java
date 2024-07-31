package p093g3;

import com.google.auto.value.AutoValue;
import p045d3.AbstractC1532d;
import p045d3.C1531c;
import p045d3.InterfaceC1535g;
import p093g3.C1965c;

@AutoValue
/* renamed from: g3.o */
/* loaded from: classes.dex */
public abstract class AbstractC1977o {

    @AutoValue.Builder
    /* renamed from: g3.o$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC1977o mo7958a();

        /* renamed from: b */
        public abstract a mo7959b(C1531c c1531c);

        /* renamed from: c */
        public abstract a mo7960c(AbstractC1532d<?> abstractC1532d);

        /* renamed from: d */
        public abstract a mo7961d(InterfaceC1535g<?, byte[]> interfaceC1535g);

        /* renamed from: e */
        public abstract a mo7962e(AbstractC1978p abstractC1978p);

        /* renamed from: f */
        public abstract a mo7963f(String str);
    }

    /* renamed from: a */
    public static a m7997a() {
        return new C1965c.b();
    }

    /* renamed from: b */
    public abstract C1531c mo7953b();

    /* renamed from: c */
    public abstract AbstractC1532d<?> mo7954c();

    /* renamed from: d */
    public byte[] m7998d() {
        return mo7955e().apply(mo7954c().mo6228b());
    }

    /* renamed from: e */
    public abstract InterfaceC1535g<?, byte[]> mo7955e();

    /* renamed from: f */
    public abstract AbstractC1978p mo7956f();

    /* renamed from: g */
    public abstract String mo7957g();
}
