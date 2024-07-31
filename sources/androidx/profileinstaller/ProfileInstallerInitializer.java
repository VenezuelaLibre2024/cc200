package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.C0385c;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p287u1.InterfaceC4788b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC4788b<C0382c> {

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    /* loaded from: classes.dex */
    public static class C0380a {
        /* renamed from: c */
        public static void m1921c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: n1.i
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    runnable.run();
                }
            });
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    /* loaded from: classes.dex */
    public static class C0381b {
        /* renamed from: a */
        public static Handler m1922a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    /* loaded from: classes.dex */
    public static class C0382c {
    }

    /* renamed from: l */
    public static void m1915l(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: n1.g
            @Override // java.lang.Runnable
            public final void run() {
                C0385c.m1949i(context);
            }
        });
    }

    @Override // p287u1.InterfaceC4788b
    /* renamed from: a */
    public List<Class<? extends InterfaceC4788b<?>>> mo1211a() {
        return Collections.emptyList();
    }

    @Override // p287u1.InterfaceC4788b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0382c mo1212b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C0382c();
        }
        m1917g(context.getApplicationContext());
        return new C0382c();
    }

    /* renamed from: g */
    public void m1917g(final Context context) {
        C0380a.m1921c(new Runnable() { // from class: n1.h
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.m1912i(context);
            }
        });
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m1912i(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? C0381b.m1922a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: n1.f
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m1915l(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
