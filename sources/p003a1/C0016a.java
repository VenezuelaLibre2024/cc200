package p003a1;

import androidx.fragment.app.Fragment;
import td.C4753m;

/* renamed from: a1.a */
/* loaded from: classes.dex */
public final class C0016a extends AbstractC0029n {

    /* renamed from: i */
    public final String f37i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0016a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        C4753m.m18653f(fragment, "fragment");
        C4753m.m18653f(str, "previousFragmentId");
        this.f37i = str;
    }
}
