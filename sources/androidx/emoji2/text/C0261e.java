package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p079f6.C1841a;
import p133j0.C3205d;
import p285u.C4772b;

/* renamed from: androidx.emoji2.text.e */
/* loaded from: classes.dex */
public class C0261e {

    /* renamed from: n */
    public static final Object f1211n = new Object();

    /* renamed from: o */
    public static final Object f1212o = new Object();

    /* renamed from: p */
    public static volatile C0261e f1213p;

    /* renamed from: b */
    public final Set<e> f1215b;

    /* renamed from: e */
    public final b f1218e;

    /* renamed from: f */
    public final g f1219f;

    /* renamed from: g */
    public final boolean f1220g;

    /* renamed from: h */
    public final boolean f1221h;

    /* renamed from: i */
    public final int[] f1222i;

    /* renamed from: j */
    public final boolean f1223j;

    /* renamed from: k */
    public final int f1224k;

    /* renamed from: l */
    public final int f1225l;

    /* renamed from: m */
    public final d f1226m;

    /* renamed from: a */
    public final ReadWriteLock f1214a = new ReentrantReadWriteLock();

    /* renamed from: c */
    public volatile int f1216c = 3;

    /* renamed from: d */
    public final Handler f1217d = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.emoji2.text.e$a */
    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b */
        public volatile C0264h f1227b;

        /* renamed from: c */
        public volatile C0269m f1228c;

        /* renamed from: androidx.emoji2.text.e$a$a */
        /* loaded from: classes.dex */
        public class C6135a extends h {
            public C6135a() {
            }

            @Override // androidx.emoji2.text.C0261e.h
            /* renamed from: a */
            public void mo1220a(Throwable th) {
                a.this.f1230a.m1253m(th);
            }

            @Override // androidx.emoji2.text.C0261e.h
            /* renamed from: b */
            public void mo1221b(C0269m c0269m) {
                a.this.m1265d(c0269m);
            }
        }

        public a(C0261e c0261e) {
            super(c0261e);
        }

        @Override // androidx.emoji2.text.C0261e.b
        /* renamed from: a */
        public void mo1262a() {
            try {
                this.f1230a.f1219f.mo1218a(new C6135a());
            } catch (Throwable th) {
                this.f1230a.m1253m(th);
            }
        }

