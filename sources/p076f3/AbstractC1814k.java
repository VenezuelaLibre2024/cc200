package p076f3;

import com.google.auto.value.AutoValue;
import p076f3.C1808e;

@AutoValue
/* renamed from: f3.k */
/* loaded from: classes.dex */
public abstract class AbstractC1814k {

    @AutoValue.Builder
    /* renamed from: f3.k$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC1814k mo7334a();

        /* renamed from: b */
        public abstract a mo7335b(AbstractC1804a abstractC1804a);

        /* renamed from: c */
        public abstract a mo7336c(b bVar);
    }

    /* renamed from: f3.k$b */
    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* renamed from: h */
        public final int f6729h;

        b(int i10) {
            this.f6729h = i10;
        }
    }

    /* renamed from: a */
    public static a m7375a() {
        return new C1808e.b();
    }

    /* renamed from: b */
    public abstract AbstractC1804a mo7332b();

    /* renamed from: c */
    public abstract b mo7333c();
}
