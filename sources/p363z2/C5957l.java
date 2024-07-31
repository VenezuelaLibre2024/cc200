package p363z2;

import android.content.Context;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p363z2.C5946a;
import p363z2.C5959n;
import p363z2.C5961p;

/* renamed from: z2.l */
/* loaded from: classes.dex */
public final class C5957l implements MethodChannel.MethodCallHandler {

    /* renamed from: h */
    public final Context f22116h;

    /* renamed from: i */
    public final C5946a f22117i;

    /* renamed from: j */
    public final C5959n f22118j;

    /* renamed from: k */
    public final C5961p f22119k;

    public C5957l(Context context, C5946a c5946a, C5959n c5959n, C5961p c5961p) {
        this.f22116h = context;
        this.f22117i = c5946a;
        this.f22118j = c5959n;
        this.f22119k = c5961p;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c10 = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c10 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                int parseInt = Integer.parseInt(methodCall.arguments.toString());
                C5961p c5961p = this.f22119k;
                Context context = this.f22116h;
                Objects.requireNonNull(result);
                c5961p.m23878a(parseInt, context, new C5961p.a() { // from class: z2.k
                    @Override // p363z2.C5961p.a
                    public final void onSuccess(int i10) {
                        MethodChannel.Result.this.success(Integer.valueOf(i10));
                    }
                }, new InterfaceC5947b() { // from class: z2.e
                    @Override // p363z2.InterfaceC5947b
                    /* renamed from: a */
                    public final void mo23838a(String str2, String str3) {
                        MethodChannel.Result.this.error(str2, str3, null);
                    }
                });
                return;
            case 1:
                int parseInt2 = Integer.parseInt(methodCall.arguments.toString());
                C5959n c5959n = this.f22118j;
                Objects.requireNonNull(result);
                c5959n.m23863i(parseInt2, new C5959n.c() { // from class: z2.j
                    @Override // p363z2.C5959n.c
                    /* renamed from: a */
                    public final void mo23840a(boolean z10) {
                        MethodChannel.Result.this.success(Boolean.valueOf(z10));
                    }
                }, new InterfaceC5947b() { // from class: z2.g
                    @Override // p363z2.InterfaceC5947b
                    /* renamed from: a */
                    public final void mo23838a(String str2, String str3) {
                        MethodChannel.Result.this.error(str2, str3, null);
                    }
                });
                return;
            case 2:
                int parseInt3 = Integer.parseInt(methodCall.arguments.toString());
                C5959n c5959n2 = this.f22118j;
                Objects.requireNonNull(result);
                c5959n2.m23857c(parseInt3, new C5959n.a() { // from class: z2.h
                    @Override // p363z2.C5959n.a
                    public final void onSuccess(int i10) {
                        MethodChannel.Result.this.success(Integer.valueOf(i10));
                    }
                });
                return;
            case 3:
                C5946a c5946a = this.f22117i;
                Context context2 = this.f22116h;
                Objects.requireNonNull(result);
                c5946a.m23836a(context2, new C5946a.a() { // from class: z2.c
                    @Override // p363z2.C5946a.a
                    /* renamed from: a */
                    public final void mo23837a(boolean z10) {
                        MethodChannel.Result.this.success(Boolean.valueOf(z10));
                    }
                }, new InterfaceC5947b() { // from class: z2.f
                    @Override // p363z2.InterfaceC5947b
                    /* renamed from: a */
                    public final void mo23838a(String str2, String str3) {
                        MethodChannel.Result.this.error(str2, str3, null);
                    }
                });
                return;
            case 4:
                List<Integer> list = (List) methodCall.arguments();
                C5959n c5959n3 = this.f22118j;
                Objects.requireNonNull(result);
                c5959n3.m23861g(list, new C5959n.b() { // from class: z2.i
                    @Override // p363z2.C5959n.b
                    /* renamed from: a */
                    public final void mo23839a(Map map) {
                        MethodChannel.Result.this.success(map);
                    }
                }, new InterfaceC5947b() { // from class: z2.d
                    @Override // p363z2.InterfaceC5947b
                    /* renamed from: a */
                    public final void mo23838a(String str2, String str3) {
                        MethodChannel.Result.this.error(str2, str3, null);
                    }
                });
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
