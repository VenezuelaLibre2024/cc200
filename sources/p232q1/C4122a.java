package p232q1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: q1.a */
/* loaded from: classes.dex */
public class C4122a {

    /* renamed from: e */
    public static final Map<String, Lock> f14841e = new HashMap();

    /* renamed from: a */
    public final File f14842a;

    /* renamed from: b */
    public final Lock f14843b;

    /* renamed from: c */
    public final boolean f14844c;

    /* renamed from: d */
    public FileChannel f14845d;

    public C4122a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f14842a = file2;
        this.f14843b = m15895a(file2.getAbsolutePath());
        this.f14844c = z10;
    }

    /* renamed from: a */
    public static Lock m15895a(String str) {
        Lock lock;
        Map<String, Lock> map = f14841e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    /* renamed from: b */
    public void m15896b() {
        this.f14843b.lock();
        if (this.f14844c) {
            try {
                FileChannel channel = new FileOutputStream(this.f14842a).getChannel();
                this.f14845d = channel;
                channel.lock();
            } catch (IOException e10) {
                throw new IllegalStateException("Unable to grab copy lock.", e10);
            }
        }
    }

    /* renamed from: c */
    public void m15897c() {
        FileChannel fileChannel = this.f14845d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f14843b.unlock();
    }
}
