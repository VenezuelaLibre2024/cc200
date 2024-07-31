package p108h6;

import android.content.Context;
import android.content.res.Resources;
import p064e6.C1687l;

/* renamed from: h6.v */
/* loaded from: classes.dex */
public class C2403v {

    /* renamed from: a */
    public final Resources f9719a;

    /* renamed from: b */
    public final String f9720b;

    public C2403v(Context context) {
        C2394s.m9619l(context);
        Resources resources = context.getResources();
        this.f9719a = resources;
        this.f9720b = resources.getResourcePackageName(C1687l.f6278a);
    }

    /* renamed from: a */
    public String m9640a(String str) {
        int identifier = this.f9719a.getIdentifier(str, "string", this.f9720b);
        if (identifier == 0) {
            return null;
        }
        return this.f9719a.getString(identifier);
    }
}
