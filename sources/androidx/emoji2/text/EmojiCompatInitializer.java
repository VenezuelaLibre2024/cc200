package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.C0261e;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0354k;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p090g0.C1956p;
import p287u1.C4787a;
import p287u1.InterfaceC4788b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC4788b<Boolean> {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    /* loaded from: classes.dex */
    public static class C0254a extends C0261e.c {
        public C0254a(Context context) {
            super(new C0255b(context));
            m1267b(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    /* loaded from: classes.dex */
    public static class C0255b implements C0261e.g {

        /* renamed from: a */
        public final Context f1203a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        /* loaded from: classes.dex */
        public class a extends C0261e.h {

            /* renamed from: a */
            public final /* synthetic */ C0261e.h f1204a;

            /* renamed from: b */
            public final /* synthetic */ ThreadPoolExecutor f1205b;

            public a(C0261e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f1204a = hVar;
                this.f1205b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C0261e.h
            /* renamed from: a */
            public void mo1220a(Throwable th) {
                try {
                    this.f1204a.mo1220a(th);
                } finally {
                    this.f1205b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C0261e.h
            /* renamed from: b */
            public void mo1221b(C0269m c0269m) {
                try {
                    this.f1204a.mo1221b(c0269m);
                } finally {
                    this.f1205b.shutdown();
                }
            }
        }

        public C0255b(Context context) {
            this.f1203a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C0261e.g
        /* renamed from: a */
        public void mo1218a(final C0261e.h hVar) {
            final ThreadPoolExecutor m1223b = C0258b.m1223b("EmojiCompatInitializer");
            m1223b.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.C0255b.this.m1217d(hVar, m1223b);
                }
            });
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m1217d(C0261e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C0266j m1227a = C0259c.m1227a(this.f1203a);
                if (m1227a == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                m1227a.m1302c(threadPoolExecutor);
                m1227a.m1266a().mo1218a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.mo1220a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    /* loaded from: classes.dex */
    public static class RunnableC0256c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                C1956p.m7875a("EmojiCompat.EmojiCompatInitializer.run");
                if (C0261e.m1246h()) {
                    C0261e.m1242b().m1251k();
                }
            } finally {
                C1956p.m7876b();
            }
        }
    }

    @Override // p287u1.InterfaceC4788b
    /* renamed from: a */
    public List<Class<? extends InterfaceC4788b<?>>> mo1211a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p287u1.InterfaceC4788b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo1212b(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return Boolean.FALSE;
        }
        C0261e.m1245g(new C0254a(context));
        m1214d(context);
        return Boolean.TRUE;
    }

    /* renamed from: d */
    public void m1214d(Context context) {
        final AbstractC0344f lifecycle = ((InterfaceC0354k) C4787a.m18809e(context).m18814f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo1800a(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(InterfaceC0354k interfaceC0354k) {
                EmojiCompatInitializer.this.m1215e();
                lifecycle.mo1802c(this);
            }
        });
    }

    /* renamed from: e */
    public void m1215e() {
        C0258b.m1225d().postDelayed(new RunnableC0256c(), 500L);
    }
}
