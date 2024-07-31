package p321w7;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p108h6.C2394s;
import p337x7.C5706p;

/* renamed from: w7.w0 */
/* loaded from: classes.dex */
public final class C5418w0 {
    /* renamed from: a */
    public static Task<InterfaceC5424y0> m21562a(AbstractC5385l0 abstractC5385l0) {
        C2394s.m9619l(abstractC5385l0);
        C5706p c5706p = (C5706p) abstractC5385l0;
        return FirebaseAuth.getInstance(c5706p.m22795I().mo21430d0()).m5224Y(c5706p);
    }

    /* renamed from: b */
    public static C5415v0 m21563b(InterfaceC5424y0 interfaceC5424y0, String str) {
        return new C5415v0((String) C2394s.m9619l(str), (InterfaceC5424y0) C2394s.m9619l(interfaceC5424y0), null);
    }

    /* renamed from: c */
    public static C5415v0 m21564c(String str, String str2) {
        return new C5415v0((String) C2394s.m9619l(str2), null, (String) C2394s.m9619l(str));
    }
}
