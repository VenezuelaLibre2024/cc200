package p059e1;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import td.C4753m;

/* renamed from: e1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1637a {

    /* renamed from: a */
    public final Map<b<?>, Object> f6040a = new LinkedHashMap();

    /* renamed from: e1.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1637a {

        /* renamed from: b */
        public static final a f6041b = new a();

        @Override // p059e1.AbstractC1637a
        /* renamed from: a */
        public <T> T mo6514a(b<T> bVar) {
            C4753m.m18653f(bVar, Constants.KEY);
            return null;
        }
    }

    /* renamed from: e1.a$b */
    /* loaded from: classes.dex */
    public interface b<T> {
    }

    /* renamed from: a */
    public abstract <T> T mo6514a(b<T> bVar);

    /* renamed from: b */
    public final Map<b<?>, Object> m6515b() {
        return this.f6040a;
    }
}
