package p145jc;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.czt.mp3recorder.util.LameUtil;
import java.io.File;
import p005a3.EnumC0042a;
import p160kc.C3382b;
import p160kc.InterfaceC3381a;

/* renamed from: jc.b */
/* loaded from: classes2.dex */
public class C3276b {

    /* renamed from: k */
    public static final EnumC0042a f11421k = EnumC0042a.PCM_16BIT;

    /* renamed from: b */
    public int f11423b;

    /* renamed from: c */
    public short[] f11424c;

    /* renamed from: d */
    public C3275a f11425d;

    /* renamed from: e */
    public File f11426e;

    /* renamed from: h */
    public InterfaceC3381a f11429h;

    /* renamed from: a */
    public AudioRecord f11422a = null;

    /* renamed from: f */
    public int f11427f = -100;

    /* renamed from: g */
    public EnumC3277c f11428g = EnumC3277c.IDEL;

    /* renamed from: i */
    public boolean f11430i = false;

    /* renamed from: j */
    public Handler f11431j = new a(Looper.getMainLooper());

    /* renamed from: jc.b$a */
    /* loaded from: classes2.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (C3276b.this.f11429h == null) {
                return;
            }
            if (message.what == 5) {
                C3276b.this.f11429h.mo11027c();
            }
            if (message.what == 10) {
                C3276b.this.f11429h.mo11030f();
            }
            if (message.what == 15) {
                C3276b.this.f11429h.mo11026b();
            }
            if (message.what == 20) {
                C3276b.this.f11429h.mo11029e();
            }
            if (message.what == 125) {
                C3276b.this.f11429h.mo11028d((EnumC3277c) message.obj);
            }
            if (message.what == 135) {
                C3276b.this.f11429h.mo11025a();
            }
        }
    }

    /* renamed from: jc.b$b */
    /* loaded from: classes2.dex */
    public class b extends Thread {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
        
            if (r7.f11433h.m11868o() == p145jc.EnumC3277c.STOP) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
        
            r0 = android.os.Message.obtain(r7.f11433h.f11425d.m11849h(), 2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
        
            r0.sendToTarget();
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x012a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
        
            r0 = android.os.Message.obtain(r7.f11433h.f11425d.m11849h(), 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00ed, code lost:
        
            if (r7.f11433h.m11868o() != p145jc.EnumC3277c.STOP) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0108, code lost:
        
            if (r7.f11433h.m11868o() != p145jc.EnumC3277c.STOP) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00d1, code lost:
        
            if (r7.f11433h.m11868o() != p145jc.EnumC3277c.STOP) goto L43;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 347
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p145jc.C3276b.b.run():void");
        }
    }

    /* renamed from: jc.b$c */
    /* loaded from: classes2.dex */
    public class c extends C3382b {
        public c() {
        }

        @Override // p160kc.InterfaceC3381a
        /* renamed from: a */
        public void mo11025a() {
            C3276b.this.m11878y(EnumC3277c.COMPLETE);
            C3276b.this.m11872s(135);
        }

        @Override // p160kc.InterfaceC3381a
        /* renamed from: b */
        public void mo11026b() {
            C3276b.this.m11872s(15);
        }
    }

    public C3276b(File file, InterfaceC3381a interfaceC3381a) {
        this.f11426e = file;
        this.f11429h = interfaceC3381a;
    }

    /* renamed from: k */
    public static /* synthetic */ int m11863k(C3276b c3276b) {
        int i10 = c3276b.f11427f;
        c3276b.f11427f = i10 + 1;
        return i10;
    }

    /* renamed from: A */
    public void m11866A() {
        if (m11868o() == EnumC3277c.START || m11868o() == EnumC3277c.PAUSE || m11868o() == EnumC3277c.RESUME) {
            m11878y(EnumC3277c.STOP);
            m11877x(false);
        }
    }

    /* renamed from: n */
    public void m11867n() {
        if (this.f11430i) {
            m11878y(EnumC3277c.BREAK);
            m11877x(false);
        }
    }

    /* renamed from: o */
    public EnumC3277c m11868o() {
        return this.f11428g;
    }

    /* renamed from: p */
    public final void m11869p() {
        EnumC0042a enumC0042a = f11421k;
        this.f11423b = AudioRecord.getMinBufferSize(44100, 16, enumC0042a.m156b());
        int m157c = enumC0042a.m157c();
        int i10 = this.f11423b / m157c;
        int i11 = i10 % 160;
        if (i11 != 0) {
            this.f11423b = (i10 + (160 - i11)) * m157c;
        }
        this.f11422a = new AudioRecord(1, 44100, 16, enumC0042a.m156b(), this.f11423b);
        this.f11424c = new short[this.f11423b];
        LameUtil.init(44100, 1, 44100, 32, 4);
        C3275a c3275a = new C3275a(this.f11426e, this.f11423b, new c());
        this.f11425d = c3275a;
        c3275a.start();
        AudioRecord audioRecord = this.f11422a;
        C3275a c3275a2 = this.f11425d;
        audioRecord.setRecordPositionUpdateListener(c3275a2, c3275a2.m11849h());
        this.f11422a.setPositionNotificationPeriod(160);
    }

    /* renamed from: q */
    public boolean m11870q() {
        return this.f11430i;
    }

    /* renamed from: r */
    public void m11871r() {
        if (m11868o() == EnumC3277c.START || m11868o() == EnumC3277c.RESUME) {
            m11878y(EnumC3277c.PAUSE);
        }
    }

    /* renamed from: s */
    public final void m11872s(int i10) {
        this.f11431j.sendEmptyMessage(i10);
    }

    /* renamed from: t */
    public final void m11873t(EnumC3277c enumC3277c) {
        Message obtainMessage = this.f11431j.obtainMessage();
        obtainMessage.what = 125;
        obtainMessage.obj = enumC3277c;
        this.f11431j.sendMessage(obtainMessage);
    }

    /* renamed from: u */
    public final void m11874u() {
        AudioRecord audioRecord = this.f11422a;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
                this.f11422a.release();
                this.f11422a = null;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: v */
    public void m11875v() {
        if (m11868o() == EnumC3277c.PAUSE) {
            m11878y(EnumC3277c.RESUME);
        }
    }

    /* renamed from: w */
    public void m11876w(File file) {
        this.f11426e = file;
    }

    /* renamed from: x */
    public final void m11877x(boolean z10) {
        this.f11430i = z10;
    }

    /* renamed from: y */
    public final void m11878y(EnumC3277c enumC3277c) {
        this.f11428g = enumC3277c;
        Log.d("RecordMp3", "status = " + enumC3277c);
        m11873t(enumC3277c);
    }

    /* renamed from: z */
    public void m11879z() {
        if (m11870q()) {
            return;
        }
        new b().start();
    }
}
