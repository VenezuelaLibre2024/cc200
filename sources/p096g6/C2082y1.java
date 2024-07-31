package p096g6;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;
import p064e6.C1667b;
import p079f6.C1843c;
import p285u.C4771a;

/* renamed from: g6.y1 */
/* loaded from: classes.dex */
public final class C2082y1 {

    /* renamed from: a */
    public final C4771a f8174a;

    /* renamed from: b */
    public final C4771a f8175b;

    /* renamed from: c */
    public final TaskCompletionSource f8176c;

    /* renamed from: d */
    public int f8177d;

    /* renamed from: e */
    public boolean f8178e;

    /* renamed from: a */
    public final Set m8283a() {
        return this.f8174a.keySet();
    }

    /* renamed from: b */
    public final void m8284b(C2002b c2002b, C1667b c1667b, String str) {
        this.f8174a.put(c2002b, c1667b);
        this.f8175b.put(c2002b, str);
        this.f8177d--;
        if (!c1667b.m6681M()) {
            this.f8178e = true;
        }
        if (this.f8177d == 0) {
            if (!this.f8178e) {
                this.f8176c.setResult(this.f8175b);
            } else {
                this.f8176c.setException(new C1843c(this.f8174a));
            }
        }
    }
}
