package p072f;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.C0170a;
import td.C4747g;
import td.C4753m;

/* renamed from: f.f */
/* loaded from: classes.dex */
public final class C1798f extends AbstractC1793a<Intent, C0170a> {

    /* renamed from: a */
    public static final a f6607a = new a(null);

    /* renamed from: f.f$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    @Override // p072f.AbstractC1793a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo1750a(Context context, Intent intent) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(intent, "input");
        return intent;
    }

    @Override // p072f.AbstractC1793a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0170a mo1751c(int i10, Intent intent) {
        return new C0170a(i10, intent);
    }
}
