package p228pc;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: pc.d */
/* loaded from: classes2.dex */
public class C4112d extends AbstractC4109a {

    /* renamed from: a */
    public final a f14833a;

    /* renamed from: b */
    public final MethodCall f14834b;

    /* renamed from: pc.d$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC4114f {

        /* renamed from: a */
        public final MethodChannel.Result f14835a;

        public a(MethodChannel.Result result) {
            this.f14835a = result;
        }

        @Override // p228pc.InterfaceC4114f
        public void error(String str, String str2, Object obj) {
            this.f14835a.error(str, str2, obj);
        }

        @Override // p228pc.InterfaceC4114f
        public void success(Object obj) {
            this.f14835a.success(obj);
        }
    }

    public C4112d(MethodCall methodCall, MethodChannel.Result result) {
        this.f14834b = methodCall;
        this.f14833a = new a(result);
    }

    @Override // p228pc.InterfaceC4113e
    /* renamed from: a */
    public <T> T mo15879a(String str) {
        return (T) this.f14834b.argument(str);
    }

    @Override // p228pc.InterfaceC4113e
    /* renamed from: f */
    public String mo15880f() {
        return this.f14834b.method;
    }

    @Override // p228pc.InterfaceC4113e
    /* renamed from: g */
    public boolean mo15881g(String str) {
        return this.f14834b.hasArgument(str);
    }

    @Override // p228pc.AbstractC4109a
    /* renamed from: m */
    public InterfaceC4114f mo15869m() {
        return this.f14833a;
    }
}
