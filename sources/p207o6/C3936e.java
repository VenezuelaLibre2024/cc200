package p207o6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: o6.e */
/* loaded from: classes.dex */
public final class C3936e {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m14935a(T t10) {
        return Collections.singletonList(t10);
    }

    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m14936b(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]) : Collections.emptyList();
    }
}
