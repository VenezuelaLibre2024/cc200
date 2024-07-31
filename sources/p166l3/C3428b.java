package p166l3;

/* renamed from: l3.b */
/* loaded from: classes.dex */
public final class C3428b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m12773a(int i10, TInput tinput, InterfaceC3427a<TInput, TResult, TException> interfaceC3427a, InterfaceC3429c<TInput, TResult> interfaceC3429c) {
        TResult apply;
        if (i10 < 1) {
            return interfaceC3427a.apply(tinput);
        }
        do {
            apply = interfaceC3427a.apply(tinput);
            tinput = interfaceC3429c.mo6533a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return apply;
    }
}
