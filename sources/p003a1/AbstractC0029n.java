package p003a1;

import androidx.fragment.app.Fragment;
import td.C4753m;

/* renamed from: a1.n */
/* loaded from: classes.dex */
public abstract class AbstractC0029n extends RuntimeException {

    /* renamed from: h */
    public final Fragment f62h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0029n(Fragment fragment, String str) {
        super(str);
        C4753m.m18653f(fragment, "fragment");
        this.f62h = fragment;
    }

    /* renamed from: a */
    public final Fragment m120a() {
        return this.f62h;
    }
}
