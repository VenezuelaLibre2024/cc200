package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
import p300v.C5026c;

/* renamed from: androidx.profileinstaller.d */
/* loaded from: classes.dex */
public final class C0386d {

    /* renamed from: a */
    public static final C5026c<c> f1815a = C5026c.m19774z();

    /* renamed from: b */
    public static final Object f1816b = new Object();

    /* renamed from: c */
    public static c f1817c = null;

    /* renamed from: androidx.profileinstaller.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static PackageInfo m1956a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* renamed from: androidx.profileinstaller.d$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final int f1818a;

        /* renamed from: b */
        public final int f1819b;

        /* renamed from: c */
        public final long f1820c;

        /* renamed from: d */
        public final long f1821d;

        public b(int i10, int i11, long j10, long j11) {
            this.f1818a = i10;
            this.f1819b = i11;
            this.f1820c = j10;
            this.f1821d = j11;
        }

        /* renamed from: a */
        public static b m1957a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        /* renamed from: b */
        public void m1958b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f1818a);
                dataOutputStream.writeInt(this.f1819b);
                dataOutputStream.writeLong(this.f1820c);
                dataOutputStream.writeLong(this.f1821d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1819b == bVar.f1819b && this.f1820c == bVar.f1820c && this.f1818a == bVar.f1818a && this.f1821d == bVar.f1821d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f1819b), Long.valueOf(this.f1820c), Integer.valueOf(this.f1818a), Long.valueOf(this.f1821d));
        }
    }

    /* renamed from: androidx.profileinstaller.d$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final int f1822a;

        /* renamed from: b */
        public final boolean f1823b;

        /* renamed from: c */
        public final boolean f1824c;

        public c(int i10, boolean z10, boolean z11) {
            this.f1822a = i10;
            this.f1824c = z11;
            this.f1823b = z10;
        }
    }

    /* renamed from: a */
    public static long m1953a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? a.m1956a(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    /* renamed from: b */
    public static c m1954b(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f1817c = cVar;
        f1815a.mo19754v(cVar);
        return f1817c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:24|25|26|(2:62|63)|28|(8:35|(1:39)|(1:46)|47|(2:54|55)|51|52|53)|(1:61)|(1:39)|(3:41|44|46)|47|(1:49)|54|55|51|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
    
        r3 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
    
        r3 = 1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.profileinstaller.C0386d.c m1955c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.C0386d.m1955c(android.content.Context, boolean):androidx.profileinstaller.d$c");
    }
}
