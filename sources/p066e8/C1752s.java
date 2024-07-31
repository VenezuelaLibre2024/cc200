package p066e8;

import java.io.File;
import java.io.IOException;
import p023b8.C0515g;
import p141j8.C3262f;

/* renamed from: e8.s */
/* loaded from: classes.dex */
public class C1752s {

    /* renamed from: a */
    public final String f6471a;

    /* renamed from: b */
    public final C3262f f6472b;

    public C1752s(String str, C3262f c3262f) {
        this.f6471a = str;
        this.f6472b = c3262f;
    }

    /* renamed from: a */
    public boolean m7000a() {
        try {
            return m7001b().createNewFile();
        } catch (IOException e10) {
            C0515g.m2482f().m2487e("Error creating marker: " + this.f6471a, e10);
            return false;
        }
    }

    /* renamed from: b */
    public final File m7001b() {
        return this.f6472b.m11799e(this.f6471a);
    }

    /* renamed from: c */
    public boolean m7002c() {
        return m7001b().exists();
    }

    /* renamed from: d */
    public boolean m7003d() {
        return m7001b().delete();
    }
}
