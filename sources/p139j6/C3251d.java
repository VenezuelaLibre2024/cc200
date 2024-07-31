package p139j6;

import android.content.Context;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.AbstractC1845e;
import p079f6.C1841a;
import p096g6.AbstractC2071v;
import p096g6.InterfaceC2056q;
import p108h6.C2406w;
import p108h6.C2415z;
import p108h6.InterfaceC2412y;

/* renamed from: j6.d */
/* loaded from: classes.dex */
public final class C3251d extends AbstractC1845e implements InterfaceC2412y {

    /* renamed from: a */
    public static final C1841a.g f11349a;

    /* renamed from: b */
    public static final C1841a.a f11350b;

    /* renamed from: c */
    public static final C1841a f11351c;

    /* renamed from: d */
    public static final /* synthetic */ int f11352d = 0;

    static {
        C1841a.g gVar = new C1841a.g();
        f11349a = gVar;
        C3250c c3250c = new C3250c();
        f11350b = c3250c;
        f11351c = new C1841a("ClientTelemetry.API", c3250c, gVar);
    }

    public C3251d(Context context, C2415z c2415z) {
        super(context, (C1841a<C2415z>) f11351c, c2415z, AbstractC1845e.a.f7033c);
    }

    @Override // p108h6.InterfaceC2412y
    /* renamed from: a */
    public final Task<Void> mo9649a(final C2406w c2406w) {
        AbstractC2071v.a m8266a = AbstractC2071v.m8266a();
        m8266a.m8274d(zaf.zaa);
        m8266a.m8273c(false);
        m8266a.m8272b(new InterfaceC2056q() { // from class: j6.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                C2406w c2406w2 = C2406w.this;
                int i10 = C3251d.f11352d;
                ((C3248a) ((C3252e) obj).getService()).m11751c(c2406w2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(m8266a.m8271a());
    }
}
