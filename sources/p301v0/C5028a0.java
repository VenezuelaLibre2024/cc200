package p301v0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: v0.a0 */
/* loaded from: classes.dex */
public final class C5028a0 {

    /* renamed from: a */
    public static final Charset f18862a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f18863b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f18864c;

    /* renamed from: d */
    public static final ByteBuffer f18865d;

    /* renamed from: e */
    public static final AbstractC5051i f18866e;

    /* renamed from: v0.a0$a */
    /* loaded from: classes.dex */
    public interface a extends i<Boolean> {
    }

    /* renamed from: v0.a0$b */
    /* loaded from: classes.dex */
    public interface b extends i<Double> {
    }

    /* renamed from: v0.a0$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        int m19799a();
    }

    /* renamed from: v0.a0$d */
    /* loaded from: classes.dex */
    public interface d<T extends c> {
        /* renamed from: a */
        T m19800a(int i10);
    }

    /* renamed from: v0.a0$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        boolean m19801a(int i10);
    }

    /* renamed from: v0.a0$f */
    /* loaded from: classes.dex */
    public interface f extends i<Float> {
    }

    /* renamed from: v0.a0$g */
    /* loaded from: classes.dex */
    public interface g extends i<Integer> {
    }

    /* renamed from: v0.a0$h */
    /* loaded from: classes.dex */
    public interface h extends i<Long> {
    }

    /* renamed from: v0.a0$i */
    /* loaded from: classes.dex */
    public interface i<E> extends List<E>, RandomAccess {
        /* renamed from: H */
        boolean mo19802H();

        /* renamed from: f */
        void mo19803f();

        /* renamed from: i */
        i<E> mo19804i(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f18864c = bArr;
        f18865d = ByteBuffer.wrap(bArr);
        f18866e = AbstractC5051i.m19992h(bArr);
    }

    /* renamed from: a */
    public static <T> T m19789a(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: b */
    public static <T> T m19790b(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    /* renamed from: c */
    public static int m19791c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m19792d(byte[] bArr) {
        return m19793e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m19793e(byte[] bArr, int i10, int i11) {
        int m19797i = m19797i(i11, bArr, i10, i11);
        if (m19797i == 0) {
            return 1;
        }
        return m19797i;
    }

    /* renamed from: f */
    public static int m19794f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* renamed from: g */
    public static boolean m19795g(byte[] bArr) {
        return C5083s1.m20540m(bArr);
    }

    /* renamed from: h */
    public static Object m19796h(Object obj, Object obj2) {
        return ((InterfaceC5079r0) obj).mo20455c().mo19786j((InterfaceC5079r0) obj2).mo20460E();
    }

    /* renamed from: i */
    public static int m19797i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* renamed from: j */
    public static String m19798j(byte[] bArr) {
        return new String(bArr, f18862a);
    }
}
