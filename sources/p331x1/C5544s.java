package p331x1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: x1.s */
/* loaded from: classes.dex */
public class C5544s {

    /* renamed from: b */
    public View f20798b;

    /* renamed from: a */
    public final Map<String, Object> f20797a = new HashMap();

    /* renamed from: c */
    public final ArrayList<AbstractC5537m> f20799c = new ArrayList<>();

    @Deprecated
    public C5544s() {
    }

    public C5544s(View view) {
        this.f20798b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5544s)) {
            return false;
        }
        C5544s c5544s = (C5544s) obj;
        return this.f20798b == c5544s.f20798b && this.f20797a.equals(c5544s.f20797a);
    }

    public int hashCode() {
        return (this.f20798b.hashCode() * 31) + this.f20797a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f20798b + "\n") + "    values:";
        for (String str2 : this.f20797a.keySet()) {
            str = str + "    " + str2 + ": " + this.f20797a.get(str2) + "\n";
        }
        return str;
    }
}
