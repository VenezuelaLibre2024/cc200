package p237q6;

import android.content.Context;

/* renamed from: q6.c */
/* loaded from: classes.dex */
public class C4195c {

    /* renamed from: b */
    public static final C4195c f15146b = new C4195c();

    /* renamed from: a */
    public C4194b f15147a = null;

    /* renamed from: a */
    public static C4194b m16183a(Context context) {
        return f15146b.m16184b(context);
    }

    /* renamed from: b */
    public final synchronized C4194b m16184b(Context context) {
        if (this.f15147a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f15147a = new C4194b(context);
        }
        return this.f15147a;
    }
}
