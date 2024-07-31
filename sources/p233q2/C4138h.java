package p233q2;

import android.util.Log;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import java.util.LinkedList;
import java.util.List;

/* renamed from: q2.h */
/* loaded from: classes.dex */
public class C4138h extends AbstractC4130b {

    /* renamed from: o */
    public final InterfaceC4131b0 f14910o;

    /* renamed from: p */
    public final InterfaceC4139i f14911p;

    /* renamed from: q */
    public final List<C4129a0> f14912q;

    /* renamed from: r */
    public final Object f14913r;

    public C4138h(String[] strArr, InterfaceC4139i interfaceC4139i, InterfaceC4145o interfaceC4145o, InterfaceC4131b0 interfaceC4131b0, EnumC4146p enumC4146p) {
        super(strArr, interfaceC4145o, enumC4146p);
        this.f14911p = interfaceC4139i;
        this.f14910o = interfaceC4131b0;
        this.f14912q = new LinkedList();
        this.f14913r = new Object();
    }

    /* renamed from: A */
    public static C4138h m15951A(String[] strArr, InterfaceC4139i interfaceC4139i, InterfaceC4145o interfaceC4145o, InterfaceC4131b0 interfaceC4131b0, EnumC4146p enumC4146p) {
        return new C4138h(strArr, interfaceC4139i, interfaceC4145o, interfaceC4131b0, enumC4146p);
    }

    /* renamed from: B */
    public List<C4129a0> m15952B(int i10) {
        m15946y(i10);
        if (mo15931h()) {
            Log.i("ffmpeg-kit", String.format("getAllStatistics was called to return all statistics but there are still statistics being transmitted for session id %d.", Long.valueOf(this.f14888a)));
        }
        return m15954D();
    }

    /* renamed from: C */
    public InterfaceC4139i m15953C() {
        return this.f14911p;
    }

    /* renamed from: D */
    public List<C4129a0> m15954D() {
        List<C4129a0> list;
        synchronized (this.f14913r) {
            list = this.f14912q;
        }
        return list;
    }

    /* renamed from: E */
    public InterfaceC4131b0 m15955E() {
        return this.f14910o;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: d */
    public boolean mo15956d() {
        return true;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: r */
    public boolean mo15957r() {
        return false;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: s */
    public boolean mo15958s() {
        return false;
    }

    public String toString() {
        return "FFmpegSession{sessionId=" + this.f14888a + ", createTime=" + this.f14890c + ", startTime=" + this.f14891d + ", endTime=" + this.f14892e + ", arguments=" + FFmpegKitConfig.m4641c(this.f14893f) + ", logs=" + m15943v() + ", state=" + this.f14897j + ", returnCode=" + this.f14898k + ", failStackTrace='" + this.f14899l + "'}";
    }

    /* renamed from: z */
    public void m15959z(C4129a0 c4129a0) {
        synchronized (this.f14913r) {
            this.f14912q.add(c4129a0);
        }
    }
}
