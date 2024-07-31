package p233q2;

import com.arthenica.ffmpegkit.FFmpegKitConfig;

/* renamed from: q2.k */
/* loaded from: classes.dex */
public class C4141k extends AbstractC4130b {

    /* renamed from: o */
    public final InterfaceC4142l f14914o;

    public C4141k(String[] strArr, InterfaceC4142l interfaceC4142l, InterfaceC4145o interfaceC4145o, EnumC4146p enumC4146p) {
        super(strArr, interfaceC4145o, enumC4146p);
        this.f14914o = interfaceC4142l;
    }

    /* renamed from: z */
    public static C4141k m15963z(String[] strArr, InterfaceC4142l interfaceC4142l, InterfaceC4145o interfaceC4145o, EnumC4146p enumC4146p) {
        return new C4141k(strArr, interfaceC4142l, interfaceC4145o, enumC4146p);
    }

    /* renamed from: A */
    public InterfaceC4142l m15964A() {
        return this.f14914o;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: d */
    public boolean mo15956d() {
        return false;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: r */
    public boolean mo15957r() {
        return true;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: s */
    public boolean mo15958s() {
        return false;
    }

    public String toString() {
        return "FFprobeSession{sessionId=" + this.f14888a + ", createTime=" + this.f14890c + ", startTime=" + this.f14891d + ", endTime=" + this.f14892e + ", arguments=" + FFmpegKitConfig.m4641c(this.f14893f) + ", logs=" + m15943v() + ", state=" + this.f14897j + ", returnCode=" + this.f14898k + ", failStackTrace='" + this.f14899l + "'}";
    }
}
