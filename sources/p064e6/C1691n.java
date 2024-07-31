package p064e6;

import android.content.Intent;

/* renamed from: e6.n */
/* loaded from: classes.dex */
public class C1691n extends Exception {

    /* renamed from: h */
    public final Intent f6287h;

    public C1691n(String str, Intent intent) {
        super(str);
        this.f6287h = intent;
    }

    /* renamed from: a */
    public Intent m6750a() {
        return new Intent(this.f6287h);
    }
}
