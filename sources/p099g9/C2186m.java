package p099g9;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p128i9.C2667b;
import p128i9.EnumC2668c;
import p223p6.ThreadFactoryC4056b;

/* renamed from: g9.m */
/* loaded from: classes.dex */
public class C2186m {
    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: a */
    public static Executor m8794a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4056b(str));
    }

    /* renamed from: b */
    public static Executor m8795b() {
        return m8794a("Firebase-Messaging-File-Io");
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: c */
    public static ScheduledExecutorService m8796c() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC4056b("Firebase-Messaging-Init"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: d */
    public static ExecutorService m8797d() {
        return C2667b.m10867a().mo10866a(new ThreadFactoryC4056b("Firebase-Messaging-Intent-Handle"), EnumC2668c.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: e */
    public static ExecutorService m8798e() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC4056b("Firebase-Messaging-Network-Io"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: f */
    public static ExecutorService m8799f() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC4056b("Firebase-Messaging-Task"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: g */
    public static ScheduledExecutorService m8800g() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC4056b("Firebase-Messaging-Topics-Io"));
    }
}
