package p353y7;

import java.util.Arrays;
import java.util.List;

/* renamed from: y7.r */
/* loaded from: classes.dex */
public class C5886r extends C5887s {

    /* renamed from: h */
    public final List<C5867c<?>> f21922h;

    public C5886r(List<C5867c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f21922h = list;
    }
}
