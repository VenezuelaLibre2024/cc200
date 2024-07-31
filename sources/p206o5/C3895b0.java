package p206o5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o5.b0 */
/* loaded from: classes.dex */
public final class C3895b0 {

    /* renamed from: a */
    public final Map<String, String> f13972a = new HashMap();

    /* renamed from: b */
    public Map<String, String> f13973b;

    /* renamed from: a */
    public synchronized void m14767a(Map<String, String> map) {
        this.f13973b = null;
        this.f13972a.clear();
        this.f13972a.putAll(map);
    }

    /* renamed from: b */
    public synchronized Map<String, String> m14768b() {
        if (this.f13973b == null) {
            this.f13973b = Collections.unmodifiableMap(new HashMap(this.f13972a));
        }
        return this.f13973b;
    }
}
