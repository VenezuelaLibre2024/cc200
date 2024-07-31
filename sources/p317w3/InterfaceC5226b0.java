package p317w3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p275t3.C4674s1;
import p304v3.InterfaceC5105b;
import p317w3.C5247m;

/* renamed from: w3.b0 */
/* loaded from: classes.dex */
public interface InterfaceC5226b0 {

    /* renamed from: w3.b0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final byte[] f19793a;

        /* renamed from: b */
        public final String f19794b;

        /* renamed from: c */
        public final int f19795c;

        public a(byte[] bArr, String str, int i10) {
            this.f19793a = bArr;
            this.f19794b = str;
            this.f19795c = i10;
        }

        /* renamed from: a */
        public byte[] m21139a() {
            return this.f19793a;
        }

        /* renamed from: b */
        public String m21140b() {
            return this.f19794b;
        }
    }

    /* renamed from: w3.b0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo21141a(InterfaceC5226b0 interfaceC5226b0, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* renamed from: w3.b0$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        InterfaceC5226b0 mo21142a(UUID uuid);
    }

    /* renamed from: w3.b0$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final byte[] f19796a;

        /* renamed from: b */
        public final String f19797b;

        public d(byte[] bArr, String str) {
            this.f19796a = bArr;
            this.f19797b = str;
        }

        /* renamed from: a */
        public byte[] m21143a() {
            return this.f19796a;
        }

        /* renamed from: b */
        public String m21144b() {
            return this.f19797b;
        }
    }

    /* renamed from: a */
    Map<String, String> mo21126a(byte[] bArr);

    /* renamed from: b */
    d mo21127b();

    /* renamed from: c */
    InterfaceC5105b mo21128c(byte[] bArr);

    /* renamed from: d */
    byte[] mo21129d();

    /* renamed from: e */
    void mo21130e(b bVar);

    /* renamed from: f */
    default void mo21131f(byte[] bArr, C4674s1 c4674s1) {
    }

    /* renamed from: g */
    boolean mo21132g(byte[] bArr, String str);

    /* renamed from: h */
    void mo21133h(byte[] bArr, byte[] bArr2);

    /* renamed from: i */
    void mo21134i(byte[] bArr);

    /* renamed from: j */
    byte[] mo21135j(byte[] bArr, byte[] bArr2);

    /* renamed from: k */
    void mo21136k(byte[] bArr);

    /* renamed from: l */
    a mo21137l(byte[] bArr, List<C5247m.b> list, int i10, HashMap<String, String> hashMap);

    /* renamed from: m */
    int mo21138m();

    void release();
}
