package p145jc;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.czt.mp3recorder.util.LameUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import p160kc.InterfaceC3381a;

/* renamed from: jc.a */
/* loaded from: classes2.dex */
public class C3275a extends Thread implements AudioRecord.OnRecordPositionUpdateListener {

    /* renamed from: h */
    public a f11409h;

    /* renamed from: i */
    public byte[] f11410i;

    /* renamed from: j */
    public FileOutputStream f11411j;

    /* renamed from: k */
    public File f11412k;

    /* renamed from: m */
    public InterfaceC3381a f11414m;

    /* renamed from: l */
    public CountDownLatch f11413l = new CountDownLatch(1);

    /* renamed from: n */
    public List<b> f11415n = Collections.synchronizedList(new ArrayList());

    /* renamed from: jc.a$a */
    /* loaded from: classes2.dex */
    public class a extends Handler {

        /* renamed from: a */
        public WeakReference<C3275a> f11416a;

        public a(C3275a c3275a) {
            this.f11416a = new WeakReference<>(c3275a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
        
            super.handleMessage(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0010, code lost:
        
            if (r0 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0016, code lost:
        
            if (r0.m11850i() <= 0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0019, code lost:
        
            removeCallbacksAndMessages(null);
            r0.m11848g();
            getLooper().quit();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
        
            if (r4.what != 1) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
        
            if (r3.f11417b.f11414m == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
        
            r3.f11417b.f11414m.mo11025a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
        
            r3.f11417b.m11847f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        
            if (r0 != 2) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
        
            if (r4.what != 15) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
        
            if (r3.f11417b.f11414m == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        
            r3.f11417b.f11414m.mo11026b();
         */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                int r0 = r4.what
                r1 = 1
                if (r0 == r1) goto L8
                r2 = 2
                if (r0 != r2) goto L42
            L8:
                java.lang.ref.WeakReference<jc.a> r0 = r3.f11416a
                java.lang.Object r0 = r0.get()
                jc.a r0 = (p145jc.C3275a) r0
                if (r0 == 0) goto L42
            L12:
                int r2 = p145jc.C3275a.m11842a(r0)
                if (r2 <= 0) goto L19
                goto L12
            L19:
                r2 = 0
                r3.removeCallbacksAndMessages(r2)
                p145jc.C3275a.m11843b(r0)
                android.os.Looper r0 = r3.getLooper()
                r0.quit()
                int r0 = r4.what
                if (r0 != r1) goto L3d
                jc.a r0 = p145jc.C3275a.this
                kc.a r0 = p145jc.C3275a.m11844c(r0)
                if (r0 == 0) goto L42
                jc.a r0 = p145jc.C3275a.this
                kc.a r0 = p145jc.C3275a.m11844c(r0)
                r0.mo11025a()
                goto L42
            L3d:
                jc.a r0 = p145jc.C3275a.this
                p145jc.C3275a.m11845d(r0)
            L42:
                int r0 = r4.what
                r1 = 15
                if (r0 != r1) goto L59
                jc.a r0 = p145jc.C3275a.this
                kc.a r0 = p145jc.C3275a.m11844c(r0)
                if (r0 == 0) goto L59
                jc.a r0 = p145jc.C3275a.this
                kc.a r0 = p145jc.C3275a.m11844c(r0)
                r0.mo11026b()
            L59:
                super.handleMessage(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p145jc.C3275a.a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: jc.a$b */
    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a */
        public short[] f11418a;

        /* renamed from: b */
        public int f11419b;

        public b(short[] sArr, int i10) {
            this.f11418a = (short[]) sArr.clone();
            this.f11419b = i10;
        }

        /* renamed from: a */
        public short[] m11851a() {
            return this.f11418a;
        }

        /* renamed from: b */
        public int m11852b() {
            return this.f11419b;
        }
    }

    public C3275a(File file, int i10, InterfaceC3381a interfaceC3381a) {
        this.f11411j = new FileOutputStream(file);
        this.f11412k = file;
        this.f11410i = new byte[(int) ((i10 * 2 * 1.25d) + 7200.0d)];
        this.f11414m = interfaceC3381a;
    }

    /* renamed from: e */
    public void m11846e(short[] sArr, int i10) {
        this.f11415n.add(new b(sArr, i10));
    }

    /* renamed from: f */
    public final void m11847f() {
        File file = this.f11412k;
        if (file != null) {
            file.deleteOnExit();
            Log.e("record", "非正常结束情况下,删除原录音文件");
        }
    }

    /* renamed from: g */
    public final void m11848g() {
        FileOutputStream fileOutputStream;
        int flush = LameUtil.flush(this.f11410i);
        try {
            try {
            } catch (IOException unused) {
                Log.e("RecordMp3", "write exception");
            }
            if (flush > 0) {
                try {
                    this.f11411j.write(this.f11410i, 0, flush);
                    fileOutputStream = this.f11411j;
                } catch (IOException e10) {
                    this.f11409h.sendEmptyMessage(15);
                    e10.printStackTrace();
                    FileOutputStream fileOutputStream2 = this.f11411j;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                LameUtil.close();
            }
        } catch (Throwable th) {
            FileOutputStream fileOutputStream3 = this.f11411j;
            if (fileOutputStream3 != null) {
                try {
                    fileOutputStream3.close();
                } catch (IOException unused2) {
                    Log.e("RecordMp3", "write exception");
                }
            }
            LameUtil.close();
            throw th;
        }
    }

    /* renamed from: h */
    public Handler m11849h() {
        try {
            this.f11413l.await();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        return this.f11409h;
    }

    /* renamed from: i */
    public final int m11850i() {
        if (this.f11415n.size() <= 0) {
            return 0;
        }
        b remove = this.f11415n.remove(0);
        short[] m11851a = remove.m11851a();
        int m11852b = remove.m11852b();
        int encode = LameUtil.encode(m11851a, m11851a, m11852b, this.f11410i);
        if (encode > 0) {
            try {
                this.f11411j.write(this.f11410i, 0, encode);
            } catch (IOException unused) {
                this.f11409h.sendEmptyMessage(15);
                Log.e("RecordMp3", "write exception");
            }
        }
        return m11852b;
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onMarkerReached(AudioRecord audioRecord) {
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onPeriodicNotification(AudioRecord audioRecord) {
        m11850i();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f11409h = new a(this);
        this.f11413l.countDown();
        Looper.loop();
    }
}
