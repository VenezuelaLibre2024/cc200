package p079f6;

import android.text.TextUtils;
import java.util.ArrayList;
import p064e6.C1667b;
import p096g6.C2002b;
import p108h6.C2394s;
import p285u.C4771a;

/* renamed from: f6.c */
/* loaded from: classes.dex */
public class C1843c extends Exception {

    /* renamed from: h */
    public final C4771a f7032h;

    public C1843c(C4771a c4771a) {
        this.f7032h = c4771a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (C2002b c2002b : this.f7032h.keySet()) {
            C1667b c1667b = (C1667b) C2394s.m9619l((C1667b) this.f7032h.get(c2002b));
            z10 &= !c1667b.m6681M();
            arrayList.add(c2002b.m8085b() + ": " + String.valueOf(c1667b));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
