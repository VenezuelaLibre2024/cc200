package p264s3;

import android.annotation.SuppressLint;

/* renamed from: s3.j3 */
/* loaded from: classes.dex */
public interface InterfaceC4450j3 {
    @SuppressLint({"WrongConstant"})
    /* renamed from: G */
    static int m17367G(int i10) {
        return i10 & 7;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: k */
    static int m17368k(int i10) {
        return i10 & 384;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: n */
    static int m17369n(int i10, int i11, int i12, int i13, int i14) {
        return i10 | i11 | i12 | i13 | i14;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: o */
    static int m17370o(int i10) {
        return i10 & 64;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: p */
    static int m17371p(int i10) {
        return i10 & 32;
    }

    /* renamed from: r */
    static int m17372r(int i10, int i11, int i12) {
        return m17369n(i10, i11, i12, 0, 128);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: u */
    static int m17373u(int i10) {
        return i10 & 24;
    }

    /* renamed from: v */
    static int m17374v(int i10) {
        return m17372r(i10, 0, 0);
    }

    /* renamed from: a */
    int mo6372a(C4463m1 c4463m1);

    /* renamed from: b */
    String mo6374b();

    /* renamed from: i */
    int mo17215i();

    /* renamed from: w */
    int mo11678w();
}
