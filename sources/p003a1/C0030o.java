package p003a1;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import td.C4753m;

/* renamed from: a1.o */
/* loaded from: classes.dex */
public final class C0030o extends AbstractC0029n {

    /* renamed from: i */
    public final ViewGroup f63i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0030o(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        C4753m.m18653f(fragment, "fragment");
        C4753m.m18653f(viewGroup, "container");
        this.f63i = viewGroup;
    }
}
