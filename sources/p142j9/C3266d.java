package p142j9;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: j9.d */
/* loaded from: classes.dex */
public class C3266d {

    /* renamed from: b */
    public static volatile C3266d f11395b;

    /* renamed from: a */
    public final Set<AbstractC3268f> f11396a = new HashSet();

    /* renamed from: a */
    public static C3266d m11818a() {
        C3266d c3266d = f11395b;
        if (c3266d == null) {
            synchronized (C3266d.class) {
                c3266d = f11395b;
                if (c3266d == null) {
                    c3266d = new C3266d();
                    f11395b = c3266d;
                }
            }
        }
        return c3266d;
    }

    /* renamed from: b */
    public Set<AbstractC3268f> m11819b() {
        Set<AbstractC3268f> unmodifiableSet;
        synchronized (this.f11396a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f11396a);
        }
        return unmodifiableSet;
    }
}
