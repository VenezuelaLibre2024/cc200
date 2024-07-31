package p034c7;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import p064e6.C1687l;
import p108h6.C2394s;

/* renamed from: c7.e6 */
/* loaded from: classes.dex */
public final class C0683e6 {

    /* renamed from: a */
    public final Resources f2892a;

    /* renamed from: b */
    public final String f2893b;

    public C0683e6(Context context, String str) {
        C2394s.m9619l(context);
        this.f2892a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f2893b = m3161a(context);
        } else {
            this.f2893b = str;
        }
    }

    /* renamed from: a */
    public static String m3161a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C1687l.f6278a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public final String m3162b(String str) {
        int identifier = this.f2892a.getIdentifier(str, "string", this.f2893b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f2892a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
