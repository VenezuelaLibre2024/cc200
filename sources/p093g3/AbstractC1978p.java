package p093g3;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import p045d3.EnumC1533e;
import p093g3.C1966d;

@AutoValue
/* renamed from: g3.p */
/* loaded from: classes.dex */
public abstract class AbstractC1978p {

    @AutoValue.Builder
    /* renamed from: g3.p$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC1978p mo7967a();

        /* renamed from: b */
        public abstract a mo7968b(String str);

        /* renamed from: c */
        public abstract a mo7969c(byte[] bArr);

        /* renamed from: d */
        public abstract a mo7970d(EnumC1533e enumC1533e);
    }

    /* renamed from: a */
    public static a m7999a() {
        return new C1966d.b().mo7970d(EnumC1533e.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo7964b();

    /* renamed from: c */
    public abstract byte[] mo7965c();

    /* renamed from: d */
    public abstract EnumC1533e mo7966d();

    /* renamed from: e */
    public boolean m8000e() {
        return mo7965c() != null;
    }

    /* renamed from: f */
    public AbstractC1978p m8001f(EnumC1533e enumC1533e) {
        return m7999a().mo7968b(mo7964b()).mo7970d(enumC1533e).mo7969c(mo7965c()).mo7967a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo7964b();
        objArr[1] = mo7966d();
        objArr[2] = mo7965c() == null ? "" : Base64.encodeToString(mo7965c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