        @Override // androidx.emoji2.text.C0261e.b
        /* renamed from: b */
        public CharSequence mo1263b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f1227b.m1289h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.C0261e.b
        /* renamed from: c */
        public void mo1264c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f1228c.m1323e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f1230a.f1220g);
        }

        /* renamed from: d */
        public void m1265d(C0269m c0269m) {
            if (c0269m == null) {
                this.f1230a.m1253m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f1228c = c0269m;
            C0269m c0269m2 = this.f1228c;
            i iVar = new i();
            d dVar = this.f1230a.f1226m;
            C0261e c0261e = this.f1230a;
            this.f1227b = new C0264h(c0269m2, iVar, dVar, c0261e.f1221h, c0261e.f1222i);
            this.f1230a.m1254n();
        }
    }

    /* renamed from: androidx.emoji2.text.e$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final C0261e f1230a;

        public b(C0261e c0261e) {
            this.f1230a = c0261e;
        }

        /* renamed from: a */
        public void mo1262a() {
            this.f1230a.m1254n();
        }

        /* renamed from: b */
        public CharSequence mo1263b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return charSequence;
        }

        /* renamed from: c */
        public void mo1264c(EditorInfo editorInfo) {
        }
    }

    /* renamed from: androidx.emoji2.text.e$c */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        public final g f1231a;

        /* renamed from: b */
        public boolean f1232b;

        /* renamed from: c */
        public boolean f1233c;

        /* renamed from: d */
        public int[] f1234d;

        /* renamed from: e */
        public Set<e> f1235e;

        /* renamed from: f */
        public boolean f1236f;

        /* renamed from: g */
        public int f1237g = -16711936;

        /* renamed from: h */
        public int f1238h = 0;

        /* renamed from: i */
        public d f1239i = new C0260d();

        public c(g gVar) {
            C3205d.m11415k(gVar, "metadataLoader cannot be null.");
            this.f1231a = gVar;
        }

        /* renamed from: a */
        public final g m1266a() {
            return this.f1231a;
        }

        /* renamed from: b */
        public c m1267b(int i10) {
            this.f1238h = i10;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.e$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        boolean mo1240a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* renamed from: androidx.emoji2.text.e$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        /* renamed from: a */
        public void m1268a(Throwable th) {
        }

        /* renamed from: b */
        public void mo1269b() {
        }
    }

    /* renamed from: androidx.emoji2.text.e$f */
    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: h */
        public final List<e> f1240h;

        /* renamed from: i */
        public final Throwable f1241i;

        /* renamed from: j */
        public final int f1242j;

        public f(e eVar, int i10) {
            this(Arrays.asList((e) C3205d.m11415k(eVar, "initCallback cannot be null")), i10, null);
        }

        public f(Collection<e> collection, int i10) {
            this(collection, i10, null);
        }

        public f(Collection<e> collection, int i10, Throwable th) {
            C3205d.m11415k(collection, "initCallbacks cannot be null");
            this.f1240h = new ArrayList(collection);
            this.f1242j = i10;
            this.f1241i = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1240h.size();
            int i10 = 0;
            if (this.f1242j != 1) {
                while (i10 < size) {
                    this.f1240h.get(i10).m1268a(this.f1241i);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f1240h.get(i10).mo1269b();
                    i10++;
                }
            }
        }
    }

    /* renamed from: androidx.emoji2.text.e$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        void mo1218a(h hVar);
    }

    /* renamed from: androidx.emoji2.text.e$h */
    /* loaded from: classes.dex */
    public static abstract class h {
        /* renamed from: a */
        public abstract void mo1220a(Throwable th);

        /* renamed from: b */
        public abstract void mo1221b(C0269m c0269m);
    }

    /* renamed from: androidx.emoji2.text.e$i */
    /* loaded from: classes.dex */
    public static class i {
        /* renamed from: a */
        public AbstractC0265i m1270a(C0263g c0263g) {
            return new C0271o(c0263g);
        }
    }

    public C0261e(c cVar) {
        this.f1220g = cVar.f1232b;
        this.f1221h = cVar.f1233c;
        this.f1222i = cVar.f1234d;
        this.f1223j = cVar.f1236f;
        this.f1224k = cVar.f1237g;
        this.f1219f = cVar.f1231a;
        this.f1225l = cVar.f1238h;
        this.f1226m = cVar.f1239i;
        C4772b c4772b = new C4772b();
        this.f1215b = c4772b;
        Set<e> set = cVar.f1235e;
        if (set != null && !set.isEmpty()) {
            c4772b.addAll(cVar.f1235e);
        }
        this.f1218e = Build.VERSION.SDK_INT < 19 ? new b(this) : new a(this);
        m1252l();
    }

    /* renamed from: b */
    public static C0261e m1242b() {
        C0261e c0261e;
        synchronized (f1211n) {
            c0261e = f1213p;
            C3205d.m11416l(c0261e != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return c0261e;
    }

    /* renamed from: e */
    public static boolean m1243e(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0264h.m1283c(inputConnection, editable, i10, i11, z10);
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m1244f(Editable editable, int i10, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0264h.m1284d(editable, i10, keyEvent);
        }
        return false;
    }

    /* renamed from: g */
    public static C0261e m1245g(c cVar) {
        C0261e c0261e = f1213p;
        if (c0261e == null) {
            synchronized (f1211n) {
                c0261e = f1213p;
                if (c0261e == null) {
                    c0261e = new C0261e(cVar);
                    f1213p = c0261e;
                }
            }
        }
        return c0261e;
    }

    /* renamed from: h */
    public static boolean m1246h() {
        return f1213p != null;
    }

    /* renamed from: c */
    public int m1247c() {
        return this.f1224k;
    }

    /* renamed from: d */
    public int m1248d() {
        this.f1214a.readLock().lock();
        try {
            return this.f1216c;
        } finally {
            this.f1214a.readLock().unlock();
        }
    }

    /* renamed from: i */
    public boolean m1249i() {
        return this.f1223j;
    }

    /* renamed from: j */
    public final boolean m1250j() {
        return m1248d() == 1;
    }

    /* renamed from: k */
    public void m1251k() {
        C3205d.m11416l(this.f1225l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m1250j()) {
            return;
        }
        this.f1214a.writeLock().lock();
        try {
            if (this.f1216c == 0) {
                return;
            }
            this.f1216c = 0;
            this.f1214a.writeLock().unlock();
            this.f1218e.mo1262a();
        } finally {
            this.f1214a.writeLock().unlock();
        }
    }

    /* renamed from: l */
    public final void m1252l() {
        this.f1214a.writeLock().lock();
        try {
            if (this.f1225l == 0) {
                this.f1216c = 0;
            }
            this.f1214a.writeLock().unlock();
            if (m1248d() == 0) {
                this.f1218e.mo1262a();
            }
        } catch (Throwable th) {
            this.f1214a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: m */
    public void m1253m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1214a.writeLock().lock();
        try {
            this.f1216c = 2;
            arrayList.addAll(this.f1215b);
            this.f1215b.clear();
            this.f1214a.writeLock().unlock();
            this.f1217d.post(new f(arrayList, this.f1216c, th));
        } catch (Throwable th2) {
            this.f1214a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: n */
    public void m1254n() {
        ArrayList arrayList = new ArrayList();
        this.f1214a.writeLock().lock();
        try {
            this.f1216c = 1;
            arrayList.addAll(this.f1215b);
            this.f1215b.clear();
            this.f1214a.writeLock().unlock();
            this.f1217d.post(new f(arrayList, this.f1216c));
        } catch (Throwable th) {
            this.f1214a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: o */
    public CharSequence m1255o(CharSequence charSequence) {
        return m1256p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* renamed from: p */
    public CharSequence m1256p(CharSequence charSequence, int i10, int i11) {
        return m1257q(charSequence, i10, i11, C1841a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: q */
    public CharSequence m1257q(CharSequence charSequence, int i10, int i11, int i12) {
        return m1258r(charSequence, i10, i11, i12, 0);
    }

    /* renamed from: r */
    public CharSequence m1258r(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        C3205d.m11416l(m1250j(), "Not initialized yet");
        C3205d.m11412h(i10, "start cannot be negative");
        C3205d.m11412h(i11, "end cannot be negative");
        C3205d.m11412h(i12, "maxEmojiCount cannot be negative");
        C3205d.m11405a(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        C3205d.m11405a(i10 <= charSequence.length(), "start should be < than charSequence length");
        C3205d.m11405a(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f1220g : false;
        } else {
            z10 = true;
        }
        return this.f1218e.mo1263b(charSequence, i10, i11, i12, z10);
    }

    /* renamed from: s */
    public void m1259s(e eVar) {
        C3205d.m11415k(eVar, "initCallback cannot be null");
        this.f1214a.writeLock().lock();
        try {
            if (this.f1216c != 1 && this.f1216c != 2) {
                this.f1215b.add(eVar);
            }
            this.f1217d.post(new f(eVar, this.f1216c));
        } finally {
            this.f1214a.writeLock().unlock();
        }
    }

    /* renamed from: t */
    public void m1260t(e eVar) {
        C3205d.m11415k(eVar, "initCallback cannot be null");
        this.f1214a.writeLock().lock();
        try {
            this.f1215b.remove(eVar);
        } finally {
            this.f1214a.writeLock().unlock();
        }
    }

    /* renamed from: u */
    public void m1261u(EditorInfo editorInfo) {
        if (!m1250j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f1218e.mo1264c(editorInfo);
    }
}
