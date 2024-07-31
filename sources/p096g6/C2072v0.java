package p096g6;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import p064e6.C1667b;
import p079f6.C1842b;
import p108h6.AbstractC2346c;
import p108h6.C2355f;
import p108h6.C2385p;
import p108h6.C2397t;
import p108h6.C2400u;
import p207o6.C3933b;

/* renamed from: g6.v0 */
/* loaded from: classes.dex */
public final class C2072v0 implements OnCompleteListener {

    /* renamed from: a */
    public final C2018f f8154a;

    /* renamed from: b */
    public final int f8155b;

    /* renamed from: c */
    public final C2002b f8156c;

    /* renamed from: d */
    public final long f8157d;

    /* renamed from: e */
    public final long f8158e;

    @VisibleForTesting
    public C2072v0(C2018f c2018f, int i10, C2002b c2002b, long j10, long j11, String str, String str2) {
        this.f8154a = c2018f;
        this.f8155b = i10;
        this.f8156c = c2002b;
        this.f8157d = j10;
        this.f8158e = j11;
    }

    /* renamed from: a */
    public static C2072v0 m8276a(C2018f c2018f, int i10, C2002b c2002b) {
        boolean z10;
        if (!c2018f.m8139g()) {
            return null;
        }
        C2400u m9626a = C2397t.m9625b().m9626a();
        if (m9626a == null) {
            z10 = true;
        } else {
            if (!m9626a.m9637K()) {
                return null;
            }
            z10 = m9626a.m9638L();
            C2039k0 m8146x = c2018f.m8146x(c2002b);
            if (m8146x != null) {
                if (!(m8146x.m8209v() instanceof AbstractC2346c)) {
                    return null;
                }
                AbstractC2346c abstractC2346c = (AbstractC2346c) m8146x.m8209v();
                if (abstractC2346c.hasConnectionInfo() && !abstractC2346c.isConnecting()) {
                    C2355f m8277b = m8277b(m8146x, abstractC2346c, i10);
                    if (m8277b == null) {
                        return null;
                    }
                    m8146x.m8182G();
                    z10 = m8277b.m9539M();
                }
            }
        }
        return new C2072v0(c2018f, i10, c2002b, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    /* renamed from: b */
    public static C2355f m8277b(C2039k0 c2039k0, AbstractC2346c abstractC2346c, int i10) {
        int[] m9536J;
        int[] m9537K;
        C2355f telemetryConfiguration = abstractC2346c.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.m9538L() || ((m9536J = telemetryConfiguration.m9536J()) != null ? !C3933b.m14918a(m9536J, i10) : !((m9537K = telemetryConfiguration.m9537K()) == null || !C3933b.m14918a(m9537K, i10))) || c2039k0.m8207s() >= telemetryConfiguration.m9535I()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        C2039k0 m8146x;
        int i10;
        int i11;
        int i12;
        int m6677I;
        long j10;
        long j11;
        int i13;
        if (this.f8154a.m8139g()) {
            C2400u m9626a = C2397t.m9625b().m9626a();
            if ((m9626a == null || m9626a.m9637K()) && (m8146x = this.f8154a.m8146x(this.f8156c)) != null && (m8146x.m8209v() instanceof AbstractC2346c)) {
                AbstractC2346c abstractC2346c = (AbstractC2346c) m8146x.m8209v();
                int i14 = 0;
                boolean z10 = this.f8157d > 0;
                int gCoreServiceId = abstractC2346c.getGCoreServiceId();
                if (m9626a != null) {
                    z10 &= m9626a.m9638L();
                    int m9635I = m9626a.m9635I();
                    int m9636J = m9626a.m9636J();
                    i10 = m9626a.m9639M();
                    if (abstractC2346c.hasConnectionInfo() && !abstractC2346c.isConnecting()) {
                        C2355f m8277b = m8277b(m8146x, abstractC2346c, this.f8155b);
                        if (m8277b == null) {
                            return;
                        }
                        boolean z11 = m8277b.m9539M() && this.f8157d > 0;
                        m9636J = m8277b.m9535I();
                        z10 = z11;
                    }
                    i12 = m9635I;
                    i11 = m9636J;
                } else {
                    i10 = 0;
                    i11 = 100;
                    i12 = 5000;
                }
                C2018f c2018f = this.f8154a;
                if (task.isSuccessful()) {
                    m6677I = 0;
                } else {
                    if (task.isCanceled()) {
                        i14 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof C1842b) {
                            Status status = ((C1842b) exception).getStatus();
                            int m4987J = status.m4987J();
                            C1667b m4986I = status.m4986I();
                            m6677I = m4986I == null ? -1 : m4986I.m6677I();
                            i14 = m4987J;
                        } else {
                            i14 = C1417R.styleable.AppCompatTheme_switchStyle;
                        }
                    }
                    m6677I = -1;
                }
                if (z10) {
                    long j12 = this.f8157d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i13 = (int) (SystemClock.elapsedRealtime() - this.f8158e);
                    j10 = j12;
                    j11 = currentTimeMillis;
                } else {
                    j10 = 0;
                    j11 = 0;
                    i13 = -1;
                }
                c2018f.m8133J(new C2385p(this.f8155b, i14, m6677I, j10, j11, null, null, gCoreServiceId, i13), i10, i12, i11);
            }
        }
    }
}
