package p185m9;

import ae.C0108n;
import android.util.Base64;

/* renamed from: m9.v */
/* loaded from: classes.dex */
public final class C3587v {

    /* renamed from: a */
    public static final C3587v f12606a = new C3587v();

    /* renamed from: b */
    public static final String f12607b;

    /* renamed from: c */
    public static final String f12608c;

    /* renamed from: d */
    public static final String f12609d;

    static {
        String encodeToString = Base64.encodeToString(C0108n.m424j(C3586u.f12605a.m13290e()), 10);
        f12607b = encodeToString;
        f12608c = "firebase_session_" + encodeToString + "_data";
        f12609d = "firebase_session_" + encodeToString + "_settings";
    }

    /* renamed from: a */
    public final String m13291a() {
        return f12608c;
    }

    /* renamed from: b */
    public final String m13292b() {
        return f12609d;
    }
}
