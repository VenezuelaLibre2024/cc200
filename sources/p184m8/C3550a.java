package p184m8;

/* renamed from: m8.a */
/* loaded from: classes.dex */
public class C3550a implements InterfaceC3553d {

    /* renamed from: a */
    public final int f12446a;

    /* renamed from: b */
    public final InterfaceC3553d[] f12447b;

    /* renamed from: c */
    public final C3551b f12448c;

    public C3550a(int i10, InterfaceC3553d... interfaceC3553dArr) {
        this.f12446a = i10;
        this.f12447b = interfaceC3553dArr;
        this.f12448c = new C3551b(i10);
    }

    @Override // p184m8.InterfaceC3553d
    /* renamed from: a */
    public StackTraceElement[] mo13197a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f12446a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (InterfaceC3553d interfaceC3553d : this.f12447b) {
            if (stackTraceElementArr2.length <= this.f12446a) {
                break;
            }
            stackTraceElementArr2 = interfaceC3553d.mo13197a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f12446a ? this.f12448c.mo13197a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
