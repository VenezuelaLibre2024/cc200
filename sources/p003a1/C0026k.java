package p003a1;

import androidx.fragment.app.Fragment;
import td.C4753m;

/* renamed from: a1.k */
/* loaded from: classes.dex */
public final class C0026k extends AbstractC0028m {

    /* renamed from: i */
    public final Fragment f59i;

    /* renamed from: j */
    public final int f60j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0026k(Fragment fragment, Fragment fragment2, int i10) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i10 + " for fragment " + fragment);
        C4753m.m18653f(fragment, "fragment");
        C4753m.m18653f(fragment2, "targetFragment");
        this.f59i = fragment2;
        this.f60j = i10;
    }
}
