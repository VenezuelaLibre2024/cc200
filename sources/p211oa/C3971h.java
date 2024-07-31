package p211oa;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p129ia.C2674f;

/* renamed from: oa.h */
/* loaded from: classes.dex */
public final class C3971h {

    /* renamed from: a */
    public StringBuilder f14324a;

    /* renamed from: b */
    public StringBuilder f14325b;

    /* renamed from: c */
    public Charset f14326c;

    public C3971h() {
        this.f14326c = StandardCharsets.ISO_8859_1;
        this.f14324a = new StringBuilder();
    }

    public C3971h(int i10) {
        this.f14326c = StandardCharsets.ISO_8859_1;
        this.f14324a = new StringBuilder(i10);
    }

    /* renamed from: a */
    public void m15072a(byte b10) {
        this.f14324a.append((char) (b10 & 255));
    }

    /* renamed from: b */
    public void m15073b(char c10) {
        this.f14324a.append((char) (c10 & 255));
    }

    /* renamed from: c */
    public void m15074c(int i10) {
        m15075d(String.valueOf(i10));
    }

    /* renamed from: d */
    public void m15075d(String str) {
        this.f14324a.append(str);
    }

    /* renamed from: e */
    public void m15076e(StringBuilder sb2) {
        m15078g();
        this.f14325b.append((CharSequence) sb2);
    }

    /* renamed from: f */
    public void m15077f(int i10) {
        m15078g();
        EnumC3967d m15052b = EnumC3967d.m15052b(i10);
        if (m15052b == null) {
            throw C2674f.m10883a();
        }
        this.f14326c = m15052b.m15053c();
    }

    /* renamed from: g */
    public final void m15078g() {
        StringBuilder sb2;
        if (this.f14326c.equals(StandardCharsets.ISO_8859_1)) {
            if (this.f14324a.length() > 0) {
                StringBuilder sb3 = this.f14325b;
                if (sb3 == null) {
                    this.f14325b = this.f14324a;
                    sb2 = new StringBuilder();
                } else {
                    sb3.append((CharSequence) this.f14324a);
                    sb2 = new StringBuilder();
                }
                this.f14324a = sb2;
                return;
            }
            return;
        }
        if (this.f14324a.length() > 0) {
            byte[] bytes = this.f14324a.toString().getBytes(StandardCharsets.ISO_8859_1);
            this.f14324a = new StringBuilder();
            StringBuilder sb4 = this.f14325b;
            if (sb4 == null) {
                this.f14325b = new StringBuilder(new String(bytes, this.f14326c));
            } else {
                sb4.append(new String(bytes, this.f14326c));
            }
        }
    }

    /* renamed from: h */
    public boolean m15079h() {
        StringBuilder sb2;
        return this.f14324a.length() == 0 && ((sb2 = this.f14325b) == null || sb2.length() == 0);
    }

    /* renamed from: i */
    public int m15080i() {
        return toString().length();
    }

    public String toString() {
        m15078g();
        StringBuilder sb2 = this.f14325b;
        return sb2 == null ? "" : sb2.toString();
    }
}
