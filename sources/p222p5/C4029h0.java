package p222p5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p222p5.InterfaceC4040n;

/* renamed from: p5.h0 */
/* loaded from: classes.dex */
public final class C4029h0 implements InterfaceC4040n {

    /* renamed from: b */
    public static final List<b> f14482b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f14483a;

    /* renamed from: p5.h0$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC4040n.a {

        /* renamed from: a */
        public Message f14484a;

        /* renamed from: b */
        public C4029h0 f14485b;

        public b() {
        }

        @Override // p222p5.InterfaceC4040n.a
        /* renamed from: a */
        public void mo15330a() {
            ((Message) C4014a.m15199e(this.f14484a)).sendToTarget();
            m15331b();
        }

        /* renamed from: b */
        public final void m15331b() {
            this.f14484a = null;
            this.f14485b = null;
            C4029h0.m15317o(this);
        }

        /* renamed from: c */
        public boolean m15332c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C4014a.m15199e(this.f14484a));
            m15331b();
            return sendMessageAtFrontOfQueue;
        }

        /* renamed from: d */
        public b m15333d(Message message, C4029h0 c4029h0) {
            this.f14484a = message;
            this.f14485b = c4029h0;
            return this;
        }
    }

    public C4029h0(Handler handler) {
        this.f14483a = handler;
    }

    /* renamed from: n */
    public static b m15316n() {
        b bVar;
        List<b> list = f14482b;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    /* renamed from: o */
    public static void m15317o(b bVar) {
        List<b> list = f14482b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // p222p5.InterfaceC4040n
    /* renamed from: a */
    public InterfaceC4040n.a mo15318a(int i10, int i11, int i12) {
        return m15316n().m15333d(this.f14483a.obtainMessage(i10, i11, i12), this);
    }

    @Override // p222p5.InterfaceC4040n
    /* renamed from: b */
    public boolean mo15319b(Runnable runnable) {
        return this.f14483a.post(runnable);
    }

    @Override // p222p5.InterfaceC4040n
    /* renamed from: c */
    public InterfaceC4040n.a mo15320c(int i10) {
        return m15316n().m15333d(this.f14483a.obtainMessage(i10), this);
    }

    @Override // p222p5.InterfaceC4040n
    /* renamed from: d */
    public boolean mo15321d(int i10) {
        return this.f14483a.hasMessages(i10);
    }

    @Override // p222p5.InterfaceC4040n
    /* renamed from: e */
    public boolean mo15322e(InterfaceC4040n.a aVar) {
        return ((b) aVar).m15332c(this.f14483a);
    }

    @Override // p222p5.InterfaceC4040n
    /* renamed from: f */
    public boolean mo15323f(int i10) {
        return this.f14483a.sendEmptyMessage(i10);
    }

    @Override // p222p5.InterfaceC4040n
    /* renamed from: g */
    public InterfaceC4040n.a mo15324g(int i10, int i11, int i12, Object obj) {
        return m15316n().m15333d(this.f14483a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // p222p5.InterfaceC4040n
    /* renamed from: h */
    public boolean mo15325h(int i10, long j10) {
        return this.f14483a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // p222p5.InterfaceC4040n
    /* renamed from: i */
    public void mo15326i(int i10) {
        this.f14483a.removeMessages(i10);
    }

    @Override // p222p5.InterfaceC4040n
    /* renamed from: j */
    public InterfaceC4040n.a mo15327j(int i10, Object obj) {
        return m15316n().m15333d(this.f14483a.obtainMessage(i10, obj), this);
    }

    @Override // p222p5.InterfaceC4040n
    /* renamed from: k */
    public void mo15328k(Object obj) {
        this.f14483a.removeCallbacksAndMessages(obj);
    }

    @Override // p222p5.InterfaceC4040n
    /* renamed from: l */
    public Looper mo15329l() {
        return this.f14483a.getLooper();
    }
}
