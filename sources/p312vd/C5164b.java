package p312vd;

import java.util.Random;
import td.C4753m;

/* renamed from: vd.b */
/* loaded from: classes2.dex */
public final class C5164b extends AbstractC5163a {

    /* renamed from: j */
    public final a f19498j = new a();

    /* renamed from: vd.b$a */
    /* loaded from: classes2.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p312vd.AbstractC5163a
    /* renamed from: c */
    public Random mo20919c() {
        Random random = this.f19498j.get();
        C4753m.m18652e(random, "implStorage.get()");
        return random;
    }
}
