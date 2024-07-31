package p049d7;

import com.google.android.gms.common.api.Scope;
import io.flutter.plugins.firebase.auth.Constants;
import p079f6.C1841a;

/* renamed from: d7.e */
/* loaded from: classes.dex */
public final class C1598e {

    /* renamed from: a */
    public static final C1841a.g f5922a;

    /* renamed from: b */
    public static final C1841a.g f5923b;

    /* renamed from: c */
    public static final C1841a.a f5924c;

    /* renamed from: d */
    public static final C1841a.a f5925d;

    /* renamed from: e */
    public static final Scope f5926e;

    /* renamed from: f */
    public static final Scope f5927f;

    /* renamed from: g */
    public static final C1841a f5928g;

    /* renamed from: h */
    public static final C1841a f5929h;

    static {
        C1841a.g gVar = new C1841a.g();
        f5922a = gVar;
        C1841a.g gVar2 = new C1841a.g();
        f5923b = gVar2;
        C1595b c1595b = new C1595b();
        f5924c = c1595b;
        C1596c c1596c = new C1596c();
        f5925d = c1596c;
        f5926e = new Scope("profile");
        f5927f = new Scope(Constants.EMAIL);
        f5928g = new C1841a("SignIn.API", c1595b, gVar);
        f5929h = new C1841a("SignIn.INTERNAL_API", c1596c, gVar2);
    }
}
