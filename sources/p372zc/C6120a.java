package p372zc;

import dev.fluttercommunity.plus.share.C1624a;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import td.C4753m;

/* renamed from: zc.a */
/* loaded from: classes2.dex */
public final class C6120a implements MethodChannel.MethodCallHandler {

    /* renamed from: h */
    public final C6121b f22668h;

    /* renamed from: i */
    public final C1624a f22669i;

    public C6120a(C6121b c6121b, C1624a c1624a) {
        C4753m.m18653f(c6121b, "share");
        C4753m.m18653f(c1624a, "manager");
        this.f22668h = c6121b;
        this.f22669i = c1624a;
    }

    /* renamed from: a */
    public final void m24416a(MethodCall methodCall) {
        if (!(methodCall.arguments instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected".toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r3.equals("share") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        m24416a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
    
        if (r1 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        if (r12.f22669i.m6484b(r14) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r2 = r12.f22668h;
        r3 = r13.argument("text");
        td.C4753m.m18651d(r3, "null cannot be cast to non-null type kotlin.String");
        r2.m24429m((java.lang.String) r3, (java.lang.String) r13.argument("subject"), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (r1 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        if (r0 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        r14.success("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r3.equals("shareFilesWithResult") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        m24416a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (r1 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        if (r12.f22669i.m6484b(r14) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        r5 = r12.f22668h;
        r2 = r13.argument("paths");
        td.C4753m.m18650c(r2);
        r5.m24430n((java.util.List) r2, (java.util.List) r13.argument("mimeTypes"), (java.lang.String) r13.argument("text"), (java.lang.String) r13.argument("subject"), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
    
        if (r1 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e8, code lost:
    
        if (r0 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ea, code lost:
    
        r14.success("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
    
        r14.success(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
    
        r14.error("Share failed", r13.getMessage(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0078, code lost:
    
        if (r3.equals("shareWithResult") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ac, code lost:
    
        if (r3.equals("shareFiles") == false) goto L53;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0035. Please report as an issue. */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00f3 -> B:41:0x0100). Please report as a decompilation issue!!! */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r13, io.flutter.plugin.common.MethodChannel.Result r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372zc.C6120a.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
