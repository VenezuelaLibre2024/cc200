package p233q2;

import android.util.Log;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import p274t2.C4614a;

/* renamed from: q2.b */
/* loaded from: classes.dex */
public abstract class AbstractC4130b implements InterfaceC4154x {

    /* renamed from: n */
    public static final AtomicLong f14887n = new AtomicLong(1);

    /* renamed from: b */
    public final InterfaceC4145o f14889b;

    /* renamed from: f */
    public final String[] f14893f;

    /* renamed from: m */
    public final EnumC4146p f14900m;

    /* renamed from: a */
    public final long f14888a = f14887n.getAndIncrement();

    /* renamed from: c */
    public final Date f14890c = new Date();

    /* renamed from: d */
    public Date f14891d = null;

    /* renamed from: e */
    public Date f14892e = null;

    /* renamed from: g */
    public final List<C4144n> f14894g = new LinkedList();

    /* renamed from: h */
    public final Object f14895h = new Object();

    /* renamed from: i */
    public Future<?> f14896i = null;

    /* renamed from: j */
    public EnumC4155y f14897j = EnumC4155y.CREATED;

    /* renamed from: k */
    public C4153w f14898k = null;

    /* renamed from: l */
    public String f14899l = null;

    public AbstractC4130b(String[] strArr, InterfaceC4145o interfaceC4145o, EnumC4146p enumC4146p) {
        this.f14889b = interfaceC4145o;
        this.f14893f = strArr;
        this.f14900m = enumC4146p;
        FFmpegKitConfig.m4640b(this);
    }

    /* renamed from: a */
    public void m15925a(C4153w c4153w) {
        this.f14898k = c4153w;
        this.f14897j = EnumC4155y.COMPLETED;
        this.f14892e = new Date();
    }

    /* renamed from: b */
    public void m15926b(Exception exc) {
        this.f14899l = C4614a.m18192a(exc);
        this.f14897j = EnumC4155y.FAILED;
        this.f14892e = new Date();
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: c */
    public long mo15927c() {
        Date date = this.f14891d;
        Date date2 = this.f14892e;
        if (date == null || date2 == null) {
            return 0L;
        }
        return date2.getTime() - date.getTime();
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: e */
    public String mo15928e(int i10) {
        m15946y(i10);
        if (mo15931h()) {
            Log.i("ffmpeg-kit", String.format("getAllLogsAsString was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.f14888a)));
        }
        return m15943v();
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: f */
    public Date mo15929f() {
        return this.f14891d;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: g */
    public void mo15930g(C4144n c4144n) {
        synchronized (this.f14895h) {
            this.f14894g.add(c4144n);
        }
    }

    @Override // p233q2.InterfaceC4154x
    public EnumC4155y getState() {
        return this.f14897j;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: h */
    public boolean mo15931h() {
        return FFmpegKitConfig.messagesInTransmit(this.f14888a) != 0;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: i */
    public List<C4144n> mo15932i(int i10) {
        m15946y(i10);
        if (mo15931h()) {
            Log.i("ffmpeg-kit", String.format("getAllLogs was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.f14888a)));
        }
        return mo15938o();
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: j */
    public String mo15933j() {
        return FFmpegKitConfig.m4641c(this.f14893f);
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: k */
    public Date mo15934k() {
        return this.f14890c;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: l */
    public String mo15935l() {
        return this.f14899l;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: m */
    public EnumC4146p mo15936m() {
        return this.f14900m;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: n */
    public Date mo15937n() {
        return this.f14892e;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: o */
    public List<C4144n> mo15938o() {
        LinkedList linkedList;
        synchronized (this.f14895h) {
            linkedList = new LinkedList(this.f14894g);
        }
        return linkedList;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: p */
    public InterfaceC4145o mo15939p() {
        return this.f14889b;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: q */
    public long mo15940q() {
        return this.f14888a;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: t */
    public C4153w mo15941t() {
        return this.f14898k;
    }

    /* renamed from: u */
    public String[] m15942u() {
        return this.f14893f;
    }

    /* renamed from: v */
    public String m15943v() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f14895h) {
            Iterator<C4144n> it = this.f14894g.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().m15970b());
            }
        }
        return sb2.toString();
    }

    /* renamed from: w */
    public void m15944w(Future<?> future) {
        this.f14896i = future;
    }

    /* renamed from: x */
    public void m15945x() {
        this.f14897j = EnumC4155y.RUNNING;
        this.f14891d = new Date();
    }

    /* renamed from: y */
    public void m15946y(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        while (mo15931h() && System.currentTimeMillis() < i10 + currentTimeMillis) {
            synchronized (this) {
                try {
                    wait(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
