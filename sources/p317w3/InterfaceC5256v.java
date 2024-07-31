package p317w3;

import android.os.Looper;
import p264s3.C4463m1;
import p275t3.C4674s1;
import p317w3.InterfaceC5248n;
import p317w3.InterfaceC5255u;
import p317w3.InterfaceC5256v;

/* renamed from: w3.v */
/* loaded from: classes.dex */
public interface InterfaceC5256v {

    /* renamed from: a */
    public static final InterfaceC5256v f19934a;

    /* renamed from: b */
    @Deprecated
    public static final InterfaceC5256v f19935b;

    /* renamed from: w3.v$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5256v {
        @Override // p317w3.InterfaceC5256v
        /* renamed from: b */
        public InterfaceC5248n mo21229b(InterfaceC5255u.a aVar, C4463m1 c4463m1) {
            if (c4463m1.f16509v == null) {
                return null;
            }
            return new C5224a0(new InterfaceC5248n.a(new C5244k0(1), 6001));
        }

        @Override // p317w3.InterfaceC5256v
        /* renamed from: d */
        public void mo21231d(Looper looper, C4674s1 c4674s1) {
        }

        @Override // p317w3.InterfaceC5256v
        /* renamed from: e */
        public int mo21232e(C4463m1 c4463m1) {
            return c4463m1.f16509v != null ? 1 : 0;
        }
    }

    /* renamed from: w3.v$b */
    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a */
        public static final b f19936a = new b() { // from class: w3.w
            @Override // p317w3.InterfaceC5256v.b
            public final void release() {
                InterfaceC5256v.b.m21292a();
            }
        };

        /* renamed from: a */
        static /* synthetic */ void m21292a() {
        }

        void release();
    }

    static {
        a aVar = new a();
        f19934a = aVar;
        f19935b = aVar;
    }

    /* renamed from: a */
    default void mo21228a() {
    }

    /* renamed from: b */
    InterfaceC5248n mo21229b(InterfaceC5255u.a aVar, C4463m1 c4463m1);

    /* renamed from: c */
    default b mo21230c(InterfaceC5255u.a aVar, C4463m1 c4463m1) {
        return b.f19936a;
    }

    /* renamed from: d */
    void mo21231d(Looper looper, C4674s1 c4674s1);

    /* renamed from: e */
    int mo21232e(C4463m1 c4463m1);

    default void release() {
    }
}
