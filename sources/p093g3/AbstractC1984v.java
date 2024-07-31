package p093g3;

import android.content.Context;
import java.io.Closeable;
import p204o3.InterfaceC3848d;

/* renamed from: g3.v */
/* loaded from: classes.dex */
public abstract class AbstractC1984v implements Closeable {

    /* renamed from: g3.v$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        AbstractC1984v mo7975a();

        /* renamed from: b */
        a mo7976b(Context context);
    }

    /* renamed from: a */
    public abstract InterfaceC3848d mo7972a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo7972a().close();
    }

    /* renamed from: d */
    public abstract C1983u mo7973d();
}
