package p074f1;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC0351i0;
import androidx.lifecycle.InterfaceC0354k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p091g1.C1959b;

/* renamed from: f1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1800a {

    /* renamed from: f1.a$a */
    /* loaded from: classes.dex */
    public interface a<D> {
        /* renamed from: a */
        void mo2413a(C1959b<D> c1959b, D d10);

        /* renamed from: b */
        C1959b<D> mo2414b(int i10, Bundle bundle);

        /* renamed from: c */
        void mo2415c(C1959b<D> c1959b);
    }

    /* renamed from: b */
    public static <T extends InterfaceC0354k & InterfaceC0351i0> AbstractC1800a m7270b(T t10) {
        return new C1801b(t10, t10.getViewModelStore());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo7271a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract <D> C1959b<D> mo7272c(int i10, Bundle bundle, a<D> aVar);

    /* renamed from: d */
    public abstract void mo7273d();
}
