package p233q2;

import com.arthenica.ffmpegkit.FFmpegKitConfig;

/* renamed from: q2.s */
/* loaded from: classes.dex */
public class C4149s extends AbstractC4130b {

    /* renamed from: o */
    public C4147q f14939o;

    /* renamed from: p */
    public final InterfaceC4150t f14940p;

    public C4149s(String[] strArr, InterfaceC4150t interfaceC4150t, InterfaceC4145o interfaceC4145o) {
        super(strArr, interfaceC4145o, EnumC4146p.NEVER_PRINT_LOGS);
        this.f14940p = interfaceC4150t;
    }

    /* renamed from: z */
    public static C4149s m15976z(String[] strArr, InterfaceC4150t interfaceC4150t, InterfaceC4145o interfaceC4145o) {
        return new C4149s(strArr, interfaceC4150t, interfaceC4145o);
    }

    /* renamed from: A */
    public InterfaceC4150t m15977A() {
        return this.f14940p;
    }

    /* renamed from: B */
    public C4147q m15978B() {
        return this.f14939o;
    }

    /* renamed from: C */
    public void m15979C(C4147q c4147q) {
        this.f14939o = c4147q;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: d */
    public boolean mo15956d() {
        return false;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: r */
    public boolean mo15957r() {
        return false;
    }

    @Override // p233q2.InterfaceC4154x
    /* renamed from: s */
    public boolean mo15958s() {
        return true;
    }

    public String toString() {
        return "MediaInformationSession{sessionId=" + this.f14888a + ", createTime=" + this.f14890c + ", startTime=" + this.f14891d + ", endTime=" + this.f14892e + ", arguments=" + FFmpegKitConfig.m4641c(this.f14893f) + ", logs=" + m15943v() + ", state=" + this.f14897j + ", returnCode=" + this.f14898k + ", failStackTrace='" + this.f14899l + "'}";
    }
}
