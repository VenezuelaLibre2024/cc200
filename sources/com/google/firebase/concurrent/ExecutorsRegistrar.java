package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p253r7.InterfaceC4318a;
import p253r7.InterfaceC4319b;
import p253r7.InterfaceC4320c;
import p253r7.InterfaceC4321d;
import p353y7.C5867c;
import p353y7.C5872e0;
import p353y7.C5891w;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;
import p354y8.InterfaceC5896b;
import p368z7.EnumC6053c0;
import p368z7.ScheduledExecutorServiceC6065o;
import p368z7.ThreadFactoryC6050b;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final C5891w<ScheduledExecutorService> f4817a = new C5891w<>(new InterfaceC5896b() { // from class: z7.x
        @Override // p354y8.InterfaceC5896b
        public final Object get() {
            ScheduledExecutorService m5322p;
            m5322p = ExecutorsRegistrar.m5322p();
            return m5322p;
        }
    });

    /* renamed from: b */
    public static final C5891w<ScheduledExecutorService> f4818b = new C5891w<>(new InterfaceC5896b() { // from class: z7.w
        @Override // p354y8.InterfaceC5896b
        public final Object get() {
            ScheduledExecutorService m5323q;
            m5323q = ExecutorsRegistrar.m5323q();
            return m5323q;
        }
    });

    /* renamed from: c */
    public static final C5891w<ScheduledExecutorService> f4819c = new C5891w<>(new InterfaceC5896b() { // from class: z7.v
        @Override // p354y8.InterfaceC5896b
        public final Object get() {
            ScheduledExecutorService m5324r;
            m5324r = ExecutorsRegistrar.m5324r();
            return m5324r;
        }
    });

    /* renamed from: d */
    public static final C5891w<ScheduledExecutorService> f4820d = new C5891w<>(new InterfaceC5896b() { // from class: z7.u
        @Override // p354y8.InterfaceC5896b
        public final Object get() {
            ScheduledExecutorService m5325s;
            m5325s = ExecutorsRegistrar.m5325s();
            return m5325s;
        }
    });

    /* renamed from: i */
    public static StrictMode.ThreadPolicy m5315i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i10 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    /* renamed from: j */
    public static ThreadFactory m5316j(String str, int i10) {
        return new ThreadFactoryC6050b(str, i10, null);
    }

    /* renamed from: k */
    public static ThreadFactory m5317k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC6050b(str, i10, threadPolicy);
    }

    /* renamed from: l */
    public static /* synthetic */ ScheduledExecutorService m5318l(InterfaceC5869d interfaceC5869d) {
        return f4817a.get();
    }

    /* renamed from: m */
    public static /* synthetic */ ScheduledExecutorService m5319m(InterfaceC5869d interfaceC5869d) {
        return f4819c.get();
    }

    /* renamed from: n */
    public static /* synthetic */ ScheduledExecutorService m5320n(InterfaceC5869d interfaceC5869d) {
        return f4818b.get();
    }

    /* renamed from: o */
    public static /* synthetic */ Executor m5321o(InterfaceC5869d interfaceC5869d) {
        return EnumC6053c0.INSTANCE;
    }

    /* renamed from: p */
    public static /* synthetic */ ScheduledExecutorService m5322p() {
        return m5327u(Executors.newFixedThreadPool(4, m5317k("Firebase Background", 10, m5315i())));
    }

    /* renamed from: q */
    public static /* synthetic */ ScheduledExecutorService m5323q() {
        return m5327u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), m5317k("Firebase Lite", 0, m5326t())));
    }

    /* renamed from: r */
    public static /* synthetic */ ScheduledExecutorService m5324r() {
        return m5327u(Executors.newCachedThreadPool(m5316j("Firebase Blocking", 11)));
    }

    /* renamed from: s */
    public static /* synthetic */ ScheduledExecutorService m5325s() {
        return Executors.newSingleThreadScheduledExecutor(m5316j("Firebase Scheduler", 0));
    }

    /* renamed from: t */
    public static StrictMode.ThreadPolicy m5326t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* renamed from: u */
    public static ScheduledExecutorService m5327u(ExecutorService executorService) {
        return new ScheduledExecutorServiceC6065o(executorService, f4820d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5867c<?>> getComponents() {
        return Arrays.asList(C5867c.m23457f(C5872e0.m23504a(InterfaceC4318a.class, ScheduledExecutorService.class), C5872e0.m23504a(InterfaceC4318a.class, ExecutorService.class), C5872e0.m23504a(InterfaceC4318a.class, Executor.class)).m23477f(new InterfaceC5875g() { // from class: z7.t
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                ScheduledExecutorService m5318l;
                m5318l = ExecutorsRegistrar.m5318l(interfaceC5869d);
                return m5318l;
            }
        }).m23475d(), C5867c.m23457f(C5872e0.m23504a(InterfaceC4319b.class, ScheduledExecutorService.class), C5872e0.m23504a(InterfaceC4319b.class, ExecutorService.class), C5872e0.m23504a(InterfaceC4319b.class, Executor.class)).m23477f(new InterfaceC5875g() { // from class: z7.q
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                ScheduledExecutorService m5319m;
                m5319m = ExecutorsRegistrar.m5319m(interfaceC5869d);
                return m5319m;
            }
        }).m23475d(), C5867c.m23457f(C5872e0.m23504a(InterfaceC4320c.class, ScheduledExecutorService.class), C5872e0.m23504a(InterfaceC4320c.class, ExecutorService.class), C5872e0.m23504a(InterfaceC4320c.class, Executor.class)).m23477f(new InterfaceC5875g() { // from class: z7.s
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                ScheduledExecutorService m5320n;
                m5320n = ExecutorsRegistrar.m5320n(interfaceC5869d);
                return m5320n;
            }
        }).m23475d(), C5867c.m23456e(C5872e0.m23504a(InterfaceC4321d.class, Executor.class)).m23477f(new InterfaceC5875g() { // from class: z7.r
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                Executor m5321o;
                m5321o = ExecutorsRegistrar.m5321o(interfaceC5869d);
                return m5321o;
            }
        }).m23475d());
    }
}
