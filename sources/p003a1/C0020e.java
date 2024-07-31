package p003a1;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import td.C4753m;

/* renamed from: a1.e */
/* loaded from: classes.dex */
public final class C0020e extends AbstractC0029n {

    /* renamed from: i */
    public final ViewGroup f58i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0020e(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        C4753m.m18653f(fragment, "fragment");
        this.f58i = viewGroup;
    }
}
