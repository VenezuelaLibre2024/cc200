package p322w8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p223p6.ThreadFactoryC4056b;

/* renamed from: w8.b */
/* loaded from: classes.dex */
public class C5430b {

    /* renamed from: a */
    public static final Executor f20262a = ExecutorC5429a.f20261h;

    /* renamed from: a */
    public static Executor m21586a() {
        return f20262a;
    }

    /* renamed from: b */
    public static ExecutorService m21587b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4056b("firebase-iid-executor"));
    }
}
