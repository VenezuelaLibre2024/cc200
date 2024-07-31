package p181m5;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p109h7.C2420c;

/* renamed from: m5.d */
/* loaded from: classes.dex */
public final class C3529d {

    /* renamed from: f */
    public int f12372f;

    /* renamed from: h */
    public int f12374h;

    /* renamed from: o */
    public float f12381o;

    /* renamed from: a */
    public String f12367a = "";

    /* renamed from: b */
    public String f12368b = "";

    /* renamed from: c */
    public Set<String> f12369c = Collections.emptySet();

    /* renamed from: d */
    public String f12370d = "";

    /* renamed from: e */
    public String f12371e = null;

    /* renamed from: g */
    public boolean f12373g = false;

    /* renamed from: i */
    public boolean f12375i = false;

    /* renamed from: j */
    public int f12376j = -1;

    /* renamed from: k */
    public int f12377k = -1;

    /* renamed from: l */
    public int f12378l = -1;

    /* renamed from: m */
    public int f12379m = -1;

    /* renamed from: n */
    public int f12380n = -1;

    /* renamed from: p */
    public int f12382p = -1;

    /* renamed from: q */
    public boolean f12383q = false;

    /* renamed from: B */
    public static int m13098B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    /* renamed from: A */
    public C3529d m13099A(boolean z10) {
        this.f12377k = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public int m13100a() {
        if (this.f12375i) {
            return this.f12374h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public boolean m13101b() {
        return this.f12383q;
    }

    /* renamed from: c */
    public int m13102c() {
        if (this.f12373g) {
            return this.f12372f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: d */
    public String m13103d() {
        return this.f12371e;
    }

    /* renamed from: e */
    public float m13104e() {
        return this.f12381o;
    }

    /* renamed from: f */
    public int m13105f() {
        return this.f12380n;
    }

    /* renamed from: g */
    public int m13106g() {
        return this.f12382p;
    }

    /* renamed from: h */
    public int m13107h(String str, String str2, Set<String> set, String str3) {
        if (this.f12367a.isEmpty() && this.f12368b.isEmpty() && this.f12369c.isEmpty() && this.f12370d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int m13098B = m13098B(m13098B(m13098B(0, this.f12367a, str, 1073741824), this.f12368b, str2, 2), this.f12370d, str3, 4);
        if (m13098B == -1 || !set.containsAll(this.f12369c)) {
            return 0;
        }
        return m13098B + (this.f12369c.size() * 4);
    }

    /* renamed from: i */
    public int m13108i() {
        int i10 = this.f12378l;
        if (i10 == -1 && this.f12379m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f12379m == 1 ? 2 : 0);
    }

    /* renamed from: j */
    public boolean m13109j() {
        return this.f12375i;
    }

    /* renamed from: k */
    public boolean m13110k() {
        return this.f12373g;
    }

    /* renamed from: l */
    public boolean m13111l() {
        return this.f12376j == 1;
    }

    /* renamed from: m */
    public boolean m13112m() {
        return this.f12377k == 1;
    }

    /* renamed from: n */
    public C3529d m13113n(int i10) {
        this.f12374h = i10;
        this.f12375i = true;
        return this;
    }

    /* renamed from: o */
    public C3529d m13114o(boolean z10) {
        this.f12378l = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public C3529d m13115p(boolean z10) {
        this.f12383q = z10;
        return this;
    }

    /* renamed from: q */
    public C3529d m13116q(int i10) {
        this.f12372f = i10;
        this.f12373g = true;
        return this;
    }

    /* renamed from: r */
    public C3529d m13117r(String str) {
        this.f12371e = str == null ? null : C2420c.m9665e(str);
        return this;
    }

    /* renamed from: s */
    public C3529d m13118s(float f10) {
        this.f12381o = f10;
        return this;
    }

    /* renamed from: t */
    public C3529d m13119t(int i10) {
        this.f12380n = i10;
        return this;
    }

    /* renamed from: u */
    public C3529d m13120u(boolean z10) {
        this.f12379m = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: v */
    public C3529d m13121v(int i10) {
        this.f12382p = i10;
        return this;
    }

    /* renamed from: w */
    public void m13122w(String[] strArr) {
        this.f12369c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: x */
    public void m13123x(String str) {
        this.f12367a = str;
    }

    /* renamed from: y */
    public void m13124y(String str) {
        this.f12368b = str;
    }

    /* renamed from: z */
    public void m13125z(String str) {
        this.f12370d = str;
    }
}
