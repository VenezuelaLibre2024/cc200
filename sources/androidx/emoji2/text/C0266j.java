package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.C0261e;
import androidx.emoji2.text.C0266j;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p002a0.C0015l;
import p090g0.C1956p;
import p102h0.C2277e;
import p102h0.C2279g;
import p133j0.C3205d;

/* renamed from: androidx.emoji2.text.j */
/* loaded from: classes.dex */
public class C0266j extends C0261e.c {

    /* renamed from: j */
    public static final a f1268j = new a();

    /* renamed from: androidx.emoji2.text.j$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public Typeface m1303a(Context context, C2279g.b bVar) {
            return C2279g.m9264a(context, null, new C2279g.b[]{bVar});
        }

        /* renamed from: b */
        public C2279g.a m1304b(Context context, C2277e c2277e) {
            return C2279g.m9265b(context, null, c2277e);
        }

        /* renamed from: c */
        public void m1305c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.j$b */
    /* loaded from: classes.dex */
    public static class b implements C0261e.g {

        /* renamed from: a */
        public final Context f1269a;

        /* renamed from: b */
        public final C2277e f1270b;

        /* renamed from: c */
        public final a f1271c;

        /* renamed from: d */
        public final Object f1272d = new Object();

        /* renamed from: e */
        public Handler f1273e;

        /* renamed from: f */
        public Executor f1274f;

        /* renamed from: g */
        public ThreadPoolExecutor f1275g;

        /* renamed from: h */
        public C0261e.h f1276h;

        /* renamed from: i */
        public ContentObserver f1277i;

        /* renamed from: j */
        public Runnable f1278j;

        public b(Context context, C2277e c2277e, a aVar) {
            C3205d.m11415k(context, "Context cannot be null");
            C3205d.m11415k(c2277e, "FontRequest cannot be null");
            this.f1269a = context.getApplicationContext();
            this.f1270b = c2277e;
            this.f1271c = aVar;
        }

        @Override // androidx.emoji2.text.C0261e.g
        /* renamed from: a */
        public void mo1218a(C0261e.h hVar) {
            C3205d.m11415k(hVar, "LoaderCallback cannot be null");
            synchronized (this.f1272d) {
                this.f1276h = hVar;
            }
            m1308d();
        }

        /* renamed from: b */
        public final void m1306b() {
            synchronized (this.f1272d) {
                this.f1276h = null;
                ContentObserver contentObserver = this.f1277i;
                if (contentObserver != null) {
                    this.f1271c.m1305c(this.f1269a, contentObserver);
                    this.f1277i = null;
                }
                Handler handler = this.f1273e;
                if (handler != null) {
                    handler.removeCallbacks(this.f1278j);
                }
                this.f1273e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1275g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1274f = null;
                this.f1275g = null;
            }
        }

        /* renamed from: c */
        public void m1307c() {
            synchronized (this.f1272d) {
                if (this.f1276h == null) {
                    return;
                }
                try {
                    C2279g.b m1309e = m1309e();
                    int m9271b = m1309e.m9271b();
                    if (m9271b == 2) {
                        synchronized (this.f1272d) {
                        }
                    }
                    if (m9271b != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + m9271b + ")");
                    }
                    try {
                        C1956p.m7875a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface m1303a = this.f1271c.m1303a(this.f1269a, m1309e);
                        ByteBuffer m93f = C0015l.m93f(this.f1269a, null, m1309e.m9273d());
                        if (m93f == null || m1303a == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        C0269m m1319b = C0269m.m1319b(m1303a, m93f);
                        C1956p.m7876b();
                        synchronized (this.f1272d) {
                            C0261e.h hVar = this.f1276h;
                            if (hVar != null) {
                                hVar.mo1221b(m1319b);
                            }
                        }
                        m1306b();
                    } catch (Throwable th) {
                        C1956p.m7876b();
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (this.f1272d) {
                        C0261e.h hVar2 = this.f1276h;
                        if (hVar2 != null) {
                            hVar2.mo1220a(th2);
                        }
                        m1306b();
                    }
                }
            }
        }

        /* renamed from: d */
        public void m1308d() {
            synchronized (this.f1272d) {
                if (this.f1276h == null) {
                    return;
                }
                if (this.f1274f == null) {
                    ThreadPoolExecutor m1223b = C0258b.m1223b("emojiCompat");
                    this.f1275g = m1223b;
                    this.f1274f = m1223b;
                }
                this.f1274f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0266j.b.this.m1307c();
                    }
                });
            }
        }

        /* renamed from: e */
        public final C2279g.b m1309e() {
            try {
                C2279g.a m1304b = this.f1271c.m1304b(this.f1269a, this.f1270b);
                if (m1304b.m9269c() == 0) {
                    C2279g.b[] m9268b = m1304b.m9268b();
                    if (m9268b == null || m9268b.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return m9268b[0];
                }
                throw new RuntimeException("fetchFonts failed (" + m1304b.m9269c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        /* renamed from: f */
        public void m1310f(Executor executor) {
            synchronized (this.f1272d) {
                this.f1274f = executor;
            }
        }
    }

    public C0266j(Context context, C2277e c2277e) {
        super(new b(context, c2277e, f1268j));
    }

    /* renamed from: c */
    public C0266j m1302c(Executor executor) {
        ((b) m1266a()).m1310f(executor);
        return this;
    }
}
