package p090g0;

import android.os.OutcomeReceiver;
import gd.C2237k;
import gd.C2238l;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import p146jd.InterfaceC3281d;
import td.C4753m;

/* renamed from: g0.g */
/* loaded from: classes.dex */
public final class C1947g<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {

    /* renamed from: h */
    public final InterfaceC3281d<R> f7757h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1947g(InterfaceC3281d<? super R> interfaceC3281d) {
        super(false);
        C4753m.m18653f(interfaceC3281d, "continuation");
        this.f7757h = interfaceC3281d;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E e10) {
        C4753m.m18653f(e10, ImagePickerCache.MAP_KEY_ERROR);
        if (compareAndSet(false, true)) {
            InterfaceC3281d<R> interfaceC3281d = this.f7757h;
            C2237k.a aVar = C2237k.f8865i;
            interfaceC3281d.resumeWith(C2237k.m8966b(C2238l.m8974a(e10)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r10) {
        C4753m.m18653f(r10, "result");
        if (compareAndSet(false, true)) {
            InterfaceC3281d<R> interfaceC3281d = this.f7757h;
            C2237k.a aVar = C2237k.f8865i;
            interfaceC3281d.resumeWith(C2237k.m8966b(r10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
