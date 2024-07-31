package p210o9;

import android.content.Context;
import android.os.Bundle;
import be.C0550a;
import be.C0552c;
import be.EnumC0553d;
import gd.C2245s;
import p146jd.InterfaceC3281d;
import p210o9.InterfaceC3963h;
import td.C4747g;
import td.C4753m;

/* renamed from: o9.b */
/* loaded from: classes.dex */
public final class C3957b implements InterfaceC3963h {

    /* renamed from: b */
    public static final a f14210b = new a(null);

    /* renamed from: a */
    public final Bundle f14211a;

    /* renamed from: o9.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C3957b(Context context) {
        C4753m.m18653f(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f14211a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // p210o9.InterfaceC3963h
    /* renamed from: a */
    public Boolean mo14977a() {
        if (this.f14211a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f14211a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // p210o9.InterfaceC3963h
    /* renamed from: b */
    public C0550a mo14978b() {
        if (this.f14211a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return C0550a.m2752c(C0552c.m2780h(this.f14211a.getInt("firebase_sessions_sessions_restart_timeout"), EnumC0553d.SECONDS));
        }
        return null;
    }

    @Override // p210o9.InterfaceC3963h
    /* renamed from: c */
    public Double mo14979c() {
        if (this.f14211a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f14211a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // p210o9.InterfaceC3963h
    /* renamed from: d */
    public Object mo14980d(InterfaceC3281d<? super C2245s> interfaceC3281d) {
        return InterfaceC3963h.a.m15018a(this, interfaceC3281d);
    }
}
